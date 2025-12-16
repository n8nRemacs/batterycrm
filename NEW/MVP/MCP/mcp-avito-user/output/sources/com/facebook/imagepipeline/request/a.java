package com.facebook.imagepipeline.request;

import I41.h;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import com.facebook.infer.annotation.Nullsafe;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: BasePostprocessor.java */
@Nullsafe
/* loaded from: classes15.dex */
public abstract class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final Bitmap.Config f340813a = Bitmap.Config.ARGB_8888;

    /* renamed from: b, reason: collision with root package name */
    public static Method f340814b;

    @Override // com.facebook.imagepipeline.request.d
    @h
    public com.facebook.cache.common.c a() {
        return null;
    }

    @Override // com.facebook.imagepipeline.request.d
    public com.facebook.common.references.a<Bitmap> b(Bitmap bitmap, com.facebook.imagepipeline.bitmaps.f fVar) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = f340813a;
        }
        com.facebook.common.references.a<Bitmap> aVarA = fVar.a(width, height, config);
        try {
            e(aVarA.i(), bitmap);
            return aVarA.clone();
        } finally {
            com.facebook.common.references.a.c(aVarA);
        }
    }

    public void e(Bitmap bitmap, Bitmap bitmap2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (bitmap.getConfig() == bitmap2.getConfig()) {
            try {
                if (f340814b == null) {
                    int i12 = Bitmaps.f340492a;
                    f340814b = Bitmaps.class.getDeclaredMethod("copyBitmap", Bitmap.class, Bitmap.class);
                }
                f340814b.invoke(null, bitmap, bitmap2);
            } catch (ClassNotFoundException e12) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e12);
            } catch (IllegalAccessException e13) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e13);
            } catch (NoSuchMethodException e14) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e14);
            } catch (InvocationTargetException e15) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e15);
            }
        } else {
            new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
        d(bitmap);
    }

    public void d(Bitmap bitmap) {
    }
}
