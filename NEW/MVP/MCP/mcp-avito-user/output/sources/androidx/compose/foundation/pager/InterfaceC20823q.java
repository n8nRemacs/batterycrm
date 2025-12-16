package androidx.compose.foundation.pager;

import androidx.compose.runtime.F3;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PageSize.kt */
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/pager/q;", "", "a", "b", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.pager.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC20823q {

    /* compiled from: PageSize.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/pager/q$b;", "Landroidx/compose/foundation/pager/q;", "Landroidx/compose/ui/unit/h;", "pageSize", "<init>", "(FLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.pager.q$b */
    public static final class b implements InterfaceC20823q {

        /* renamed from: a, reason: collision with root package name */
        public final float f30025a;

        public b(float f12, C42822w c42822w) {
            this.f30025a = f12;
        }

        @Override // androidx.compose.foundation.pager.InterfaceC20823q
        public final int a(@Y61.k androidx.compose.foundation.lazy.layout.Q q12, int i12) {
            return q12.y0(this.f30025a);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return androidx.compose.ui.unit.h.b(this.f30025a, ((b) obj).f30025a);
        }

        public final int hashCode() {
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            return Float.hashCode(this.f30025a);
        }
    }

    int a(@Y61.k androidx.compose.foundation.lazy.layout.Q q12, int i12);

    /* compiled from: PageSize.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/pager/q$a;", "Landroidx/compose/foundation/pager/q;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.pager.q$a */
    public static final class a implements InterfaceC20823q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f30024a = new a();

        @Override // androidx.compose.foundation.pager.InterfaceC20823q
        public final int a(@Y61.k androidx.compose.foundation.lazy.layout.Q q12, int i12) {
            return i12;
        }
    }
}
