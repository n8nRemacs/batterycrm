package androidx.compose.foundation.draganddrop;

import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.layer.C22267c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AndroidDragAndDropSource.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/draganddrop/c;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public C22267c f27094a;

    /* compiled from: AndroidDragAndDropSource.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/d;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.d, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f27095l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
            dVar.y1();
            return G0.f406611a;
        }
    }

    /* compiled from: AndroidDragAndDropSource.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/d;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.d, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
            androidx.compose.ui.graphics.layer.h.a(dVar, c.this.f27094a);
            return G0.f406611a;
        }
    }

    @Y61.k
    public final androidx.compose.ui.draw.p a(@Y61.k androidx.compose.ui.draw.i iVar) {
        C22267c c22267cA = iVar.f39049e.invoke().a();
        androidx.compose.ui.draw.i.r(iVar, c22267cA, a.f27095l);
        this.f27094a = c22267cA;
        return iVar.m(new b());
    }
}
