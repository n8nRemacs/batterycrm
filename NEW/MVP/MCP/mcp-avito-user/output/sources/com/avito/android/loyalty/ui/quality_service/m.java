package com.avito.android.loyalty.ui.quality_service;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.util.y6;
import kd0.C42670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import nX.C44347b;
import nX.C44348c;
import pX.InterfaceC47025a;

/* compiled from: QualityServiceView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/m;", "", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f183969a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f183970b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC47025a, G0> f183971c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f183972d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C42670a f183973e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Button f183974f;

    /* compiled from: QualityServiceView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f183975l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f183975l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f183975l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: QualityServiceView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<View> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            return m.this.f183972d;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.d dVar, @Y61.k Y41.l<? super InterfaceC47025a, G0> lVar, @Y61.k Y41.a<G0> aVar) {
        this.f183969a = view;
        this.f183970b = dVar;
        this.f183971c = lVar;
        NavBar navBar = (NavBar) view.findViewById(R.id.quality_service_navbar);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.quality_service_list);
        this.f183972d = recyclerView;
        C42670a c42670a = new C42670a((ViewGroup) view.findViewById(R.id.quality_service_content), new b(), 0, 4, null);
        this.f183973e = c42670a;
        Button button = new Button(view.getContext(), null, 0, 0, 14, null);
        button.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        button.setAppearanceFromAttr(R.attr.buttonSecondarySmall);
        button.setText(R.string.quality_service_criteria_action);
        this.f183974f = button;
        recyclerView.setAdapter(dVar);
        recyclerView.l(new PV.a(0, y6.b(16), 0, 0, 12, null), -1);
        recyclerView.l(new C44347b(), -1);
        recyclerView.l(new C44348c(), -1);
        recyclerView.l(new nX.e(), -1);
        recyclerView.l(new nX.d(), -1);
        navBar.c(R.attr.ic_arrowBack24, new a(aVar));
        navBar.setActions(button);
        c42670a.a(new com.avito.android.imv_similiar_adverts.h(this, 23));
    }
}
