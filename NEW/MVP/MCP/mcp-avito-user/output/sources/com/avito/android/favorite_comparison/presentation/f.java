package com.avito.android.favorite_comparison.presentation;

import com.avito.android.comparison.remote.model.EmptyStateInfo;
import com.avito.android.remote.error.ApiError;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FavoriteComparisonState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_comparison/presentation/f;", "", "_avito_favorite-comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f155319a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final EmptyStateInfo f155320b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final List<com.avito.android.favorite_comparison.presentation.items.comparison_list_item.a> f155321c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final ApiError f155322d;

    public f() {
        this(false, null, null, null, 15, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f155319a == fVar.f155319a && L.f(this.f155320b, fVar.f155320b) && L.f(this.f155321c, fVar.f155321c) && L.f(this.f155322d, fVar.f155322d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f155319a) * 31;
        EmptyStateInfo emptyStateInfo = this.f155320b;
        int iHashCode2 = (iHashCode + (emptyStateInfo == null ? 0 : emptyStateInfo.hashCode())) * 31;
        List<com.avito.android.favorite_comparison.presentation.items.comparison_list_item.a> list = this.f155321c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        ApiError apiError = this.f155322d;
        return iHashCode3 + (apiError != null ? apiError.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FavoriteComparisonState(needShowLoading=");
        sb2.append(this.f155319a);
        sb2.append(", emptyState=");
        sb2.append(this.f155320b);
        sb2.append(", items=");
        sb2.append(this.f155321c);
        sb2.append(", overlayError=");
        return AK.c.n(sb2, this.f155322d, ')');
    }

    public f(boolean z12, @Y61.l EmptyStateInfo emptyStateInfo, @Y61.l List<com.avito.android.favorite_comparison.presentation.items.comparison_list_item.a> list, @Y61.l ApiError apiError) {
        this.f155319a = z12;
        this.f155320b = emptyStateInfo;
        this.f155321c = list;
        this.f155322d = apiError;
    }

    public /* synthetic */ f(boolean z12, EmptyStateInfo emptyStateInfo, List list, ApiError apiError, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? null : emptyStateInfo, (i12 & 4) != 0 ? null : list, (i12 & 8) != 0 ? null : apiError);
    }
}
