package androidx.media3.exoplayer.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.provider.Settings;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.AbstractC37412t1;
import com.google.common.collect.C37414t3;
import com.google.common.collect.H1;
import com.google.common.collect.N4;
import com.google.common.collect.O4;
import j.InterfaceC42164u;
import j.P;
import j.X;
import java.util.Arrays;
import org.webrtc.MediaStreamTrack;

/* compiled from: AudioCapabilities.java */
@J
/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f48857c = new a(new int[]{2}, 10);

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC37401r1<Integer> f48858d;

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC37412t1<Integer, Integer> f48859e;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f48860a;

    /* renamed from: b, reason: collision with root package name */
    public final int f48861b;

    /* compiled from: AudioCapabilities.java */
    @X
    /* renamed from: androidx.media3.exoplayer.audio.a$a, reason: collision with other inner class name */
    public static final class C1824a {
        @InterfaceC42164u
        private static final H1<Integer> a() {
            H1.a aVar = new H1.a();
            aVar.h(8, 7);
            int i12 = M.f47887a;
            if (i12 >= 31) {
                aVar.h(26, 27);
            }
            if (i12 >= 33) {
                aVar.b(30);
            }
            return aVar.j();
        }

        @InterfaceC42164u
        public static final boolean b(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            audioManager.getClass();
            AudioDeviceInfo[] devices = audioManager.getDevices(2);
            H1<Integer> h1A = a();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (h1A.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: AudioCapabilities.java */
    @X
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final AudioAttributes f48862a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        @InterfaceC42164u
        public static AbstractC37401r1<Integer> a() {
            O4<Object> o42 = AbstractC37401r1.f359977c;
            AbstractC37401r1.a aVar = new AbstractC37401r1.a();
            N4<Integer> it = a.f48859e.keySet().iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                int iIntValue = next.intValue();
                if (M.f47887a >= 34 || iIntValue != 30) {
                    if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), f48862a)) {
                        aVar.g(next);
                    }
                }
            }
            aVar.g(2);
            return aVar.i();
        }

        @InterfaceC42164u
        public static int b(int i12, int i13) {
            for (int i14 = 10; i14 > 0; i14--) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i12).setSampleRate(i13).setChannelMask(M.p(i14)).build(), f48862a)) {
                    return i14;
                }
            }
            return 0;
        }
    }

    static {
        Object[] objArr = {2, 5, 6};
        C37414t3.a(3, objArr);
        f48858d = AbstractC37401r1.r(3, objArr);
        AbstractC37412t1.b bVar = new AbstractC37412t1.b();
        bVar.c(5, 6);
        bVar.c(17, 6);
        bVar.c(7, 6);
        bVar.c(30, 10);
        bVar.c(18, 6);
        bVar.c(6, 8);
        bVar.c(8, 8);
        bVar.c(14, 8);
        f48859e = bVar.a(true);
    }

    public a(@P int[] iArr, int i12) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f48860a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f48860a = new int[0];
        }
        this.f48861b = i12;
    }

    public static boolean a() {
        if (M.f47887a >= 17) {
            String str = M.f47889c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static a b(Context context) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    public static a c(Context context, @P Intent intent) {
        int i12 = M.f47887a;
        a aVar = f48857c;
        if (i12 >= 23 && C1824a.b(context)) {
            return aVar;
        }
        H1.a aVar2 = new H1.a();
        if (a() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            aVar2.i(f48858d);
        }
        if (i12 >= 29 && (M.D(context) || (i12 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            aVar2.i(b.a());
            return new a(com.google.common.primitives.l.g(aVar2.j()), 10);
        }
        if (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            H1 h1J = aVar2.j();
            return !h1J.isEmpty() ? new a(com.google.common.primitives.l.g(h1J), 10) : aVar;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            aVar2.i(com.google.common.primitives.l.a(intArrayExtra));
        }
        return new a(com.google.common.primitives.l.g(aVar2.j()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10));
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<java.lang.Integer, java.lang.Integer> d(androidx.media3.common.C23108t r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.f47757m
            r0.getClass()
            java.lang.String r1 = r10.f47754j
            int r0 = androidx.media3.common.D.b(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            com.google.common.collect.t1<java.lang.Integer, java.lang.Integer> r2 = androidx.media3.exoplayer.audio.a.f48859e
            boolean r1 = r2.containsKey(r1)
            r3 = 0
            if (r1 != 0) goto L19
            return r3
        L19:
            int[] r1 = r9.f48860a
            r4 = 7
            r5 = 6
            r6 = 8
            r7 = 18
            if (r0 != r7) goto L2c
            int r8 = java.util.Arrays.binarySearch(r1, r7)
            if (r8 < 0) goto L2a
            goto L2c
        L2a:
            r0 = r5
            goto L40
        L2c:
            if (r0 != r6) goto L34
            int r8 = java.util.Arrays.binarySearch(r1, r6)
            if (r8 < 0) goto L3f
        L34:
            r8 = 30
            if (r0 != r8) goto L40
            int r8 = java.util.Arrays.binarySearch(r1, r8)
            if (r8 < 0) goto L3f
            goto L40
        L3f:
            r0 = r4
        L40:
            int r1 = java.util.Arrays.binarySearch(r1, r0)
            if (r1 < 0) goto Lc8
            r1 = -1
            int r8 = r10.f47770z
            if (r8 == r1) goto L62
            if (r0 != r7) goto L4e
            goto L62
        L4e:
            java.lang.String r10 = r10.f47757m
            java.lang.String r1 = "audio/vnd.dts.uhd;profile=p2"
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L5d
            r10 = 10
            if (r8 <= r10) goto L8d
            return r3
        L5d:
            int r10 = r9.f48861b
            if (r8 <= r10) goto L8d
            return r3
        L62:
            int r10 = r10.f47737A
            if (r10 == r1) goto L67
            goto L6a
        L67:
            r10 = 48000(0xbb80, float:6.7262E-41)
        L6a:
            int r1 = androidx.media3.common.util.M.f47887a
            r7 = 29
            if (r1 < r7) goto L76
            int r10 = androidx.media3.exoplayer.audio.a.b.b(r0, r10)
        L74:
            r8 = r10
            goto L8d
        L76:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r10 = r2.get(r10)
            if (r10 == 0) goto L86
            r1 = r10
        L86:
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r10 = r1.intValue()
            goto L74
        L8d:
            int r10 = androidx.media3.common.util.M.f47887a
            r1 = 28
            if (r10 > r1) goto La1
            if (r8 != r4) goto L97
            r5 = r6
            goto La2
        L97:
            r1 = 3
            if (r8 == r1) goto La2
            r1 = 4
            if (r8 == r1) goto La2
            r1 = 5
            if (r8 != r1) goto La1
            goto La2
        La1:
            r5 = r8
        La2:
            r1 = 26
            if (r10 > r1) goto Lb4
            java.lang.String r10 = "fugu"
            java.lang.String r1 = androidx.media3.common.util.M.f47888b
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto Lb4
            r10 = 1
            if (r5 != r10) goto Lb4
            r5 = 2
        Lb4:
            int r10 = androidx.media3.common.util.M.p(r5)
            if (r10 != 0) goto Lbb
            return r3
        Lbb:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            android.util.Pair r10 = android.util.Pair.create(r0, r10)
            return r10
        Lc8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.a.d(androidx.media3.common.t):android.util.Pair");
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Arrays.equals(this.f48860a, aVar.f48860a) && this.f48861b == aVar.f48861b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f48860a) * 31) + this.f48861b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f48861b + ", supportedEncodings=" + Arrays.toString(this.f48860a) + "]";
    }
}
