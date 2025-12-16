package com.avito.android.onboarding.dialog.view.carousel;

import SV.b;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.view.C22823h0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.page_indicator_re23.PageIndicatorRe23;
import com.avito.android.messenger.channels.mvi.view.ViewOnClickListenerC31873b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: OnboardingCarouselView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/onboarding/dialog/view/carousel/o;", "Lcom/avito/android/onboarding/dialog/view/carousel/i;", "LSV/b$a;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class o implements i, b.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f209008a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final D40.a f209009b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f209010c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.l<C40.a, G0> f209011d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f209012e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f209013f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final PageIndicatorRe23 f209014g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Button f209015h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final SV.b f209016i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Integer, G0> f209017j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.util.recycler_wrap_height_calculator.c f209018k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.m f209019l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f209020m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final LinearLayoutManager f209021n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public Y41.p<? super String, ? super Integer, G0> f209022o;

    /* JADX WARN: Multi-variable type inference failed */
    public o(@Y61.k View view, @Y61.k D40.a aVar, boolean z12, @Y61.k Y41.l<? super C40.a, G0> lVar) {
        this.f209008a = view;
        this.f209009b = aVar;
        this.f209010c = z12;
        this.f209011d = lVar;
        this.f209012e = (ViewGroup) view.findViewById(R.id.carousel_container);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.content);
        this.f209013f = recyclerView;
        this.f209014g = (PageIndicatorRe23) view.findViewById(R.id.content_indicator);
        ImageView imageView = (ImageView) view.findViewById(R.id.close_button);
        View viewFindViewById = view.findViewById(R.id.button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f209015h = (Button) viewFindViewById;
        this.f209018k = new com.avito.android.lib.util.recycler_wrap_height_calculator.c();
        this.f209020m = view.getContext().getResources().getBoolean(R.bool.is_tablet);
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.f209021n = linearLayoutManager;
        recyclerView.setAdapter(aVar);
        recyclerView.setLayoutManager(linearLayoutManager);
        SV.b bVar = new SV.b(0, this, 1, null);
        SV.b bVar2 = this.f209016i;
        if (bVar2 != null) {
            bVar2.b(null);
        }
        recyclerView.setOnFlingListener(null);
        recyclerView.s();
        bVar.b(recyclerView);
        this.f209016i = bVar;
        imageView.setOnClickListener(new ViewOnClickListenerC31873b(this, 27));
        C22823h0.J(recyclerView, false);
    }

    @Override // SV.b.a
    public final void a(int i12) {
        Y41.l<? super Integer, G0> lVar = this.f209017j;
        if (lVar != null) {
            ((n) lVar).invoke(Integer.valueOf(i12));
        }
    }

    public /* synthetic */ o(View view, D40.a aVar, boolean z12, Y41.l lVar, int i12, C42822w c42822w) {
        this(view, aVar, (i12 & 4) != 0 ? false : z12, lVar);
    }
}
