package com.avito.android.app.task;

import android.net.Uri;
import arrow.core.C23703n1;
import com.avito.android.photo_cache.PhotoUpload;
import com.avito.android.remote.model.ErrorType;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.messenger.message.Quote;
import io.reactivex.rxjava3.internal.operators.completable.C41811b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: LocalMessageSender.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Larrow/core/Y0;", "Lcom/avito/android/photo_cache/PhotoUpload;", "option", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/ChatMessage;", "apply", "(Larrow/core/Y0;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.app.task.f0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28554f0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MessageBody.LocalImage f91591b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C28587q0 f91592c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LocalMessage f91593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.core.H f91594e;

    public C28554f0(MessageBody.LocalImage localImage, C28587q0 c28587q0, LocalMessage localMessage, io.reactivex.rxjava3.core.H h12) {
        this.f91591b = localImage;
        this.f91592c = c28587q0;
        this.f91593d = localMessage;
        this.f91594e = h12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        arrow.core.Y0 y02 = (arrow.core.Y0) obj;
        boolean z12 = y02 instanceof arrow.core.X0;
        MessageBody.LocalImage localImage = this.f91591b;
        if (z12) {
            return io.reactivex.rxjava3.core.I.l(new NoRetryException("Photo upload not found: (" + localImage.getOperationId() + ", " + localImage.getUploadId() + ')', null, 2, null));
        }
        if (!(y02 instanceof C23703n1)) {
            throw new NoWhenBranchMatchedException();
        }
        PhotoUpload photoUpload = (PhotoUpload) ((C23703n1) y02).f56288b;
        if (photoUpload.f216307i instanceof ErrorType.NonRestorableError) {
            return io.reactivex.rxjava3.core.I.l(new NoRetryException("Photo cannot be uploaded: (" + localImage.getOperationId() + ", " + localImage.getUploadId() + ')', null, 2, null));
        }
        C28587q0 c28587q0 = this.f91592c;
        Uri uri = photoUpload.f216305g;
        if (uri != null ? true ^ c28587q0.f91697g.c(uri) : true) {
            return io.reactivex.rxjava3.core.I.l(new NoRetryException("Photo upload file does not exist: (" + localImage.getOperationId() + ", " + localImage.getUploadId() + ')', null, 2, null));
        }
        LocalMessage localMessage = this.f91593d;
        String channelId = localMessage.getChannelId();
        String localId = localMessage.getLocalId();
        String operationId = localImage.getOperationId();
        Quote quote = localMessage.getQuote();
        String id2 = quote != null ? quote.getId() : null;
        Quote quote2 = localMessage.getQuote();
        Integer chunkIndex = quote2 != null ? quote2.getChunkIndex() : null;
        c28587q0.getClass();
        io.reactivex.rxjava3.internal.operators.completable.r rVar = new io.reactivex.rxjava3.internal.operators.completable.r(new Z(c28587q0, photoUpload, operationId));
        long j12 = photoUpload.f216300b;
        C41811b c41811bG = rVar.g(new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC28572l0(c28587q0, operationId, j12)));
        io.reactivex.rxjava3.core.H h12 = this.f91594e;
        return c41811bG.h(com.avito.android.util.rx3.arrow.b.a(c28587q0.f91696f.g(j12, operationId).x0(h12).j0(h12).d0(Y.f91556b)).N(new C28575m0()).S()).t(new C28578n0(operationId, photoUpload)).n(new C28584p0(c28587q0, channelId, localId, id2, chunkIndex, h12, photoUpload, operationId));
    }
}
