package defpackage;

import android.content.Context;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class e4e extends t2f {
    public final /* synthetic */ int b;

    public /* synthetic */ e4e(int i) {
        this.b = i;
    }

    @Override // defpackage.t2f
    public final Object b(w5 w5Var) {
        switch (this.b) {
            case 0:
                return new o04(w5Var.d(98), w5Var.d(89), w5Var.d(79), w5Var.d(49));
            case 1:
                return ((OneMeRoomDatabase) w5Var.c(195)).G();
            case 2:
                return ((OneMeRoomDatabase) w5Var.c(195)).B();
            case 3:
                return ((OneMeRoomDatabase) w5Var.c(195)).C();
            case 4:
                return new uqc((age) w5Var.c(47), v7j.a(new q4e(w5Var, 26)), v7j.a(new q4e(w5Var, 27)));
            case 5:
                bwf bwfVarD = w5Var.d(170);
                bwf bwfVarD2 = w5Var.d(32);
                bwf bwfVarD3 = w5Var.d(35);
                bwf bwfVarD4 = w5Var.d(49);
                yi5 yi5Var = (yi5) w5Var.c(9);
                bwf bwfVarD5 = w5Var.d(56);
                bwf bwfVarD6 = w5Var.d(186);
                bwf bwfVarD7 = w5Var.d(171);
                qja qjaVar = (qja) w5Var.c(289);
                bwf bwfVarD8 = w5Var.d(182);
                oje ojeVar = (oje) w5Var.c(180);
                bwf bwfVarD9 = w5Var.d(235);
                w5Var.getClass();
                return new u0g(bwfVarD, bwfVarD2, bwfVarD3, bwfVarD4, yi5Var, bwfVarD5, bwfVarD6, bwfVarD7, qjaVar, bwfVarD8, ojeVar, bwfVarD9);
            case 6:
                return new rpa(v7j.a(new q4e(w5Var, 28)), v7j.a(new q4e(w5Var, 29)));
            case 7:
                return ((OneMeRoomDatabase) w5Var.c(195)).I();
            case 8:
                return new dt2(w5Var.d(341), w5Var.d(342), w5Var.d(336), w5Var.d(32), w5Var.d(109), w5Var.d(35), w5Var.d(HttpStatus.SC_FAILED_DEPENDENCY), w5Var.d(122));
            case 9:
                return new wc8((Context) w5Var.c(12), (z7c) w5Var.c(32), w5Var.d(97), w5Var.d(98), w5Var.d(143), w5Var.d(HttpStatus.SC_FAILED_DEPENDENCY), w5Var.d(344), w5Var.d(345), w5Var.d(322), w5Var.d(288));
            case 10:
                return new it5((Context) w5Var.c(12), (z7c) w5Var.c(32), w5Var.d(288), w5Var.d(343), w5Var.d(336), w5Var.d(322), w5Var.d(97), w5Var.d(98), w5Var.d(HttpStatus.SC_FAILED_DEPENDENCY), w5Var.d(344), w5Var.d(143), w5Var.d(HttpStatus.SC_GONE), w5Var.d(347), (lzf) w5Var.c(8));
            case 11:
                bwf bwfVarD10 = w5Var.d(334);
                w5Var.getClass();
                return new hpa(bwfVarD10, w5Var.d(8), w5Var.d(122));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new uha((Context) w5Var.c(12), (ona) w5Var.c(345));
            case 13:
                return new ona((f7b) w5Var.c(HttpStatus.SC_GONE), v7j.a(new r4e(w5Var, 1)), v7j.a(new r4e(w5Var, 2)), v7j.a(new r4e(w5Var, 3)), v7j.a(new r4e(w5Var, 0)));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new qu3(w5Var.d(123), w5Var.d(46));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                bwf bwfVarD11 = w5Var.d(346);
                w5Var.getClass();
                return new l6g(bwfVarD11);
            case 16:
                return new vie(w5Var.d(9), w5Var.d(180), w5Var.d(79), w5Var.d(182), (di8) w5Var.c(6));
            case LangUtils.HASH_SEED /* 17 */:
                return new ye7(w5Var.d(137), w5Var.d(8));
            case 18:
                return new et6(w5Var.d(79), w5Var.d(HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED));
            case 19:
                w5Var.d(56);
                w5Var.d(143);
                w5Var.d(215);
                w5Var.d(245);
                w5Var.d(137);
                return new u1j(13);
            case 20:
                return hb8.L;
            case 21:
                return new zm8((ve2) w5Var.c(97), (qv3) w5Var.c(98), (o7e) w5Var.c(99), (v04) w5Var.c(100), ((n0g) ((m0g) w5Var.c(HttpStatus.SC_FORBIDDEN))).a(), ((n0g) ((m0g) w5Var.c(HttpStatus.SC_FORBIDDEN))).b(), (o0g) w5Var.c(183), (tw0) w5Var.c(49), (d1g) w5Var.c(284), (yi5) w5Var.c(9), (age) w5Var.c(47));
            case 22:
                return (qw5) ((jq) w5Var.c(437)).j.getValue();
            case 23:
                em4 em4Var = (em4) w5Var.c(280);
                ((n0g) ((m0g) w5Var.c(HttpStatus.SC_FORBIDDEN))).a();
                return new zl4(em4Var);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                v7j.a(new r4e(w5Var, 14));
                v7j.a(new r4e(w5Var, 23));
                v7j.a(new r4e(w5Var, 24));
                v7j.a(new r4e(w5Var, 4));
                v7j.a(new r4e(w5Var, 5));
                v7j.a(new r4e(w5Var, 6));
                v7j.a(new r4e(w5Var, 7));
                v7j.a(new r4e(w5Var, 8));
                v7j.a(new r4e(w5Var, 9));
                v7j.a(new r4e(w5Var, 10));
                v7j.a(new r4e(w5Var, 11));
                v7j.a(new r4e(w5Var, 12));
                v7j.a(new r4e(w5Var, 13));
                v7j.a(new r4e(w5Var, 15));
                v7j.a(new r4e(w5Var, 16));
                v7j.a(new r4e(w5Var, 17));
                v7j.a(new r4e(w5Var, 18));
                v7j.a(new r4e(w5Var, 19));
                v7j.a(new r4e(w5Var, 20));
                v7j.a(new r4e(w5Var, 21));
                v7j.a(new r4e(w5Var, 22));
                return new wha(25);
            case 25:
                v7j.a(new r4e(w5Var, 25));
                v7j.a(new r4e(w5Var, 26));
                return new bld();
            case 26:
                Context context = (Context) w5Var.c(12);
                v7j.a(new r4e(w5Var, 28));
                return new mw5(context, v7j.a(new r4e(w5Var, 29)), v7j.a(new s4e(w5Var, 0)), v7j.a(new r4e(w5Var, 27)));
            case 27:
                return new m1g((o0g) w5Var.c(183));
            case 28:
                return new hwa(w5Var.d(45), w5Var.d(32), w5Var.d(31), w5Var.d(186), new bwf(new b31(w5Var, 19)));
            default:
                aug augVar = (aug) w5Var.c(HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE);
                wef wefVar = (wef) w5Var.c(371);
                m0g m0gVar = (m0g) w5Var.c(HttpStatus.SC_FORBIDDEN);
                m0gVar.getClass();
                return new gvg(augVar, wefVar, ((n0g) m0gVar).a(), v7j.a(new s4e(w5Var, 1)));
        }
    }
}
