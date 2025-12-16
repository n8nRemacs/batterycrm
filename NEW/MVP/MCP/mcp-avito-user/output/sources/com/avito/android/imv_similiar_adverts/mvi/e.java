package com.avito.android.imv_similiar_adverts.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.imv_similiar_adverts.ImvSimilarAdvertsParams;
import com.avito.android.imv_similiar_adverts.mvi.entity.ImvSimilarAdvertsInternalAction;
import com.avito.android.imv_similiar_adverts.n;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ImvSimilarAdvertsBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/mvi/e;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/imv_similiar_adverts/mvi/entity/ImvSimilarAdvertsInternalAction;", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements com.avito.android.arch.mvi.b<ImvSimilarAdvertsInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final n f170902a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ImvSimilarAdvertsParams f170903b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f170904c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f170905d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final R0 f170906e;

    @Inject
    public e(@Y61.k n nVar, @Y61.k ImvSimilarAdvertsParams imvSimilarAdvertsParams, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k R0 r02) {
        this.f170902a = nVar;
        this.f170903b = imvSimilarAdvertsParams;
        this.f170904c = fVar;
        this.f170905d = interfaceC28373a;
        this.f170906e = r02;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<ImvSimilarAdvertsInternalAction> a() {
        c.f170890f.getClass();
        n nVar = this.f170902a;
        ImvSimilarAdvertsParams imvSimilarAdvertsParams = this.f170903b;
        InterfaceC28373a interfaceC28373a = this.f170905d;
        return C43175k.I(this.f170906e.a(), new C43152f0(C43175k.G(new a(nVar, imvSimilarAdvertsParams, interfaceC28373a, null)), new b(interfaceC28373a, imvSimilarAdvertsParams, this.f170904c, null)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
