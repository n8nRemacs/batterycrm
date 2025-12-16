package com.avito.android.publish.items.tagged_input;

import androidx.view.InterfaceC22983P;
import com.avito.android.category_parameters.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MultiStateInputWithTagsItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class s extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x f237161l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ A f237162m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.H f237163n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ParameterElement.H h12, x xVar, A a12) {
        super(0);
        this.f237161l = xVar;
        this.f237162m = a12;
        this.f237163n = h12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        ParameterElement.H h12 = this.f237163n;
        String str = h12.f117181b;
        x xVar = this.f237161l;
        com.avito.android.ui.widget.tagged_input.m mVar = xVar.f237168b;
        if (mVar != null) {
            A a12 = this.f237162m;
            InterfaceC22983P interfaceC22983P = xVar.f237169c;
            a12.uR(str, mVar, interfaceC22983P, h12.f117302h);
            a12.yh(str, mVar, interfaceC22983P);
        }
        return G0.f406611a;
    }
}
