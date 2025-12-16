package com.avito.android.serp.adapter.skeleton;

import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.recycler.layout_manager.UnpredictiveGridLayoutManager;
import kotlin.Metadata;

/* compiled from: ScrollUnpredictiveGridLayoutManager.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/skeleton/ScrollUnpredictiveGridLayoutManager;", "Lcom/avito/android/recycler/layout_manager/UnpredictiveGridLayoutManager;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScrollUnpredictiveGridLayoutManager extends UnpredictiveGridLayoutManager {

    /* renamed from: O, reason: collision with root package name */
    public boolean f272230O;

    public ScrollUnpredictiveGridLayoutManager(@Y61.k Context context, int i12) {
        super(i12);
        this.f272230O = true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final boolean J() {
        return this.f272230O && super.J();
    }
}
