package com.avito.android.photo_picker.legacy.service;

import com.avito.android.photo_cache.PhotoUpload;
import com.avito.android.remote.model.ErrorType;
import com.avito.android.util.K5;
import kotlin.Metadata;

/* compiled from: ImageUploadServiceDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class i<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n80.b f219875b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PhotoUpload f219876c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f219877d;

    public i(n80.b bVar, PhotoUpload photoUpload, d dVar) {
        this.f219875b = bVar;
        this.f219876c = photoUpload;
        this.f219877d = dVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        n80.b bVar = this.f219875b;
        if (bVar != null) {
            this.f219877d.getClass();
            bVar.a(this.f219876c, K5.e(th2) ? ErrorType.RestorableError.INSTANCE : ErrorType.NonRestorableError.INSTANCE, th2);
        }
    }
}
