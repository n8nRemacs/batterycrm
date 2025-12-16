package com.avito.android.newcars_mark_model_filter.presentation.recycler.brand;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import p30.AbstractC46883b;

/* compiled from: BrandItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/presentation/recycler/brand/b;", "Lp30/b;", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class b extends AbstractC46883b {

    /* renamed from: c, reason: collision with root package name */
    public final long f207369c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f207370d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f207371e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final UniversalImage f207372f;

    public b(long j12, @Y61.k String str, boolean z12, @Y61.k UniversalImage universalImage) {
        super(j12);
        this.f207369c = j12;
        this.f207370d = str;
        this.f207371e = z12;
        this.f207372f = universalImage;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f207369c == bVar.f207369c && L.f(this.f207370d, bVar.f207370d) && this.f207371e == bVar.f207371e && L.f(this.f207372f, bVar.f207372f);
    }

    @Override // p30.AbstractC46883b, TV0.a
    public final long getId() {
        return this.f207369c;
    }

    public final int hashCode() {
        return this.f207372f.hashCode() + r.i(H.d(Long.hashCode(this.f207369c) * 31, 31, this.f207370d), 31, this.f207371e);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BrandOptionItem(id=");
        sb2.append(this.f207369c);
        sb2.append(", text=");
        sb2.append(this.f207370d);
        sb2.append(", isSelected=");
        sb2.append(this.f207371e);
        sb2.append(", icon=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f207372f, ')');
    }
}
