package com.avito.android.messenger.conversation.mvi.menu;

import com.avito.android.messenger.conversation.mvi.menu.t;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ChannelMenuView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class v extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t.b f191546l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f191547m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(t.b bVar, int i12) {
        super(0);
        this.f191546l = bVar;
        this.f191547m = i12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f191546l.f191507c.invoke(Integer.valueOf(this.f191547m));
        return G0.f406611a;
    }
}
