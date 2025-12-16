package com.avito.android.early_access.adapter.short_price;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.early_access.adapter.short_price.element.EarlyAccessShortPriceItem;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EarlyAccessShortPrice.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class j extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<EarlyAccessShortPriceItem> f145242l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<EarlyAccessShortPriceItem, G0> f145243m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f145244n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f145245o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i12, Y41.l lVar, v vVar, List list) {
        super(2);
        this.f145242l = list;
        this.f145243m = lVar;
        this.f145244n = vVar;
        this.f145245o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f145245o | 1);
        v vVar = this.f145244n;
        List<EarlyAccessShortPriceItem> list = this.f145242l;
        k.b(iA2, this.f145243m, a12, vVar, list);
        return G0.f406611a;
    }
}
