package androidx.media3.common;

import android.os.Bundle;
import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: ColorInfo.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.common.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23101l implements InterfaceC23096j {

    /* renamed from: g, reason: collision with root package name */
    public static final C23101l f47671g = new C23101l(1, 2, 3, null);

    /* renamed from: h, reason: collision with root package name */
    public static final String f47672h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f47673i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f47674j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f47675k;

    /* renamed from: l, reason: collision with root package name */
    public static final C23088b f47676l;

    /* renamed from: b, reason: collision with root package name */
    public final int f47677b;

    /* renamed from: c, reason: collision with root package name */
    public final int f47678c;

    /* renamed from: d, reason: collision with root package name */
    public final int f47679d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public final byte[] f47680e;

    /* renamed from: f, reason: collision with root package name */
    public int f47681f;

    static {
        b bVar = new b();
        bVar.f47682a = 1;
        bVar.f47683b = 1;
        bVar.f47684c = 2;
        int i12 = androidx.media3.common.util.M.f47887a;
        f47672h = Integer.toString(0, 36);
        f47673i = Integer.toString(1, 36);
        f47674j = Integer.toString(2, 36);
        f47675k = Integer.toString(3, 36);
        f47676l = new C23088b(3);
    }

    @Deprecated
    public C23101l(int i12, int i13, int i14, @j.P byte[] bArr) {
        this.f47677b = i12;
        this.f47678c = i13;
        this.f47679d = i14;
        this.f47680e = bArr;
    }

    public static String a(int i12) {
        return i12 != -1 ? i12 != 10 ? i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 6 ? i12 != 7 ? "Undefined color transfer" : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    @Pure
    public static int b(int i12) {
        if (i12 == 1) {
            return 1;
        }
        if (i12 != 9) {
            return (i12 == 4 || i12 == 5 || i12 == 6 || i12 == 7) ? 2 : -1;
        }
        return 6;
    }

    @Pure
    public static int g(int i12) {
        if (i12 == 1) {
            return 3;
        }
        if (i12 == 4) {
            return 10;
        }
        if (i12 == 13) {
            return 2;
        }
        if (i12 == 16) {
            return 6;
        }
        if (i12 != 18) {
            return (i12 == 6 || i12 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C23101l.class != obj.getClass()) {
            return false;
        }
        C23101l c23101l = (C23101l) obj;
        return this.f47677b == c23101l.f47677b && this.f47678c == c23101l.f47678c && this.f47679d == c23101l.f47679d && Arrays.equals(this.f47680e, c23101l.f47680e);
    }

    public final int hashCode() {
        if (this.f47681f == 0) {
            this.f47681f = Arrays.hashCode(this.f47680e) + ((((((527 + this.f47677b) * 31) + this.f47678c) * 31) + this.f47679d) * 31);
        }
        return this.f47681f;
    }

    @Override // androidx.media3.common.InterfaceC23096j
    public final Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putInt(f47672h, this.f47677b);
        bundle.putInt(f47673i, this.f47678c);
        bundle.putInt(f47674j, this.f47679d);
        bundle.putByteArray(f47675k, this.f47680e);
        return bundle;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        int i12 = this.f47677b;
        sb2.append(i12 != -1 ? i12 != 6 ? i12 != 1 ? i12 != 2 ? "Undefined color space" : "BT601" : "BT709" : "BT2020" : "Unset color space");
        sb2.append(", ");
        int i13 = this.f47678c;
        sb2.append(i13 != -1 ? i13 != 1 ? i13 != 2 ? "Undefined color range" : "Limited range" : "Full range" : "Unset color range");
        sb2.append(", ");
        sb2.append(a(this.f47679d));
        sb2.append(", ");
        return androidx.appcompat.app.r.s(")", sb2, this.f47680e != null);
    }

    /* compiled from: ColorInfo.java */
    /* renamed from: androidx.media3.common.l$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f47682a;

        /* renamed from: b, reason: collision with root package name */
        public int f47683b;

        /* renamed from: c, reason: collision with root package name */
        public int f47684c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        public byte[] f47685d;

        public b() {
            this.f47682a = -1;
            this.f47683b = -1;
            this.f47684c = -1;
        }

        public b(C23101l c23101l, a aVar) {
            this.f47682a = c23101l.f47677b;
            this.f47683b = c23101l.f47678c;
            this.f47684c = c23101l.f47679d;
            this.f47685d = c23101l.f47680e;
        }
    }
}
