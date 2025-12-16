package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import com.google.android.exoplayer2.InterfaceC36525h;
import com.google.android.exoplayer2.util.U;
import j.InterfaceC42164u;
import j.P;
import j.X;

/* compiled from: AudioAttributes.java */
/* renamed from: com.google.android.exoplayer2.audio.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36506d implements InterfaceC36525h {

    /* renamed from: h, reason: collision with root package name */
    public static final C36506d f343970h;

    /* renamed from: b, reason: collision with root package name */
    public final int f343971b;

    /* renamed from: c, reason: collision with root package name */
    public final int f343972c;

    /* renamed from: d, reason: collision with root package name */
    public final int f343973d;

    /* renamed from: e, reason: collision with root package name */
    public final int f343974e;

    /* renamed from: f, reason: collision with root package name */
    public final int f343975f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public C10571d f343976g;

    /* compiled from: AudioAttributes.java */
    @X
    /* renamed from: com.google.android.exoplayer2.audio.d$b */
    public static final class b {
        @InterfaceC42164u
        public static void a(AudioAttributes.Builder builder, int i12) {
            builder.setAllowedCapturePolicy(i12);
        }
    }

    /* compiled from: AudioAttributes.java */
    @X
    /* renamed from: com.google.android.exoplayer2.audio.d$c */
    public static final class c {
        @InterfaceC42164u
        public static void a(AudioAttributes.Builder builder, int i12) {
            builder.setSpatializationBehavior(i12);
        }
    }

    /* compiled from: AudioAttributes.java */
    @X
    /* renamed from: com.google.android.exoplayer2.audio.d$d, reason: collision with other inner class name */
    public static final class C10571d {

        /* renamed from: a, reason: collision with root package name */
        public final AudioAttributes f343977a;

        public C10571d(C36506d c36506d, a aVar) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c36506d.f343971b).setFlags(c36506d.f343972c).setUsage(c36506d.f343973d);
            int i12 = U.f348106a;
            if (i12 >= 29) {
                b.a(usage, c36506d.f343974e);
            }
            if (i12 >= 32) {
                c.a(usage, c36506d.f343975f);
            }
            this.f343977a = usage.build();
        }
    }

    /* compiled from: AudioAttributes.java */
    /* renamed from: com.google.android.exoplayer2.audio.d$e */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f343978a = 0;

        /* renamed from: b, reason: collision with root package name */
        public final int f343979b = 0;

        /* renamed from: c, reason: collision with root package name */
        public final int f343980c = 1;

        /* renamed from: d, reason: collision with root package name */
        public final int f343981d = 1;

        /* renamed from: e, reason: collision with root package name */
        public final int f343982e = 0;
    }

    static {
        e eVar = new e();
        f343970h = new C36506d(eVar.f343978a, eVar.f343979b, eVar.f343980c, eVar.f343981d, eVar.f343982e, null);
    }

    public C36506d(int i12, int i13, int i14, int i15, int i16, a aVar) {
        this.f343971b = i12;
        this.f343972c = i13;
        this.f343973d = i14;
        this.f343974e = i15;
        this.f343975f = i16;
    }

    @X
    public final C10571d a() {
        if (this.f343976g == null) {
            this.f343976g = new C10571d(this, null);
        }
        return this.f343976g;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C36506d.class != obj.getClass()) {
            return false;
        }
        C36506d c36506d = (C36506d) obj;
        return this.f343971b == c36506d.f343971b && this.f343972c == c36506d.f343972c && this.f343973d == c36506d.f343973d && this.f343974e == c36506d.f343974e && this.f343975f == c36506d.f343975f;
    }

    public final int hashCode() {
        return ((((((((527 + this.f343971b) * 31) + this.f343972c) * 31) + this.f343973d) * 31) + this.f343974e) * 31) + this.f343975f;
    }
}
