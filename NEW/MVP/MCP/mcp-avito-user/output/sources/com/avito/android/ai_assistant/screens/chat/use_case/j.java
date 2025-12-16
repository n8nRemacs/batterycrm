package com.avito.android.ai_assistant.screens.chat.use_case;

import com.avito.android.ai_assistant.generated.api.action.ActionResponse;
import com.avito.android.ai_assistant.model.MessageActionType;
import com.avito.android.remote.model.TypedResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: MessageActionsUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/use_case/j;", "", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface j {
    @Y61.l
    Object a(@Y61.k MessageActionType messageActionType, @Y61.k String str, @Y61.k String str2, @Y61.k Continuation<? super TypedResult<ActionResponse>> continuation);
}
