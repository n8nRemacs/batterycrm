package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FlowLayoutOverflow;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FlowLayoutOverflow.kt */
@InterfaceC20625u0
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/F0;", "Landroidx/compose/foundation/layout/FlowLayoutOverflow;", "a", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes.dex */
public final class F0 extends FlowLayoutOverflow {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f28250f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final F0 f28251g;

    /* compiled from: FlowLayoutOverflow.kt */
    @InterfaceC20625u0
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/F0$a;", "", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InterfaceC42830m
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new F0(FlowLayoutOverflow.OverflowType.f28263b, 0, 0, null, null, 30, null);
        f28251g = new F0(FlowLayoutOverflow.OverflowType.f28264c, 0, 0, null, null, 30, null);
    }

    public F0() {
        throw null;
    }

    public F0(FlowLayoutOverflow.OverflowType overflowType, int i12, int i13, Y41.l lVar, Y41.l lVar2, int i14, C42822w c42822w) {
        super(overflowType, (i14 & 2) != 0 ? 0 : i12, (i14 & 4) != 0 ? 0 : i13, (i14 & 8) != 0 ? null : lVar, (i14 & 16) != 0 ? null : lVar2, null);
    }

    public F0(FlowLayoutOverflow.OverflowType overflowType, int i12, int i13, Y41.l lVar, Y41.l lVar2, C42822w c42822w) {
        super(overflowType, i12, i13, lVar, lVar2, null);
    }
}
