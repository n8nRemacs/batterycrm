package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* compiled from: DummyTrackingInUseBitmapPool.java */
@Nullsafe
/* loaded from: classes13.dex */
public class q implements InterfaceC36387e {

    /* renamed from: a, reason: collision with root package name */
    public final Set<Bitmap> f340481a = Collections.newSetFromMap(new IdentityHashMap());

    @Override // wW0.e, com.facebook.common.references.h
    public final void a(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        this.f340481a.remove(bitmap);
        bitmap.recycle();
    }

    @Override // wW0.e
    public final Bitmap get(int i12) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, (int) Math.ceil(i12 / 2.0d), Bitmap.Config.RGB_565);
        this.f340481a.add(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    @Override // wW0.b
    public final void c(MemoryTrimType memoryTrimType) {
    }
}
