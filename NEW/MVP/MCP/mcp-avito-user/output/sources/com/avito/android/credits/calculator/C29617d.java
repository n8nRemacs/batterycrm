package com.avito.android.credits.calculator;

import com.avito.android.lib.design.input.Input;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoLoansCreditCalculatorView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "selectedTerms", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.credits.calculator.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29617d extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C29615b f128673l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29617d(C29615b c29615b) {
        super(1);
        this.f128673l = c29615b;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        C29615b c29615b = this.f128673l;
        c29615b.f128671w = iIntValue;
        String strB80 = c29615b.B80(iIntValue, true);
        Input.c cVar = Input.f179303W;
        c29615b.f128669u.u(true, strB80);
        com.avito.android.credits.p pVar = c29615b.f128709k;
        if (pVar != null) {
            pVar.z2(iIntValue);
        }
        return G0.f406611a;
    }
}
