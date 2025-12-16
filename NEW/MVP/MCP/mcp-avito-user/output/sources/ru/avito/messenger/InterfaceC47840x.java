package ru.avito.messenger;

import java.util.List;
import kotlin.Metadata;
import ru.avito.messenger.api.entity.BlockedUser;

/* compiled from: MessengerBlacklist.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/x;", "", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ru.avito.messenger.x, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC47840x {

    /* compiled from: MessengerBlacklist.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.avito.messenger.x$a */
    public static final class a {
    }

    @Y61.k
    io.reactivex.rxjava3.core.I<List<BlockedUser>> getBlacklist(int i12, @Y61.l Integer num);

    @Y61.k
    io.reactivex.rxjava3.core.I<kotlin.G0> p(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l Long l12, @Y61.l String str4);

    @Y61.k
    io.reactivex.rxjava3.core.I<Boolean> s(@Y61.k String str);
}
