package com.avito.android.photo_picker.legacy.service;

import com.avito.android.photo_cache.PhotoUpload;
import com.avito.android.remote.model.ErrorType;
import kotlin.Metadata;

/* compiled from: ImageUploadServiceDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "uploadId", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f219870b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f219871c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PhotoUpload f219872d;

    public g(PhotoUpload photoUpload, d dVar, String str) {
        this.f219870b = dVar;
        this.f219871c = str;
        this.f219872d = photoUpload;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        String str = (String) obj;
        d dVar = this.f219870b;
        dVar.getClass();
        PhotoUpload photoUploadA = PhotoUpload.a(this.f219872d, str, null, ErrorType.NoError.INSTANCE, null, null, null, 3951);
        dVar.f219853a.h(this.f219871c, photoUploadA);
    }
}
