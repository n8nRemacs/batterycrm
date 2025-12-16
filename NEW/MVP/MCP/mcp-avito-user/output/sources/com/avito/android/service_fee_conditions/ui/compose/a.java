package com.avito.android.service_fee_conditions.ui.compose;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceFeeConditionsScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class a extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ qu0.c f278485l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f278486m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f278487n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v.a f278488o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f278489p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(qu0.c cVar, Y41.l lVar, float f12, v.a aVar, int i12) {
        super(2);
        this.f278485l = cVar;
        this.f278486m = lVar;
        this.f278487n = f12;
        this.f278488o = aVar;
        this.f278489p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        n.b(this.f278485l, this.f278486m, this.f278487n, this.f278488o, a12, C22066f2.a(this.f278489p | 1));
        return G0.f406611a;
    }
}
