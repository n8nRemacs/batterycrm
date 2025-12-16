package com.avito.android.messenger.conversation.mvi.video.chunked_upload;

import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import com.avito.android.messenger.conversation.mvi.video.chunked_upload.o;
import kotlin.Metadata;
import ru.avito.messenger.api.entity.MultipartUploadPart;

/* compiled from: ChunkedVideoUploadWorkerDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/api/entity/MultipartUploadPart;", "multipartUploadPart", "Lcom/avito/android/messenger/conversation/mvi/video/chunked_upload/o$b;", "apply", "(Lru/avito/messenger/api/entity/MultipartUploadPart;)Lcom/avito/android/messenger/conversation/mvi/video/chunked_upload/o$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class r<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC32094s0.b f194967b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f194968c;

    public r(AbstractC32094s0.b bVar, String str) {
        this.f194967b = bVar;
        this.f194968c = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return new o.b.C5761b(this.f194967b, this.f194968c, (MultipartUploadPart) obj);
    }
}
