package YW0;

import android.graphics.Bitmap;
import com.facebook.imageutils.BitmapUtil;

/* compiled from: CloseableStaticBitmap.java */
@J41.d
/* loaded from: classes13.dex */
public class c extends a implements com.facebook.common.references.d {

    /* renamed from: d, reason: collision with root package name */
    @J41.a
    public com.facebook.common.references.a<Bitmap> f19493d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Bitmap f19494e;

    /* renamed from: f, reason: collision with root package name */
    public final i f19495f;

    /* renamed from: g, reason: collision with root package name */
    public final int f19496g;

    /* renamed from: h, reason: collision with root package name */
    public final int f19497h;

    public c() {
        throw null;
    }

    public c(Bitmap bitmap, com.facebook.imagepipeline.bitmaps.h hVar, g gVar) {
        this.f19494e = bitmap;
        Bitmap bitmap2 = this.f19494e;
        hVar.getClass();
        this.f19493d = com.facebook.common.references.a.n(bitmap2, hVar, com.facebook.common.references.a.f339839g);
        this.f19495f = gVar;
        this.f19496g = 0;
        this.f19497h = 0;
    }

    @Override // YW0.b
    public final i a() {
        return this.f19495f;
    }

    @Override // YW0.b
    public final int b() {
        return BitmapUtil.getSizeInBytes(this.f19494e);
    }

    @Override // YW0.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        com.facebook.common.references.a<Bitmap> aVar;
        synchronized (this) {
            aVar = this.f19493d;
            this.f19493d = null;
            this.f19494e = null;
        }
        if (aVar != null) {
            aVar.close();
        }
    }

    @Override // YW0.a
    public final Bitmap d() {
        return this.f19494e;
    }

    @Override // YW0.f
    public final int getHeight() {
        int i12;
        if (this.f19496g % 180 != 0 || (i12 = this.f19497h) == 5 || i12 == 7) {
            Bitmap bitmap = this.f19494e;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.getWidth();
        }
        Bitmap bitmap2 = this.f19494e;
        if (bitmap2 == null) {
            return 0;
        }
        return bitmap2.getHeight();
    }

    @Override // YW0.f
    public final int getWidth() {
        int i12;
        if (this.f19496g % 180 != 0 || (i12 = this.f19497h) == 5 || i12 == 7) {
            Bitmap bitmap = this.f19494e;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.getHeight();
        }
        Bitmap bitmap2 = this.f19494e;
        if (bitmap2 == null) {
            return 0;
        }
        return bitmap2.getWidth();
    }

    @Override // YW0.b
    public final synchronized boolean isClosed() {
        return this.f19493d == null;
    }

    public c(com.facebook.common.references.a<Bitmap> aVar, i iVar, int i12, int i13) {
        com.facebook.common.references.a<Bitmap> aVarClone;
        synchronized (aVar) {
            aVarClone = aVar.j() ? aVar.clone() : null;
        }
        aVarClone.getClass();
        this.f19493d = aVarClone;
        this.f19494e = aVarClone.i();
        this.f19495f = iVar;
        this.f19496g = i12;
        this.f19497h = i13;
    }
}
