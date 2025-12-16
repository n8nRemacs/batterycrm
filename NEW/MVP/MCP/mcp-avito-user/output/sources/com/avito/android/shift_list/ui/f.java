package com.avito.android.shift_list.ui;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.util.C35835l0;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ShiftListRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/shift_list/ui/f;", "", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.d f281098a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Y41.a<G0> f281099b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f281100c;

    /* renamed from: d, reason: collision with root package name */
    public final ShimmerLayout f281101d;

    /* renamed from: e, reason: collision with root package name */
    public final View f281102e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f281103f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SwipeRefreshLayout f281104g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final List<View> f281105h;

    /* compiled from: ShiftListRenderer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Boolean> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            return Boolean.valueOf(f.this.f281103f);
        }
    }

    /* compiled from: ShiftListRenderer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            f fVar = f.this;
            fVar.f281103f = false;
            fVar.f281099b.invoke();
            return G0.f406611a;
        }
    }

    public f(@k View view, @k com.avito.konveyor.adapter.d dVar, @k Y41.a<G0> aVar, @k Y41.a<G0> aVar2, @k Y41.a<G0> aVar3, @k RecyclerView.l lVar) {
        this.f281098a = dVar;
        this.f281099b = aVar3;
        NavBar navBar = (NavBar) view.findViewById(R.id.navbar);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.content_list);
        this.f281100c = recyclerView;
        this.f281101d = (ShimmerLayout) view.findViewById(R.id.loading);
        ImageView imageView = (ImageView) view.findViewById(R.id.error_logo);
        TextView textView = (TextView) view.findViewById(R.id.error_title);
        TextView textView2 = (TextView) view.findViewById(R.id.error_subtitle);
        Button button = (Button) view.findViewById(R.id.refresh_button);
        View viewFindViewById = view.findViewById(R.id.error_divider);
        this.f281102e = viewFindViewById;
        defpackage.e eVar = new defpackage.e(new a(), new b());
        this.f281103f = true;
        View viewFindViewById2 = view.findViewById(R.id.swipe_refresh_layout);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewFindViewById2;
        swipeRefreshLayout.setOnRefreshListener(new com.avito.android.advert.item.beduin.v2.di.b(4, aVar2));
        this.f281104g = swipeRefreshLayout;
        this.f281105h = C42745f0.U(imageView, textView, textView2, button, viewFindViewById);
        navBar.setState(new com.avito.android.lib.design.nav_bar.a(C35835l0.h(R.attr.ic_arrowBack24, view.getContext()), aVar, false, view.getResources().getString(R.string.shift_list_title), null, null, null, 116, null));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(dVar);
        recyclerView.l(lVar, -1);
        recyclerView.o(eVar);
        imageView.setImageResource(R.drawable.placeholders_img_general_error);
        textView.setText(view.getResources().getString(R.string.shift_list_error_title));
        textView2.setText(view.getResources().getString(R.string.shift_list_error_subtitle));
        com.avito.android.lib.design.button.b.a(button, view.getResources().getString(R.string.shift_list_error_button_text), false);
        button.setOnClickListener(new com.avito.android.service_booking_common.blueprints.geo_reference.g(15, aVar2));
    }
}
