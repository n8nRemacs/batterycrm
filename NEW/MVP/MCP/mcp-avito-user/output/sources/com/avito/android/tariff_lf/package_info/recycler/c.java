package com.avito.android.tariff_lf.package_info.recycler;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffPackageItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf/package_info/recycler/c;", "Lcom/avito/conveyor_item/a;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f299239b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f299240c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ArrayList f299241d;

    public c(@k String str, @k String str2, @l ArrayList arrayList) {
        this.f299239b = str;
        this.f299240c = str2;
        this.f299241d = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f299239b, cVar.f299239b) && L.f(this.f299240c, cVar.f299240c) && this.f299241d.equals(cVar.f299241d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79541k() {
        return getF291834h().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF291834h() {
        return this.f299239b;
    }

    public final int hashCode() {
        return this.f299241d.hashCode() + H.d(this.f299239b.hashCode() * 31, 31, this.f299240c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffPackageItem(stringId=");
        sb2.append(this.f299239b);
        sb2.append(", title=");
        sb2.append(this.f299240c);
        sb2.append(", microCategories=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f299241d, ')');
    }
}
