package com.avito.android.authorization.select_profile.social_login;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.util.D6;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SocialRegistrationSuggestsView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/select_profile/social_login/p;", "Lcom/avito/android/authorization/select_profile/social_login/o;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f94433a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f94434b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f94435c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f94436d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f94437e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final View f94438f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final View f94439g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Context f94440h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f94441i;

    /* compiled from: SocialRegistrationSuggestsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.jakewharton.rxrelay3.c<G0> cVar = p.this.f94437e;
            G0 g02 = G0.f406611a;
            cVar.accept(g02);
            return g02;
        }
    }

    public p(@Y61.k ViewGroup viewGroup, @Y61.k com.avito.konveyor.a aVar, @Y61.k com.avito.konveyor.adapter.a aVar2) {
        this.f94433a = viewGroup;
        View viewFindViewById = viewGroup.findViewById(R.id.social_reg_sug_recycler);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f94434b = (TextView) viewGroup.findViewById(R.id.social_reg_sug_title);
        this.f94435c = viewGroup.findViewById(R.id.social_reg_sug_progress);
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(aVar2, aVar);
        this.f94436d = jVar;
        View viewFindViewById2 = viewGroup.findViewById(R.id.select_profile_nav_bar);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.nav_bar.NavBar");
        }
        NavBar navBar = (NavBar) viewFindViewById2;
        com.jakewharton.rxrelay3.c<G0> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f94437e = cVar;
        View viewFindViewById3 = viewGroup.findViewById(R.id.select_profile_register_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f94438f = viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.select_profile_login_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f94439g = viewFindViewById4;
        navBar.c(R.attr.ic_close24, new a());
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(jVar);
        this.f94440h = viewGroup.getContext();
        this.f94441i = new C41981q0(cVar);
    }

    public final void a() {
        D6.w(this.f94435c);
    }

    public final void b(@Y61.k String str) {
        com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, this.f94433a, com.avito.android.printable_text.b.f(str), null, null, null, null, 0, null, null, false, false, null, null, 4094);
    }

    public final void c() {
        D6.H(this.f94435c);
    }
}
