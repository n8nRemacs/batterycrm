package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import java.util.Collection;

/* compiled from: StaticListSerializerBase.java */
/* loaded from: classes4.dex */
public abstract class F<T extends Collection<?>> extends M<T> implements com.fasterxml.jackson.databind.ser.j {

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f342343d;

    public F(Class<?> cls) {
        super(cls, 0);
        this.f342343d = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // com.fasterxml.jackson.databind.ser.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.l<?> a(com.fasterxml.jackson.databind.A r6, com.fasterxml.jackson.databind.c r7) {
        /*
            r5 = this;
            r0 = 0
            if (r7 == 0) goto L1a
            com.fasterxml.jackson.databind.z r1 = r6.f341330b
            com.fasterxml.jackson.databind.AnnotationIntrospector r1 = r1.d()
            com.fasterxml.jackson.databind.introspect.j r2 = r7.b()
            if (r2 == 0) goto L1a
            java.lang.Object r1 = r1.d(r2)
            if (r1 == 0) goto L1a
            com.fasterxml.jackson.databind.l r1 = r6.H(r2, r1)
            goto L1b
        L1a:
            r1 = r0
        L1b:
            java.lang.Class<T> r2 = r5.f342353b
            com.fasterxml.jackson.annotation.JsonFormat$b r2 = com.fasterxml.jackson.databind.ser.std.M.l(r6, r7, r2)
            if (r2 == 0) goto L2a
            com.fasterxml.jackson.annotation.JsonFormat$Feature r3 = com.fasterxml.jackson.annotation.JsonFormat.Feature.f340929d
            java.lang.Boolean r2 = r2.b(r3)
            goto L2b
        L2a:
            r2 = r0
        L2b:
            com.fasterxml.jackson.databind.l r1 = com.fasterxml.jackson.databind.ser.std.M.k(r6, r7, r1)
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r1 != 0) goto L37
            com.fasterxml.jackson.databind.l r1 = r6.q(r3, r7)
        L37:
            boolean r4 = com.fasterxml.jackson.databind.util.g.x(r1)
            if (r4 == 0) goto L4b
            java.lang.Boolean r6 = r5.f342343d
            boolean r6 = java.util.Objects.equals(r2, r6)
            if (r6 == 0) goto L46
            return r5
        L46:
            com.fasterxml.jackson.databind.l r6 = r5.p(r7, r2)
            return r6
        L4b:
            com.fasterxml.jackson.databind.ser.std.j r7 = new com.fasterxml.jackson.databind.ser.std.j
            com.fasterxml.jackson.databind.type.n r6 = r6.e()
            com.fasterxml.jackson.databind.h r6 = r6.l(r3)
            r2 = 1
            r7.<init>(r6, r2, r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.F.a(com.fasterxml.jackson.databind.A, com.fasterxml.jackson.databind.c):com.fasterxml.jackson.databind.l");
    }

    @Override // com.fasterxml.jackson.databind.l
    public final boolean d(com.fasterxml.jackson.databind.A a12, Object obj) {
        Collection collection = (Collection) obj;
        return collection == null || collection.size() == 0;
    }

    public abstract com.fasterxml.jackson.databind.l<?> p(com.fasterxml.jackson.databind.c cVar, Boolean bool);

    @Override // com.fasterxml.jackson.databind.l
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public abstract void g(T t12, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.jsontype.o oVar);

    public F(F<?> f12, Boolean bool) {
        super(f12);
        this.f342343d = bool;
    }
}
