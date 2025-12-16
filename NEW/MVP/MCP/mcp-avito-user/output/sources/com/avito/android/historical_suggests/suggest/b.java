package com.avito.android.historical_suggests.suggest;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HistoricalSuggestsScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class b extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f161968l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f161969m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f161970n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f161971o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f161972p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ v.a f161973q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2, boolean z12, boolean z13, Y41.a aVar, v.a aVar2, int i12) {
        super(2);
        this.f161968l = str;
        this.f161969m = str2;
        this.f161970n = z12;
        this.f161971o = z13;
        this.f161972p = aVar;
        this.f161973q = aVar2;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(1);
        boolean z12 = this.f161971o;
        Y41.a<G0> aVar = this.f161972p;
        h.a(this.f161968l, this.f161969m, this.f161970n, z12, aVar, this.f161973q, a12, iA2);
        return G0.f406611a;
    }
}
