package com.avito.android.util;

import android.graphics.Bitmap;
import kotlin.Metadata;

/* compiled from: Frescos.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/y1;", "Lcom/facebook/imagepipeline/datasource/c;", "_common_image-loader-fresco_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.y1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35980y1 extends com.facebook.imagepipeline.datasource.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.core.K<Bitmap> f319130a;

    public C35980y1(io.reactivex.rxjava3.core.K<Bitmap> k12) {
        this.f319130a = k12;
    }

    @Override // com.facebook.datasource.e
    public final void a(@Y61.k com.facebook.datasource.f<com.facebook.common.references.a<YW0.b>> fVar) {
        this.f319130a.onError(new Exception("fetchDecodedImage failed!"));
    }

    @Override // com.facebook.imagepipeline.datasource.c
    public final void g(@Y61.l Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        this.f319130a.onSuccess(Bitmap.createBitmap(bitmap));
    }
}
