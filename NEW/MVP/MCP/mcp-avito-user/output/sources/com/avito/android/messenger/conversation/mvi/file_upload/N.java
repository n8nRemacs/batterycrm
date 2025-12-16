package com.avito.android.messenger.conversation.mvi.file_upload;

import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import com.avito.android.util.V2;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.api.entity.CreateVoiceFileResponse;

/* compiled from: FileUploadInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/api/entity/CreateVoiceFileResponse;", "response", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/messenger/conversation/mvi/file_upload/t$b;", "apply", "(Lru/avito/messenger/api/entity/CreateVoiceFileResponse;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class N<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC32094s0.a f191064b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32097u f191065c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f191066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f191067e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f191068f;

    public N(AbstractC32094s0.a aVar, C32097u c32097u, MessengerUserHashInfo messengerUserHashInfo, String str, String str2) {
        this.f191064b = aVar;
        this.f191065c = c32097u;
        this.f191066d = messengerUserHashInfo;
        this.f191067e = str;
        this.f191068f = str2;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        CreateVoiceFileResponse createVoiceFileResponse = (CreateVoiceFileResponse) obj;
        V2 v22 = V2.f318762a;
        StringBuilder sb2 = new StringBuilder("Received fileId = ");
        sb2.append(createVoiceFileResponse.getFileId());
        sb2.append(" for uploadId = ");
        AbstractC32094s0.a aVar = this.f191064b;
        sb2.append(aVar);
        v22.c("FileUploadInteractorImpl", sb2.toString(), null);
        InterfaceC32024m interfaceC32024m = this.f191065c.f191232a;
        String str = this.f191068f;
        MessengerUserHashInfo messengerUserHashInfo = this.f191066d;
        return interfaceC32024m.Z(this.f191067e, str, messengerUserHashInfo).n(new C32105y()).n(new M(this.f191065c, aVar, createVoiceFileResponse, messengerUserHashInfo, this.f191067e, this.f191068f));
    }
}
