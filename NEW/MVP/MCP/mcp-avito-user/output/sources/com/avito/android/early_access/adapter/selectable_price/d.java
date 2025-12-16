package com.avito.android.early_access.adapter.selectable_price;

import Y41.l;
import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EarlyAccessLongPrice.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class d extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<EarlyAccessSelectablePriceItem> f145172l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l<EarlyAccessSelectablePriceItem, G0> f145173m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f145174n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f145175o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i12, l lVar, v vVar, List list) {
        super(2);
        this.f145172l = list;
        this.f145173m = lVar;
        this.f145174n = vVar;
        this.f145175o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f145175o | 1);
        v vVar = this.f145174n;
        List<EarlyAccessSelectablePriceItem> list = this.f145172l;
        e.b(iA2, this.f145173m, a12, vVar, list);
        return G0.f406611a;
    }
}
