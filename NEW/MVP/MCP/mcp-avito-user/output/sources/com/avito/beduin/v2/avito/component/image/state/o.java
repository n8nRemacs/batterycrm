package com.avito.beduin.v2.avito.component.image.state;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Content.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/image/state/o;", "Lcom/avito/beduin/v2/avito/component/image/state/k;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class o implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f334426a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f334427b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final com.avito.beduin.v2.theme.r f334428c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Scale f334429d;

    public o(@Y61.k String str, @Y61.l String str2, @Y61.l com.avito.beduin.v2.theme.r rVar, @Y61.k Scale scale) {
        this.f334426a = str;
        this.f334427b = str2;
        this.f334428c = rVar;
        this.f334429d = scale;
    }

    @Override // com.avito.beduin.v2.avito.component.image.state.k
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final Scale getF334429d() {
        return this.f334429d;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return L.f(this.f334426a, oVar.f334426a) && L.f(this.f334427b, oVar.f334427b) && L.f(this.f334428c, oVar.f334428c) && this.f334429d == oVar.f334429d;
    }

    public final int hashCode() {
        int iHashCode = this.f334426a.hashCode() * 31;
        String str = this.f334427b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        com.avito.beduin.v2.theme.r rVar = this.f334428c;
        return this.f334429d.hashCode() + ((iHashCode2 + (rVar != null ? rVar.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "ContentLocalIcon(name=" + this.f334426a + ", themeName=" + this.f334427b + ", color=" + this.f334428c + ", scale=" + this.f334429d + ')';
    }
}
