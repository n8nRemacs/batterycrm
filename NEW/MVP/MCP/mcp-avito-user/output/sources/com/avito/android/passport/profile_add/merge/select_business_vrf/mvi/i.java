package com.avito.android.passport.profile_add.merge.select_business_vrf.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.passport.profile_add.merge.select_business_vrf.SelectBusinessVrfOpenParams;
import com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.entity.SelectBusinessVrfInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;

/* compiled from: SelectBusinessVrfBootstrap.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/i;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements com.avito.android.arch.mvi.b<SelectBusinessVrfInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.passport.profile_add.merge.domain.a f213460a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f213461b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SelectBusinessVrfOpenParams f213462c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f213463d;

    @Inject
    public i(@Y61.k com.avito.android.passport.profile_add.merge.domain.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k SelectBusinessVrfOpenParams selectBusinessVrfOpenParams, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f213460a = aVar;
        this.f213461b = aVar2;
        this.f213462c = selectBusinessVrfOpenParams;
        this.f213463d = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<SelectBusinessVrfInternalAction> a() {
        return C43175k.N(this.f213460a.b(this.f213462c.f213365b), new g(new f(new C43197r1(new h(2, this, i.class, "sendAnalytics", "sendAnalytics(Lcom/avito/android/deeplink_handler/handler/result/DeeplinkResultEvent;)V", 4), y.a(this.f213461b.d9())), this), this));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
