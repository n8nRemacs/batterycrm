package com.avito.android.virtual_deal_room_client_creation.clients;

import androidx.fragment.app.ActivityC22955m;
import com.avito.android.virtual_deal_room.deeplink.CreateClientDeeplink;
import com.avito.android.virtual_deal_room_client_creation.ClientCreationActivity;
import com.avito.android.virtual_deal_room_client_creation.clients.ClientsFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ClientsFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LPN0/a;", "it", "Lkotlin/G0;", "invoke", "(LPN0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.virtual_deal_room_client_creation.clients.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36091b extends N implements Y41.l<PN0.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ClientsFragment f326520l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36091b(ClientsFragment clientsFragment) {
        super(1);
        this.f326520l = clientsFragment;
    }

    @Override // Y41.l
    public final G0 invoke(PN0.a aVar) {
        CreateClientDeeplink.Result client;
        PN0.a aVar2 = aVar;
        ClientsFragment.a aVar3 = ClientsFragment.f326484s0;
        ClientsFragment clientsFragment = this.f326520l;
        if (aVar2 != null) {
            client = new CreateClientDeeplink.Result.Client(aVar2.f13057a, aVar2.f13059c, aVar2.f13060d);
        } else {
            client = CreateClientDeeplink.Result.Dismissed.f326442b;
        }
        ClientCreationActivity.a aVar4 = ClientCreationActivity.f326478m;
        ActivityC22955m activityC22955mRequireActivity = clientsFragment.requireActivity();
        aVar4.getClass();
        ClientCreationActivity.a.a(activityC22955mRequireActivity, client);
        return G0.f406611a;
    }
}
