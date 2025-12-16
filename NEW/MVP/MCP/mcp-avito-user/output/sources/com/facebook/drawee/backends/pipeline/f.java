package com.facebook.drawee.backends.pipeline;

import aX0.C19833d;
import android.content.Context;
import android.net.Uri;
import com.facebook.common.internal.r;
import com.facebook.common.internal.t;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.imagepipeline.cache.C36372e;
import com.facebook.imagepipeline.cache.o;
import com.facebook.imagepipeline.core.p;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.util.HashSet;

/* compiled from: PipelineDraweeControllerBuilder.java */
/* loaded from: classes.dex */
public class f extends AbstractDraweeControllerBuilder<f, ImageRequest, com.facebook.common.references.a<YW0.b>, YW0.f> {

    /* renamed from: i, reason: collision with root package name */
    public final p f339927i;

    /* renamed from: j, reason: collision with root package name */
    public final h f339928j;

    /* compiled from: PipelineDraweeControllerBuilder.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f339929a;

        static {
            int[] iArr = new int[AbstractDraweeControllerBuilder.CacheLevel.values().length];
            f339929a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f339929a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f339929a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f(Context context, h hVar, p pVar) {
        this.f339983a = null;
        this.f339984b = null;
        this.f339986d = null;
        this.f339987e = null;
        this.f339927i = pVar;
        this.f339928j = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.drawee.controller.AbstractDraweeControllerBuilder
    public final com.facebook.datasource.c b(e eVar, String str, Object obj, AbstractDraweeControllerBuilder.CacheLevel cacheLevel) {
        ImageRequest.RequestLevel requestLevel;
        ImageRequest imageRequest = (ImageRequest) obj;
        p pVar = this.f339927i;
        int iOrdinal = cacheLevel.ordinal();
        if (iOrdinal == 0) {
            requestLevel = ImageRequest.RequestLevel.FULL_FETCH;
        } else if (iOrdinal == 1) {
            requestLevel = ImageRequest.RequestLevel.DISK_CACHE;
        } else {
            if (iOrdinal != 2) {
                throw new RuntimeException("Cache level" + cacheLevel + "is not supported. ");
            }
            requestLevel = ImageRequest.RequestLevel.BITMAP_MEMORY_CACHE;
        }
        ImageRequest.RequestLevel requestLevel2 = requestLevel;
        if (eVar != null) {
            synchronized (eVar) {
                try {
                    DW0.e eVar2 = eVar.f339925y;
                    fVar = eVar2 != null ? new DW0.f(eVar.f340000h, eVar2) : null;
                    HashSet hashSet = eVar.f339924x;
                    if (hashSet != null) {
                        C19833d c19833d = new C19833d(hashSet);
                        if (fVar != null) {
                            c19833d.f20908a.add(fVar);
                        }
                        fVar = c19833d;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return pVar.b(imageRequest, null, requestLevel2, fVar, str);
    }

    @Override // com.facebook.drawee.controller.AbstractDraweeControllerBuilder
    public final e c() {
        e eVar;
        com.facebook.imagepipeline.systrace.b.a();
        try {
            IW0.a aVar = this.f339987e;
            String strValueOf = String.valueOf(AbstractDraweeControllerBuilder.f339982h.getAndIncrement());
            if (aVar instanceof e) {
                eVar = (e) aVar;
            } else {
                h hVar = this.f339928j;
                e eVar2 = new e(hVar.f339933a, hVar.f339934b, hVar.f339935c, hVar.f339936d, hVar.f339937e);
                r<Boolean> rVar = hVar.f339938f;
                if (rVar != null) {
                    eVar2.f339923w = rVar.get().booleanValue();
                }
                eVar = eVar2;
            }
            r rVarD = d(eVar, strValueOf);
            ImageRequest imageRequest = this.f339983a;
            o oVar = this.f339927i.f340295f;
            C36372e c36372eA = null;
            if (oVar != null && imageRequest != null) {
                c36372eA = imageRequest.f340793m != null ? oVar.a(imageRequest, null) : oVar.c(imageRequest, null);
            }
            eVar.y(rVarD, strValueOf, c36372eA);
            r<Boolean> rVar2 = t.f339828a;
            synchronized (eVar) {
                eVar.f339917A = this.f339983a;
                eVar.f339918B = this.f339984b;
            }
            com.facebook.imagepipeline.systrace.b.a();
            return eVar;
        } catch (Throwable th2) {
            com.facebook.imagepipeline.systrace.b.a();
            throw th2;
        }
    }

    public final void e(@I41.h Uri uri) {
        if (uri == null) {
            this.f339983a = null;
            return;
        }
        ImageRequestBuilder imageRequestBuilderB = ImageRequestBuilder.b(uri);
        imageRequestBuilderB.f340806d = UW0.e.f16417c;
        this.f339983a = imageRequestBuilderB.a();
    }
}
