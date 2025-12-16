package defpackage;

import android.content.Context;
import one.me.sdk.arch.Widget;

/* loaded from: classes2.dex */
public final /* synthetic */ class u7g implements em6 {
    public final /* synthetic */ int a;

    public /* synthetic */ u7g(int i) {
        this.a = i;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return new pu4(pu4.b.incrementAndGet());
            case 1:
                return Long.valueOf(((fh9) obj).a);
            case 2:
                return Long.valueOf(((si9) obj).p());
            case 3:
                return Long.valueOf(((si9) obj).a);
            case 4:
                return ((si9) obj).t0;
            case 5:
                return ((ar2) obj).a.toString();
            case 6:
                odh odhVar = new odh((Context) obj);
                odhVar.setVisibility(8);
                odhVar.setAlpha(0.0f);
                return odhVar;
            case 7:
                return String.valueOf(((edh) obj).b);
            case 8:
                return Widget.findWidgetByScopeId_qk3jasM$lambda$17((ytd) obj);
            case 9:
                return Widget.findWidgetByScopeId_qk3jasM$lambda$17$lambda$16((bud) obj);
            default:
                return ho7.i("worker_class_name LIKE '", (String) obj, "%'");
        }
    }
}
