package com.avito.android.messenger.conversation.mvi.file_download;

import com.avito.android.messenger.conversation.mvi.file_download.x;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.Metadata;
import ru.avito.messenger.api.entity.GetFileResponse;

/* compiled from: FileDownloadWorkerDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/api/entity/GetFileResponse;", "response", "Lcom/avito/android/messenger/conversation/mvi/file_download/x$a;", "apply", "(Lru/avito/messenger/api/entity/GetFileResponse;)Lcom/avito/android/messenger/conversation/mvi/file_download/x$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class J<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f190839b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessageBody.File f190840c;

    public J(String str, MessageBody.File file) {
        this.f190839b = str;
        this.f190840c = file;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        GetFileResponse getFileResponse = (GetFileResponse) obj;
        return new x.a(getFileResponse.getUrl(), this.f190839b, this.f190840c.getMimeType(), getFileResponse.getToken(), true, false);
    }
}
