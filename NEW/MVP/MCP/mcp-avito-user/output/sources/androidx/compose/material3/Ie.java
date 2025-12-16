package androidx.compose.material3;

import androidx.compose.foundation.gestures.Orientation;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;

/* compiled from: SheetDefaults.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/Ie;", "Landroidx/compose/ui/input/nestedscroll/a;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Ie implements androidx.compose.ui.input.nestedscroll.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Me f34885b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Float, kotlin.G0> f34886c;

    public Ie(Me me2, Y41.l lVar) {
        Orientation orientation = Orientation.f27425b;
        this.f34885b = me2;
        this.f34886c = lVar;
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    @Y61.l
    public final Object U0(long j12, long j13, @Y61.k Continuation<? super androidx.compose.ui.unit.B> continuation) {
        Orientation orientation = Orientation.f27425b;
        this.f34886c.invoke(Boxing.boxFloat(androidx.compose.ui.unit.B.d(j13)));
        return androidx.compose.ui.unit.B.a(j13);
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long a1(int i12, long j12) {
        Orientation orientation = Orientation.f27425b;
        float fH2 = l0.g.h(j12);
        if (fH2 < 0.0f) {
            androidx.compose.ui.input.nestedscroll.i.f40105b.getClass();
            if (androidx.compose.ui.input.nestedscroll.i.a(i12, androidx.compose.ui.input.nestedscroll.i.f40108e)) {
                return l0.h.a(0.0f, this.f34885b.f35135c.d(fH2));
            }
        }
        l0.g.f413384b.getClass();
        return 0L;
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long h1(int i12, long j12, long j13) {
        androidx.compose.ui.input.nestedscroll.i.f40105b.getClass();
        if (!androidx.compose.ui.input.nestedscroll.i.a(i12, androidx.compose.ui.input.nestedscroll.i.f40108e)) {
            l0.g.f413384b.getClass();
            return 0L;
        }
        C21916v<SheetValue> c21916v = this.f34885b.f35135c;
        Orientation orientation = Orientation.f27425b;
        return l0.h.a(0.0f, c21916v.d(l0.g.h(j13)));
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    @Y61.l
    public final Object k0(long j12, @Y61.k Continuation<? super androidx.compose.ui.unit.B> continuation) {
        Orientation orientation = Orientation.f27425b;
        float fD2 = androidx.compose.ui.unit.B.d(j12);
        Me me2 = this.f34885b;
        float fG2 = me2.f35135c.g();
        float fE2 = me2.f35135c.e().e();
        if (fD2 >= 0.0f || fG2 <= fE2) {
            androidx.compose.ui.unit.B.f42836b.getClass();
            j12 = 0;
        } else {
            this.f34886c.invoke(Boxing.boxFloat(fD2));
        }
        return androidx.compose.ui.unit.B.a(j12);
    }
}
