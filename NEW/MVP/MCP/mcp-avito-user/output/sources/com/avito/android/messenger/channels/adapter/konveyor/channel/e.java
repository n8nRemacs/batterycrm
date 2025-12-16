package com.avito.android.messenger.channels.adapter.konveyor.channel;

import com.avito.android.messenger.channels.adapter.ChannelsListItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ChannelItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f186845l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ChannelsListItem.b f186846m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, ChannelsListItem.b bVar) {
        super(0);
        this.f186845l = cVar;
        this.f186846m = bVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f186845l.f186840b.get().c(this.f186846m);
        return G0.f406611a;
    }
}
