package com.avito.android.virtual_deal_room_client_creation.create;

import androidx.fragment.app.ActivityC22955m;
import com.avito.android.virtual_deal_room.deeplink.CreateClientDeeplink;
import com.avito.android.virtual_deal_room_client_creation.ClientCreationActivity;
import com.avito.android.virtual_deal_room_client_creation.create.CreateFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CreateFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LPN0/a;", "it", "Lkotlin/G0;", "invoke", "(LPN0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.virtual_deal_room_client_creation.create.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36104c extends N implements Y41.l<PN0.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CreateFragment f326760l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36104c(CreateFragment createFragment) {
        super(1);
        this.f326760l = createFragment;
    }

    @Override // Y41.l
    public final G0 invoke(PN0.a aVar) {
        G0 g02;
        PN0.a aVar2 = aVar;
        CreateFragment.a aVar3 = CreateFragment.f326712s0;
        CreateFragment createFragment = this.f326760l;
        if (aVar2 != null) {
            CreateClientDeeplink.Result.Client client = new CreateClientDeeplink.Result.Client(aVar2.f13057a, aVar2.f13059c, aVar2.f13060d);
            ClientCreationActivity.a aVar4 = ClientCreationActivity.f326478m;
            ActivityC22955m activityC22955mRequireActivity = createFragment.requireActivity();
            aVar4.getClass();
            ClientCreationActivity.a.a(activityC22955mRequireActivity, client);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            createFragment.getParentFragmentManager().Y();
        }
        return G0.f406611a;
    }
}
