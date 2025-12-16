package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import ru.ok.android.externcalls.BuildConfig;

/* loaded from: classes2.dex */
public final class eeg extends u08 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eeg(Context context, int i) {
        super(0);
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        String str;
        switch (this.a) {
            case 0:
                String strB = d6j.b();
                Context context = this.b;
                if (strB.equals(context.getPackageName())) {
                    str = "tracer";
                } else {
                    str = "tracer-" + Uri.encode(dnf.p(strB, ':', '-', false));
                }
                File file = new File(context.getCacheDir(), str);
                nbj.b(file);
                return jz5.g(file, "settings.data");
            default:
                Context applicationContext = this.b.getApplicationContext();
                oeg oegVar = new oeg();
                oegVar.b = new n1f("xrRYkU895jUPp2YZo1sxmtFadnlX1oHyouadIxpNzAp");
                qeg qegVar = new qeg(applicationContext, BuildConfig.LIBRARY_PACKAGE_NAME, new xpb(oegVar));
                qegVar.b("calls-sdk-version", "125.1.0.73.1");
                return qegVar;
        }
    }
}
