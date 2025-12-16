package com.avito.android.app.task;

import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.Metadata;

/* compiled from: LocalMessageSender.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "error", "Lio/reactivex/rxjava3/core/O;", "Larrow/core/Y0;", "Lcom/avito/android/photo_cache/PhotoUpload;", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.app.task.e0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28551e0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MessageBody.LocalImage f91587b;

    public C28551e0(MessageBody.LocalImage localImage) {
        this.f91587b = localImage;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        StringBuilder sb2 = new StringBuilder("Failed to find photo upload: (");
        MessageBody.LocalImage localImage = this.f91587b;
        sb2.append(localImage.getOperationId());
        sb2.append(", ");
        sb2.append(localImage.getUploadId());
        sb2.append(')');
        return io.reactivex.rxjava3.core.I.l(new NoRetryException(sb2.toString(), (Throwable) obj));
    }
}
