package com.avito.android.compose_items.multiselect;

import JO.m;
import com.avito.android.category_parameters.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: MultiselectComposeItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f125407l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.v f125408m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m f125409n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, ParameterElement.v vVar, m mVar) {
        super(0);
        this.f125407l = iVar;
        this.f125408m = vVar;
        this.f125409n = mVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f125407l.f125419i.accept(new Q<>(this.f125408m, this.f125409n));
        return G0.f406611a;
    }
}
