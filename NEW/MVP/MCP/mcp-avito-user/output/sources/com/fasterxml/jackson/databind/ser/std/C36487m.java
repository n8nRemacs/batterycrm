package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.util.Objects;
import rX0.InterfaceC47610a;

/* compiled from: EnumSerializer.java */
@InterfaceC47610a
/* renamed from: com.fasterxml.jackson.databind.ser.std.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36487m extends L<Enum<?>> implements com.fasterxml.jackson.databind.ser.j {
    private static final long serialVersionUID = 1;

    /* renamed from: d, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.util.k f342383d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f342384e;

    public C36487m(com.fasterxml.jackson.databind.util.k kVar, Boolean bool) {
        super(kVar.f342618b);
        this.f342383d = kVar;
        this.f342384e = bool;
    }

    public static Boolean p(Class<?> cls, JsonFormat.b bVar, boolean z12, Boolean bool) {
        JsonFormat.Shape shape = bVar.f340948c;
        if (shape == null || shape == JsonFormat.Shape.f340932b || shape == JsonFormat.Shape.f340934d) {
            return bool;
        }
        if (shape == JsonFormat.Shape.f340940j || shape == JsonFormat.Shape.f340933c) {
            return Boolean.FALSE;
        }
        if (shape.a() || shape == JsonFormat.Shape.f340935e) {
            return Boolean.TRUE;
        }
        String name = cls.getName();
        String str = z12 ? "class" : "property";
        StringBuilder sb2 = new StringBuilder("Unsupported serialization shape (");
        sb2.append(shape);
        sb2.append(") for Enum ");
        sb2.append(name);
        sb2.append(", not supported as ");
        throw new IllegalArgumentException(AK.c.s(sb2, str, " annotation"));
    }

    @Override // com.fasterxml.jackson.databind.ser.j
    public final com.fasterxml.jackson.databind.l<?> a(com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.c cVar) {
        Class<T> cls = this.f342353b;
        JsonFormat.b bVarL = M.l(a12, cVar, cls);
        if (bVarL != null) {
            Boolean bool = this.f342384e;
            Boolean boolP = p(cls, bVarL, false, bool);
            if (!Objects.equals(boolP, bool)) {
                return new C36487m(this.f342383d, boolP);
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
        boolean zP2;
        Enum r32 = (Enum) obj;
        Boolean bool = this.f342384e;
        if (bool != null) {
            zP2 = bool.booleanValue();
        } else {
            zP2 = a12.f341330b.p(SerializationFeature.WRITE_ENUMS_USING_INDEX);
        }
        if (zP2) {
            jsonGenerator.L(r32.ordinal());
            return;
        }
        if (a12.f341330b.p(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
            jsonGenerator.i0(r32.toString());
        } else {
            jsonGenerator.h0(this.f342383d.f342619c[r32.ordinal()]);
        }
    }
}
