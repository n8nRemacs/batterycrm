package com.avito.android.publish;

import com.avito.android.publish.PhotoUploadObserver;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import kotlin.Metadata;

/* compiled from: PhotoSyncDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/PhotoUploadObserver$UploadStatus;", "status", "Lio/reactivex/rxjava3/core/O;", "apply", "(Lcom/avito/android/publish/PhotoUploadObserver$UploadStatus;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class E<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.l<PhotoParameter, AbstractC41768a> f231894b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PhotoParameter f231895c;

    /* compiled from: PhotoSyncDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PhotoUploadObserver.UploadStatus.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PhotoUploadObserver.UploadStatus uploadStatus = PhotoUploadObserver.UploadStatus.f231961b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public E(Y41.l<? super PhotoParameter, ? extends AbstractC41768a> lVar, PhotoParameter photoParameter) {
        this.f231894b = lVar;
        this.f231895c = photoParameter;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        AbstractC41768a abstractC41768aInvoke;
        PhotoUploadObserver.UploadStatus uploadStatus = (PhotoUploadObserver.UploadStatus) obj;
        int iOrdinal = uploadStatus.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            PhotoParameter photoParameter = this.f231895c;
            abstractC41768aInvoke = this.f231894b.invoke(photoParameter.copy((8015 & 1) != 0 ? photoParameter.id : null, (8015 & 2) != 0 ? photoParameter.title : null, (8015 & 4) != 0 ? photoParameter.description : null, (8015 & 8) != 0 ? photoParameter.motivation : null, (8015 & 16) != 0 ? photoParameter.maxCount : 0, (8015 & 32) != 0 ? photoParameter.constraints : null, (8015 & 64) != 0 ? photoParameter._value : null, (8015 & 128) != 0 ? photoParameter.required : false, (8015 & 256) != 0 ? photoParameter.shouldUploadPhotoForCV : false, (8015 & 512) != 0 ? photoParameter.suggestByPhotoMaxImages : null, (8015 & 1024) != 0 ? photoParameter.displayingOptions : null, (8015 & 2048) != 0 ? photoParameter.visible : null, (8015 & 4096) != 0 ? photoParameter.phantom : null));
        } else {
            abstractC41768aInvoke = C41823n.f402260b;
        }
        return abstractC41768aInvoke.h(io.reactivex.rxjava3.core.I.q(uploadStatus));
    }
}
