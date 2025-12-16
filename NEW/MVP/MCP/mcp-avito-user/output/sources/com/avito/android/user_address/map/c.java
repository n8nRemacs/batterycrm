package com.avito.android.user_address.map;

import Y41.l;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.user_address.map.mvi.UserAddressAddNewAddressMviState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UserAddressMapFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/user_address/map/mvi/UserAddressAddNewAddressMviState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/user_address/map/mvi/UserAddressAddNewAddressMviState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class c extends N implements l<UserAddressAddNewAddressMviState, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UserAddressMapFragment f307514l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(UserAddressMapFragment userAddressMapFragment) {
        super(1);
        this.f307514l = userAddressMapFragment;
    }

    @Override // Y41.l
    public final G0 invoke(UserAddressAddNewAddressMviState userAddressAddNewAddressMviState) {
        UserAddressAddNewAddressMviState userAddressAddNewAddressMviState2 = userAddressAddNewAddressMviState;
        com.avito.android.user_address.map.view.d dVar = this.f307514l.f307499x0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.a(userAddressAddNewAddressMviState2);
        return G0.f406611a;
    }
}
