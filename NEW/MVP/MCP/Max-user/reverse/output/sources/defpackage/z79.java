package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Log;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import one.me.android.media.service.OneMeMediaSessionService;

/* loaded from: classes.dex */
public final class z79 extends z69 {
    public static final int x;
    public final fde f;
    public final o79 g;
    public final f89 h;
    public final x79 i;
    public final ey j;
    public final h79 k;
    public final eo l;
    public final ComponentName m;
    public v79 n;
    public final boolean o = true;
    public volatile long p;
    public x79 q;
    public int r;
    public final Bundle s;
    public wg7 t;
    public wg7 u;
    public bie v;
    public o3c w;

    static {
        x = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z79(defpackage.o79 r10, android.net.Uri r11, android.os.Handler r12, android.os.Bundle r13, defpackage.wg7 r14, defpackage.wg7 r15, defpackage.bie r16, defpackage.o3c r17, android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z79.<init>(o79, android.net.Uri, android.os.Handler, android.os.Bundle, wg7, wg7, bie, o3c, android.os.Bundle):void");
    }

    public static void C(h79 h79Var, ArrayList arrayList) {
        if (arrayList != null) {
            h79Var.getClass();
            HashSet hashSet = new HashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                long j = ((e79) it.next()).b;
                if (hashSet.contains(Long.valueOf(j))) {
                    Log.e("MediaSessionCompat", vb9.e(j, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j));
            }
        }
        b79 b79Var = (b79) h79Var.b;
        MediaSession mediaSession = b79Var.a;
        b79Var.h = arrayList;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            e79 e79Var = (e79) it2.next();
            MediaSession.QueueItem queueItem = e79Var.c;
            if (queueItem == null) {
                MediaSession.QueueItem queueItem2 = new MediaSession.QueueItem(e79Var.a.b(), e79Var.b);
                e79Var.c = queueItem2;
                queueItem = queueItem2;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    public static void D(h79 h79Var, x19 x19Var) {
        b79 b79Var = (b79) h79Var.b;
        b79Var.i = x19Var;
        MediaSession mediaSession = b79Var.a;
        Bundle bundle = x19Var.a;
        if (x19Var.b == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            for (String str : bundle.keySet()) {
                Integer num = (Integer) x19.c.get(str);
                if (num == null) {
                    num = -1;
                }
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    builder.putLong(str, bundle.getLong(str));
                } else if (iIntValue == 1) {
                    builder.putText(str, bundle.getString(str));
                } else if (iIntValue == 2) {
                    builder.putBitmap(str, (Bitmap) bundle.getParcelable(str));
                } else if (iIntValue != 3) {
                    Object obj = bundle.get(str);
                    if (obj == null || (obj instanceof CharSequence)) {
                        builder.putText(str, (CharSequence) obj);
                    } else if (obj instanceof Long) {
                        builder.putLong(str, ((Long) obj).longValue());
                    }
                } else {
                    builder.putRating(str, (Rating) bundle.getParcelable(str));
                }
            }
            x19Var.b = builder.build();
        }
        mediaSession.setMetadata(x19Var.b);
    }

    public static k09 E(String str, Uri uri, String str2, Bundle bundle) {
        oz8 oz8Var = new oz8();
        t76 t76Var = wg7.b;
        zjd zjdVar = zjd.o;
        List list = Collections.EMPTY_LIST;
        zjd zjdVar2 = zjd.o;
        wz8 wz8Var = new wz8();
        d09 d09Var = d09.d;
        if (str == null) {
            str = "";
        }
        String str3 = str;
        u5i u5iVar = new u5i();
        u5iVar.a = uri;
        u5iVar.b = str2;
        u5iVar.c = bundle;
        return new k09(str3, new sz8(oz8Var), null, new yz8(wz8Var), w19.K, new d09(u5iVar));
    }

    public static ComponentName I(OneMeMediaSessionService oneMeMediaSessionService, String str) {
        PackageManager packageManager = oneMeMediaSessionService.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(oneMeMediaSessionService.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            return null;
        }
        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
        return new ComponentName(serviceInfo.packageName, serviceInfo.name);
    }

    @Override // defpackage.z69
    public final void A(long j) {
        if (j < 0) {
            return;
        }
        G(10, new q79(this, j, 0), ((b79) this.k.b).b(), true);
    }

    @Override // defpackage.z69
    public final void B() {
        G(3, new p79(this, 6), ((b79) this.k.b).b(), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.f3c F(defpackage.a5c r32) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z79.F(a5c):f3c");
    }

    public final void G(final int i, final y79 y79Var, final b89 b89Var, final boolean z) {
        o79 o79Var = this.g;
        if (o79Var.j()) {
            return;
        }
        if (b89Var != null) {
            zxg.a0(o79Var.l, new Runnable() { // from class: t79
                @Override // java.lang.Runnable
                public final void run() {
                    y79 y79Var2 = y79Var;
                    z79 z79Var = this.a;
                    o79 o79Var2 = z79Var.g;
                    if (o79Var2.j()) {
                        return;
                    }
                    boolean zIsActive = ((b79) z79Var.k.b).a.isActive();
                    int i2 = i;
                    b89 b89Var2 = b89Var;
                    if (!zIsActive) {
                        StringBuilder sbM = ho7.m(i2, "Ignore incoming player command before initialization. command=", ", pid=");
                        sbM.append(b89Var2.a.b);
                        a8i.l("MediaSessionLegacyStub", sbM.toString());
                        return;
                    }
                    u69 u69VarK = z79Var.K(b89Var2);
                    if (!z79Var.f.z(u69VarK, i2)) {
                        if (i2 != 1 || o79Var2.t.i()) {
                            return;
                        }
                        a8i.l("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                        return;
                    }
                    usd usdVar = o79Var2.e;
                    o79Var2.t(u69VarK);
                    usdVar.getClass();
                    try {
                        y79Var2.b(u69VarK);
                    } catch (RemoteException e) {
                        a8i.m("MediaSessionLegacyStub", "Exception in " + u69VarK, e);
                    }
                    if (z) {
                        new SparseBooleanArray().append(i2, true);
                        o79Var2.q(u69VarK);
                    }
                }
            });
            return;
        }
        a8i.e("MediaSessionLegacyStub", "RemoteUserInfo is null, ignoring command=" + i);
    }

    public final void H(aie aieVar, int i, y79 y79Var, b89 b89Var) {
        if (b89Var != null) {
            zxg.a0(this.g.l, new xz0(this, aieVar, i, b89Var, y79Var, 3));
            return;
        }
        StringBuilder sb = new StringBuilder("RemoteUserInfo is null, ignoring command=");
        Object objValueOf = aieVar;
        if (aieVar == null) {
            objValueOf = Integer.valueOf(i);
        }
        sb.append(objValueOf);
        a8i.e("MediaSessionLegacyStub", sb.toString());
    }

    public final void J(k09 k09Var, boolean z) {
        G(31, new ys5(this, k09Var, z, 2), ((b79) this.k.b).b(), false);
    }

    public final u69 K(b89 b89Var) {
        u69 u69VarQ = this.f.q(b89Var);
        if (u69VarQ == null) {
            u69 u69Var = new u69(b89Var, 0, 0, this.h.b(b89Var), new w79(b89Var), Bundle.EMPTY);
            s69 s69VarM = this.g.m(u69Var);
            this.f.a(b89Var, u69Var, s69VarM.a, s69VarM.b);
            o79 o79Var = this.g;
            if (!o79Var.A || !o79.k(u69Var)) {
                o79Var.e.getClass();
            }
            u69VarQ = u69Var;
        }
        ey eyVar = this.j;
        long j = this.p;
        eyVar.removeMessages(1001, u69VarQ);
        eyVar.sendMessageDelayed(eyVar.obtainMessage(1001, u69VarQ), j);
        return u69VarQ;
    }

    public final void L() {
        zjd zjdVarE = bg3.e(bg3.c(this.u, this.v, this.w), true, true);
        this.t = zjdVarE;
        boolean z = !bg3.a(2, zjdVarE);
        Bundle bundle = this.s;
        bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", z);
        bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", !bg3.a(3, this.t));
    }

    public final void M(a5c a5cVar) {
        zxg.a0(this.g.l, new r79(this, a5cVar, 1));
    }

    @Override // defpackage.z69
    public final void b(wy8 wy8Var) {
        if (wy8Var != null) {
            G(20, new pz1(this, wy8Var, -1, 6), ((b79) this.k.b).b(), false);
        }
    }

    @Override // defpackage.z69
    public final void c(wy8 wy8Var, int i) {
        if (wy8Var != null) {
            if (i == -1 || i >= 0) {
                G(20, new pz1(this, wy8Var, i, 6), ((b79) this.k.b).b(), false);
            }
        }
    }

    @Override // defpackage.z69
    public final void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (str.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") && resultReceiver != null) {
            resultReceiver.send(0, this.g.j.b());
        } else {
            aie aieVar = new aie(str, Bundle.EMPTY);
            H(aieVar, 0, new nl(this, aieVar, bundle, resultReceiver), ((b79) this.k.b).b());
        }
    }

    @Override // defpackage.z69
    public final void e(String str, Bundle bundle) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        aie aieVar = new aie(str, Bundle.EMPTY);
        H(aieVar, 0, new dq4(this, aieVar, bundle), ((b79) this.k.b).b());
    }

    @Override // defpackage.z69
    public final void f() {
        G(12, new p79(this, 0), ((b79) this.k.b).b(), true);
    }

    @Override // defpackage.z69
    public final boolean g(Intent intent) {
        b89 b89VarB = ((b79) this.k.b).b();
        b89VarB.getClass();
        return this.g.o(new u69(b89VarB, 0, 0, false, null, Bundle.EMPTY), intent);
    }

    @Override // defpackage.z69
    public final void h() {
        G(1, new p79(this, 11), ((b79) this.k.b).b(), true);
    }

    @Override // defpackage.z69
    public final void i() {
        G(1, new p79(this, 10), ((b79) this.k.b).b(), false);
    }

    @Override // defpackage.z69
    public final void j(String str, Bundle bundle) {
        J(E(str, null, null, bundle), true);
    }

    @Override // defpackage.z69
    public final void k(String str, Bundle bundle) {
        J(E(null, null, str, bundle), true);
    }

    @Override // defpackage.z69
    public final void l(Uri uri, Bundle bundle) {
        J(E(null, uri, null, bundle), true);
    }

    @Override // defpackage.z69
    public final void m() {
        G(2, new p79(this, 5), ((b79) this.k.b).b(), true);
    }

    @Override // defpackage.z69
    public final void n(String str, Bundle bundle) {
        J(E(str, null, null, bundle), false);
    }

    @Override // defpackage.z69
    public final void o(String str, Bundle bundle) {
        J(E(null, null, str, bundle), false);
    }

    @Override // defpackage.z69
    public final void p(Uri uri, Bundle bundle) {
        J(E(null, uri, null, bundle), false);
    }

    @Override // defpackage.z69
    public final void q(wy8 wy8Var) {
        if (wy8Var == null) {
            return;
        }
        G(20, new dq4(this, 19, wy8Var), ((b79) this.k.b).b(), true);
    }

    @Override // defpackage.z69
    public final void r() {
        G(11, new p79(this, 4), ((b79) this.k.b).b(), true);
    }

    @Override // defpackage.z69
    public final void s(long j) {
        G(5, new q79(this, j, 1), ((b79) this.k.b).b(), true);
    }

    @Override // defpackage.z69
    public final void t(float f) {
        if (f <= 0.0f) {
            return;
        }
        G(13, new fj4(this, f), ((b79) this.k.b).b(), true);
    }

    @Override // defpackage.z69
    public final void u(j8d j8dVar) {
        v(j8dVar);
    }

    @Override // defpackage.z69
    public final void v(j8d j8dVar) {
        g8d g8dVarO = i28.o(j8dVar);
        if (g8dVarO != null) {
            H(null, 40010, new p79(this, g8dVarO), ((b79) this.k.b).b());
            return;
        }
        a8i.l("MediaSessionLegacyStub", "Ignoring invalid RatingCompat " + j8dVar);
    }

    @Override // defpackage.z69
    public final void w(int i) {
        G(15, new s79(this, i, 0), ((b79) this.k.b).b(), true);
    }

    @Override // defpackage.z69
    public final void x(int i) {
        G(14, new s79(this, i, 1), ((b79) this.k.b).b(), true);
    }

    @Override // defpackage.z69
    public final void y() {
        boolean zS = this.g.t.S(9);
        h79 h79Var = this.k;
        if (zS) {
            G(9, new p79(this, 8), ((b79) h79Var.b).b(), true);
        } else {
            G(8, new p79(this, 9), ((b79) h79Var.b).b(), true);
        }
    }

    @Override // defpackage.z69
    public final void z() {
        boolean zS = this.g.t.S(7);
        h79 h79Var = this.k;
        if (zS) {
            G(7, new p79(this, 2), ((b79) h79Var.b).b(), true);
        } else {
            G(6, new p79(this, 3), ((b79) h79Var.b).b(), true);
        }
    }
}
