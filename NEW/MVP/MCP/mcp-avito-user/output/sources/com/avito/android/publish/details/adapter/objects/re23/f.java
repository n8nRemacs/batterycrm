package com.avito.android.publish.details.adapter.objects.re23;

import com.avito.android.category_parameters.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: ObjectsPreviewItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f233394l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.w f233395m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f233396n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, ParameterElement.w wVar, int i12) {
        super(0);
        this.f233394l = iVar;
        this.f233395m = wVar;
        this.f233396n = i12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f233394l.f233401c.accept(new Q<>(this.f233395m, Integer.valueOf(this.f233396n)));
        return G0.f406611a;
    }
}
