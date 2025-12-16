package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.messenger.message.MessageBody;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: MessageBodyTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/MessageBodyTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/remote/model/messenger/message/MessageBody;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MessageBodyTypeAdapter extends RuntimeTypeAdapter<MessageBody> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Map<String, Type> f254194a;

    public MessageBodyTypeAdapter() {
        super(null, null, MessageBody.Item.class, 3, null);
        this.f254194a = Collections.singletonMap("item", MessageBody.Item.class);
    }

    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @Y61.k
    public final Map<String, Type> getMapping() {
        return this.f254194a;
    }
}
