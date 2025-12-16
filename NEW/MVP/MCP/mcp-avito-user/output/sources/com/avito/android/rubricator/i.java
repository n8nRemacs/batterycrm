package com.avito.android.rubricator;

import Oi0.C14700d;
import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.rubricator.b;
import com.avito.android.rubricator.items.RubricatorRefinedItem;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SerpVerticalRubricatorView.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rubricator/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/rubricator/h;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.h f255742b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C14700d f255743c;

    /* renamed from: d, reason: collision with root package name */
    public final int f255744d;

    /* renamed from: e, reason: collision with root package name */
    public final int f255745e;

    /* renamed from: f, reason: collision with root package name */
    public final int f255746f;

    /* renamed from: g, reason: collision with root package name */
    public final int f255747g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f255748h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final RecyclerView f255749i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final LinearLayout f255750j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final ArrayList f255751k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final UV0.c<RubricatorRefinedItem> f255752l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public Type f255753m;

    /* compiled from: SerpVerticalRubricatorView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/rubricator/i$a;", "", "<init>", "()V", "", "CATEGORIES_AMOUNT_TO_WRAP", "I", "CATEGORIES_LINES", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public i(@k View view, @k com.avito.konveyor.adapter.h hVar, @k C14700d c14700d) {
        super(view);
        this.f255742b = hVar;
        this.f255743c = c14700d;
        this.f255744d = view.getResources().getDimensionPixelOffset(R.dimen.standard_padding);
        this.f255745e = view.getResources().getDimensionPixelOffset(R.dimen.vertical_content_horizontal_padding);
        this.f255746f = view.getResources().getDimensionPixelOffset(R.dimen.serp_rubricator_services_horizontal_padding);
        this.f255747g = view.getResources().getDimensionPixelOffset(R.dimen.serp_rubricator_services_title_bottom_padding);
        this.f255748h = (TextView) view.findViewById(R.id.rubricator_title);
        this.f255749i = (RecyclerView) view.findViewById(R.id.rubricator_recycler_view);
        this.f255750j = (LinearLayout) view.findViewById(R.id.rubricator_container);
        ArrayList arrayList = new ArrayList();
        this.f255751k = arrayList;
        this.f255752l = new UV0.c<>(arrayList);
        this.f255753m = Type.f255698b;
    }

    @Override // com.avito.android.rubricator.h
    @k
    /* renamed from: getType, reason: from getter */
    public final Type getF255753m() {
        return this.f255753m;
    }

    @Override // com.avito.android.rubricator.h
    public final void ql(@k b bVar) {
        I5.a(this.f255748h, bVar.getF255725e(), false);
        boolean z12 = bVar instanceof b.a;
        ArrayList arrayList = this.f255751k;
        LinearLayout linearLayout = this.f255750j;
        UV0.c<RubricatorRefinedItem> cVar = this.f255752l;
        com.avito.konveyor.adapter.h hVar = this.f255742b;
        C14700d c14700d = this.f255743c;
        RecyclerView recyclerView = this.f255749i;
        if (z12) {
            b.a aVar = (b.a) bVar;
            if (aVar.f255706e != null) {
                int i12 = this.f255744d;
                D6.c(this.f255748h, Integer.valueOf(i12), null, Integer.valueOf(i12), null, 10);
            }
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            List<RubricatorRefinedItem> list = aVar.f255707f;
            if (adapter == null) {
                arrayList.clear();
                arrayList.addAll(list);
                c14700d.setHasStableIds(true);
                hVar.f338510e = cVar;
                if (list.size() < 8) {
                    if (!(recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
                        recyclerView.getContext();
                        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
                    }
                } else if (!(recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                    recyclerView.getContext();
                    recyclerView.setLayoutManager(new GridLayoutManager(2, 0));
                }
                recyclerView.l(new com.avito.android.rubricator.items.category.a(), -1);
                recyclerView.setAdapter(c14700d);
                recyclerView.requestLayout();
            }
            if (list.isEmpty()) {
                D6.w(linearLayout);
            } else {
                D6.H(linearLayout);
            }
            this.f255753m = Type.f255698b;
            return;
        }
        if (bVar instanceof b.c) {
            b.c cVar2 = (b.c) bVar;
            int i13 = this.f255745e;
            D6.c(this.f255750j, Integer.valueOf(i13), null, Integer.valueOf(i13), null, 10);
            RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
            List<RubricatorRefinedItem> list2 = cVar2.f255716g;
            if (adapter2 == null) {
                arrayList.clear();
                arrayList.addAll(list2);
                hVar.f338510e = cVar;
                c14700d.setHasStableIds(true);
                recyclerView.setAdapter(c14700d);
                Context context = recyclerView.getContext();
                b.c.a aVar2 = cVar2.f255714e;
                recyclerView.setLayoutManager(new RubricatorFixedColumnsCountGridLayoutManager(context, aVar2));
                recyclerView.l(new com.avito.android.rubricator.items.service.i(recyclerView.getContext(), aVar2), -1);
                recyclerView.requestLayout();
            }
            if (list2.isEmpty()) {
                D6.w(linearLayout);
            } else {
                D6.H(linearLayout);
            }
            this.f255753m = Type.f255699c;
            return;
        }
        if (bVar instanceof b.d) {
            b.d dVar = (b.d) bVar;
            if (dVar.f255725e != null) {
                D6.c(this.f255748h, null, null, null, Integer.valueOf(this.f255747g), 7);
            }
            int i14 = this.f255746f;
            D6.c(this.f255750j, Integer.valueOf(i14), null, Integer.valueOf(i14), null, 10);
            if (recyclerView.getAdapter() == null) {
                recyclerView.setLayoutManager(new RubricatorDynamicColumnsCountLinearLayoutManager(recyclerView.getContext()));
                recyclerView.l(new com.avito.android.rubricator.items.linear_service.a(), -1);
                hVar.f338510e = cVar;
                c14700d.setHasStableIds(true);
                recyclerView.setAdapter(c14700d);
            }
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            D6.B(new j(dVar, layoutManager instanceof RubricatorDynamicColumnsCountLinearLayoutManager ? (RubricatorDynamicColumnsCountLinearLayoutManager) layoutManager : null, this), recyclerView);
            recyclerView.requestLayout();
            if (dVar.f255726f.isEmpty()) {
                D6.w(linearLayout);
            } else {
                D6.H(linearLayout);
            }
            this.f255753m = Type.f255700d;
        }
    }
}
