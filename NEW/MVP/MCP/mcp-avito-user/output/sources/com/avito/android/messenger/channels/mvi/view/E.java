package com.avito.android.messenger.channels.mvi.view;

import HY.c;
import com.avito.android.messenger.channels.mvi.view.ChannelsListFragment;
import kotlin.G0;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelsListFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class E extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ChannelsListFragment f188649l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f188650m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f188651n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(ChannelsListFragment channelsListFragment, MessengerUserHashInfo messengerUserHashInfo, String str) {
        super(0);
        this.f188649l = channelsListFragment;
        this.f188650m = messengerUserHashInfo;
        this.f188651n = str;
    }

    @Override // Y41.a
    public final G0 invoke() {
        ChannelsListFragment.a aVar = ChannelsListFragment.f188628A0;
        this.f188649l.q5().accept(new c.b.h(this.f188651n, this.f188650m));
        return G0.f406611a;
    }
}
