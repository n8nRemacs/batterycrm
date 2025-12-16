package ru.ok.android.externcalls.sdk.api;

import defpackage.hn6;
import defpackage.qqg;
import defpackage.sm6;
import defpackage.tl0;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class OkApiServiceInternal$joinToConversation$request$1 extends hn6 implements sm6 {
    public OkApiServiceInternal$joinToConversation$request$1(Object obj) {
        super(2, 0, OkApiService.class, obj, "addJoinToConversationParams", "addJoinToConversationParams(Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;Lru/ok/android/api/common/BasicApiRequest$Builder;)V");
    }

    @Override // defpackage.sm6
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((StartCallApiParams) obj, (tl0) obj2);
        return qqg.a;
    }

    public final void invoke(StartCallApiParams startCallApiParams, tl0 tl0Var) {
        ((OkApiService) this.receiver).addJoinToConversationParams(startCallApiParams, tl0Var);
    }
}
