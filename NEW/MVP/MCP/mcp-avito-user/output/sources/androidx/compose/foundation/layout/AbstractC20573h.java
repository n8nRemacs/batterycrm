package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.C22387u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RowColumnImpl.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/layout/h;", "", "<init>", "()V", "a", "b", "Landroidx/compose/foundation/layout/h$a;", "Landroidx/compose/foundation/layout/h$b;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC20573h {

    /* compiled from: RowColumnImpl.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/h$a;", "Landroidx/compose/foundation/layout/h;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.h$a */
    public static final /* data */ class a extends AbstractC20573h {
        public a() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.AbstractC20573h
        public final int a(@Y61.k androidx.compose.ui.layout.K0 k02) {
            throw null;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return kotlin.jvm.internal.L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @Y61.k
        public final String toString() {
            return "Block(lineProviderBlock=null)";
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/h$b;", "Landroidx/compose/foundation/layout/h;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.h$b */
    public static final /* data */ class b extends AbstractC20573h {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C22387u f28639a;

        public b(@Y61.k C22387u c22387u) {
            super(null);
            this.f28639a = c22387u;
        }

        @Override // androidx.compose.foundation.layout.AbstractC20573h
        public final int a(@Y61.k androidx.compose.ui.layout.K0 k02) {
            return k02.d0(this.f28639a);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.L.f(this.f28639a, ((b) obj).f28639a);
        }

        public final int hashCode() {
            return this.f28639a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Value(alignmentLine=" + this.f28639a + ')';
        }
    }

    public /* synthetic */ AbstractC20573h(C42822w c42822w) {
        this();
    }

    public abstract int a(@Y61.k androidx.compose.ui.layout.K0 k02);

    public AbstractC20573h() {
    }
}
