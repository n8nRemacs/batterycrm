package com.avito.android.user_advert.soa_with_price;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CloseReasonsSheetDialogView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/soa_with_price/c;", "Lcom/avito/android/user_advert/soa_with_price/b;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_advert.soa_with_price.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35549c implements InterfaceC35548b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f311881a;

    public C35549c(@Y61.k ViewGroup viewGroup, @Y61.k RecyclerView.Adapter<com.avito.konveyor.adapter.b> adapter) {
        View viewFindViewById = viewGroup.findViewById(R.id.close_reasons_list);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f311881a = recyclerView;
        recyclerView.setAdapter(adapter);
        viewGroup.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
    }
}
