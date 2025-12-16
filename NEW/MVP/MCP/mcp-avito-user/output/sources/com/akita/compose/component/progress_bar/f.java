package com.akita.compose.component.progress_bar;

import androidx.compose.ui.semantics.C;
import androidx.compose.ui.semantics.F;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.ranges.s;

/* compiled from: ProgressBar.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/semantics/F;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class f extends N implements Y41.l<F, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Float> f62386l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Y41.a<Float> aVar) {
        super(1);
        this.f62386l = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(F f12) {
        C.r(f12, new androidx.compose.ui.semantics.h(this.f62386l.invoke().floatValue(), s.m(0.0f, 1.0f), 0, 4, null));
        return G0.f406611a;
    }
}
