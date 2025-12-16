package com.avito.android.beduin.common.component.product_comparison.items;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.component.product_comparison.BeduinProductComparisonTextItemParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinProductComparisonItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/product_comparison/items/i;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f102166a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final BeduinProductComparisonTextItemParams f102167b;

    /* renamed from: c, reason: collision with root package name */
    public final int f102168c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f102169d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final BeduinProductComparisonTextItemParams f102170e;

    /* renamed from: f, reason: collision with root package name */
    public final int f102171f;

    public i(@l String str, @l BeduinProductComparisonTextItemParams beduinProductComparisonTextItemParams, int i12, @k String str2, @l BeduinProductComparisonTextItemParams beduinProductComparisonTextItemParams2, int i13) {
        this.f102166a = str;
        this.f102167b = beduinProductComparisonTextItemParams;
        this.f102168c = i12;
        this.f102169d = str2;
        this.f102170e = beduinProductComparisonTextItemParams2;
        this.f102171f = i13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f102166a, iVar.f102166a) && L.f(this.f102167b, iVar.f102167b) && this.f102168c == iVar.f102168c && L.f(this.f102169d, iVar.f102169d) && L.f(this.f102170e, iVar.f102170e) && this.f102171f == iVar.f102171f;
    }

    public final int hashCode() {
        String str = this.f102166a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BeduinProductComparisonTextItemParams beduinProductComparisonTextItemParams = this.f102167b;
        int iD2 = H.d(r.e(this.f102168c, (iHashCode + (beduinProductComparisonTextItemParams == null ? 0 : beduinProductComparisonTextItemParams.hashCode())) * 31, 31), 31, this.f102169d);
        BeduinProductComparisonTextItemParams beduinProductComparisonTextItemParams2 = this.f102170e;
        return Integer.hashCode(this.f102171f) + ((iD2 + (beduinProductComparisonTextItemParams2 != null ? beduinProductComparisonTextItemParams2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinProductComparisonProperty(title=");
        sb2.append(this.f102166a);
        sb2.append(", titleParams=");
        sb2.append(this.f102167b);
        sb2.append(", titleHeight=");
        sb2.append(this.f102168c);
        sb2.append(", value=");
        sb2.append(this.f102169d);
        sb2.append(", valueParams=");
        sb2.append(this.f102170e);
        sb2.append(", valueHeight=");
        return r.t(sb2, this.f102171f, ')');
    }
}
