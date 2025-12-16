package com.avito.android.lib.compose.design.shared.benchmark;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;

/* compiled from: BenchmarkComposeActivity.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class n extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ U2.b f177658l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C42784z0 f177659m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f177660n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f177661o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(U2.b bVar, C42784z0 c42784z0, String str, int i12) {
        super(2);
        this.f177658l = bVar;
        this.f177659m = c42784z0;
        this.f177660n = str;
        this.f177661o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f177661o | 1);
        String str = this.f177660n;
        o.b(this.f177658l, this.f177659m, str, a12, iA2);
        return G0.f406611a;
    }
}
