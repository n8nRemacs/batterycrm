package com.avito.android.messenger.blacklist.mvi;

import com.avito.android.messenger.blacklist.mvi.C31686p;
import kotlin.Metadata;
import ru.avito.messenger.api.entity.BlockedUser;

/* compiled from: BlacklistInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "blockedUser", "Lru/avito/messenger/api/entity/BlockedUser;", "invoke", "(Lru/avito/messenger/api/entity/BlockedUser;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class w extends kotlin.jvm.internal.N implements Y41.l<BlockedUser, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C31686p.h f186527l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(C31686p.h hVar) {
        super(1);
        this.f186527l = hVar;
    }

    @Override // Y41.l
    public final Boolean invoke(BlockedUser blockedUser) {
        return Boolean.valueOf(kotlin.jvm.internal.L.f(blockedUser.getUser().getId(), this.f186527l.f186507d));
    }
}
