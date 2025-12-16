package com.avito.android.advert_details_items.rich_geo_block;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsRichGeoBlockView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class p extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f85475l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f85476m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ N f85477n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ N f85478o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ N f85479p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f85480q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f85481r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(long j12, c cVar, Y41.a aVar, Y41.a aVar2, Y41.a aVar3, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f85475l = j12;
        this.f85476m = cVar;
        this.f85477n = (N) aVar;
        this.f85478o = (N) aVar2;
        this.f85479p = (N) aVar3;
        this.f85480q = vVar;
        this.f85481r = i12;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r4v0, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r5v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f85481r | 1);
        ?? r52 = this.f85479p;
        c cVar = this.f85476m;
        ?? r32 = this.f85477n;
        ?? r42 = this.f85478o;
        o.f(this.f85475l, cVar, r32, r42, r52, this.f85480q, a12, iA2);
        return G0.f406611a;
    }
}
