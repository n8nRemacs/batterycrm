package androidx.compose.ui.platform;

import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Metadata;

/* compiled from: AndroidWindowInfo.android.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/D1;", "Landroidx/compose/ui/platform/F2;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class D1 implements F2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public Y41.a<androidx.compose.ui.unit.u> f41098a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public InterfaceC22204y1<androidx.compose.ui.unit.u> f41099b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f41100c = C22126m3.g(Boolean.FALSE);

    @Override // androidx.compose.ui.platform.F2
    public final boolean a() {
        return ((Boolean) ((C22082i3) this.f41100c).getF42167b()).booleanValue();
    }

    @Override // androidx.compose.ui.platform.F2
    public final long b() {
        long j12;
        if (this.f41099b == null) {
            Y41.a<androidx.compose.ui.unit.u> aVar = this.f41098a;
            if (aVar != null) {
                j12 = ((androidx.compose.ui.unit.u) ((AndroidComposeView.p) aVar).invoke()).f42872a;
            } else {
                androidx.compose.ui.unit.u.f42871b.getClass();
                j12 = 0;
            }
            this.f41099b = C22126m3.g(androidx.compose.ui.unit.u.a(j12));
            this.f41098a = null;
        }
        return ((androidx.compose.ui.unit.u) ((C22082i3) this.f41099b).getF42167b()).f42872a;
    }
}
