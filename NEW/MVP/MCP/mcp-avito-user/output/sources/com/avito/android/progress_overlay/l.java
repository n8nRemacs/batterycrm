package com.avito.android.progress_overlay;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.lib.deprecated_design.NetworkProblemView;
import com.avito.android.util.B6;
import com.avito.android.util.C35835l0;
import com.avito.android.util.q6;
import io.reactivex.rxjava3.core.B;
import io.reactivex.rxjava3.internal.operators.observable.C;
import j.D;
import j.I;
import j.InterfaceC42156l;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ProgressOverlay.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/progress_overlay/l;", "Lcom/avito/android/progress_overlay/a;", "_avito_progress-overlay_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public class l implements com.avito.android.progress_overlay.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f231591a;

    /* renamed from: b, reason: collision with root package name */
    public final int f231592b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final InterfaceC28373a f231593c;

    /* renamed from: d, reason: collision with root package name */
    public final int f231594d;

    /* renamed from: e, reason: collision with root package name */
    public final int f231595e;

    /* renamed from: f, reason: collision with root package name */
    public final LayoutInflater f231596f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f231597g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public Integer f231598h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public Integer f231599i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Object f231600j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final a f231601k;

    /* compiled from: ProgressOverlay.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/progress_overlay/l$a", "Lcom/avito/android/lib/deprecated_design/NetworkProblemView$b;", "_avito_progress-overlay_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements NetworkProblemView.b {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [Y41.a, java.lang.Object] */
        @Override // com.avito.android.lib.deprecated_design.NetworkProblemView.b
        public final void W1() {
            ?? r02 = l.this.f231600j;
            if (r02 != 0) {
                r02.invoke();
            }
        }
    }

    /* compiled from: ProgressOverlay.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f231603l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g gVar) {
            super(0);
            this.f231603l = gVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            g gVar = this.f231603l;
            if (gVar != null) {
                gVar.j0();
            }
            return G0.f406611a;
        }
    }

    @X41.j
    public l(@Y61.k ViewGroup viewGroup, @D int i12, @Y61.l InterfaceC28373a interfaceC28373a, @I int i13, @InterfaceC42156l int i14) {
        this.f231591a = viewGroup;
        this.f231592b = i12;
        this.f231593c = interfaceC28373a;
        this.f231594d = i13;
        this.f231595e = i14;
        this.f231596f = LayoutInflater.from(viewGroup.getContext());
        this.f231601k = new a();
    }

    @Override // com.avito.android.progress_overlay.a
    public final void a(@Y61.k String str) {
        Resources resources;
        int i12;
        NetworkProblemView networkProblemViewB = b();
        boolean zK2 = C43066x.K(str);
        ViewGroup viewGroup = this.f231591a;
        if (zK2) {
            if (C35835l0.o(viewGroup.getContext())) {
                resources = networkProblemViewB.getResources();
                i12 = R.string.something_went_wrong;
            } else {
                resources = networkProblemViewB.getResources();
                i12 = R.string.connection_problem;
            }
            networkProblemViewB.a(resources.getString(i12));
        } else {
            networkProblemViewB.a(str);
        }
        l(viewGroup, networkProblemViewB);
        InterfaceC28373a interfaceC28373a = this.f231593c;
        if (interfaceC28373a != null) {
            interfaceC28373a.c(new com.avito.android.analytics.event.I());
        }
    }

    public final NetworkProblemView b() throws Resources.NotFoundException {
        View viewC = c();
        if (!(viewC instanceof NetworkProblemView)) {
            int i12 = this.f231594d;
            LayoutInflater layoutInflater = this.f231596f;
            ViewGroup viewGroup = this.f231591a;
            viewC = (NetworkProblemView) layoutInflater.inflate(i12, viewGroup, false);
            viewC.setId(R.id.overlay);
            viewC.setBackgroundColor(this.f231595e);
            if (this.f231597g) {
                viewC.setPadding(viewC.getPaddingLeft(), viewC.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_default_height_material), viewC.getPaddingRight(), viewC.getPaddingBottom());
            }
            Integer num = this.f231598h;
            if (num != null) {
                viewC.setPadding(viewC.getPaddingLeft(), viewGroup.getResources().getDimensionPixelSize(num.intValue()), viewC.getPaddingRight(), viewC.getPaddingBottom());
            }
            Integer num2 = this.f231599i;
            if (num2 != null) {
                viewC.setPadding(viewC.getPaddingLeft(), viewC.getPaddingTop(), viewC.getPaddingRight(), viewGroup.getResources().getDimensionPixelSize(num2.intValue()));
            }
            viewGroup.addView(viewC);
        }
        NetworkProblemView networkProblemView = (NetworkProblemView) viewC;
        networkProblemView.setListener(this.f231601k);
        return networkProblemView;
    }

    public final View c() {
        View next;
        Iterator<View> it = new q6(this.f231591a).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.getId() == R.id.overlay) {
                break;
            }
        }
        return next;
    }

    public final boolean d() {
        return this.f231591a.findViewById(this.f231592b).getVisibility() == 0;
    }

    @Y61.k
    public final C e() {
        return new C(new io.reactivex.rxjava3.core.C() { // from class: com.avito.android.progress_overlay.j
            @Override // io.reactivex.rxjava3.core.C
            public final void f(B b12) {
                m mVar = new m(b12);
                final l lVar = this.f231589b;
                lVar.f231600j = mVar;
                b12.f(new l41.f() { // from class: com.avito.android.progress_overlay.k
                    @Override // l41.f
                    public final void cancel() {
                        lVar.h(null);
                    }
                });
            }
        });
    }

    public void f(@Y61.l View view, @Y61.k ViewGroup viewGroup) {
        viewGroup.removeView(view);
    }

    public final void g() throws Resources.NotFoundException {
        this.f231599i = Integer.valueOf(R.dimen.universal_map_62dp);
        View viewC = c();
        Integer num = this.f231599i;
        if (num == null || viewC == null) {
            return;
        }
        viewC.setPadding(viewC.getPaddingLeft(), viewC.getPaddingTop(), viewC.getPaddingRight(), this.f231591a.getResources().getDimensionPixelSize(num.intValue()));
    }

    public final void h(@Y61.l g gVar) {
        this.f231600j = new b(gVar);
    }

    public final void i() throws Resources.NotFoundException {
        this.f231598h = Integer.valueOf(R.dimen.universal_map_62dp);
        View viewC = c();
        Integer num = this.f231598h;
        if (num == null || viewC == null) {
            return;
        }
        viewC.setPadding(viewC.getPaddingLeft(), this.f231591a.getResources().getDimensionPixelSize(num.intValue()), viewC.getPaddingRight(), viewC.getPaddingBottom());
    }

    public final void j() {
        View viewC = c();
        ViewGroup viewGroup = this.f231591a;
        f(viewC, viewGroup);
        int i12 = this.f231592b;
        if (i12 != -1) {
            B6.f318559a.getClass();
            View viewFindViewById = viewGroup.findViewById(i12);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
        }
    }

    public final void k(@Y61.l String str) {
        NetworkProblemView networkProblemViewB = b();
        networkProblemViewB.b(str);
        l(this.f231591a, networkProblemViewB);
    }

    public void l(@Y61.k ViewGroup viewGroup, @Y61.k NetworkProblemView networkProblemView) {
        int i12 = this.f231592b;
        if (i12 != -1) {
            B6.f318559a.getClass();
            View viewFindViewById = this.f231591a.findViewById(i12);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(4);
            }
        }
        B6.f318559a.getClass();
        if (networkProblemView != null) {
            networkProblemView.setVisibility(0);
        }
    }

    public /* synthetic */ l(ViewGroup viewGroup, int i12, InterfaceC28373a interfaceC28373a, int i13, int i14, int i15, C42822w c42822w) {
        this(viewGroup, (i15 & 2) != 0 ? -1 : i12, (i15 & 4) != 0 ? null : interfaceC28373a, (i15 & 8) != 0 ? R.layout.old_part_network_problem : i13, (i15 & 16) != 0 ? C35835l0.d(R.attr.white, viewGroup.getContext()) : i14);
    }
}
