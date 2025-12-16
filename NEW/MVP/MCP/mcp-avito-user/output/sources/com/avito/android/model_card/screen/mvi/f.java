package com.avito.android.model_card.screen.mvi;

import com.avito.android.model_card.screen.mvi.entity.ModelCardInternalAction;
import com.avito.android.util.R0;
import gj.InterfaceC40691b;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;

/* compiled from: ModelCardBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/model_card/screen/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/model_card/screen/mvi/entity/ModelCardInternalAction;", "_avito_model-card_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements com.avito.android.arch.mvi.b<ModelCardInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f198097a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final FZ.b f198098b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f198099c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.model_card.screen.domain.a f198100d;

    @Inject
    public f(@Y61.k InterfaceC40691b interfaceC40691b, @Y61.k FZ.b bVar, @Y61.k R0 r02, @Y61.k com.avito.android.model_card.screen.domain.a aVar) {
        this.f198097a = interfaceC40691b;
        this.f198098b = bVar;
        this.f198099c = r02;
        this.f198100d = aVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<ModelCardInternalAction> a() {
        InterfaceC43160i<ModelCardInternalAction> interfaceC43160iA = this.f198100d.a();
        FZ.b bVar = this.f198098b;
        c cVar = new c(y.a(bVar.f4776b.getF103348p()));
        R0 r02 = this.f198099c;
        return C43175k.N(interfaceC43160iA, C43175k.N(C43175k.I(r02.b(), cVar), C43175k.I(r02.b(), new d(y.a(bVar.f4777c.getF103348p()))), C43175k.I(r02.b(), new e(y.a(bVar.f4778d.getF103348p())))));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        this.f198097a.onCleared();
        return G0.f406611a;
    }
}
