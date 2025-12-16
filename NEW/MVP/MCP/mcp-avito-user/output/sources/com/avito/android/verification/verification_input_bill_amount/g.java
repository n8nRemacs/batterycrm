package com.avito.android.verification.verification_input_bill_amount;

import UM0.a;
import Y41.l;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import xM0.C49864d;

/* compiled from: VerificationInputBillAmountView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_input_bill_amount/g;", "", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f325532a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f325533b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f325534c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final NavBar f325535d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Button f325536e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C49864d f325537f;

    /* compiled from: VerificationInputBillAmountView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l<UM0.a, G0> f325538l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super UM0.a, G0> lVar) {
            super(0);
            this.f325538l = lVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f325538l.invoke(a.b.f16354a);
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationInputBillAmountView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<View> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f325539l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(0);
            this.f325539l = view;
        }

        @Override // Y41.a
        public final View invoke() {
            return this.f325539l.findViewById(R.id.verification_input_bill_amount_content_container);
        }
    }

    public g(@Y61.k l lVar, @Y61.k View view, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.avito.konveyor.adapter.j jVar) {
        this.f325532a = jVar;
        this.f325533b = aVar;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.verification_input_bill_amount_list);
        this.f325534c = recyclerView;
        NavBar navBar = (NavBar) view.findViewById(R.id.verification_input_bill_navbar);
        this.f325535d = navBar;
        this.f325536e = (Button) view.findViewById(R.id.verification_input_bill_amount_button);
        C49864d c49864d = new C49864d((ViewGroup) view.findViewById(R.id.verification_input_bill_amount_progress_root), new b(view), 0, 4, null);
        this.f325537f = c49864d;
        c49864d.a(new com.avito.android.seller_promotions.b(26, lVar), new com.avito.android.tariff.cpx.configure.levels.d(29, lVar, this));
        navBar.setState(new com.avito.android.lib.design.nav_bar.a(C35835l0.h(R.attr.ic_close24, view.getContext()), new a(lVar), false, null, null, null, null, 124, null));
        recyclerView.setAdapter(jVar);
        recyclerView.m(new i(this));
    }
}
