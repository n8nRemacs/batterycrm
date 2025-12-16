package com.avito.android.user_adverts.tab_screens.adverts.tooltip;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;

/* compiled from: UserAdvertsTooltipsPlayer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/tooltip/k;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_adverts.tab_screens.adverts.tooltip.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35701k extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f315656b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r f315657c;

    public C35701k(RecyclerView recyclerView, kotlinx.coroutines.r rVar) {
        this.f315656b = recyclerView;
        this.f315657c = rVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void i(int i12, @Y61.k RecyclerView recyclerView) {
        if (i12 == 0) {
            this.f315656b.v0(this);
            int i13 = Z.f406624c;
            this.f315657c.resumeWith(G0.f406611a);
        }
    }
}
