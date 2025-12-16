package com.avito.android.early_access.adapter.bundle;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EarlyAccessBundle.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class g extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ EarlyAccessSelectableBundleItem f145115l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f145116m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f145117n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f145118o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(EarlyAccessSelectableBundleItem earlyAccessSelectableBundleItem, Y41.a aVar, v vVar, int i12) {
        super(2);
        this.f145115l = earlyAccessSelectableBundleItem;
        this.f145116m = aVar;
        this.f145117n = vVar;
        this.f145118o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) throws Throwable {
        num.intValue();
        int iA2 = C22066f2.a(this.f145118o | 1);
        v vVar = this.f145117n;
        h.a(this.f145115l, this.f145116m, vVar, a12, iA2);
        return G0.f406611a;
    }
}
