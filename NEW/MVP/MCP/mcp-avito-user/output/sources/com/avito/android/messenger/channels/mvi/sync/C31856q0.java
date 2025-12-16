package com.avito.android.messenger.channels.mvi.sync;

import IY.a;
import io.reactivex.rxjava3.core.AbstractC41768a;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: LocalChannelEditor.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/q0;", "Lcom/avito/android/messenger/channels/mvi/sync/p0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.channels.mvi.sync.q0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31856q0 implements InterfaceC31854p0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.mvi.data.r f188528a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mvi.rx3.locks.j<IY.a> f188529b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.H f188530c;

    public C31856q0(@Y61.k com.avito.android.messenger.channels.mvi.data.r rVar, @Y61.k com.avito.android.mvi.rx3.locks.j<IY.a> jVar, @Y61.k io.reactivex.rxjava3.core.H h12) {
        this.f188528a = rVar;
        this.f188529b = jVar;
        this.f188530c = h12;
    }

    @Override // com.avito.android.messenger.channels.mvi.sync.InterfaceC31854p0
    @Y61.k
    public final AbstractC41768a e(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        AbstractC41768a abstractC41768aG = this.f188528a.g(str, messengerUserHashInfo);
        Set<? extends IY.a> setSingleton = Collections.singleton(new a.b(str));
        return new io.reactivex.rxjava3.internal.operators.completable.v(this.f188529b.t(abstractC41768aG.B(kotlin.G0.f406611a), "removeContextActions", setSingleton, this.f188530c));
    }
}
