package com.akita.compose.component.badge;

import Y41.l;
import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20318t;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import l0.n;

/* compiled from: Badge.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements l<androidx.compose.ui.graphics.drawscope.g, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f60384l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C20268c<Float, C20318t> f60385m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C20268c<Float, C20318t> f60386n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(long j12, C20268c<Float, C20318t> c20268c, C20268c<Float, C20318t> c20268c2) {
        super(1);
        this.f60384l = j12;
        this.f60385m = c20268c;
        this.f60386n = c20268c2;
    }

    @Override // Y41.l
    public final G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
        androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
        androidx.compose.ui.graphics.drawscope.g.U(gVar2, this.f60384l, (this.f60385m.f().floatValue() * n.d(gVar2.getF39478c().e())) / 2, 0L, this.f60386n.f().floatValue(), null, 0, 116);
        return G0.f406611a;
    }
}
