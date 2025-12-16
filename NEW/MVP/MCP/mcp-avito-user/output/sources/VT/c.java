package Vt;

import Ba.ViewOnClickListenerC13121a;
import Wt.C15797a;
import Xt.InterfaceC17045a;
import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.avito.android.R;
import com.avito.android.image_loader.n;
import com.avito.android.util.D6;
import hw.InterfaceC41177b;
import java.util.AbstractMap;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CircularGallery.kt */
@InterfaceC41177b
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVt/c;", "", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f17464a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ViewPager f17465b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f17466c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public Wt.c f17467d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final e f17468e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public b f17469f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public N f17470g;

    public c(@k View view, @k AbstractMap abstractMap) {
        this.f17464a = view;
        View viewFindViewById = view.findViewById(R.id.image_pager);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.viewpager.widget.ViewPager");
        }
        ViewPager viewPager = (ViewPager) viewFindViewById;
        this.f17465b = viewPager;
        View viewFindViewById2 = view.findViewById(R.id.page_indicator);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f17466c = (TextView) viewFindViewById2;
        Wt.d dVar = new Wt.d(new Xt.e(n.a(null), false, 2, null));
        this.f17467d = dVar;
        e eVar = new e(dVar, abstractMap);
        this.f17468e = eVar;
        viewPager.setAdapter(eVar);
        viewPager.c(new C15715a(this));
    }

    public final void a(@k List<? extends InterfaceC17045a> list, boolean z12) {
        b bVar = this.f17469f;
        ViewPager viewPager = this.f17465b;
        if (bVar != null) {
            viewPager.u(bVar);
        }
        int size = list.size();
        TextView textView = this.f17466c;
        e eVar = this.f17468e;
        if (size <= 1) {
            InterfaceC17045a eVar2 = list.isEmpty() ? new Xt.e(n.a(null), false, 2, null) : (InterfaceC17045a) C42745f0.E(list);
            this.f17469f = null;
            D6.w(textView);
            Wt.d dVar = new Wt.d(eVar2);
            eVar.f17471c = dVar;
            eVar.h();
            this.f17467d = dVar;
            return;
        }
        C15797a c15797a = new C15797a();
        c15797a.f18079a = list;
        eVar.f17471c = c15797a;
        eVar.h();
        b bVar2 = new b(this, c15797a);
        this.f17469f = bVar2;
        viewPager.c(bVar2);
        D6.G(textView, z12);
        this.f17467d = c15797a;
        viewPager.x(c15797a.b(0), false);
    }

    public final void b(@l Y41.a<G0> aVar) {
        G0 g02;
        ViewPager viewPager = this.f17465b;
        if (aVar != null) {
            viewPager.setOnClickListener(new ViewOnClickListenerC13121a(4, aVar));
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            viewPager.setOnClickListener(null);
        }
    }
}
