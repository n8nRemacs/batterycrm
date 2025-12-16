package com.avito.android.virtual_deal_room.client_room;

import android.os.Bundle;
import com.avito.android.virtual_deal_room.client_room.model.ClientRoomArguments;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ClientRoomFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class b extends N implements Y41.l<Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ClientRoomArguments f326263l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ClientRoomArguments clientRoomArguments) {
        super(1);
        this.f326263l = clientRoomArguments;
    }

    @Override // Y41.l
    public final G0 invoke(Bundle bundle) {
        bundle.putParcelable("category_arguments", this.f326263l);
        return G0.f406611a;
    }
}
