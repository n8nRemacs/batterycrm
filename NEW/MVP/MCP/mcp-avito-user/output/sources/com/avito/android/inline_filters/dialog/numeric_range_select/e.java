package com.avito.android.inline_filters.dialog.numeric_range_select;

import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: NumericRangeSelectFilterDialog.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x f171885l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ArrayList f171886m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f171887n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(x xVar, ArrayList arrayList, Y41.a aVar) {
        super(0);
        this.f171885l = xVar;
        this.f171886m = arrayList;
        this.f171887n = aVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.a
    public final G0 invoke() {
        x xVar = this.f171885l;
        ?? r12 = xVar.f171937d;
        String strW = xVar.w();
        ArrayList arrayList = this.f171886m;
        r12.invoke(C42745f0.U(x.k(strW, arrayList), x.k(xVar.x(), arrayList)));
        ((q) this.f171887n).invoke();
        return G0.f406611a;
    }
}
