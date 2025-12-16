package com.akita.compose.component.avatar.group;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l0.C43522a;
import l0.g;
import l0.n;

/* compiled from: AvatarGroup.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class b extends N implements l<androidx.compose.ui.graphics.drawscope.g, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f60312l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f60313m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j12, k kVar) {
        super(1);
        this.f60312l = kVar;
        this.f60313m = j12;
    }

    @Override // Y41.l
    public final G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
        androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
        k kVar = this.f60312l;
        float fM02 = gVar2.M0(kVar.f60324d);
        float f12 = -fM02;
        g.a aVar = l0.g.f413384b;
        float f13 = 2 * fM02;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (gVar2.i() >> 32)) + f13;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (gVar2.i() & 4294967295L)) + f13;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
        n.a aVar2 = n.f413402b;
        long jFloatToRawIntBits2 = (4294967295L & Float.floatToRawIntBits(r14)) | (Float.floatToRawIntBits(gVar2.M0(kVar.f60322b.f60403d) + fM02) << 32);
        C43522a.C11768a c11768a = C43522a.f413378b;
        androidx.compose.ui.graphics.drawscope.g.d1(gVar2, this.f60313m, (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L), jFloatToRawIntBits, jFloatToRawIntBits2, null, 0.0f, 240);
        return G0.f406611a;
    }
}
