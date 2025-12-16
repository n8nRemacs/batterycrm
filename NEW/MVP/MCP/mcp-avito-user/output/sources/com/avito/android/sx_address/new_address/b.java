package com.avito.android.sx_address.new_address;

import Y41.l;
import com.avito.android.sx_address.new_address.mvi.SxNewAddressMviState;
import com.avito.android.sx_address.new_address.view.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SxNewAddressFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviState;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class b extends N implements l<SxNewAddressMviState, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SxNewAddressFragment f293582l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SxNewAddressFragment sxNewAddressFragment) {
        super(1);
        this.f293582l = sxNewAddressFragment;
    }

    @Override // Y41.l
    public final G0 invoke(SxNewAddressMviState sxNewAddressMviState) {
        SxNewAddressMviState sxNewAddressMviState2 = sxNewAddressMviState;
        r rVar = this.f293582l.f293557v0;
        if (rVar != null) {
            rVar.e(sxNewAddressMviState2);
        }
        return G0.f406611a;
    }
}
