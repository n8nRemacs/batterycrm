package ru.avito.messenger;

import java.util.UUID;
import kotlin.Metadata;

/* compiled from: RequestId.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/avito/messenger/A0;", "Lru/avito/messenger/z0;", "Lru/avito/messenger/y0;", "<init>", "()V", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class A0 implements z0, y0 {
    @Override // ru.avito.messenger.y0
    @Y61.k
    public final String a() {
        String string = UUID.randomUUID().toString();
        synchronized (this) {
        }
        return string;
    }
}
