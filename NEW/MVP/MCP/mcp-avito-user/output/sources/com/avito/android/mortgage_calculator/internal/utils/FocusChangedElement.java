package com.avito.android.mortgage_calculator.internal.utils;

import Y41.l;
import Y61.k;
import androidx.compose.foundation.H;
import androidx.compose.ui.focus.f0;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FocusChangedModifier.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/utils/FocusChangedElement;", "Landroidx/compose/ui/node/p0;", "Lcom/avito/android/mortgage_calculator/internal/utils/b;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* data */ class FocusChangedElement extends AbstractC22430p0<b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<f0, G0> f204810b;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusChangedElement(@k l<? super f0, G0> lVar) {
        this.f204810b = lVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        b bVar = new b();
        bVar.f204811p = this.f204810b;
        return bVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        ((b) dVar).f204811p = this.f204810b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && L.f(this.f204810b, ((FocusChangedElement) obj).f204810b);
    }

    public final int hashCode() {
        return this.f204810b.hashCode();
    }

    @k
    public final String toString() {
        return H.l(new StringBuilder("FocusChangedElement(onFocusChanged="), this.f204810b, ')');
    }
}
