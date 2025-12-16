package com.avito.android.messenger.conversation.mvi.file_download;

import com.avito.android.messenger.conversation.mvi.file_download.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import ru.avito.messenger.api.entity.GetFileResponse;

/* compiled from: FileDownloadWorkerDelegate.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lru/avito/messenger/api/entity/GetFileResponse;", "responseMap", "Lcom/avito/android/messenger/conversation/mvi/file_download/x$a;", "apply", "(Ljava/util/Map;)Lcom/avito/android/messenger/conversation/mvi/file_download/x$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class K<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final K<T, R> f190841b = new K<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        GetFileResponse getFileResponse = (GetFileResponse) ((Map.Entry) C42745f0.D(((Map) obj).entrySet())).getValue();
        return new x.a(getFileResponse.getUrl(), "voice_" + System.currentTimeMillis() + ".mp4", "audio/mp4", getFileResponse.getToken(), false, true);
    }
}
