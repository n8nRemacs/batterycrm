package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: Size.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/w0;", "Landroidx/compose/ui/node/K;", "Landroidx/compose/ui/v$d;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20633w0 extends v.d implements androidx.compose.ui.node.K {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public Direction f28771p;

    /* renamed from: q, reason: collision with root package name */
    public float f28772q;

    /* compiled from: Size.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.layout.w0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f28773l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.layout.K0 k02) {
            super(1);
            this.f28773l = k02;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            aVar.h(this.f28773l, 0, 0, 0.0f);
            return kotlin.G0.f406611a;
        }
    }

    @Override // androidx.compose.ui.node.K
    @Y61.k
    public final InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        int iL2;
        int iJ2;
        int i12;
        int i13;
        if (!C22712b.f(j12) || this.f28771p == Direction.f28233b) {
            iL2 = C22712b.l(j12);
            iJ2 = C22712b.j(j12);
        } else {
            int iRound = Math.round(C22712b.j(j12) * this.f28772q);
            int iL3 = C22712b.l(j12);
            iL2 = C22712b.j(j12);
            if (iRound < iL3) {
                iRound = iL3;
            }
            if (iRound <= iL2) {
                iL2 = iRound;
            }
            iJ2 = iL2;
        }
        if (!C22712b.e(j12) || this.f28771p == Direction.f28234c) {
            int iK2 = C22712b.k(j12);
            i12 = C22712b.i(j12);
            i13 = iK2;
        } else {
            int iRound2 = Math.round(C22712b.i(j12) * this.f28772q);
            int iK3 = C22712b.k(j12);
            i13 = C22712b.i(j12);
            if (iRound2 < iK3) {
                iRound2 = iK3;
            }
            if (iRound2 <= i13) {
                i13 = iRound2;
            }
            i12 = i13;
        }
        androidx.compose.ui.layout.K0 k0I = interfaceC22363h0.I(C22713c.a(iL2, iJ2, i13, i12));
        return interfaceC22369k0.L0(k0I.f40345b, k0I.f40346c, kotlin.collections.P0.c(), new a(k0I));
    }
}
