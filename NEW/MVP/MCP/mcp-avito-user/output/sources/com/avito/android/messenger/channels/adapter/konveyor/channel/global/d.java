package com.avito.android.messenger.channels.adapter.konveyor.channel.global;

import com.avito.android.messenger.channels.adapter.ChannelsListItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ChannelItemPresenterGlobal.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f186860l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ChannelsListItem.b f186861m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f186862n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, ChannelsListItem.b bVar, int i12) {
        super(0);
        this.f186860l = cVar;
        this.f186861m = bVar;
        this.f186862n = i12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f186860l.f186859b.get().b(this.f186861m, this.f186862n);
        return G0.f406611a;
    }
}
