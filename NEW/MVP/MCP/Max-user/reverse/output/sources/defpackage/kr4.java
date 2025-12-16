package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.webrtc.EglRenderer;
import ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManagerImpl;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class kr4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kr4(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ke5 ke5Var;
        Executor executor;
        long j;
        boolean z;
        switch (this.a) {
            case 0:
                ((rr4) this.b).h.F(((hf6) ((qr4) this.c).c).y);
                return;
            case 1:
                ((ur4) ((h79) this.b).c).g.g((sch) this.c);
                return;
            case 2:
                zr4 zr4Var = (zr4) this.b;
                String str = (String) this.c;
                try {
                    zr4Var.e.get();
                    zr4Var.e(zr4.n.decrementAndGet(), zr4.m.get(), "Surface terminated");
                    return;
                } catch (Exception e) {
                    gri.b("DeferrableSurface", "Unexpected surface termination for " + zr4Var + "\nStack Trace:\n" + str);
                    synchronized (zr4Var.a) {
                        throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", zr4Var, Boolean.valueOf(zr4Var.c), Integer.valueOf(zr4Var.b)), e);
                    }
                }
            case 3:
                Callable callable = (Callable) this.b;
                ht4 ht4Var = (ht4) ((iv6) this.c).b;
                try {
                    ht4Var.l(callable.call());
                    return;
                } catch (Exception e2) {
                    ht4Var.m(e2);
                    return;
                }
            case 4:
                ay4 ay4Var = (ay4) this.b;
                if (!ay4Var.d.offer((Runnable) this.c)) {
                    throw new IllegalStateException("cannot enqueue any more runnables");
                }
                ay4Var.a();
                return;
            case 5:
                by4 by4Var = (by4) this.b;
                zx4 zx4Var = (zx4) this.c;
                by4Var.g--;
                SparseIntArray sparseIntArray = by4Var.b;
                int i = zx4Var.d;
                int i2 = sparseIntArray.get(i) - 1;
                if (i2 != 0) {
                    sparseIntArray.put(i, i2);
                    return;
                }
                sparseIntArray.delete(i);
                by4Var.c.remove(zx4Var);
                by4Var.a.add(zx4Var);
                return;
            case 6:
                cy4 cy4Var = (cy4) this.b;
                zx4 zx4Var2 = (zx4) this.c;
                cy4Var.g--;
                SparseIntArray sparseIntArray2 = cy4Var.b;
                int i3 = zx4Var2.d;
                int i4 = sparseIntArray2.get(i3) - 1;
                if (i4 != 0) {
                    sparseIntArray2.put(i3, i4);
                    return;
                }
                sparseIntArray2.delete(i3);
                cy4Var.c.remove(zx4Var2);
                cy4Var.a.add(zx4Var2);
                return;
            case 7:
                t25.a((t25) this.c, ((s25) this.b).b.l);
                return;
            case 8:
                final i65 i65Var = (i65) this.b;
                msf msfVar = (msf) this.c;
                i65Var.o++;
                g65 g65Var = i65Var.a;
                boolean z2 = msfVar.f;
                Size size = msfVar.b;
                ho6.d((AtomicBoolean) g65Var.c, true);
                ho6.c((Thread) g65Var.e);
                final SurfaceTexture surfaceTexture = new SurfaceTexture(z2 ? g65Var.o : g65Var.p);
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                final Surface surface = new Surface(surfaceTexture);
                msfVar.b(surface, i65Var.c, new ju3() { // from class: h65
                    @Override // defpackage.ju3
                    public final void accept(Object obj) {
                        i65 i65Var2 = i65Var;
                        i65Var2.getClass();
                        SurfaceTexture surfaceTexture2 = surfaceTexture;
                        surfaceTexture2.setOnFrameAvailableListener(null);
                        surfaceTexture2.release();
                        surface.release();
                        i65Var2.o--;
                        i65Var2.a();
                    }
                });
                if (z2) {
                    i65Var.s0 = surfaceTexture;
                    return;
                } else {
                    i65Var.t0 = surfaceTexture;
                    surfaceTexture.setOnFrameAvailableListener(i65Var, i65Var.d);
                    return;
                }
            case 9:
                i65 i65Var2 = (i65) this.b;
                fsf fsfVar = (fsf) this.c;
                Surface surfaceD = fsfVar.d(i65Var2.c, new l32(i65Var2, 2, fsfVar));
                i65Var2.a.p(surfaceD);
                i65Var2.Z.put(fsfVar, surfaceD);
                return;
            case 10:
                e85 e85Var = (e85) this.b;
                rud rudVar = (rud) this.c;
                try {
                    lud ludVar = e85Var.d.c;
                    if (ludVar != null) {
                        ludVar.a(e85Var.c, rudVar);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    e85Var.a.reportException("ProtocolInfo", "rtc.command.handle.command.onsuccess", th);
                    return;
                }
            case 11:
                e85 e85Var2 = (e85) this.b;
                Throwable th2 = (Throwable) this.c;
                try {
                    jw4 jw4Var = e85Var2.d.d;
                    if (jw4Var != null) {
                        jw4Var.b(e85Var2.c, th2);
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    e85Var2.a.reportException("ProtocolInfo", "rtc.command.handle.command.onerror", th3);
                    return;
                }
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((EglRenderer) this.b).lambda$releaseEglSurface$3((Runnable) this.c);
                return;
            case 13:
                ((EglRenderer) this.b).lambda$release$0((CountDownLatch) this.c);
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ((bf5) this.b).m.remove((em7) this.c);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                Executor executor2 = (Executor) this.b;
                ye5 ye5Var = (ye5) this.c;
                Objects.requireNonNull(ye5Var);
                executor2.execute(new qj4(21, ye5Var));
                return;
            case 16:
                ((bf5) this.b).l.remove((tu1) this.c);
                return;
            case LangUtils.HASH_SEED /* 17 */:
                ((uqa) ((Map.Entry) this.b).getKey()).a((dv0) this.c);
                return;
            case 18:
                ((uqa) this.b).a((dv0) this.c);
                return;
            case 19:
                we5 we5Var = (we5) this.b;
                uqa uqaVar = (uqa) this.c;
                LinkedHashMap linkedHashMap = we5Var.a;
                uqaVar.getClass();
                linkedHashMap.remove(uqaVar);
                return;
            case 20:
                ye5 ye5Var2 = (ye5) this.b;
                MediaCodec.CodecException codecException = (MediaCodec.CodecException) this.c;
                bf5 bf5Var = ye5Var2.k;
                switch (az1.v(bf5Var.D)) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        bf5Var.b(1, codecException.getMessage(), codecException);
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(u45.t(bf5Var.D)));
                }
            case 21:
                ye5 ye5Var3 = (ye5) this.b;
                MediaFormat mediaFormat = (MediaFormat) this.c;
                if (ye5Var3.j) {
                    gri.i(ye5Var3.k.a, "Receives onOutputFormatChanged after codec is reset.");
                    return;
                }
                switch (az1.v(ye5Var3.k.D)) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        synchronized (ye5Var3.k.b) {
                            bf5 bf5Var2 = ye5Var3.k;
                            ke5Var = bf5Var2.r;
                            executor = bf5Var2.s;
                        }
                        try {
                            executor.execute(new kr4(ke5Var, 22, mediaFormat));
                            return;
                        } catch (RejectedExecutionException e3) {
                            gri.c(ye5Var3.k.a, "Unable to post to the supplied executor.", e3);
                            return;
                        }
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(u45.t(ye5Var3.k.D)));
                }
            case 22:
                ((ke5) this.b).t(new wo4(9, (MediaFormat) this.c));
                return;
            case 23:
                ((ke5) this.b).s((ae5) this.c);
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                ((he5) this.b).a((Surface) this.c);
                return;
            case 25:
                em5 em5Var = (em5) this.b;
                nm5 nm5Var = (nm5) this.c;
                int i5 = em5Var.S0 - nm5Var.b;
                em5Var.S0 = i5;
                boolean z3 = true;
                if (nm5Var.e) {
                    em5Var.T0 = nm5Var.c;
                    em5Var.U0 = true;
                }
                if (i5 == 0) {
                    s9g s9gVar = ((a3c) nm5Var.f).a;
                    if (!em5Var.s1.a.p() && s9gVar.p()) {
                        em5Var.t1 = -1;
                        em5Var.u1 = 0L;
                    }
                    if (!s9gVar.p()) {
                        List listAsList = Arrays.asList(((h5c) s9gVar).l);
                        hsi.g(listAsList.size() == em5Var.A0.size());
                        for (int i6 = 0; i6 < listAsList.size(); i6++) {
                            ((cm5) em5Var.A0.get(i6)).c = (s9g) listAsList.get(i6);
                        }
                    }
                    long j2 = -9223372036854775807L;
                    if (em5Var.U0) {
                        if (((a3c) nm5Var.f).b.equals(em5Var.s1.b) && ((a3c) nm5Var.f).d == em5Var.s1.s) {
                            z3 = false;
                        }
                        if (z3) {
                            if (s9gVar.p() || ((a3c) nm5Var.f).b.b()) {
                                j2 = ((a3c) nm5Var.f).d;
                            } else {
                                a3c a3cVar = (a3c) nm5Var.f;
                                d99 d99Var = a3cVar.b;
                                long j3 = a3cVar.d;
                                Object obj = d99Var.a;
                                m9g m9gVar = em5Var.z0;
                                s9gVar.g(obj, m9gVar);
                                j2 = j3 + m9gVar.e;
                            }
                        }
                    } else {
                        z3 = false;
                    }
                    em5Var.U0 = false;
                    em5Var.y1((a3c) nm5Var.f, 1, z3, em5Var.T0, j2, -1, false);
                    return;
                }
                return;
            case 26:
                dm5 dm5Var = (dm5) this.b;
                mm5 mm5Var = (mm5) this.c;
                int i7 = dm5Var.N0 - mm5Var.c;
                dm5Var.N0 = i7;
                boolean z4 = true;
                if (mm5Var.d) {
                    dm5Var.O0 = mm5Var.e;
                    dm5Var.P0 = true;
                }
                if (mm5Var.f) {
                    dm5Var.Q0 = mm5Var.g;
                }
                if (i7 == 0) {
                    r9g r9gVar = mm5Var.b.a;
                    if (!dm5Var.j1.a.p() && r9gVar.p()) {
                        dm5Var.k1 = -1;
                        dm5Var.l1 = 0L;
                    }
                    if (!r9gVar.p()) {
                        List listAsList2 = Arrays.asList(((g5c) r9gVar).Z);
                        fsi.d(listAsList2.size() == dm5Var.z0.size());
                        for (int i8 = 0; i8 < listAsList2.size(); i8++) {
                            ((bm5) dm5Var.z0.get(i8)).b = (r9g) listAsList2.get(i8);
                        }
                    }
                    long j4 = -9223372036854775807L;
                    if (dm5Var.P0) {
                        if (mm5Var.b.b.equals(dm5Var.j1.b) && mm5Var.b.d == dm5Var.j1.s) {
                            z4 = false;
                        }
                        if (z4) {
                            if (r9gVar.p() || mm5Var.b.b.a()) {
                                j4 = mm5Var.b.d;
                            } else {
                                z2c z2cVar = mm5Var.b;
                                c99 c99Var = z2cVar.b;
                                long j5 = z2cVar.d;
                                Object obj2 = c99Var.a;
                                l9g l9gVar = dm5Var.y0;
                                r9gVar.g(obj2, l9gVar);
                                j4 = j5 + l9gVar.o;
                            }
                        }
                        j = j4;
                        z = z4;
                    } else {
                        j = -9223372036854775807L;
                        z = false;
                    }
                    dm5Var.P0 = false;
                    dm5Var.b1(mm5Var.b, 1, dm5Var.Q0, false, z, dm5Var.O0, j, -1);
                    return;
                }
                return;
            case 27:
                u5i u5iVar = (u5i) this.b;
                Throwable th4 = (Throwable) this.c;
                Iterator it = ((CopyOnWriteArrayList) u5iVar.b).iterator();
                while (it.hasNext()) {
                    kud kudVar = (kud) it.next();
                    try {
                        kudVar.b.log(kudVar.a, "<- [?]: " + th4);
                    } catch (Throwable th5) {
                        ((y6d) u5iVar.a).reportException("CallsListeners", "rtc.command.handle.listeners.oncommanderror", th5);
                    }
                }
                return;
            case 28:
                w86 w86Var = (w86) this.b;
                ((ua8) w86Var.a).f(-1, new wo4(w86Var, (chg) this.c));
                return;
            default:
                ((FeedbackListenerManagerImpl) this.b).notifyResolvedFeedbackItems((ArrayList) this.c);
                return;
        }
    }
}
