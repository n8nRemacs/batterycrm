package com.avito.android.authorization.select_profile;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SelectProfileView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/select_profile/x;", "Lcom/avito/android/authorization/select_profile/w;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class x implements w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f94455a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f94456b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f94457c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f94458d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final View f94459e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final View f94460f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f94461g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f94462h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f94463i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f94464j;

    /* compiled from: SelectProfileView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.jakewharton.rxrelay3.c<G0> cVar = x.this.f94461g;
            G0 g02 = G0.f406611a;
            cVar.accept(g02);
            return g02;
        }
    }

    public x(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.avito.konveyor.a aVar2, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.util.text.a aVar3) {
        this.f94455a = aVar3;
        View viewFindViewById = view.findViewById(R.id.select_profile_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f94456b = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.social_reg_sug_recycler);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.social_reg_sug_error_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f94457c = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.social_reg_sug_button_retry);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f94458d = viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.select_profile_register_button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f94459e = viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.select_profile_login_button);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f94460f = viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.select_profile_nav_bar);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.nav_bar.NavBar");
        }
        NavBar navBar = (NavBar) viewFindViewById7;
        this.f94461g = new com.jakewharton.rxrelay3.c<>();
        TextView textView = (TextView) view.findViewById(R.id.social_reg_sug_title);
        this.f94462h = textView;
        View viewFindViewById8 = view.findViewById(R.id.select_profile_root);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f94463i = new com.avito.android.progress_overlay.l((ViewGroup) viewFindViewById8, R.id.social_reg_sug_recycler, interfaceC28373a, 0, 0, 24, null);
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(aVar, aVar2);
        this.f94464j = jVar;
        jVar.setHasStableIds(true);
        recyclerView.setAdapter(jVar);
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setItemAnimator(null);
        navBar.c(R.attr.ic_close24, new a());
        textView.setText(R.string.registration_title);
    }

    public final void a() {
        this.f94463i.j();
        D6.H(this.f94457c);
    }

    public final void b(@Y61.k PrintableText printableText) {
        this.f94463i.a(printableText.k0(this.f94456b.getContext()));
    }
}
