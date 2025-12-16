package androidx.compose.foundation.text.handwriting;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.text.input.internal.C20951y;
import androidx.compose.foundation.text.input.internal.InterfaceC20941t;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.focus.InterfaceC22224i;
import androidx.compose.ui.node.C22423m;
import androidx.compose.ui.v;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;

/* compiled from: HandwritingHandler.android.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/handwriting/e;", "Landroidx/compose/ui/focus/i;", "Landroidx/compose/ui/v$d;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class e extends v.d implements InterfaceC22224i {

    /* renamed from: p, reason: collision with root package name */
    @l
    public FocusStateImpl f30727p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final Object f30728q = C42727D.b(LazyThreadSafetyMode.f406616d, new a());

    /* compiled from: HandwritingHandler.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/t;", "invoke", "()Landroidx/compose/foundation/text/input/internal/t;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<InterfaceC20941t> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final InterfaceC20941t invoke() {
            return C20951y.a(C22423m.a(e.this));
        }
    }

    @Override // androidx.compose.ui.focus.InterfaceC22224i
    public final void u(@k FocusStateImpl focusStateImpl) {
        if (L.f(this.f30727p, focusStateImpl)) {
            return;
        }
        this.f30727p = focusStateImpl;
        if (focusStateImpl.b()) {
            C43259k.d(Y1(), null, null, new f(this, null), 3);
        }
    }
}
