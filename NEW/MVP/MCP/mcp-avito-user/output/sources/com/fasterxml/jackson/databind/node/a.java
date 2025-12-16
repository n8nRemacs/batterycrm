package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.A;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ArrayNode.java */
/* loaded from: classes4.dex */
public class a extends f<a> implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f342186c;

    public a(m mVar) {
        super(mVar);
        this.f342186c = new ArrayList();
    }

    @Override // com.fasterxml.jackson.databind.k
    public final void a(JsonGenerator jsonGenerator, A a12, com.fasterxml.jackson.databind.jsontype.o oVar) {
        WritableTypeId writableTypeIdE = oVar.e(jsonGenerator, oVar.d(JsonToken.START_ARRAY, this));
        Iterator it = this.f342186c.iterator();
        while (it.hasNext()) {
            ((b) ((com.fasterxml.jackson.databind.j) it.next())).d(jsonGenerator, a12);
        }
        oVar.f(jsonGenerator, writableTypeIdE);
    }

    @Override // com.fasterxml.jackson.core.p
    public final JsonToken b() {
        return JsonToken.START_ARRAY;
    }

    @Override // com.fasterxml.jackson.databind.node.b, com.fasterxml.jackson.databind.k
    public final void d(JsonGenerator jsonGenerator, A a12) {
        ArrayList arrayList = this.f342186c;
        int size = arrayList.size();
        jsonGenerator.b0(size, this);
        for (int i12 = 0; i12 < size; i12++) {
            ((b) ((com.fasterxml.jackson.databind.j) arrayList.get(i12))).d(jsonGenerator, a12);
        }
        jsonGenerator.A();
    }

    @Override // com.fasterxml.jackson.databind.j
    public final Iterator<com.fasterxml.jackson.databind.j> e() {
        return this.f342186c.iterator();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof a)) {
            return this.f342186c.equals(((a) obj).f342186c);
        }
        return false;
    }

    public final void g(com.fasterxml.jackson.databind.j jVar) {
        if (jVar == null) {
            this.f342193b.getClass();
            jVar = r.f342215b;
        }
        this.f342186c.add(jVar);
    }

    public final int hashCode() {
        return this.f342186c.hashCode();
    }

    @Override // com.fasterxml.jackson.databind.k.a
    public final boolean isEmpty() {
        return this.f342186c.isEmpty();
    }
}
