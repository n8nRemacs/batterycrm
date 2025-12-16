package com.avito.android.blueprint.suggest;

import androidx.view.InterfaceC22983P;
import com.avito.android.category_parameters.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PublishInputWithSuggestsPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class o extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w f105722l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y f105723m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.H f105724n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(w wVar, y yVar, ParameterElement.H h12) {
        super(0);
        this.f105722l = wVar;
        this.f105723m = yVar;
        this.f105724n = h12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        ParameterElement.H h12 = this.f105724n;
        String str = h12.f117181b;
        w wVar = this.f105722l;
        com.avito.android.ui.widget.tagged_input.m mVar = wVar.f105737b;
        if (mVar != null) {
            y yVar = this.f105723m;
            InterfaceC22983P interfaceC22983P = wVar.f105738c;
            yVar.uR(str, mVar, interfaceC22983P, h12.f117302h);
            yVar.yh(str, mVar, interfaceC22983P);
        }
        return G0.f406611a;
    }
}
