package com.avito.android.ai_assistant.screens.chat_list.mvi;

import Pb.c;
import Wb.b;
import com.avito.android.ai_assistant.screens.chat_list.mvi.entity.AiAssistantChatListInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AiAssistantChatListOneTimeEventProducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat_list/mvi/o;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/ai_assistant/screens/chat_list/mvi/entity/AiAssistantChatListInternalAction;", "LWb/b;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class o implements com.avito.android.arch.mvi.t<AiAssistantChatListInternalAction, Wb.b> {
    @Inject
    public o() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Wb.b b(AiAssistantChatListInternalAction aiAssistantChatListInternalAction) {
        c.a aVar;
        String toastText;
        AiAssistantChatListInternalAction aiAssistantChatListInternalAction2 = aiAssistantChatListInternalAction;
        if (aiAssistantChatListInternalAction2 instanceof AiAssistantChatListInternalAction.b) {
            AiAssistantChatListInternalAction.b bVar = (AiAssistantChatListInternalAction.b) aiAssistantChatListInternalAction2;
            return new b.C1274b(bVar.f89611b, bVar.f89612c);
        }
        if (aiAssistantChatListInternalAction2 instanceof AiAssistantChatListInternalAction.a) {
            return b.a.f17967a;
        }
        if (!(aiAssistantChatListInternalAction2 instanceof AiAssistantChatListInternalAction.d) || (aVar = ((AiAssistantChatListInternalAction.d) aiAssistantChatListInternalAction2).f89614b) == null || (toastText = aVar.getToastText()) == null) {
            return null;
        }
        return new b.c(com.avito.android.printable_text.b.f(toastText));
    }
}
