package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: BucketsBitmapPool.java */
@J41.d
@TargetApi(21)
@Nullsafe
/* renamed from: com.facebook.imagepipeline.memory.j, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C36392j extends BasePool<Bitmap> implements InterfaceC36387e {
    public C36392j(wW0.d dVar, G g12, B b12) {
        super(dVar, g12, b12);
        dVar.b(this);
        b12.getClass();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final Bitmap d(int i12) {
        return Bitmap.createBitmap(1, (int) Math.ceil(i12 / 2.0d), Bitmap.Config.RGB_565);
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final void f(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        bitmap2.getClass();
        bitmap2.recycle();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final int i(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        bitmap2.getClass();
        return bitmap2.getAllocationByteCount();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    @I41.h
    public final Bitmap k(C36390h<Bitmap> c36390h) {
        Bitmap bitmap = (Bitmap) super.k(c36390h);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final boolean m(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        bitmap2.getClass();
        return !bitmap2.isRecycled() && bitmap2.isMutable();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final int h(int i12) {
        return i12;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final int j(int i12) {
        return i12;
    }
}
