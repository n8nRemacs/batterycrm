package com.avito.android.virtual_deal_room_reference_category.deeplink;

import androidx.fragment.app.DialogFragment;
import com.avito.android.virtual_deal_room_reference_category.client_add.ClientAddDialogFragment;
import com.avito.android.virtual_deal_room_reference_category.client_add.model.ClientAddArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ClientAddDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/fragment/app/DialogFragment;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class a extends N implements Y41.a<DialogFragment> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ClientAddDeeplink f327207l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ClientAddDeeplink clientAddDeeplink) {
        super(0);
        this.f327207l = clientAddDeeplink;
    }

    @Override // Y41.a
    public final DialogFragment invoke() {
        ClientAddDialogFragment.a aVar = ClientAddDialogFragment.f327120n0;
        ClientAddArguments clientAddArguments = new ClientAddArguments(this.f327207l.f327206b);
        aVar.getClass();
        return ClientAddDialogFragment.a.a(clientAddArguments);
    }
}
