package com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet;

import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.IacEnableBottomSheetFragment;
import com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.mvi.entity.IacEnableBottomSheetState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import vb0.InterfaceC49294a;

/* compiled from: IacEnableBottomSheetFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ IacEnableBottomSheetFragment f227776l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f227777m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(IacEnableBottomSheetFragment iacEnableBottomSheetFragment, InterfaceC22204y1 interfaceC22204y1) {
        super(0);
        this.f227776l = iacEnableBottomSheetFragment;
        this.f227777m = interfaceC22204y1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.a
    public final G0 invoke() {
        IacEnableBottomSheetFragment.a aVar = IacEnableBottomSheetFragment.f227749o0;
        this.f227776l.f5().accept(new InterfaceC49294a.C12782a(!((IacEnableBottomSheetState) this.f227777m.getF42167b()).f227843c));
        return G0.f406611a;
    }
}
