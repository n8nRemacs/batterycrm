package com.avito.beduin.v2.component.gridlayout.android_view;

import ET0.j;
import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.appcompat.app.r;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bU0.C25567b;
import com.avito.beduin.v2.component.common.Arrangement;
import com.avito.beduin.v2.component.common.Orientation;
import com.avito.beduin.v2.component.gridlayout.android_view.b;
import com.avito.beduin.v2.component.gridlayout.android_view.e;
import com.avito.beduin.v2.component.gridlayout.android_view.h;
import com.avito.beduin.v2.component.gridlayout.state.t;
import com.avito.beduin.v2.logger.LogLevel;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.M;
import j.U;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: GridLayoutComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/beduin/v2/component/gridlayout/android_view/e;", "Lcom/avito/beduin/v2/component/common/lazy/b;", "Lcom/avito/beduin/v2/component/gridlayout/state/c;", "Landroidx/recyclerview/widget/RecyclerView;", "a", "b", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public class e extends com.avito.beduin.v2.component.common.lazy.b<com.avito.beduin.v2.component.gridlayout.state.c, RecyclerView> {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f335776t = 0;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final A f335777m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final Orientation f335778n;

    /* renamed from: o, reason: collision with root package name */
    public com.avito.beduin.v2.component.gridlayout.android_view.b f335779o;

    /* renamed from: p, reason: collision with root package name */
    public com.avito.beduin.v2.component.common.lazy.a f335780p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public h f335781q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f335782r;

    /* renamed from: s, reason: collision with root package name */
    @l
    public a f335783s;

    /* compiled from: GridLayoutComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/gridlayout/android_view/e$a;", "", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.beduin.v2.component.gridlayout.state.c f335784a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.avito.beduin.v2.theme.k f335785b;

        public a(@k com.avito.beduin.v2.component.gridlayout.state.c cVar, @k com.avito.beduin.v2.theme.k kVar) {
            this.f335784a = cVar;
            this.f335785b = kVar;
        }
    }

    /* compiled from: GridLayoutComponent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/component/gridlayout/android_view/e$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: GridLayoutComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f335786a;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Orientation orientation = Orientation.f335659b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f335786a = iArr;
            int[] iArr2 = new int[Arrangement.values().length];
            try {
                iArr2[3] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Arrangement.a aVar = Arrangement.f335645c;
                iArr2[4] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Arrangement.a aVar2 = Arrangement.f335645c;
                iArr2[5] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Arrangement.a aVar3 = Arrangement.f335645c;
                iArr2[0] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Arrangement.a aVar4 = Arrangement.f335645c;
                iArr2[1] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                Arrangement.a aVar5 = Arrangement.f335645c;
                iArr2[2] = 6;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        new b(null);
    }

    public e(@k A a12, @k Orientation orientation) {
        super(MV0.a.f10705b);
        this.f335777m = a12;
        this.f335778n = orientation;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void m() {
        j();
        com.avito.beduin.v2.component.common.lazy.a aVar = this.f335780p;
        if (aVar == null) {
            aVar = null;
        }
        aVar.f335683f = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView$m, com.avito.beduin.v2.component.gridlayout.android_view.GridLayoutComponent$onCreateView$1$gridLayoutManager$1] */
    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        b.a aVar = new b.a();
        A a12 = this.f335777m;
        this.f335779o = new com.avito.beduin.v2.component.gridlayout.android_view.b(this, a12, aVar);
        final com.avito.beduin.v2.component.common.lazy.f fVar = new com.avito.beduin.v2.component.common.lazy.f(viewGroup.getContext(), null);
        fVar.f335693F0 = -1;
        fVar.f335696I0 = ViewConfiguration.get(fVar.getContext()).getScaledTouchSlop();
        C25567b c25567b = a12.f337909e;
        if (c25567b.f57087a) {
            fVar.addOnLayoutChangeListener(new j(0));
            ET0.l.a(fVar);
        }
        viewGroup.getContext();
        t.f335879a.getClass();
        final int i12 = t.f335880b.f335882c;
        ?? r42 = new GridLayoutManager(i12) { // from class: com.avito.beduin.v2.component.gridlayout.android_view.GridLayoutComponent$onCreateView$1$gridLayoutManager$1
            @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
            public final void V0(@l RecyclerView.z zVar) {
                super.V0(zVar);
                e eVar = this.f335762O;
                if (eVar.f335777m.f337909e.f57088b) {
                    com.avito.beduin.v2.component.common.lazy.a aVar2 = eVar.f335780p;
                    if (aVar2 == null) {
                        aVar2 = null;
                    }
                    aVar2.l(fVar);
                }
            }
        };
        r42.c2(c.f335786a[this.f335778n.ordinal()] == 1 ? 0 : 1);
        fVar.setLayoutManager(r42);
        com.avito.beduin.v2.component.gridlayout.android_view.b bVar = this.f335779o;
        if (bVar == null) {
            bVar = null;
        }
        fVar.setAdapter(bVar);
        fVar.setItemAnimator(null);
        com.avito.beduin.v2.component.common.lazy.a aVar2 = new com.avito.beduin.v2.component.common.lazy.a(r42);
        fVar.o(aVar2);
        this.f335780p = aVar2;
        r42.f53667M = new f(this, r42);
        fVar.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.avito.beduin.v2.component.gridlayout.android_view.c
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i22) {
                final e eVar = this.f335771b;
                if (eVar.f335782r) {
                    return;
                }
                eVar.f335782r = true;
                RU0.b bVar2 = RU0.b.f14467a;
                LogLevel[] logLevelArr = LogLevel.f337864b;
                bVar2.getClass();
                if (RU0.b.f14469c <= 0) {
                    RU0.b.f14468b.f(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":GridLayoutComponent"), "LayoutChanged: " + view.getWidth() + " x " + view.getHeight());
                }
                final e.a aVar3 = eVar.f335783s;
                if (aVar3 != null) {
                    if (RU0.b.f14469c <= 0) {
                        RU0.b.f14468b.f(RU0.b.f14470d + ":GridLayoutComponent", "apply postponed state");
                    }
                    final com.avito.beduin.v2.component.common.lazy.f fVar2 = fVar;
                    fVar2.post(new Runnable() { // from class: com.avito.beduin.v2.component.gridlayout.android_view.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i23 = e.f335776t;
                            e.a aVar4 = aVar3;
                            eVar.l(fVar2, aVar4.f335785b, aVar4.f335784a);
                        }
                    });
                    eVar.f335783s = null;
                }
            }
        });
        if (c25567b.f57089c) {
            fVar.setOnTouchListener(new com.avito.beduin.v2.component.common.lazy.h(viewGroup.getContext()));
        }
        return fVar;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void p(View view) {
        com.avito.beduin.v2.component.gridlayout.android_view.b bVar = this.f335779o;
        if (bVar == null) {
            bVar = null;
        }
        bVar.l(null, null);
    }

    @U
    public final float u(ET0.h hVar, Resources resources) {
        int i12;
        int iOrdinal = this.f335778n.ordinal();
        if (iOrdinal == 0) {
            i12 = hVar.f4023b;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = hVar.f4022a;
        }
        return TypedValue.applyDimension(1, i12, resources.getDisplayMetrics());
    }

    public final int v(@k com.avito.beduin.v2.component.gridlayout.state.c cVar, int i12, @k RecyclerView recyclerView) {
        int height;
        int iOrdinal = this.f335778n.ordinal();
        if (iOrdinal == 0) {
            height = recyclerView.getHeight();
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            height = recyclerView.getWidth();
        }
        float fU2 = u(cVar.f335844e, recyclerView.getResources());
        return Math.max(1, (int) Math.floor((height + fU2) / (TypedValue.applyDimension(1, i12, recyclerView.getResources().getDisplayMetrics()) + fU2)));
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    /* renamed from: w */
    public void l(@k RecyclerView recyclerView, @k com.avito.beduin.v2.theme.k kVar, @k com.avito.beduin.v2.component.gridlayout.state.c cVar) {
        int iV2;
        float fU2;
        int height;
        boolean z12 = cVar.f335848i;
        M.a(recyclerView, z12);
        if (z12) {
            boolean z13 = this.f335782r;
            t tVar = cVar.f335845f;
            if (!z13 && !(tVar instanceof t.c)) {
                this.f335783s = new a(cVar, kVar);
                return;
            }
            recyclerView.setBackgroundColor(t(cVar.f335840a));
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            gridLayoutManager.F(null);
            boolean z14 = gridLayoutManager.f53694v;
            boolean z15 = cVar.f335842c;
            if (z15 != z14) {
                gridLayoutManager.f53694v = z15;
                gridLayoutManager.i1();
            }
            if (tVar instanceof t.c) {
                iV2 = ((t.c) tVar).f335882c;
            } else if (tVar instanceof t.d) {
                iV2 = v(cVar, ((t.d) tVar).f335883c, recyclerView);
            } else {
                if (!(tVar instanceof t.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                iV2 = v(cVar, ((t.a) tVar).f335881c, recyclerView);
            }
            int i12 = iV2;
            RU0.b bVar = RU0.b.f14467a;
            LogLevel[] logLevelArr = LogLevel.f337864b;
            bVar.getClass();
            if (2 >= RU0.b.f14469c) {
                RU0.b.f14468b.b(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":GridLayoutComponent"), "span count: " + i12);
            }
            Math.max(1, i12);
            ((GridLayoutManager) recyclerView.getLayoutManager()).o2(i12);
            t.d dVar = tVar instanceof t.d ? (t.d) tVar : null;
            Orientation orientation = this.f335778n;
            ET0.h hVar = cVar.f335844e;
            if (dVar != null) {
                int iOrdinal = orientation.ordinal();
                if (iOrdinal == 0) {
                    height = recyclerView.getHeight();
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    height = recyclerView.getWidth();
                }
                int iB2 = ET0.d.b(recyclerView.getResources(), dVar.f335883c);
                float f12 = height - (i12 * iB2);
                if (1 >= RU0.b.f14469c) {
                    RU0.c cVar2 = RU0.b.f14468b;
                    String strS = AK.c.s(new StringBuilder(), RU0.b.f14470d, ":GridLayoutComponent");
                    StringBuilder sbY = r.y(height, iB2, "gridSizePx: ", ", spanSizePx: ", "; --> extraSpacePx = ");
                    sbY.append(f12);
                    cVar2.d(strS, sbY.toString());
                }
                Arrangement arrangement = cVar.f335843d;
                int iOrdinal2 = arrangement.ordinal();
                if (iOrdinal2 == 0) {
                    float f13 = i12 - 1;
                    float f14 = f12 / f13;
                    x(recyclerView, 0, 0, z15);
                    if (1 >= RU0.b.f14469c) {
                        RU0.b.f14468b.d(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":GridLayoutComponent"), "betweenSpacing = " + f14 + "; check: " + (f13 * f14));
                    }
                    fU2 = f14;
                } else if (iOrdinal2 == 1) {
                    fU2 = f12 / i12;
                    int iB3 = kotlin.math.b.b(fU2 / 2);
                    x(recyclerView, iB3, iB3, z15);
                    if (1 >= RU0.b.f14469c) {
                        RU0.b.f14468b.d(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":GridLayoutComponent"), "aroundSpacing = " + fU2 + "; aroundPadding = " + iB3 + "; check: " + (((i12 - 1) * fU2) + (iB3 * 2)));
                    }
                } else if (iOrdinal2 == 2) {
                    float f15 = f12 / (i12 + 1);
                    int iB4 = kotlin.math.b.b(f15);
                    x(recyclerView, iB4, iB4, z15);
                    if (1 >= RU0.b.f14469c) {
                        RU0.b.f14468b.d(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":GridLayoutComponent"), "evenlySpacing = " + f15 + "; evenlyPadding = " + iB4 + ";  check: " + (((i12 - 1) * f15) + (iB4 * 2)));
                    }
                    fU2 = f15;
                } else {
                    if (iOrdinal2 != 3 && iOrdinal2 != 4 && iOrdinal2 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int iB5 = kotlin.math.b.b(u(hVar, recyclerView.getResources()) * (i12 - 1));
                    int iB6 = kotlin.math.b.b(f12) - iB5;
                    int iOrdinal3 = arrangement.ordinal();
                    if (iOrdinal3 == 3) {
                        x(recyclerView, 0, iB6, z15);
                    } else if (iOrdinal3 == 4) {
                        int i13 = iB6 / 2;
                        x(recyclerView, i13, i13, z15);
                    } else if (iOrdinal3 == 5) {
                        x(recyclerView, iB6, 0, z15);
                    }
                    if (1 >= RU0.b.f14469c) {
                        RU0.b.f14468b.d(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":GridLayoutComponent"), arrangement + ": padding = " + iB6 + "; check: " + (iB5 + iB6));
                    }
                    fU2 = u(hVar, recyclerView.getResources());
                }
            } else {
                x(recyclerView, 0, 0, z15);
                fU2 = u(hVar, recyclerView.getResources());
            }
            h.b bVar2 = new h.b(orientation == Orientation.f335660c ? kotlin.math.b.b(fU2) : ET0.d.b(recyclerView.getResources(), hVar.f4022a), orientation == Orientation.f335659b ? kotlin.math.b.b(fU2) : ET0.d.b(recyclerView.getResources(), hVar.f4023b), i12, cVar.f335842c, this.f335778n);
            if (1 >= RU0.b.f14469c) {
                RU0.b.f14468b.d(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":GridLayoutComponent"), "decoration params: " + bVar2);
            }
            h hVar2 = this.f335781q;
            if (hVar2 == null) {
                h hVar3 = new h(bVar2, ((GridLayoutManager) recyclerView.getLayoutManager()).f53667M);
                recyclerView.l(hVar3, -1);
                this.f335781q = hVar3;
            } else if (!L.f(hVar2.f335789b, bVar2)) {
                recyclerView.r0(hVar2);
                h hVar4 = new h(bVar2, ((GridLayoutManager) recyclerView.getLayoutManager()).f53667M);
                recyclerView.l(hVar4, -1);
                this.f335781q = hVar4;
            }
            com.avito.beduin.v2.component.common.lazy.a aVar = this.f335780p;
            if (aVar == null) {
                aVar = null;
            }
            aVar.f335680c = cVar.f335841b;
            com.avito.beduin.v2.component.gridlayout.android_view.b bVar3 = this.f335779o;
            if (bVar3 == null) {
                bVar3 = null;
            }
            bVar3.f335766j = kVar;
            b.a aVar2 = bVar3.f335765i;
            aVar2.f335700d = aVar2.f335699c;
            aVar2.f335699c = kVar;
            bVar3.l(cVar.f335846g, null);
        }
    }

    public final void x(@k RecyclerView recyclerView, int i12, int i13, boolean z12) {
        int iOrdinal = this.f335778n.ordinal();
        if (iOrdinal == 0) {
            if (z12) {
                recyclerView.setPadding(0, i13, 0, i12);
                return;
            } else {
                recyclerView.setPadding(0, i12, 0, i13);
                return;
            }
        }
        if (iOrdinal != 1) {
            return;
        }
        if (z12) {
            recyclerView.setPadding(i13, 0, i12, 0);
        } else {
            recyclerView.setPadding(i12, 0, i13, 0);
        }
    }
}
