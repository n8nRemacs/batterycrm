package com.avito.android.ai_assistant.adapter;

import com.avito.android.ai_assistant.model.OkRespDataSuccessElementsItemMessageSegmentsItem;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UserItemsConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/l;", "Lcom/avito/android/ai_assistant/adapter/k;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class l implements k {
    @Inject
    public l() {
    }

    @Override // com.avito.android.ai_assistant.adapter.k
    @Y61.l
    public final com.avito.android.ai_assistant.adapter.user_message.b a(@Y61.k OkRespDataSuccessElementsItemMessageSegmentsItem okRespDataSuccessElementsItemMessageSegmentsItem, @Y61.k String str) {
        if (okRespDataSuccessElementsItemMessageSegmentsItem instanceof OkRespDataSuccessElementsItemMessageSegmentsItem.i) {
            return new com.avito.android.ai_assistant.adapter.user_message.b("user_message_".concat(str), ((OkRespDataSuccessElementsItemMessageSegmentsItem.i) okRespDataSuccessElementsItemMessageSegmentsItem).getAttributedText());
        }
        return null;
    }
}
