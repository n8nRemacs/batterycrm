package com.vk.id.group.subscription.compose.util;

import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.text.L;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.layout.P;
import androidx.compose.ui.text.G;
import androidx.compose.ui.text.o0;
import androidx.compose.ui.text.x0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.v;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import java.util.NoSuchElementException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import okhttp3.internal.http2.Http2;

/* compiled from: TightWrapText.kt */
@s0
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0010²\u0006\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\n@\nX\u008a\u008e\u0002"}, d2 = {"", "text", "Landroidx/compose/ui/v;", "modifier", "Landroidx/compose/ui/text/x0;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "maxLines", "Landroidx/compose/ui/text/style/s;", "overflow", "Lkotlin/G0;", "TightWrapText-pNBRTJQ", "(Ljava/lang/String;Landroidx/compose/ui/v;Landroidx/compose/ui/text/x0;IILandroidx/compose/runtime/A;I)V", "TightWrapText", "Landroidx/compose/ui/text/o0;", "textLayoutResult", "group-subscription-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TightWrapTextKt {
    @InterfaceC22132o
    @InterfaceC22181t
    /* renamed from: TightWrapText-pNBRTJQ, reason: not valid java name */
    public static final void m118TightWrapTextpNBRTJQ(@k final String str, @k final v vVar, @k final x0 x0Var, final int i12, final int i13, @l A a12, final int i14) {
        int i15;
        B bE2 = a12.E(-86488437);
        if ((i14 & 6) == 0) {
            i15 = (bE2.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= bE2.B(x0Var) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= bE2.m(i12) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= bE2.m(i13) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i15 & 9363) == 9362 && bE2.c()) {
            bE2.f();
        } else {
            bE2.I(-524635391);
            Object objT = bE2.t();
            A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = C22126m3.g(null);
                bE2.H(objT);
            }
            InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
            bE2.X(false);
            bE2.I(-524631270);
            Object objT2 = bE2.t();
            if (objT2 == c1651a) {
                objT2 = new a(interfaceC22204y1, 0);
                bE2.H(objT2);
            }
            bE2.X(false);
            v vVarA = P.a(vVar, (q) objT2);
            bE2.I(-524603219);
            Object objT3 = bE2.t();
            if (objT3 == c1651a) {
                objT3 = new b(0, interfaceC22204y1);
                bE2.H(objT3);
            }
            bE2.X(false);
            L.d(str, vVarA, x0Var, (Y41.l) objT3, i13, false, i12, 0, null, bE2, (i15 & 14) | 3072 | (i15 & 896) | (57344 & i15) | ((i15 << 9) & 3670016), 416);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new p() { // from class: com.vk.id.group.subscription.compose.util.c
                @Override // Y41.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    String str2 = str;
                    v vVar2 = vVar;
                    x0 x0Var2 = x0Var;
                    int i16 = i13;
                    int i17 = i14;
                    return TightWrapTextKt.TightWrapText_pNBRTJQ$lambda$10(str2, vVar2, x0Var2, i12, i16, i17, (A) obj, iIntValue);
                }
            };
        }
    }

    private static final o0 TightWrapText_pNBRTJQ$lambda$1(InterfaceC22204y1<o0> interfaceC22204y1) {
        return interfaceC22204y1.getF42167b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 TightWrapText_pNBRTJQ$lambda$10(String str, v vVar, x0 x0Var, int i12, int i13, int i14, A a12, int i15) {
        m118TightWrapTextpNBRTJQ(str, vVar, x0Var, i12, i13, a12, C22066f2.a(i14 | 1));
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC22367j0 TightWrapText_pNBRTJQ$lambda$7$lambda$6(InterfaceC22204y1 interfaceC22204y1, InterfaceC22369k0 interfaceC22369k0, InterfaceC22363h0 interfaceC22363h0, C22712b c22712b) {
        final K0 k0I = interfaceC22363h0.I(c22712b.f42843a);
        o0 o0VarTightWrapText_pNBRTJQ$lambda$1 = TightWrapText_pNBRTJQ$lambda$1(interfaceC22204y1);
        G g12 = o0VarTightWrapText_pNBRTJQ$lambda$1.f42527b;
        int i12 = g12.f41921f;
        if (i12 == 0) {
            return interfaceC22369k0.L0(k0I.f40345b, k0I.f40346c, P0.c(), new O11.c(k0I, 3));
        }
        kotlin.ranges.k it = s.r(0, i12).iterator();
        if (!it.f406910d) {
            throw new NoSuchElementException();
        }
        final float fG2 = o0VarTightWrapText_pNBRTJQ$lambda$1.g(it.a());
        while (it.f406910d) {
            fG2 = Math.min(fG2, o0VarTightWrapText_pNBRTJQ$lambda$1.g(it.a()));
        }
        kotlin.ranges.k it2 = s.r(0, g12.f41921f).iterator();
        if (!it2.f406910d) {
            throw new NoSuchElementException();
        }
        float fH2 = o0VarTightWrapText_pNBRTJQ$lambda$1.h(it2.a());
        while (it2.f406910d) {
            fH2 = Math.max(fH2, o0VarTightWrapText_pNBRTJQ$lambda$1.h(it2.a()));
        }
        return interfaceC22369k0.L0((int) Math.ceil(fH2 - fG2), k0I.f40346c, P0.c(), new Y41.l() { // from class: com.vk.id.group.subscription.compose.util.d
            @Override // Y41.l
            public final Object invoke(Object obj) {
                return TightWrapTextKt.TightWrapText_pNBRTJQ$lambda$7$lambda$6$lambda$5(k0I, fG2, (K0.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 TightWrapText_pNBRTJQ$lambda$7$lambda$6$lambda$3(K0 k02, K0.a aVar) {
        aVar.h(k02, 0, 0, 0.0f);
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 TightWrapText_pNBRTJQ$lambda$7$lambda$6$lambda$5(K0 k02, float f12, K0.a aVar) {
        aVar.e(k02, -((int) Math.floor(f12)), 0, 0.0f);
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 TightWrapText_pNBRTJQ$lambda$9$lambda$8(InterfaceC22204y1 interfaceC22204y1, o0 o0Var) {
        interfaceC22204y1.setValue(o0Var);
        return G0.f406611a;
    }
}
