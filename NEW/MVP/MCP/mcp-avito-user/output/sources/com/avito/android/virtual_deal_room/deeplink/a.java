package com.avito.android.virtual_deal_room.deeplink;

import androidx.fragment.app.DialogFragment;
import com.avito.android.virtual_deal_room.client_edit.ClientEditDialogFragment;
import com.avito.android.virtual_deal_room.client_edit.model.ClientEditArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ClientEditDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/fragment/app/DialogFragment;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class a extends N implements Y41.a<DialogFragment> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ClientEditDeeplink f326443l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ClientEditDeeplink clientEditDeeplink, b bVar) {
        super(0);
        this.f326443l = clientEditDeeplink;
    }

    @Override // Y41.a
    public final DialogFragment invoke() {
        ClientEditDialogFragment.a aVar = ClientEditDialogFragment.f326105o0;
        ClientEditDeeplink clientEditDeeplink = this.f326443l;
        String str = clientEditDeeplink.f326421b;
        StringBuilder sb2 = new StringBuilder();
        String str2 = clientEditDeeplink.f326425f;
        int length = str2.length();
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = str2.charAt(i12);
            if (Character.isDigit(cCharAt) || cCharAt == '+') {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        ClientEditArguments clientEditArguments = new ClientEditArguments(str, clientEditDeeplink.f326422c, clientEditDeeplink.f326423d, clientEditDeeplink.f326424e, string, clientEditDeeplink.f326426g, "vdr_mobile_clients_list");
        aVar.getClass();
        return ClientEditDialogFragment.a.a(clientEditArguments);
    }
}
