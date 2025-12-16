package com.facebook.imagepipeline.image;

import android.graphics.Bitmap;
import defpackage.fod;
import defpackage.ksc;
import defpackage.pe7;
import defpackage.rk4;
import defpackage.sc3;
import defpackage.vc3;
import java.util.Map;

/* loaded from: classes.dex */
public interface CloseableStaticBitmap extends sc3 {
    static CloseableStaticBitmap of(Bitmap bitmap, fod fodVar, ksc kscVar, int i) {
        return of(bitmap, fodVar, kscVar, i, 0);
    }

    vc3 cloneUnderlyingBitmapReference();

    @Override // defpackage.sc3, java.io.Closeable, java.lang.AutoCloseable
    /* synthetic */ void close();

    vc3 convertToBitmapReference();

    int getExifOrientation();

    @Override // defpackage.pe7, com.facebook.fresco.middleware.HasExtraData
    /* synthetic */ Map getExtras();

    @Override // defpackage.sc3, defpackage.pe7
    /* synthetic */ int getHeight();

    @Override // defpackage.sc3
    /* synthetic */ pe7 getImageInfo();

    @Override // defpackage.sc3
    /* synthetic */ ksc getQualityInfo();

    int getRotationAngle();

    @Override // defpackage.sc3
    /* synthetic */ int getSizeInBytes();

    Bitmap getUnderlyingBitmap();

    @Override // defpackage.sc3, defpackage.pe7
    /* synthetic */ int getWidth();

    @Override // defpackage.sc3
    /* synthetic */ boolean isClosed();

    @Override // defpackage.sc3
    /* synthetic */ boolean isStateful();

    static CloseableStaticBitmap of(vc3 vc3Var, ksc kscVar, int i) {
        return of(vc3Var, kscVar, i, 0);
    }

    static CloseableStaticBitmap of(Bitmap bitmap, fod fodVar, ksc kscVar, int i, int i2) {
        int i3 = rk4.s0;
        return new rk4(bitmap, fodVar, kscVar, i, i2);
    }

    static CloseableStaticBitmap of(vc3 vc3Var, ksc kscVar, int i, int i2) {
        int i3 = rk4.s0;
        return new rk4(vc3Var, kscVar, i, i2);
    }
}
