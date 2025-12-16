package com.avito.android.publish.slots.cpa_ddu_upload;

import com.avito.android.category_parameters.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CpaReassignmentSlotItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f243353l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.l f243354m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, ParameterElement.l lVar) {
        super(0);
        this.f243353l = iVar;
        this.f243354m = lVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f243353l.f243355b.accept(this.f243354m);
        return G0.f406611a;
    }
}
