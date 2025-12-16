package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.V1;
import androidx.compose.foundation.text.input.internal.k1;
import androidx.compose.runtime.C22082i3;
import androidx.compose.ui.layout.AbstractC22348a;
import androidx.compose.ui.layout.C22350b;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.node.AbstractC22443w0;
import androidx.compose.ui.node.C22417j;
import androidx.compose.ui.node.InterfaceC22415i;
import androidx.compose.ui.node.InterfaceC22442w;
import androidx.compose.ui.text.font.E;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* compiled from: TextFieldTextLayoutModifier.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/input/internal/m1;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/node/K;", "Landroidx/compose/ui/node/w;", "Landroidx/compose/ui/node/i;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m1 extends v.d implements androidx.compose.ui.node.K, InterfaceC22442w, InterfaceC22415i {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public p1 f31170p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f31171q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public Map<AbstractC22348a, Integer> f31172r;

    /* compiled from: TextFieldTextLayoutModifier.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f31173l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.layout.K0 k02) {
            super(1);
            this.f31173l = k02;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            aVar.e(this.f31173l, 0, 0, 0.0f);
            return kotlin.G0.f406611a;
        }
    }

    public m1() {
        throw null;
    }

    @Override // androidx.compose.ui.node.InterfaceC22442w
    public final void P(@Y61.k AbstractC22443w0 abstractC22443w0) {
        ((C22082i3) this.f31170p.f31202c).setValue(abstractC22443w0);
    }

    @Override // androidx.compose.ui.node.K
    @Y61.k
    public final InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        float fJ2;
        p1 p1Var = this.f31170p;
        LayoutDirection f40449b = interfaceC22369k0.getF40449b();
        E.b bVar = (E.b) C22417j.a(this, androidx.compose.ui.platform.Q0.f41202k);
        k1 k1Var = p1Var.f31200a;
        k1Var.getClass();
        k1.b bVar2 = new k1.b(interfaceC22369k0, f40449b, bVar, j12, null);
        ((C22082i3) k1Var.f31134c).setValue(bVar2);
        k1.c cVar = (k1.c) ((C22082i3) k1Var.f31133b).getF42167b();
        if (cVar == null) {
            androidx.compose.foundation.internal.e.d("Called layoutWithNewMeasureInputs before updateNonMeasureInputs");
            throw new KotlinNothingValueException();
        }
        androidx.compose.ui.text.o0 o0VarP = k1Var.p(cVar, bVar2);
        C22712b.a aVar = C22712b.f42842b;
        long j13 = o0VarP.f42528c;
        int i12 = (int) (j13 >> 32);
        int i13 = (int) (j13 & 4294967295L);
        aVar.getClass();
        androidx.compose.ui.layout.K0 k0I = interfaceC22363h0.I(C22712b.a.b(i12, i12, i13, i13));
        p1 p1Var2 = this.f31170p;
        if (this.f31171q) {
            fJ2 = interfaceC22369k0.J(V1.a(o0VarP.f42527b.b(0)));
        } else {
            fJ2 = 0;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        }
        ((C22082i3) p1Var2.f31205f).setValue(androidx.compose.ui.unit.h.a(fJ2));
        Map<AbstractC22348a, Integer> linkedHashMap = this.f31172r;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>(2);
        }
        linkedHashMap.put(C22350b.f40439a, Integer.valueOf(Math.round(o0VarP.f42529d)));
        linkedHashMap.put(C22350b.f40440b, Integer.valueOf(Math.round(o0VarP.f42530e)));
        this.f31172r = linkedHashMap;
        return interfaceC22369k0.L0(i12, i13, linkedHashMap, new a(k0I));
    }
}
