package com.facebook.drawee.backends.pipeline;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.l;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: DefaultDrawableFactory.java */
@Nullsafe
/* loaded from: classes.dex */
public class b implements WW0.a {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f339911a;

    /* renamed from: b, reason: collision with root package name */
    @I41.h
    public final WW0.a f339912b;

    public b(Resources resources, @I41.h WW0.a aVar) {
        this.f339911a = resources;
        this.f339912b = aVar;
    }

    @Override // WW0.a
    @I41.h
    public final Drawable a(YW0.b bVar) {
        int i12;
        try {
            com.facebook.imagepipeline.systrace.b.a();
            if (!(bVar instanceof YW0.c)) {
                WW0.a aVar = this.f339912b;
                if (aVar != null) {
                    return aVar.a(bVar);
                }
                com.facebook.imagepipeline.systrace.b.a();
                return null;
            }
            YW0.c cVar = (YW0.c) bVar;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f339911a, cVar.f19494e);
            int i13 = cVar.f19496g;
            if ((i13 == 0 || i13 == -1) && ((i12 = cVar.f19497h) == 1 || i12 == 0)) {
                return bitmapDrawable;
            }
            return new l(bitmapDrawable, cVar.f19496g, cVar.f19497h);
        } finally {
            com.facebook.imagepipeline.systrace.b.a();
        }
    }
}
