package com.avito.android.advert_details_items.rich_geo_block;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.remote.model.UniversalImage;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsRichGeoBlockView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class w extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UniversalImage f85492l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f85493m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ N f85494n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f85495o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f85496p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(UniversalImage universalImage, boolean z12, Y41.a aVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f85492l = universalImage;
        this.f85493m = z12;
        this.f85494n = (N) aVar;
        this.f85495o = vVar;
        this.f85496p = i12;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f85496p | 1);
        ?? r22 = this.f85494n;
        o.g(this.f85492l, this.f85493m, r22, this.f85495o, a12, iA2);
        return G0.f406611a;
    }
}
