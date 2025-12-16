package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.http.entity.ContentLengthStrategy;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes2.dex */
public final class r30 implements nce {
    public static final uy0 Y = new uy0(15);
    public Object X;
    public Object a = r30.class.getName();
    public Object b;
    public Object c;
    public Object d;
    public Object o;

    public r30(Context context, q30 q30Var) {
        this.b = context;
        this.c = q30Var;
        final int i = 0;
        this.d = new und(new cm6(this) { // from class: p30
            public final /* synthetic */ r30 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new eo(2, this.b);
                    default:
                        return (AudioManager) ((Context) this.b.b).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                }
            }
        });
        final int i2 = 1;
        this.o = new bwf(new cm6(this) { // from class: p30
            public final /* synthetic */ r30 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new eo(2, this.b);
                    default:
                        return (AudioManager) ((Context) this.b.b).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                }
            }
        });
    }

    public static void g(uk4 uk4Var, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry> setEntrySet = uk4Var.b.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public static c99 j(i3 i3Var, wg7 wg7Var, c99 c99Var, l9g l9gVar) {
        r9g r9gVarO0 = i3Var.o0();
        int iJ = i3Var.j();
        Object objL = r9gVarO0.p() ? null : r9gVarO0.l(iJ);
        int iB = (i3Var.f() || r9gVarO0.p()) ? -1 : r9gVarO0.f(iJ, l9gVar, false).b(xxg.B(i3Var.e()) - l9gVar.o);
        for (int i = 0; i < wg7Var.size(); i++) {
            c99 c99Var2 = (c99) wg7Var.get(i);
            if (n(c99Var2, objL, i3Var.f(), i3Var.s(), i3Var.l(), iB)) {
                return c99Var2;
            }
        }
        if (wg7Var.isEmpty() && c99Var != null && n(c99Var, objL, i3Var.f(), i3Var.s(), i3Var.l(), iB)) {
            return c99Var;
        }
        return null;
    }

    public static boolean n(c99 c99Var, Object obj, boolean z, int i, int i2, int i3) {
        Object obj2 = c99Var.a;
        int i4 = c99Var.b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z && i4 == i && c99Var.c == i2) {
            return true;
        }
        return !z && i4 == -1 && c99Var.e == i3;
    }

    public static x9f u(r30 r30Var, sm6 sm6Var) {
        String strE = xc0.e(((AtomicInteger) r30Var.X).getAndIncrement(), "job", "-");
        x9f x9fVarE = svi.e((f84) r30Var.b, null, i84.b, sm6Var, 1);
        hu7 hu7Var = new hu7(strE, x9fVarE);
        ((ConcurrentHashMap) r30Var.o).put(strE, x9fVarE);
        ((jve) r30Var.d).h(hu7Var);
        ((cj0) r30Var.c).invoke((String) r30Var.a, "Adding for queue job=".concat(strE));
        return x9fVarE;
    }

    @Override // defpackage.nce
    public void a(vbe vbeVar) {
        ((jve) this.a).h(vbeVar);
    }

    @Override // defpackage.nce
    public void b(xbe xbeVar) {
        fga fgaVar = (fga) this.b;
        if (!(xbeVar instanceof vbe)) {
            fgaVar.invoke();
            return;
        }
        Object value = ((hbd) this.X).a.getValue();
        g2c g2cVar = value instanceof g2c ? (g2c) value : null;
        if (g2cVar != null && ((vbe) xbeVar).c == g2cVar.b) {
            fgaVar.invoke();
        } else {
            ((hwa) ((k18) this.c).getValue()).C(null, null, null, null, null, null, ((vbe) xbeVar).c, 1);
            fgaVar.invoke();
        }
    }

    @Override // defpackage.nce
    public hbd c() {
        return (hbd) this.X;
    }

    @Override // defpackage.nce
    public void d(zea zeaVar) {
        ((tcf) this.o).m(null, new g2c(zeaVar.a, zeaVar.b, zeaVar.c));
    }

    @Override // defpackage.nce
    public gbd e() {
        return (gbd) this.d;
    }

    @Override // defpackage.nce
    public o6g f() {
        return new o6g(t3d.oneme_login_neuro_avatars_profile_title, t3d.oneme_login_neuro_avatars_profile_description, t3d.oneme_login_neuro_avatars_save_button);
    }

    public void h(lk6 lk6Var, c99 c99Var, r9g r9gVar) {
        if (c99Var == null) {
            return;
        }
        if (r9gVar.b(c99Var.a) != -1) {
            lk6Var.T(c99Var, r9gVar);
            return;
        }
        r9g r9gVar2 = (r9g) ((ah7) this.a).get(c99Var);
        if (r9gVar2 != null) {
            lk6Var.T(c99Var, r9gVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(defpackage.q44 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.iu7
            if (r0 == 0) goto L13
            r0 = r8
            iu7 r0 = (defpackage.iu7) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            iu7 r0 = new iu7
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.X
            int r1 = r0.Z
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            java.util.Iterator r1 = r0.o
            java.util.concurrent.ConcurrentHashMap r3 = r0.d
            defpackage.g8j.b(r8)
            goto L7d
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            defpackage.g8j.b(r8)
            java.lang.Object r8 = r7.o
            java.util.concurrent.ConcurrentHashMap r8 = (java.util.concurrent.ConcurrentHashMap) r8
            java.lang.Object r1 = r7.c
            cj0 r1 = (defpackage.cj0) r1
            java.lang.Object r3 = r7.a
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r8.size()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Cancelling all jobs in queue="
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r1.invoke(r3, r4)
            java.util.Set r1 = r8.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L5d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L74
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getValue()
            qt7 r3 = (defpackage.qt7) r3
            r4 = 0
            r3.cancel(r4)
            goto L5d
        L74:
            java.util.Set r1 = r8.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r3 = r8
        L7d:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L9e
            java.lang.Object r8 = r1.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r8 = r8.getValue()
            qt7 r8 = (defpackage.qt7) r8
            r0.d = r3
            r0.o = r1
            r0.Z = r2
            java.lang.Object r8 = r8.join(r0)
            g84 r4 = defpackage.g84.a
            if (r8 != r4) goto L7d
            return r4
        L9e:
            r3.clear()
            qqg r8 = defpackage.qqg.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r30.i(q44):java.lang.Object");
    }

    public fz0 k(String str) {
        return (fz0) ((HashMap) this.b).get(str);
    }

    public fz0 l(String str) {
        HashMap map = (HashMap) this.b;
        fz0 fz0Var = (fz0) map.get(str);
        if (fz0Var != null) {
            return fz0Var;
        }
        SparseArray sparseArray = (SparseArray) this.c;
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            iKeyAt = i;
        }
        fz0 fz0Var2 = new fz0(iKeyAt, str, uk4.c);
        map.put(str, fz0Var2);
        sparseArray.put(iKeyAt, str);
        ((SparseBooleanArray) this.d).put(iKeyAt, true);
        ((lqh) this.o).q(fz0Var2);
        return fz0Var2;
    }

    public void m(long j) {
        lqh lqhVar;
        SparseArray sparseArray = (SparseArray) this.c;
        HashMap map = (HashMap) this.b;
        lqh lqhVar2 = (lqh) this.o;
        lqhVar2.getClass();
        lqh lqhVar3 = (lqh) this.X;
        if (lqhVar3 != null) {
            lqhVar3.getClass();
        }
        if (lqhVar2.f() || (lqhVar = (lqh) this.X) == null || !lqhVar.f()) {
            lqhVar2.m(map, sparseArray);
        } else {
            ((lqh) this.X).m(map, sparseArray);
            lqhVar2.t(map);
        }
        lqh lqhVar4 = (lqh) this.X;
        if (lqhVar4 != null) {
            s7c s7cVar = (s7c) lqhVar4.d;
            ((File) s7cVar.a).delete();
            ((File) s7cVar.b).delete();
            this.X = null;
        }
    }

    public void o(String str) {
        SparseArray sparseArray = (SparseArray) this.c;
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.d;
        HashMap map = (HashMap) this.b;
        fz0 fz0Var = (fz0) map.get(str);
        if (fz0Var != null && fz0Var.c.isEmpty() && fz0Var.d.isEmpty()) {
            map.remove(str);
            int i = fz0Var.a;
            boolean z = sparseBooleanArray.get(i);
            ((lqh) this.o).a = true;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
            } else {
                sparseArray.put(i, null);
                ((SparseBooleanArray) this.a).put(i, true);
            }
        }
    }

    public void p(int i) {
        String strE;
        q30 q30Var = (q30) this.c;
        String str = (String) this.a;
        switch (i) {
            case -3:
                strE = "AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK";
                break;
            case ContentLengthStrategy.CHUNKED /* -2 */:
                strE = "AUDIOFOCUS_LOSS_TRANSIENT";
                break;
            case -1:
                strE = "AUDIOFOCUS_LOSS";
                break;
            case 0:
                strE = "AUDIOFOCUS_NONE";
                break;
            case 1:
                strE = "AUDIOFOCUS_GAIN";
                break;
            case 2:
                strE = "AUDIOFOCUS_GAIN_TRANSIENT";
                break;
            case 3:
                strE = "AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK";
                break;
            case 4:
                strE = "AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE";
                break;
            default:
                strE = wy1.e(i, "AUDIO_FOCUS_UNKNOWN(", ")");
                break;
        }
        wqi.c(str, "On audio focus change, %d", strE);
        if (i == -3) {
            if (!q30Var.d() || q30Var.a() <= 0.0f) {
                return;
            }
            wqi.c(str, "Player. Audio Focus. Focus changed: AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK. Setting volume to 0.2", new Object[0]);
            q30Var.b(0.2f);
            return;
        }
        if (i == -2) {
            if (!q30Var.d() || q30Var.a() <= 0.0f) {
                return;
            }
            wqi.c(str, "Player. Audio Focus. Focus changed: AUDIOFOCUS_LOSS_TRANSIENT. Pausing current player", new Object[0]);
            q30Var.pause();
            return;
        }
        if (i == -1) {
            wqi.c(str, "onAudioFocusChange: AUDIOFOCUS_LOSS", new Object[0]);
            if (!q30Var.d() || q30Var.a() <= 0.0f) {
                return;
            }
            wqi.c(str, "Player. Audio Focus. Focus changed: AUDIOFOCUS_LOSS. Stop", new Object[0]);
            q30Var.pause();
            return;
        }
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            wqi.q(str, "Player. Audio Focus. Focus changed: " + i + ". It's not implemented", new Object[0]);
            return;
        }
        if (!q30Var.d() && q30Var.U0()) {
            wqi.c(str, "Player. Audio Focus. Focus changed: AUDIOFOCUS_GAIN. Resuming player", new Object[0]);
            q30Var.play();
        }
        float fA = q30Var.a();
        if (fA <= 0.0f || fA >= 1.0f) {
            return;
        }
        wqi.c(str, "Player. Audio Focus. Focus changed: AUDIOFOCUS_GAIN. Volume up", new Object[0]);
        q30Var.b(1.0f);
    }

    public void q() {
        AudioFocusRequest audioFocusRequest = (AudioFocusRequest) this.X;
        if (audioFocusRequest == null) {
            return;
        }
        this.X = null;
        wqi.c((String) this.a, "Release audio focus", new Object[0]);
        und undVar = (und) this.d;
        if (undVar.e()) {
            ((Context) this.b).unregisterReceiver((BroadcastReceiver) undVar.getValue());
            undVar.reset();
        }
        ((AudioManager) ((bwf) this.o).getValue()).abandonAudioFocusRequest(audioFocusRequest);
    }

    public void r(int i, int i2) {
        Context context = (Context) this.b;
        und undVar = (und) this.d;
        String str = (String) this.a;
        q30 q30Var = (q30) this.c;
        if (q30Var.a() <= 0.0f || !q30Var.d()) {
            wqi.c(str, "Skip request audio focus volume:" + q30Var.a() + " isPlaying:" + q30Var.d(), new Object[0]);
            return;
        }
        if (undVar.e()) {
            context.unregisterReceiver((BroadcastReceiver) undVar.getValue());
            undVar.reset();
        }
        context.registerReceiver((BroadcastReceiver) undVar.getValue(), new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
        AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(i2).setOnAudioFocusChangeListener(q30Var).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(i).build()).build();
        this.X = audioFocusRequestBuild;
        wqi.c(str, "Request audio focus", new Object[0]);
        ((AudioManager) ((bwf) this.o).getValue()).requestAudioFocus(audioFocusRequestBuild);
    }

    public void s() {
        ((li) this.d).getClass();
    }

    public void t() {
        lqh lqhVar = (lqh) this.o;
        HashMap map = (HashMap) this.b;
        if (lqhVar.a) {
            lqhVar.t(map);
        }
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.a;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            ((SparseArray) this.c).remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        ((SparseBooleanArray) this.d).clear();
    }

    public void v(r9g r9gVar) {
        lk6 lk6Var = new lk6(4);
        if (((wg7) this.c).isEmpty()) {
            h(lk6Var, (c99) this.o, r9gVar);
            if (!uyi.c((c99) this.X, (c99) this.o)) {
                h(lk6Var, (c99) this.X, r9gVar);
            }
            if (!uyi.c((c99) this.d, (c99) this.o) && !uyi.c((c99) this.d, (c99) this.X)) {
                h(lk6Var, (c99) this.d, r9gVar);
            }
        } else {
            for (int i = 0; i < ((wg7) this.c).size(); i++) {
                h(lk6Var, (c99) ((wg7) this.c).get(i), r9gVar);
            }
            if (!((wg7) this.c).contains((c99) this.d)) {
                h(lk6Var, (c99) this.d, r9gVar);
            }
        }
        this.a = lk6Var.u();
    }
}
