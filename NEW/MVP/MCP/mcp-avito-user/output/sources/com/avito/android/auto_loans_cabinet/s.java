package com.avito.android.auto_loans_cabinet;

import Ke.InterfaceC14305a;
import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetState;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AutoLoanCabinetScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class s extends kotlin.jvm.internal.N implements Y41.l<m0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AutoLoansCabinetState.BlanksState.Success f95516l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC14305a, G0> f95517m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(AutoLoansCabinetState.BlanksState.Success success, Y41.l<? super InterfaceC14305a, G0> lVar) {
        super(1);
        this.f95516l = success;
        this.f95517m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(m0 m0Var) {
        m0 m0Var2 = m0Var;
        Y41.l<InterfaceC14305a, G0> lVar = this.f95517m;
        AutoLoansCabinetState.BlanksState.Success success = this.f95516l;
        m0Var2.c(null, null, new C22096n(1957697381, new C28711p(success, lVar), true));
        O.f95326a.getClass();
        m0Var2.c(null, null, O.f95328c);
        ArrayList arrayList = success.getF95454c().f95487b;
        m0Var2.a(arrayList.size(), null, new x(v.f95524l, arrayList), new C22096n(-632812321, new y(lVar, arrayList), true));
        m0Var2.c(null, null, O.f95329d);
        m0Var2.c(null, null, new C22096n(-1836805556, new r(lVar), true));
        m0Var2.c(null, null, O.f95330e);
        return G0.f406611a;
    }
}
