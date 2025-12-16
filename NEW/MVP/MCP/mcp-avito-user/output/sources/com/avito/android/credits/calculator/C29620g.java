package com.avito.android.credits.calculator;

import com.avito.android.lib.design.input.Input;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CashLoansCalculatorView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "selectedTerms", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.credits.calculator.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29620g extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C29621h f128675l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29620g(C29621h c29621h) {
        super(1);
        this.f128675l = c29621h;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        C29621h c29621h = this.f128675l;
        c29621h.f128682v = iIntValue;
        String strB80 = c29621h.B80(iIntValue, true);
        Input.c cVar = Input.f179303W;
        c29621h.f128681u.u(true, strB80);
        com.avito.android.credits.p pVar = c29621h.f128709k;
        if (pVar != null) {
            pVar.z2(iIntValue);
        }
        return G0.f406611a;
    }
}
