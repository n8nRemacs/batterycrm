package ru.cyberity.cbr.core.data.listener;

import Y61.k;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import ru.cyberity.cbr.core.PublicApi;
import ru.cyberity.cbr.core.data.model.CBRCompletionResult;
import ru.cyberity.cbr.core.data.model.CBRSDKState;

/* compiled from: CBRCompleteHandler.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CBRCompleteHandler;", "", "Lru/cyberity/cbr/core/data/model/CBRCompletionResult;", "result", "Lru/cyberity/cbr/core/data/model/CBRSDKState;", VoiceInfo.STATE, "Lkotlin/G0;", "onComplete", "(Lru/cyberity/cbr/core/data/model/CBRCompletionResult;Lru/cyberity/cbr/core/data/model/CBRSDKState;)V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@PublicApi
/* loaded from: classes9.dex */
public interface CBRCompleteHandler {
    void onComplete(@k CBRCompletionResult result, @k CBRSDKState state);
}
