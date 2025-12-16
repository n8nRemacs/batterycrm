package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;

/* compiled from: LayoutNodeLayoutDelegate.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/T;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LayoutNode f40678a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f40679b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f40680c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f40682e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f40683f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f40684g;

    /* renamed from: h, reason: collision with root package name */
    public int f40685h;

    /* renamed from: i, reason: collision with root package name */
    public int f40686i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f40687j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f40688k;

    /* renamed from: l, reason: collision with root package name */
    public int f40689l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f40690m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f40691n;

    /* renamed from: o, reason: collision with root package name */
    public int f40692o;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public C22404c0 f40694q;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public LayoutNode.LayoutState f40681d = LayoutNode.LayoutState.f40655f;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final C22418j0 f40693p = new C22418j0(this);

    public T(@Y61.k LayoutNode layoutNode) {
        this.f40678a = layoutNode;
    }

    @Y61.k
    public final AbstractC22443w0 a() {
        return this.f40678a.f40615I.f40876c;
    }

    public final void b() {
        LayoutNode.LayoutState layoutState = this.f40678a.f40616J.f40681d;
        if (layoutState == LayoutNode.LayoutState.f40653d || layoutState == LayoutNode.LayoutState.f40654e) {
            if (this.f40693p.f40822C) {
                f(true);
            } else {
                e(true);
            }
        }
        if (layoutState == LayoutNode.LayoutState.f40654e) {
            C22404c0 c22404c0 = this.f40694q;
            if (c22404c0 == null || !c22404c0.f40761w) {
                g(true);
            } else {
                h(true);
            }
        }
    }

    public final void c(int i12) {
        int i13 = this.f40689l;
        this.f40689l = i12;
        if ((i13 == 0) != (i12 == 0)) {
            LayoutNode layoutNodeK = this.f40678a.K();
            T t12 = layoutNodeK != null ? layoutNodeK.f40616J : null;
            if (t12 != null) {
                if (i12 == 0) {
                    t12.c(t12.f40689l - 1);
                } else {
                    t12.c(t12.f40689l + 1);
                }
            }
        }
    }

    public final void d(int i12) {
        int i13 = this.f40692o;
        this.f40692o = i12;
        if ((i13 == 0) != (i12 == 0)) {
            LayoutNode layoutNodeK = this.f40678a.K();
            T t12 = layoutNodeK != null ? layoutNodeK.f40616J : null;
            if (t12 != null) {
                if (i12 == 0) {
                    t12.d(t12.f40692o - 1);
                } else {
                    t12.d(t12.f40692o + 1);
                }
            }
        }
    }

    public final void e(boolean z12) {
        if (this.f40688k != z12) {
            this.f40688k = z12;
            if (z12 && !this.f40687j) {
                c(this.f40689l + 1);
            } else {
                if (z12 || this.f40687j) {
                    return;
                }
                c(this.f40689l - 1);
            }
        }
    }

    public final void f(boolean z12) {
        if (this.f40687j != z12) {
            this.f40687j = z12;
            if (z12 && !this.f40688k) {
                c(this.f40689l + 1);
            } else {
                if (z12 || this.f40688k) {
                    return;
                }
                c(this.f40689l - 1);
            }
        }
    }

    public final void g(boolean z12) {
        if (this.f40691n != z12) {
            this.f40691n = z12;
            if (z12 && !this.f40690m) {
                d(this.f40692o + 1);
            } else {
                if (z12 || this.f40690m) {
                    return;
                }
                d(this.f40692o - 1);
            }
        }
    }

    public final void h(boolean z12) {
        if (this.f40690m != z12) {
            this.f40690m = z12;
            if (z12 && !this.f40691n) {
                d(this.f40692o + 1);
            } else {
                if (z12 || this.f40691n) {
                    return;
                }
                d(this.f40692o - 1);
            }
        }
    }

    public final void i() {
        C22418j0 c22418j0 = this.f40693p;
        Object obj = c22418j0.f40847t;
        LayoutNode layoutNode = this.f40678a;
        T t12 = c22418j0.f40834g;
        if ((obj != null || t12.a().getF40763y() != null) && c22418j0.f40846s) {
            c22418j0.f40846s = false;
            c22418j0.f40847t = t12.a().getF40763y();
            LayoutNode layoutNodeK = layoutNode.K();
            if (layoutNodeK != null) {
                LayoutNode.o0(layoutNodeK, false, 7);
            }
        }
        C22404c0 c22404c0 = this.f40694q;
        if (c22404c0 != null) {
            Object obj2 = c22404c0.f40763y;
            T t13 = c22404c0.f40745g;
            if (!(obj2 == null && t13.a().getF40580V().f40731n.getF40763y() == null) && c22404c0.f40762x) {
                c22404c0.f40762x = false;
                c22404c0.f40763y = t13.a().getF40580V().f40731n.getF40763y();
                if (U.a(layoutNode)) {
                    LayoutNode layoutNodeK2 = layoutNode.K();
                    if (layoutNodeK2 != null) {
                        LayoutNode.o0(layoutNodeK2, false, 7);
                        return;
                    }
                    return;
                }
                LayoutNode layoutNodeK3 = layoutNode.K();
                if (layoutNodeK3 != null) {
                    LayoutNode.m0(layoutNodeK3, false, 7);
                }
            }
        }
    }
}
