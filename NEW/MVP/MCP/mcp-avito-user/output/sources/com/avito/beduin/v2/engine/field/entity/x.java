package com.avito.beduin.v2.engine.field.entity;

import com.avito.beduin.v2.engine.core.K;
import com.avito.beduin.v2.engine.field.a;
import com.avito.beduin.v2.engine.field.d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RawField.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/x;", "Lcom/avito/beduin/v2/engine/field/d;", "Lcom/avito/beduin/v2/engine/field/b;", "Lcom/avito/beduin/v2/engine/field/a;", "args", "Lcom/avito/beduin/v2/engine/field/f;", "field", "", "scopeName", "<init>", "(Ljava/util/Map;Lcom/avito/beduin/v2/engine/field/f;Ljava/lang/String;Lkotlin/jvm/internal/w;)V", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class x implements com.avito.beduin.v2.engine.field.d, com.avito.beduin.v2.engine.field.b<com.avito.beduin.v2.engine.field.d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Map<com.avito.beduin.v2.engine.field.q, ? extends K<? extends com.avito.beduin.v2.engine.field.d>> f336855b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> f336856c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f336857d;

    public x() {
        throw null;
    }

    public x(Map map, com.avito.beduin.v2.engine.field.f fVar, String str, C42822w c42822w) {
        this.f336855b = map;
        this.f336856c = fVar;
        this.f336857d = str;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.l
    public final A a(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        d.b.g(zVar, this);
        throw null;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    public final boolean b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.d dVar) {
        return equals(dVar.h(zVar));
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
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        Map<com.avito.beduin.v2.engine.field.q, ? extends K<? extends com.avito.beduin.v2.engine.field.d>> map = xVar.f336855b;
        a.C10440a c10440a = com.avito.beduin.v2.engine.field.a.f336767b;
        return L.f(this.f336855b, map) && L.f(this.f336856c, xVar.f336856c) && L.f(this.f336857d, xVar.f336857d);
    }

    public final int hashCode() {
        a.C10440a c10440a = com.avito.beduin.v2.engine.field.a.f336767b;
        return this.f336857d.hashCode() + ((this.f336856c.hashCode() + (this.f336855b.hashCode() * 31)) * 31);
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
        return new y(zVar.A(), this.f336856c, null, 4, null);
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

    @Override // com.avito.beduin.v2.engine.field.b
    @Y61.k
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final com.avito.beduin.v2.engine.field.d o(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) {
        Map<com.avito.beduin.v2.engine.field.q, ? extends K<? extends com.avito.beduin.v2.engine.field.d>> mapA = mVar.A(this.f336857d);
        a.C10440a c10440a = com.avito.beduin.v2.engine.field.a.f336767b;
        return this.f336856c.a(zVar, P0.k(this.f336855b, mapA));
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RawData(");
        sb2.append("scopeName=" + this.f336857d + ',');
        StringBuilder sb3 = new StringBuilder("field=");
        sb3.append(this.f336856c);
        sb2.append(sb3.toString());
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d c(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        return this;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.k
    public final x g(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        return this;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d h(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        return this;
    }
}
