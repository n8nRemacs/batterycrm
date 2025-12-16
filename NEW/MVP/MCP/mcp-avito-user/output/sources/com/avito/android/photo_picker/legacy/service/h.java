package com.avito.android.photo_picker.legacy.service;

import com.avito.android.photo_cache.PhotoUpload;
import com.avito.android.remote.model.ErrorType;
import kotlin.Metadata;

/* compiled from: ImageUploadServiceDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class h<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n80.b f219873b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PhotoUpload f219874c;

    public h(n80.b bVar, PhotoUpload photoUpload) {
        this.f219873b = bVar;
        this.f219874c = photoUpload;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        n80.b bVar = this.f219873b;
        if (bVar != null) {
            bVar.a(this.f219874c, ErrorType.NoError.INSTANCE, null);
        }
    }
}
