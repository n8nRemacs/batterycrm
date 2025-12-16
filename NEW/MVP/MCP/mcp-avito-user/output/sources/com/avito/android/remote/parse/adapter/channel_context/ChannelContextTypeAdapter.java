package com.avito.android.remote.parse.adapter.channel_context;

import Y61.k;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapter;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ChannelContextTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/channel_context/ChannelContextTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/remote/model/messenger/context/ChannelContext;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ChannelContextTypeAdapter extends RuntimeTypeAdapter<ChannelContext> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f254263a;

    public ChannelContextTypeAdapter() {
        super(null, null, ChannelContext.Unknown.class, 3, null);
        this.f254263a = P0.g(new Q("item", ChannelContext.Item.class), new Q(ChannelContext.UserToUser.TYPE, ChannelContext.UserToUser.class), new Q(ChannelContext.System.TYPE, ChannelContext.System.class), new Q(ChannelContext.ReDeal.TYPE, ChannelContext.ReDeal.class));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.reflect.Type>] */
    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @k
    public final Map<String, Type> getMapping() {
        return this.f254263a;
    }
}
