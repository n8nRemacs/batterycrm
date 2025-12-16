package com.avito.android.fees_methods.screen.fees_by_package.ui.compose;

import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.fees_methods.screen.fees_by_package.mvi.entity.FeesByPackageState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FeesByPackageScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class d extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ FeesByPackageState f158095l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f158096m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FeesByPackageState feesByPackageState, InterfaceC22204y1 interfaceC22204y1) {
        super(2);
        this.f158095l = feesByPackageState;
        this.f158096m = interfaceC22204y1;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            FeesByPackageState feesByPackageState = this.f158095l;
            com.avito.android.fees_methods.screen.fees_by_package.ui.compose.items.m.a(feesByPackageState.f158034j, feesByPackageState.f158035k, (Y41.l) this.f158096m.getF42167b(), feesByPackageState.f158028d, a13, 64);
        }
        return G0.f406611a;
    }
}
