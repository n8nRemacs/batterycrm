package com.avito.android.messenger.channels.mvi.sync;

import kotlin.Metadata;
import kotlin.text.C43066x;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelSyncAgent.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/avito/messenger/MessengerUserHashInfo;", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.channels.mvi.sync.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C31831e<T> implements l41.r {
    static {
        new C31831e();
    }

    @Override // l41.r
    public final boolean test(Object obj) {
        String str = ((MessengerUserHashInfo) obj).f430682d;
        return !(str == null || C43066x.K(str));
    }
}
