package com.avito.android.search.filter.adapter.keywords.chips;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.publish.slots.delivery_addresses.f;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: KeywordsChipsAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/keywords/chips/b;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends RecyclerView.C {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f262445c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f262446b;

    public b(@k View view, @k com.jakewharton.rxrelay3.c<Integer> cVar) {
        super(view);
        this.f262446b = (TextView) view.findViewById(R.id.chip_item_title);
        ((ImageView) view.findViewById(R.id.chip_item_delete)).setOnClickListener(new f(29, this, cVar));
    }
}
