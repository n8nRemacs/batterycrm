package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.messenger.conversation.mvi.sync.C32275m;
import com.avito.android.remote.model.messenger.message.MessageBody;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: MessageAndQuoteBodyResolver.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "descriptions", "", "Lcom/avito/android/messenger/conversation/mvi/sync/m$b;", "apply", "(Ljava/util/Map;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class C<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<C32275m.a> f194582b;

    public C(List<C32275m.a> list) {
        this.f194582b = list;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Map map = (Map) obj;
        List<C32275m.a> list = this.f194582b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (C32275m.a aVar : list) {
            MessageBody.Unknown unknown = (MessageBody.Unknown) aVar.f194813c;
            String str = (String) map.get(unknown.getType());
            arrayList.add((str == null || str.length() == 0) ? aVar.a() : aVar.b(unknown.withFallbackText(str)));
        }
        return arrayList;
    }
}
