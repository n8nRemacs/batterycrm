package ru.cyberity.cbr.core.data.listener;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import ru.cyberity.cbr.core.CBRActionResult;
import ru.cyberity.cbr.core.PublicApi;

/* compiled from: CBRActionResultHandler.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bg\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CBRActionResultHandler;", "", "onActionResult", "Lru/cyberity/cbr/core/CBRActionResult;", "actionId", "", "actionType", "answer", "allowContinuing", "", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@PublicApi
/* loaded from: classes9.dex */
public interface CBRActionResultHandler {
    @k
    CBRActionResult onActionResult(@k String actionId, @k String actionType, @l String answer, boolean allowContinuing);
}
