package com.avito.android.vas_performance.ui;

import com.avito.android.lib.design.button.Button;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: PerformanceVasFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "", "apply", "(Lkotlin/G0;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class f<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PerformanceVasFragment f321532b;

    public f(PerformanceVasFragment performanceVasFragment) {
        this.f321532b = performanceVasFragment;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Button button = this.f321532b.f321394v0;
        if (button == null) {
            button = null;
        }
        return Integer.valueOf(D6.v(button));
    }
}
