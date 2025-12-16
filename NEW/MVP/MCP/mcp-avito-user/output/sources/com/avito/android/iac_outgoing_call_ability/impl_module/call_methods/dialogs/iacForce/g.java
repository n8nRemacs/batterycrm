package com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.iacForce;

import com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.IacCallMethodsDialogFragmentResult;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacForceCallMethodsDialogFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ IacForceCallMethodsDialogFragment f168494l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f168495m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(IacForceCallMethodsDialogFragment iacForceCallMethodsDialogFragment, com.avito.android.lib.design.bottom_sheet.d dVar) {
        super(0);
        this.f168494l = iacForceCallMethodsDialogFragment;
        this.f168495m = dVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        IacForceCallMethodsDialogFragment iacForceCallMethodsDialogFragment = this.f168494l;
        iacForceCallMethodsDialogFragment.h5((String) iacForceCallMethodsDialogFragment.f168473m0.getValue(), new IacCallMethodsDialogFragmentResult.OnInAppCallMethodSelected(iacForceCallMethodsDialogFragment.g5(), true));
        this.f168495m.dismiss();
        return G0.f406611a;
    }
}
