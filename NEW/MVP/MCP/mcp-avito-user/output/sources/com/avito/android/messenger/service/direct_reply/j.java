package com.avito.android.messenger.service.direct_reply;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.H;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.app.task.C28567j1;
import com.avito.android.remote.model.messenger.MessengerTimestamp;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import io.reactivex.rxjava3.internal.operators.completable.K;
import io.reactivex.rxjava3.internal.operators.completable.M;
import io.reactivex.rxjava3.internal.operators.completable.v;
import javax.inject.Inject;
import kotlin.Metadata;
import ru.avito.messenger.MessengerApi;
import ru.avito.messenger.api.entity.ChatMessage;

/* compiled from: DirectReplyServiceInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/service/direct_reply/j;", "Lcom/avito/android/messenger/service/direct_reply/h;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final MessengerApi f197242a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.h f197243b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f197244c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f197245d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final H f197246e;

    @Inject
    public j(@Y61.k MessengerApi messengerApi, @Y61.k com.avito.android.server_time.h hVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k H h12) {
        this.f197242a = messengerApi;
        this.f197243b = hVar;
        this.f197244c = interfaceC35745a5;
        this.f197245d = interfaceC28373a;
        this.f197246e = h12;
    }

    @Override // com.avito.android.messenger.service.direct_reply.h
    @Y61.k
    public final M a(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, boolean z12) {
        long jFromMillis = MessengerTimestamp.INSTANCE.fromMillis(this.f197243b.now());
        C41826q c41826q = new C41826q(new C28567j1(4, this, str, str3));
        I<ChatMessage> iSendTextMessage = this.f197242a.sendTextMessage(str, str3, str2, null, null, null, null, null);
        iSendTextMessage.getClass();
        K k12 = c41826q.g(new v(iSendTextMessage)).k(new i(this, z12, str, str3));
        I<Boolean> iMarkChannelAsRead = this.f197242a.markChannelAsRead(str, jFromMillis);
        iMarkChannelAsRead.getClass();
        io.reactivex.rxjava3.internal.operators.completable.I iR2 = new v(iMarkChannelAsRead).r();
        InterfaceC35745a5 interfaceC35745a5 = this.f197244c;
        return k12.g(iR2.x(interfaceC35745a5.a())).x(interfaceC35745a5.a());
    }
}
