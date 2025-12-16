package androidx.media3.common.util;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.common.util.concurrent.D0;
import j.P;

/* compiled from: BitmapLoader.java */
@J
/* renamed from: androidx.media3.common.util.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC23112c {
    D0<Bitmap> a(Uri uri);

    D0<Bitmap> b(byte[] bArr);

    @P
    default D0<Bitmap> c(androidx.media3.common.B b12) {
        byte[] bArr = b12.f47163k;
        if (bArr != null) {
            return b(bArr);
        }
        Uri uri = b12.f47165m;
        if (uri != null) {
            return a(uri);
        }
        return null;
    }
}
