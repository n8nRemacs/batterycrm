package com.avito.android.user_advert.advert;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22977J;
import com.avito.android.N2;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.component.toast.f;
import com.avito.android.personal_banner.feature.mvi.entity.BannerState;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import gj.InterfaceC40691b;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kI0.InterfaceC42585a;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;

/* compiled from: MyAdvertDetailsView.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/m1;", "Lcom/avito/android/user_advert/advert/g1;", "a", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_advert.advert.m1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35436m1 implements InterfaceC35393g1 {

    /* renamed from: u, reason: collision with root package name */
    public static final int f310544u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f310545v;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f310546a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final FragmentManager f310547b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35426j0 f310548c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f310549d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f310550e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f310551f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_advert.advert.delegate.auto_select_close.a f310552g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.app_rater.a f310553h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final N2 f310554i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final n2<BannerState> f310555j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final n2<com.avito.android.lib.beduin_v2.beduin_item.a> f310556k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.R0 f310557l;

    /* renamed from: m, reason: collision with root package name */
    public final Context f310558m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f310559n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final View f310560o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f310561p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f310562q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.safe_show.b f310563r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final Z1<UV0.c<? extends com.avito.conveyor_item.a>> f310564s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final Toolbar f310565t;

    /* compiled from: MyAdvertDetailsView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/user_advert/advert/m1$a;", "", "<init>", "()V", "", "TOOLTIP_ANCHOR_OFFSET", "I", "TOOLTIP_WIDTH", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_advert.advert.m1$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f310544u = y6.b(320);
        f310545v = y6.b(-12);
    }

    public C35436m1(@Y61.k View view, @Y61.k FragmentManager fragmentManager, @Y61.k InterfaceC35426j0 interfaceC35426j0, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k Set set, @Y61.k InterfaceC40691b interfaceC40691b, @Y61.k com.avito.android.user_advert.advert.delegate.auto_select_close.a aVar2, @Y61.k InterfaceC42585a interfaceC42585a, @Y61.k com.avito.android.app_rater.a aVar3, @Y61.k N2 n22, @Y61.k n2 n2Var, @Y61.k n2 n2Var2, @Y61.k com.avito.android.util.R0 r02, @Y61.k C22977J c22977j) {
        this.f310546a = view;
        this.f310547b = fragmentManager;
        this.f310548c = interfaceC35426j0;
        this.f310549d = aVar;
        this.f310550e = interfaceC28373a;
        this.f310551f = interfaceC40691b;
        this.f310552g = aVar2;
        this.f310553h = aVar3;
        this.f310554i = n22;
        this.f310555j = n2Var;
        this.f310556k = n2Var2;
        this.f310557l = r02;
        Context context = view.getContext();
        this.f310558m = context;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.my_advert_recycler_view);
        this.f310559n = recyclerView;
        this.f310560o = view.findViewById(R.id.tooltip_anchor);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.my_advert_loading_container);
        this.f310561p = viewGroup;
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(viewGroup, 0, interfaceC28373a, 0, 0, 26, null);
        this.f310562q = lVar;
        this.f310563r = new com.avito.android.advert_core.safe_show.b(context.getResources().getBoolean(R.bool.is_tablet));
        this.f310564s = p2.a(new UV0.c(C42784z0.f406748b));
        this.f310565t = (Toolbar) view.findViewById(R.id.toolbar);
        lVar.f231600j = new C35430k1(0, interfaceC35426j0, t1.class, "onRefresh", "onRefresh()V", 0);
        recyclerView.setAdapter(jVar);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            recyclerView.l((RecyclerView.l) it.next(), -1);
        }
        interfaceC42585a.b(this.f310559n);
        N2 n23 = this.f310554i;
        n23.getClass();
        kotlin.reflect.n<Object> nVar = N2.f67352m[7];
        if (((Boolean) n23.f67360i.a().invoke()).booleanValue()) {
            new z1(this.f310559n, this.f310548c);
        }
        C43259k.d(c22977j, null, null, new C35433l1(this, null), 3);
    }

    public final void a(@Y61.k List<? extends BeduinAction> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.f310551f.o((BeduinAction) it.next());
        }
    }

    public final void b() {
        this.f310562q.j();
        D6.w(this.f310561p);
    }

    public final void c(@Y61.k PrintableText printableText) {
        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
        f.c.f125255c.getClass();
        com.avito.android.component.toast.c.b(cVar, this.f310546a, printableText, null, null, null, f.c.a.b(), 0, null, null, false, false, null, null, 4078);
    }

    public final void d(@Y61.l ApiError apiError, @Y61.k String str) {
        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
        PrintableText printableTextF = com.avito.android.printable_text.b.f(str);
        f.c.f125255c.getClass();
        com.avito.android.component.toast.c.b(cVar, this.f310546a, printableTextF, null, null, null, f.c.a.a(apiError, null), 0, null, null, false, false, null, null, 4078);
    }

    public final void e(@Y61.k UV0.c<? extends com.avito.conveyor_item.a> cVar) {
        this.f310564s.K5(cVar);
    }

    public final void f(@Y61.k String str) {
        g(com.avito.android.printable_text.b.f(str));
    }

    public final void g(@Y61.k PrintableText printableText) {
        com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, this.f310546a, printableText, null, null, null, null, 0, null, null, false, false, null, null, 4094);
    }

    public final void h(@Y61.k String str) {
        this.f310565t.setTitle(str);
    }

    public final void i() {
        D6.H(this.f310561p);
        this.f310562q.k(null);
    }
}
