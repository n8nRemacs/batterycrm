package com.avito.android.blueprint.suggest;

import androidx.view.InterfaceC22983P;
import com.avito.android.category_parameters.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PublishInputWithSuggestsPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class s extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w f105733l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y f105734m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.H f105735n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(w wVar, y yVar, ParameterElement.H h12) {
        super(0);
        this.f105733l = wVar;
        this.f105734m = yVar;
        this.f105735n = h12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        String str = this.f105735n.f117181b;
        w wVar = this.f105733l;
        y yVar = this.f105734m;
        InterfaceC22983P interfaceC22983P = wVar.f105738c;
        yVar.FC(str, interfaceC22983P);
        yVar.No(str, interfaceC22983P);
        return G0.f406611a;
    }
}
