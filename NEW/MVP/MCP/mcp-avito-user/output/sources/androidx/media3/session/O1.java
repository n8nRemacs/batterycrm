package androidx.media3.session;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.media3.common.InterfaceC23096j;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: SessionResult.java */
/* loaded from: classes.dex */
public final class O1 implements InterfaceC23096j {

    /* renamed from: e, reason: collision with root package name */
    public static final String f52226e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f52227f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f52228g;

    /* renamed from: h, reason: collision with root package name */
    @androidx.media3.common.util.J
    public static final M1 f52229h;

    /* renamed from: b, reason: collision with root package name */
    public final int f52230b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f52231c;

    /* renamed from: d, reason: collision with root package name */
    public final long f52232d;

    /* compiled from: SessionResult.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    static {
        int i12 = androidx.media3.common.util.M.f47887a;
        f52226e = Integer.toString(0, 36);
        f52227f = Integer.toString(1, 36);
        f52228g = Integer.toString(2, 36);
        f52229h = new M1(15);
    }

    public O1(int i12) {
        this(i12, Bundle.EMPTY);
    }

    @Override // androidx.media3.common.InterfaceC23096j
    @androidx.media3.common.util.J
    public final Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putInt(f52226e, this.f52230b);
        bundle.putBundle(f52227f, this.f52231c);
        bundle.putLong(f52228g, this.f52232d);
        return bundle;
    }

    public O1(int i12, Bundle bundle) {
        this(i12, SystemClock.elapsedRealtime(), bundle);
    }

    public O1(int i12, long j12, Bundle bundle) {
        this.f52230b = i12;
        this.f52231c = new Bundle(bundle);
        this.f52232d = j12;
    }
}
