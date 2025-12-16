package com.avito.android.messenger.conversation.create;

import com.avito.android.messenger.conversation.ChannelActivityArguments;
import io.reactivex.rxjava3.internal.operators.single.O;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: CreateChannelInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo;", "kotlin.jvm.PlatformType", "userInfo", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/messenger/conversation/create/c$a;", "apply", "(Lru/avito/messenger/MessengerUserHashInfo;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class e<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f189568b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ChannelActivityArguments.Create f189569c;

    public e(l lVar, ChannelActivityArguments.Create create) {
        this.f189568b = lVar;
        this.f189569c = create;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        O oR2;
        MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) obj;
        ChannelActivityArguments.Create create = this.f189569c;
        boolean z12 = create instanceof ChannelActivityArguments.Create.ByItem;
        l lVar = this.f189568b;
        if (z12) {
            ChannelActivityArguments.Create.ByItem byItem = (ChannelActivityArguments.Create.ByItem) create;
            String str = byItem.f188883b;
            oR2 = lVar.f189582d.a(messengerUserHashInfo, str, byItem.f188885d, byItem.f188887f, byItem.f188888g).s(lVar.f189580b.c()).r(f.f189570b).r(new g(lVar, messengerUserHashInfo, create));
        } else if (create instanceof ChannelActivityArguments.Create.ByOpponentUser) {
            oR2 = lVar.f189582d.f(((ChannelActivityArguments.Create.ByOpponentUser) create).f188890b, messengerUserHashInfo).s(lVar.f189580b.c()).r(j.f189577b).r(new h(lVar, messengerUserHashInfo, create));
        } else {
            if (!(create instanceof ChannelActivityArguments.Create.WithAvito)) {
                throw new NoWhenBranchMatchedException();
            }
            ChannelActivityArguments.Create.WithAvito withAvito = (ChannelActivityArguments.Create.WithAvito) create;
            oR2 = lVar.f189582d.g(messengerUserHashInfo, withAvito.f188893b, withAvito.f188894c, withAvito.f188895d).s(lVar.f189580b.c()).r(d.f189526b);
        }
        return oR2.u(new i());
    }
}
