package com.avito.android.serp.adapter.mini_menu;

import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: MiniMenuBlockItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/mini_menu/f;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f270329b;

    public f(g gVar) {
        this.f270329b = gVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void i(int i12, @Y61.k RecyclerView recyclerView) {
        j jVar;
        Parcelable parcelableL1;
        if (i12 != 0 || (jVar = this.f270329b.f270334f) == null || (parcelableL1 = jVar.f270371a.l1()) == null) {
            return;
        }
        jVar.f270372b.f270379c.b(parcelableL1, jVar.f270373c.f270307b);
    }
}
