package com.avito.android.messenger.conversation.create;

import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.channels.mvi.data.M;
import com.avito.android.messenger.channels.mvi.data.Y;
import com.avito.android.messenger.channels.mvi.sync.ChannelSyncAgent;
import com.avito.android.messenger.conversation.ChannelActivityArguments;
import com.avito.android.messenger.conversation.create.c;
import com.avito.android.messenger.w0;
import com.avito.android.messenger.x0;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.maybe.H;
import io.reactivex.rxjava3.internal.operators.observable.S;
import io.reactivex.rxjava3.internal.operators.single.U;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CreateChannelInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/create/l;", "Lcom/avito/android/messenger/conversation/create/c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class l implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final w0 f189579a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f189580b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final M f189581c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ChannelSyncAgent f189582d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y f189583e;

    @Inject
    public l(@Y61.k w0 w0Var, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k M m12, @Y61.k ChannelSyncAgent channelSyncAgent, @Y61.k Y y12) {
        this.f189579a = w0Var;
        this.f189580b = interfaceC35745a5;
        this.f189581c = m12;
        this.f189582d = channelSyncAgent;
        this.f189583e = y12;
    }

    @Override // com.avito.android.messenger.conversation.create.c
    @Y61.k
    public final U j(@Y61.k ChannelActivityArguments.Create create) {
        return new H(new S(this.f189579a.g()).g(new x0()).k(this.f189580b.c()), new e(this, create)).r().v(c.a.AbstractC5587a.C5588a.f189521a);
    }
}
