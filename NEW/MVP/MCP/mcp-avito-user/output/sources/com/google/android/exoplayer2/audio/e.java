package com.google.android.exoplayer2.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.provider.Settings;
import com.google.android.exoplayer2.util.U;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.AbstractC37412t1;
import com.google.common.collect.N4;
import com.google.common.collect.O4;
import j.InterfaceC42164u;
import j.P;
import j.X;
import java.util.Arrays;

/* compiled from: AudioCapabilities.java */
/* loaded from: classes6.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f343983c = new e(new int[]{2}, 8);

    /* renamed from: d, reason: collision with root package name */
    public static final e f343984d = new e(new int[]{2, 5, 6}, 8);

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC37412t1<Integer, Integer> f343985e;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f343986a;

    /* renamed from: b, reason: collision with root package name */
    public final int f343987b;

    /* compiled from: AudioCapabilities.java */
    @X
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final AudioAttributes f343988a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        @InterfaceC42164u
        public static int[] a() {
            O4<Object> o42 = AbstractC37401r1.f359977c;
            AbstractC37401r1.a aVar = new AbstractC37401r1.a();
            N4<Integer> it = e.f343985e.keySet().iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(next.intValue()).setSampleRate(48000).build(), f343988a)) {
                    aVar.g(next);
                }
            }
            aVar.g(2);
            return com.google.common.primitives.l.g(aVar.i());
        }

        @InterfaceC42164u
        public static int b(int i12, int i13) {
            for (int i14 = 8; i14 > 0; i14--) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i12).setSampleRate(i13).setChannelMask(U.o(i14)).build(), f343988a)) {
                    return i14;
                }
            }
            return 0;
        }
    }

    static {
        AbstractC37412t1.b bVar = new AbstractC37412t1.b();
        bVar.c(5, 6);
        bVar.c(17, 6);
        bVar.c(7, 6);
        bVar.c(18, 6);
        bVar.c(6, 8);
        bVar.c(8, 8);
        bVar.c(14, 8);
        f343985e = bVar.a(true);
    }

    public e(@P int[] iArr, int i12) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f343986a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f343986a = new int[0];
        }
        this.f343987b = i12;
    }

    @SuppressLint({"InlinedApi"})
    public static e a(Context context, @P Intent intent) {
        int i12 = U.f348106a;
        if (i12 >= 17) {
            String str = U.f348108c;
            if (("Amazon".equals(str) || "Xiaomi".equals(str)) && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
                return f343984d;
            }
        }
        return (i12 < 29 || (!U.G(context) && (i12 < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) ? (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? f343983c : new e(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8)) : new e(a.a(), 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<java.lang.Integer, java.lang.Integer> b(com.google.android.exoplayer2.I r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.f343476m
            r0.getClass()
            java.lang.String r1 = r10.f343473j
            int r0 = com.google.android.exoplayer2.util.z.d(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            com.google.common.collect.t1<java.lang.Integer, java.lang.Integer> r2 = com.google.android.exoplayer2.audio.e.f343985e
            boolean r1 = r2.containsKey(r1)
            r3 = 0
            if (r1 != 0) goto L19
            return r3
        L19:
            int[] r1 = r9.f343986a
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
            goto L36
        L2c:
            if (r0 != r6) goto L36
            int r8 = java.util.Arrays.binarySearch(r1, r6)
            if (r8 < 0) goto L35
            goto L36
        L35:
            r0 = r4
        L36:
            int r1 = java.util.Arrays.binarySearch(r1, r0)
            if (r1 < 0) goto Laf
            r1 = -1
            int r8 = r10.f343489z
            if (r8 == r1) goto L49
            if (r0 != r7) goto L44
            goto L49
        L44:
            int r10 = r9.f343987b
            if (r8 <= r10) goto L74
            return r3
        L49:
            int r10 = r10.f343458A
            if (r10 == r1) goto L4e
            goto L51
        L4e:
            r10 = 48000(0xbb80, float:6.7262E-41)
        L51:
            int r1 = com.google.android.exoplayer2.util.U.f348106a
            r7 = 29
            if (r1 < r7) goto L5d
            int r10 = com.google.android.exoplayer2.audio.e.a.b(r0, r10)
        L5b:
            r8 = r10
            goto L74
        L5d:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r10 = r2.get(r10)
            if (r10 == 0) goto L6d
            r1 = r10
        L6d:
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r10 = r1.intValue()
            goto L5b
        L74:
            int r10 = com.google.android.exoplayer2.util.U.f348106a
            r1 = 28
            if (r10 > r1) goto L88
            if (r8 != r4) goto L7e
            r5 = r6
            goto L89
        L7e:
            r1 = 3
            if (r8 == r1) goto L89
            r1 = 4
            if (r8 == r1) goto L89
            r1 = 5
            if (r8 != r1) goto L88
            goto L89
        L88:
            r5 = r8
        L89:
            r1 = 26
            if (r10 > r1) goto L9b
            java.lang.String r10 = "fugu"
            java.lang.String r1 = com.google.android.exoplayer2.util.U.f348107b
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L9b
            r10 = 1
            if (r5 != r10) goto L9b
            r5 = 2
        L9b:
            int r10 = com.google.android.exoplayer2.util.U.o(r5)
            if (r10 != 0) goto La2
            return r3
        La2:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            android.util.Pair r10 = android.util.Pair.create(r0, r10)
            return r10
        Laf:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.e.b(com.google.android.exoplayer2.I):android.util.Pair");
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Arrays.equals(this.f343986a, eVar.f343986a) && this.f343987b == eVar.f343987b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f343986a) * 31) + this.f343987b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f343987b + ", supportedEncodings=" + Arrays.toString(this.f343986a) + "]";
    }
}
