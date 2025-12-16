package com.avito.android.user_advert.advert.delegate.multi_urgency.use_case;

import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import nH0.InterfaceC44256a;

/* compiled from: MultiUrgencyToggleUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/multi_urgency/use_case/h;", "Lcom/avito/android/user_advert/advert/delegate/multi_urgency/use_case/e;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final k f308725a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c f308726b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f308727c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f308728d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44256a f308729e;

    @Inject
    public h(@Y61.k k kVar, @Y61.k c cVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k R0 r02, @Y61.k InterfaceC44256a interfaceC44256a) {
        this.f308725a = kVar;
        this.f308726b = cVar;
        this.f308727c = aVar;
        this.f308728d = r02;
        this.f308729e = interfaceC44256a;
    }

    @Override // com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.e
    @Y61.k
    public final C43137a0 b(@Y61.k com.avito.android.user_advert.advert.items.multi_urgency.c cVar, boolean z12) {
        com.avito.android.user_advert.advert.items.multi_urgency.c cVarB = this.f308725a.b(cVar, z12);
        return new C43137a0(new g(cVarB, null), C43175k.G(new f(this, cVarB, cVar, z12, null)));
    }
}
