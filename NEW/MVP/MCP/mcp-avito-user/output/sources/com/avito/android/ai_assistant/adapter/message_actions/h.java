package com.avito.android.ai_assistant.adapter.message_actions;

import Y61.k;
import com.avito.android.ai_assistant.model.ReactionState;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: MessageActionsListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/message_actions/h;", "", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface h {
    void a(@k String str, @k ReactionState reactionState, @k Tb.f fVar);

    void b(@k DeepLink deepLink);
}
