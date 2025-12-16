package com.avito.android.wallet.page.history.mvi;

import VO0.a;
import VO0.b;
import Y41.l;
import Y61.k;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.user_adverts.root_screen.adverts_host.host_view.g;
import com.avito.android.util.C35835l0;
import com.avito.android.wallet.page.history.mvi.PaymentHistoryFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PaymentHistoryView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/history/mvi/d;", "", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l<VO0.a, G0> f328056a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final WO0.b f328057b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinearLayoutManager f328058c;

    /* renamed from: d, reason: collision with root package name */
    public final SwipeRefreshLayout f328059d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f328060e;

    /* renamed from: f, reason: collision with root package name */
    public final RecyclerView f328061f;

    /* renamed from: g, reason: collision with root package name */
    public final Spinner f328062g;

    /* renamed from: h, reason: collision with root package name */
    public final LinearLayout f328063h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f328064i;

    /* compiled from: PaymentHistoryView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LVO0/b$d;", "operation", "Lkotlin/G0;", "invoke", "(LVO0/b$d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<b.d, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(b.d dVar) {
            ((PaymentHistoryFragment.d) d.this.f328056a).invoke(new a.c(dVar));
            return G0.f406611a;
        }
    }

    /* compiled from: PaymentHistoryView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            d.this.f328056a.invoke(a.e.f17108a);
            return G0.f406611a;
        }
    }

    /* compiled from: PaymentHistoryView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            d.this.f328056a.invoke(a.C1177a.f17104a);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k View view, @k l<? super VO0.a, G0> lVar) {
        this.f328056a = lVar;
        WO0.b bVar = new WO0.b(new b(), new c(), new a());
        this.f328057b = bVar;
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.f328058c = linearLayoutManager;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipe_refresh_layout);
        this.f328059d = swipeRefreshLayout;
        this.f328060e = (TextView) view.findViewById(R.id.empty_view);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.f328061f = recyclerView;
        this.f328062g = (Spinner) view.findViewById(R.id.loading_indicator);
        this.f328063h = (LinearLayout) view.findViewById(R.id.error);
        this.f328064i = (TextView) view.findViewById(R.id.error_text_view);
        Button button = (Button) view.findViewById(R.id.error_refresh_button);
        swipeRefreshLayout.setProgressBackgroundColorSchemeColor(C35835l0.d(R.attr.white, view.getContext()));
        swipeRefreshLayout.setColorSchemeColors(C35835l0.d(R.attr.black, view.getContext()));
        swipeRefreshLayout.setOnRefreshListener(new com.avito.android.str_seller_orders.orders_seller.d(this, 12));
        recyclerView.setAdapter(bVar);
        recyclerView.setLayoutManager(linearLayoutManager);
        button.setOnClickListener(new g(this, 19));
    }
}
