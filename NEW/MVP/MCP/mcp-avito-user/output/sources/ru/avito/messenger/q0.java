package ru.avito.messenger;

import java.util.List;
import kotlin.Metadata;
import ru.avito.messenger.api.entity.UserLastActivity;

/* compiled from: MessengerUserProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/q0;", "", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface q0 {

    /* compiled from: MessengerUserProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    io.reactivex.rxjava3.core.I r(@Y61.k String str, @Y61.k List list, @Y61.l Y41.a aVar);

    @Y61.k
    io.reactivex.rxjava3.core.I<List<UserLastActivity>> u(@Y61.k List<String> list);
}
