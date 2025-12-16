package com.avito.android.auto_loans_cabinet;

import Ke.InterfaceC14305a;
import androidx.compose.foundation.lazy.InterfaceC20793y;
import com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetState;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AutoLoanCabinetScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.auto_loans_cabinet.p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28711p extends kotlin.jvm.internal.N implements Y41.q<InterfaceC20793y, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AutoLoansCabinetState.BlanksState.Success f95512l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC14305a, G0> f95513m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C28711p(AutoLoansCabinetState.BlanksState.Success success, Y41.l<? super InterfaceC14305a, G0> lVar) {
        super(3);
        this.f95512l = success;
        this.f95513m = lVar;
    }

    @Override // Y41.q
    public final G0 invoke(InterfaceC20793y interfaceC20793y, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            C28710o.b(this.f95512l.getF95453b(), this.f95513m, a13, 0);
        }
        return G0.f406611a;
    }
}
