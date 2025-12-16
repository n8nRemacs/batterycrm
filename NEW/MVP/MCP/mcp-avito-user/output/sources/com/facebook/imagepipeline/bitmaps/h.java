package com.facebook.imagepipeline.bitmaps;

import android.graphics.Bitmap;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: SimpleBitmapReleaser.java */
@Nullsafe
/* loaded from: classes12.dex */
public class h implements com.facebook.common.references.h<Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public static h f340193a;

    public static h b() {
        if (f340193a == null) {
            f340193a = new h();
        }
        return f340193a;
    }

    @Override // com.facebook.common.references.h
    public final void a(Bitmap bitmap) {
        bitmap.recycle();
    }
}
