package com.avito.android.messenger.channels.mvi.view;

import HY.c;
import com.avito.android.messenger.channels.adapter.ChannelsListItem;
import com.avito.android.messenger.channels.mvi.list_feature.o1;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ChannelsListFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/ChannelsListItem$b;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/messenger/channels/adapter/ChannelsListItem$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.channels.mvi.view.u, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C31891u extends kotlin.jvm.internal.N implements Y41.l<ChannelsListItem.b, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o1 f188840l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31891u(o1 o1Var) {
        super(1);
        this.f188840l = o1Var;
    }

    @Override // Y41.l
    public final G0 invoke(ChannelsListItem.b bVar) {
        ChannelsListItem.b bVar2 = bVar;
        this.f188840l.accept(new c.b.d(bVar2.f186789d, bVar2.f186790e));
        return G0.f406611a;
    }
}
