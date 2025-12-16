package androidx.compose.ui.viewinterop;

import Y61.l;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.ui.focus.B;
import androidx.compose.ui.focus.C22220e;
import androidx.compose.ui.focus.C22228m;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.InterfaceC22221f;
import androidx.compose.ui.focus.J;
import androidx.compose.ui.focus.N;
import androidx.compose.ui.focus.k0;
import androidx.compose.ui.focus.l0;
import androidx.compose.ui.node.AbstractC22425n;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.C22423m;
import androidx.compose.ui.node.J0;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import s0.C47949a;

/* compiled from: FocusGroupNode.android.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/viewinterop/f;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/focus/N;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class f extends v.d implements N, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: p, reason: collision with root package name */
    @l
    public View f42986p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public ViewTreeObserver f42987q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC22221f, G0> f42988r = new a();

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC22221f, G0> f42989s = new b();

    /* compiled from: FocusGroupNode.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/focus/f;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/focus/f;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<InterfaceC22221f, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC22221f interfaceC22221f) {
            InterfaceC22221f interfaceC22221f2 = interfaceC22221f;
            f fVar = f.this;
            View viewC = e.c(fVar);
            if (!viewC.isFocused() && !viewC.hasFocus()) {
                if (!C22228m.b(viewC, C22228m.c(interfaceC22221f2.getF39156a()), e.b(C22421l.h(fVar).getFocusOwner(), C22423m.a(fVar), viewC))) {
                    interfaceC22221f2.a();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: FocusGroupNode.android.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/focus/f;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/focus/f;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<InterfaceC22221f, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC22221f interfaceC22221f) {
            InterfaceC22221f interfaceC22221f2 = interfaceC22221f;
            f fVar = f.this;
            View viewC = e.c(fVar);
            boolean z12 = androidx.compose.ui.l.f40320a;
            if (viewC.hasFocus()) {
                B focusOwner = C22421l.h(fVar).getFocusOwner();
                View viewA = C22423m.a(fVar);
                if (viewC instanceof ViewGroup) {
                    Rect rectB = e.b(focusOwner, viewA, viewC);
                    Integer numC = C22228m.c(interfaceC22221f2.getF39156a());
                    int iIntValue = numC != null ? numC.intValue() : 130;
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    View view = fVar.f42986p;
                    View viewFindNextFocus = view != null ? focusFinder.findNextFocus((ViewGroup) viewA, view, iIntValue) : focusFinder.findNextFocusFromRect((ViewGroup) viewA, rectB, iIntValue);
                    if (viewFindNextFocus != null && e.a(viewC, viewFindNextFocus)) {
                        viewFindNextFocus.requestFocus(iIntValue, rectB);
                        interfaceC22221f2.a();
                    } else if (!viewA.requestFocus()) {
                        throw new IllegalStateException("host view did not take focus");
                    }
                } else if (!viewA.requestFocus()) {
                    throw new IllegalStateException("host view did not take focus");
                }
            }
            return G0.f406611a;
        }
    }

    @Override // androidx.compose.ui.focus.N
    public final void E0(@Y61.k J j12) {
        j12.a(false);
        j12.c(this.f42988r);
        j12.b(this.f42989s);
    }

    @Override // androidx.compose.ui.v.d
    public final void c2() {
        ViewTreeObserver viewTreeObserver = C22423m.a(this).getViewTreeObserver();
        this.f42987q = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // androidx.compose.ui.v.d
    public final void d2() {
        ViewTreeObserver viewTreeObserver = this.f42987q;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f42987q = null;
        C22423m.a(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.f42986p = null;
    }

    public final FocusTargetNode k2() {
        if (!this.f42880b.f42893o) {
            C47949a.b("visitLocalDescendants called on an unattached node");
        }
        v.d dVar = this.f42880b;
        if ((dVar.f42883e & 1024) != 0) {
            boolean z12 = false;
            for (v.d dVar2 = dVar.f42885g; dVar2 != null; dVar2 = dVar2.f42885g) {
                if ((dVar2.f42882d & 1024) != 0) {
                    v.d dVarB = dVar2;
                    androidx.compose.runtime.collection.e eVar = null;
                    while (dVarB != null) {
                        if (dVarB instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) dVarB;
                            if (z12) {
                                return focusTargetNode;
                            }
                            z12 = true;
                        } else if ((dVarB.f42882d & 1024) != 0 && (dVarB instanceof AbstractC22425n)) {
                            int i12 = 0;
                            for (v.d dVar3 = ((AbstractC22425n) dVarB).f40861q; dVar3 != null; dVar3 = dVar3.f42885g) {
                                if ((dVar3.f42882d & 1024) != 0) {
                                    i12++;
                                    if (i12 == 1) {
                                        dVarB = dVar3;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                                        }
                                        if (dVarB != null) {
                                            eVar.b(dVarB);
                                            dVarB = null;
                                        }
                                        eVar.b(dVar3);
                                    }
                                }
                            }
                            if (i12 == 1) {
                            }
                        }
                        dVarB = C22421l.b(eVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(@l View view, @l View view2) {
        if (C22421l.g(this).f40641q == null) {
            return;
        }
        View viewC = e.c(this);
        B focusOwner = C22421l.h(this).getFocusOwner();
        J0 j0H = C22421l.h(this);
        boolean z12 = (view == null || view.equals(j0H) || !e.a(viewC, view)) ? false : true;
        boolean z13 = (view2 == null || view2.equals(j0H) || !e.a(viewC, view2)) ? false : true;
        if (z12 && z13) {
            this.f42986p = view2;
            return;
        }
        if (!z13) {
            if (!z12) {
                this.f42986p = null;
                return;
            }
            this.f42986p = null;
            if (k2().q0().a()) {
                C22220e.f39163b.getClass();
                focusOwner.k(C22220e.f39171j, false, false);
                return;
            }
            return;
        }
        this.f42986p = view2;
        FocusTargetNode focusTargetNodeK2 = k2();
        if (focusTargetNodeK2.q0().b()) {
            return;
        }
        if (androidx.compose.ui.l.f40323d) {
            l0.f(focusTargetNodeK2);
            return;
        }
        k0 f39106h = focusOwner.getF39106h();
        try {
            if (f39106h.f39178c) {
                k0.a(f39106h);
            }
            f39106h.f39178c = true;
            l0.f(focusTargetNodeK2);
            k0.b(f39106h);
        } catch (Throwable th2) {
            k0.b(f39106h);
            throw th2;
        }
    }
}
