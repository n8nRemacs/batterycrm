package com.avito.beduin.v2.avito.component.image.state;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Fallback.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/image/state/u;", "Lcom/avito/beduin/v2/avito/component/image/state/s;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class u implements s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f334451a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f334452b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final com.avito.beduin.v2.theme.r f334453c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Scale f334454d;

    public u(@Y61.k String str, @Y61.l String str2, @Y61.l com.avito.beduin.v2.theme.r rVar, @Y61.k Scale scale) {
        this.f334451a = str;
        this.f334452b = str2;
        this.f334453c = rVar;
        this.f334454d = scale;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return L.f(this.f334451a, uVar.f334451a) && L.f(this.f334452b, uVar.f334452b) && L.f(this.f334453c, uVar.f334453c) && this.f334454d == uVar.f334454d;
    }

    public final int hashCode() {
        int iHashCode = this.f334451a.hashCode() * 31;
        String str = this.f334452b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        com.avito.beduin.v2.theme.r rVar = this.f334453c;
        return this.f334454d.hashCode() + ((iHashCode2 + (rVar != null ? rVar.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "FallbackLocalIcon(name=" + this.f334451a + ", themeName=" + this.f334452b + ", color=" + this.f334453c + ", scale=" + this.f334454d + ')';
    }
}
