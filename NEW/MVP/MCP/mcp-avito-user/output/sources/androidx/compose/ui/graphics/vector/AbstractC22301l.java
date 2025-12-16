package androidx.compose.ui.graphics.vector;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Vector.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/graphics/vector/l;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/vector/c;", "Landroidx/compose/ui/graphics/vector/g;", "Landroidx/compose/ui/graphics/vector/n;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.graphics.vector.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC22301l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super AbstractC22301l, G0> f39998a;

    public /* synthetic */ AbstractC22301l(C42822w c42822w) {
        this();
    }

    public abstract void a(@Y61.k androidx.compose.ui.graphics.drawscope.g gVar);

    @Y61.l
    public Y41.l<AbstractC22301l, G0> b() {
        return this.f39998a;
    }

    public final void c() {
        Y41.l<AbstractC22301l, G0> lVarB = b();
        if (lVarB != null) {
            lVarB.invoke(this);
        }
    }

    public void d(@Y61.l Y41.l<? super AbstractC22301l, G0> lVar) {
        this.f39998a = lVar;
    }

    public AbstractC22301l() {
    }
}
