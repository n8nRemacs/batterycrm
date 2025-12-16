package ru.avito.messenger;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.avito.messenger.api.entity.Image;
import ru.avito.messenger.api.entity.body.item.BodyItem;

/* compiled from: MessengerHistory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/Z;", "", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface Z {

    /* compiled from: MessengerHistory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    io.reactivex.rxjava3.core.I<Map<String, Image>> getBodyImages(@Y61.k Collection<String> collection);

    @Y61.k
    io.reactivex.rxjava3.core.I<List<BodyItem>> getBodyItems(@Y61.k List<String> list);

    @Y61.k
    io.reactivex.rxjava3.core.I<kotlin.G0> markChannelsAsUnread(@Y61.k List<String> list);

    @Y61.k
    io.reactivex.rxjava3.core.I t(@Y61.l Y41.a aVar, @Y61.k List list);

    @Y61.k
    io.reactivex.rxjava3.core.I<String> v(@Y61.k String str);

    @Y61.k
    io.reactivex.rxjava3.core.I x(@Y61.k String str, @Y61.l Long l12, @Y61.l Integer num, @Y61.l Y41.a aVar);
}
