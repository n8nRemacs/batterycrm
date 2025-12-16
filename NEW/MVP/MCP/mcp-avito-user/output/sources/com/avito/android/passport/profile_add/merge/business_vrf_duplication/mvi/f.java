package com.avito.android.passport.profile_add.merge.business_vrf_duplication.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.passport.network.model.BusinessVrfDuplication;
import com.avito.android.passport.profile_add.merge.business_vrf_duplication.mvi.entity.BusinessVrfDuplicationInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;

/* compiled from: BusinessVrfDuplicationBootstrap.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/business_vrf_duplication/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/passport/profile_add/merge/business_vrf_duplication/mvi/entity/BusinessVrfDuplicationInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements com.avito.android.arch.mvi.b<BusinessVrfDuplicationInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f212554a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final BusinessVrfDuplication f212555b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f212556c;

    @Inject
    public f(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.l BusinessVrfDuplication businessVrfDuplication, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f212554a = aVar;
        this.f212555b = businessVrfDuplication;
        this.f212556c = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<BusinessVrfDuplicationInternalAction> a() {
        return this.f212555b != null ? C43175k.N(new C43210w(BusinessVrfDuplicationInternalAction.Init.f212548b), new d(new C43197r1(new e(2, this, f.class, "sendAnalytics", "sendAnalytics(Lcom/avito/android/deeplink_handler/handler/result/DeeplinkResultEvent;)V", 4), y.a(this.f212554a.V9())))) : C43175k.w();
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
