package com.avito.android.sbc.autodispatches;

import Po0.C14821e;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.C23424o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TabPagerAdapter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/autodispatches/a;", "Landroidx/recyclerview/widget/o$b;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.sbc.autodispatches.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34465a extends C23424o.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f258844a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f258845b;

    public C34465a(@Y61.k ArrayList arrayList, @Y61.k List list) {
        this.f258844a = list;
        this.f258845b = arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areContentsTheSame(int i12, int i13) {
        return L.f(this.f258844a.get(i12), this.f258845b.get(i13));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areItemsTheSame(int i12, int i13) {
        return ((C14821e) this.f258844a.get(i12)).f13303c == ((C14821e) this.f258845b.get(i13)).f13303c;
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getNewListSize() {
        return this.f258845b.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getOldListSize() {
        return this.f258844a.size();
    }
}
