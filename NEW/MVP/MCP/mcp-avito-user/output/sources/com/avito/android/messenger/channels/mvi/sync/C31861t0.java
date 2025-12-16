package com.avito.android.messenger.channels.mvi.sync;

import java.util.List;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: LocallyDeletedChannelsSyncAgent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "ids", "Lkotlin/Q;", "Lru/avito/messenger/MessengerUserHashInfo;", "apply", "(Ljava/util/List;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.channels.mvi.sync.t0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C31861t0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f188566b;

    public C31861t0(MessengerUserHashInfo messengerUserHashInfo) {
        this.f188566b = messengerUserHashInfo;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return new kotlin.Q((List) obj, this.f188566b);
    }
}
