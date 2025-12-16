package com.avito.android.serp.adapter.carousel_gig;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.GigShiftInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CarouselGigShiftPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ GigShiftInfo f269092l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f269093m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(GigShiftInfo gigShiftInfo, e eVar) {
        super(0);
        this.f269092l = gigShiftInfo;
        this.f269093m = eVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink uri;
        GigShiftInfo.Action action = this.f269092l.getAction();
        if (action != null && (uri = action.getUri()) != null) {
            b.a.a(this.f269093m.f269096b, uri, null, null, 6);
        }
        return G0.f406611a;
    }
}
