package com.facebook.imagepipeline.bitmaps;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.core.C36382a;
import com.facebook.imagepipeline.memory.InterfaceC36387e;
import com.facebook.imageutils.BitmapUtil;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: ArtBitmapFactory.java */
@J41.d
@TargetApi(21)
@Nullsafe
/* loaded from: classes12.dex */
public class a extends f {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC36387e f340190a;

    /* renamed from: b, reason: collision with root package name */
    public final C36382a f340191b;

    public a(InterfaceC36387e interfaceC36387e, C36382a c36382a) {
        this.f340190a = interfaceC36387e;
        this.f340191b = c36382a;
    }

    @Override // com.facebook.imagepipeline.bitmaps.f
    public final com.facebook.common.references.a<Bitmap> a(int i12, int i13, Bitmap.Config config) {
        int sizeInByteForBitmap = BitmapUtil.getSizeInByteForBitmap(i12, i13, config);
        InterfaceC36387e interfaceC36387e = this.f340190a;
        Bitmap bitmap = interfaceC36387e.get(sizeInByteForBitmap);
        if (!(bitmap.getAllocationByteCount() >= BitmapUtil.getPixelSizeForBitmapConfig(config) * (i12 * i13))) {
            throw new IllegalArgumentException();
        }
        bitmap.reconfigure(i12, i13, config);
        return com.facebook.common.references.a.n(bitmap, interfaceC36387e, this.f340191b.f340280a);
    }
}
