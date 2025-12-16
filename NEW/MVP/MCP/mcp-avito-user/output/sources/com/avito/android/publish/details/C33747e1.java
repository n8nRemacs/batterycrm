package com.avito.android.publish.details;

import com.avito.android.publish.PhotoUploadObserver;
import com.avito.android.publish.details.analytics.PublishDetailsFlowTracker;
import kotlin.Metadata;

/* compiled from: PublishDetailsPhotoSyncInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/PhotoUploadObserver$UploadStatus;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/publish/PhotoUploadObserver$UploadStatus;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.details.e1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33747e1 extends kotlin.jvm.internal.N implements Y41.l<PhotoUploadObserver.UploadStatus, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C33765k1 f234615l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33747e1(C33765k1 c33765k1) {
        super(1);
        this.f234615l = c33765k1;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(PhotoUploadObserver.UploadStatus uploadStatus) {
        this.f234615l.f234815h.B9(PublishDetailsFlowTracker.FlowContext.f233438d);
        return kotlin.G0.f406611a;
    }
}
