package com.avito.android.service_booking_common.blueprints.geo_reference;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import qt0.C47441e;

/* compiled from: SbGeoReferencePresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C47441e f276413l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f276414m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C47441e c47441e, e eVar) {
        super(0);
        this.f276413l = c47441e;
        this.f276414m = eVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink;
        C47441e.b bVar = this.f276413l.f429429e;
        if (bVar != null && (deepLink = bVar.f429438b) != null) {
            this.f276414m.f276415b.invoke(deepLink);
        }
        return G0.f406611a;
    }
}
