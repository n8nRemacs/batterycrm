package com.avito.android.messenger.conversation.mvi.file_upload;

import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import ru.avito.messenger.api.entity.MultipartUploadPart;

/* compiled from: FileUploadApi.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u000eJ[\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\u000e\u0010\u000fJ=\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\nH'¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/a;", "", "", ContextActionHandler.Link.URL, "origin", "fileId", "uploadSessionId", "hash", "", "partNumber", "Lokhttp3/MultipartBody$Part;", "video", "Lio/reactivex/rxjava3/core/I;", "Lru/avito/messenger/api/entity/MultipartUploadPart;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLokhttp3/MultipartBody$Part;)Lio/reactivex/rxjava3/core/I;", "file", "Lkotlin/G0;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokhttp3/MultipartBody$Part;)Lio/reactivex/rxjava3/core/I;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC32058a {

    /* compiled from: FileUploadApi.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/a$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.a$a, reason: collision with other inner class name */
    public static final class C5647a {
        static {
            new C5647a();
        }
    }

    @J81.o
    @J81.l
    @Y61.k
    io.reactivex.rxjava3.core.I<MultipartUploadPart> a(@J81.y @Y61.k String url, @J81.i("Origin") @Y61.k String origin, @J81.t("id") @Y61.k String fileId, @J81.t("uploadId") @Y61.k String uploadSessionId, @J81.t("hash") @Y61.k String hash, @J81.t("partNumber") long partNumber, @J81.q @Y61.k MultipartBody.Part video);

    @J81.o
    @J81.l
    @Y61.k
    io.reactivex.rxjava3.core.I<kotlin.G0> b(@J81.y @Y61.k String url, @J81.i("Origin") @Y61.k String origin, @J81.t("id") @Y61.k String fileId, @J81.q @Y61.k MultipartBody.Part file);
}
