package androidx.media3.session;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.InterfaceC23112c;
import java.util.Arrays;

/* compiled from: CacheBitmapLoader.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.session.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23210c implements InterfaceC23112c {

    /* renamed from: a, reason: collision with root package name */
    public final U1 f52393a;

    /* renamed from: b, reason: collision with root package name */
    public a f52394b;

    public C23210c(U1 u12) {
        this.f52393a = u12;
    }

    @Override // androidx.media3.common.util.InterfaceC23112c
    public final com.google.common.util.concurrent.D0<Bitmap> a(Uri uri) {
        Uri uri2;
        a aVar = this.f52394b;
        if (aVar == null || (uri2 = aVar.f52396b) == null || !uri2.equals(uri)) {
            com.google.common.util.concurrent.D0<Bitmap> d0A = this.f52393a.a(uri);
            this.f52394b = new a(uri, d0A);
            return d0A;
        }
        com.google.common.util.concurrent.D0<Bitmap> d02 = this.f52394b.f52397c;
        C23110a.h(d02);
        return d02;
    }

    @Override // androidx.media3.common.util.InterfaceC23112c
    public final com.google.common.util.concurrent.D0<Bitmap> b(byte[] bArr) {
        byte[] bArr2;
        a aVar = this.f52394b;
        if (aVar == null || (bArr2 = aVar.f52395a) == null || !Arrays.equals(bArr2, bArr)) {
            com.google.common.util.concurrent.D0<Bitmap> d0B = this.f52393a.b(bArr);
            this.f52394b = new a(bArr, d0B);
            return d0B;
        }
        com.google.common.util.concurrent.D0<Bitmap> d02 = this.f52394b.f52397c;
        C23110a.h(d02);
        return d02;
    }

    /* compiled from: CacheBitmapLoader.java */
    /* renamed from: androidx.media3.session.c$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        public final byte[] f52395a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public final Uri f52396b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public final com.google.common.util.concurrent.D0<Bitmap> f52397c;

        public a(byte[] bArr, com.google.common.util.concurrent.D0<Bitmap> d02) {
            this.f52395a = bArr;
            this.f52396b = null;
            this.f52397c = d02;
        }

        public a(Uri uri, com.google.common.util.concurrent.D0<Bitmap> d02) {
            this.f52395a = null;
            this.f52396b = uri;
            this.f52397c = d02;
        }
    }
}
