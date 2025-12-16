package com.avito.android.vas_planning;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.ActivityC22955m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC23040h0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.mnz_common.ui.ActionFloatingFooter;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import w50.InterfaceC49447a;
import xZ.C49899a;

/* compiled from: VasPlanningView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning/o;", "Lcom/avito/android/vas_planning/g;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class o implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f322446a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f322447b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final VasPlanningFragment f322448c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Resources f322449d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final VasPlanningFragmentArgument f322450e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final q f322451f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f322452g;

    /* renamed from: h, reason: collision with root package name */
    public final RecyclerView f322453h;

    /* renamed from: i, reason: collision with root package name */
    public final ActionFloatingFooter f322454i;

    /* renamed from: j, reason: collision with root package name */
    public final com.avito.android.progress_overlay.l f322455j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public C49899a f322456k;

    /* compiled from: VasPlanningView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f322457b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l lVar) {
            this.f322457b = (N) lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return this.f322457b.equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f322457b;
        }

        public final int hashCode() {
            return this.f322457b.hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f322457b.invoke(obj);
        }
    }

    public o(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k VasPlanningFragment vasPlanningFragment, @Y61.k com.avito.konveyor.a aVar2, @Y61.k VasPlanningFragment vasPlanningFragment2, @Y61.k Resources resources, @Y61.k VasPlanningFragmentArgument vasPlanningFragmentArgument, @Y61.k q qVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        Drawable drawableH;
        this.f322446a = view;
        this.f322447b = aVar;
        this.f322448c = vasPlanningFragment2;
        this.f322449d = resources;
        this.f322450e = vasPlanningFragmentArgument;
        this.f322451f = qVar;
        this.f322452g = interfaceC28373a;
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.f322453h = recyclerView;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.placeholder);
        ActionFloatingFooter actionFloatingFooter = (ActionFloatingFooter) view.findViewById(R.id.action_floating_footer);
        this.f322454i = actionFloatingFooter;
        if (vasPlanningFragmentArgument.f322198e) {
            if (toolbar != null) {
                final int i12 = 0;
                toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.vas_planning.h

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ o f322366c;

                    {
                        this.f322366c = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i12) {
                            case 0:
                                InterfaceC49447a interfaceC49447a = this.f322366c.f322448c.f322188v0;
                                if (interfaceC49447a != null) {
                                    interfaceC49447a.r1();
                                    break;
                                }
                                break;
                            default:
                                ActivityC22955m activityC22955mL1 = this.f322366c.f322448c.l1();
                                if (activityC22955mL1 != null) {
                                    activityC22955mL1.onBackPressed();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            drawableH = C35835l0.h(R.attr.ic_close24, view.getContext());
        } else {
            if (toolbar != null) {
                final int i13 = 1;
                toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.vas_planning.h

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ o f322366c;

                    {
                        this.f322366c = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i13) {
                            case 0:
                                InterfaceC49447a interfaceC49447a = this.f322366c.f322448c.f322188v0;
                                if (interfaceC49447a != null) {
                                    interfaceC49447a.r1();
                                    break;
                                }
                                break;
                            default:
                                ActivityC22955m activityC22955mL1 = this.f322366c.f322448c.l1();
                                if (activityC22955mL1 != null) {
                                    activityC22955mL1.onBackPressed();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            drawableH = C35835l0.h(R.attr.ic_arrowBack24, view.getContext());
        }
        if (drawableH != null) {
            drawableH.setTint(C35835l0.d(R.attr.black, view.getContext()));
        }
        toolbar.setNavigationIcon(drawableH);
        if (recyclerView != null) {
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            recyclerView.setAdapter(jVar);
            recyclerView.setItemAnimator(null);
            recyclerView.l(new f(recyclerView.getResources(), aVar2), -1);
        }
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(viewGroup, R.id.recycler_view, interfaceC28373a, 0, 0, 24, null);
        this.f322455j = lVar;
        lVar.f231600j = new p(this);
        actionFloatingFooter.addOnLayoutChangeListener(new com.avito.android.util.bottom_gap.a(this, 1));
        qVar.getF322526O().observe(vasPlanningFragment, new a(new k(this)));
        qVar.getF322528Q().observe(vasPlanningFragment, new a(new l(this)));
        qVar.getF322529R().observe(vasPlanningFragment, new a(new m(this)));
        qVar.getF322527P().observe(vasPlanningFragment, new a(new n(this)));
        com.avito.android.progress_overlay.l lVar2 = this.f322455j;
        (lVar2 == null ? null : lVar2).k(null);
        D6.w(actionFloatingFooter);
    }

    public final void a(ApiError apiError, String str, Throwable th2) {
        b();
        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
        PrintableText printableTextF = com.avito.android.printable_text.b.f(str == null ? this.f322449d.getString(R.string.something_went_wrong) : str);
        f.c.f125255c.getClass();
        com.avito.android.component.toast.c.b(cVar, this.f322446a, printableTextF, null, null, null, f.c.a.a(apiError, th2), 0, ToastBarPosition.f181046d, null, false, false, null, null, 4014);
    }

    public final void b() {
        com.avito.android.progress_overlay.l lVar = this.f322455j;
        if (lVar == null) {
            lVar = null;
        }
        lVar.j();
        D6.H(this.f322454i);
    }
}
