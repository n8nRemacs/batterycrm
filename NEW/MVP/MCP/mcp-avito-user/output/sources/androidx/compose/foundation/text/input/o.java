package androidx.compose.foundation.text.input;

import androidx.compose.runtime.F3;
import androidx.compose.runtime.H0;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: TextFieldLineLimits.kt */
@F3
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/o;", "", "a", "b", "c", "Landroidx/compose/foundation/text/input/o$b;", "Landroidx/compose/foundation/text/input/o$c;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface o {

    /* compiled from: TextFieldLineLimits.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/input/o$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        static {
            new a();
            new b(0, 0, 3, null);
        }
    }

    /* compiled from: TextFieldLineLimits.kt */
    @H0
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/o$b;", "Landroidx/compose/foundation/text/input/o;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements o {

        /* renamed from: a, reason: collision with root package name */
        public final int f31515a;

        /* renamed from: b, reason: collision with root package name */
        public final int f31516b;

        public b() {
            this(0, 0, 3, null);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f31515a == bVar.f31515a && this.f31516b == bVar.f31516b;
        }

        public final int hashCode() {
            return (this.f31515a * 31) + this.f31516b;
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MultiLine(minHeightInLines=");
            sb2.append(this.f31515a);
            sb2.append(", maxHeightInLines=");
            return androidx.appcompat.app.r.t(sb2, this.f31516b, ')');
        }

        public b(int i12, int i13, int i14, C42822w c42822w) {
            i12 = (i14 & 1) != 0 ? 1 : i12;
            i13 = (i14 & 2) != 0 ? Integer.MAX_VALUE : i13;
            this.f31515a = i12;
            this.f31516b = i13;
            if (1 > i12 || i12 > i13) {
                androidx.compose.foundation.internal.e.a("Expected 1 ≤ minHeightInLines ≤ maxHeightInLines, were " + i12 + ", " + i13);
            }
        }
    }

    /* compiled from: TextFieldLineLimits.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/input/o$c;", "Landroidx/compose/foundation/text/input/o;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements o {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f31517a = 0;

        static {
            new c();
        }

        @Y61.k
        public final String toString() {
            return "TextFieldLineLimits.SingleLine";
        }
    }
}
