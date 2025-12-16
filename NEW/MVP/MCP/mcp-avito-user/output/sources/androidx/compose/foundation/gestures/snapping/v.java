package androidx.compose.foundation.gestures.snapping;

import androidx.compose.runtime.F3;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: SnapPosition.kt */
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/v;", "", "a", "b", "c", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface v {

    /* compiled from: SnapPosition.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/v$a;", "Landroidx/compose/foundation/gestures/snapping/v;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements v {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f28055a = new a();

        @Override // androidx.compose.foundation.gestures.snapping.v
        public final int c(int i12, int i13, int i14, int i15) {
            return (((i12 - i14) - i15) / 2) - (i13 / 2);
        }

        @Y61.k
        public final String toString() {
            return "Center";
        }
    }

    /* compiled from: SnapPosition.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/v$b;", "Landroidx/compose/foundation/gestures/snapping/v;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements v {
        static {
            new b();
        }

        @Override // androidx.compose.foundation.gestures.snapping.v
        public final int c(int i12, int i13, int i14, int i15) {
            return ((i12 - i14) - i15) - i13;
        }

        @Y61.k
        public final String toString() {
            return "End";
        }
    }

    /* compiled from: SnapPosition.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/v$c;", "Landroidx/compose/foundation/gestures/snapping/v;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements v {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f28056a = new c();

        @Override // androidx.compose.foundation.gestures.snapping.v
        public final int c(int i12, int i13, int i14, int i15) {
            return 0;
        }

        @Y61.k
        public final String toString() {
            return "Start";
        }
    }

    int c(int i12, int i13, int i14, int i15);
}
