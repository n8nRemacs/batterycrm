package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import kotlin.Metadata;

/* compiled from: LazyListLayoutInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/Y;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Y {

    /* compiled from: LazyListLayoutInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    default Orientation b() {
        return Orientation.f27425b;
    }

    default long c() {
        androidx.compose.ui.unit.u.f42871b.getClass();
        return 0L;
    }

    default int d() {
        return 0;
    }

    default int e() {
        return 0;
    }

    int f();

    default int g() {
        return 0;
    }

    @Y61.k
    List<K> h();

    int i();

    int j();
}
