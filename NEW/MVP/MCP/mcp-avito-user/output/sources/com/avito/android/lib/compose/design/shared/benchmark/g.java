package com.avito.android.lib.compose.design.shared.benchmark;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;

/* compiled from: BenchmarkComposeActivity.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class g extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<U2.b> f177642l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C42784z0 f177643m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f177644n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(List list, C42784z0 c42784z0, int i12) {
        super(2);
        this.f177642l = list;
        this.f177643m = c42784z0;
        this.f177644n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f177644n | 1);
        o.a(this.f177642l, this.f177643m, a12, iA2);
        return G0.f406611a;
    }
}
