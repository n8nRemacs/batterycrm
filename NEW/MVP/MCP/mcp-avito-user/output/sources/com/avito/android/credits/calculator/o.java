package com.avito.android.credits.calculator;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: CreditCalculatorView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isOpened", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class o extends N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.a f128694l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l0.a f128695m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q f128696n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(l0.a aVar, l0.a aVar2, q qVar) {
        super(1);
        this.f128694l = aVar;
        this.f128695m = aVar2;
        this.f128696n = qVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        l0.a aVar = this.f128694l;
        aVar.f406838b = zBooleanValue;
        l0.a aVar2 = this.f128695m;
        if (aVar2.f406838b) {
            aVar2.f406838b = false;
        } else if (!zBooleanValue) {
            q qVar = this.f128696n;
            if (qVar.C80()) {
                qVar.f128700b.postDelayed(new n(aVar, qVar), qVar.f128708j);
            }
        }
        return G0.f406611a;
    }
}
