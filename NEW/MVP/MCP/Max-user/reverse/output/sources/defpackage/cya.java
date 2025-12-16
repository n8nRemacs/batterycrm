package defpackage;

import android.content.Context;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class cya extends ypd {
    public final /* synthetic */ int b;

    public /* synthetic */ cya(int i) {
        this.b = i;
    }

    @Override // defpackage.ypd
    public final Object b(w5 w5Var) {
        switch (this.b) {
            case 0:
                return new b1b(w5Var.d(281), (nxg) w5Var.c(122));
            case 1:
                return new w0b(w5Var.d(397));
            case 2:
                return new y85(w5Var.d(548), w5Var.d(138), w5Var.d(8), w5Var.d(186));
            case 3:
                return new lf6(w5Var.d(186), w5Var.d(546), w5Var.d(548));
            case 4:
                return new uf6(w5Var.d(546), w5Var.d(186), w5Var.d(548));
            case 5:
                return new zs6(w5Var.d(8), w5Var.d(109), w5Var.d(374), w5Var.d(46));
            case 6:
                return new u07(w5Var.d(109), w5Var.d(61));
            case 7:
                return new v07(w5Var.d(109), w5Var.d(61));
            case 8:
                return new ybd((Context) w5Var.c(12));
            case 9:
                return new x7b((Context) w5Var.c(12), w5Var.d(HttpStatus.SC_FAILED_DEPENDENCY), w5Var.d(32), w5Var.d(76), w5Var.d(292), w5Var.d(97), w5Var.d(9));
            case 10:
                return new z0c((tw0) w5Var.c(49), (lzf) w5Var.c(8));
            case 11:
                return new yxd(w5Var.d(138), w5Var.d(132), w5Var.d(8));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new bh3((tw0) w5Var.c(49), (lzf) w5Var.c(8), w5Var.d(374));
            case 13:
                return new ohc((tw0) w5Var.c(49), (lzf) w5Var.c(8));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new kcc(w5Var);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new qb((lzf) w5Var.c(8), w5Var.d(123), w5Var.d(100), w5Var.d(46), w5Var.d(48), w5Var.d(HttpStatus.SC_MULTI_STATUS), w5Var.d(99));
            case 16:
                return new lcc(w5Var);
            case LangUtils.HASH_SEED /* 17 */:
                return new pfc((tw0) w5Var.c(49), w5Var.d(8));
            case 18:
                return new ga(w5Var.d(79), w5Var.d(109), w5Var.d(49));
            case 19:
                return new yl9((Context) w5Var.c(12), w5Var.d(483), w5Var.d(281), (lv4) w5Var.c(35), svc.onechat_react_text_size_small);
            case 20:
                return new o9d((Context) w5Var.c(12));
            case 21:
                return new wi9(w5Var.d(138), w5Var.d(186));
            case 22:
                return new ei9(w5Var.d(138), w5Var.d(186));
            case 23:
                return new ix9(w5Var.d(138), w5Var.d(186));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new htg(w5Var.d(138), w5Var.d(49), w5Var.d(46));
            case 25:
                return new d42(w5Var.d(138), w5Var.d(258), w5Var.d(186), w5Var.d(49));
            case 26:
                return new cv5(w5Var.d(79), w5Var.d(111), w5Var.d(12), w5Var.d(381), w5Var.d(378), w5Var.d(8), w5Var.d(46), w5Var.d(61), w5Var.d(245), w5Var.d(109), w5Var.d(138), w5Var.d(390));
            case 27:
                return new dx3((tw0) w5Var.c(49), (lzf) w5Var.c(8));
            case 28:
                return new gaf(w5Var.d(186), w5Var.d(109));
            default:
                return new vsf(w5Var.d(186), w5Var.d(109));
        }
    }
}
