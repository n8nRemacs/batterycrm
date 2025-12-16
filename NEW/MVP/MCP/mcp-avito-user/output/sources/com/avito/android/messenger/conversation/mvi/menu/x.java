package com.avito.android.messenger.conversation.mvi.menu;

import com.avito.android.deep_linking.links.DeleteChannelLink;
import com.avito.android.messenger.conversation.mvi.menu.t;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelMenuView.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class x extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u f191549l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t.c f191550m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(u uVar, t.c cVar) {
        super(0);
        this.f191549l = uVar;
        this.f191550m = cVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f191549l.f191538f.accept(((DeleteChannelLink) this.f191550m.f191515f).f133176b);
        return G0.f406611a;
    }
}
