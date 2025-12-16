package com.avito.android.lib.beduin_v2.component.gradient.compose;

import Y41.l;
import android.graphics.PointF;
import androidx.compose.ui.draw.i;
import androidx.compose.ui.draw.p;
import androidx.compose.ui.graphics.J;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.p1;
import com.avito.beduin.v2.avito.component.gradient.content.f;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l0.g;

/* compiled from: GradientModifier.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/draw/i;", "Landroidx/compose/ui/draw/p;", "invoke", "(Landroidx/compose/ui/draw/i;)Landroidx/compose/ui/draw/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class b extends N implements l<i, p> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.avito.component.gradient.content.b f175607l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Q<Float, T>[] f175608m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.avito.beduin.v2.avito.component.gradient.content.b bVar, Q<Float, T>[] qArr) {
        super(1);
        this.f175607l = bVar;
        this.f175608m = qArr;
    }

    @Override // Y41.l
    public final p invoke(i iVar) {
        i iVar2 = iVar;
        Q<PointF, PointF> qA2 = com.avito.android.lib.design.gradient.c.a(((f) this.f175607l).f334368b, (int) Float.intBitsToFloat((int) (iVar2.f39046b.i() >> 32)), (int) Float.intBitsToFloat((int) (iVar2.f39046b.i() & 4294967295L)));
        PointF pointF = qA2.f406619b;
        PointF pointF2 = qA2.f406620c;
        J.a aVar = J.f39287a;
        Q<Float, T>[] qArr = this.f175608m;
        Q[] qArr2 = (Q[]) Arrays.copyOf(qArr, qArr.length);
        float f12 = pointF.x;
        float f13 = pointF.y;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L);
        g.a aVar2 = g.f413384b;
        float f14 = pointF2.x;
        float f15 = pointF2.y;
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f14);
        long jFloatToRawIntBits3 = Float.floatToRawIntBits(f15) & 4294967295L;
        p1.f39721b.getClass();
        aVar.getClass();
        return iVar2.f(new a(J.a.b(qArr2, jFloatToRawIntBits, jFloatToRawIntBits3 | (jFloatToRawIntBits2 << 32))));
    }
}
