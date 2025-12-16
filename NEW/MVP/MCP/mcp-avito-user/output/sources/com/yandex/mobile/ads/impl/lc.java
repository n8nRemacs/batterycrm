package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.provider.Settings;
import com.yandex.mobile.ads.embedded.guava.collect.p;
import com.yandex.mobile.ads.embedded.guava.collect.q;
import j.InterfaceC42164u;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class lc {

    /* renamed from: c, reason: collision with root package name */
    private static final mc f387440c = tv0.a();

    /* renamed from: d, reason: collision with root package name */
    public static final lc f387441d = new lc(new int[]{2}, 8);

    /* renamed from: e, reason: collision with root package name */
    private static final lc f387442e = new lc(new int[]{2, 5, 6}, 8);

    /* renamed from: f, reason: collision with root package name */
    private static final com.yandex.mobile.ads.embedded.guava.collect.q<Integer, Integer> f387443f = new q.a().a(5, 6).a(17, 6).a(7, 6).a(18, 6).a(6, 8).a(8, 8).a(14, 8).a();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f387444a;

    /* renamed from: b, reason: collision with root package name */
    private final int f387445b;

    public lc(@j.P int[] iArr, int i12) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f387444a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f387444a = new int[0];
        }
        this.f387445b = i12;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc)) {
            return false;
        }
        lc lcVar = (lc) obj;
        return Arrays.equals(this.f387444a, lcVar.f387444a) && this.f387445b == lcVar.f387445b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f387444a) * 31) + this.f387445b;
    }

    public final String toString() {
        StringBuilder sbA = Cif.a("AudioCapabilities[maxChannelCount=");
        sbA.append(this.f387445b);
        sbA.append(", supportedEncodings=");
        sbA.append(Arrays.toString(this.f387444a));
        sbA.append("]");
        return sbA.toString();
    }

    public static lc a(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        int i12 = pc1.f388768a;
        if (i12 >= 17) {
            mc mcVar = f387440c;
            String strA = mcVar.a();
            String str = pc1.f388770c;
            if ((strA.equals(str) || mcVar.c().equals(str)) && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
                return f387442e;
            }
        }
        return (i12 < 29 || (!pc1.d(context) && (i12 < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) ? (intentRegisterReceiver == null || intentRegisterReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? f387441d : new lc(intentRegisterReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), intentRegisterReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8)) : new lc(a.a(), 8);
    }

    @j.X
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final AudioAttributes f387446a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        @InterfaceC42164u
        public static int[] a() {
            int i12 = com.yandex.mobile.ads.embedded.guava.collect.p.f382791c;
            p.a aVar = new p.a();
            Iterator it = lc.f387443f.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(num.intValue()).setSampleRate(48000).build(), f387446a)) {
                    aVar.b(num);
                }
            }
            aVar.b((Object) 2);
            return c80.a(aVar.a());
        }

        @InterfaceC42164u
        public static int a(int i12, int i13) {
            for (int i14 = 8; i14 > 0; i14--) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i12).setSampleRate(i13).setChannelMask(pc1.a(i14)).build(), f387446a)) {
                    return i14;
                }
            }
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008a  */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<java.lang.Integer, java.lang.Integer> a(com.yandex.mobile.ads.impl.vw r10) throws java.lang.NumberFormatException {
        /*
            r9 = this;
            java.lang.String r0 = r10.f391181l
            r0.getClass()
            java.lang.String r1 = r10.f391178i
            int r0 = com.yandex.mobile.ads.impl.qg0.b(r0, r1)
            com.yandex.mobile.ads.embedded.guava.collect.q<java.lang.Integer, java.lang.Integer> r1 = com.yandex.mobile.ads.impl.lc.f387443f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r2 = r1.containsKey(r2)
            r3 = 0
            if (r2 != 0) goto L19
            return r3
        L19:
            r2 = 7
            r4 = 6
            r5 = 8
            r6 = 18
            if (r0 != r6) goto L2c
            int[] r7 = r9.f387444a
            int r7 = java.util.Arrays.binarySearch(r7, r6)
            if (r7 < 0) goto L2a
            goto L2c
        L2a:
            r0 = r4
            goto L38
        L2c:
            if (r0 != r5) goto L38
            int[] r7 = r9.f387444a
            int r7 = java.util.Arrays.binarySearch(r7, r5)
            if (r7 < 0) goto L37
            goto L38
        L37:
            r0 = r2
        L38:
            int[] r7 = r9.f387444a
            int r7 = java.util.Arrays.binarySearch(r7, r0)
            if (r7 < 0) goto Lb5
            int r7 = r10.f391194y
            r8 = -1
            if (r7 == r8) goto L4d
            if (r0 != r6) goto L48
            goto L4d
        L48:
            int r10 = r9.f387445b
            if (r7 <= r10) goto L76
            return r3
        L4d:
            int r10 = r10.f391195z
            if (r10 == r8) goto L52
            goto L55
        L52:
            r10 = 48000(0xbb80, float:6.7262E-41)
        L55:
            int r6 = com.yandex.mobile.ads.impl.pc1.f388768a
            r7 = 29
            if (r6 < r7) goto L60
            int r7 = com.yandex.mobile.ads.impl.lc.a.a(r0, r10)
            goto L76
        L60:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r10 = r1.getOrDefault(r10, r6)
            java.lang.Integer r10 = (java.lang.Integer) r10
            r10.getClass()
            int r7 = r10.intValue()
        L76:
            int r10 = com.yandex.mobile.ads.impl.pc1.f388768a
            r1 = 28
            if (r10 > r1) goto L8a
            if (r7 != r2) goto L80
            r4 = r5
            goto L8b
        L80:
            r1 = 3
            if (r7 == r1) goto L8b
            r1 = 4
            if (r7 == r1) goto L8b
            r1 = 5
            if (r7 != r1) goto L8a
            goto L8b
        L8a:
            r4 = r7
        L8b:
            r1 = 26
            if (r10 > r1) goto La1
            com.yandex.mobile.ads.impl.mc r10 = com.yandex.mobile.ads.impl.lc.f387440c
            java.lang.String r10 = r10.b()
            java.lang.String r1 = com.yandex.mobile.ads.impl.pc1.f388769b
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto La1
            r10 = 1
            if (r4 != r10) goto La1
            r4 = 2
        La1:
            int r10 = com.yandex.mobile.ads.impl.pc1.a(r4)
            if (r10 != 0) goto La8
            return r3
        La8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            android.util.Pair r10 = android.util.Pair.create(r0, r10)
            return r10
        Lb5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.lc.a(com.yandex.mobile.ads.impl.vw):android.util.Pair");
    }
}
