package com.avito.android.loyalty.ui.quality_service;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.loyalty.ui.quality_service.items.Content;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PopupBottomSheet.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/d;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final Content f183797E;

    /* renamed from: F, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f183798F;

    /* renamed from: G, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f183799G;

    /* renamed from: H, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f183800H;

    /* renamed from: I, reason: collision with root package name */
    public TextView f183801I;

    /* renamed from: J, reason: collision with root package name */
    public RecyclerView f183802J;

    /* compiled from: PopupBottomSheet.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<View, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            View viewFindViewById = view2.findViewById(R.id.popup_title);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            d dVar = d.this;
            dVar.f183801I = (TextView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.popup_recycler);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            }
            dVar.f183802J = (RecyclerView) viewFindViewById2;
            TextView textView = dVar.f183801I;
            if (textView == null) {
                textView = null;
            }
            Content content = dVar.f183797E;
            String str = content.f183807b;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
            RecyclerView recyclerView = dVar.f183802J;
            if (recyclerView == null) {
                recyclerView = null;
            }
            com.avito.konveyor.adapter.j jVar = dVar.f183798F;
            if (jVar == null) {
                jVar = null;
            }
            recyclerView.setAdapter(jVar);
            com.avito.konveyor.adapter.a aVar = dVar.f183799G;
            com.avito.konveyor.adapter.a aVar2 = aVar != null ? aVar : null;
            List list = content.f183808c;
            if (list == null) {
                list = C42784z0.f406748b;
            }
            com.avito.konveyor.util.a.a(aVar2, list);
            return G0.f406611a;
        }
    }

    public d(@Y61.k androidx.appcompat.app.m mVar, @Y61.k Content content) {
        super(mVar, 0, 2, null);
        this.f183797E = content;
        com.avito.android.loyalty.di.quality_service.b.a().a(new com.avito.android.cpt.pre_activation.ui.c(this, 20), cv.c.a(mVar)).a(this);
        C(R.layout.bottom_sheet_popup, new a());
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
    }
}
