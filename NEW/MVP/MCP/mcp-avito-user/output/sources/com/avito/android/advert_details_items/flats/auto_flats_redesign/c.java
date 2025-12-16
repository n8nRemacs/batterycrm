package com.avito.android.advert_details_items.flats.auto_flats_redesign;

import com.avito.android.advert_core.advert.AdvertDetailsFlatViewType;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertParameters;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsFlatTwoColumnWithDots.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DeepLink f84683l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.advert_core.advert.k f84684m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f84685n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f84686o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f84687p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ AdvertParameters.Button f84688q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f84689r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DeepLink deepLink, com.avito.android.advert_core.advert.k kVar, String str, String str2, boolean z12, boolean z13, AdvertParameters.Button button, String str3) {
        super(0);
        this.f84683l = deepLink;
        this.f84684m = kVar;
        this.f84685n = str;
        this.f84686o = z12;
        this.f84687p = z13;
        this.f84688q = button;
        this.f84689r = str3;
    }

    @Override // Y41.a
    public final G0 invoke() {
        com.avito.android.advert_core.advert.k kVar = this.f84684m;
        DeepLink deepLink = this.f84683l;
        if (deepLink != null) {
            if (kVar != null) {
                kVar.O0(deepLink, this.f84685n);
            }
        } else if ((this.f84686o || this.f84687p) && kVar != null) {
            kVar.E(this.f84688q, AdvertDetailsFlatViewType.f82420b, this.f84689r);
        }
        return G0.f406611a;
    }
}
