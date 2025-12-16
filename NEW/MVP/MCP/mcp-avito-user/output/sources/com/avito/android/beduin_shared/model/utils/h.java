package com.avito.android.beduin_shared.model.utils;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bj.AbstractC25658a;
import kotlin.Metadata;

/* compiled from: BeduinRecyclerViews.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin-shared_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h {
    public static final void a(@Y61.k RecyclerView recyclerView, @Y61.k AbstractC25658a abstractC25658a, @Y61.k LinearLayoutManager linearLayoutManager) {
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(abstractC25658a);
        recyclerView.setClipChildren(false);
    }

    public static /* synthetic */ void b(RecyclerView recyclerView, AbstractC25658a abstractC25658a) {
        recyclerView.getContext();
        a(recyclerView, abstractC25658a, new LinearLayoutManager());
    }
}
