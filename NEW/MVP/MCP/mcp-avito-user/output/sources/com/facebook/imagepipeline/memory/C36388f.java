package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.memory.C36391i;
import com.facebook.infer.annotation.Nullsafe;
import uW0.C48986a;

/* compiled from: BitmapPoolBackend.java */
@Nullsafe
/* renamed from: com.facebook.imagepipeline.memory.f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C36388f extends v<Bitmap> {
    public static boolean c(@I41.h Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            C48986a.m("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        }
        if (bitmap.isMutable()) {
            return true;
        }
        C48986a.m("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
        return false;
    }

    @I41.h
    public final Object b(int i12) {
        Object objPollFirst;
        C36391i<T> c36391i = this.f340488b;
        synchronized (c36391i) {
            C36391i.b bVar = c36391i.f340469a.get(i12);
            if (bVar == null) {
                objPollFirst = null;
            } else {
                objPollFirst = bVar.f340474c.pollFirst();
                if (c36391i.f340470b != bVar) {
                    c36391i.a(bVar);
                    C36391i.b bVar2 = c36391i.f340470b;
                    if (bVar2 == null) {
                        c36391i.f340470b = bVar;
                        c36391i.f340471c = bVar;
                    } else {
                        bVar.f340475d = bVar2;
                        bVar2.f340472a = bVar;
                        c36391i.f340470b = bVar;
                    }
                }
            }
        }
        if (objPollFirst != null) {
            synchronized (this) {
                this.f340487a.remove(objPollFirst);
            }
        }
        Bitmap bitmap = (Bitmap) objPollFirst;
        if (bitmap == null || !c(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }
}
