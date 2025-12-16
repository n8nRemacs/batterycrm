package androidx.compose.ui.node;

import androidx.compose.ui.layout.AbstractC22348a;
import androidx.compose.ui.layout.C22350b;
import androidx.compose.ui.layout.C22387u;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import l0.g;

/* compiled from: LayoutNodeAlignmentLines.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/a;", "", "Landroidx/compose/ui/node/O;", "Landroidx/compose/ui/node/W;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.node.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC22399a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22401b f40721a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f40723c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f40724d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f40725e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f40726f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f40727g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public InterfaceC22401b f40728h;

    /* renamed from: b, reason: collision with root package name */
    public boolean f40722b = true;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final HashMap f40729i = new HashMap();

    /* compiled from: LayoutNodeAlignmentLines.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/b;", "childOwner", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/node/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.node.a$a, reason: collision with other inner class name */
    public static final class C1669a extends kotlin.jvm.internal.N implements Y41.l<InterfaceC22401b, kotlin.G0> {
        public C1669a() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(InterfaceC22401b interfaceC22401b) {
            AbstractC22399a abstractC22399a;
            InterfaceC22401b interfaceC22401b2 = interfaceC22401b;
            if (interfaceC22401b2.getF40848u()) {
                if (interfaceC22401b2.t().f40722b) {
                    interfaceC22401b2.C();
                }
                Iterator it = interfaceC22401b2.t().f40729i.entrySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    abstractC22399a = AbstractC22399a.this;
                    if (!zHasNext) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    AbstractC22399a.a(abstractC22399a, (AbstractC22348a) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC22401b2.D());
                }
                for (AbstractC22443w0 abstractC22443w0 = interfaceC22401b2.D().f40913r; !abstractC22443w0.equals(abstractC22399a.f40721a.D()); abstractC22443w0 = abstractC22443w0.f40913r) {
                    for (AbstractC22348a abstractC22348a : abstractC22399a.c(abstractC22443w0).keySet()) {
                        AbstractC22399a.a(abstractC22399a, abstractC22348a, abstractC22399a.d(abstractC22443w0, abstractC22348a), abstractC22443w0);
                    }
                }
            }
            return kotlin.G0.f406611a;
        }
    }

    public AbstractC22399a(InterfaceC22401b interfaceC22401b, C42822w c42822w) {
        this.f40721a = interfaceC22401b;
    }

    public static final void a(AbstractC22399a abstractC22399a, AbstractC22348a abstractC22348a, int i12, AbstractC22443w0 abstractC22443w0) {
        abstractC22399a.getClass();
        float f12 = i12;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L);
        g.a aVar = l0.g.f413384b;
        while (true) {
            jFloatToRawIntBits = abstractC22399a.b(abstractC22443w0, jFloatToRawIntBits);
            abstractC22443w0 = abstractC22443w0.f40913r;
            if (abstractC22443w0.equals(abstractC22399a.f40721a.D())) {
                break;
            } else if (abstractC22399a.c(abstractC22443w0).containsKey(abstractC22348a)) {
                float fD2 = abstractC22399a.d(abstractC22443w0, abstractC22348a);
                jFloatToRawIntBits = (Float.floatToRawIntBits(fD2) << 32) | (Float.floatToRawIntBits(fD2) & 4294967295L);
            }
        }
        int iRound = Math.round(abstractC22348a instanceof C22387u ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)));
        HashMap map = abstractC22399a.f40729i;
        if (map.containsKey(abstractC22348a)) {
            int iIntValue = ((Number) kotlin.collections.P0.d(map, abstractC22348a)).intValue();
            C22387u c22387u = C22350b.f40439a;
            iRound = abstractC22348a.f40436a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound)).intValue();
        }
        map.put(abstractC22348a, Integer.valueOf(iRound));
    }

    public abstract long b(@Y61.k AbstractC22443w0 abstractC22443w0, long j12);

    @Y61.k
    public abstract Map<AbstractC22348a, Integer> c(@Y61.k AbstractC22443w0 abstractC22443w0);

    public abstract int d(@Y61.k AbstractC22443w0 abstractC22443w0, @Y61.k AbstractC22348a abstractC22348a);

    public final boolean e() {
        return this.f40723c || this.f40725e || this.f40726f || this.f40727g;
    }

    public final boolean f() {
        i();
        return this.f40728h != null;
    }

    public final void g() {
        this.f40722b = true;
        InterfaceC22401b interfaceC22401b = this.f40721a;
        InterfaceC22401b interfaceC22401bV = interfaceC22401b.V();
        if (interfaceC22401bV == null) {
            return;
        }
        if (this.f40723c) {
            interfaceC22401bV.Q();
        } else if (this.f40725e || this.f40724d) {
            interfaceC22401bV.requestLayout();
        }
        if (this.f40726f) {
            interfaceC22401b.Q();
        }
        if (this.f40727g) {
            interfaceC22401b.requestLayout();
        }
        interfaceC22401bV.t().g();
    }

    public final void h() {
        HashMap map = this.f40729i;
        map.clear();
        C1669a c1669a = new C1669a();
        InterfaceC22401b interfaceC22401b = this.f40721a;
        interfaceC22401b.N(c1669a);
        map.putAll(c(interfaceC22401b.D()));
        this.f40722b = false;
    }

    public final void i() {
        AbstractC22399a abstractC22399aT;
        AbstractC22399a abstractC22399aT2;
        boolean zE2 = e();
        InterfaceC22401b interfaceC22401b = this.f40721a;
        if (!zE2) {
            InterfaceC22401b interfaceC22401bV = interfaceC22401b.V();
            if (interfaceC22401bV == null) {
                return;
            }
            interfaceC22401b = interfaceC22401bV.t().f40728h;
            if (interfaceC22401b == null || !interfaceC22401b.t().e()) {
                InterfaceC22401b interfaceC22401b2 = this.f40728h;
                if (interfaceC22401b2 == null || interfaceC22401b2.t().e()) {
                    return;
                }
                InterfaceC22401b interfaceC22401bV2 = interfaceC22401b2.V();
                if (interfaceC22401bV2 != null && (abstractC22399aT2 = interfaceC22401bV2.t()) != null) {
                    abstractC22399aT2.i();
                }
                InterfaceC22401b interfaceC22401bV3 = interfaceC22401b2.V();
                interfaceC22401b = (interfaceC22401bV3 == null || (abstractC22399aT = interfaceC22401bV3.t()) == null) ? null : abstractC22399aT.f40728h;
            }
        }
        this.f40728h = interfaceC22401b;
    }
}
