package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.BitmapFactory;
import android.media.AudioRecord;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.http.HttpStatus;
import org.webrtc.EglBase;
import org.webrtc.EglThread;
import org.webrtc.audio.WebRtcAudioRecord;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ConversationStart;

/* loaded from: classes2.dex */
public final /* synthetic */ class u64 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ u64(ys4 ys4Var, cm6 cm6Var) {
        this.a = 4;
        this.b = ys4Var;
        this.c = (u08) cm6Var;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [cm6, u08] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        ServiceInfo serviceInfo;
        String str;
        int i;
        ComponentName componentNameStartService;
        int i2 = -1;
        int i3 = 0;
        String str2 = null;
        switch (this.a) {
            case 0:
                return ConversationStart.execute$lambda$0((ConversationStart) this.b, (ConversationStart.Params) this.c);
            case 1:
                ue4 ue4Var = (ue4) this.b;
                byte[] bArr = (byte[]) this.c;
                return kvi.a(bArr, bArr.length, ue4Var.d, ue4Var.c);
            case 2:
                ue4 ue4Var2 = (ue4) this.b;
                Uri uri = (Uri) this.c;
                dl4 dl4VarA = ue4Var2.b.a();
                BitmapFactory.Options options = ue4Var2.c;
                int i4 = ue4Var2.d;
                try {
                    dl4VarA.H(new ze4(uri, 0L, -1L));
                    byte[] bArrCopyOf = new byte[1024];
                    int i5 = 0;
                    while (i3 != -1) {
                        if (i5 == bArrCopyOf.length) {
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
                        }
                        i3 = dl4VarA.read(bArrCopyOf, i5, bArrCopyOf.length - i5);
                        if (i3 != -1) {
                            i5 += i3;
                        }
                    }
                    byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i5);
                    return kvi.a(bArrCopyOf2, bArrCopyOf2.length, i4, options);
                } finally {
                    dl4VarA.close();
                }
            case 3:
                return EglThread.lambda$create$0((EglBase.Context) this.b, (int[]) this.c);
            case 4:
                ys4 ys4Var = (ys4) this.b;
                ?? r1 = (u08) this.c;
                ReentrantLock reentrantLock = (ReentrantLock) ys4Var.o;
                reentrantLock.lock();
                try {
                    r1.invoke();
                    reentrantLock.unlock();
                    return qqg.a;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 5:
                return Long.valueOf(((gs5) this.b).a.c(5, (long[]) this.c));
            case 6:
                Context context = (Context) this.b;
                Intent intent = (Intent) this.c;
                gge ggeVarD = gge.d();
                ggeVarD.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) ggeVarD.o).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (ggeVarD) {
                    try {
                        String str3 = (String) ggeVarD.b;
                        if (str3 != null) {
                            str2 = str3;
                        } else {
                            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            } else if (!context.getPackageName().equals(serviceInfo.packageName) || (str = serviceInfo.name) == null) {
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            } else {
                                if (str.startsWith(".")) {
                                    ggeVarD.b = context.getPackageName() + serviceInfo.name;
                                } else {
                                    ggeVarD.b = serviceInfo.name;
                                }
                                str2 = (String) ggeVarD.b;
                            }
                        }
                    } finally {
                    }
                }
                if (str2 != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str2));
                    }
                    intent2.setClassName(context.getPackageName(), str2);
                }
                try {
                    if (ggeVarD.f(context)) {
                        componentNameStartService = vjh.c(context, intent2);
                    } else {
                        componentNameStartService = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentNameStartService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i2 = HttpStatus.SC_NOT_FOUND;
                    }
                } catch (IllegalStateException e) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e);
                    i = HttpStatus.SC_PAYMENT_REQUIRED;
                    i2 = i;
                    return Integer.valueOf(i2);
                } catch (SecurityException e2) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
                    i = HttpStatus.SC_UNAUTHORIZED;
                    i2 = i;
                    return Integer.valueOf(i2);
                }
                return Integer.valueOf(i2);
            case 7:
                zm8 zm8Var = (zm8) this.b;
                String str4 = (String) this.c;
                long jNanoTime = System.nanoTime();
                List<u6e> listA = ((k7e) zm8Var.t.get()).a(str4);
                n8a n8aVar = new n8a((Object) null);
                n8a n8aVar2 = new n8a((Object) null);
                n8a n8aVar3 = new n8a((Object) null);
                ArrayList arrayList = new ArrayList(listA.size());
                for (u6e u6eVar : listA) {
                    pb2 pb2Var = u6eVar.d;
                    fh9 fh9Var = u6eVar.X;
                    ku3 ku3Var = u6eVar.o;
                    if (pb2Var != null && !n8aVar.d(pb2Var.a)) {
                        n8aVar.a(u6eVar.d.a);
                        arrayList.add(u6eVar);
                    } else if (ku3Var == null || n8aVar2.d(ku3Var.p())) {
                        if (fh9Var != null) {
                            long j = fh9Var.a;
                            if (!n8aVar3.d(j)) {
                                n8aVar3.a(j);
                                arrayList.add(u6eVar);
                            }
                        }
                        arrayList.add(u6eVar);
                    } else {
                        n8aVar2.a(ku3Var.p());
                        arrayList.add(u6eVar);
                    }
                }
                wqi.i("zm8", "localSearchWorker, local search finish: %d ms", Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime)));
                return arrayList;
            case 8:
                return ((tvd) this.b).a.a((yl) this.c);
            case 9:
                return Long.valueOf(((a3g) this.b).b((List) this.c));
            case 10:
                return (d5g) ((e5g) this.b).a.get((CharSequence) this.c);
            case 11:
                u2h u2hVar = (u2h) this.b;
                l2h l2hVar = (l2h) this.c;
                wqi.c("u2h", "newConversion: for data = %s", l2hVar);
                dl6 dl6Var = new dl6();
                dl6Var.d = u2hVar.c.a("mp4").getAbsolutePath();
                dl6Var.b = l2hVar;
                return new k2h(dl6Var);
            default:
                return ((WebRtcAudioRecord) this.b).lambda$scheduleLogRecordingConfigurationsTask$0((AudioRecord) this.c);
        }
    }

    public /* synthetic */ u64(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
