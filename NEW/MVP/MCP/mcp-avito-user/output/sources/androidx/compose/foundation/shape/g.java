package androidx.compose.foundation.shape;

import androidx.compose.runtime.F3;
import androidx.compose.ui.platform.InterfaceC22531u1;
import kotlin.Metadata;

/* compiled from: CornerSize.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g {

    /* compiled from: CornerSize.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"androidx/compose/foundation/shape/g$a", "Landroidx/compose/foundation/shape/f;", "Landroidx/compose/ui/platform/u1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements f, InterfaceC22531u1 {
        @Override // androidx.compose.foundation.shape.f
        public final float a(long j12, androidx.compose.ui.unit.d dVar) {
            return 0.0f;
        }

        public final String toString() {
            return "ZeroCornerSize";
        }
    }

    static {
        new a();
    }

    @F3
    @Y61.k
    public static final f a() {
        return new l(50);
    }

    @F3
    @Y61.k
    public static final f b(float f12) {
        return new j(f12, null);
    }
}
