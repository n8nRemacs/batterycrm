package com.avito.android.ai_assistant.screens.chat_list.mvi;

import Jb.InterfaceC14183a;
import Wb.InterfaceC15738a;
import Wb.c;
import com.avito.android.ai_assistant.screens.chat_list.mvi.entity.AiAssistantChatListInternalAction;
import com.avito.android.arch.mvi.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AiAssistantChatListActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat_list/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LWb/a;", "Lcom/avito/android/ai_assistant/screens/chat_list/mvi/entity/AiAssistantChatListInternalAction;", "LWb/c;", "a", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC15738a, AiAssistantChatListInternalAction, Wb.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final k f89599a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14183a f89600b;

    /* compiled from: AiAssistantChatListActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat_list/mvi/a$a;", "", "<init>", "()V", "", "CHAT_LIST_FROM_PAGE", "Ljava/lang/String;", "NEW_CHAT_CONTEXT", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.ai_assistant.screens.chat_list.mvi.a$a, reason: collision with other inner class name */
    public static final class C2663a {
        public /* synthetic */ C2663a(C42822w c42822w) {
            this();
        }

        public C2663a() {
        }
    }

    static {
        new C2663a(null);
    }

    @Inject
    public a(@Y61.k k kVar, @Y61.k InterfaceC14183a interfaceC14183a) {
        this.f89599a = kVar;
        this.f89600b = interfaceC14183a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<AiAssistantChatListInternalAction> b(InterfaceC15738a interfaceC15738a, Wb.c cVar) {
        C43210w c43210w;
        InterfaceC15738a interfaceC15738a2 = interfaceC15738a;
        Wb.c cVar2 = cVar;
        if (interfaceC15738a2 instanceof InterfaceC15738a.c) {
            return C43175k.G(new b(interfaceC15738a2, null));
        }
        boolean z12 = interfaceC15738a2 instanceof InterfaceC15738a.C1273a;
        InterfaceC14183a interfaceC14183a = this.f89600b;
        if (z12) {
            interfaceC14183a.b(Boolean.TRUE, "history", "new_chat");
            c.b bVar = cVar2 instanceof c.b ? (c.b) cVar2 : null;
            String str = bVar != null ? bVar.f17974d : null;
            if (str == null) {
                str = "H4sIAAAAAAAA_0q0MrSqLraytFJKK8rPjS9ITE9Vsi62MjSwUspLLY9PKi0pyc9Tsq4FBAAA__-LSeU5KAAAAA";
            }
            return new C43210w(new AiAssistantChatListInternalAction.b(str, null, 2, null));
        }
        if (interfaceC15738a2 instanceof InterfaceC15738a.b) {
            interfaceC14183a.b(null, "history", "back");
            c43210w = new C43210w(AiAssistantChatListInternalAction.a.f89610b);
        } else {
            boolean z13 = interfaceC15738a2 instanceof InterfaceC15738a.f;
            k kVar = this.f89599a;
            if (z13) {
                return kVar.a();
            }
            if (interfaceC15738a2 instanceof InterfaceC15738a.e) {
                c.b bVar2 = cVar2 instanceof c.b ? (c.b) cVar2 : null;
                Long l12 = bVar2 != null ? bVar2.f17973c : null;
                if (l12 != null) {
                    long jLongValue = l12.longValue();
                    kVar.getClass();
                    InterfaceC43160i<AiAssistantChatListInternalAction> interfaceC43160iI = C43175k.I(kVar.f89627c.a(), new C43152f0(C43175k.G(new l(kVar, jLongValue, null)), new m(3, null)));
                    if (interfaceC43160iI != null) {
                        return interfaceC43160iI;
                    }
                }
                return C43175k.w();
            }
            if (!(interfaceC15738a2 instanceof InterfaceC15738a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(AiAssistantChatListInternalAction.e.f89615b);
        }
        return c43210w;
    }
}
