package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.time.Instant;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import one.me.android.OneMeApplication;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.rlottie.RLottieDrawable;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;
import org.apache.http.util.LangUtils;
import org.webrtc.VideoSink;
import org.webrtc.VideoTrack;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesListenerProxy;
import ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl;
import ru.ok.android.onelog.OneLogImpl;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

/* loaded from: classes2.dex */
public final /* synthetic */ class awa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ awa(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                OneLogImpl.lambda$startUpload$0((String) this.b);
                return;
            case 1:
                nwa nwaVar = (nwa) this.b;
                rwa rwaVar = OneMeApplication.s0;
                nwaVar.invoke();
                return;
            case 2:
                ((AtomicBoolean) this.b).set(true);
                return;
            case 3:
                w2b.setCounter$lambda$16((w2b) this.b);
                return;
            case 4:
                View childAt = ((neb) this.b).getChildAt(0);
                ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
                if (viewGroup != null) {
                    viewGroup.post(new awa(5, viewGroup));
                    return;
                }
                return;
            case 5:
                ViewGroup viewGroup2 = (ViewGroup) this.b;
                float f = 4;
                viewGroup2.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), viewGroup2.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), viewGroup2.getPaddingBottom());
                viewGroup2.setClipToPadding(false);
                return;
            case 6:
                ParticipantStatesListenerProxy.raiseRunnable$lambda$0((ParticipantStatesListenerProxy) this.b);
                return;
            case 7:
                inb inbVar = (inb) this.b;
                synchronized (inbVar) {
                    for (int i = 0; i < inbVar.f.size(); i++) {
                        try {
                            ((VideoTrack) inbVar.f.get(i)).removeSink((VideoSink) inbVar.g.get(i));
                            ((VideoTrack) inbVar.f.get(i)).removeSink((VideoSink) inbVar.h.get(i));
                        } catch (Throwable th) {
                            ((y6d) inbVar.b).log("ParticipantsAgnosticVideoTracks", "close error: " + th.getMessage());
                            return;
                        }
                    }
                }
                return;
            case 8:
                throw ((RuntimeException) this.b);
            case 9:
                s0c s0cVar = (s0c) this.b;
                if (((fxa) s0cVar.c.getValue()).b() && ((lv4) s0cVar.b.getValue()).d()) {
                    wqi.c("s0c", "processScheduledPing: app is visible, ping and schedule", new Object[0]);
                    ((hwa) s0cVar.a.getValue()).B(true);
                    s0cVar.a();
                    she.v((c6i) s0cVar.d.getValue());
                    return;
                }
                return;
            case 10:
                ((m3c) this.b).s--;
                return;
            case 11:
                s6b s6bVar = (s6b) this.b;
                wqi.c("s6b", "execute()", new Object[0]);
                ((bj7) ((de8) ((bwf) s6bVar.a).getValue())).e();
                wqi.c("s6b", "repository prefetch ok", new Object[0]);
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((r8c) this.b).q();
                return;
            case 13:
                bac bacVar = (bac) this.b;
                l48 l48Var = bacVar.X;
                if (bacVar.b == 0) {
                    bacVar.c = true;
                    l48Var.d(k38.ON_PAUSE);
                }
                if (bacVar.a == 0 && bacVar.c) {
                    l48Var.d(k38.ON_STOP);
                    bacVar.d = true;
                    return;
                }
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                RLottieDrawable rLottieDrawable = ((s6d) this.b).b;
                try {
                    cq0 cq0Var = rLottieDrawable.r1;
                    if (cq0Var != null) {
                        cq0Var.b();
                    }
                } catch (Throwable unused) {
                }
                RLottieDrawable.G1.post(rLottieDrawable.q1);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ((d7d) this.b).v();
                return;
            case 16:
                ((x9d) this.b).d.Y();
                return;
            case LangUtils.HASH_SEED /* 17 */:
                unc uncVar = (unc) this.b;
                while (!uncVar.a) {
                    try {
                        DatagramPacket datagramPacket = new DatagramPacket(new byte[1500], 1500);
                        try {
                            ((DatagramSocket) uncVar.b).receive(datagramPacket);
                            if (((a6) uncVar.e).test(datagramPacket)) {
                                ((LinkedBlockingQueue) uncVar.g).add(new n8d(datagramPacket, Instant.now()));
                            }
                        } catch (SocketException e) {
                            throw e;
                        } catch (SocketTimeoutException unused2) {
                        }
                    } catch (IOException e2) {
                        if (uncVar.a) {
                            ((bh8) uncVar.c).debug("closing receiver");
                            return;
                        } else {
                            ((bh8) uncVar.c).error("IOException while receiving datagrams", e2);
                            ((vsc) uncVar.d).accept(e2);
                            return;
                        }
                    } catch (Throwable th2) {
                        ((bh8) uncVar.c).error("IOException while receiving datagrams", th2);
                        ((vsc) uncVar.d).accept(th2);
                        return;
                    }
                }
                ((bh8) uncVar.c).debug("Terminating receive loop");
                return;
            case 18:
                RecordManagerImpl.onRecordStarted$lambda$5((RecordManagerImpl) this.b);
                return;
            case 19:
                je5 je5Var = (je5) this.b;
                gri.a("Recorder", "The source didn't become non-streaming before timeout. Waited 1000ms");
                if (pv4.a.e(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class) != null) {
                    bhd.r(je5Var);
                    return;
                }
                return;
            case 20:
                mw4 mw4Var = (mw4) ((vhb) this.b).c;
                if (mw4Var.b) {
                    return;
                }
                gri.a("Recorder", "Retry setupVideo #" + mw4Var.c);
                msf msfVar = (msf) mw4Var.d;
                f9g f9gVar = (f9g) mw4Var.e;
                bhd bhdVar = (bhd) mw4Var.g;
                bhdVar.z().d(new zcd(mw4Var, msfVar, f9gVar, 2), bhdVar.e);
                return;
            case 21:
                ((wsd) this.b).a.release();
                return;
            case 22:
                ((ytd) this.b).A();
                return;
            case 23:
                jud judVar = (jud) this.b;
                ae4 ae4Var = (ae4) judVar.b.get();
                if (ae4Var != null) {
                    r8i r8iVar = judVar.c;
                    if (r8iVar == null) {
                        throw new IllegalArgumentException("Illegal 'listener' value: null");
                    }
                    ae4Var.c.remove(r8iVar);
                    ae4Var.c(judVar.d);
                    return;
                }
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                j35 j35Var = (j35) this.b;
                ae4 ae4Var2 = (ae4) ((AtomicReference) j35Var.s0).get();
                if (ae4Var2 != null) {
                    ae4Var2.c((p8i) j35Var.t0);
                    return;
                }
                return;
            case 25:
                ((i1e) this.b).c();
                return;
            case 26:
                ((wz1) this.b).a();
                return;
            case 27:
                SdkCoroutineWorker.a((SdkCoroutineWorker) this.b);
                return;
            case 28:
                SelectAlbumWidget selectAlbumWidget = (SelectAlbumWidget) this.b;
                yy7[] yy7VarArr = SelectAlbumWidget.X;
                selectAlbumWidget.z0().k();
                return;
            default:
                ((eee) this.b).h(Bitmap.createBitmap(new int[]{-16777216}, 1, 1, Bitmap.Config.ARGB_8888));
                return;
        }
    }
}
