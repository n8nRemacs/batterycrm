package com.avito.android.messenger.channels.mvi.data;

import com.avito.android.persistence.messenger.UserEntityType;
import com.avito.android.persistence.messenger.c3;
import com.avito.android.remote.model.User;
import com.avito.android.remote.model.messenger.PublicProfile;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: UserEntityConverter.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/data/d0;", "Lcom/avito/android/messenger/channels/mvi/data/c0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d0 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31706n f187214a;

    @Inject
    public d0(@Y61.k InterfaceC31706n interfaceC31706n) {
        this.f187214a = interfaceC31706n;
    }

    @Override // com.avito.android.messenger.channels.mvi.data.c0
    @Y61.k
    public final c3 a(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k User user) {
        UserEntityType userEntityTypeG = com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c);
        String id2 = user.getId();
        String name = user.getName();
        Long lastActionTime = user.getLastActionTime();
        Long timeDiff = user.getTimeDiff();
        PublicProfile publicProfile = user.getPublicProfile();
        return new c3(messengerUserHashInfo.f430682d, id2, str, name, user.getLabel(), lastActionTime, timeDiff, publicProfile != null ? this.f187214a.b(PublicProfile.class, publicProfile) : null, userEntityTypeG);
    }

    @Override // com.avito.android.messenger.channels.mvi.data.c0
    @Y61.k
    public final User b(@Y61.k c3 c3Var) {
        String str = c3Var.f215427h;
        return new User(c3Var.f215421b, c3Var.f215423d, c3Var.f215425f, c3Var.f215426g, str != null ? (PublicProfile) this.f187214a.a(PublicProfile.class, str) : null, c3Var.f215424e);
    }
}
