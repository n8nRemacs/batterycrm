package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;

/* loaded from: classes.dex */
public abstract class m48 extends Service implements j48 {
    public final te8 a;

    public m48() {
        te8 te8Var = new te8();
        te8Var.a = new l48(this);
        te8Var.b = new Handler();
        this.a = te8Var;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        this.a.C(k38.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.a.C(k38.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        k38 k38Var = k38.ON_STOP;
        te8 te8Var = this.a;
        te8Var.C(k38Var);
        te8Var.C(k38.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.a.C(k38.ON_START);
        super.onStart(intent, i);
    }

    @Override // defpackage.j48
    public final l48 p() {
        return (l48) this.a.a;
    }
}
