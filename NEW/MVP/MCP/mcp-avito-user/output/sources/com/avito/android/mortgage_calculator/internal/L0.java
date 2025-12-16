package com.avito.android.mortgage_calculator.internal;

import android.util.DisplayMetrics;
import kotlin.Metadata;

/* compiled from: MortgageCalculatorScreen.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/unit/u;", "invoke-YbymL2g", "()J", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class L0 extends kotlin.jvm.internal.N implements Y41.a<androidx.compose.ui.unit.u> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DisplayMetrics f204193l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(DisplayMetrics displayMetrics) {
        super(0);
        this.f204193l = displayMetrics;
    }

    @Override // Y41.a
    public final androidx.compose.ui.unit.u invoke() {
        DisplayMetrics displayMetrics = this.f204193l;
        return androidx.compose.ui.unit.u.a((displayMetrics.widthPixels << 32) | (displayMetrics.heightPixels & 4294967295L));
    }
}
