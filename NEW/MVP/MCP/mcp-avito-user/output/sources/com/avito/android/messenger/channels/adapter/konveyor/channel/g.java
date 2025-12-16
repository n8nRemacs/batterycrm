package com.avito.android.messenger.channels.adapter.konveyor.channel;

import com.avito.android.messenger.channels.adapter.ChannelsListItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ChannelItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isPinned", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class g extends N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f186849l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ChannelsListItem.b f186850m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c cVar, ChannelsListItem.b bVar) {
        super(1);
        this.f186849l = cVar;
        this.f186850m = bVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        this.f186849l.f186840b.get().e(this.f186850m, bool.booleanValue());
        return G0.f406611a;
    }
}
