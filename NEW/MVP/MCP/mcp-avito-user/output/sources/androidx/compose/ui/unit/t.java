package androidx.compose.ui.unit;

import androidx.compose.runtime.F3;
import androidx.compose.ui.unit.q;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: IntRect.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-unit_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t {
    @F3
    @Y61.k
    public static final s a(long j12, long j13) {
        q.a aVar = q.f42862b;
        int i12 = (int) (j12 >> 32);
        int i13 = (int) (j12 & 4294967295L);
        return new s(i12, i13, ((int) (j13 >> 32)) + i12, ((int) (j13 & 4294967295L)) + i13);
    }

    @F3
    @Y61.k
    public static final s b(@Y61.k l0.j jVar) {
        return new s(Math.round(jVar.f413390a), Math.round(jVar.f413391b), Math.round(jVar.f413392c), Math.round(jVar.f413393d));
    }
}
