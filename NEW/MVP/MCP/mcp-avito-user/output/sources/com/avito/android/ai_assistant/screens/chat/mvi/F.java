package com.avito.android.ai_assistant.screens.chat.mvi;

import Vb.h;
import com.avito.android.R;
import com.avito.android.ai_assistant.screens.chat.mvi.entity.AiAssistantInternalAction;
import com.avito.android.deep_linking.links.DeepLink;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AiAssistantChatOneTimeEventProducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/F;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "LVb/h;", "<init>", "()V", "a", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class F implements com.avito.android.arch.mvi.t<AiAssistantInternalAction, Vb.h> {

    /* compiled from: AiAssistantChatOneTimeEventProducer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/F$a;", "", "<init>", "()V", "", "NEW_CHAT_CONTEXT", "Ljava/lang/String;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public F() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Vb.h b(AiAssistantInternalAction aiAssistantInternalAction) {
        String str;
        AiAssistantInternalAction aiAssistantInternalAction2 = aiAssistantInternalAction;
        if (aiAssistantInternalAction2 instanceof AiAssistantInternalAction.h) {
            return new h.a(((AiAssistantInternalAction.h) aiAssistantInternalAction2).f89261a);
        }
        if (aiAssistantInternalAction2 instanceof AiAssistantInternalAction.c) {
            AiAssistantInternalAction.c cVar = (AiAssistantInternalAction.c) aiAssistantInternalAction2;
            return new h.d(cVar.f89254a, cVar.f89255b);
        }
        if (aiAssistantInternalAction2 instanceof AiAssistantInternalAction.s) {
            return new h.j(((AiAssistantInternalAction.s) aiAssistantInternalAction2).f89278c);
        }
        if (aiAssistantInternalAction2 instanceof AiAssistantInternalAction.t) {
            return h.b.f17237a;
        }
        C42822w c42822w = null;
        if (aiAssistantInternalAction2 instanceof AiAssistantInternalAction.u) {
            DeepLink deepLink = ((AiAssistantInternalAction.u) aiAssistantInternalAction2).f89280a;
            if (deepLink != null) {
                return new h.g(deepLink);
            }
        } else {
            boolean z12 = false;
            if (aiAssistantInternalAction2 instanceof AiAssistantInternalAction.d) {
                return new h.j(com.avito.android.printable_text.b.c(R.string.ai_assistant_chat_already_new, new Serializable[0]));
            }
            if (aiAssistantInternalAction2 instanceof AiAssistantInternalAction.f) {
                AiAssistantInternalAction.f fVar = (AiAssistantInternalAction.f) aiAssistantInternalAction2;
                return new h.c(fVar.f89258a, fVar.f89259b);
            }
            if (aiAssistantInternalAction2 instanceof AiAssistantInternalAction.o) {
                String str2 = ((AiAssistantInternalAction.o) aiAssistantInternalAction2).f89271a;
                if (str2 == null) {
                    str2 = "H4sIAAAAAAAA_0q0MrSqLraytFJKK8rPjS9ITE9Vsi62MjSwUspLLY9PKi0pyc9Tsq4FBAAA__-LSeU5KAAAAA";
                }
                return new h.f(str2);
            }
            if (aiAssistantInternalAction2 instanceof AiAssistantInternalAction.w) {
                return new h.e(((AiAssistantInternalAction.w) aiAssistantInternalAction2).f89282a.f88856a, false);
            }
            if (aiAssistantInternalAction2 instanceof AiAssistantInternalAction.x) {
                return new h.e(((AiAssistantInternalAction.x) aiAssistantInternalAction2).f89283a, false);
            }
            if (aiAssistantInternalAction2 instanceof AiAssistantInternalAction.UpdateChatHistory) {
                Tb.d dVar = ((AiAssistantInternalAction.UpdateChatHistory) aiAssistantInternalAction2).f89240b;
                if (dVar != null && (str = dVar.f15740d) != null) {
                    return new h.j(com.avito.android.printable_text.b.f(str));
                }
            } else if (aiAssistantInternalAction2 instanceof AiAssistantInternalAction.C28367a) {
                return new h.e(((AiAssistantInternalAction.C28367a) aiAssistantInternalAction2).f89252a, z12, 2, c42822w);
            }
        }
        return null;
    }
}
