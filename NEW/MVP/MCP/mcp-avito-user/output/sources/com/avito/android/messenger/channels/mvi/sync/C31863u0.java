package com.avito.android.messenger.channels.mvi.sync;

import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: LocallyDeletedChannelsSyncAgent.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "id", "Lkotlin/Q;", "Lru/avito/messenger/MessengerUserHashInfo;", "apply", "(Ljava/lang/String;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.channels.mvi.sync.u0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C31863u0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f188569b;

    public C31863u0(MessengerUserHashInfo messengerUserHashInfo) {
        this.f188569b = messengerUserHashInfo;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return new kotlin.Q((String) obj, this.f188569b);
    }
}
