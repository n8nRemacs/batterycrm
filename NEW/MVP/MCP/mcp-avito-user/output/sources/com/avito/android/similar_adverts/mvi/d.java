package com.avito.android.similar_adverts.mvi;

import Lw0.InterfaceC14445b;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SimilarAdvertsBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/similar_adverts/mvi/d;", "Lcom/avito/android/arch/mvi/b;", "LOw0/b;", "_avito_similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements com.avito.android.arch.mvi.b<Ow0.b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.similar_adverts.d f283953a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f283954b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14445b f283955c;

    @Inject
    public d(@Y61.k com.avito.android.similar_adverts.d dVar, @Y61.k String str, @Y61.k InterfaceC14445b interfaceC14445b) {
        this.f283953a = dVar;
        this.f283954b = str;
        this.f283955c = interfaceC14445b;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<Ow0.b> a() {
        InterfaceC14445b interfaceC14445b = this.f283955c;
        return new C43152f0(C43175k.G(new e(interfaceC14445b, this.f283953a, this.f283954b, null)), new f(interfaceC14445b, null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
