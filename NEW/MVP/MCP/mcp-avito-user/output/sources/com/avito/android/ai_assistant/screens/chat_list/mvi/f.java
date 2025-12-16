package com.avito.android.ai_assistant.screens.chat_list.mvi;

import Wb.c;
import com.avito.android.ai_assistant.screens.chat_list.c;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: AiAssistantChatListConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat_list/mvi/f;", "", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f {
    @Inject
    public f() {
    }

    public static List a(Wb.c cVar) {
        if (cVar instanceof c.b) {
            com.avito.android.ai_assistant.screens.chat_list.c cVar2 = ((c.b) cVar).f17972b;
            if (cVar2 instanceof c.a) {
                AbstractList abstractList = ((c.a) cVar2).f89586b;
                ArrayList arrayList = new ArrayList();
                for (Object obj : abstractList) {
                    if (!(((com.avito.conveyor_item.a) obj) instanceof com.avito.android.ai_assistant.adapter.append.b)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
        }
        return C42784z0.f406748b;
    }
}
