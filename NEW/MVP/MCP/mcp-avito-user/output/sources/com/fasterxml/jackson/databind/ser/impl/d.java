package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.A;
import java.io.Serializable;

/* compiled from: FilteredBeanPropertyWriter.java */
/* loaded from: classes4.dex */
public abstract class d {

    /* compiled from: FilteredBeanPropertyWriter.java */
    public static final class a extends com.fasterxml.jackson.databind.ser.d implements Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: u, reason: collision with root package name */
        public final com.fasterxml.jackson.databind.ser.d f342267u;

        /* renamed from: v, reason: collision with root package name */
        public final Class<?>[] f342268v;

        public a(com.fasterxml.jackson.databind.ser.d dVar, Class<?>[] clsArr) {
            super(dVar);
            this.f342267u = dVar;
            this.f342268v = clsArr;
        }

        @Override // com.fasterxml.jackson.databind.ser.d
        public final void g(com.fasterxml.jackson.databind.l<Object> lVar) {
            this.f342267u.g(lVar);
        }

        @Override // com.fasterxml.jackson.databind.ser.d
        public final void h(com.fasterxml.jackson.databind.l<Object> lVar) {
            this.f342267u.h(lVar);
        }

        @Override // com.fasterxml.jackson.databind.ser.d
        public final com.fasterxml.jackson.databind.ser.d i(com.fasterxml.jackson.databind.util.t tVar) {
            return new a(this.f342267u.i(tVar), this.f342268v);
        }

        @Override // com.fasterxml.jackson.databind.ser.d
        public final void k(Object obj, JsonGenerator jsonGenerator, A a12) {
            a12.getClass();
            this.f342267u.k(obj, jsonGenerator, a12);
        }

        @Override // com.fasterxml.jackson.databind.ser.d
        public final void l(Object obj, JsonGenerator jsonGenerator, A a12) {
            a12.getClass();
            this.f342267u.l(obj, jsonGenerator, a12);
        }
    }

    /* compiled from: FilteredBeanPropertyWriter.java */
    public static final class b extends com.fasterxml.jackson.databind.ser.d implements Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: u, reason: collision with root package name */
        public final com.fasterxml.jackson.databind.ser.d f342269u;

        /* renamed from: v, reason: collision with root package name */
        public final Class<?> f342270v;

        public b(com.fasterxml.jackson.databind.ser.d dVar, Class<?> cls) {
            super(dVar);
            this.f342269u = dVar;
            this.f342270v = cls;
        }

        @Override // com.fasterxml.jackson.databind.ser.d
        public final void g(com.fasterxml.jackson.databind.l<Object> lVar) {
            this.f342269u.g(lVar);
        }

        @Override // com.fasterxml.jackson.databind.ser.d
        public final void h(com.fasterxml.jackson.databind.l<Object> lVar) {
            this.f342269u.h(lVar);
        }

        @Override // com.fasterxml.jackson.databind.ser.d
        public final com.fasterxml.jackson.databind.ser.d i(com.fasterxml.jackson.databind.util.t tVar) {
            return new b(this.f342269u.i(tVar), this.f342270v);
        }

        @Override // com.fasterxml.jackson.databind.ser.d
        public final void k(Object obj, JsonGenerator jsonGenerator, A a12) {
            a12.getClass();
            this.f342269u.k(obj, jsonGenerator, a12);
        }

        @Override // com.fasterxml.jackson.databind.ser.d
        public final void l(Object obj, JsonGenerator jsonGenerator, A a12) {
            a12.getClass();
            this.f342269u.l(obj, jsonGenerator, a12);
        }
    }

    public static com.fasterxml.jackson.databind.ser.d a(com.fasterxml.jackson.databind.ser.d dVar, Class<?>[] clsArr) {
        return clsArr.length == 1 ? new b(dVar, clsArr[0]) : new a(dVar, clsArr);
    }
}
