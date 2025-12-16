package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class bfi extends y1a {
    public final /* synthetic */ a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfi(a aVar, Looper looper) {
        super(looper, 6);
        this.b = aVar;
    }

    @Override // defpackage.y1a, android.os.Handler
    public final void handleMessage(Message message) throws ClassNotFoundException {
        Boolean bool;
        if (this.b.F0.get() != message.arg1) {
            int i = message.what;
            if (i == 2 || i == 1 || i == 7) {
                mci mciVar = (mci) message.obj;
                mciVar.getClass();
                mciVar.c();
                return;
            }
            return;
        }
        int i2 = message.what;
        if ((i2 == 1 || i2 == 7 || i2 == 4 || i2 == 5) && !this.b.c()) {
            mci mciVar2 = (mci) message.obj;
            mciVar2.getClass();
            mciVar2.c();
            return;
        }
        int i3 = message.what;
        if (i3 == 4) {
            a aVar = this.b;
            aVar.C0 = new es3(message.arg2);
            if (!aVar.D0 && !TextUtils.isEmpty(aVar.p()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(aVar.p());
                    a aVar2 = this.b;
                    if (!aVar2.D0) {
                        aVar2.v(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            a aVar3 = this.b;
            es3 es3Var = aVar3.C0;
            if (es3Var == null) {
                es3Var = new es3(8);
            }
            aVar3.s0.y(es3Var);
            System.currentTimeMillis();
            return;
        }
        if (i3 == 5) {
            a aVar4 = this.b;
            es3 es3Var2 = aVar4.C0;
            if (es3Var2 == null) {
                es3Var2 = new es3(8);
            }
            aVar4.s0.y(es3Var2);
            System.currentTimeMillis();
            return;
        }
        if (i3 == 3) {
            Object obj = message.obj;
            this.b.s0.y(new es3(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null));
            System.currentTimeMillis();
            return;
        }
        if (i3 == 6) {
            this.b.v(5, null);
            s6b s6bVar = this.b.x0;
            if (s6bVar != null) {
                ((vv6) s6bVar.a).A(message.arg2);
            }
            this.b.s();
            a.u(this.b, 5, 1, null);
            return;
        }
        if (i3 == 2 && !this.b.isConnected()) {
            mci mciVar3 = (mci) message.obj;
            mciVar3.getClass();
            mciVar3.c();
            return;
        }
        int i4 = message.what;
        if (i4 != 2 && i4 != 1 && i4 != 7) {
            Log.wtf("GmsClient", ho7.f(i4, "Don't know how to handle message: "), new Exception());
            return;
        }
        mci mciVar4 = (mci) message.obj;
        synchronized (mciVar4) {
            try {
                bool = mciVar4.a;
                if (mciVar4.b) {
                    Log.w("GmsClient", "Callback proxy " + mciVar4.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            a aVar5 = mciVar4.f;
            int i5 = mciVar4.d;
            if (i5 != 0) {
                aVar5.v(1, null);
                Bundle bundle = mciVar4.e;
                mciVar4.a(new es3(i5, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
            } else if (!mciVar4.b()) {
                aVar5.v(1, null);
                mciVar4.a(new es3(8, null));
            }
        }
        synchronized (mciVar4) {
            mciVar4.b = true;
        }
        mciVar4.c();
    }
}
