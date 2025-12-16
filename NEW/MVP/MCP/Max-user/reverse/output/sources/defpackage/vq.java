package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.google.android.play.core.install.InstallException;

/* loaded from: classes2.dex */
public final class vq implements tq {
    public final qni b;

    public vq(Context context) {
        w7c w7cVar;
        synchronized (yei.class) {
            try {
                if (yei.a == null) {
                    Context applicationContext = context.getApplicationContext();
                    yei.a = new w7c(new qc4(applicationContext != null ? applicationContext : context));
                }
                w7cVar = yei.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b = (qni) ((yci) w7cVar.a).d();
    }

    public final void a(Activity activity) {
        ybj ybjVarE;
        if (!((vw6) ((alf) uzg.a.getAccessor().c(80))).a()) {
            tq.a.getClass();
            e6j.c(activity, sq.b);
            return;
        }
        qni qniVar = this.b;
        p6j p6jVar = qniVar.a;
        String packageName = qniVar.b.getPackageName();
        ulc ulcVar = p6j.e;
        jcj jcjVar = p6jVar.a;
        if (jcjVar == null) {
            Object[] objArr = {-9};
            ulcVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", ulc.w((String) ulcVar.b, "onError(%d)", objArr));
            }
            ybjVarE = n5e.e(new InstallException(-9));
        } else {
            ulcVar.v("requestUpdateInfo(%s)", packageName);
            n2g n2gVar = new n2g();
            jcjVar.a().post(new m0j(jcjVar, n2gVar, n2gVar, new m0j(p6jVar, n2gVar, packageName, n2gVar)));
            ybjVarE = n2gVar.a;
        }
        xtd xtdVar = new xtd(2, new uq(activity, 0));
        ybjVarE.getClass();
        ybjVarE.d(u2g.a, xtdVar);
        ybjVarE.j(new xtd(3, activity));
    }
}
