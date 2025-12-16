package com.avito.android.ai_assistant.screens.chat.mvi;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AiAssistantChatReducer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/a;", "item", "", "invoke", "(Lcom/avito/android/ai_assistant/adapter/a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class I extends N implements Y41.l<com.avito.android.ai_assistant.adapter.a, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final I f89203l = new I();

    public I() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(com.avito.android.ai_assistant.adapter.a aVar) {
        return Boolean.valueOf(aVar instanceof com.avito.android.ai_assistant.adapter.answer_loading.b);
    }
}
