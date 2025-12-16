package com.avito.android.messenger.channels.mvi.view;

import HY.c;
import com.avito.android.messenger.channels.adapter.ChannelsListItem;
import com.avito.android.messenger.channels.mvi.list_feature.o1;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ChannelsListFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/ChannelsListItem$b;", "item", "", "isPinned", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/messenger/channels/adapter/ChannelsListItem$b;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.channels.mvi.view.w, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C31893w extends kotlin.jvm.internal.N implements Y41.p<ChannelsListItem.b, Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o1 f188842l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31893w(o1 o1Var) {
        super(2);
        this.f188842l = o1Var;
    }

    @Override // Y41.p
    public final G0 invoke(ChannelsListItem.b bVar, Boolean bool) {
        this.f188842l.accept(new c.b.i(bVar, bool.booleanValue()));
        return G0.f406611a;
    }
}
