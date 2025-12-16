package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import rX0.InterfaceC47610a;

/* compiled from: BooleanSerializer.java */
@InterfaceC47610a
/* renamed from: com.fasterxml.jackson.databind.ser.std.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36479e extends L<Object> implements com.fasterxml.jackson.databind.ser.j {
    private static final long serialVersionUID = 1;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f342376d;

    /* compiled from: BooleanSerializer.java */
    /* renamed from: com.fasterxml.jackson.databind.ser.std.e$a */
    public static final class a extends L<Object> implements com.fasterxml.jackson.databind.ser.j {
        private static final long serialVersionUID = 1;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f342377d;

        public a(boolean z12) {
            super(z12 ? Boolean.TYPE : Boolean.class);
            this.f342377d = z12;
        }

        @Override // com.fasterxml.jackson.databind.ser.j
        public final com.fasterxml.jackson.databind.l<?> a(com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.c cVar) {
            JsonFormat.b bVarL = M.l(a12, cVar, Boolean.class);
            return (bVarL == null || bVarL.f340948c.a()) ? this : new C36479e(this.f342377d);
        }

        @Override // com.fasterxml.jackson.databind.l
        public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
            jsonGenerator.L(!Boolean.FALSE.equals(obj) ? 1 : 0);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.L, com.fasterxml.jackson.databind.l
        public final void g(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.jsontype.o oVar) {
            jsonGenerator.y(Boolean.TRUE.equals(obj));
        }
    }

    public C36479e(boolean z12) {
        super(z12 ? Boolean.TYPE : Boolean.class);
        this.f342376d = z12;
    }

    @Override // com.fasterxml.jackson.databind.ser.j
    public final com.fasterxml.jackson.databind.l<?> a(com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.c cVar) {
        Class<T> cls = this.f342353b;
        JsonFormat.b bVarL = M.l(a12, cVar, cls);
        if (bVarL != null) {
            JsonFormat.Shape shape = bVarL.f340948c;
            if (shape.a()) {
                return new a(this.f342376d);
            }
            if (shape == JsonFormat.Shape.f340940j) {
                return new Q(cls, 0);
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
        jsonGenerator.y(Boolean.TRUE.equals(obj));
    }

    @Override // com.fasterxml.jackson.databind.ser.std.L, com.fasterxml.jackson.databind.l
    public final void g(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.jsontype.o oVar) {
        jsonGenerator.y(Boolean.TRUE.equals(obj));
    }
}
