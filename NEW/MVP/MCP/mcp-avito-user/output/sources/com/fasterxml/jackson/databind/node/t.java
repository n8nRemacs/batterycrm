package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonToken;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: ObjectNode.java */
/* loaded from: classes4.dex */
public class t extends f<t> implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f342216c;

    public t(m mVar) {
        super(mVar);
        this.f342216c = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    @Override // com.fasterxml.jackson.databind.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.fasterxml.jackson.core.JsonGenerator r7, com.fasterxml.jackson.databind.A r8, com.fasterxml.jackson.databind.jsontype.o r9) {
        /*
            r6 = this;
            if (r8 == 0) goto Le
            com.fasterxml.jackson.databind.SerializationFeature r0 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS
            com.fasterxml.jackson.databind.z r1 = r8.f341330b
            boolean r0 = r1.p(r0)
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.START_OBJECT
            com.fasterxml.jackson.core.type.WritableTypeId r1 = r9.d(r1, r6)
            com.fasterxml.jackson.core.type.WritableTypeId r1 = r9.e(r7, r1)
            java.util.LinkedHashMap r2 = r6.f342216c
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L23:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L52
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getValue()
            com.fasterxml.jackson.databind.node.b r4 = (com.fasterxml.jackson.databind.node.b) r4
            if (r0 == 0) goto L45
            r4.getClass()
            boolean r5 = r4 instanceof com.fasterxml.jackson.databind.node.a
            if (r5 == 0) goto L45
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L45
            goto L23
        L45:
            java.lang.Object r3 = r3.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r7.G(r3)
            r4.d(r7, r8)
            goto L23
        L52:
            r9.f(r7, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.node.t.a(com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.A, com.fasterxml.jackson.databind.jsontype.o):void");
    }

    @Override // com.fasterxml.jackson.core.p
    public final JsonToken b() {
        return JsonToken.START_OBJECT;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    @Override // com.fasterxml.jackson.databind.node.b, com.fasterxml.jackson.databind.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(com.fasterxml.jackson.core.JsonGenerator r6, com.fasterxml.jackson.databind.A r7) {
        /*
            r5 = this;
            if (r7 == 0) goto Le
            com.fasterxml.jackson.databind.SerializationFeature r0 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS
            com.fasterxml.jackson.databind.z r1 = r7.f341330b
            boolean r0 = r1.p(r0)
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            r6.f0(r5)
            java.util.LinkedHashMap r1 = r5.f342216c
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L1c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4b
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            com.fasterxml.jackson.databind.node.b r3 = (com.fasterxml.jackson.databind.node.b) r3
            if (r0 == 0) goto L3e
            r3.getClass()
            boolean r4 = r3 instanceof com.fasterxml.jackson.databind.node.a
            if (r4 == 0) goto L3e
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L3e
            goto L1c
        L3e:
            java.lang.Object r2 = r2.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r6.G(r2)
            r3.d(r6, r7)
            goto L1c
        L4b:
            r6.B()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.node.t.d(com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.A):void");
    }

    @Override // com.fasterxml.jackson.databind.j
    public final Iterator<com.fasterxml.jackson.databind.j> e() {
        return this.f342216c.values().iterator();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof t)) {
            return this.f342216c.equals(((t) obj).f342216c);
        }
        return false;
    }

    public final com.fasterxml.jackson.databind.j g(String str, com.fasterxml.jackson.databind.j jVar) {
        if (jVar == null) {
            this.f342193b.getClass();
            jVar = r.f342215b;
        }
        return (com.fasterxml.jackson.databind.j) this.f342216c.put(str, jVar);
    }

    public final int hashCode() {
        return this.f342216c.hashCode();
    }

    @Override // com.fasterxml.jackson.databind.k.a
    public final boolean isEmpty() {
        return this.f342216c.isEmpty();
    }
}
