package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public class y1a extends Handler {
    public final /* synthetic */ int a;

    public /* synthetic */ y1a() {
        this.a = 1;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        CountDownLatch countDownLatch;
        switch (this.a) {
            case 0:
                x1a x1aVar = (x1a) message.obj;
                int i = message.what;
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                    sx sxVar = x1aVar.a;
                    return;
                }
                sx sxVar2 = x1aVar.a;
                Object obj = x1aVar.b[0];
                if (sxVar2.d.get()) {
                    countDownLatch = sxVar2.X;
                    try {
                        lii liiVar = sxVar2.Y;
                        if (liiVar.h == sxVar2) {
                            SystemClock.uptimeMillis();
                            liiVar.h = null;
                            liiVar.b();
                        }
                        countDownLatch.countDown();
                    } finally {
                        countDownLatch.countDown();
                    }
                } else {
                    try {
                        lii liiVar2 = sxVar2.Y;
                        if (liiVar2.g != sxVar2) {
                            if (liiVar2.h == sxVar2) {
                                SystemClock.uptimeMillis();
                                liiVar2.h = null;
                                liiVar2.b();
                            }
                        } else if (!liiVar2.c) {
                            SystemClock.uptimeMillis();
                            liiVar2.g = null;
                            kc8 kc8Var = liiVar2.a;
                            if (kc8Var != null) {
                                if (Looper.myLooper() == Looper.getMainLooper()) {
                                    kc8Var.k(obj);
                                } else {
                                    kc8Var.i(obj);
                                }
                            }
                        }
                    } finally {
                        countDownLatch = sxVar2.X;
                    }
                }
                sxVar2.c = 3;
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1a(Looper looper, int i, boolean z) {
        super(looper);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1a(Looper looper, Handler.Callback callback, int i) {
        super(looper, callback);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1a(Looper looper, int i) {
        super(looper);
        this.a = i;
        switch (i) {
            case 6:
                super(looper);
                Looper.getMainLooper();
                break;
            default:
                Looper.getMainLooper();
                break;
        }
    }
}
