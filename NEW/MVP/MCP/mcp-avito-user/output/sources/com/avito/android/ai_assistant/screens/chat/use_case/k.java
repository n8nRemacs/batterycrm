package com.avito.android.ai_assistant.screens.chat.use_case;

import Nb.InterfaceC14555a;
import com.avito.android.ai_assistant.generated.api.action.ActionResponse;
import com.avito.android.ai_assistant.generated.api.action.InputBody;
import com.avito.android.ai_assistant.model.MessageActionType;
import com.avito.android.remote.model.TypedResult;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: MessageActionsUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/use_case/k;", "Lcom/avito/android/ai_assistant/screens/chat/use_case/j;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14555a f89539a;

    /* compiled from: MessageActionsUseCase.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[MessageActionType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MessageActionType messageActionType = MessageActionType.f89107b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MessageActionType messageActionType2 = MessageActionType.f89107b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public k(@Y61.k InterfaceC14555a interfaceC14555a) {
        this.f89539a = interfaceC14555a;
    }

    @Override // com.avito.android.ai_assistant.screens.chat.use_case.j
    @Y61.l
    public final Object a(@Y61.k MessageActionType messageActionType, @Y61.k String str, @Y61.k String str2, @Y61.k Continuation<? super TypedResult<ActionResponse>> continuation) {
        int iOrdinal = messageActionType.ordinal();
        return this.f89539a.c(new InputBody(iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? InputBody.Action.Undislike : InputBody.Action.Dislike : InputBody.Action.Unlike : InputBody.Action.Like, str, str2), continuation);
    }
}
