package com.avito.android.comfortable_deal.clients;

import com.avito.android.comfortable_deal.clients.ClientsFragment;
import kotlin.G0;
import kotlin.Metadata;
import kp.InterfaceC43475a;

/* compiled from: ClientsFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.comfortable_deal.clients.l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29436l extends kotlin.jvm.internal.N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ClientsFragment f120256l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29436l(ClientsFragment clientsFragment) {
        super(1);
        this.f120256l = clientsFragment;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        ClientsFragment.a aVar = ClientsFragment.f120092u0;
        this.f120256l.r5().accept(new InterfaceC43475a.d(zBooleanValue));
        return G0.f406611a;
    }
}
