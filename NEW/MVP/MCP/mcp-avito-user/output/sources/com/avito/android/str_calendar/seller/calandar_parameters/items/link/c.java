package com.avito.android.str_calendar.seller.calandar_parameters.items.link;

import Gy0.InterfaceC13931a;
import JO.m;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: LinkFormItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.C.b f287229l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f287230m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ParameterElement.C.b bVar, d dVar) {
        super(0);
        this.f287229l = bVar;
        this.f287230m = dVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink;
        m mVar = (m) C42745f0.G(this.f287229l.f117236E);
        if (mVar != null && (deepLink = mVar.f8970k) != null) {
            this.f287230m.f287231b.invoke(new InterfaceC13931a.s(deepLink));
        }
        return G0.f406611a;
    }
}
