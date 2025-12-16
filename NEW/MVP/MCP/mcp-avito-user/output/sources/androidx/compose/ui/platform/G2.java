package androidx.compose.ui.platform;

import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: WindowInfo.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/platform/G2;", "Landroidx/compose/ui/platform/F2;", "<init>", "()V", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class G2 implements F2 {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f41118c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC22204y1<androidx.compose.ui.input.pointer.T> f41119d = C22126m3.g(androidx.compose.ui.input.pointer.T.a(0));

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<androidx.compose.ui.unit.u> f41120a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f41121b;

    /* compiled from: WindowInfo.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/G2$a;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public G2() {
        androidx.compose.ui.unit.u.f42871b.getClass();
        this.f41120a = C22126m3.g(androidx.compose.ui.unit.u.a(0L));
        this.f41121b = C22126m3.g(Boolean.FALSE);
    }

    @Override // androidx.compose.ui.platform.F2
    public final boolean a() {
        return ((Boolean) ((C22082i3) this.f41121b).getF42167b()).booleanValue();
    }

    @Override // androidx.compose.ui.platform.F2
    public final long b() {
        return ((androidx.compose.ui.unit.u) ((C22082i3) this.f41120a).getF42167b()).f42872a;
    }
}
