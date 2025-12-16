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
final class v extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UniversalImage f85487l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f85488m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ N f85489n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f85490o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f85491p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v(UniversalImage universalImage, boolean z12, Y41.a aVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f85487l = universalImage;
        this.f85488m = z12;
        this.f85489n = (N) aVar;
        this.f85490o = vVar;
        this.f85491p = i12;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f85491p | 1);
        ?? r22 = this.f85489n;
        o.g(this.f85487l, this.f85488m, r22, this.f85490o, a12, iA2);
        return G0.f406611a;
    }
}
