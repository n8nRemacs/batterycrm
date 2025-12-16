package com.avito.android.auto_select.deeplink;

import com.avito.android.auto_select.confirmation_dialog.AutoSelectConfirmationBottomSheetFragment;
import com.avito.android.deep_linking.links.AutoSelectConfirmationLink;
import com.avito.android.deep_linking.links.AutoSelectContactConfirmation;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoSelectConfirmationLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f96046l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AutoSelectConfirmationLink f96047m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, AutoSelectConfirmationLink autoSelectConfirmationLink) {
        super(0);
        this.f96046l = iVar;
        this.f96047m = autoSelectConfirmationLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        i iVar = this.f96046l;
        AutoSelectConfirmationBottomSheetFragment.a aVar = AutoSelectConfirmationBottomSheetFragment.f95853n0;
        AutoSelectContactConfirmation autoSelectContactConfirmation = this.f96047m.f133032b;
        aVar.getClass();
        AutoSelectConfirmationBottomSheetFragment autoSelectConfirmationBottomSheetFragment = new AutoSelectConfirmationBottomSheetFragment();
        autoSelectConfirmationBottomSheetFragment.f95858k0.setValue(autoSelectConfirmationBottomSheetFragment, AutoSelectConfirmationBottomSheetFragment.f95854o0[0], autoSelectContactConfirmation);
        iVar.f96048f.w1(autoSelectConfirmationBottomSheetFragment, "AutoSelectConfirmationBottomSheet");
        return G0.f406611a;
    }
}
