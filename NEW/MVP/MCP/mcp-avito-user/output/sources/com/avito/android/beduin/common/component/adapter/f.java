package com.avito.android.beduin.common.component.adapter;

import Y61.k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.beduin.common.component.n;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: BeduinOverScrollListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/adapter/f;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f100617b;

    public f(@k a aVar) {
        this.f100617b = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void i(int i12, @k RecyclerView recyclerView) {
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if ((layoutManager instanceof LinearLayoutManager) && adapter != null && i12 == 0 && ((LinearLayoutManager) layoutManager).M1() == adapter.getItemCount() - 1) {
            Iterator it = C42745f0.B(this.f100617b.j(), n.class).iterator();
            while (it.hasNext()) {
                ((n) it.next()).h();
            }
        }
    }
}
