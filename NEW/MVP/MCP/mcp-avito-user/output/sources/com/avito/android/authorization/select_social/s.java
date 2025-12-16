package com.avito.android.authorization.select_social;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SelectSocialView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/select_social/s;", "Lcom/avito/android/authorization/select_social/r;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class s implements r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f94573a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f94574b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f94575c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f94576d;

    /* compiled from: SelectSocialView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.jakewharton.rxrelay3.c<G0> cVar = s.this.f94575c;
            G0 g02 = G0.f406611a;
            cVar.accept(g02);
            return g02;
        }
    }

    public s(@Y61.k View view, @Y61.k com.avito.konveyor.a aVar, @Y61.k com.avito.konveyor.adapter.a aVar2) {
        this.f94573a = view;
        View viewFindViewById = view.findViewById(R.id.select_social_progress);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f94574b = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.select_social_recycler);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.select_social_nav_bar);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.nav_bar.NavBar");
        }
        this.f94575c = new com.jakewharton.rxrelay3.c<>();
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(aVar2, aVar);
        this.f94576d = jVar;
        jVar.setHasStableIds(true);
        recyclerView.setAdapter(jVar);
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setItemAnimator(null);
        ((NavBar) viewFindViewById3).c(R.attr.ic_arrowBack24, new a());
    }

    public final void a() {
        D6.w(this.f94574b);
    }

    public final void b(@Y61.k PrintableText printableText) {
        com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, this.f94573a, printableText, null, null, null, null, 0, null, null, false, false, null, null, 4094);
    }

    public final void c() {
        D6.H(this.f94574b);
    }
}
