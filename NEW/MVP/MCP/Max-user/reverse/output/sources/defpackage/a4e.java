package defpackage;

import android.content.Context;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class a4e implements io7 {
    public final /* synthetic */ int a;

    public /* synthetic */ a4e(int i) {
        this.a = i;
    }

    @Override // defpackage.io7
    public final Object a(w5 w5Var) {
        switch (this.a) {
            case 0:
                return new zsg(w5Var.d(79), w5Var.d(61), w5Var.d(8), w5Var.d(HttpStatus.SC_PRECONDITION_FAILED), w5Var.d(109), w5Var.d(210), w5Var.d(385));
            case 1:
                return ((OneMeRoomDatabase) ((q9b) w5Var.c(193)).l()).X();
            case 2:
                return ((OneMeRoomDatabase) ((q9b) w5Var.c(193)).l()).v();
            case 3:
                return ((OneMeRoomDatabase) ((q9b) w5Var.c(193)).l()).D();
            case 4:
                return new c27((g5i) w5Var.c(169));
            case 5:
                return new eg4((g5i) w5Var.c(169));
            case 6:
                return new qna((g5i) w5Var.c(169));
            case 7:
                return new is6((hwa) w5Var.c(79), (tw0) w5Var.c(49), (ve2) w5Var.c(97));
            case 8:
                return new otg(w5Var.d(79), w5Var.d(61), w5Var.d(46), w5Var.d(82), w5Var.d(391), w5Var.d(HttpStatus.SC_PRECONDITION_FAILED), w5Var.d(109), w5Var.d(210), w5Var.d(385));
            case 9:
                return new ftg(w5Var.d(79), w5Var.d(61), w5Var.d(8));
            case 10:
                return new j5b((Context) w5Var.c(12), (f7b) w5Var.c(HttpStatus.SC_GONE));
            case 11:
                return mpe.a;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return eqe.a;
            case 13:
                return jre.a;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new yre(0);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new yre(7);
            case 16:
                return rue.b;
            case LangUtils.HASH_SEED /* 17 */:
                return new gd(w5Var);
            case 18:
                return qaf.a;
            case 19:
                return (b9h) w5Var.c(161);
            case 20:
                return xgf.a;
            case 21:
                return ohf.a;
            case 22:
                return vif.a;
            case 23:
                return fjf.a;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new w6g(w5Var);
            case 25:
                return new efe("Новый файловый загрузчик", PmsKey.f111newuploaderenabled, false);
            case 26:
                return new efe(PmsKey.f147uploadreusability);
            case 27:
                return new efe(PmsKey.f119onevideouploader);
            case 28:
                gu5 gu5Var = (gu5) ((rt5) w5Var.c(48));
                if (((Boolean) gu5Var.x.D(gu5Var, gu5.S[11])).booleanValue()) {
                    return new cqd(new bwf(new t4e(w5Var, 22)), w5Var.d(450), (tgg) w5Var.c(438));
                }
                return new hbg(new bwf(new t4e(w5Var, 23)), w5Var.d(450), (tgg) w5Var.c(438));
            default:
                return gmg.a;
        }
    }
}
