package com.avito.android.advert.item;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: AdvertDetailsView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/G1;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class G1 extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.core.B<Integer> f71628b;

    public G1(io.reactivex.rxjava3.core.B<Integer> b12) {
        this.f71628b = b12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void i(int i12, @Y61.k RecyclerView recyclerView) {
        this.f71628b.onNext(Integer.valueOf(i12));
    }
}
