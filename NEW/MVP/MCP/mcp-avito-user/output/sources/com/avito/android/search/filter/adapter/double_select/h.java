package com.avito.android.search.filter.adapter.double_select;

import com.avito.android.search.filter.converter.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DoubleSelectItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f262278l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f262279m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.v.a f262280n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p pVar, m mVar, ParameterElement.v.a aVar) {
        super(0);
        this.f262278l = pVar;
        this.f262279m = mVar;
        this.f262280n = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f262278l.Ec("");
        this.f262279m.f262288c.accept(this.f262280n.f262859e);
        return G0.f406611a;
    }
}
