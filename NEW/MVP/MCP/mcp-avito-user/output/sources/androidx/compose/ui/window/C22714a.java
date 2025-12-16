package androidx.compose.ui.window;

import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: Popup.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/window/a;", "Landroidx/compose/ui/window/T;", "Landroidx/compose/ui/f;", "alignment", "Landroidx/compose/ui/unit/q;", "offset", "<init>", "(Landroidx/compose/ui/f;JLkotlin/jvm/internal/w;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.window.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22714a implements T {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22215f f43072a;

    /* renamed from: b, reason: collision with root package name */
    public final long f43073b;

    public C22714a(InterfaceC22215f interfaceC22215f, long j12, C42822w c42822w) {
        this.f43072a = interfaceC22215f;
        this.f43073b = j12;
    }

    @Override // androidx.compose.ui.window.T
    public final long a(@Y61.k androidx.compose.ui.unit.s sVar, long j12, @Y61.k LayoutDirection layoutDirection, long j13) {
        androidx.compose.ui.unit.u.f42871b.getClass();
        long jA2 = this.f43072a.a(0L, (sVar.d() << 32) | (sVar.b() & 4294967295L), layoutDirection);
        long jA3 = this.f43072a.a(0L, j13, layoutDirection);
        q.a aVar = androidx.compose.ui.unit.q.f42862b;
        long j14 = ((-((int) (jA3 >> 32))) << 32) | ((-((int) (jA3 & 4294967295L))) & 4294967295L);
        long j15 = this.f43073b;
        return androidx.compose.ui.unit.q.e(androidx.compose.ui.unit.q.e(androidx.compose.ui.unit.q.e(sVar.c(), jA2), j14), (((int) (j15 & 4294967295L)) & 4294967295L) | ((((int) (j15 >> 32)) * (layoutDirection == LayoutDirection.f42838b ? 1 : -1)) << 32));
    }
}
