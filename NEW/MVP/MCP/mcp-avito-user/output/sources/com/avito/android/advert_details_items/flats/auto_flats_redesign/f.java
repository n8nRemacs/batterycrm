package com.avito.android.advert_details_items.flats.auto_flats_redesign;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.remote.model.AdvertParameters;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsFlatTwoColumnWithDots.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class f extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<AdvertParameters.Parameter> f84700l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f84701m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.advert_core.advert.k f84702n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Integer f84703o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f84704p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(List list, boolean z12, com.avito.android.advert_core.advert.k kVar, Integer num, int i12) {
        super(2);
        this.f84700l = list;
        this.f84701m = z12;
        this.f84702n = kVar;
        this.f84703o = num;
        this.f84704p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        i.b(this.f84700l, this.f84701m, this.f84702n, this.f84703o, a12, C22066f2.a(this.f84704p | 1));
        return G0.f406611a;
    }
}
