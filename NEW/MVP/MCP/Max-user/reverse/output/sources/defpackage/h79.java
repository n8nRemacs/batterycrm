package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.a;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import one.me.android.media.service.OneMeMediaSessionService;
import one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget;
import one.me.sdk.vendor.StoreServicesInfo$ServicesException;
import org.webrtc.DataChannel;
import ru.ok.android.webrtc.protocol.exceptions.RtcInternalHandleException;
import ru.ok.tamtam.upload.messages.MessageUploadException;

/* loaded from: classes.dex */
public final class h79 implements cl7, wl, rn6, gp0, fvf, h37, gu3, DataChannel.Observer, ub5, lva, fod, v2f {
    public static final Object d = new Object();
    public static m4i o;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ h79(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static ybj u(Context context, Intent intent, boolean z) {
        m4i m4iVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (d) {
            try {
                if (o == null) {
                    o = new m4i(context);
                }
                m4iVar = o;
            } finally {
            }
        }
        if (!z) {
            return m4iVar.b(intent).k(new es(2), new os5(3));
        }
        if (gge.d().f(context)) {
            synchronized (vjh.b) {
                try {
                    vjh.a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        vjh.c.a(vjh.a);
                    }
                    m4iVar.b(intent).i(new ehg(16, intent));
                } finally {
                }
            }
        } else {
            m4iVar.b(intent);
        }
        return n5e.f(-1);
    }

    public static void w(Bundle bundle) {
        if (bundle != null) {
            ClassLoader classLoader = h79.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
        }
    }

    public static aqf x(SpannableString spannableString, int i, fqf fqfVar) {
        aqf aqfVar;
        int i2 = 0;
        aqf[] aqfVarArr = (aqf[]) spannableString.getSpans(0, spannableString.length(), aqf.class);
        if (aqfVarArr != null) {
            int length = aqfVarArr.length;
            while (true) {
                if (i2 >= length) {
                    aqfVar = null;
                    break;
                }
                aqfVar = aqfVarArr[i2];
                int spanStart = spannableString.getSpanStart(aqfVar);
                int spanEnd = spannableString.getSpanEnd(aqfVar);
                if (aqfVar.a.a == fqfVar.a && spanStart <= i && i <= spanEnd && spanEnd - spanStart > 0) {
                    break;
                }
                i2++;
            }
            if (aqfVar != null) {
                return aqfVar;
            }
        }
        return null;
    }

    public synchronized Map A() {
        try {
            if (((Map) this.c) == null) {
                this.c = Collections.unmodifiableMap(new HashMap((HashMap) this.b));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.c;
    }

    public void B() {
        String str = ((phb) this.b).d;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "finish", null);
            }
        }
        ((pac) ((sac) this.c)).g(new kpd(new hvg(100.0f, ((phb) this.b).g, null)));
        ((pac) ((sac) this.c)).D(null);
    }

    public void C(l7 l7Var) {
        fa6 fa6Var = (fa6) this.b;
        ((ActionMode.Callback) fa6Var.a).onDestroyActionMode(fa6Var.v(l7Var));
        ho hoVar = (ho) this.c;
        if (hoVar.G0 != null) {
            hoVar.v0.getDecorView().removeCallbacks(hoVar.H0);
        }
        if (hoVar.F0 != null) {
            dhh dhhVar = hoVar.I0;
            if (dhhVar != null) {
                dhhVar.b();
            }
            dhh dhhVarA = hfh.a(hoVar.F0);
            dhhVarA.a(0.0f);
            hoVar.I0 = dhhVarA;
            dhhVarA.d(new wn(2, this));
        }
        hoVar.E0 = null;
        ViewGroup viewGroup = hoVar.K0;
        WeakHashMap weakHashMap = hfh.a;
        teh.c(viewGroup);
        hoVar.I();
    }

    public boolean D(l7 l7Var, Menu menu) {
        ViewGroup viewGroup = ((ho) this.c).K0;
        WeakHashMap weakHashMap = hfh.a;
        teh.c(viewGroup);
        fa6 fa6Var = (fa6) this.b;
        ActionMode.Callback callback = (ActionMode.Callback) fa6Var.a;
        jrf jrfVarV = fa6Var.v(l7Var);
        z0f z0fVar = (z0f) fa6Var.d;
        Menu pg9Var = (Menu) z0fVar.get(menu);
        if (pg9Var == null) {
            pg9Var = new pg9((Context) fa6Var.b, (vf9) menu);
            z0fVar.put(menu, pg9Var);
        }
        return callback.onPrepareActionMode(jrfVarV, pg9Var);
    }

    public void E(float f) {
        String str = ((phb) this.b).d;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "progress " + f, null);
            }
        }
        ((pac) ((sac) this.c)).g(new kpd(new hvg(f * 100.0f, ((phb) this.b).g, null)));
    }

    public void F(Exception exc, boolean z) {
        this.c = null;
        HashSet hashSet = (HashSet) this.b;
        wg7 wg7VarJ = wg7.j(hashSet);
        hashSet.clear();
        t76 t76VarListIterator = wg7VarJ.listIterator(0);
        while (t76VarListIterator.hasNext()) {
            pl4 pl4Var = (pl4) t76VarListIterator.next();
            pl4Var.getClass();
            pl4Var.j(z ? 1 : 3, exc);
        }
    }

    public ybj G(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = (Context) this.b;
        es esVar = (es) this.c;
        boolean z = context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z2 = (intent.getFlags() & 268435456) != 0;
        return (!z || z2) ? n5e.d(new u64(context, 6, intent), esVar).l(esVar, new ys5(context, intent, z2, 0)) : u(context, intent, z2);
    }

    public void H(pl4 pl4Var) {
        ((HashSet) this.b).add(pl4Var);
        if (((pl4) this.c) != null) {
            return;
        }
        this.c = pl4Var;
        dl5 dl5VarJ = pl4Var.b.j();
        pl4Var.x = dl5VarJ;
        nl4 nl4Var = pl4Var.r;
        String str = zxg.a;
        dl5VarJ.getClass();
        nl4Var.getClass();
        nl4Var.obtainMessage(1, new ol4(ub8.c.getAndIncrement(), true, SystemClock.elapsedRealtime(), dl5VarJ)).sendToTarget();
    }

    public void I(z69 z69Var, Handler handler) {
        b79 b79Var = (b79) this.b;
        synchronized (b79Var.d) {
            b79Var.l = z69Var;
            b79Var.a.setCallback(z69Var.b, handler);
            synchronized (z69Var.a) {
                try {
                    z69Var.d = new WeakReference(b79Var);
                    ey eyVar = z69Var.e;
                    if (eyVar != null) {
                        eyVar.removeCallbacksAndMessages(null);
                    }
                    z69Var.e = new ey(z69Var, handler.getLooper(), 10);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.AbstractCollection, java.util.List] */
    public void J(f3c f3cVar) {
        b79 b79Var = (b79) this.b;
        b79Var.g = f3cVar;
        synchronized (b79Var.d) {
            for (int iBeginBroadcast = b79Var.f.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((ab7) b79Var.f.getBroadcastItem(iBeginBroadcast)).f(f3cVar);
                } catch (RemoteException | SecurityException e) {
                    Log.e("MediaSessionCompat", "Dead object in setPlaybackState.", e);
                }
            }
            b79Var.f.finishBroadcast();
        }
        MediaSession mediaSession = b79Var.a;
        if (f3cVar.v0 == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(f3cVar.a, f3cVar.b, f3cVar.d, f3cVar.Z);
            builder.setBufferedPosition(f3cVar.c);
            builder.setActions(f3cVar.o);
            builder.setErrorMessage(f3cVar.Y);
            for (e3c e3cVar : f3cVar.s0) {
                PlaybackState.CustomAction customActionBuild = e3cVar.o;
                if (customActionBuild == null) {
                    PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(e3cVar.a, e3cVar.b, e3cVar.c);
                    builder2.setExtras(e3cVar.d);
                    customActionBuild = builder2.build();
                }
                if (customActionBuild != null) {
                    builder.addCustomAction(customActionBuild);
                }
            }
            builder.setActiveQueueItemId(f3cVar.t0);
            builder.setExtras(f3cVar.u0);
            f3cVar.v0 = builder.build();
        }
        mediaSession.setPlaybackState(f3cVar.v0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012f  */
    @Override // defpackage.rn6, defpackage.v2f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h79.a(java.lang.Object):void");
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        k2h k2hVar = (k2h) obj;
        uid uidVar = (uid) this.c;
        w64 w64Var = (w64) this.b;
        String str = k2hVar.d;
        boolean z = k2hVar.b;
        if (!z || !b6a.Q(str)) {
            tgg tggVar = (tgg) w64Var.b.getValue();
            String str2 = ((um9) uidVar.a).a.c;
            tggVar.getClass();
            tgg.d(jvg.ERROR_DURING_CONVERT, str2);
            throw new MessageUploadException("conversion failed");
        }
        if (z) {
            tgg tggVar2 = (tgg) w64Var.b.getValue();
            String str3 = ((um9) uidVar.a).a.c;
            long jU = b6a.U(str);
            tggVar2.getClass();
            kvg kvgVar = kvg.g;
            kvgVar.getClass();
            kvgVar.a(str3, new imb("size_converted", Long.valueOf(jU)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    @Override // defpackage.fod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r5 = r4.c
            zk8 r5 = (defpackage.zk8) r5
            java.lang.Object r0 = r4.b
            v84 r0 = (defpackage.v84) r0
            monitor-enter(r5)
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L50
            int r1 = r0.c     // Catch: java.lang.Throwable -> L54
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto L12
            r1 = r3
            goto L13
        L12:
            r1 = r2
        L13:
            defpackage.l5j.f(r1)     // Catch: java.lang.Throwable -> L54
            int r1 = r0.c     // Catch: java.lang.Throwable -> L54
            int r1 = r1 - r3
            r0.c = r1     // Catch: java.lang.Throwable -> L54
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L50
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L50
            boolean r1 = r0.d     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L31
            int r1 = r0.c     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L31
            lk6 r1 = r5.a     // Catch: java.lang.Throwable -> L2f
            ty0 r2 = r0.a     // Catch: java.lang.Throwable -> L2f
            r1.U(r2, r0)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L50
            r2 = r3
            goto L32
        L2f:
            r0 = move-exception
            goto L52
        L31:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L50
        L32:
            vc3 r1 = r5.n(r0)     // Catch: java.lang.Throwable -> L50
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L50
            defpackage.vc3.P(r1)
            if (r2 == 0) goto L3d
            goto L3e
        L3d:
            r0 = 0
        L3e:
            if (r0 == 0) goto L49
            x6i r1 = r0.e
            if (r1 == 0) goto L49
            ty0 r0 = r0.a
            r1.q(r0, r3)
        L49:
            r5.l()
            r5.i()
            return
        L50:
            r0 = move-exception
            goto L57
        L52:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2f
            throw r0     // Catch: java.lang.Throwable -> L50
        L54:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L54
            throw r0     // Catch: java.lang.Throwable -> L50
        L57:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L50
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h79.b(java.lang.Object):void");
    }

    @Override // defpackage.v2f
    public void c(py4 py4Var) {
        ty4.h((gs8) this.c, py4Var);
    }

    @Override // defpackage.ub5
    public Object d() {
        return (wrg) this.b;
    }

    @Override // defpackage.gp0
    public ha8 e(Uri uri) {
        Uri uri2;
        sa9 sa9Var = (sa9) this.c;
        if (sa9Var != null && (uri2 = (Uri) sa9Var.b) != null && uri2.equals(uri)) {
            ha8 ha8Var = (ha8) ((sa9) this.c).c;
            hsi.h(ha8Var);
            return ha8Var;
        }
        ha8 ha8VarE = ((ue4) this.b).e(uri);
        sa9 sa9Var2 = new sa9();
        sa9Var2.a = null;
        sa9Var2.b = uri;
        sa9Var2.c = ha8VarE;
        this.c = sa9Var2;
        return ha8VarE;
    }

    @Override // defpackage.wl
    public tl f() {
        ReentrantReadWriteLock.ReadLock lock = ((ReentrantReadWriteLock) this.c).readLock();
        lock.lock();
        try {
            return (tl) ((awd) this.b).b;
        } finally {
            lock.unlock();
        }
    }

    @Override // defpackage.fvf
    public int g() {
        return ((FrameLayout) this.c).getMeasuredHeight();
    }

    @Override // defpackage.fvf
    public int h() {
        return ((FrameLayout) this.c).getBottom();
    }

    @Override // defpackage.wl
    public void i(tl tlVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) this.c;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            ((awd) this.b).b = tlVar;
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    @Override // defpackage.fvf
    public void j() {
        CallWaitingRoomEventsWidget.B0((CallWaitingRoomEventsWidget) this.b);
    }

    @Override // defpackage.cl7
    public v03 k() {
        h79 h79Var = this;
        List list = (List) ((AtomicReference) ((c0a) ((q5b) h79Var.b).a.getValue()).b).get();
        ArrayList arrayList = new ArrayList(we3.q(list, 10));
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                return new v03(arrayList, true);
            }
            b0a b0aVar = (b0a) it.next();
            boolean z = ((gu5) ((rt5) ((k18) h79Var.c).getValue())).n() == 0;
            long j = b0aVar.a;
            String str = b0aVar.r;
            arrayList.add(new hs2(j, str != null ? Uri.parse(str) : null, b0aVar.b, b0aVar.c, b0aVar.t, b0aVar.f, null, z, b0aVar.g, b0aVar.h, (gs2) gs2.Y.get(b0aVar.i), b0aVar.j, b0aVar.n, b0aVar.o, b0aVar.p, b0aVar.q, yzi.a(false, b0aVar.u, b0aVar.k, b0aVar.l, b0aVar.m, true, false, false, false, false, false, false), 528));
            h79Var = this;
            it = it;
        }
    }

    @Override // defpackage.gp0
    public boolean l(String str) {
        return ((ue4) this.b).l(str);
    }

    @Override // defpackage.fvf
    public View m() {
        return (FrameLayout) this.c;
    }

    @Override // defpackage.h37
    public g37 n() {
        return new u03(((w5) this.c).d(223), (bwf) this.b);
    }

    @Override // defpackage.fvf
    public int o() {
        return 0;
    }

    @Override // org.webrtc.DataChannel.Observer
    public void onBufferedAmountChange(long j) {
        ae4 ae4Var = (ae4) this.c;
        Iterator it = ae4Var.e.iterator();
        while (it.hasNext()) {
            ek6 ek6Var = (ek6) it.next();
            try {
                if (ae4Var == ek6Var.b) {
                    ek6.b(ek6Var.g);
                }
            } catch (Throwable th) {
                ae4Var.b.reportException("DataChannelRtcTransport", "rtc.datachannel.buffer.listen", new RtcInternalHandleException(th));
            }
        }
    }

    @Override // defpackage.fvf
    public void onDismiss() {
        CallWaitingRoomEventsWidget.B0((CallWaitingRoomEventsWidget) this.b);
    }

    @Override // defpackage.v2f
    public void onError(Throwable th) {
        ((v2f) this.b).onError(th);
    }

    @Override // defpackage.rn6
    public void onFailure(Throwable th) {
        a60 a60Var = (a60) this.c;
        if (a60Var.l != ((we5) this.b)) {
            return;
        }
        gri.a("AudioSource", "Unable to get input buffer, the BufferProvider could be transitioning to INACTIVE state.");
        if (th instanceof IllegalStateException) {
            return;
        }
        Executor executor = a60Var.j;
        enb enbVar = a60Var.k;
        if (executor == null || enbVar == null) {
            return;
        }
        executor.execute(new ud(enbVar, 10, th));
    }

    @Override // org.webrtc.DataChannel.Observer
    public void onMessage(DataChannel.Buffer buffer) {
        ByteBuffer byteBuffer = buffer.data;
        byte[] bArr = new byte[byteBuffer.remaining()];
        int i = buffer.binary ? 2 : 1;
        byteBuffer.get(bArr);
        ae4 ae4Var = (ae4) this.c;
        Iterator it = ae4Var.d.iterator();
        while (it.hasNext()) {
            try {
                ((uud) it.next()).a(ae4Var, bArr, i);
            } catch (Throwable th) {
                ae4Var.b.reportException("DataChannelRtcTransport", "rtc.datachannel.listen.response", new RtcInternalHandleException(th));
            }
        }
    }

    @Override // org.webrtc.DataChannel.Observer
    public void onStateChange() {
        ae4 ae4Var = (ae4) this.c;
        boolean z = ((DataChannel) this.b).state() == DataChannel.State.OPEN;
        Iterator it = ae4Var.c.iterator();
        while (it.hasNext()) {
            try {
                ((tud) it.next()).a(ae4Var, z);
            } catch (Throwable th) {
                ae4Var.b.reportException("DataChannelRtcTransport", "rtc.datachannel.handle.connection", new RtcInternalHandleException(th));
            }
        }
    }

    @Override // defpackage.lva
    public void p(Task task) {
        Exception excE = task.e();
        if (excE != null) {
            wqi.e(((vw6) this.c).b, "fail deletePushToken", new StoreServicesInfo$ServicesException("failure to delete token", excE));
        }
        ((lwd) this.b).resumeWith(qqg.a);
    }

    @Override // defpackage.gp0
    public ha8 q(byte[] bArr) {
        byte[] bArr2;
        sa9 sa9Var = (sa9) this.c;
        if (sa9Var != null && (bArr2 = (byte[]) sa9Var.a) != null && Arrays.equals(bArr2, bArr)) {
            ha8 ha8Var = (ha8) ((sa9) this.c).c;
            hsi.h(ha8Var);
            return ha8Var;
        }
        ha8 ha8VarQ = ((ue4) this.b).q(bArr);
        sa9 sa9Var2 = new sa9();
        sa9Var2.a = bArr;
        sa9Var2.b = null;
        sa9Var2.c = ha8VarQ;
        this.c = sa9Var2;
        return ha8VarQ;
    }

    @Override // defpackage.ub5
    public boolean r(CharSequence charSequence, int i, int i2, zog zogVar) {
        if ((zogVar.c & 4) > 0) {
            return true;
        }
        if (((wrg) this.b) == null) {
            this.b = new wrg(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((uha) this.c).getClass();
        ((wrg) this.b).setSpan(new apg(zogVar), i, i2, 33);
        return true;
    }

    @Override // defpackage.wl
    public tl s(vl vlVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) this.c;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            return ((awd) this.b).s(vlVar);
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    public void t(Object obj, String str) {
        ((ArrayList) this.b).add(u45.k(str, "=", String.valueOf(obj)));
    }

    public String toString() {
        switch (this.a) {
            case 28:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.c.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void v() {
        te8 te8Var = (te8) this.b;
        if (te8Var != null) {
            ((AtomicBoolean) te8Var.b).set(true);
            ((ScheduledFuture) te8Var.a).cancel(true);
        }
        this.b = null;
    }

    public Bitmap y(Uri uri, boolean z) throws Throwable {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        ContentResolver contentResolver = (ContentResolver) this.b;
        ParcelFileDescriptor parcelFileDescriptor = null;
        bitmapDecodeFile = null;
        Bitmap bitmapDecodeFile = null;
        try {
            parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
            try {
                try {
                    int iE = new pk5(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).e(1, "Orientation");
                    parcelFileDescriptorOpenFileDescriptor.close();
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor2 = contentResolver.openFileDescriptor(uri, "r");
                    Point pointA = tfi.a(parcelFileDescriptorOpenFileDescriptor2.getFileDescriptor(), iE);
                    parcelFileDescriptorOpenFileDescriptor2.close();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    if (z) {
                        options.inMutable = true;
                    }
                    options.inSampleSize = tfi.d(pointA, 2048, 2048);
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                    Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor(), null, options);
                    parcelFileDescriptorOpenFileDescriptor.close();
                    int iF = tfi.f(iE);
                    if (iF == 0) {
                        gbj.c(parcelFileDescriptorOpenFileDescriptor);
                        return bitmapDecodeFileDescriptor;
                    }
                    Matrix matrix = new Matrix();
                    matrix.setRotate(iF);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFileDescriptor, 0, 0, bitmapDecodeFileDescriptor.getWidth(), bitmapDecodeFileDescriptor.getHeight(), matrix, true);
                    bitmapDecodeFileDescriptor.recycle();
                    gbj.c(parcelFileDescriptorOpenFileDescriptor);
                    return bitmapCreateBitmap;
                } catch (IOException e) {
                    e = e;
                    if (!(e instanceof FileNotFoundException)) {
                        wqi.e("h79", "getBitmapFromPath: failed to get bitmap", e);
                        gbj.c(parcelFileDescriptorOpenFileDescriptor);
                        return null;
                    }
                    String string = uri.toString();
                    try {
                        if (new File(string).exists()) {
                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                            if (z) {
                                options2.inMutable = true;
                            }
                            bitmapDecodeFile = BitmapFactory.decodeFile(string, options2);
                        } else {
                            wqi.o("h79", null, "file by path %s not exists", Arrays.copyOf(new Object[]{string}, 1));
                        }
                    } catch (Throwable th) {
                        wqi.p("h79", "getBitmapFromExternalStorage fail", th);
                    }
                    gbj.c(parcelFileDescriptorOpenFileDescriptor);
                    return bitmapDecodeFile;
                }
            } catch (Throwable th2) {
                th = th2;
                parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                gbj.c(parcelFileDescriptor);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            parcelFileDescriptorOpenFileDescriptor = null;
        } catch (Throwable th3) {
            th = th3;
            gbj.c(parcelFileDescriptor);
            throw th;
        }
    }

    public List z(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.c;
        if (charSequence == null || vmf.F(charSequence)) {
            return hd5.a;
        }
        spannableStringBuilder.clear();
        spannableStringBuilder.clearSpans();
        spannableStringBuilder.append(charSequence);
        Object[] spans = spannableStringBuilder.getSpans(0, charSequence.length(), fj9.class);
        ArrayList arrayList = new ArrayList();
        for (Object obj : spans) {
            if (((fj9) obj).a.c == bj9.a) {
                arrayList.add(obj);
            }
        }
        return ue3.d0(arrayList);
    }

    public /* synthetic */ h79(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ h79(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ h79(Object obj) {
        this.a = 28;
        s5j.g(obj);
        this.c = obj;
        this.b = new ArrayList();
    }

    public h79(awd awdVar) {
        this.a = 4;
        this.b = awdVar;
        this.c = new ReentrantReadWriteLock();
    }

    public h79(eu2 eu2Var) {
        this.a = 25;
        this.b = eu2Var;
        this.c = new SpannableStringBuilder();
    }

    public h79(d47 d47Var, ukd ukdVar, dz9 dz9Var) {
        this.a = 26;
        jm3 jm3Var = new jm3();
        fa6 fa6Var = new fa6();
        fa6Var.a = ukdVar;
        fa6Var.b = dz9Var;
        fa6Var.c = jm3Var;
        fa6Var.d = new ConcurrentHashMap();
        this.b = d47Var;
        this.c = fa6Var;
    }

    public h79(Context context) {
        this.a = 1;
        this.b = context;
        this.c = new es(2);
    }

    public h79(ur4 ur4Var) {
        this.a = 16;
        this.c = ur4Var;
    }

    public h79(zjd zjdVar, int[] iArr) {
        this.a = 27;
        this.b = wg7.j(zjdVar);
        this.c = iArr;
    }

    public h79(OneMeMediaSessionService oneMeMediaSessionService, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.a = 0;
        if (!TextUtils.isEmpty(str)) {
            if (componentName == null) {
                int i = ga9.b;
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setPackage(oneMeMediaSessionService.getPackageName());
                List<ResolveInfo> listQueryBroadcastReceivers = oneMeMediaSessionService.getPackageManager().queryBroadcastReceivers(intent, 0);
                if (listQueryBroadcastReceivers.size() == 1) {
                    ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
                    componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                } else {
                    if (listQueryBroadcastReceivers.size() > 1) {
                        Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                    }
                    componentName = null;
                }
                if (componentName == null) {
                    Log.i("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                }
            }
            if (componentName != null && pendingIntent == null) {
                Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                intent2.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(oneMeMediaSessionService, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                this.b = new d79(oneMeMediaSessionService, str, bundle);
            } else if (i2 >= 28) {
                this.b = new c79(oneMeMediaSessionService, str, bundle);
            } else {
                this.b = new b79(oneMeMediaSessionService, str, bundle);
            }
            Looper looperMyLooper = Looper.myLooper();
            I(new x69(), new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper));
            ((b79) this.b).a.setMediaButtonReceiver(pendingIntent);
            this.c = new i5i((Context) oneMeMediaSessionService, ((b79) this.b).c);
            return;
        }
        throw new IllegalArgumentException("tag must not be null or empty");
    }

    public h79(l29 l29Var, a aVar, FrameLayout frameLayout) {
        this.a = 19;
        this.b = aVar;
        this.c = frameLayout;
    }

    public h79(int i) {
        this.a = i;
        switch (i) {
            case 21:
                this.b = new HashMap();
                break;
            default:
                this.b = new HashSet();
                break;
        }
    }

    public h79(ez1 ez1Var) {
        this.a = 9;
        this.c = ez1Var;
        this.b = null;
    }
}
