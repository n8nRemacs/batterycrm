package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final class za0 {
    public int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e = zxg.o(null);
    public Object f;
    public Object g;

    public za0(Context context, wo4 wo4Var, nnd nndVar) {
        this.b = context.getApplicationContext();
        this.c = wo4Var;
        this.d = nndVar;
    }

    public ab0 a() {
        String strI = this.a == 0 ? " registrationStatus" : "";
        if (((Long) this.f) == null) {
            strI = strI.concat(" expiresInSecs");
        }
        if (((Long) this.g) == null) {
            strI = az1.i(strI, " tokenCreationEpochInSecs");
        }
        if (!strI.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }
        return new ab0(this.a, ((Long) this.f).longValue(), ((Long) this.g).longValue(), (String) this.b, (String) this.c, (String) this.d, (String) this.e);
    }

    public void b() {
        int iA = ((nnd) this.d).a((Context) this.b);
        if (this.a != iA) {
            this.a = iA;
            ((j25) ((wo4) this.c).b).b(this, iA);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public ImageView c() {
        return (ImageView) this.g.getValue();
    }

    public int d() {
        nnd nndVar = (nnd) this.d;
        Context context = (Context) this.b;
        this.a = nndVar.a(context);
        IntentFilter intentFilter = new IntentFilter();
        int i = nndVar.a;
        if ((i & 1) != 0) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            connectivityManager.getClass();
            pnd pndVar = new pnd(this);
            this.g = pndVar;
            connectivityManager.registerDefaultNetworkCallback(pndVar);
        }
        if ((i & 8) != 0) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if ((i & 4) != 0) {
            intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        if ((i & 16) != 0) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        eo eoVar = new eo(11, this);
        this.f = eoVar;
        context.registerReceiver(eoVar, intentFilter, null, (Handler) this.e);
        return this.a;
    }

    public void e(boolean z) {
        c().setVisibility(z ? 0 : 8);
    }
}
