package com.avito.android.toggle_comparison_state;

import f90.InterfaceC40258g;
import io.reactivex.rxjava3.core.I;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ChangeComparisonStateUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/toggle_comparison_state/l;", "", "_avito_toggle-comparison-state_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e f301617a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40258g f301618b;

    @Inject
    public l(@Y61.k e eVar, @Y61.k InterfaceC40258g interfaceC40258g) {
        this.f301617a = eVar;
        this.f301618b = interfaceC40258g;
    }

    @Y61.k
    public final I<s> a(@Y61.k p pVar) {
        boolean z12 = pVar.f301629e;
        e eVar = this.f301617a;
        return z12 ? eVar.b(pVar).h(new k(pVar, this)) : pVar.f301628d ? eVar.a(pVar) : eVar.b(pVar).h(new k(pVar, this));
    }
}
