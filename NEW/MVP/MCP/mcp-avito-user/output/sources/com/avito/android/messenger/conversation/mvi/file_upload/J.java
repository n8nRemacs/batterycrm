package com.avito.android.messenger.conversation.mvi.file_upload;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.analytics.C31660p;
import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32095t;
import com.avito.android.persistence.messenger.Q1;
import com.avito.android.persistence.messenger.TransferStatus;
import com.avito.android.util.C35836l1;
import com.avito.android.util.V2;
import java.io.File;
import kotlin.Metadata;
import ru.avito.messenger.api.entity.CreateVoiceFileResponse;

/* compiled from: FileUploadInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/persistence/messenger/Q1;", "messageMetaInfo", "Lcom/avito/android/messenger/conversation/mvi/file_upload/t$b;", "apply", "(Lcom/avito/android/persistence/messenger/Q1;)Lcom/avito/android/messenger/conversation/mvi/file_upload/t$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class J<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC32094s0.a f191039b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32097u f191040c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CreateVoiceFileResponse f191041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ File f191042e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f191043f;

    public J(AbstractC32094s0.a aVar, C32097u c32097u, CreateVoiceFileResponse createVoiceFileResponse, File file, String str) {
        this.f191039b = aVar;
        this.f191040c = c32097u;
        this.f191041d = createVoiceFileResponse;
        this.f191042e = file;
        this.f191043f = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Q1 q12 = (Q1) obj;
        V2 v22 = V2.f318762a;
        StringBuilder sb2 = new StringBuilder("Upload flow has finished with status = ");
        TransferStatus transferStatus = q12.f215288g;
        sb2.append(transferStatus);
        sb2.append(", uploadId = ");
        sb2.append(this.f191039b);
        v22.c("FileUploadInteractorImpl", sb2.toString(), null);
        if (transferStatus != TransferStatus.SUCCESS) {
            return new InterfaceC32095t.b.a(null, 1, null);
        }
        InterfaceC28373a interfaceC28373a = this.f191040c.f191237f;
        CreateVoiceFileResponse createVoiceFileResponse = this.f191041d;
        interfaceC28373a.c(new C31660p(this.f191043f, createVoiceFileResponse.getFileId(), null, "mp4", null, Long.valueOf(C35836l1.c(this.f191042e)), createVoiceFileResponse.getVoiceId(), Long.valueOf(q12.f215291j / 1000), 20, null));
        return new InterfaceC32095t.b.C5649b(createVoiceFileResponse.getFileId(), createVoiceFileResponse.getVoiceId());
    }
}
