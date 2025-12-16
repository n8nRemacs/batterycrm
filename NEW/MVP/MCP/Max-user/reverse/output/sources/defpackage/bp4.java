package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes.dex */
public class bp4 implements vld {
    public final Context a;
    public final bj b;
    public boolean c;
    public uw8 d = uw8.O;

    public bp4(Context context) {
        this.a = context;
        this.b = new bj(7, context);
    }

    @Override // defpackage.vld
    public final void a(tk0 tk0Var) {
        int i = tk0Var.b;
    }

    @Override // defpackage.vld
    public final tk0[] b(Handler handler, yl5 yl5Var, yl5 yl5Var2, yl5 yl5Var3, yl5 yl5Var4) {
        ArrayList arrayList = new ArrayList();
        uw8 uw8Var = this.d;
        boolean z = this.c;
        Context context = this.a;
        gx8 gx8Var = new gx8(context);
        bj bjVar = this.b;
        gx8Var.d = bjVar;
        gx8Var.c = uw8Var;
        gx8Var.e = MultiFileUploader.UPLOAD_NEXT_INTERVAL;
        gx8Var.f = z;
        gx8Var.g = handler;
        gx8Var.h = yl5Var;
        gx8Var.i = 50;
        hsi.g(!gx8Var.b);
        Handler handler2 = gx8Var.g;
        hsi.g((handler2 == null && gx8Var.h == null) || !(handler2 == null || gx8Var.h == null));
        gx8Var.b = true;
        arrayList.add(new jx8(gx8Var));
        arrayList.add(new mw8(this.a, bjVar, this.d, this.c, handler, yl5Var2, c(context)));
        d(yl5Var3, handler.getLooper(), arrayList);
        Looper looper = handler.getLooper();
        arrayList.add(new fz9(yl5Var4, looper));
        arrayList.add(new fz9(yl5Var4, looper));
        arrayList.add(new a32());
        arrayList.add(new of7(new zo0(context)));
        return (tk0[]) arrayList.toArray(new tk0[0]);
    }

    public ak4 c(Context context) {
        return new i40(context).b();
    }

    public void d(yl5 yl5Var, Looper looper, ArrayList arrayList) {
        arrayList.add(new h5g(yl5Var, looper, kof.a0));
    }
}
