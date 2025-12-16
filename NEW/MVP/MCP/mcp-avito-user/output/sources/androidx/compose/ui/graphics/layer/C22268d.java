package androidx.compose.ui.graphics.layer;

import androidx.compose.foundation.H;
import androidx.compose.ui.graphics.C22277p;
import androidx.compose.ui.graphics.S;
import androidx.compose.ui.graphics.drawscope.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AndroidGraphicsLayer.android.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.ui.graphics.layer.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22268d extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22267c f39600l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22268d(C22267c c22267c) {
        super(1);
        this.f39600l = c22267c;
    }

    @Override // Y41.l
    public final G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
        androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
        C22267c c22267c = this.f39600l;
        C22277p c22277p = c22267c.f39587l;
        if (c22267c.f39589n && c22267c.f39598w && c22277p != null) {
            S.f39317b.getClass();
            int i12 = S.f39318c;
            a.b f39478c = gVar2.getF39478c();
            long jE2 = f39478c.e();
            f39478c.a().k();
            try {
                f39478c.f39485a.a(c22277p, i12);
                c22267c.c(gVar2);
            } finally {
                H.C(f39478c, jE2);
            }
        } else {
            c22267c.c(gVar2);
        }
        return G0.f406611a;
    }
}
