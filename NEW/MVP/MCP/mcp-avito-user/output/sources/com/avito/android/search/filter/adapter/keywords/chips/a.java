package com.avito.android.search.filter.adapter.keywords.chips;

import Y61.k;
import androidx.recyclerview.widget.C23424o;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: KeywordsChipsAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/keywords/chips/a;", "Landroidx/recyclerview/widget/o$b;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class a extends C23424o.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<String> f262443a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<String> f262444b;

    public a(@k List<String> list, @k List<String> list2) {
        this.f262443a = list;
        this.f262444b = list2;
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areContentsTheSame(int i12, int i13) {
        return L.f(this.f262443a.get(i12), this.f262444b.get(i13));
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areItemsTheSame(int i12, int i13) {
        return L.f(this.f262443a.get(i12), this.f262444b.get(i13));
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getNewListSize() {
        return this.f262444b.size();
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getOldListSize() {
        return this.f262443a.size();
    }
}
