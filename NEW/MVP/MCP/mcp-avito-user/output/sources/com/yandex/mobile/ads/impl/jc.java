package com.yandex.mobile.ads.impl;

import android.media.AudioAttributes;
import android.os.Bundle;
import j.InterfaceC42164u;

/* loaded from: classes8.dex */
public final class jc implements rg {

    /* renamed from: g, reason: collision with root package name */
    public static final jc f386811g = new d().a();

    /* renamed from: a, reason: collision with root package name */
    public final int f386812a;

    /* renamed from: b, reason: collision with root package name */
    public final int f386813b;

    /* renamed from: c, reason: collision with root package name */
    public final int f386814c;

    /* renamed from: d, reason: collision with root package name */
    public final int f386815d;

    /* renamed from: e, reason: collision with root package name */
    public final int f386816e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private c f386817f;

    @j.X
    public static final class a {
        @InterfaceC42164u
        public static void a(AudioAttributes.Builder builder, int i12) {
            builder.setAllowedCapturePolicy(i12);
        }
    }

    @j.X
    public static final class b {
        @InterfaceC42164u
        public static void a(AudioAttributes.Builder builder, int i12) {
            builder.setSpatializationBehavior(i12);
        }
    }

    @j.X
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final AudioAttributes f386818a;

        public /* synthetic */ c(jc jcVar, int i12) {
            this(jcVar);
        }

        private c(jc jcVar) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(jcVar.f386812a).setFlags(jcVar.f386813b).setUsage(jcVar.f386814c);
            int i12 = pc1.f388768a;
            if (i12 >= 29) {
                a.a(usage, jcVar.f386815d);
            }
            if (i12 >= 32) {
                b.a(usage, jcVar.f386816e);
            }
            this.f386818a = usage.build();
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private int f386819a = 0;

        /* renamed from: b, reason: collision with root package name */
        private int f386820b = 0;

        /* renamed from: c, reason: collision with root package name */
        private int f386821c = 1;

        /* renamed from: d, reason: collision with root package name */
        private int f386822d = 1;

        /* renamed from: e, reason: collision with root package name */
        private int f386823e = 0;

        public final void a(int i12) {
            this.f386822d = i12;
        }

        public final void b(int i12) {
            this.f386819a = i12;
        }

        public final void c(int i12) {
            this.f386820b = i12;
        }

        public final void d(int i12) {
            this.f386823e = i12;
        }

        public final void e(int i12) {
            this.f386821c = i12;
        }

        public final jc a() {
            return new jc(this.f386819a, this.f386820b, this.f386821c, this.f386822d, this.f386823e, 0);
        }
    }

    public /* synthetic */ jc(int i12, int i13, int i14, int i15, int i16, int i17) {
        this(i12, i13, i14, i15, i16);
    }

    @j.X
    public final c a() {
        if (this.f386817f == null) {
            this.f386817f = new c(this, 0);
        }
        return this.f386817f;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jc.class != obj.getClass()) {
            return false;
        }
        jc jcVar = (jc) obj;
        return this.f386812a == jcVar.f386812a && this.f386813b == jcVar.f386813b && this.f386814c == jcVar.f386814c && this.f386815d == jcVar.f386815d && this.f386816e == jcVar.f386816e;
    }

    public final int hashCode() {
        return ((((((((this.f386812a + 527) * 31) + this.f386813b) * 31) + this.f386814c) * 31) + this.f386815d) * 31) + this.f386816e;
    }

    private jc(int i12, int i13, int i14, int i15, int i16) {
        this.f386812a = i12;
        this.f386813b = i13;
        this.f386814c = i14;
        this.f386815d = i15;
        this.f386816e = i16;
    }

    private static jc a(Bundle bundle) {
        d dVar = new d();
        if (bundle.containsKey(Integer.toString(0, 36))) {
            dVar.b(bundle.getInt(Integer.toString(0, 36)));
        }
        if (bundle.containsKey(Integer.toString(1, 36))) {
            dVar.c(bundle.getInt(Integer.toString(1, 36)));
        }
        if (bundle.containsKey(Integer.toString(2, 36))) {
            dVar.e(bundle.getInt(Integer.toString(2, 36)));
        }
        if (bundle.containsKey(Integer.toString(3, 36))) {
            dVar.a(bundle.getInt(Integer.toString(3, 36)));
        }
        if (bundle.containsKey(Integer.toString(4, 36))) {
            dVar.d(bundle.getInt(Integer.toString(4, 36)));
        }
        return dVar.a();
    }
}
