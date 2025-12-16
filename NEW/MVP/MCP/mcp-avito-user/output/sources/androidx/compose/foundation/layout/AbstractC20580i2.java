package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.AbstractC20573h;
import androidx.compose.foundation.layout.AbstractC20606p0;
import androidx.compose.ui.layout.C22387u;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RowColumnImpl.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/layout/i2;", "Landroidx/compose/ui/node/M0;", "Landroidx/compose/ui/v$d;", "<init>", "()V", "a", "b", "Landroidx/compose/foundation/layout/i2$a;", "Landroidx/compose/foundation/layout/i2$b;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.i2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC20580i2 extends v.d implements androidx.compose.ui.node.M0 {

    /* compiled from: RowColumnImpl.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/i2$a;", "Landroidx/compose/foundation/layout/i2;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.i2$a */
    public static final class a extends AbstractC20580i2 {
        public a() {
            throw null;
        }

        @Override // androidx.compose.ui.node.M0
        @Y61.k
        public final Object r(@Y61.k androidx.compose.ui.unit.d dVar, @Y61.l Object obj) {
            C20558d2 c20558d2 = obj instanceof C20558d2 ? (C20558d2) obj : null;
            if (c20558d2 == null) {
                c20558d2 = new C20558d2(0.0f, false, null, null, 15, null);
            }
            AbstractC20606p0.c cVar = AbstractC20606p0.f28701a;
            AbstractC20573h.a aVar = new AbstractC20573h.a(null);
            cVar.getClass();
            c20558d2.f28596c = new AbstractC20606p0.a(aVar);
            return c20558d2;
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/i2$b;", "Landroidx/compose/foundation/layout/i2;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.i2$b */
    public static final class b extends AbstractC20580i2 {

        /* renamed from: p, reason: collision with root package name */
        @Y61.k
        public C22387u f28647p;

        @Override // androidx.compose.ui.node.M0
        @Y61.k
        public final Object r(@Y61.k androidx.compose.ui.unit.d dVar, @Y61.l Object obj) {
            C20558d2 c20558d2 = obj instanceof C20558d2 ? (C20558d2) obj : null;
            if (c20558d2 == null) {
                c20558d2 = new C20558d2(0.0f, false, null, null, 15, null);
            }
            AbstractC20606p0.c cVar = AbstractC20606p0.f28701a;
            AbstractC20573h.b bVar = new AbstractC20573h.b(this.f28647p);
            cVar.getClass();
            c20558d2.f28596c = new AbstractC20606p0.a(bVar);
            return c20558d2;
        }
    }

    public /* synthetic */ AbstractC20580i2(C42822w c42822w) {
        this();
    }

    public AbstractC20580i2() {
    }
}
