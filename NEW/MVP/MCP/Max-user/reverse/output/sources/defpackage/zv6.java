package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.messages.a;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class zv6 extends t2f {
    public final /* synthetic */ int b;

    public /* synthetic */ zv6(int i) {
        this.b = i;
    }

    @Override // defpackage.t2f
    public final Object b(w5 w5Var) {
        switch (this.b) {
            case 0:
                return new vq((Context) w5Var.c(12));
            case 1:
                return new zh7((Context) w5Var.c(12));
            case 2:
                return yh7.a;
            case 3:
                return new q5b(w5Var.d(8), w5Var.d(137), w5Var.d(582), w5Var.d(540), w5Var.d(581), w5Var.d(580));
            case 4:
                return new k0a((q5b) w5Var.c(HttpStatus.SC_LOCKED), (lzf) w5Var.c(8), (qi8) w5Var.c(384), w5Var.d(581), w5Var.d(580));
            case 5:
                return new dl7(w5Var);
            case 6:
                return new zoc(w5Var.d(583), w5Var.d(580), (Context) w5Var.c(12));
            case 7:
                return new xo7((Context) w5Var.c(12), (lv4) w5Var.c(35));
            case 8:
                return new hs7(w5Var.d(47), w5Var.d(46), w5Var.d(487));
            case 9:
                return new c28();
            case 10:
                return (jq) w5Var.c(630);
            case 11:
                Context context = (Context) w5Var.c(12);
                bwf bwfVarD = w5Var.d(70);
                bwf bwfVarD2 = w5Var.d(670);
                g5i g5iVar = (g5i) w5Var.c(169);
                w5Var.getClass();
                return new jq(context, bwfVarD, bwfVarD2, g5iVar, (lk4) w5Var.c(425), w5Var.d(292), w5Var.d(472), w5Var.d(HttpStatus.SC_FAILED_DEPENDENCY), w5Var.d(398), w5Var.d(428), w5Var.d(650), w5Var.d(97));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new yde((Context) w5Var.c(12));
            case 13:
                Context context2 = (Context) w5Var.c(12);
                yi5 yi5Var = (yi5) w5Var.c(9);
                z7c z7cVar = (z7c) w5Var.c(70);
                b8a b8aVar = (b8a) w5Var.c(634);
                e30 e30Var = (e30) w5Var.c(648);
                ur3 ur3Var = (ur3) w5Var.c(139);
                f28 f28Var = (f28) w5Var.c(628);
                lv4 lv4Var = (lv4) w5Var.c(77);
                zg zgVar = (zg) w5Var.c(HttpStatus.SC_NO_CONTENT);
                qi9 qi9Var = (qi9) w5Var.c(143);
                jq jqVar = (jq) w5Var.c(630);
                tw0 tw0Var = (tw0) w5Var.c(49);
                ve2 ve2Var = (ve2) w5Var.c(97);
                zk5 zk5Var = (zk5) w5Var.c(651);
                return new v39(context2, yi5Var, z7cVar, b8aVar, e30Var, ur3Var, f28Var, lv4Var, zgVar, qi9Var, jqVar, tw0Var, ve2Var, zk5Var);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new dza((so3) w5Var.c(488), (Context) w5Var.c(12), w5Var.d(500));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new xeb(w5Var.d(530), (Context) w5Var.c(12), (z7c) w5Var.c(70), w5Var.d(500));
            case 16:
                return new sd8((tw0) w5Var.c(49), (a84) w5Var.c(84), (z7c) w5Var.c(70), (de8) w5Var.c(492), (lzf) w5Var.c(8), ((Context) w5Var.c(12)).getContentResolver(), (qx5) w5Var.c(137));
            case LangUtils.HASH_SEED /* 17 */:
                return ((sd8) w5Var.c(493)).f;
            case 18:
                return new hch((Context) w5Var.c(12), (ur3) w5Var.c(139), (f28) w5Var.c(628), (m0g) w5Var.c(HttpStatus.SC_FORBIDDEN), (z7c) w5Var.c(70), (hwa) w5Var.c(79), (d1g) w5Var.c(284), (lr3) w5Var.c(181), (tw0) w5Var.c(49), (qx5) w5Var.c(137));
            case 19:
                return zm.a();
            case 20:
                Context context3 = (Context) w5Var.c(12);
                age ageVar = (age) w5Var.c(47);
                lzf lzfVar = (lzf) w5Var.c(8);
                iz5 iz5Var = (iz5) w5Var.c(111);
                qi9 qi9Var2 = (qi9) w5Var.c(143);
                pb3 pb3Var = (pb3) w5Var.c(46);
                tw0 tw0Var2 = (tw0) w5Var.c(49);
                tih tihVar = (tih) w5Var.c(76);
                o3b o3bVar = (o3b) w5Var.c(55);
                a84 a84Var = (a84) w5Var.c(84);
                return new b8a(context3, ageVar, lzfVar, iz5Var, qi9Var2, pb3Var, tw0Var2, tihVar, o3bVar, a84Var, w5Var.d(43), w5Var.d(109));
            case 21:
                return new f0g((yi5) w5Var.c(9), (a84) w5Var.c(84), w5Var.d(643), w5Var.d(88), w5Var.d(176), w5Var.d(46), w5Var.d(31), w5Var.d(79), (lzf) w5Var.c(8), w5Var.d(147));
            case 22:
                return new ae7((Context) w5Var.c(12));
            case 23:
                return new a5i((a) w5Var.c(637), (g5i) w5Var.c(169), w5Var.d(56));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new a(w5Var.d(88), w5Var.d(630), w5Var.d(139), w5Var.d(77), w5Var.d(80), w5Var.d(32), w5Var.d(170), w5Var.d(186), w5Var.d(168), w5Var.d(210), w5Var.d(97), w5Var.d(185), w5Var.d(647), w5Var.d(HttpStatus.SC_FORBIDDEN), w5Var.d(154), w5Var.d(188), w5Var.d(268), w5Var.d(9));
            case 25:
                return new z10((Context) w5Var.c(14), (p00) w5Var.c(638), (m4e) w5Var.c(190));
            case 26:
                return (z10) w5Var.c(610);
            case 27:
                return new p00((qx5) w5Var.c(137), (m0g) w5Var.c(HttpStatus.SC_FORBIDDEN), (yi5) w5Var.c(9));
            case 28:
                m0g m0gVar = (m0g) w5Var.c(HttpStatus.SC_FORBIDDEN);
                jbh jbhVar = new jbh();
                Collections.newSetFromMap(new ConcurrentHashMap());
                ((n0g) m0gVar).a();
                return jbhVar;
            default:
                return new do8((c0g) w5Var.c(640));
        }
    }
}
