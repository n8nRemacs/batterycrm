package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* compiled from: PropertyValue.java */
/* loaded from: classes4.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public final x f341681a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f341682b;

    /* compiled from: PropertyValue.java */
    public static final class a extends x {

        /* renamed from: c, reason: collision with root package name */
        public final com.fasterxml.jackson.databind.deser.u f341683c;

        /* renamed from: d, reason: collision with root package name */
        public final String f341684d;

        public a(x xVar, Object obj, com.fasterxml.jackson.databind.deser.u uVar, String str) {
            super(xVar, obj);
            this.f341683c = uVar;
            this.f341684d = str;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.x
        public final void a(Object obj) throws IllegalAccessException, JsonMappingException, IllegalArgumentException, InvocationTargetException {
            this.f341683c.c(obj, this.f341684d, this.f341682b);
        }
    }

    /* compiled from: PropertyValue.java */
    public static final class b extends x {

        /* renamed from: c, reason: collision with root package name */
        public final Object f341685c;

        public b(x xVar, Object obj, Object obj2) {
            super(xVar, obj);
            this.f341685c = obj2;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.x
        public final void a(Object obj) {
            ((Map) obj).put(this.f341685c, this.f341682b);
        }
    }

    /* compiled from: PropertyValue.java */
    public static final class c extends x {

        /* renamed from: c, reason: collision with root package name */
        public final com.fasterxml.jackson.databind.deser.v f341686c;

        public c(x xVar, Object obj, com.fasterxml.jackson.databind.deser.v vVar) {
            super(xVar, obj);
            this.f341686c = vVar;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.x
        public final void a(Object obj) {
            this.f341686c.z(obj, this.f341682b);
        }
    }

    public x(x xVar, Object obj) {
        this.f341681a = xVar;
        this.f341682b = obj;
    }

    public abstract void a(Object obj);
}
