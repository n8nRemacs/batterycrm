package com.avito.android.messenger.channels.mvi.view;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: ChannelsListView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "", "test", "(Lkotlin/G0;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class N<T> implements l41.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H f188700b;

    public N(H h12) {
        this.f188700b = h12;
    }

    @Override // l41.r
    public final boolean test(Object obj) {
        H h12 = this.f188700b;
        RecyclerView.Adapter adapter = h12.f188669h.getAdapter();
        return adapter != null && h12.f188682u && adapter.getItemCount() > 0 && h12.f188670i.M1() == adapter.getItemCount() - 1;
    }
}
