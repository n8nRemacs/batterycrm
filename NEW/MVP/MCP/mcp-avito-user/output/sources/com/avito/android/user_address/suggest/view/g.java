package com.avito.android.user_address.suggest.view;

import Ca1.ViewOnTouchListenerC13234a;
import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.n;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.lib.design.spinner.overlay.SpinnerOverlay;
import com.avito.android.tariff_lf.edit_info.item.button.i;
import com.avito.android.user_address.suggest.h;
import com.avito.android.util.D6;
import com.avito.konveyor.adapter.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UserAddressSuggestView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/suggest/view/g;", "Lcom/avito/android/user_address/suggest/view/c;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f308160a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final j f308161b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f308162c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.user_address.suggest.e f308163d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final SuggestInputViewImpl f308164e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final RecyclerView f308165f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final TextView f308166g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final ShimmerLayout f308167h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final SpinnerOverlay f308168i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final LinearLayout f308169j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final ImageView f308170k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final TextView f308171l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final TextView f308172m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final Button f308173n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f308174o = new io.reactivex.rxjava3.disposables.c();

    public g(@k View view, @k j jVar, @k com.avito.konveyor.adapter.a aVar, @k com.avito.android.user_address.suggest.e eVar) {
        this.f308160a = view;
        this.f308161b = jVar;
        this.f308162c = aVar;
        this.f308163d = eVar;
        View viewFindViewById = view.findViewById(R.id.suggests_search);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.user_address.suggest.view.SuggestInputViewImpl");
        }
        this.f308164e = (SuggestInputViewImpl) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.spinner_overlay);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.spinner.overlay.SpinnerOverlay");
        }
        SpinnerOverlay spinnerOverlay = (SpinnerOverlay) viewFindViewById2;
        this.f308168i = spinnerOverlay;
        D6.w(spinnerOverlay);
        View viewFindViewById3 = view.findViewById(R.id.suggest_list);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
        this.f308165f = recyclerView;
        recyclerView.setAdapter(jVar);
        recyclerView.o(new f(recyclerView));
        D6.H(recyclerView);
        View viewFindViewById4 = view.findViewById(R.id.list_shimmer);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout");
        }
        ShimmerLayout shimmerLayout = (ShimmerLayout) viewFindViewById4;
        this.f308167h = shimmerLayout;
        D6.w(shimmerLayout);
        shimmerLayout.d();
        shimmerLayout.setOnTouchListener(new ViewOnTouchListenerC13234a(shimmerLayout, 16));
        View viewFindViewById5 = view.findViewById(R.id.error_layout);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        LinearLayout linearLayout = (LinearLayout) viewFindViewById5;
        this.f308169j = linearLayout;
        View viewFindViewById6 = linearLayout.findViewById(R.id.error_icon);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f308170k = (ImageView) viewFindViewById6;
        View viewFindViewById7 = linearLayout.findViewById(R.id.error_title);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f308171l = (TextView) viewFindViewById7;
        View viewFindViewById8 = linearLayout.findViewById(R.id.error_subtitle);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f308172m = (TextView) viewFindViewById8;
        View viewFindViewById9 = linearLayout.findViewById(R.id.retry_button);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f308173n = (Button) viewFindViewById9;
        D6.w(this.f308169j);
        View viewFindViewById10 = view.findViewById(R.id.empty_suggest_disclaimer);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById10;
        this.f308166g = textView;
        D6.w(textView);
    }

    public final void a(@k h hVar) {
        SuggestInputViewImpl suggestInputViewImpl = this.f308164e;
        if (suggestInputViewImpl != null) {
            this.f308174o.b(n.e(suggestInputViewImpl.f308155b).d0(b.f308156b).I(d.f308157b).t0(new e(hVar)));
            D6.H(suggestInputViewImpl);
            suggestInputViewImpl.requestFocus();
        }
        Button button = this.f308173n;
        if (button != null) {
            button.setOnClickListener(new i(hVar, 24));
        }
    }
}
