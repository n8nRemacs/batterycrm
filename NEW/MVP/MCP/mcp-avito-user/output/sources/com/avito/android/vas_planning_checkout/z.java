package com.avito.android.vas_planning_checkout;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC23040h0;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.internal.operators.observable.S;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: VasPlanCheckoutView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_checkout/z;", "Lcom/avito/android/vas_planning_checkout/j;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class z implements InterfaceC36089j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f323031a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f323032b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final VasPlanCheckoutFragment f323033c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Resources f323034d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final A f323035e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C36084e f323036f;

    /* renamed from: g, reason: collision with root package name */
    public final RecyclerView f323037g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.progress_overlay.l f323038h;

    /* renamed from: i, reason: collision with root package name */
    public final Button f323039i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewGroup f323040j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final MenuItem f323041k;

    /* compiled from: VasPlanCheckoutView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC23040h0, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f323042b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l lVar) {
            this.f323042b = (N) lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof kotlin.jvm.internal.D)) {
                return this.f323042b.equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f323042b;
        }

        public final int hashCode() {
            return this.f323042b.hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f323042b.invoke(obj);
        }
    }

    public z(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k VasPlanCheckoutFragment vasPlanCheckoutFragment, @Y61.k VasPlanCheckoutFragment vasPlanCheckoutFragment2, @Y61.k Resources resources, @Y61.k VasPlanCheckoutFragmentArgument vasPlanCheckoutFragmentArgument, @Y61.k A a12, @Y61.k C36084e c36084e) {
        this.f323031a = view;
        this.f323032b = aVar;
        this.f323033c = vasPlanCheckoutFragment2;
        this.f323034d = resources;
        this.f323035e = a12;
        this.f323036f = c36084e;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.f323037g = recyclerView;
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.progress_placeholder);
        Button button = (Button) view.findViewById(R.id.continue_button);
        this.f323039i = button;
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.container);
        this.f323040j = viewGroup2;
        io.reactivex.rxjava3.disposables.d.E(io.reactivex.rxjava3.internal.functions.a.f401992b);
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(viewGroup, R.id.recycler_view, null, 0, 0, 28, null);
        this.f323038h = lVar;
        lVar.f231600j = new m(this);
        if (vasPlanCheckoutFragmentArgument.f322817e) {
            toolbar.setNavigationIcon(C35835l0.h(R.attr.ic_close24, view.getContext()));
            Drawable navigationIcon = toolbar.getNavigationIcon();
            if (navigationIcon != null) {
                navigationIcon.setTintList(C35835l0.e(R.attr.black, view.getContext()));
            }
            final int i12 = 1;
            toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.vas_planning_checkout.k

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ z f323004c;

                {
                    this.f323004c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i12) {
                        case 0:
                            this.f323004c.f323035e.L8();
                            break;
                        case 1:
                            this.f323004c.f323033c.q5();
                            break;
                        default:
                            this.f323004c.f323035e.S6();
                            break;
                    }
                }
            });
        } else {
            toolbar.setNavigationIcon(C35835l0.h(R.attr.ic_arrowBack24, view.getContext()));
            Drawable navigationIcon2 = toolbar.getNavigationIcon();
            if (navigationIcon2 != null) {
                navigationIcon2.setTintList(C35835l0.e(R.attr.black, view.getContext()));
            }
            final int i13 = 2;
            toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.vas_planning_checkout.k

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ z f323004c;

                {
                    this.f323004c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i13) {
                        case 0:
                            this.f323004c.f323035e.L8();
                            break;
                        case 1:
                            this.f323004c.f323033c.q5();
                            break;
                        default:
                            this.f323004c.f323035e.S6();
                            break;
                    }
                }
            });
            toolbar.m(R.menu.menu_vas_planning_checkout);
            MenuItem menuItemFindItem = toolbar.getMenu().findItem(R.id.menu_close);
            com.avito.android.ui.d.a(menuItemFindItem, new com.avito.android.advert.notes.x(this, 4));
            this.f323041k = menuItemFindItem;
            menuItemFindItem.setVisible(false);
        }
        a12.g0().observe(vasPlanCheckoutFragment, new a(new t(this)));
        final int i14 = 0;
        a12.q0().observe(vasPlanCheckoutFragment, new InterfaceC23040h0(this) { // from class: com.avito.android.vas_planning_checkout.l

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ z f323006c;

            {
                this.f323006c = this;
            }

            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                MenuItem menuItem;
                switch (i14) {
                    case 0:
                        String str = (String) obj;
                        if (str != null) {
                            this.f323006c.f323039i.setText(str);
                            break;
                        }
                        break;
                    case 1:
                        String str2 = (String) obj;
                        if (str2 != null && (menuItem = this.f323006c.f323041k) != null) {
                            if (str2.length() != 0) {
                                menuItem.setVisible(true);
                                menuItem.setTitle(str2);
                                break;
                            } else {
                                menuItem.setVisible(false);
                                break;
                            }
                        }
                        break;
                    default:
                        J j12 = (J) obj;
                        if (j12 != null) {
                            UV0.c cVar = new UV0.c(j12.f322800a);
                            z zVar = this.f323006c;
                            zVar.f323032b.c(cVar);
                            RecyclerView.Adapter adapter = zVar.f323037g.getAdapter();
                            if (adapter != null) {
                                j12.f322801b.b(adapter);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        final int i15 = 1;
        a12.I7().observe(vasPlanCheckoutFragment, new InterfaceC23040h0(this) { // from class: com.avito.android.vas_planning_checkout.l

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ z f323006c;

            {
                this.f323006c = this;
            }

            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                MenuItem menuItem;
                switch (i15) {
                    case 0:
                        String str = (String) obj;
                        if (str != null) {
                            this.f323006c.f323039i.setText(str);
                            break;
                        }
                        break;
                    case 1:
                        String str2 = (String) obj;
                        if (str2 != null && (menuItem = this.f323006c.f323041k) != null) {
                            if (str2.length() != 0) {
                                menuItem.setVisible(true);
                                menuItem.setTitle(str2);
                                break;
                            } else {
                                menuItem.setVisible(false);
                                break;
                            }
                        }
                        break;
                    default:
                        J j12 = (J) obj;
                        if (j12 != null) {
                            UV0.c cVar = new UV0.c(j12.f322800a);
                            z zVar = this.f323006c;
                            zVar.f323032b.c(cVar);
                            RecyclerView.Adapter adapter = zVar.f323037g.getAdapter();
                            if (adapter != null) {
                                j12.f322801b.b(adapter);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        final int i16 = 2;
        a12.n0().observe(vasPlanCheckoutFragment, new InterfaceC23040h0(this) { // from class: com.avito.android.vas_planning_checkout.l

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ z f323006c;

            {
                this.f323006c = this;
            }

            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                MenuItem menuItem;
                switch (i16) {
                    case 0:
                        String str = (String) obj;
                        if (str != null) {
                            this.f323006c.f323039i.setText(str);
                            break;
                        }
                        break;
                    case 1:
                        String str2 = (String) obj;
                        if (str2 != null && (menuItem = this.f323006c.f323041k) != null) {
                            if (str2.length() != 0) {
                                menuItem.setVisible(true);
                                menuItem.setTitle(str2);
                                break;
                            } else {
                                menuItem.setVisible(false);
                                break;
                            }
                        }
                        break;
                    default:
                        J j12 = (J) obj;
                        if (j12 != null) {
                            UV0.c cVar = new UV0.c(j12.f322800a);
                            z zVar = this.f323006c;
                            zVar.f323032b.c(cVar);
                            RecyclerView.Adapter adapter = zVar.f323037g.getAdapter();
                            if (adapter != null) {
                                j12.f322801b.b(adapter);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        a12.k0().observe(vasPlanCheckoutFragment, new a(new u(this)));
        a12.O4().observe(vasPlanCheckoutFragment, new a(new v(this)));
        a12.Fc().observe(vasPlanCheckoutFragment, new a(new w(this)));
        a12.xc().observe(vasPlanCheckoutFragment, new a(new x(this)));
        a12.x1().observe(vasPlanCheckoutFragment, new a(new y(this)));
        a12.N5().observe(vasPlanCheckoutFragment, new a(new s(this)));
        recyclerView.setAdapter(jVar);
        final int i17 = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.vas_planning_checkout.k

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ z f323004c;

            {
                this.f323004c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        this.f323004c.f323035e.L8();
                        break;
                    case 1:
                        this.f323004c.f323033c.q5();
                        break;
                    default:
                        this.f323004c.f323035e.S6();
                        break;
                }
            }
        });
        new S(C37722i.f(viewGroup2).d0(new n(this)).N(o.f323020b)).j(new p(this)).n(new q(this), new r(this), io.reactivex.rxjava3.internal.functions.a.f401993c);
    }
}
