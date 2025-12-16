package v21;

import android.graphics.Bitmap;
import android.net.Uri;
import com.yandex.div.core.images.BitmapSource;
import j.N;
import j.P;
import t21.InterfaceC48467b;

/* compiled from: CachedBitmap.java */
@InterfaceC48467b
/* renamed from: v21.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C49153a {

    /* renamed from: a, reason: collision with root package name */
    @N
    public final Bitmap f440420a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final Uri f440421b;

    /* renamed from: c, reason: collision with root package name */
    @N
    public final BitmapSource f440422c;

    public C49153a(@N Bitmap bitmap, @P Uri uri, @N BitmapSource bitmapSource) {
        this.f440420a = bitmap;
        this.f440421b = uri;
        this.f440422c = bitmapSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C49153a c49153a = (C49153a) obj;
        if (!this.f440420a.equals(c49153a.f440420a) || this.f440422c != c49153a.f440422c) {
            return false;
        }
        Uri uri = c49153a.f440421b;
        Uri uri2 = this.f440421b;
        return uri2 != null ? uri2.equals(uri) : uri == null;
    }

    public final int hashCode() {
        int iHashCode = (this.f440422c.hashCode() + (this.f440420a.hashCode() * 31)) * 31;
        Uri uri = this.f440421b;
        return iHashCode + (uri != null ? uri.hashCode() : 0);
    }
}
