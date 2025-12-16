package com.avito.android.home.bottom_navigation;

import com.avito.android.bottom_navigation.J;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: BottomNavigationViewModel.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/passport_lib/u;", "", "<name for destructuring parameter 0>", "Lkotlin/G0;", "invoke", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class D extends N implements Y41.l<Q<? extends com.avito.android.passport_lib.u, ? extends Boolean>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ F f162310l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(F f12) {
        super(1);
        this.f162310l = f12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(Q<? extends com.avito.android.passport_lib.u, ? extends Boolean> q12) {
        Q<? extends com.avito.android.passport_lib.u, ? extends Boolean> q13 = q12;
        com.avito.android.passport_lib.u uVar = (com.avito.android.passport_lib.u) q13.f406619b;
        boolean zBooleanValue = ((Boolean) q13.f406620c).booleanValue();
        this.f162310l.f162319P.setValue(uVar.f213947a ? new J.b(zBooleanValue, uVar.f213948b) : new J.a(zBooleanValue));
        return G0.f406611a;
    }
}
