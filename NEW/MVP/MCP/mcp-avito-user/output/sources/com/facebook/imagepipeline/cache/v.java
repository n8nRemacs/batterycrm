package com.facebook.imagepipeline.cache;

import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: DefaultCacheKeyFactory.java */
@Nullsafe
/* loaded from: classes12.dex */
public class v implements o {

    /* renamed from: a, reason: collision with root package name */
    @I41.h
    public static v f340256a;

    public static synchronized v e() {
        try {
            if (f340256a == null) {
                f340256a = new v();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f340256a;
    }

    @Override // com.facebook.imagepipeline.cache.o
    public final C36372e a(ImageRequest imageRequest, @I41.h Object obj) {
        com.facebook.cache.common.c cVar;
        String name;
        com.facebook.imagepipeline.request.a aVar = imageRequest.f340793m;
        if (aVar != null) {
            com.facebook.cache.common.c cVarA = aVar.a();
            name = aVar.getClass().getName();
            cVar = cVarA;
        } else {
            cVar = null;
            name = null;
        }
        return new C36372e(imageRequest.f340782b.toString(), imageRequest.f340786f, imageRequest.f340787g, imageRequest.f340785e, cVar, name, obj);
    }

    @Override // com.facebook.imagepipeline.cache.o
    public final com.facebook.cache.common.j b(ImageRequest imageRequest, @I41.h Object obj) {
        return d(imageRequest.f340782b);
    }

    @Override // com.facebook.imagepipeline.cache.o
    public final C36372e c(ImageRequest imageRequest, @I41.h Object obj) {
        return new C36372e(imageRequest.f340782b.toString(), imageRequest.f340786f, imageRequest.f340787g, imageRequest.f340785e, null, null, obj);
    }

    @Override // com.facebook.imagepipeline.cache.o
    public final com.facebook.cache.common.j d(Uri uri) {
        return new com.facebook.cache.common.j(uri.toString());
    }
}
