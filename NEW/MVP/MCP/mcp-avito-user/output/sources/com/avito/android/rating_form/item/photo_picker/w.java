package com.avito.android.rating_form.item.photo_picker;

import com.avito.android.photo_cache.PhotoUpload;
import com.avito.android.remote.model.ErrorType;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RatingSellerFormUploadListener.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/item/photo_picker/w;", "Ln80/b;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class w implements n80.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l41.g<Throwable> f248568a;

    public w(@Y61.k l41.g<Throwable> gVar) {
        this.f248568a = gVar;
    }

    @Override // n80.b
    public final void a(@Y61.k PhotoUpload photoUpload, @Y61.k ErrorType errorType, @Y61.l Throwable th2) {
        if (th2 != null) {
            this.f248568a.accept(th2);
        }
    }
}
