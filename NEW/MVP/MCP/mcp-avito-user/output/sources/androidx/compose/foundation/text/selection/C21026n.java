package androidx.compose.foundation.text.selection;

import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* compiled from: SelectionHandles.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/n;", "Landroidx/compose/ui/window/T;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.selection.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21026n implements androidx.compose.ui.window.T {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22215f f32087a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC21039u f32088b;

    /* renamed from: c, reason: collision with root package name */
    public long f32089c;

    public C21026n(@Y61.k InterfaceC22215f interfaceC22215f, @Y61.k InterfaceC21039u interfaceC21039u) {
        this.f32087a = interfaceC22215f;
        this.f32088b = interfaceC21039u;
        l0.g.f413384b.getClass();
        this.f32089c = 0L;
    }

    @Override // androidx.compose.ui.window.T
    public final long a(@Y61.k androidx.compose.ui.unit.s sVar, long j12, @Y61.k LayoutDirection layoutDirection, long j13) {
        long jA2 = this.f32088b.a();
        if ((9223372034707292159L & jA2) == 9205357640488583168L) {
            jA2 = this.f32089c;
        }
        this.f32089c = jA2;
        androidx.compose.ui.unit.u.f42871b.getClass();
        return androidx.compose.ui.unit.q.e(androidx.compose.ui.unit.q.e(sVar.c(), androidx.compose.ui.unit.r.c(jA2)), this.f32087a.a(j13, 0L, layoutDirection));
    }
}
