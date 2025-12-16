package com.avito.android.virtual_deal_room_client_creation.clients;

import com.avito.android.virtual_deal_room_client_creation.clients.ClientsFragment;
import com.avito.android.virtual_deal_room_client_creation.create.CreateFragment;
import com.avito.android.virtual_deal_room_client_creation.create.model.CreateArguments;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ClientsFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.virtual_deal_room_client_creation.clients.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36092c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ClientsFragment f326521l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36092c(ClientsFragment clientsFragment) {
        super(0);
        this.f326521l = clientsFragment;
    }

    @Override // Y41.a
    public final G0 invoke() {
        ClientsFragment.a aVar = ClientsFragment.f326484s0;
        ClientsFragment clientsFragment = this.f326521l;
        androidx.fragment.app.H hE2 = clientsFragment.getParentFragmentManager().e();
        int iL1 = ((com.avito.android.ui.activity.a) clientsFragment.requireActivity()).L1();
        CreateFragment.a aVar2 = CreateFragment.f326712s0;
        CreateArguments createArguments = new CreateArguments();
        aVar2.getClass();
        hE2.n(iL1, CreateFragment.a.a(createArguments), null);
        hE2.c(null);
        hE2.e();
        return G0.f406611a;
    }
}
