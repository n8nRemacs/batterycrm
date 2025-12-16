package com.avito.android.delivery_tarifikator.presentation.konveyor.item.tariffcard;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TariffCardItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/tariffcard/c;", "Lcom/avito/conveyor_item/a;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f135467b;

    /* renamed from: c, reason: collision with root package name */
    public final long f135468c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f135469d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f135470e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f135471f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f135472g;

    public c(@k String str, long j12, @k String str2, @k String str3, boolean z12, boolean z13) {
        this.f135467b = str;
        this.f135468c = j12;
        this.f135469d = str2;
        this.f135470e = str3;
        this.f135471f = z12;
        this.f135472g = z13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f135467b, cVar.f135467b) && this.f135468c == cVar.f135468c && L.f(this.f135469d, cVar.f135469d) && L.f(this.f135470e, cVar.f135470e) && this.f135471f == cVar.f135471f && this.f135472g == cVar.f135472g;
    }

    @Override // TV0.a
    public final long getId() {
        return getF135467b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF135467b() {
        return this.f135467b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f135472g) + r.i(H.d(H.d(r.g(this.f135467b.hashCode() * 31, 31, this.f135468c), 31, this.f135469d), 31, this.f135470e), 31, this.f135471f);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffCardItem(stringId=");
        sb2.append(this.f135467b);
        sb2.append(", tariffId=");
        sb2.append(this.f135468c);
        sb2.append(", name=");
        sb2.append(this.f135469d);
        sb2.append(", description=");
        sb2.append(this.f135470e);
        sb2.append(", shouldShowEditButton=");
        sb2.append(this.f135471f);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f135472g, ')');
    }

    public /* synthetic */ c(String str, long j12, String str2, String str3, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(str, j12, str2, str3, z12, (i12 & 32) != 0 ? false : z13);
    }
}
