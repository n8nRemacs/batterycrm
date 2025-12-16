package com.avito.android.newcars_mark_model_filter.presentation.recycler.brand;

import Y61.l;
import androidx.compose.foundation.H;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import p30.AbstractC46882a;

/* compiled from: BrandItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/presentation/recycler/brand/a;", "Lp30/a;", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a extends AbstractC46882a {

    /* renamed from: e, reason: collision with root package name */
    public final long f207366e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f207367f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ArrayList f207368g;

    public a(long j12, @Y61.k String str, @Y61.k ArrayList arrayList) {
        super(j12, str, arrayList);
        this.f207366e = j12;
        this.f207367f = str;
        this.f207368g = arrayList;
    }

    @Override // p30.AbstractC46882a
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF428154c() {
        return this.f207367f;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f207366e == aVar.f207366e && L.f(this.f207367f, aVar.f207367f) && this.f207368g.equals(aVar.f207368g);
    }

    @Override // p30.AbstractC46882a
    @Y61.k
    public final List<b> f() {
        return this.f207368g;
    }

    @Override // p30.AbstractC46882a, TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF80342e() {
        return this.f207366e;
    }

    public final int hashCode() {
        return this.f207368g.hashCode() + H.d(Long.hashCode(this.f207366e) * 31, 31, this.f207367f);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BrandItem(id=");
        sb2.append(this.f207366e);
        sb2.append(", label=");
        sb2.append(this.f207367f);
        sb2.append(", options=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f207368g, ')');
    }
}
