package com.avito.beduin.v2.engine.field;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Id.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/field/o;", "Lcom/avito/beduin/v2/engine/field/j;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class o implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f336871a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f336872b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f336873c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f336874d;

    public o(@Y61.k String str, @Y61.l String str2) {
        this.f336871a = str;
        this.f336872b = str;
        this.f336873c = str2 != null ? str2 : str;
        this.f336874d = str2 != null;
    }

    @Override // com.avito.beduin.v2.engine.field.j
    /* renamed from: a, reason: from getter */
    public final boolean getF336874d() {
        return this.f336874d;
    }

    @Override // com.avito.beduin.v2.engine.field.j
    @Y61.k
    public final j b(@Y61.l String str) {
        return new o(this.f336871a, str);
    }

    @Override // com.avito.beduin.v2.engine.field.j
    @Y61.l
    public final String c() {
        String f336873c = getF336873c();
        if (getF336874d()) {
            return f336873c;
        }
        return null;
    }

    @Override // com.avito.beduin.v2.engine.field.j
    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getF336873c() {
        return this.f336873c;
    }

    @Override // com.avito.beduin.v2.engine.field.j
    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getF336872b() {
        return this.f336872b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        return L.f(this.f336873c, ((o) obj).f336873c);
    }

    public final int hashCode() {
        return this.f336873c.hashCode();
    }

    @Y61.k
    public final String toString() {
        return this.f336873c;
    }

    public /* synthetic */ o(String str, String str2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2);
    }
}
