package com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_remote;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.B;
import com.avito.android.messenger.conversation.mvi.data.g0;
import io.reactivex.rxjava3.internal.operators.single.A;
import javax.inject.Inject;
import kotlin.Metadata;
import ru.avito.messenger.InterfaceC47842z;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: DeleteRemoteMessageInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/elements/delete_remote/g;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/elements/delete_remote/e;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC47842z f191692a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final B f191693b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g0 f191694c;

    @Inject
    public g(@k InterfaceC47842z interfaceC47842z, @k B b12, @k g0 g0Var) {
        this.f191692a = interfaceC47842z;
        this.f191693b = b12;
        this.f191694c = g0Var;
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_remote.e
    @k
    public final A a(@k String str, @k String str2, @k MessengerUserHashInfo messengerUserHashInfo) {
        return (A) this.f191692a.deleteMessage(str, str2).o(new f(this, messengerUserHashInfo));
    }
}
