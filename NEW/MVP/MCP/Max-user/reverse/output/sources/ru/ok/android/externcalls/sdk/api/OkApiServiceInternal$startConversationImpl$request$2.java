package ru.ok.android.externcalls.sdk.api;

import defpackage.hn6;
import defpackage.qqg;
import defpackage.tl0;
import defpackage.wm6;
import java.util.List;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class OkApiServiceInternal$startConversationImpl$request$2 extends hn6 implements wm6 {
    public OkApiServiceInternal$startConversationImpl$request$2(Object obj) {
        super(4, 0, OkApiService.class, obj, "addCreateConversationParamsByExternalOpponentIds", "addCreateConversationParamsByExternalOpponentIds(Lru/ok/android/externcalls/sdk/ConversationParticipant;Ljava/util/List;Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;Lru/ok/android/api/common/BasicApiRequest$Builder;)V");
    }

    @Override // defpackage.wm6
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((ConversationParticipant) obj, (List<String>) obj2, (StartCallApiParams) obj3, (tl0) obj4);
        return qqg.a;
    }

    public final void invoke(ConversationParticipant conversationParticipant, List<String> list, StartCallApiParams startCallApiParams, tl0 tl0Var) {
        ((OkApiService) this.receiver).addCreateConversationParamsByExternalOpponentIds(conversationParticipant, list, startCallApiParams, tl0Var);
    }
}
