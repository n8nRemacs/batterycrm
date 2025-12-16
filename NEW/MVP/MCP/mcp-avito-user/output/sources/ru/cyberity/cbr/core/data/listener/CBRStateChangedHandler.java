package ru.cyberity.cbr.core.data.listener;

import Y61.k;
import kotlin.Metadata;
import ru.cyberity.cbr.core.PublicApi;
import ru.cyberity.cbr.core.data.model.CBRSDKState;

/* compiled from: CBRStateChangedHandler.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CBRStateChangedHandler;", "", "Lru/cyberity/cbr/core/data/model/CBRSDKState;", "previousState", "currentState", "Lkotlin/G0;", "onStateChanged", "(Lru/cyberity/cbr/core/data/model/CBRSDKState;Lru/cyberity/cbr/core/data/model/CBRSDKState;)V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@PublicApi
/* loaded from: classes9.dex */
public interface CBRStateChangedHandler {
    void onStateChanged(@k CBRSDKState previousState, @k CBRSDKState currentState);
}
