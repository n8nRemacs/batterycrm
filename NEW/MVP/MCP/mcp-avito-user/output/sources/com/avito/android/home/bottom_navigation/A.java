package com.avito.android.home.bottom_navigation;

import com.avito.android.bottom_navigation.J;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BottomNavigationViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/passport_lib/u;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/passport_lib/u;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class A extends N implements Y41.l<com.avito.android.passport_lib.u, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ F f162241l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(F f12) {
        super(1);
        this.f162241l = f12;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.passport_lib.u uVar) {
        com.avito.android.passport_lib.u uVar2 = uVar;
        this.f162241l.f162319P.setValue(uVar2.f213947a ? new J.b(false, uVar2.f213948b) : new J.a(false));
        return G0.f406611a;
    }
}
