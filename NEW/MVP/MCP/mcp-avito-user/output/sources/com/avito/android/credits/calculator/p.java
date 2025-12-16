package com.avito.android.credits.calculator;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CreditCalculatorView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/lib/design/picker/k;", "data", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/picker/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class p extends N implements Y41.l<com.avito.android.lib.design.picker.k<?>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int[] f128697l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f128698m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(int[] iArr, Y41.l<? super Integer, G0> lVar) {
        super(1);
        this.f128697l = iArr;
        this.f128698m = (N) lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.picker.k<?> kVar) {
        this.f128698m.invoke(Integer.valueOf(this.f128697l[((Integer) kVar.f180046a).intValue()]));
        return G0.f406611a;
    }
}
