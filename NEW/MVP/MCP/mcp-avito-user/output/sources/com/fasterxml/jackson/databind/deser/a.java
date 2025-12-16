package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.G;
import com.fasterxml.jackson.annotation.H;
import com.fasterxml.jackson.annotation.I;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.deser.x;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.introspect.AbstractC36471j;
import com.fasterxml.jackson.databind.introspect.D;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* compiled from: AbstractDeserializer.java */
/* loaded from: classes4.dex */
public class a extends com.fasterxml.jackson.databind.i<Object> implements i, Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f341521b;

    /* renamed from: c, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.deser.impl.s f341522c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f341523d;

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f341524e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f341525f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f341526g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f341527h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f341528i;

    public a(e eVar, com.fasterxml.jackson.databind.b bVar, HashMap map, LinkedHashMap linkedHashMap) {
        com.fasterxml.jackson.databind.h hVar = bVar.f341454a;
        this.f341521b = hVar;
        this.f341522c = eVar.f341580j;
        this.f341523d = map;
        this.f341524e = linkedHashMap;
        Class<?> cls = hVar.f341930b;
        this.f341525f = cls.isAssignableFrom(String.class);
        boolean z12 = true;
        this.f341526g = cls == Boolean.TYPE || cls.isAssignableFrom(Boolean.class);
        this.f341527h = cls == Integer.TYPE || cls.isAssignableFrom(Integer.class);
        if (cls != Double.TYPE && !cls.isAssignableFrom(Double.class)) {
            z12 = false;
        }
        this.f341528i = z12;
    }

    @Override // com.fasterxml.jackson.databind.deser.i
    public final com.fasterxml.jackson.databind.i<?> a(com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.c cVar) throws InvalidDefinitionException {
        AbstractC36471j abstractC36471jB;
        D dZ2;
        G gF2;
        com.fasterxml.jackson.databind.h hVar;
        I i12;
        v vVar;
        AnnotationIntrospector annotationIntrospectorD = fVar.f341921d.d();
        LinkedHashMap linkedHashMap = this.f341524e;
        if (cVar == null || annotationIntrospectorD == null || (abstractC36471jB = cVar.b()) == null || (dZ2 = annotationIntrospectorD.z(abstractC36471jB)) == null) {
            return linkedHashMap == null ? this : new a(this, this.f341522c);
        }
        I iG2 = fVar.g(dZ2);
        D dA2 = annotationIntrospectorD.A(abstractC36471jB, dZ2);
        Class<? extends G<?>> cls = dA2.f341941b;
        if (cls == H.d.class) {
            com.fasterxml.jackson.databind.v vVar2 = dA2.f341940a;
            v vVar3 = linkedHashMap == null ? null : (v) linkedHashMap.get(vVar2.f342656b);
            if (vVar3 == null) {
                fVar.i("Invalid Object Id definition for " + com.fasterxml.jackson.databind.util.g.A(this.f341521b.f341930b) + ": cannot find property with name " + (vVar2 == null ? "[null]" : com.fasterxml.jackson.databind.util.g.c(vVar2.f342656b)));
                throw null;
            }
            gF2 = new com.fasterxml.jackson.databind.deser.impl.w(dA2.f341943d);
            vVar = vVar3;
            hVar = vVar3.f341897e;
            i12 = iG2;
        } else {
            I iG3 = fVar.g(dA2);
            com.fasterxml.jackson.databind.h hVarL = fVar.l(cls);
            fVar.e().getClass();
            com.fasterxml.jackson.databind.h hVar2 = com.fasterxml.jackson.databind.type.n.n(hVarL, G.class)[0];
            gF2 = fVar.f(dA2);
            hVar = hVar2;
            i12 = iG3;
            vVar = null;
        }
        return new a(this, new com.fasterxml.jackson.databind.deser.impl.s(hVar, dA2.f341940a, gF2, fVar.u(hVar), vVar, i12));
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        com.fasterxml.jackson.databind.h hVar = this.f341521b;
        fVar.y(hVar.f341930b, new x.a(hVar), "abstract types either need to be mapped to concrete types, have custom deserializer, or contain additional type information", new Object[0]);
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    @Override // com.fasterxml.jackson.databind.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.fasterxml.jackson.core.JsonParser r4, com.fasterxml.jackson.databind.f r5, com.fasterxml.jackson.databind.jsontype.l r6) throws com.fasterxml.jackson.databind.deser.UnresolvedForwardReference {
        /*
            r3 = this;
            com.fasterxml.jackson.databind.deser.impl.s r0 = r3.f341522c
            if (r0 == 0) goto L57
            com.fasterxml.jackson.core.JsonToken r1 = r4.f()
            if (r1 == 0) goto L57
            boolean r2 = r1.f341103i
            if (r2 == 0) goto L46
            com.fasterxml.jackson.databind.i<java.lang.Object> r6 = r0.f341670f
            java.lang.Object r6 = r6.e(r4, r5)
            com.fasterxml.jackson.annotation.G<?> r1 = r0.f341668d
            com.fasterxml.jackson.annotation.I r0 = r0.f341669e
            com.fasterxml.jackson.databind.deser.impl.z r5 = r5.t(r6, r1, r0)
            com.fasterxml.jackson.annotation.I r0 = r5.f341699d
            com.fasterxml.jackson.annotation.G$a r1 = r5.f341697b
            java.lang.Object r0 = r0.c(r1)
            r5.f341696a = r0
            if (r0 == 0) goto L29
            return r0
        L29:
            com.fasterxml.jackson.databind.deser.UnresolvedForwardReference r0 = new com.fasterxml.jackson.databind.deser.UnresolvedForwardReference
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not resolve Object Id ["
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r6 = "] -- unresolved forward-reference?"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.fasterxml.jackson.core.e r1 = r4.m()
            r0.<init>(r4, r6, r1, r5)
            throw r0
        L46:
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.START_OBJECT
            if (r1 != r2) goto L4e
            com.fasterxml.jackson.core.JsonToken r1 = r4.g0()
        L4e:
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME
            if (r1 != r2) goto L57
            com.fasterxml.jackson.annotation.G<?> r0 = r0.f341668d
            r0.getClass()
        L57:
            int r0 = r4.g()
            boolean r1 = r3.f341526g
            switch(r0) {
                case 6: goto L85;
                case 7: goto L78;
                case 8: goto L6b;
                case 9: goto L66;
                case 10: goto L61;
                default: goto L60;
            }
        L60:
            goto L8e
        L61:
            if (r1 == 0) goto L8e
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L8f
        L66:
            if (r1 == 0) goto L8e
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L8f
        L6b:
            boolean r0 = r3.f341528i
            if (r0 == 0) goto L8e
            double r0 = r4.u()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            goto L8f
        L78:
            boolean r0 = r3.f341527h
            if (r0 == 0) goto L8e
            int r0 = r4.z()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L8f
        L85:
            boolean r0 = r3.f341525f
            if (r0 == 0) goto L8e
            java.lang.String r0 = r4.L()
            goto L8f
        L8e:
            r0 = 0
        L8f:
            if (r0 == 0) goto L92
            return r0
        L92:
            java.lang.Object r4 = r6.d(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.a.g(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.f, com.fasterxml.jackson.databind.jsontype.l):java.lang.Object");
    }

    @Override // com.fasterxml.jackson.databind.i
    public final v i(String str) {
        HashMap map = this.f341523d;
        if (map == null) {
            return null;
        }
        return (v) map.get(str);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final com.fasterxml.jackson.databind.deser.impl.s n() {
        return this.f341522c;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Class<?> o() {
        return this.f341521b.f341930b;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final LogicalType q() {
        return LogicalType.f342435e;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Boolean r(com.fasterxml.jackson.databind.e eVar) {
        return null;
    }

    public a(com.fasterxml.jackson.databind.b bVar) {
        com.fasterxml.jackson.databind.h hVar = bVar.f341454a;
        this.f341521b = hVar;
        this.f341522c = null;
        this.f341523d = null;
        Class<?> cls = hVar.f341930b;
        this.f341525f = cls.isAssignableFrom(String.class);
        boolean z12 = true;
        this.f341526g = cls == Boolean.TYPE || cls.isAssignableFrom(Boolean.class);
        this.f341527h = cls == Integer.TYPE || cls.isAssignableFrom(Integer.class);
        if (cls != Double.TYPE && !cls.isAssignableFrom(Double.class)) {
            z12 = false;
        }
        this.f341528i = z12;
    }

    public a(a aVar, com.fasterxml.jackson.databind.deser.impl.s sVar) {
        this.f341521b = aVar.f341521b;
        this.f341523d = aVar.f341523d;
        this.f341525f = aVar.f341525f;
        this.f341526g = aVar.f341526g;
        this.f341527h = aVar.f341527h;
        this.f341528i = aVar.f341528i;
        this.f341522c = sVar;
        this.f341524e = null;
    }
}
