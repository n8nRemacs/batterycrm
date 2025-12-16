package com.avito.android.messenger.conversation.mvi.file_upload;

import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import com.avito.android.messenger.conversation.mvi.video.chunked_upload.C32302a;
import com.avito.android.persistence.messenger.TransferStatus;
import kotlin.Metadata;

/* compiled from: VideoUploadInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/persistence/messenger/TransferStatus;", "status", "Lio/reactivex/rxjava3/core/O;", "apply", "(Lcom/avito/android/persistence/messenger/TransferStatus;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class Y0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC32094s0.b f191108b;

    public Y0(AbstractC32094s0.b bVar) {
        this.f191108b = bVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        TransferStatus transferStatus = (TransferStatus) obj;
        if (transferStatus == TransferStatus.SUCCESS) {
            return io.reactivex.rxjava3.core.I.q(transferStatus);
        }
        return io.reactivex.rxjava3.core.I.l(new C32302a("chunkUploadStatus == " + transferStatus + " for " + this.f191108b));
    }
}
