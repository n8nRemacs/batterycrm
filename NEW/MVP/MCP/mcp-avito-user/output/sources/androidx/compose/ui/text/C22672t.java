package androidx.compose.ui.text;

import androidx.compose.ui.graphics.D0;
import androidx.compose.ui.graphics.h1;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import l0.C43522a;

/* compiled from: Bullet.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/t;", "Landroidx/compose/ui/graphics/h1;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22672t implements h1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C22672t f42727a = new C22672t();

    @Override // androidx.compose.ui.graphics.h1
    @Y61.k
    public final D0 a(long j12, @Y61.k LayoutDirection layoutDirection, @Y61.k androidx.compose.ui.unit.d dVar) {
        float fD2 = l0.n.d(j12) / 2.0f;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fD2) << 32) | (Float.floatToRawIntBits(fD2) & 4294967295L);
        C43522a.C11768a c11768a = C43522a.f413378b;
        l0.j jVarC = l0.o.c(j12);
        return new D0.c(new l0.l(jVarC.f413390a, jVarC.f413391b, jVarC.f413392c, jVarC.f413393d, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, null));
    }
}
