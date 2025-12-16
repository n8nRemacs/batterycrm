package M81;

import A91.p;
import Y61.k;
import Y61.l;
import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.radio_button.lifecycle_view.LifecycleView;
import com.avito.android.util.C35766c3;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.H5;
import com.avito.android.util.Kundle;
import hw.InterfaceC41177b;
import io.reactivex.rxjava3.core.z;
import j.InterfaceC42150f;
import j.InterfaceC42156l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;

/* compiled from: AppBar.kt */
@InterfaceC41177b
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LM81/c;", "LM81/b;", "LMU/c;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class c implements b, MU.c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<Integer> f10413b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Context f10414c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Toolbar f10415d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final View f10416e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ViewGroup f10417f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final N81.e f10418g;

    /* renamed from: h, reason: collision with root package name */
    @InterfaceC42156l
    public int f10419h;

    public c(@k View view, @l View view2, boolean z12) {
        this.f10413b = new com.jakewharton.rxrelay3.c<>();
        this.f10414c = view.getContext();
        View viewFindViewById = view.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById;
        this.f10415d = toolbar;
        View viewFindViewById2 = view.findViewById(R.id.shadow);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f10416e = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.toolbar_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3;
        this.f10417f = viewGroup;
        View viewFindViewById4 = view.findViewById(R.id.lifecycle);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.deprecated_design.radio_button.lifecycle_view.LifecycleView");
        }
        LifecycleView lifecycleView = (LifecycleView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.icon);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f10419h = C35835l0.d(R.attr.blue, view.getContext());
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(250L);
        layoutTransition.setStartDelay(2, 0L);
        viewGroup.setLayoutTransition(layoutTransition);
        lifecycleView.setStateListener(this);
        if (view2 instanceof RecyclerView) {
            N81.c cVar = new N81.c(viewGroup, toolbar, viewFindViewById2, z12);
            ((RecyclerView) view2).o(cVar);
            this.f10418g = cVar;
        } else if (view2 instanceof ScrollView) {
            ScrollView scrollView = (ScrollView) view2;
            N81.d dVar = new N81.d(scrollView, viewGroup, toolbar, viewFindViewById2, z12);
            scrollView.setOnTouchListener(dVar);
            this.f10418g = dVar;
        }
        com.avito.android.ui.d.b(toolbar, new Ae0.c(this, 4));
    }

    public final void a() {
        Menu menu = this.f10415d.getMenu();
        int i12 = this.f10419h;
        int size = menu.size();
        if (size == 0) {
            return;
        }
        kotlin.ranges.k it = s.r(0, size).iterator();
        while (it.f406910d) {
            C35766c3.a(i12, menu.getItem(it.a()));
        }
    }

    @Override // MU.c
    @k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        N81.e eVar = this.f10418g;
        kundle.h(Boolean.valueOf(eVar != null ? eVar.f() : false), "scrolled");
        return kundle;
    }

    @Override // M81.b
    @k
    public final z<Integer> e5() {
        return this.f10413b;
    }

    @Override // MU.c
    public final void f0(@l Kundle kundle) {
        if (this.f10417f.getTranslationY() == 0.0f) {
            if (kundle != null ? L.f(kundle.a("scrolled"), Boolean.TRUE) : false) {
                D6.H(this.f10416e);
            }
        }
    }

    @Override // M81.b
    public final void f5(@k Y41.a<G0> aVar) {
        this.f10415d.setNavigationOnClickListener(new H5(1, aVar));
    }

    @Override // M81.b
    public final void g5(int i12, @InterfaceC42150f @l Integer num) {
        Drawable navigationIcon;
        Toolbar toolbar = this.f10415d;
        toolbar.setNavigationIcon(i12);
        if (num == null || (navigationIcon = toolbar.getNavigationIcon()) == null) {
            return;
        }
        navigationIcon.setTint(C35835l0.d(num.intValue(), this.f10414c));
    }

    @Override // M81.b
    public final void h5(@InterfaceC42150f int i12) {
        this.f10419h = C35835l0.d(i12, this.f10414c);
        a();
    }

    @Override // M81.b
    public final void setMenu(int i12) {
        View actionView;
        Toolbar toolbar = this.f10415d;
        toolbar.getMenu().clear();
        toolbar.m(i12);
        int size = toolbar.getMenu().size();
        for (int i13 = 0; i13 < size; i13++) {
            MenuItem item = toolbar.getMenu().getItem(i13);
            if (item != null && (actionView = item.getActionView()) != null) {
                actionView.setOnClickListener(new p(this, 6));
            }
        }
        a();
    }

    public /* synthetic */ c(View view, View view2, boolean z12, int i12, C42822w c42822w) {
        this(view, view2, (i12 & 4) != 0 ? true : z12);
    }
}
