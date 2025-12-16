package com.avito.beduin.v2.engine.field.entity;

import com.avito.beduin.v2.engine.core.E;
import com.avito.beduin.v2.engine.field.d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StructureField.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/A;", "Lcom/avito/beduin/v2/engine/field/d;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class A implements com.avito.beduin.v2.engine.field.d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.field.m f336778b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f336779c;

    public A() {
        this(null, null, 3, null);
    }

    public static A t(A a12, com.avito.beduin.v2.engine.field.m mVar, String str, int i12) {
        if ((i12 & 1) != 0) {
            mVar = a12.f336778b;
        }
        if ((i12 & 2) != 0) {
            str = a12.f336779c;
        }
        a12.getClass();
        return new A(mVar, str);
    }

    @Override // com.avito.beduin.v2.engine.field.d
    public final boolean b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.d dVar) {
        return h(zVar).equals(dVar.h(zVar));
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.l
    public final l e(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        d.b.c(zVar, this);
        throw null;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a12 = (A) obj;
        return L.f(this.f336778b, a12.f336778b) && L.f(this.f336779c, a12.f336779c);
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.k
    public final x g(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        d.b.f(zVar, this);
        throw null;
    }

    public final int hashCode() {
        return this.f336778b.f336870a.hashCode();
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.l
    public final p k(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        d.b.d(zVar, this);
        throw null;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.l
    public final C36268a l(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        d.b.a(zVar, this);
        throw null;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> m(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        com.avito.beduin.v2.engine.field.j jVarA = E.a(zVar, this.f336779c);
        com.avito.beduin.v2.engine.field.m mVar = this.f336778b;
        mVar.getClass();
        Map<String, com.avito.beduin.v2.engine.field.d> map = mVar.f336870a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((com.avito.beduin.v2.engine.field.d) entry.getValue()).m(zVar));
        }
        return new B(jVarA, new com.avito.beduin.v2.engine.field.h(linkedHashMap));
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.l
    public final v q(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        d.b.e(zVar, this);
        throw null;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.l
    public final c r(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        d.b.b(zVar, this);
        throw null;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.k
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final A h(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        com.avito.beduin.v2.engine.field.m mVar = this.f336778b;
        mVar.getClass();
        Map<String, com.avito.beduin.v2.engine.field.d> map = mVar.f336870a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((com.avito.beduin.v2.engine.field.d) entry.getValue()).h(zVar));
        }
        return new A(new com.avito.beduin.v2.engine.field.m(linkedHashMap), this.f336779c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StructureData(");
        sb2.append("fields=" + this.f336778b);
        sb2.append(")");
        return sb2.toString();
    }

    public A(@Y61.k com.avito.beduin.v2.engine.field.m mVar, @Y61.l String str) {
        this.f336778b = mVar;
        this.f336779c = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public A(com.avito.beduin.v2.engine.field.m mVar, String str, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            com.avito.beduin.v2.engine.field.m.f336868b.getClass();
            mVar = com.avito.beduin.v2.engine.field.m.f336869c;
        }
        this(mVar, (i12 & 2) != 0 ? null : str);
    }

    public A(@Y61.k Q<String, ? extends com.avito.beduin.v2.engine.field.d>... qArr) {
        this(new com.avito.beduin.v2.engine.field.m((Map<String, ? extends com.avito.beduin.v2.engine.field.d>) P0.s(qArr)), null, 2, null);
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.k
    public final A a(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        return this;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d c(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        return this;
    }
}
