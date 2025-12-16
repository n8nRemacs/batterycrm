package com.avito.android.advert.item.video_call_request;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertVideoCallRequestItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f80693l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertVideoCallRequestItem f80694m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, AdvertVideoCallRequestItem advertVideoCallRequestItem) {
        super(0);
        this.f80693l = dVar;
        this.f80694m = advertVideoCallRequestItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        d dVar = this.f80693l;
        OL.a aVar = dVar.f80691b;
        if (aVar.f()) {
            aVar.e();
        }
        dVar.f80692c.M1(this.f80694m.f80679e, (4 & 2) != 0 ? null : "VIDEO_CALL_REQUEST_KEY");
        return G0.f406611a;
    }
}
