package com.avito.android.suggest_locations.adapter;

import Y61.k;
import androidx.recyclerview.widget.C23424o;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuggestLocationsDiffCallback.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_locations/adapter/f;", "Landroidx/recyclerview/widget/o$b;", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f extends C23424o.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<SuggestLocationItem> f292251a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<SuggestLocationItem> f292252b;

    public f(@k List<SuggestLocationItem> list, @k List<SuggestLocationItem> list2) {
        this.f292251a = list;
        this.f292252b = list2;
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areContentsTheSame(int i12, int i13) {
        return L.f(this.f292251a.get(i12), this.f292252b.get(i13));
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areItemsTheSame(int i12, int i13) {
        return L.f(this.f292251a.get(i12).f292214b, this.f292252b.get(i13).f292214b);
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getNewListSize() {
        return this.f292252b.size();
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getOldListSize() {
        return this.f292251a.size();
    }
}
