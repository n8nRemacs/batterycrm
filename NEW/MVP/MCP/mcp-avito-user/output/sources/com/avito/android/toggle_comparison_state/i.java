package com.avito.android.toggle_comparison_state;

import Uq.InterfaceC15558a;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import io.reactivex.rxjava3.internal.operators.single.W;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ChangeComparisonStateRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/toggle_comparison_state/i;", "Lcom/avito/android/toggle_comparison_state/e;", "_avito_toggle-comparison-state_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC15558a> f301608a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final b f301609b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f301610c;

    @Inject
    public i(@Y61.k h31.e<InterfaceC15558a> eVar, @Y61.k b bVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f301608a = eVar;
        this.f301609b = bVar;
        this.f301610c = interfaceC35745a5;
    }

    @Override // com.avito.android.toggle_comparison_state.e
    @Y61.k
    public final W a(@Y61.k p pVar) {
        return new C42007e(new f(this, pVar, 0)).r(new h(this, pVar)).z(this.f301610c.a());
    }

    @Override // com.avito.android.toggle_comparison_state.e
    @Y61.k
    public final W b(@Y61.k p pVar) {
        return new C42007e(new f(this, pVar, 1)).r(new g(this, pVar)).z(this.f301610c.a());
    }
}
