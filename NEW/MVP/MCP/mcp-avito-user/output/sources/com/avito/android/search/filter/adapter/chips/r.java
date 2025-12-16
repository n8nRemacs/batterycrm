package com.avito.android.search.filter.adapter.chips;

import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.search.filter.converter.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ChipsSingleSelectItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class r extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t f262178l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.v.b f262179m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, ParameterElement.v.b bVar) {
        super(0);
        this.f262178l = tVar;
        this.f262179m = bVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        t tVar = this.f262178l;
        b.a.a(tVar.f262182b, this.f262179m.f262854q.getDeepLink(), null, null, 6);
        return G0.f406611a;
    }
}
