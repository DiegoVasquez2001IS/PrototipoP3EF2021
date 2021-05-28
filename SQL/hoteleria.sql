-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 28-05-2021 a las 19:41:13
-- Versión del servidor: 8.0.17
-- Versión de PHP: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hoteleria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_ama_de_llaves`
--

CREATE TABLE `tbl_ama_de_llaves` (
  `PK_id_ama_de_llaves` int(11) NOT NULL,
  `nombre_ama_de_llaves` varchar(45) DEFAULT NULL,
  `apellido_ama_de_llaves` varchar(45) DEFAULT NULL,
  `piso_ama_de_llaves` int(11) DEFAULT NULL,
  `entrada_ama_de_llaves` varchar(10) DEFAULT NULL,
  `salida_ama_de_llaves` varchar(10) DEFAULT NULL,
  `inicio_labores_ama_de_llaves` varchar(20) DEFAULT NULL,
  `descripcion_ama_de_llaves` varchar(200) DEFAULT NULL,
  `estado_ama_de_llaves` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tbl_ama_de_llaves`
--

INSERT INTO `tbl_ama_de_llaves` (`PK_id_ama_de_llaves`, `nombre_ama_de_llaves`, `apellido_ama_de_llaves`, `piso_ama_de_llaves`, `entrada_ama_de_llaves`, `salida_ama_de_llaves`, `inicio_labores_ama_de_llaves`, `descripcion_ama_de_llaves`, `estado_ama_de_llaves`) VALUES
(1, 'Carmen', 'Dominguez', 1, '8am', '8pm', '15/04/2021', 'Encargada del área', 1),
(2, 'Karol', 'Gomez', 1, '8pm', '8am', '18/04/2021', 'Supervisora', 1),
(3, 'Andrea', 'Melano', 1, '8am', '8pm', '21/04/2021', 'Auxiliar de la supervisora', 1),
(4, 'Dora', 'Chavez', 1, '8pm', '8am', '22/04/2021', 'Auxiliar de la encargada', 1),
(5, 'Angela', 'De Lee', 1, '8am', '8pm', '26/04/2021', 'Encargada de lavanderia', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_entrega_habitacion`
--

CREATE TABLE `tbl_entrega_habitacion` (
  `PK_id_entrega` int(11) NOT NULL,
  `PK_id_reservacion` int(11) DEFAULT NULL,
  `PK_id_habitacion` int(11) DEFAULT NULL,
  `PK_no_identificacion` int(11) DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `estado` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_facturacion`
--

CREATE TABLE `tbl_facturacion` (
  `PK_id_factura` int(11) NOT NULL,
  `PK_id_reservacion` int(11) NOT NULL,
  `nombre_factura` varchar(50) DEFAULT NULL,
  `fechaEntrada_factura` varchar(20) DEFAULT NULL,
  `fechaSalida_factura` varchar(20) DEFAULT NULL,
  `formaPago_factura` varchar(50) DEFAULT NULL,
  `totalReservacion_factura` int(100) DEFAULT NULL,
  `totalServicios_factura` int(100) DEFAULT NULL,
  `totalFacturacion_factura` int(100) DEFAULT NULL,
  `estado` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_huespedes`
--

CREATE TABLE `tbl_huespedes` (
  `PK_no_identificacion` int(11) NOT NULL,
  `nombre_huesped` varchar(50) DEFAULT NULL,
  `apellido_huesped` varchar(100) DEFAULT NULL,
  `nacionalidad_huesped` varchar(100) DEFAULT NULL,
  `direccion_huesped` varchar(100) DEFAULT NULL,
  `frecuencia_huesped` varchar(100) DEFAULT NULL,
  `telefono_huesped` varchar(100) DEFAULT NULL,
  `nit_huesped` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tbl_huespedes`
--

INSERT INTO `tbl_huespedes` (`PK_no_identificacion`, `nombre_huesped`, `apellido_huesped`, `nacionalidad_huesped`, `direccion_huesped`, `frecuencia_huesped`, `telefono_huesped`, `nit_huesped`) VALUES
(1, 'Alberto', 'Suarez', 'Mexicano', '12 calle', 'Constante', '12345678', '87654321'),
(12, 'Luis Carlos', 'Chavez', 'Chino', '13 calle', 'Constante', '87654321', '12345678'),
(123, 'Leonel', 'Gomez', 'Keniano', '14 calle', 'Constante', '123456789', '876543216'),
(1234, 'Jefferson', 'Dominguez', 'Mexicano', '15 calle', 'Constante', '612345678', '187654321'),
(12345, 'Gerson', 'Davila', 'Español', '16 calle', 'Constante', '1234585678', '8765443521');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_mantenimiento_habitaciones`
--

CREATE TABLE `tbl_mantenimiento_habitaciones` (
  `PK_id_habitacion` int(11) NOT NULL,
  `descripcion_habitacion` varchar(45) DEFAULT NULL,
  `precio_habitacion` int(45) DEFAULT NULL,
  `piso_habitaciones` int(11) DEFAULT NULL,
  `estado_habitacion` int(11) DEFAULT NULL,
  `tipo_de_habitacion` varchar(20) DEFAULT NULL,
  `cantidad_maxima_pers` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tbl_mantenimiento_habitaciones`
--

INSERT INTO `tbl_mantenimiento_habitaciones` (`PK_id_habitacion`, `descripcion_habitacion`, `precio_habitacion`, `piso_habitaciones`, `estado_habitacion`, `tipo_de_habitacion`, `cantidad_maxima_pers`) VALUES
(1, 'Habitación pequeña', 250, 1, 1, 'Matrimonial', 4),
(2, 'Habitación pequeña', 250, 1, 1, 'Individual', 1),
(3, 'Habitación pequeña', 250, 1, 1, 'Matrimonial', 4),
(4, 'Habitación pequeña', 250, 1, 1, 'Individual', 1),
(5, 'Habitación pequeña', 250, 1, 1, 'Matrimonial', 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_metodos_de_pago`
--

CREATE TABLE `tbl_metodos_de_pago` (
  `PK_id_metodo` int(11) NOT NULL,
  `nombre_metodo` varchar(50) DEFAULT NULL,
  `descripcion_metodo` varchar(100) DEFAULT NULL,
  `estado_metodo` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tbl_metodos_de_pago`
--

INSERT INTO `tbl_metodos_de_pago` (`PK_id_metodo`, `nombre_metodo`, `descripcion_metodo`, `estado_metodo`) VALUES
(1, 'Tarjeta', 'Pago con tarjeta', 1),
(2, 'Efectivo', 'Pago en efectivo', 1),
(3, 'Criptomoneda Ethereum', 'Fase beta del método de prueba con CriptoMoneda Ethereum', 0),
(4, 'PAYPAL', 'Forma de pago PayPal a nuestra cuenta en brasil', 0),
(5, 'MovilPay', 'Pago en fase alpha para pagar mediante el celular.', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_objetosperdidos`
--

CREATE TABLE `tbl_objetosperdidos` (
  `PK_id_objeto` int(11) NOT NULL,
  `PK_id_habitacion` int(11) DEFAULT NULL,
  `PK_id_ama_de_llaves` int(11) DEFAULT NULL,
  `fecha_encontrado` date DEFAULT NULL,
  `objeto` varchar(50) DEFAULT NULL,
  `identificacion` varchar(50) DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `estado` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tbl_objetosperdidos`
--

INSERT INTO `tbl_objetosperdidos` (`PK_id_objeto`, `PK_id_habitacion`, `PK_id_ama_de_llaves`, `fecha_encontrado`, `objeto`, `identificacion`, `nombre`, `estado`) VALUES
(1, 1, 1, '2021-04-17', 'Telefono', '12345678', 'Luis', 2),
(2, 1, 1, '2021-04-18', 'Juguete', 'null', 'null', 1),
(3, 1, 1, '2021-04-19', 'Computadora', 'null', 'null', 1),
(4, 1, 1, '2021-04-20', 'Telefono', 'null', 'null', 1),
(5, 1, 1, '2021-04-21', 'Audifonos', '124345678', 'Juan', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_piso_hotel`
--

CREATE TABLE `tbl_piso_hotel` (
  `PK_numero_piso` int(11) NOT NULL,
  `cantidad_habitaciones` int(11) DEFAULT NULL,
  `descripcion_piso` varchar(200) DEFAULT NULL,
  `estado_piso` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tbl_piso_hotel`
--

INSERT INTO `tbl_piso_hotel` (`PK_numero_piso`, `cantidad_habitaciones`, `descripcion_piso`, `estado_piso`) VALUES
(1, 10, 'Habitaciones Pequeñas', 1),
(2, 20, 'Habitaciones Grande', 1),
(3, 30, 'Habitaciones Mediana', 1),
(4, 40, 'Habitaciones VIP', 1),
(5, 10, 'Habitaciones Presidencial', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_reservaciones`
--

CREATE TABLE `tbl_reservaciones` (
  `PK_id_reservacion` int(11) NOT NULL,
  `PK_no_identificacion` int(11) DEFAULT NULL,
  `PK_id_habitacion` int(11) DEFAULT NULL,
  `cantidad_personas` varchar(30) DEFAULT NULL,
  `fecha_reserva` date DEFAULT NULL,
  `desde` date DEFAULT NULL,
  `hasta` date DEFAULT NULL,
  `precio` int(11) NOT NULL,
  `estado` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tbl_reservaciones`
--

INSERT INTO `tbl_reservaciones` (`PK_id_reservacion`, `PK_no_identificacion`, `PK_id_habitacion`, `cantidad_personas`, `fecha_reserva`, `desde`, `hasta`, `precio`, `estado`) VALUES
(1, 1, 1, '2', '2021-05-15', '2021-05-16', '2021-05-20', 1000, 0),
(2, 12, 2, '1', '2021-05-15', '2021-05-16', '2021-05-20', 750, 0),
(3, 123, 3, '2', '2021-05-15', '2021-05-16', '2021-05-22', 1500, 0),
(4, 12, 4, '1', '2021-05-17', '2021-12-01', '2021-12-31', 7500, 0),
(5, 12345, 5, '2', '2021-05-17', '2021-05-01', '2021-05-31', 7500, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_servicios`
--

CREATE TABLE `tbl_servicios` (
  `PK_id_servicio` int(11) NOT NULL,
  `nombre_servicio` varchar(50) DEFAULT NULL,
  `descripcion_servicio` varchar(100) DEFAULT NULL,
  `precio_servicio` int(11) DEFAULT NULL,
  `tipo_servicio` tinyint(4) DEFAULT NULL,
  `estado_servicio` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tbl_servicios`
--

INSERT INTO `tbl_servicios` (`PK_id_servicio`, `nombre_servicio`, `descripcion_servicio`, `precio_servicio`, `tipo_servicio`, `estado_servicio`) VALUES
(1, 'Internet', '50mg', 150, 1, 1),
(2, 'Niñera', 'Cuido de niños', 250, 1, 1),
(3, 'Paseo en bote', 'Espectuaculo en bote', 375, 1, 1),
(4, 'SPA', 'SPA para un máximo de 10 personas', 500, 1, 2),
(5, 'Sector para Fumadores', 'Amplio sector para personas puedan fumar tranquilamente sin molestar a otras personas', 150, 2, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id_usuario`, `username`, `password`) VALUES
(1, 'diego', 'diego123'),
(2, 'diego', 'diego123');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tbl_ama_de_llaves`
--
ALTER TABLE `tbl_ama_de_llaves`
  ADD PRIMARY KEY (`PK_id_ama_de_llaves`),
  ADD KEY `piso_ama_de_llaves` (`piso_ama_de_llaves`);

--
-- Indices de la tabla `tbl_entrega_habitacion`
--
ALTER TABLE `tbl_entrega_habitacion`
  ADD PRIMARY KEY (`PK_id_entrega`),
  ADD KEY `PK_id_habitacion` (`PK_id_habitacion`),
  ADD KEY `PK_id_reservacion` (`PK_id_reservacion`),
  ADD KEY `PK_no_identificacion` (`PK_no_identificacion`);

--
-- Indices de la tabla `tbl_facturacion`
--
ALTER TABLE `tbl_facturacion`
  ADD PRIMARY KEY (`PK_id_factura`),
  ADD KEY `PK_id_reservacion` (`PK_id_reservacion`);

--
-- Indices de la tabla `tbl_huespedes`
--
ALTER TABLE `tbl_huespedes`
  ADD PRIMARY KEY (`PK_no_identificacion`);

--
-- Indices de la tabla `tbl_mantenimiento_habitaciones`
--
ALTER TABLE `tbl_mantenimiento_habitaciones`
  ADD PRIMARY KEY (`PK_id_habitacion`),
  ADD KEY `piso_habitaciones` (`piso_habitaciones`);

--
-- Indices de la tabla `tbl_metodos_de_pago`
--
ALTER TABLE `tbl_metodos_de_pago`
  ADD PRIMARY KEY (`PK_id_metodo`);

--
-- Indices de la tabla `tbl_objetosperdidos`
--
ALTER TABLE `tbl_objetosperdidos`
  ADD PRIMARY KEY (`PK_id_objeto`),
  ADD KEY `PK_id_habitacion` (`PK_id_habitacion`),
  ADD KEY `PK_id_ama_de_llaves` (`PK_id_ama_de_llaves`);

--
-- Indices de la tabla `tbl_piso_hotel`
--
ALTER TABLE `tbl_piso_hotel`
  ADD PRIMARY KEY (`PK_numero_piso`);

--
-- Indices de la tabla `tbl_reservaciones`
--
ALTER TABLE `tbl_reservaciones`
  ADD PRIMARY KEY (`PK_id_reservacion`),
  ADD KEY `PK_id_habitacion` (`PK_id_habitacion`),
  ADD KEY `PK_no_identificacion` (`PK_no_identificacion`);

--
-- Indices de la tabla `tbl_servicios`
--
ALTER TABLE `tbl_servicios`
  ADD PRIMARY KEY (`PK_id_servicio`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tbl_objetosperdidos`
--
ALTER TABLE `tbl_objetosperdidos`
  MODIFY `PK_id_objeto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `tbl_ama_de_llaves`
--
ALTER TABLE `tbl_ama_de_llaves`
  ADD CONSTRAINT `tbl_ama_de_llaves_ibfk_1` FOREIGN KEY (`piso_ama_de_llaves`) REFERENCES `tbl_piso_hotel` (`PK_numero_piso`);

--
-- Filtros para la tabla `tbl_entrega_habitacion`
--
ALTER TABLE `tbl_entrega_habitacion`
  ADD CONSTRAINT `tbl_entrega_habitacion_ibfk_1` FOREIGN KEY (`PK_id_habitacion`) REFERENCES `tbl_mantenimiento_habitaciones` (`PK_id_habitacion`),
  ADD CONSTRAINT `tbl_entrega_habitacion_ibfk_2` FOREIGN KEY (`PK_id_reservacion`) REFERENCES `tbl_reservaciones` (`PK_id_reservacion`),
  ADD CONSTRAINT `tbl_entrega_habitacion_ibfk_3` FOREIGN KEY (`PK_no_identificacion`) REFERENCES `tbl_huespedes` (`PK_no_identificacion`);

--
-- Filtros para la tabla `tbl_facturacion`
--
ALTER TABLE `tbl_facturacion`
  ADD CONSTRAINT `tbl_facturacion_ibfk_1` FOREIGN KEY (`PK_id_reservacion`) REFERENCES `tbl_reservaciones` (`PK_id_reservacion`);

--
-- Filtros para la tabla `tbl_mantenimiento_habitaciones`
--
ALTER TABLE `tbl_mantenimiento_habitaciones`
  ADD CONSTRAINT `tbl_mantenimiento_habitaciones_ibfk_1` FOREIGN KEY (`piso_habitaciones`) REFERENCES `tbl_piso_hotel` (`PK_numero_piso`);

--
-- Filtros para la tabla `tbl_objetosperdidos`
--
ALTER TABLE `tbl_objetosperdidos`
  ADD CONSTRAINT `tbl_objetosperdidos_ibfk_1` FOREIGN KEY (`PK_id_habitacion`) REFERENCES `tbl_mantenimiento_habitaciones` (`PK_id_habitacion`),
  ADD CONSTRAINT `tbl_objetosperdidos_ibfk_2` FOREIGN KEY (`PK_id_ama_de_llaves`) REFERENCES `tbl_ama_de_llaves` (`PK_id_ama_de_llaves`);

--
-- Filtros para la tabla `tbl_reservaciones`
--
ALTER TABLE `tbl_reservaciones`
  ADD CONSTRAINT `tbl_reservaciones_ibfk_1` FOREIGN KEY (`PK_id_habitacion`) REFERENCES `tbl_mantenimiento_habitaciones` (`PK_id_habitacion`),
  ADD CONSTRAINT `tbl_reservaciones_ibfk_2` FOREIGN KEY (`PK_no_identificacion`) REFERENCES `tbl_huespedes` (`PK_no_identificacion`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
