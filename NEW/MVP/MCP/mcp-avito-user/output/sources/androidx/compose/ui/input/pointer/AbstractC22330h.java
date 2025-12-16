package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.C22436t;
import androidx.compose.ui.node.InterfaceC22415i;
import androidx.compose.ui.node.P0;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.X0;
import androidx.compose.ui.node.Z0;
import androidx.compose.ui.v;
import java.util.Collection;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: PointerIcon.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/input/pointer/h;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/node/P0;", "Landroidx/compose/ui/node/i;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.input.pointer.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC22330h extends v.d implements TraversableNode, P0, InterfaceC22415i {

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public C22436t f40250p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public InterfaceC22345x f40251q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f40252r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f40253s;

    /* compiled from: PointerIcon.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/h;", "it", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "invoke", "(Landroidx/compose/ui/input/pointer/h;)Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.input.pointer.h$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<AbstractC22330h, TraversableNode.Companion.TraverseDescendantsAction> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l0.a f40254l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l0.a aVar) {
            super(1);
            this.f40254l = aVar;
        }

        @Override // Y41.l
        public final TraversableNode.Companion.TraverseDescendantsAction invoke(AbstractC22330h abstractC22330h) {
            if (!abstractC22330h.f40253s) {
                return TraversableNode.Companion.TraverseDescendantsAction.f40695b;
            }
            this.f40254l.f406838b = false;
            return TraversableNode.Companion.TraverseDescendantsAction.f40697d;
        }
    }

    public /* synthetic */ AbstractC22330h(InterfaceC22345x interfaceC22345x, boolean z12, C22436t c22436t, int i12, C42822w c42822w) {
        this(interfaceC22345x, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? null : c22436t);
    }

    @Override // androidx.compose.ui.v.d
    public final void d2() {
        o2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k2() {
        InterfaceC22345x interfaceC22345x;
        l0.h hVar = new l0.h();
        Z0.b(this, new C22332j(hVar));
        AbstractC22330h abstractC22330h = (AbstractC22330h) hVar.f406842b;
        if (abstractC22330h == null || (interfaceC22345x = abstractC22330h.f40251q) == null) {
            interfaceC22345x = this.f40251q;
        }
        l2(interfaceC22345x);
    }

    public abstract void l2(@Y61.l InterfaceC22345x interfaceC22345x);

    @Override // androidx.compose.ui.node.P0
    public final long m1() {
        C22436t c22436t = this.f40250p;
        if (c22436t == null) {
            X0.f40712b.getClass();
            return X0.f40713c;
        }
        androidx.compose.ui.unit.d dVar = C22421l.g(this).f40608B;
        X0.a aVar = X0.f40712b;
        int iY02 = dVar.y0(c22436t.f40869a);
        int iY03 = dVar.y0(c22436t.f40870b);
        int iY04 = dVar.y0(c22436t.f40871c);
        int iY05 = dVar.y0(c22436t.f40872d);
        aVar.getClass();
        return X0.a.b(iY02, iY03, iY04, iY05, c22436t.f40873e);
    }

    public final void m2() {
        l0.a aVar = new l0.a();
        aVar.f406838b = true;
        if (!this.f40252r) {
            Z0.c(this, new a(aVar));
        }
        if (aVar.f406838b) {
            k2();
        }
    }

    public abstract boolean n2(int i12);

    /* JADX WARN: Multi-variable type inference failed */
    public final void o2() {
        G0 g02;
        if (this.f40253s) {
            this.f40253s = false;
            if (this.f42893o) {
                l0.h hVar = new l0.h();
                Z0.b(this, new C22329g(hVar));
                AbstractC22330h abstractC22330h = (AbstractC22330h) hVar.f406842b;
                if (abstractC22330h != null) {
                    abstractC22330h.k2();
                    g02 = G0.f406611a;
                } else {
                    g02 = null;
                }
                if (g02 == null) {
                    l2(null);
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.P0
    public final void p1() {
        o2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p2(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f40252r
            if (r0 == r2) goto L31
            r1.f40252r = r2
            if (r2 == 0) goto L10
            boolean r2 = r1.f40253s
            if (r2 == 0) goto L31
            r1.k2()
            goto L31
        L10:
            boolean r0 = r1.f40253s
            if (r0 == 0) goto L31
            if (r0 != 0) goto L17
            goto L31
        L17:
            if (r2 != 0) goto L2d
            kotlin.jvm.internal.l0$h r2 = new kotlin.jvm.internal.l0$h
            r2.<init>()
            androidx.compose.ui.input.pointer.i r0 = new androidx.compose.ui.input.pointer.i
            r0.<init>(r2)
            androidx.compose.ui.node.Z0.c(r1, r0)
            T r2 = r2.f406842b
            androidx.compose.ui.input.pointer.h r2 = (androidx.compose.ui.input.pointer.AbstractC22330h) r2
            if (r2 == 0) goto L2d
            goto L2e
        L2d:
            r2 = r1
        L2e:
            r2.k2()
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.AbstractC22330h.p2(boolean):void");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    @Override // androidx.compose.ui.node.P0
    public final void r0(@Y61.k C22340s c22340s, @Y61.k PointerEventPass pointerEventPass, long j12) {
        if (pointerEventPass == PointerEventPass.f40174c) {
            ?? r32 = c22340s.f40278a;
            int size = ((Collection) r32).size();
            for (int i12 = 0; i12 < size; i12++) {
                if (n2(((C) r32.get(i12)).f40124i)) {
                    int i13 = c22340s.f40282e;
                    C22342u.f40283b.getClass();
                    if (C22342u.a(i13, C22342u.f40287f)) {
                        this.f40253s = true;
                        m2();
                        return;
                    } else {
                        if (C22342u.a(c22340s.f40282e, C22342u.f40288g)) {
                            o2();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public AbstractC22330h(@Y61.k InterfaceC22345x interfaceC22345x, boolean z12, @Y61.l C22436t c22436t) {
        this.f40250p = c22436t;
        this.f40251q = interfaceC22345x;
        this.f40252r = z12;
    }
}
