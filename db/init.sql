--
-- PostgreSQL database dump
--

-- Dumped from database version 17.1
-- Dumped by pg_dump version 17.1

-- Started on 2026-01-05 20:16:03

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET transaction_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 218 (class 1259 OID 49641)
-- Name: employee; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.employee (
    name character varying(40),
    fname character varying(40),
    dob character varying(40),
    salary character varying(40),
    address character varying(40),
    phone character varying(40),
    email character varying(40),
    education character varying(40),
    designation character varying(40),
    aadhar character varying(40),
    empid character varying(40)
);


ALTER TABLE public.employee OWNER TO postgres;

--
-- TOC entry 217 (class 1259 OID 49638)
-- Name: login; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.login (
    username character varying(20),
    password character varying(20)
);


ALTER TABLE public.login OWNER TO postgres;

--
-- TOC entry 4844 (class 0 OID 49641)
-- Dependencies: 218
-- Data for Name: employee; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.employee (name, fname, dob, salary, address, phone, email, education, designation, aadhar, empid) FROM stdin;
ajay	Vijay	3 Dec 2005	40000	India	1234567890	a@mail.com	BBA	mr.	475244	1234567890
\.


--
-- TOC entry 4843 (class 0 OID 49638)
-- Dependencies: 217
-- Data for Name: login; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.login (username, password) FROM stdin;
Siddharth	123468
\.


-- Completed on 2026-01-05 20:16:03

--
-- PostgreSQL database dump complete
--

