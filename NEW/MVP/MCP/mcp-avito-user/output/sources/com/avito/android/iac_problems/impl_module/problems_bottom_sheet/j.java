package com.avito.android.iac_problems.impl_module.problems_bottom_sheet;

import com.avito.android.iac_problems.impl_module.problems_bottom_sheet.IacProblemsBottomSheetFragment;
import com.avito.android.iac_util_deeplinks.public_module.SetFlowResultLink;
import com.avito.android.util.V2;
import eM.InterfaceC40021a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kv.C43501a;

/* compiled from: IacProblemsBottomSheetFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "invoke", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class j extends N implements Y41.l<C43501a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f168901l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ IacProblemsBottomSheetFragment f168902m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, IacProblemsBottomSheetFragment iacProblemsBottomSheetFragment) {
        super(1);
        this.f168901l = str;
        this.f168902m = iacProblemsBottomSheetFragment;
    }

    @Override // Y41.l
    public final G0 invoke(C43501a c43501a) {
        SetFlowResultLink.b bVar = (SetFlowResultLink.b) c43501a.f413261b;
        V2 v22 = V2.f318762a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f168901l);
        sb2.append(" finished, flowResultKey=");
        String str = bVar.f169287b;
        sb2.append(str);
        v22.c("IacProblemsBottomSheetFragment", sb2.toString(), null);
        if (L.f(str, "flowResultKeyFinished")) {
            IacProblemsBottomSheetFragment.a aVar = IacProblemsBottomSheetFragment.f168849t0;
            ((l) this.f168902m.f168852i0.getValue()).accept(InterfaceC40021a.c.f395118a);
        } else {
            L.f(str, "flowResultKeyRoutedToSettings");
        }
        return G0.f406611a;
    }
}
