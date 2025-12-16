package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.media3.common.PlaybackException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class ry8 implements ox8 {
    public final Context a;
    public final px8 b;
    public final tje c;
    public final ua8 d;
    public final py8 e;
    public final gp0 f;
    public final Bundle g;
    public final long h;
    public i5i i;
    public nv8 j;
    public boolean k;
    public boolean l;
    public qy8 m = new qy8();
    public qy8 n = new qy8();
    public boolean o;
    public goh p;
    public long q;
    public long r;

    public ry8(Context context, px8 px8Var, tje tjeVar, Bundle bundle, Looper looper, gp0 gp0Var) {
        goh gohVar = new goh();
        gohVar.b = q4c.F.h(ssc.g);
        gohVar.c = bie.b;
        gohVar.d = o3c.b;
        gohVar.a = zjd.o;
        gohVar.e = Bundle.EMPTY;
        gohVar.f = null;
        this.p = gohVar;
        this.d = new ua8(looper, mwf.a, new ny8(this));
        this.a = context;
        this.b = px8Var;
        this.e = new py8(this, looper);
        this.c = tjeVar;
        this.g = bundle;
        this.f = gp0Var;
        this.h = 100L;
        this.q = -9223372036854775807L;
        this.r = -9223372036854775807L;
        zjd zjdVar = zjd.o;
    }

    public static List m(List list) {
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static f3c o(f3c f3cVar) {
        if (f3cVar == null) {
            return null;
        }
        if (f3cVar.d > 0.0f) {
            return f3cVar;
        }
        a8i.l("MCImplLegacy", "Adjusting playback speed to 1.0f because negative playback speed isn't supported.");
        ArrayList arrayList = new ArrayList();
        long j = f3cVar.c;
        long j2 = f3cVar.o;
        int i = f3cVar.X;
        CharSequence charSequence = f3cVar.Y;
        AbstractCollection abstractCollection = f3cVar.s0;
        if (abstractCollection != null) {
            arrayList.addAll(abstractCollection);
        }
        return new f3c(f3cVar.a, f3cVar.b, j, 1.0f, j2, i, charSequence, f3cVar.Z, arrayList, f3cVar.t0, f3cVar.u0);
    }

    public static t3c r(int i, k09 k09Var, long j, boolean z) {
        return new t3c(null, i, k09Var, null, i, j, j, z ? 0 : -1, z ? 0 : -1);
    }

    @Override // defpackage.ox8
    public final void A(int i, long j, List list) {
        if (list.isEmpty()) {
            S(0, Integer.MAX_VALUE);
            return;
        }
        ssc sscVar = ssc.g;
        sscVar.getClass();
        tg7 tg7Var = new tg7(4);
        wg7 wg7Var = sscVar.e;
        tg7Var.d(wg7Var.subList(0, 0));
        for (int i2 = 0; i2 < list.size(); i2++) {
            tg7Var.a(new rsc((k09) list.get(i2), -1L, -9223372036854775807L));
        }
        tg7Var.d(wg7Var.subList(0, wg7Var.size()));
        q4c q4cVarI = ((q4c) this.p.b).i(new ssc(tg7Var.i(), sscVar.f), new wie(r(i, (k09) list.get(i), j == -9223372036854775807L ? 0L : j, false), false, SystemClock.elapsedRealtime(), -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L), 0);
        goh gohVar = this.p;
        W(new goh(q4cVarI, (bie) gohVar.c, (o3c) gohVar.d, (wg7) gohVar.a, (Bundle) gohVar.e, null), null, null);
        if (B()) {
            z();
        }
    }

    public final boolean B() {
        return ((q4c) this.p.b).y != 1;
    }

    @Override // defpackage.ox8
    public final void C(List list) {
        A(0, -9223372036854775807L, list);
    }

    @Override // defpackage.ox8
    public final o3c D() {
        return (o3c) this.p.d;
    }

    @Override // defpackage.ox8
    public final bie E() {
        return (bie) this.p.c;
    }

    @Override // defpackage.ox8
    public final wg7 F() {
        return (wg7) this.p.a;
    }

    @Override // defpackage.ox8
    public final void G(r3c r3cVar) {
        this.d.a(r3cVar);
    }

    @Override // defpackage.ox8
    public final int H() {
        return -1;
    }

    @Override // defpackage.ox8
    public final void I(int i) {
        S(i, i + 1);
    }

    @Override // defpackage.ox8
    public final Bundle J() {
        return this.g;
    }

    @Override // defpackage.ox8
    public final long K() {
        return ((q4c) this.p.b).c.e;
    }

    @Override // defpackage.ox8
    public final int L() {
        return -1;
    }

    @Override // defpackage.ox8
    public final void M(k20 k20Var, boolean z) {
        a8i.l("MCImplLegacy", "Legacy session doesn't support setting audio attributes remotely");
    }

    @Override // defpackage.ox8
    public final void N(r3c r3cVar) {
        this.d.e(r3cVar);
    }

    @Override // defpackage.ox8
    public final void O(k09 k09Var) {
        h(k09Var, -9223372036854775807L);
    }

    @Override // defpackage.ox8
    public final ha8 P(aie aieVar) {
        Bundle bundle = Bundle.EMPTY;
        boolean zContains = ((bie) this.p.c).a.contains(aieVar);
        String str = aieVar.b;
        if (zContains) {
            this.i.j().I0(str, bundle);
            return a6a.c(new yie(0));
        }
        hke hkeVar = new hke();
        rx8 rx8Var = new rx8(this.b.o, hkeVar, 1);
        i5i i5iVar = this.i;
        i5iVar.getClass();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("command must neither be null nor empty");
        }
        ((tx8) i5iVar.a).a.sendCommand(str, bundle, rx8Var);
        return hkeVar;
    }

    @Override // defpackage.ox8
    public final w19 Q() {
        k09 k09VarN = ((q4c) this.p.b).n();
        return k09VarN == null ? w19.K : k09VarN.d;
    }

    public final void R() {
        vx8 vx8Var;
        x19 x19VarCreateFromParcel;
        int i;
        int shuffleMode;
        if (this.k || this.l) {
            return;
        }
        this.l = true;
        MediaController.PlaybackInfo playbackInfo = ((tx8) this.i.a).a.getPlaybackInfo();
        if (playbackInfo != null) {
            int playbackType = playbackInfo.getPlaybackType();
            AudioAttributes audioAttributes = playbackInfo.getAudioAttributes();
            l20 l20Var = new l20();
            l20Var.a = audioAttributes;
            vx8Var = new vx8(playbackType, new m20(l20Var), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        } else {
            vx8Var = null;
        }
        f3c f3cVarO = o(this.i.i());
        MediaMetadata metadata = ((tx8) this.i.a).a.getMetadata();
        if (metadata != null) {
            us usVar = x19.c;
            Parcel parcelObtain = Parcel.obtain();
            metadata.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            x19VarCreateFromParcel = x19.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
            x19VarCreateFromParcel.b = metadata;
        } else {
            x19VarCreateFromParcel = null;
        }
        List<MediaSession.QueueItem> queue = ((tx8) this.i.a).a.getQueue();
        List listM = m(queue != null ? e79.a(queue) : null);
        CharSequence queueTitle = ((tx8) this.i.a).a.getQueueTitle();
        db7 db7VarA = ((tx8) this.i.a).e.a();
        int repeatMode = -1;
        if (db7VarA != null) {
            try {
                i = -1;
                repeatMode = db7VarA.getRepeatMode();
            } catch (RemoteException | SecurityException e) {
                Log.e("MediaControllerCompat", "Dead object in getRepeatMode.", e);
            }
        } else {
            i = -1;
        }
        db7 db7VarA2 = ((tx8) this.i.a).e.a();
        if (db7VarA2 != null) {
            try {
                shuffleMode = db7VarA2.getShuffleMode();
            } catch (RemoteException | SecurityException e2) {
                Log.e("MediaControllerCompat", "Dead object in getShuffleMode.", e2);
            }
        } else {
            shuffleMode = i;
        }
        w(true, new qy8(vx8Var, f3cVarO, x19VarCreateFromParcel, listM, queueTitle, repeatMode, shuffleMode, ((tx8) this.i.a).a.getExtras()));
    }

    public final void S(int i, int i2) {
        hsi.b(i >= 0 && i2 >= i);
        int iO = v().o();
        int iMin = Math.min(i2, iO);
        if (i >= iO || i == iMin) {
            return;
        }
        ssc sscVar = (ssc) ((q4c) this.p.b).j;
        sscVar.getClass();
        tg7 tg7Var = new tg7(4);
        wg7 wg7Var = sscVar.e;
        tg7Var.d(wg7Var.subList(0, i));
        tg7Var.d(wg7Var.subList(iMin, wg7Var.size()));
        ssc sscVar2 = new ssc(tg7Var.i(), sscVar.f);
        int iT = t();
        int i3 = iMin - i;
        if (iT >= i) {
            iT = iT < iMin ? -1 : iT - i3;
        }
        if (iT == -1) {
            iT = zxg.i(i, 0, sscVar2.o() - 1);
            a8i.l("MCImplLegacy", "Currently playing item is removed. Assumes item at " + iT + " is the new current item");
        }
        int i4 = iT;
        q4c q4cVar = (q4c) this.p.b;
        PlaybackException playbackException = q4cVar.a;
        int i5 = q4cVar.b;
        wie wieVar = q4cVar.c;
        t3c t3cVar = q4cVar.d;
        t3c t3cVar2 = q4cVar.e;
        int i6 = q4cVar.f;
        c3c c3cVar = q4cVar.g;
        int i7 = q4cVar.h;
        boolean z = q4cVar.i;
        sch schVar = q4cVar.l;
        w19 w19Var = q4cVar.m;
        float f = q4cVar.n;
        k20 k20Var = q4cVar.o;
        ib4 ib4Var = q4cVar.p;
        mv4 mv4Var = q4cVar.q;
        int i8 = q4cVar.r;
        boolean z2 = q4cVar.s;
        boolean z3 = q4cVar.t;
        int i9 = q4cVar.u;
        boolean z4 = q4cVar.v;
        boolean z5 = q4cVar.w;
        int i10 = q4cVar.x;
        int i11 = q4cVar.y;
        w19 w19Var2 = q4cVar.z;
        long j = q4cVar.A;
        long j2 = q4cVar.B;
        long j3 = q4cVar.C;
        kgg kggVar = q4cVar.D;
        egg eggVar = q4cVar.E;
        t3c t3cVar3 = wieVar.a;
        wie wieVar2 = new wie(new t3c(t3cVar3.a, i4, t3cVar3.c, t3cVar3.d, t3cVar3.e, t3cVar3.f, t3cVar3.g, t3cVar3.h, t3cVar3.i), wieVar.b, wieVar.c, wieVar.d, wieVar.e, wieVar.f, wieVar.g, wieVar.h, wieVar.i, wieVar.j);
        hsi.g(sscVar2.p() || wieVar2.a.b < sscVar2.o());
        q4c q4cVar2 = new q4c(playbackException, i5, wieVar2, t3cVar, t3cVar2, i6, c3cVar, i7, z, schVar, sscVar2, 0, w19Var, f, k20Var, ib4Var, mv4Var, i8, z2, z3, i9, i10, i11, z4, z5, w19Var2, j, j2, j3, kggVar, eggVar);
        goh gohVar = this.p;
        W(new goh(q4cVar2, (bie) gohVar.c, (o3c) gohVar.d, (wg7) gohVar.a, (Bundle) gohVar.e, null), null, null);
        if (B()) {
            for (int i12 = i; i12 < iMin && i12 < this.m.d.size(); i12++) {
                i5i i5iVar = this.i;
                wy8 wy8Var = ((e79) this.m.d.get(i12)).a;
                tx8 tx8Var = (tx8) i5iVar.a;
                if ((tx8Var.a.getFlags() & 4) == 0) {
                    throw new UnsupportedOperationException("This session doesn't support queue management operations");
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION, n28.a(wy8Var, MediaDescriptionCompat.CREATOR));
                tx8Var.a.sendCommand(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM, bundle, null);
            }
        }
    }

    public final void T(int i, long j) {
        Integer num;
        Integer num2;
        int i2;
        long j2;
        long j3;
        long j4;
        int i3 = i;
        long j5 = j;
        hsi.b(i3 >= 0);
        int iT = t();
        s9g s9gVar = ((q4c) this.p.b).j;
        if ((s9gVar.p() || i3 < s9gVar.o()) && !f()) {
            if (i3 != iT) {
                long jQ = ((ssc) ((q4c) this.p.b).j).q(i3);
                if (jQ != -1) {
                    ((MediaController.TransportControls) this.i.j().b).skipToQueueItem(jQ);
                    num = 2;
                } else {
                    wy1.p(i3, "Cannot seek to new media item due to the missing queue Id at media item, mediaItemIndex=", "MCImplLegacy");
                    i3 = iT;
                    num = null;
                }
            } else {
                i3 = iT;
                num = null;
            }
            long jE = e();
            if (j5 == -9223372036854775807L) {
                j5 = jE;
                num2 = null;
            } else {
                ((MediaController.TransportControls) this.i.j().b).seekTo(j5);
                num2 = 1;
            }
            if (num == null) {
                long jK = K();
                long duration = getDuration();
                long jMax = j5 < jE ? j5 : Math.max(j5, jK);
                j2 = jMax;
                i2 = duration == -9223372036854775807L ? 0 : (int) ((100 * jMax) / duration);
                j3 = jMax - j5;
                j4 = duration;
            } else {
                i2 = 0;
                j2 = 0;
                j3 = 0;
                j4 = -9223372036854775807L;
            }
            q4c q4cVarG = ((q4c) this.p.b).g(new wie(r(i3, !s9gVar.p() ? s9gVar.m(i3, new q9g(), 0L).c : null, j5, false), false, SystemClock.elapsedRealtime(), j4, j2, i2, j3, -9223372036854775807L, j4, j2));
            if (q4cVarG.y != 1) {
                q4cVarG = q4cVarG.e(2, null);
            }
            q4c q4cVar = q4cVarG;
            goh gohVar = this.p;
            W(new goh(q4cVar, (bie) gohVar.c, (o3c) gohVar.d, (wg7) gohVar.a, (Bundle) gohVar.e, null), num2, num);
        }
    }

    public final void U(boolean z) {
        q4c q4cVar = (q4c) this.p.b;
        if (q4cVar.t == z) {
            return;
        }
        this.q = rei.c(q4cVar, this.q, this.r, this.b.X);
        this.r = SystemClock.elapsedRealtime();
        q4c q4cVarC = ((q4c) this.p.b).c(1, 0, z);
        goh gohVar = this.p;
        W(new goh(q4cVarC, (bie) gohVar.c, (o3c) gohVar.d, (wg7) gohVar.a, (Bundle) gohVar.e, null), null, null);
        if (!B() || ((q4c) this.p.b).j.p()) {
            return;
        }
        if (z) {
            ((MediaController.TransportControls) this.i.j().b).play();
        } else {
            ((MediaController.TransportControls) this.i.j().b).pause();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V(boolean r18, defpackage.qy8 r19, boolean r20, final defpackage.goh r21, java.lang.Integer r22, java.lang.Integer r23) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ry8.V(boolean, qy8, boolean, goh, java.lang.Integer, java.lang.Integer):void");
    }

    public final void W(goh gohVar, Integer num, Integer num2) {
        V(false, this.m, false, gohVar, num, num2);
    }

    @Override // defpackage.ox8
    public final float a() {
        return 1.0f;
    }

    @Override // defpackage.ox8
    public final void b(float f) {
        a8i.l("MCImplLegacy", "Session doesn't support setting player volume");
    }

    @Override // defpackage.ox8
    public final c3c c() {
        return ((q4c) this.p.b).g;
    }

    @Override // defpackage.ox8
    public final void connect() {
        tje tjeVar = this.c;
        int type = tjeVar.a.getType();
        px8 px8Var = this.b;
        if (type != 0) {
            px8Var.z(new oy8(this, 0));
            return;
        }
        Object objB = tjeVar.a.b();
        hsi.h(objB);
        px8Var.z(new qz5(this, 23, (g79) objB));
        px8Var.o.postDelayed(new oy8(this, 1), 500L);
    }

    @Override // defpackage.ox8
    public final boolean d() {
        return ((q4c) this.p.b).v;
    }

    @Override // defpackage.ox8
    public final long e() {
        long jC = rei.c((q4c) this.p.b, this.q, this.r, this.b.X);
        this.q = jC;
        return jC;
    }

    @Override // defpackage.ox8
    public final boolean f() {
        return ((q4c) this.p.b).c.b;
    }

    @Override // defpackage.ox8
    public final long g() {
        return ((q4c) this.p.b).c.g;
    }

    @Override // defpackage.ox8
    public final long getDuration() {
        return ((q4c) this.p.b).c.d;
    }

    @Override // defpackage.ox8
    public final int getPlaybackState() {
        return ((q4c) this.p.b).y;
    }

    @Override // defpackage.ox8
    public final int getRepeatMode() {
        return ((q4c) this.p.b).h;
    }

    @Override // defpackage.ox8
    public final void h(k09 k09Var, long j) {
        A(0, j, wg7.m(k09Var));
    }

    @Override // defpackage.ox8
    public final boolean i() {
        return ((q4c) this.p.b).t;
    }

    @Override // defpackage.ox8
    public final boolean isConnected() {
        return this.l;
    }

    @Override // defpackage.ox8
    public final int j() {
        return t();
    }

    @Override // defpackage.ox8
    public final void k() {
        T(t(), 0L);
    }

    @Override // defpackage.ox8
    public final int l() {
        return -1;
    }

    @Override // defpackage.ox8
    public final PlaybackException n() {
        return ((q4c) this.p.b).a;
    }

    @Override // defpackage.ox8
    public final long p() {
        return e();
    }

    @Override // defpackage.ox8
    public final void pause() {
        U(false);
    }

    @Override // defpackage.ox8
    public final void play() {
        U(true);
    }

    @Override // defpackage.ox8
    public final void prepare() {
        q4c q4cVar = (q4c) this.p.b;
        if (q4cVar.y != 1) {
            return;
        }
        q4c q4cVarE = q4cVar.e(q4cVar.j.p() ? 4 : 2, null);
        goh gohVar = this.p;
        W(new goh(q4cVarE, (bie) gohVar.c, (o3c) gohVar.d, (wg7) gohVar.a, (Bundle) gohVar.e, null), null, null);
        if (((q4c) this.p.b).j.p()) {
            return;
        }
        z();
    }

    @Override // defpackage.ox8
    public final kgg q() {
        return kgg.b;
    }

    @Override // defpackage.ox8
    public final void release() throws RemoteException {
        Messenger messenger;
        if (this.k) {
            return;
        }
        this.k = true;
        nv8 nv8Var = this.j;
        if (nv8Var != null) {
            lv8 lv8Var = nv8Var.a;
            s7c s7cVar = lv8Var.f;
            if (s7cVar != null && (messenger = lv8Var.g) != null) {
                try {
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 7;
                    messageObtain.arg1 = 1;
                    messageObtain.replyTo = messenger;
                    ((Messenger) s7cVar.a).send(messageObtain);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            lv8Var.b.disconnect();
            this.j = null;
        }
        i5i i5iVar = this.i;
        if (i5iVar != null) {
            Set set = (Set) i5iVar.b;
            py8 py8Var = this.e;
            if (set.remove(py8Var)) {
                try {
                    ((tx8) i5iVar.a).b(py8Var);
                } finally {
                    py8Var.j(null);
                }
            } else {
                Log.w("MediaControllerCompat", "the callback has never been registered");
            }
            py8Var.d.removeCallbacksAndMessages(null);
            this.i = null;
        }
        this.l = false;
        this.d.d();
    }

    @Override // defpackage.ox8
    public final int s() {
        return -1;
    }

    @Override // defpackage.ox8
    public final void seekTo(long j) {
        T(t(), j);
    }

    @Override // defpackage.ox8
    public final void setPlaybackSpeed(float f) {
        if (f != c().a) {
            q4c q4cVarD = ((q4c) this.p.b).d(new c3c(f));
            goh gohVar = this.p;
            W(new goh(q4cVarD, (bie) gohVar.c, (o3c) gohVar.d, (wg7) gohVar.a, (Bundle) gohVar.e, null), null, null);
        }
        this.i.j().J0(f);
    }

    @Override // defpackage.ox8
    public final void stop() {
        q4c q4cVar = (q4c) this.p.b;
        if (q4cVar.y == 1) {
            return;
        }
        wie wieVar = q4cVar.c;
        t3c t3cVar = wieVar.a;
        long j = wieVar.d;
        long j2 = t3cVar.f;
        q4c q4cVarG = q4cVar.g(new wie(t3cVar, false, SystemClock.elapsedRealtime(), j, j2, rei.b(j2, j), 0L, -9223372036854775807L, j, j2));
        q4c q4cVar2 = (q4c) this.p.b;
        if (q4cVar2.y != 1) {
            q4cVarG = q4cVarG.e(1, q4cVar2.a);
        }
        q4c q4cVar3 = q4cVarG;
        goh gohVar = this.p;
        W(new goh(q4cVar3, (bie) gohVar.c, (o3c) gohVar.d, (wg7) gohVar.a, (Bundle) gohVar.e, null), null, null);
        ((MediaController.TransportControls) this.i.j().b).stop();
    }

    @Override // defpackage.ox8
    public final int t() {
        return ((q4c) this.p.b).c.a.b;
    }

    @Override // defpackage.ox8
    public final int u() {
        return 0;
    }

    @Override // defpackage.ox8
    public final s9g v() {
        return ((q4c) this.p.b).j;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x041d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x043a A[LOOP:2: B:212:0x0436->B:214:0x043a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x061e A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x077b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0620 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x07bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:414:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e5 A[PHI: r10
  0x01e5: PHI (r10v11 ssc) = (r10v6 ssc), (r10v13 ssc) binds: [B:96:0x01e9, B:93:0x01df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01eb  */
    /* JADX WARN: Type inference failed for: r11v52, types: [java.util.AbstractCollection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.AbstractCollection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(boolean r82, defpackage.qy8 r83) {
        /*
            Method dump skipped, instructions count: 2194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ry8.w(boolean, qy8):void");
    }

    @Override // defpackage.ox8
    public final void x(k09 k09Var) {
        O(k09Var);
    }

    @Override // defpackage.ox8
    public final boolean y() {
        return ((q4c) this.p.b).i;
    }

    public final void z() {
        q9g q9gVar = new q9g();
        int i = 0;
        hsi.g(B() && !((q4c) this.p.b).j.p());
        q4c q4cVar = (q4c) this.p.b;
        ssc sscVar = (ssc) q4cVar.j;
        int i2 = q4cVar.c.a.b;
        sscVar.m(i2, q9gVar, 0L);
        k09 k09Var = q9gVar.c;
        if (sscVar.q(i2) == -1) {
            d09 d09Var = k09Var.f;
            String str = k09Var.a;
            if (d09Var.a != null) {
                if (((q4c) this.p.b).t) {
                    wx8 wx8VarJ = this.i.j();
                    Uri uri = d09Var.a;
                    Bundle bundle = d09Var.c;
                    if (bundle == null) {
                        bundle = Bundle.EMPTY;
                    }
                    ((MediaController.TransportControls) wx8VarJ.b).playFromUri(uri, bundle);
                } else {
                    wx8 wx8VarJ2 = this.i.j();
                    Uri uri2 = d09Var.a;
                    Bundle bundle2 = d09Var.c;
                    if (bundle2 == null) {
                        bundle2 = Bundle.EMPTY;
                    }
                    ((MediaController.TransportControls) wx8VarJ2.b).prepareFromUri(uri2, bundle2);
                }
            } else if (d09Var.b != null) {
                if (((q4c) this.p.b).t) {
                    wx8 wx8VarJ3 = this.i.j();
                    String str2 = d09Var.b;
                    Bundle bundle3 = d09Var.c;
                    if (bundle3 == null) {
                        bundle3 = Bundle.EMPTY;
                    }
                    ((MediaController.TransportControls) wx8VarJ3.b).playFromSearch(str2, bundle3);
                } else {
                    wx8 wx8VarJ4 = this.i.j();
                    String str3 = d09Var.b;
                    Bundle bundle4 = d09Var.c;
                    if (bundle4 == null) {
                        bundle4 = Bundle.EMPTY;
                    }
                    ((MediaController.TransportControls) wx8VarJ4.b).prepareFromSearch(str3, bundle4);
                }
            } else if (((q4c) this.p.b).t) {
                wx8 wx8VarJ5 = this.i.j();
                Bundle bundle5 = d09Var.c;
                if (bundle5 == null) {
                    bundle5 = Bundle.EMPTY;
                }
                ((MediaController.TransportControls) wx8VarJ5.b).playFromMediaId(str, bundle5);
            } else {
                wx8 wx8VarJ6 = this.i.j();
                Bundle bundle6 = d09Var.c;
                if (bundle6 == null) {
                    bundle6 = Bundle.EMPTY;
                }
                ((MediaController.TransportControls) wx8VarJ6.b).prepareFromMediaId(str, bundle6);
            }
        } else if (((q4c) this.p.b).t) {
            ((MediaController.TransportControls) this.i.j().b).play();
        } else {
            ((MediaController.TransportControls) this.i.j().b).prepare();
        }
        if (((q4c) this.p.b).c.a.f != 0) {
            ((MediaController.TransportControls) this.i.j().b).seekTo(((q4c) this.p.b).c.a.f);
        }
        if (((o3c) this.p.d).a(20)) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < sscVar.o(); i3++) {
                if (i3 != i2 && sscVar.q(i3) == -1) {
                    sscVar.m(i3, q9gVar, 0L);
                    arrayList.add(q9gVar.c);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            xz0 xz0Var = new xz0(this, new AtomicInteger(0), arrayList, arrayList2, i, 2);
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                byte[] bArr = ((k09) arrayList.get(i4)).d.k;
                if (bArr == null) {
                    arrayList2.add(null);
                    xz0Var.run();
                } else {
                    ha8 ha8VarQ = this.f.q(bArr);
                    arrayList2.add(ha8VarQ);
                    Handler handler = this.b.o;
                    Objects.requireNonNull(handler);
                    ha8VarQ.d(xz0Var, new fv1(1, handler));
                }
            }
        }
    }
}
