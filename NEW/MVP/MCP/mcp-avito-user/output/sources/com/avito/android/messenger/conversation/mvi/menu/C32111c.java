package com.avito.android.messenger.conversation.mvi.menu;

import com.avito.android.messenger.conversation.mvi.menu.C32115g;
import com.avito.android.remote.model.messenger.Channel;
import kotlin.Metadata;
import kotlin.Q;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelMenuInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Lru/avito/messenger/MessengerUserHashInfo;", "Lcom/avito/android/remote/model/messenger/Channel;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.menu.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32111c<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32115g f191425b;

    public C32111c(C32115g c32115g) {
        this.f191425b = c32115g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.g
    public final void accept(Object obj) {
        Q q12 = (Q) obj;
        this.f191425b.le().s(new C32115g.b((MessengerUserHashInfo) q12.f406619b, (Channel) q12.f406620c));
    }
}
