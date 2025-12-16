package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.util.Log;
import androidx.work.WorkRequest;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import one.me.android.OneMeApplication;
import org.webrtc.EglBase10Impl;
import org.webrtc.EglBase14Impl;
import ru.ok.android.externcalls.sdk.dev.CallsSDKException;
import ru.ok.android.onelog.OneLogDirect;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class mc implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ mc(int i) {
        this.a = i;
    }

    private final void a() {
    }

    private final void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2;
        switch (this.a) {
            case 0:
                int i2 = AlarmManagerSchedulerBroadcastReceiver.a;
                return;
            case 1:
                ConcurrentHashMap concurrentHashMap = cg.d;
                float andSet = cg.a.getAndSet(0);
                float andSet2 = cg.b.getAndSet(0);
                float andSet3 = cg.c.getAndSet(0);
                float f = andSet + andSet2 + andSet3;
                if (f > 0.0f) {
                    float f2 = andSet / f;
                    float f3 = andSet3 / f;
                    if (andSet2 / f > 0.25f || f3 > 0.1f) {
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            cg.a((ak6) entry.getKey(), -((Number) entry.getValue()).intValue());
                        }
                    } else if (f2 > 0.98f) {
                        for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                            cg.a((ak6) entry2.getKey(), ((Number) entry2.getValue()).intValue());
                        }
                    }
                    concurrentHashMap.clear();
                }
                ((Handler) cg.e.getValue()).postDelayed(cg.f, 2000L);
                return;
            case 2:
                long jCurrentTimeMillis = System.currentTimeMillis() - WorkRequest.MIN_BACKOFF_MILLIS;
                ConcurrentHashMap concurrentHashMap2 = zj6.d;
                Date date = new Date(jCurrentTimeMillis);
                ConcurrentHashMap concurrentHashMap3 = zj6.d;
                synchronized (concurrentHashMap3) {
                    try {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry3 : concurrentHashMap3.entrySet()) {
                            if (((vsg) entry3.getValue()).b.compareTo(date) < 0) {
                                linkedHashMap.put(entry3.getKey(), entry3.getValue());
                            }
                        }
                        for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                            xu0 xu0Var = ((vsg) entry4.getValue()).a;
                            ConcurrentHashMap concurrentHashMap4 = xu0Var.f;
                            Iterator it = concurrentHashMap4.values().iterator();
                            while (it.hasNext()) {
                                ((wu0) it.next()).a.close();
                            }
                            concurrentHashMap4.clear();
                            xu0Var.j = -1;
                            zj6.d.remove(entry4.getKey());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ((Handler) cg.e.getValue()).postDelayed(cg.g, WorkRequest.MIN_BACKOFF_MILLIS);
                return;
            case 3:
                return;
            case 4:
                lk6 lk6Var = cq0.C;
                if (lk6Var != null) {
                    Bitmap[] bitmapArr = (Bitmap[]) lk6Var.d;
                    ArrayList arrayList = null;
                    for (int i3 = 0; i3 < cq0.z; i3++) {
                        if (bitmapArr[i3] != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(bitmapArr[i3]);
                        }
                        bitmapArr[i3] = null;
                        ((lg7[]) lk6Var.c)[i3] = null;
                    }
                    if (!arrayList.isEmpty()) {
                        ((ScheduledExecutorService) sxi.a.f.a.getValue()).execute(new he(arrayList, i));
                    }
                    cq0.C = null;
                    return;
                }
                return;
            case 5:
                throw new CallsSDKException("It's test application crash... Please don't worry!", null, 2, null);
            case 6:
                return;
            case 7:
                Log.d("Camera2CapturePipeline", "enableExternalFlashAeMode disabled");
                return;
            case 8:
                EglBase10Impl.EglConnection.lambda$new$1();
                return;
            case 9:
                EglBase14Impl.EglConnection.lambda$new$1();
                return;
            case 10:
                OneLogDirect.flush$lambda$2();
                return;
            case 11:
                rwa rwaVar = OneMeApplication.s0;
                fxa fxaVarB = y4e.a.b();
                fxaVarB.getClass();
                wqi.c("fxa", "invalidate", new Object[0]);
                if (fxaVarB.b()) {
                    return;
                }
                fxaVarB.d(false);
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                elb.d.set(elb.c);
                return;
            default:
                String[] strArr = b9i.F;
                return;
        }
    }
}
