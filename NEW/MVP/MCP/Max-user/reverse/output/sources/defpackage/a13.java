package defpackage;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class a13 extends t2f {
    public final /* synthetic */ int b;

    public /* synthetic */ a13(int i) {
        this.b = i;
    }

    @Override // defpackage.t2f
    public final Object b(w5 w5Var) {
        int i;
        switch (this.b) {
            case 0:
                return new c5b((va4) w5Var.c(149), (lzf) w5Var.c(8), (ch2) w5Var.c(223), (tw0) w5Var.c(49), (nxg) w5Var.c(122));
            case 1:
                return new yl8(((q2b) ((lzf) qn3.i.getValue())).c());
            case 2:
                return new s6b(((q2b) ((lzf) qn3.i.getValue())).f());
            case 3:
                return new kl4(((q2b) ((lzf) qn3.i.getValue())).a());
            case 4:
                return (g4b) qn3.g.getValue();
            case 5:
                return (m0g) qn3.h.getValue();
            case 6:
                return (lzf) qn3.i.getValue();
            case 7:
                return new wha(28);
            case 8:
                return new jbe(28);
            case 9:
                m0g m0gVar = (m0g) qn3.h.getValue();
                m0gVar.getClass();
                return new n0e(((n0g) m0gVar).a());
            case 10:
                return new o0e((j0e) ((n0g) ((m0g) qn3.h.getValue())).h.getValue());
            case 11:
                return new ms7(((q2b) ((lzf) qn3.i.getValue())).b());
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new ls7(((q2b) ((lzf) qn3.i.getValue())).b());
            case 13:
                bwf bwfVarD = w5Var.d(8);
                bwf bwfVarD2 = w5Var.d(123);
                bwf bwfVarD3 = w5Var.d(HttpStatus.SC_PARTIAL_CONTENT);
                bwf bwfVarD4 = w5Var.d(HttpStatus.SC_MULTI_STATUS);
                urb urbVar = (urb) w5Var.c(11);
                Context context = (Context) w5Var.c(12);
                bwf bwfVarD5 = w5Var.d(100);
                return new iy3(bwfVarD, bwfVarD2, w5Var.d(HttpStatus.SC_RESET_CONTENT), bwfVarD3, bwfVarD4, bwfVarD5, w5Var.d(110), w5Var.d(46), w5Var.d(48), urbVar, context, (dx3) w5Var.c(386));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new is7(w5Var.d(46), w5Var.d(151), w5Var.d(88));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new ci4(w5Var.a(1));
            case 16:
                return new ii4(w5Var.d(115), new bwf(new b31(w5Var, 3)), w5Var.d(118), w5Var.d(119));
            case LangUtils.HASH_SEED /* 17 */:
                return new fv4(w5Var.d(1));
            case 18:
                return new yg6(w5Var.d(46), w5Var.d(123), w5Var.d(573), w5Var.d(109), w5Var.d(576));
            case 19:
                return new of6(w5Var);
            case 20:
                nv4 nv4Var = (nv4) w5Var.c(86);
                int[] iArr = {((jj5) qn3.d.getValue()).c, ((jj5) qn3.e.getValue()).c, qn3.f.c};
                int iMax = 1;
                for (int i2 = 0; i2 < 3; i2++) {
                    iMax = Math.max(iMax, iArr[i2]);
                }
                int iOrdinal = nv4Var.ordinal();
                if (iOrdinal == 0) {
                    iMax /= 2;
                    if (iMax < 2) {
                        iMax = 2;
                    }
                } else if (iOrdinal != 1 && iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                SparseIntArray sparseIntArray = new SparseIntArray(1);
                sparseIntArray.put(16384, iMax);
                int i3 = 2097152;
                w5c w5cVar = new w5c(iMax * 16384, 2097152, sparseIntArray, -1);
                int iOrdinal2 = nv4Var.ordinal();
                if (iOrdinal2 == 0) {
                    i = 32768;
                } else if (iOrdinal2 == 1) {
                    i = 65536;
                } else {
                    if (iOrdinal2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = 131072;
                }
                int iOrdinal3 = nv4Var.ordinal();
                if (iOrdinal3 != 0) {
                    if (iOrdinal3 == 1) {
                        i3 = 3145728;
                    } else {
                        if (iOrdinal3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i3 = 4194304;
                    }
                }
                int i4 = iMax * i3;
                SparseIntArray sparseIntArray2 = new SparseIntArray(i3);
                while (i <= i3) {
                    sparseIntArray2.put(i, iMax);
                    i *= 2;
                }
                w5c w5cVar2 = new w5c(i3, i4, sparseIntArray2, iMax);
                fa6 fa6Var = new fa6();
                fa6Var.a = "legacy";
                fa6Var.c = (rf9) w5Var.c(622);
                fa6Var.d = w5cVar;
                fa6Var.b = w5cVar2;
                return new v5c(new uy5(fa6Var));
            case 21:
                return ((v5c) w5Var.c(617)).a();
            case 22:
                ef7 ef7Var = (ef7) w5Var.c(618);
                ef7Var.getClass();
                return new ff7(ef7Var);
            case 23:
                Context context2 = (Context) w5Var.c(12);
                bwf bwfVarD6 = w5Var.d(111);
                mx4 mx4Var = new mx4(context2);
                mx4Var.a = "fresco";
                mx4Var.b = new lx4(1, bwfVarD6);
                mx4Var.c = 314572800L;
                mx4Var.d = 104857600L;
                mx4Var.e = 52428800L;
                nx4 nx4Var = new nx4(mx4Var);
                ef7 ef7Var2 = new ef7(context2);
                ef7Var2.g = new h0g(w5Var.d(92));
                ef7Var2.h = (v5c) w5Var.c(617);
                ef7Var2.f = nx4Var;
                ef7Var2.j = nx4Var;
                j34 j34Var = new j34();
                j34Var.a(h2f.b, kl6.a, new jl6(w5Var.d(617), w5Var.d(621)));
                j34Var.a(z7i.a, ad8.a, new bd8((Context) w5Var.c(12), ((q2b) ((lzf) w5Var.c(8))).c()));
                ef7Var2.k = new k34(j34Var);
                ef7Var2.c = v25.a;
                ef7Var2.a = new dzf(0);
                ef7Var2.i = Collections.singleton(new gnd());
                ef7Var2.d = new zva(w5Var.d(56));
                bwf bwfVarD7 = w5Var.d(46);
                tih tihVar = (tih) w5Var.c(76);
                s7c s7cVar = new s7c();
                s7cVar.a = bwfVarD7;
                s7cVar.b = new usd(3);
                tihVar.c(new il6(0, s7cVar));
                ef7Var2.e = s7cVar;
                return ef7Var2;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                w5Var.c(619);
                return gf7.g();
            case 25:
                return ((gf7) w5Var.c(583)).f();
            case 26:
                return ((gf7) w5Var.c(583)).i();
            case 27:
                return ((gf7) w5Var.c(583)).h();
            case 28:
                return new vw6((Context) w5Var.c(12), w5Var.d(56), w5Var.d(47), (tsd) w5Var.c(107), (lzf) w5Var.c(8));
            default:
                return new xh7();
        }
    }
}
