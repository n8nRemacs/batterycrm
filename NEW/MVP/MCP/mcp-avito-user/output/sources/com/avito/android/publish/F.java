package com.avito.android.publish;

import com.avito.android.photo_picker.b0;
import com.avito.android.publish.PhotoSyncDelegateImpl;
import com.avito.android.publish.PhotoUploadObserver;
import io.reactivex.rxjava3.core.InterfaceC41770c;
import kotlin.Metadata;

/* compiled from: PhotoSyncDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/PhotoUploadObserver$UploadStatus;", "status", "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/PhotoUploadObserver$UploadStatus;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class F<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC41770c f231898b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PhotoSyncDelegateImpl f231899c;

    /* compiled from: PhotoSyncDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PhotoUploadObserver.UploadStatus.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PhotoUploadObserver.UploadStatus uploadStatus = PhotoUploadObserver.UploadStatus.f231961b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PhotoUploadObserver.UploadStatus uploadStatus2 = PhotoUploadObserver.UploadStatus.f231961b;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PhotoUploadObserver.UploadStatus uploadStatus3 = PhotoUploadObserver.UploadStatus.f231961b;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public F(InterfaceC41770c interfaceC41770c, PhotoSyncDelegateImpl photoSyncDelegateImpl) {
        this.f231898b = interfaceC41770c;
        this.f231899c = photoSyncDelegateImpl;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        int iOrdinal = ((PhotoUploadObserver.UploadStatus) obj).ordinal();
        InterfaceC41770c interfaceC41770c = this.f231898b;
        if (iOrdinal == 0 || iOrdinal == 2) {
            interfaceC41770c.e();
        } else if (iOrdinal == 3) {
            b0.a.a(this.f231899c.f231958a, null, 3);
        } else {
            if (iOrdinal != 4) {
                return;
            }
            interfaceC41770c.onError(new PhotoSyncDelegateImpl.PhotoSyncException());
        }
    }
}
