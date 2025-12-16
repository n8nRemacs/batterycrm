package com.avito.android.photo_picker.legacy.service;

import com.avito.android.photo_cache.PhotoUpload;
import com.avito.android.remote.model.ErrorType;
import com.avito.android.util.K5;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: ImageUploadServiceDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class f<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f219867b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f219868c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PhotoUpload f219869d;

    public f(PhotoUpload photoUpload, d dVar, String str) {
        this.f219867b = dVar;
        this.f219868c = str;
        this.f219869d = photoUpload;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        d dVar = this.f219867b;
        dVar.getClass();
        V2 v22 = V2.f318762a;
        StringBuilder sb2 = new StringBuilder("Failed to process or upload image: ");
        PhotoUpload photoUpload = this.f219869d;
        sb2.append(photoUpload.f216305g);
        v22.b(sb2.toString(), th2);
        dVar.f219853a.h(this.f219868c, PhotoUpload.a(photoUpload, null, null, K5.e(th2) ? ErrorType.RestorableError.INSTANCE : ErrorType.NonRestorableError.INSTANCE, null, null, null, 3967));
    }
}
