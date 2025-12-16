package androidx.media3.common;

import android.media.AudioAttributes;
import android.os.Bundle;
import j.InterfaceC42164u;

/* compiled from: AudioAttributes.java */
/* renamed from: androidx.media3.common.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23091e implements InterfaceC23096j {

    /* renamed from: h, reason: collision with root package name */
    public static final C23091e f47644h = new C1816e().a();

    /* renamed from: i, reason: collision with root package name */
    public static final String f47645i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f47646j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f47647k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f47648l;

    /* renamed from: m, reason: collision with root package name */
    public static final String f47649m;

    /* renamed from: n, reason: collision with root package name */
    @androidx.media3.common.util.J
    public static final C23088b f47650n;

    /* renamed from: b, reason: collision with root package name */
    public final int f47651b;

    /* renamed from: c, reason: collision with root package name */
    public final int f47652c;

    /* renamed from: d, reason: collision with root package name */
    public final int f47653d;

    /* renamed from: e, reason: collision with root package name */
    public final int f47654e;

    /* renamed from: f, reason: collision with root package name */
    public final int f47655f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    public d f47656g;

    /* compiled from: AudioAttributes.java */
    @j.X
    /* renamed from: androidx.media3.common.e$b */
    public static final class b {
        @InterfaceC42164u
        public static void a(AudioAttributes.Builder builder, int i12) {
            builder.setAllowedCapturePolicy(i12);
        }
    }

    /* compiled from: AudioAttributes.java */
    @j.X
    /* renamed from: androidx.media3.common.e$c */
    public static final class c {
        @InterfaceC42164u
        public static void a(AudioAttributes.Builder builder, int i12) {
            builder.setSpatializationBehavior(i12);
        }
    }

    /* compiled from: AudioAttributes.java */
    @j.X
    /* renamed from: androidx.media3.common.e$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final AudioAttributes f47657a;

        public d(C23091e c23091e, a aVar) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c23091e.f47651b).setFlags(c23091e.f47652c).setUsage(c23091e.f47653d);
            int i12 = androidx.media3.common.util.M.f47887a;
            if (i12 >= 29) {
                b.a(usage, c23091e.f47654e);
            }
            if (i12 >= 32) {
                c.a(usage, c23091e.f47655f);
            }
            this.f47657a = usage.build();
        }
    }

    /* compiled from: AudioAttributes.java */
    /* renamed from: androidx.media3.common.e$e, reason: collision with other inner class name */
    public static final class C1816e {

        /* renamed from: a, reason: collision with root package name */
        public int f47658a = 0;

        /* renamed from: b, reason: collision with root package name */
        public int f47659b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f47660c = 1;

        /* renamed from: d, reason: collision with root package name */
        public int f47661d = 1;

        /* renamed from: e, reason: collision with root package name */
        public int f47662e = 0;

        public final C23091e a() {
            return new C23091e(this.f47658a, this.f47659b, this.f47660c, this.f47661d, this.f47662e, null);
        }
    }

    static {
        int i12 = androidx.media3.common.util.M.f47887a;
        f47645i = Integer.toString(0, 36);
        f47646j = Integer.toString(1, 36);
        f47647k = Integer.toString(2, 36);
        f47648l = Integer.toString(3, 36);
        f47649m = Integer.toString(4, 36);
        f47650n = new C23088b(2);
    }

    public C23091e(int i12, int i13, int i14, int i15, int i16, a aVar) {
        this.f47651b = i12;
        this.f47652c = i13;
        this.f47653d = i14;
        this.f47654e = i15;
        this.f47655f = i16;
    }

    @j.X
    public final d a() {
        if (this.f47656g == null) {
            this.f47656g = new d(this, null);
        }
        return this.f47656g;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C23091e.class != obj.getClass()) {
            return false;
        }
        C23091e c23091e = (C23091e) obj;
        return this.f47651b == c23091e.f47651b && this.f47652c == c23091e.f47652c && this.f47653d == c23091e.f47653d && this.f47654e == c23091e.f47654e && this.f47655f == c23091e.f47655f;
    }

    public final int hashCode() {
        return ((((((((527 + this.f47651b) * 31) + this.f47652c) * 31) + this.f47653d) * 31) + this.f47654e) * 31) + this.f47655f;
    }

    @Override // androidx.media3.common.InterfaceC23096j
    @androidx.media3.common.util.J
    public final Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putInt(f47645i, this.f47651b);
        bundle.putInt(f47646j, this.f47652c);
        bundle.putInt(f47647k, this.f47653d);
        bundle.putInt(f47648l, this.f47654e);
        bundle.putInt(f47649m, this.f47655f);
        return bundle;
    }
}
