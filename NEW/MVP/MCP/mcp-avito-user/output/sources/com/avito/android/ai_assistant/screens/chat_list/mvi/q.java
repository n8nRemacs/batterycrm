package com.avito.android.ai_assistant.screens.chat_list.mvi;

import com.avito.android.ai_assistant.adapter.append.AppendState;
import com.avito.android.ai_assistant.screens.chat_list.mvi.entity.AiAssistantChatListInternalAction;
import com.avito.android.arch.mvi.u;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AiAssistantChatListReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat_list/mvi/q;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/ai_assistant/screens/chat_list/mvi/entity/AiAssistantChatListInternalAction;", "LWb/c;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class q implements u<AiAssistantChatListInternalAction, Wb.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final f f89643b;

    @Inject
    public q(@Y61.k f fVar) {
        this.f89643b = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    public static ArrayList b(AbstractList abstractList, AppendState appendState) {
        com.avito.android.ai_assistant.adapter.append.b next;
        ArrayList arrayList = new ArrayList(abstractList);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = 0;
                break;
            }
            next = it.next();
            if (((com.avito.conveyor_item.a) next) instanceof com.avito.android.ai_assistant.adapter.append.b) {
                break;
            }
        }
        com.avito.android.ai_assistant.adapter.append.b bVar = next instanceof com.avito.android.ai_assistant.adapter.append.b ? next : null;
        if (bVar != null) {
            int iIndexOf = arrayList.indexOf(bVar);
            arrayList.remove(iIndexOf);
            arrayList.add(iIndexOf, new com.avito.android.ai_assistant.adapter.append.b(bVar.f88732b, appendState));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ee  */
    /* JADX WARN: Type inference failed for: r11v6, types: [com.avito.android.ai_assistant.adapter.chat_list_item.a] */
    @Override // com.avito.android.arch.mvi.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Wb.c a(com.avito.android.ai_assistant.screens.chat_list.mvi.entity.AiAssistantChatListInternalAction r19, Wb.c r20) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.ai_assistant.screens.chat_list.mvi.q.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
