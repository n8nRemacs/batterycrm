package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.os.RemoteException;
import android.util.Pair;
import android.widget.Toast;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import one.me.folders.list.FoldersListScreen;
import org.webrtc.EncodedImage;
import org.webrtc.JniCommon;
import org.webrtc.Size;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class mn1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mn1(dc6 dc6Var, int i, int i2, ArrayList arrayList) {
        this.a = 10;
        this.c = dc6Var;
        this.b = i2;
        this.d = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [f55, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        yie yieVar;
        int i = this.a;
        int i2 = this.b;
        ?? r6 = this.d;
        Object obj = this.c;
        switch (i) {
            case 0:
                rid ridVar = (rid) obj;
                on1 on1Var = (on1) r6;
                if (ridVar.a) {
                    on1Var.z(i2, "submitList");
                    ridVar.a = false;
                    break;
                }
                break;
            case 1:
                ((k02) obj).c(i2, (jbe) r6);
                break;
            case 2:
                ((k02) obj).b(i2, (r02) r6);
                break;
            case 3:
                ((CameraCaptureSession.CaptureCallback) ((py1) obj).b).onCaptureSequenceAborted((CameraCaptureSession) r6, i2);
                break;
            case 4:
                ((CameraDevice.StateCallback) ((xy1) obj).b).onError((CameraDevice) r6, i2);
                break;
            case 5:
                ll3 ll3Var = (ll3) obj;
                Object obj2 = ((i8) r6).a;
                String str = (String) ll3Var.a.get(Integer.valueOf(i2));
                if (str != null) {
                    k8 k8Var = (k8) ll3Var.e.get(str);
                    if ((k8Var != null ? k8Var.a : null) != null) {
                        h8 h8Var = k8Var.a;
                        if (ll3Var.d.remove(str)) {
                            h8Var.e(obj2);
                            break;
                        }
                    } else {
                        ll3Var.g.remove(str);
                        ll3Var.f.put(str, obj2);
                        break;
                    }
                }
                break;
            case 6:
                ((ll3) obj).a(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) r6));
                break;
            case 7:
                uh4 uh4Var = (uh4) obj;
                uh4Var.t0.decrementAndGet();
                ByteBuffer byteBuffer = ((EncodedImage) r6).buffer;
                if (i2 > uh4Var.v0.get()) {
                    uh4Var.a.decode(byteBuffer);
                }
                b9i b9iVar = uh4Var.y0;
                b9iVar.y.decrementAndGet();
                byteBuffer.rewind();
                b9iVar.z.addAndGet(-byteBuffer.capacity());
                JniCommon.nativeFreeByteBuffer(byteBuffer);
                break;
            case 8:
                ((shc) ((f54) obj).d).e(i2, r6);
                break;
            case 9:
                d55 d55Var = (d55) obj;
                r6.v(d55Var.a, d55Var.b, i2);
                break;
            case 10:
                oc6 oc6VarY0 = ((FoldersListScreen) ((dc6) obj).Y.b).y0();
                oc6VarY0.getClass();
                f86 f86Var = ((fxg) ((ArrayList) r6).get(i2)).a;
                oc6VarY0.v0 = f86Var != null ? f86Var.a : null;
                break;
            case 11:
                ((mj6) obj).b((Size) r6, i2 + 1);
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                oa8 oa8Var = (oa8) r6;
                Iterator it = ((CopyOnWriteArraySet) obj).iterator();
                while (it.hasNext()) {
                    sa8 sa8Var = (sa8) it.next();
                    if (i2 != -1) {
                        sa8Var.b.a(i2);
                    }
                    sa8Var.c = true;
                    oa8Var.invoke(sa8Var.a);
                }
                break;
            case 13:
                pa8 pa8Var = (pa8) r6;
                Iterator it2 = ((CopyOnWriteArraySet) obj).iterator();
                while (it2.hasNext()) {
                    ta8 ta8Var = (ta8) it2.next();
                    if (!ta8Var.d) {
                        if (i2 != -1) {
                            ta8Var.b.a(i2);
                        }
                        ta8Var.c = true;
                        pa8Var.invoke(ta8Var.a);
                    }
                }
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ly8 ly8Var = (ly8) obj;
                try {
                    yieVar = (yie) ((ha8) r6).get();
                    hsi.e(yieVar, "SessionResult must not be null");
                } catch (InterruptedException e) {
                    e = e;
                    a8i.m("MCImplBase", "Session operation failed", e);
                    yieVar = new yie(-1);
                } catch (CancellationException e2) {
                    a8i.m("MCImplBase", "Session operation cancelled", e2);
                    yieVar = new yie(1);
                } catch (ExecutionException e3) {
                    e = e3;
                    a8i.m("MCImplBase", "Session operation failed", e);
                    yieVar = new yie(-1);
                }
                eb7 eb7Var = ly8Var.y;
                if (eb7Var != null) {
                    try {
                        eb7Var.a(ly8Var.c, i2, yieVar.b());
                        break;
                    } catch (RemoteException unused) {
                        a8i.l("MCImplBase", "Error in sending");
                        return;
                    }
                }
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                Pair pair = (Pair) r6;
                ((nj4) ((v99) obj).b.k).v(((Integer) pair.first).intValue(), (d99) pair.second, i2);
                break;
            case 16:
                j35 j35Var = (j35) obj;
                byte[] bArr = (byte[]) r6;
                Iterator it3 = ((CopyOnWriteArrayList) j35Var.b).iterator();
                while (it3.hasNext()) {
                    try {
                        ((pud) it3.next()).a(i2, bArr);
                    } catch (Throwable th) {
                        ((y6d) j35Var.d).reportException("RtcNotificationReceiver", "rtc.notification.handle.datareceived", th);
                    }
                }
                break;
            default:
                try {
                    Toast.makeText((Context) obj, (String) r6, i2).show();
                    break;
                } catch (Exception e4) {
                    wqi.c("efi", "onError failed: " + e4.getMessage(), new Object[0]);
                }
        }
    }

    public /* synthetic */ mn1(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ mn1(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
