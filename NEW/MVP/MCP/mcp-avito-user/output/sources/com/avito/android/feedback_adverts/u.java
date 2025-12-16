package com.avito.android.feedback_adverts;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.C35994v1;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.feedback_adverts.o;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.util.C35971x;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: FeedbackAdvertsView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/feedback_adverts/u;", "Lcom/avito/android/feedback_adverts/t;", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class u implements t {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f157896r = {m0.f406844a.f(new a0("lastRenderedState", "getLastRenderedState(Lcom/avito/android/mvi/RendererWithDiff;)Lcom/avito/android/feedback_adverts/FeedbackAdvertsPresenter$State;", u.class))};

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f157897b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.a f157898c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f157899d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f157900e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Input f157901f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final View f157902g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f157903h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final TextView f157904i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final B0 f157905j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f157906k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f157907l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f157908m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f157909n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final Object f157910o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final C35994v1 f157911p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final C35971x f157912q;

    /* compiled from: FeedbackAdvertsView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.jakewharton.rxrelay3.c cVar = u.this.f157909n;
            G0 g02 = G0.f406611a;
            cVar.accept(g02);
            return g02;
        }
    }

    /* compiled from: FeedbackAdvertsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.jakewharton.rxrelay3.c cVar = u.this.f157908m;
            G0 g02 = G0.f406611a;
            cVar.accept(g02);
            return g02;
        }
    }

    /* compiled from: FeedbackAdvertsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/konveyor/adapter/j;", "invoke", "()Lcom/avito/konveyor/adapter/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<com.avito.konveyor.adapter.j> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.konveyor.adapter.j invoke() {
            u uVar = u.this;
            com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(uVar.f157897b, uVar.f157898c);
            uVar.f157900e.setAdapter(jVar);
            return jVar;
        }
    }

    /* compiled from: FeedbackAdvertsView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.jakewharton.rxrelay3.c cVar = u.this.f157907l;
            G0 g02 = G0.f406611a;
            cVar.accept(g02);
            return g02;
        }
    }

    /* compiled from: FeedbackAdvertsView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final e<T, R> f157917b = new e<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((CharSequence) obj).toString();
        }
    }

    public u(@Y61.k ViewGroup viewGroup, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.avito.konveyor.a aVar2, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f157897b = aVar;
        this.f157898c = aVar2;
        viewGroup.getContext();
        View viewFindViewById = viewGroup.findViewById(R.id.content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(viewGroup2, R.id.search_field, interfaceC28373a, 0, 0, 24, null);
        this.f157899d = lVar;
        NavBar navBar = (NavBar) viewGroup.findViewById(R.id.navbar);
        View viewFindViewById2 = viewGroup.findViewById(R.id.recycler);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        this.f157900e = recyclerView;
        View viewFindViewById3 = viewGroup.findViewById(R.id.search_field);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById3;
        this.f157901f = input;
        View viewFindViewById4 = viewGroup.findViewById(R.id.message_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f157902g = viewFindViewById4;
        View viewFindViewById5 = viewGroup.findViewById(R.id.message);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f157903h = (TextView) viewFindViewById5;
        this.f157904i = (TextView) viewGroup.findViewById(R.id.message_description);
        this.f157905j = com.avito.android.lib.design.input.n.e(input).N0().d0(e.f157917b);
        this.f157906k = new com.jakewharton.rxrelay3.c();
        this.f157907l = new com.jakewharton.rxrelay3.c();
        this.f157908m = new com.jakewharton.rxrelay3.c();
        this.f157909n = new com.jakewharton.rxrelay3.c();
        this.f157910o = C42727D.b(LazyThreadSafetyMode.f406616d, new c());
        C35994v1 c35994v1 = new C35994v1(linearLayoutManager, new d());
        this.f157911p = c35994v1;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.o(c35994v1);
        lVar.f231600j = new a();
        if (navBar != null) {
            NavBar.e(navBar, viewGroup.getContext().getString(R.string.messenger_feedback_advert_title), 0, 6);
            navBar.c(R.attr.ic_close24, new b());
        }
        this.f157912q = new C35971x();
    }

    @Override // com.avito.android.mvi.g
    public final Object c() {
        kotlin.reflect.n<Object> nVar = f157896r[0];
        return (o.b) this.f157912q.f319122b;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Type inference failed for: r11v3, types: [T, com.avito.android.feedback_adverts.o$b] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.mvi.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(com.avito.android.feedback_adverts.o.b r11, androidx.recyclerview.widget.C23424o.e r12) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.feedback_adverts.u.h(java.lang.Object, androidx.recyclerview.widget.o$e):void");
    }
}
