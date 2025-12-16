package com.avito.android.candy;

import android.graphics.Bitmap;
import java.io.IOException;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: RemoteCarImageSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/candy/m;", "Lcom/facebook/imagepipeline/datasource/c;", "_avito_candy-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m extends com.facebook.imagepipeline.datasource.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Throwable, G0> f114900a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Bitmap, G0> f114901b;

    /* JADX WARN: Multi-variable type inference failed */
    public m(Y41.l<? super Throwable, G0> lVar, Y41.l<? super Bitmap, G0> lVar2) {
        this.f114900a = lVar;
        this.f114901b = lVar2;
    }

    @Override // com.facebook.datasource.e
    public final void a(@Y61.k com.facebook.datasource.f<com.facebook.common.references.a<YW0.b>> fVar) {
        this.f114900a.invoke(new IOException("Can't load image from remote source"));
    }

    @Override // com.facebook.imagepipeline.datasource.c
    public final void g(@Y61.l Bitmap bitmap) {
        if (bitmap != null) {
            this.f114901b.invoke(bitmap);
        } else {
            this.f114900a.invoke(new IOException("Can't load image from remote source"));
        }
    }
}
