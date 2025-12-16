package com.avito.android.photo_storage;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41948f0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GalleryInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_storage/b;", "Lcom/avito/android/photo_storage/a;", "_avito_photo-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ContentResolver f219947a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final BitmapFactory.Options f219948b;

    @Inject
    public b(@Y61.k ContentResolver contentResolver) {
        this.f219947a = contentResolver;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        this.f219948b = options;
    }

    @Override // com.avito.android.photo_storage.a
    @Y61.k
    public final C41948f0 a() {
        return z.W(new VH0.c(this, 23));
    }
}
