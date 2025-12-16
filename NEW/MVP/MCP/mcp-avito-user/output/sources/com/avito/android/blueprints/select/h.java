package com.avito.android.blueprints.select;

import com.avito.android.category_parameters.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MultiStateSelectItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f106595l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.C f106596m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, ParameterElement.C c12) {
        super(0);
        this.f106595l = iVar;
        this.f106596m = c12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f106595l.f106600e.accept(this.f106596m);
        return G0.f406611a;
    }
}
