package com.avito.android.service_fee_conditions.ui.compose.items;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import qu0.c;

/* compiled from: ServiceFeeConditionsBannerItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class b extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c.a f278511l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f278512m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f278513n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f278514o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c.a aVar, Y41.l lVar, v vVar, int i12) {
        super(2);
        this.f278511l = aVar;
        this.f278512m = lVar;
        this.f278513n = vVar;
        this.f278514o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f278514o | 1);
        v vVar = this.f278513n;
        f.a(this.f278511l, this.f278512m, vVar, a12, iA2);
        return G0.f406611a;
    }
}
