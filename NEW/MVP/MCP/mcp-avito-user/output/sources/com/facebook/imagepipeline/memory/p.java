package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: DummyBitmapPool.java */
@Nullsafe
/* loaded from: classes13.dex */
public class p implements InterfaceC36387e {
    @Override // wW0.e, com.facebook.common.references.h
    public final void a(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        bitmap.recycle();
    }

    @Override // wW0.e
    public final Bitmap get(int i12) {
        return Bitmap.createBitmap(1, (int) Math.ceil(i12 / 2.0d), Bitmap.Config.RGB_565);
    }

    @Override // wW0.b
    public final void c(MemoryTrimType memoryTrimType) {
    }
}
