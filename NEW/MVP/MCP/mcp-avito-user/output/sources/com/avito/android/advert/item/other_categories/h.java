package com.avito.android.advert.item.other_categories;

import Y41.l;
import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.active_orders_common.items.order.n;
import com.avito.android.advert.item.other_categories.item.CategoryItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.util.y6;
import com.avito.konveyor.a;
import com.avito.konveyor.adapter.j;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: OtherCategoriesItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/other_categories/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/other_categories/g;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f77850h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f77851b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinearLayout f77852c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f77853d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ImageView f77854e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final RecyclerView f77855f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.h f77856g;

    /* compiled from: OtherCategoriesItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<DeepLink, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            b.a.a(h.this.f77851b, deepLink, null, null, 6);
            return G0.f406611a;
        }
    }

    public h(@k View view, @k com.avito.android.deeplink_handler.handler.composite.a aVar) throws BlueprintCollisionException {
        super(view);
        this.f77851b = aVar;
        this.f77852c = (LinearLayout) view.findViewById(R.id.other_categories_title_layout);
        this.f77853d = (TextView) view.findViewById(R.id.other_categories_title);
        this.f77854e = (ImageView) view.findViewById(R.id.other_categories_icon);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.other_categories_items);
        this.f77855f = recyclerView;
        com.avito.android.advert.item.other_categories.item.a aVar2 = new com.avito.android.advert.item.other_categories.item.a(new com.avito.android.advert.item.other_categories.item.d(new a()));
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar2);
        com.avito.konveyor.a aVarA = c10493a.a();
        com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null);
        this.f77856g = hVar;
        recyclerView.setAdapter(new j(hVar, aVarA));
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        recyclerView.l(new com.avito.android.ui.h(i14, i12, i13, y6.b(16), 7, null), -1);
    }

    @Override // com.avito.android.advert.item.other_categories.g
    public final void B(@k List<CategoryItem> list) {
        this.f77856g.f338510e = new UV0.c(list);
        RecyclerView.Adapter adapter = this.f77855f.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // com.avito.android.advert.item.other_categories.g
    public final void H00(boolean z12) {
        this.f77854e.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.advert.item.other_categories.g
    public final void I6(@k Y41.a<G0> aVar) {
        this.f77852c.setOnClickListener(new n(27, aVar));
    }

    @Override // com.avito.android.advert.item.other_categories.g
    public final void setTitle(@k String str) {
        this.f77853d.setText(str);
    }
}
