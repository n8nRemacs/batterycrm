package com.avito.android.auto_loans_cabinet;

import Ke.InterfaceC14305a;
import androidx.compose.runtime.C22066f2;
import com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetState;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AutoLoanCabinetScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class t extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AutoLoansCabinetState.BlanksState.Success f95518l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC14305a, G0> f95519m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f95520n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(AutoLoansCabinetState.BlanksState.Success success, Y41.l<? super InterfaceC14305a, G0> lVar, int i12) {
        super(2);
        this.f95518l = success;
        this.f95519m = lVar;
        this.f95520n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f95520n | 1);
        C28710o.f(this.f95518l, this.f95519m, a12, iA2);
        return G0.f406611a;
    }
}
