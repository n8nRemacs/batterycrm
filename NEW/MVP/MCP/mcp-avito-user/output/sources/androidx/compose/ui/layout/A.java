package androidx.compose.ui.layout;

import kotlin.Metadata;
import s0.C47949a;

/* compiled from: LayoutCoordinates.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/A;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface A {

    /* compiled from: LayoutCoordinates.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    long A(long j12);

    default void B(@Y61.k A a12, @Y61.k float[] fArr) {
        C47949a.e("transformFrom is not implemented on this LayoutCoordinates");
    }

    default long M(long j12) {
        l0.g.f413384b.getClass();
        return l0.g.f413386d;
    }

    long O(long j12);

    @Y61.k
    l0.j P(@Y61.k A a12, boolean z12);

    @Y61.l
    A T();

    long a();

    default void a0(@Y61.k float[] fArr) {
        throw new UnsupportedOperationException("transformToScreen is not implemented on this LayoutCoordinates");
    }

    boolean m();

    @Y61.l
    A x();

    long y(long j12);

    long z(@Y61.k A a12, long j12);
}
