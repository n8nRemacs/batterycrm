package com.avito.android.publish.details.adapter.objects;

import com.avito.android.category_parameters.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: MultiStateObjectsItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f233291l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.w f233292m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f233293n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, ParameterElement.w wVar, int i12) {
        super(0);
        this.f233291l = gVar;
        this.f233292m = wVar;
        this.f233293n = i12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f233291l.f233334e.accept(new Q<>(this.f233292m, Integer.valueOf(this.f233293n)));
        return G0.f406611a;
    }
}
