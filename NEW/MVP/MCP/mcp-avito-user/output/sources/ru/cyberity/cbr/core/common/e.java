package ru.cyberity.cbr.core.common;

import android.graphics.Bitmap;
import com.avito.android.remote.model.Navigation;
import kotlin.Metadata;

/* compiled from: BufferBitmap.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\n\u001a\u00020\f¢\u0006\u0004\b\n\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/cyberity/cbr/core/common/e;", "", "Landroid/graphics/Bitmap$Config;", Navigation.CONFIG, "<init>", "(Landroid/graphics/Bitmap$Config;)V", "", "width", "height", "Landroid/graphics/Bitmap;", "a", "(II)Landroid/graphics/Bitmap;", "Lkotlin/G0;", "()V", "Landroid/graphics/Bitmap$Config;", "b", "Landroid/graphics/Bitmap;", "bitmapBuffer", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final Bitmap.Config config;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private Bitmap bitmapBuffer;

    public e(@Y61.k Bitmap.Config config) {
        this.config = config;
    }

    @Y61.k
    public final synchronized Bitmap a(int width, int height) {
        Bitmap bitmapCreateBitmap;
        try {
            bitmapCreateBitmap = this.bitmapBuffer;
            if (bitmapCreateBitmap == null || bitmapCreateBitmap.isRecycled() || bitmapCreateBitmap.getWidth() != width || bitmapCreateBitmap.getHeight() != height) {
                if (bitmapCreateBitmap != null) {
                    bitmapCreateBitmap.recycle();
                }
                bitmapCreateBitmap = Bitmap.createBitmap(width, height, this.config);
            }
            this.bitmapBuffer = bitmapCreateBitmap;
        } catch (Throwable th2) {
            throw th2;
        }
        return bitmapCreateBitmap;
    }

    public final synchronized void a() {
        try {
            Bitmap bitmap = this.bitmapBuffer;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.bitmapBuffer = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
