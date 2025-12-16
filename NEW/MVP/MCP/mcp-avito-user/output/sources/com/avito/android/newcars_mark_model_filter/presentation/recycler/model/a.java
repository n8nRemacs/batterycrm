package com.avito.android.newcars_mark_model_filter.presentation.recycler.model;

import Y61.l;
import androidx.compose.foundation.H;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import p30.AbstractC46882a;

/* compiled from: ModelItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/presentation/recycler/model/a;", "Lp30/a;", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a extends AbstractC46882a {

    /* renamed from: e, reason: collision with root package name */
    public final long f207391e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f207392f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ArrayList f207393g;

    public a(long j12, @Y61.k String str, @Y61.k ArrayList arrayList) {
        super(j12, str, arrayList);
        this.f207391e = j12;
        this.f207392f = str;
        this.f207393g = arrayList;
    }

    @Override // p30.AbstractC46882a
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF428154c() {
        return this.f207392f;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f207391e == aVar.f207391e && L.f(this.f207392f, aVar.f207392f) && this.f207393g.equals(aVar.f207393g);
    }

    @Override // p30.AbstractC46882a
    @Y61.k
    public final List<b> f() {
        return this.f207393g;
    }

    @Override // p30.AbstractC46882a, TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF428153b() {
        return this.f207391e;
    }

    public final int hashCode() {
        return this.f207393g.hashCode() + H.d(Long.hashCode(this.f207391e) * 31, 31, this.f207392f);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ModelItem(id=");
        sb2.append(this.f207391e);
        sb2.append(", label=");
        sb2.append(this.f207392f);
        sb2.append(", options=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f207393g, ')');
    }
}
