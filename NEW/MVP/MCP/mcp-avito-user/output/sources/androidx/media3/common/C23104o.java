package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.util.C23110a;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: DeviceInfo.java */
/* renamed from: androidx.media3.common.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23104o implements InterfaceC23096j {

    /* renamed from: f, reason: collision with root package name */
    public static final C23104o f47686f = new b(0).a();

    /* renamed from: g, reason: collision with root package name */
    public static final String f47687g;

    /* renamed from: h, reason: collision with root package name */
    public static final String f47688h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f47689i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f47690j;

    /* renamed from: k, reason: collision with root package name */
    @androidx.media3.common.util.J
    public static final C23088b f47691k;

    /* renamed from: b, reason: collision with root package name */
    public final int f47692b;

    /* renamed from: c, reason: collision with root package name */
    @j.F
    public final int f47693c;

    /* renamed from: d, reason: collision with root package name */
    @j.F
    public final int f47694d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public final String f47695e;

    /* compiled from: DeviceInfo.java */
    /* renamed from: androidx.media3.common.o$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f47696a;

        /* renamed from: b, reason: collision with root package name */
        public int f47697b;

        /* renamed from: c, reason: collision with root package name */
        public int f47698c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        public String f47699d;

        public b(int i12) {
            this.f47696a = i12;
        }

        public final C23104o a() {
            C23110a.b(this.f47697b <= this.f47698c);
            return new C23104o(this, null);
        }
    }

    /* compiled from: DeviceInfo.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.media3.common.o$c */
    public @interface c {
    }

    static {
        int i12 = androidx.media3.common.util.M.f47887a;
        f47687g = Integer.toString(0, 36);
        f47688h = Integer.toString(1, 36);
        f47689i = Integer.toString(2, 36);
        f47690j = Integer.toString(3, 36);
        f47691k = new C23088b(4);
    }

    public C23104o(b bVar, a aVar) {
        this.f47692b = bVar.f47696a;
        this.f47693c = bVar.f47697b;
        this.f47694d = bVar.f47698c;
        this.f47695e = bVar.f47699d;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23104o)) {
            return false;
        }
        C23104o c23104o = (C23104o) obj;
        return this.f47692b == c23104o.f47692b && this.f47693c == c23104o.f47693c && this.f47694d == c23104o.f47694d && androidx.media3.common.util.M.a(this.f47695e, c23104o.f47695e);
    }

    public final int hashCode() {
        int i12 = (((((527 + this.f47692b) * 31) + this.f47693c) * 31) + this.f47694d) * 31;
        String str = this.f47695e;
        return i12 + (str == null ? 0 : str.hashCode());
    }

    @Override // androidx.media3.common.InterfaceC23096j
    @androidx.media3.common.util.J
    public final Bundle k() {
        Bundle bundle = new Bundle();
        int i12 = this.f47692b;
        if (i12 != 0) {
            bundle.putInt(f47687g, i12);
        }
        int i13 = this.f47693c;
        if (i13 != 0) {
            bundle.putInt(f47688h, i13);
        }
        int i14 = this.f47694d;
        if (i14 != 0) {
            bundle.putInt(f47689i, i14);
        }
        String str = this.f47695e;
        if (str != null) {
            bundle.putString(f47690j, str);
        }
        return bundle;
    }
}
