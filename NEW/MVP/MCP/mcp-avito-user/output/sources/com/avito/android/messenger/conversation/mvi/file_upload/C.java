package com.avito.android.messenger.conversation.mvi.file_upload;

import com.avito.android.messenger.analytics.C31660p;
import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32095t;
import com.avito.android.persistence.messenger.TransferStatus;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: FileUploadInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/persistence/messenger/TransferStatus;", "status", "Lcom/avito/android/messenger/conversation/mvi/file_upload/t$a;", "apply", "(Lcom/avito/android/persistence/messenger/TransferStatus;)Lcom/avito/android/messenger/conversation/mvi/file_upload/t$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class C<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC32094s0.a f190996b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessageBody.File f190997c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C32097u f190998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f190999e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f191000f;

    public C(AbstractC32094s0.a aVar, MessageBody.File file, C32097u c32097u, String str, String str2) {
        this.f190996b = aVar;
        this.f190997c = file;
        this.f190998d = c32097u;
        this.f190999e = str;
        this.f191000f = str2;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        TransferStatus transferStatus = (TransferStatus) obj;
        V2.f318762a.c("FileUploadInteractorImpl", "Upload flow has finished with status = " + transferStatus + ", uploadId = " + this.f190996b, null);
        if (transferStatus != TransferStatus.SUCCESS) {
            return new InterfaceC32095t.a.C5648a(null, 1, null);
        }
        MessageBody.File file = this.f190997c;
        String mimeType = file.getMimeType();
        C32097u c32097u = this.f190998d;
        c32097u.f191237f.c(new C31660p(this.f190999e, this.f191000f, null, mimeType != null ? c32097u.f191233b.q(mimeType) : null, null, Long.valueOf(file.getSizeBytes()), null, null, 212, null));
        return new InterfaceC32095t.a.b(this.f191000f);
    }
}
