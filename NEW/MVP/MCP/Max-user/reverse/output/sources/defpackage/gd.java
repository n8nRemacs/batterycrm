package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import one.me.android.concurrent.SingleCoreActivity;

/* loaded from: classes2.dex */
public final class gd implements iv4 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public gd(k18 k18Var, k18 k18Var2, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = k18Var;
                this.c = k18Var2;
                this.d = new hbd(ucf.a(Collections.singletonList(new yg4(pu4.b.incrementAndGet(), new r5g("Пуши заново"), yud.J1, null, null, 24))));
                break;
            default:
                long jIncrementAndGet = pu4.b.incrementAndGet();
                this.b = k18Var;
                this.c = k18Var2;
                this.d = new hbd(ucf.a(Collections.singletonList(new yg4(jIncrementAndGet, new r5g("Отправить аналитику"), yud.X, null, null, 24))));
                break;
        }
    }

    @Override // defpackage.iv4
    public final mcf b() {
        switch (this.a) {
            case 0:
                return (hbd) this.d;
            case 1:
                return (hbd) this.d;
            default:
                return (tcf) this.c;
        }
    }

    @Override // defpackage.iv4
    public final void d(yg4 yg4Var) {
        switch (this.a) {
            case 0:
                ((fg8) ((k18) this.c).getValue()).f("devtool", true);
                ccb ccbVar = (ccb) ((k18) this.b).getValue();
                ccbVar.h("Логи отправлены");
                ccbVar.i();
                break;
            case 1:
                n8a n8aVar = new n8a((Object) null);
                Iterator it = ((ve2) ((k18) this.b).getValue()).I(null).iterator();
                while (it.hasNext()) {
                    pb2 pb2Var = (pb2) it.next();
                    if (pb2Var.b.m > 0) {
                        n8aVar.a(pb2Var.a);
                    }
                }
                ((y7b) ((k18) this.c).getValue()).f(n8aVar);
                break;
            default:
                Context context = (Context) this.b;
                wqi.c(h2f.class.getName(), "switch", new Object[0]);
                try {
                    context.getPackageManager().setComponentEnabledSetting(new ComponentName("ru.oneme.app", SingleCoreActivity.class.getName()), h2f.b(context) ? 2 : 1, 1);
                } catch (Throwable th) {
                    wqi.e(h2f.class.getName(), "fail to update component state", th);
                }
                ((tcf) this.c).m(null, e());
                ccb ccbVar2 = (ccb) ((w5) this.d).c(454);
                ccbVar2.h("Перезапустите приложение");
                ccbVar2.b("Для применения конфига перезапустите приложение");
                ccbVar2.i();
                break;
        }
    }

    public List e() {
        SpannedString spannedString;
        boolean zB = h2f.b((Context) this.b);
        long jIncrementAndGet = pu4.b.incrementAndGet();
        r5g r5gVar = new r5g("Включить single-core mode");
        if (zB) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            gbj.b(spannableStringBuilder, "включено‼️", new pe6(-65536));
            spannedString = new SpannedString(spannableStringBuilder);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            gbj.b(spannableStringBuilder2, "выключено", new pe6(Color.parseColor("#4CAF50")));
            spannedString = new SpannedString(spannableStringBuilder2);
        }
        return Collections.singletonList(new yg4(jIncrementAndGet, r5gVar, 0, new r5g(spannedString), new xg4(zB), 4));
    }

    public gd(w5 w5Var) {
        this.a = 2;
        this.d = w5Var;
        this.b = (Context) w5Var.c(12);
        this.c = ucf.a(e());
    }
}
