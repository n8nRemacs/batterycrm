package com.avito.android.serp.adapter.resizable_service_widget.block.item;

import Oi0.C14700d;
import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.serp.adapter.resizable_service_widget.row.item.ResizableServiceWidgetRowItem;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ResizableServiceWidgetBlockView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/resizable_service_widget/block/item/f;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f270721b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C14700d f270722c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ArrayList f270723d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final UV0.c<ResizableServiceWidgetRowItem> f270724e;

    public f(@k View view, @k com.avito.konveyor.adapter.a aVar, @k C14700d c14700d) {
        super(view);
        this.f270721b = aVar;
        this.f270722c = c14700d;
        ArrayList arrayList = new ArrayList();
        this.f270723d = arrayList;
        this.f270724e = new UV0.c<>(arrayList);
        View viewFindViewById = view.findViewById(R.id.resizable_service_widget_recycler);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(c14700d);
    }
}
