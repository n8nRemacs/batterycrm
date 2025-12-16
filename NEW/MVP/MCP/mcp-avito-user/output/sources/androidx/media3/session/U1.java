package androidx.media3.session;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.InterfaceC23112c;
import java.util.concurrent.Callable;

/* compiled from: SimpleBitmapLoader.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public final class U1 implements InterfaceC23112c {

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.common.base.e0<com.google.common.util.concurrent.H0> f52321b = com.google.common.base.f0.a(new S1());

    /* renamed from: a, reason: collision with root package name */
    public final com.google.common.util.concurrent.H0 f52322a;

    public U1() {
        com.google.common.util.concurrent.H0 h02 = f52321b.get();
        C23110a.h(h02);
        this.f52322a = com.google.common.util.concurrent.Q0.b(h02);
    }

    @Override // androidx.media3.common.util.InterfaceC23112c
    public final com.google.common.util.concurrent.D0<Bitmap> a(Uri uri) {
        return this.f52322a.submit((Callable) new T1(uri, 1));
    }

    @Override // androidx.media3.common.util.InterfaceC23112c
    public final com.google.common.util.concurrent.D0<Bitmap> b(byte[] bArr) {
        return this.f52322a.submit((Callable) new T1(bArr, 0));
    }
}
