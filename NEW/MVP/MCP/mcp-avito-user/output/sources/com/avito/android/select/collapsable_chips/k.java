package com.avito.android.select.collapsable_chips;

import androidx.compose.runtime.internal.P;
import com.avito.android.select.collapsable_chips.CollapsableChips;
import dq0.InterfaceC39781c;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CollapsableChipsPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/collapsable_chips/k;", "Lcom/avito/android/select/collapsable_chips/i;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Y41.l<InterfaceC39781c, G0> f265377b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public k(@Y61.l Y41.l<? super InterfaceC39781c, G0> lVar) {
        this.f265377b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) aVar;
        j jVar = new j(gVar, this);
        CollapsableChips collapsableChips = ((m) eVar).f265379b;
        collapsableChips.getClass();
        CollapsableChips.b<?> bVar = new CollapsableChips.b<>(jVar, gVar.f265373b);
        collapsableChips.f265350s = bVar;
        collapsableChips.t(bVar);
    }
}
