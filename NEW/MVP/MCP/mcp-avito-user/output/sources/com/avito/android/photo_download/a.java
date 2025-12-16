package com.avito.android.photo_download;

import Y41.l;
import Y61.k;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.imagepipeline.core.p;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.r;

/* compiled from: FrescoPhotoDownloadDelegate.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_download/a;", "Lcom/avito/android/photo_download/h;", "<init>", "()V", "_avito_photo-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements h {

    /* compiled from: FrescoPhotoDownloadDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.photo_download.a$a, reason: collision with other inner class name */
    public static final class C6490a extends N implements l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.facebook.datasource.c f216427l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6490a(com.facebook.datasource.c cVar) {
            super(1);
            this.f216427l = cVar;
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            this.f216427l.close();
            return G0.f406611a;
        }
    }

    /* compiled from: FrescoPhotoDownloadDelegate.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/photo_download/a$b", "Lcom/facebook/imagepipeline/datasource/c;", "_avito_photo-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.facebook.imagepipeline.datasource.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.facebook.datasource.c f216428a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r f216429b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Uri f216430c;

        public b(com.facebook.datasource.c cVar, r rVar, Uri uri) {
            this.f216428a = cVar;
            this.f216429b = rVar;
            this.f216430c = uri;
        }

        @Override // com.facebook.datasource.e
        public final void a(@k com.facebook.datasource.f<com.facebook.common.references.a<YW0.b>> fVar) {
            int i12 = Z.f406624c;
            this.f216429b.resumeWith(new Z.b(new PhotoDownloadException(null, 1, null)));
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024 A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x0010, B:9:0x0016, B:12:0x0024), top: B:21:0x0010 }] */
        @Override // com.facebook.imagepipeline.datasource.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void g(@Y61.l android.graphics.Bitmap r7) {
            /*
                r6 = this;
                java.lang.String r0 = "Error while downloading "
                com.facebook.datasource.c r1 = r6.f216428a
                boolean r2 = r1.g()
                if (r2 != 0) goto Lb
                return
            Lb:
                kotlinx.coroutines.r r2 = r6.f216429b
                r3 = 1
                if (r7 == 0) goto L24
                boolean r4 = r7.isRecycled()     // Catch: java.lang.Throwable -> L22
                if (r4 != 0) goto L24
                android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L22
                android.graphics.Bitmap r7 = r7.copy(r4, r3)     // Catch: java.lang.Throwable -> L22
                int r3 = kotlin.Z.f406624c     // Catch: java.lang.Throwable -> L22
                r2.resumeWith(r7)     // Catch: java.lang.Throwable -> L22
                goto L34
            L22:
                r7 = move-exception
                goto L38
            L24:
                int r7 = kotlin.Z.f406624c     // Catch: java.lang.Throwable -> L22
                com.avito.android.photo_download.PhotoDownloadException r7 = new com.avito.android.photo_download.PhotoDownloadException     // Catch: java.lang.Throwable -> L22
                r4 = 0
                r7.<init>(r4, r3, r4)     // Catch: java.lang.Throwable -> L22
                kotlin.Z$b r3 = new kotlin.Z$b     // Catch: java.lang.Throwable -> L22
                r3.<init>(r7)     // Catch: java.lang.Throwable -> L22
                r2.resumeWith(r3)     // Catch: java.lang.Throwable -> L22
            L34:
                r1.close()
                goto L58
            L38:
                com.avito.android.util.V2 r3 = com.avito.android.util.V2.f318762a     // Catch: java.lang.Throwable -> L59
                java.lang.String r4 = "FrescoPhotoDownloadDelegate"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
                r5.<init>(r0)     // Catch: java.lang.Throwable -> L59
                android.net.Uri r0 = r6.f216430c     // Catch: java.lang.Throwable -> L59
                r5.append(r0)     // Catch: java.lang.Throwable -> L59
                java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L59
                r3.j(r4, r0, r7)     // Catch: java.lang.Throwable -> L59
                int r0 = kotlin.Z.f406624c     // Catch: java.lang.Throwable -> L59
                kotlin.Z$b r0 = new kotlin.Z$b     // Catch: java.lang.Throwable -> L59
                r0.<init>(r7)     // Catch: java.lang.Throwable -> L59
                r2.resumeWith(r0)     // Catch: java.lang.Throwable -> L59
                goto L34
            L58:
                return
            L59:
                r7 = move-exception
                r1.close()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.photo_download.a.b.g(android.graphics.Bitmap):void");
        }
    }

    @Inject
    public a() {
    }

    @Override // com.avito.android.photo_download.h
    @Y61.l
    public final Object a(@k Uri uri, @k Continuation<? super Bitmap> continuation) {
        r rVar = new r(1, IntrinsicsKt.intercepted(continuation));
        rVar.p();
        p pVarA = com.facebook.drawee.backends.pipeline.d.a();
        ImageRequestBuilder imageRequestBuilderB = ImageRequestBuilder.b(uri);
        imageRequestBuilderB.f340804b = ImageRequest.RequestLevel.FULL_FETCH;
        com.facebook.datasource.c cVarA = pVarA.a(imageRequestBuilderB.a(), null);
        cVarA.d(new b(cVarA, rVar, uri), com.facebook.common.executors.a.f339811b);
        rVar.r(new C6490a(cVarA));
        Object objO = rVar.o();
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objO;
    }
}
