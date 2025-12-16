package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ky8 implements ServiceConnection {
    public final Bundle a;
    public final /* synthetic */ ly8 b;

    public ky8(ly8 ly8Var, Bundle bundle) {
        this.b = ly8Var;
        this.a = bundle;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        px8 px8Var = this.b.a;
        Objects.requireNonNull(px8Var);
        px8Var.z(new gq5(15, px8Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        gq5 gq5Var;
        ly8 ly8Var = this.b;
        tje tjeVar = ly8Var.e;
        px8 px8Var = ly8Var.a;
        try {
            try {
                if (tjeVar.a.getPackageName().equals(componentName.getPackageName())) {
                    gb7 gb7VarI = j89.i(iBinder);
                    if (gb7VarI != null) {
                        String packageName = ly8Var.d.getPackageName();
                        int iMyPid = Process.myPid();
                        Bundle bundle = this.a;
                        px8Var.getClass();
                        gb7VarI.H(ly8Var.c, new ds3(packageName, iMyPid, bundle).b());
                        return;
                    }
                    a8i.g("MCImplBase", "Service interface is missing.");
                    Objects.requireNonNull(px8Var);
                    gq5Var = new gq5(15, px8Var);
                } else {
                    a8i.g("MCImplBase", "Expected connection to " + tjeVar.a.getPackageName() + " but is connected to " + componentName);
                    Objects.requireNonNull(px8Var);
                    gq5Var = new gq5(15, px8Var);
                }
            } catch (RemoteException unused) {
                a8i.l("MCImplBase", "Service " + componentName + " has died prematurely");
                Objects.requireNonNull(px8Var);
                gq5Var = new gq5(15, px8Var);
            }
            px8Var.z(gq5Var);
        } catch (Throwable th) {
            Objects.requireNonNull(px8Var);
            px8Var.z(new gq5(15, px8Var));
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        px8 px8Var = this.b.a;
        Objects.requireNonNull(px8Var);
        px8Var.z(new gq5(15, px8Var));
    }
}
