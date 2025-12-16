package com.avito.android.messenger;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: PaginationScrollListener.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/l0;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class l0 extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinearLayoutManager f196425b;

    /* renamed from: c, reason: collision with root package name */
    public final int f196426c = 3;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final kotlin.jvm.internal.N f196427d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f196428e;

    /* JADX WARN: Multi-variable type inference failed */
    public l0(@Y61.k LinearLayoutManager linearLayoutManager, @Y61.k Y41.a aVar) {
        this.f196425b = linearLayoutManager;
        this.f196427d = (kotlin.jvm.internal.N) aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
        l();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [Y41.a, kotlin.jvm.internal.N] */
    public final void l() {
        LinearLayoutManager linearLayoutManager;
        int iO02;
        if (!this.f196428e || (iO02 = (linearLayoutManager = this.f196425b).o0()) <= 0) {
            return;
        }
        int iE02 = linearLayoutManager.e0();
        int iK1 = linearLayoutManager.K1();
        if (iK1 < 0 || iK1 + iE02 < iO02 - this.f196426c) {
            return;
        }
        this.f196427d.invoke();
    }
}
