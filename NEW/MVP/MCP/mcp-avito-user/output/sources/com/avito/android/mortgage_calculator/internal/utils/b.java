package com.avito.android.mortgage_calculator.internal.utils;

import Y41.l;
import Y61.k;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.focus.InterfaceC22224i;
import androidx.compose.ui.focus.f0;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: FocusChangedModifier.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/utils/b;", "Landroidx/compose/ui/focus/i;", "Landroidx/compose/ui/v$d;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class b extends v.d implements InterfaceC22224i {

    /* renamed from: p, reason: collision with root package name */
    @k
    public l<? super f0, G0> f204811p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public FocusStateImpl f204812q;

    public b() {
        throw null;
    }

    @Override // androidx.compose.ui.focus.InterfaceC22224i
    public final void u(@k FocusStateImpl focusStateImpl) {
        FocusStateImpl focusStateImpl2 = this.f204812q;
        if (focusStateImpl2 == null) {
            this.f204812q = focusStateImpl;
        } else {
            if (focusStateImpl2.equals(focusStateImpl)) {
                return;
            }
            this.f204812q = focusStateImpl;
            this.f204811p.invoke(focusStateImpl);
        }
    }
}
