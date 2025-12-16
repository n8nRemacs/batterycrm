package com.avito.android.blueprints.publish.multiselect;

import com.avito.android.category_parameters.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MultiselectItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f106350l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.v f106351m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, ParameterElement.v vVar) {
        super(0);
        this.f106350l = gVar;
        this.f106351m = vVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f106350l.f106355e.accept(this.f106351m);
        return G0.f406611a;
    }
}
