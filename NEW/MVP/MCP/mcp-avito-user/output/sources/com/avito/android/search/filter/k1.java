package com.avito.android.search.filter;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.lib.deprecated_design.ColoredProgressBar;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.nav_bar.a;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import java.io.Serializable;
import java.util.Collections;
import kotlin.Metadata;

/* compiled from: FiltersViewImpl.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/k1;", "Lcom/avito/android/search/filter/e1;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k1 implements InterfaceC34567e1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f263369a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f263370b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f263371c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final A1 f263372d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final View f263373e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Button f263374f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Button f263375g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f263376h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final o1 f263377i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Handler f263378j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f263379k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public com.avito.android.search.filter.adapter.h f263380l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e<kotlin.G0> f263381m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e<kotlin.G0> f263382n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e<kotlin.G0> f263383o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e<kotlin.G0> f263384p;

    public k1(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f263369a = view;
        this.f263370b = jVar;
        View viewFindViewById = view.findViewById(R.id.recycler_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f263371c = recyclerView;
        View viewFindViewById2 = view.findViewById(R.id.navbar);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.nav_bar.NavBar");
        }
        NavBar navBar = (NavBar) viewFindViewById2;
        this.f263372d = new A1(view, interfaceC28373a);
        View viewFindViewById3 = view.findViewById(R.id.progress);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f263373e = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.counter_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById4;
        this.f263374f = button;
        View viewFindViewById5 = view.findViewById(R.id.map_button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button2 = (Button) viewFindViewById5;
        this.f263375g = button2;
        View viewFindViewById6 = view.findViewById(R.id.bottom_container);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f263376h = (ViewGroup) viewFindViewById6;
        this.f263378j = new Handler(Looper.getMainLooper());
        this.f263381m = new io.reactivex.rxjava3.subjects.e<>();
        this.f263382n = new io.reactivex.rxjava3.subjects.e<>();
        this.f263383o = new io.reactivex.rxjava3.subjects.e<>();
        this.f263384p = new io.reactivex.rxjava3.subjects.e<>();
        ((ColoredProgressBar) view.findViewById(R.id.progress_view)).setIndeterminateTintList(C35835l0.e(R.attr.black, view.getContext()));
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setItemAnimator(null);
        this.f263377i = new o1(view.getRootView(), new h1(this));
        final int i12 = 0;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.search.filter.f1

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k1 f263298c;

            {
                this.f263298c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f263298c.f263382n.onNext(kotlin.G0.f406611a);
                        break;
                    default:
                        this.f263298c.f263381m.onNext(kotlin.G0.f406611a);
                        break;
                }
            }
        });
        final int i13 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.search.filter.f1

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k1 f263298c;

            {
                this.f263298c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f263298c.f263382n.onNext(kotlin.G0.f406611a);
                        break;
                    default:
                        this.f263298c.f263381m.onNext(kotlin.G0.f406611a);
                        break;
                }
            }
        });
        String string = view.getContext().getString(R.string.filters);
        navBar.setState(new com.avito.android.lib.design.nav_bar.a(C35835l0.h(R.attr.ic_close24, view.getContext()), new i1(this), false, string, null, Collections.singletonList(new a.c(com.avito.android.printable_text.b.c(R.string.button_dismiss, new Serializable[0]), 0, 0, 6, null)), new j1(this), 20, null));
    }

    public final void a() {
        K2.d(this.f263369a, true);
    }

    public final void b() {
        Button button = this.f263375g;
        if (D6.y(button)) {
            button.setLoading(false);
        }
        this.f263374f.setLoading(false);
    }

    public final void c(int i12) {
        this.f263371c.A0(i12);
    }

    public final void d(@Y61.k String str) {
        this.f263374f.setText(str);
    }

    public final void e(boolean z12) {
        this.f263379k = z12;
        D6.G(this.f263375g, z12);
    }

    public final void f(boolean z12) {
        this.f263374f.setEnabled(z12);
    }

    public final void g(@Y61.k ApiError apiError) {
        this.f263372d.b(apiError);
        D6.w(this.f263373e);
    }
}
