package androidx.compose.foundation.layout;

import androidx.compose.runtime.F3;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Padding.kt */
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "", "a", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface T1 {
    float a(@Y61.k LayoutDirection layoutDirection);

    /* renamed from: b */
    float getF28523d();

    float c(@Y61.k LayoutDirection layoutDirection);

    /* renamed from: d */
    float getF28521b();

    /* compiled from: Padding.kt */
    @androidx.compose.runtime.H0
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/layout/T1$a;", "Landroidx/compose/foundation/layout/T1;", "Landroidx/compose/ui/unit/h;", "left", "top", "right", "bottom", "<init>", "(FFFFLkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements T1 {

        /* renamed from: a, reason: collision with root package name */
        public final float f28511a;

        /* renamed from: b, reason: collision with root package name */
        public final float f28512b;

        /* renamed from: c, reason: collision with root package name */
        public final float f28513c;

        /* renamed from: d, reason: collision with root package name */
        public final float f28514d;

        public a(float f12, float f13, float f14, float f15, C42822w c42822w) {
            this.f28511a = f12;
            this.f28512b = f13;
            this.f28513c = f14;
            this.f28514d = f15;
            if (!((f12 >= 0.0f) & (f13 >= 0.0f) & (f14 >= 0.0f)) || !(f15 >= 0.0f)) {
                N.a.a("Padding must be non-negative");
            }
        }

        @Override // androidx.compose.foundation.layout.T1
        public final float a(@Y61.k LayoutDirection layoutDirection) {
            return this.f28513c;
        }

        @Override // androidx.compose.foundation.layout.T1
        /* renamed from: b, reason: from getter */
        public final float getF28523d() {
            return this.f28514d;
        }

        @Override // androidx.compose.foundation.layout.T1
        public final float c(@Y61.k LayoutDirection layoutDirection) {
            return this.f28511a;
        }

        @Override // androidx.compose.foundation.layout.T1
        /* renamed from: d, reason: from getter */
        public final float getF28521b() {
            return this.f28512b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return androidx.compose.ui.unit.h.b(this.f28511a, aVar.f28511a) && androidx.compose.ui.unit.h.b(this.f28512b, aVar.f28512b) && androidx.compose.ui.unit.h.b(this.f28513c, aVar.f28513c) && androidx.compose.ui.unit.h.b(this.f28514d, aVar.f28514d);
        }

        public final int hashCode() {
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            return Float.hashCode(this.f28514d) + androidx.appcompat.app.r.d(this.f28513c, androidx.appcompat.app.r.d(this.f28512b, Float.hashCode(this.f28511a) * 31, 31), 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PaddingValues.Absolute(left=");
            androidx.compose.foundation.H.u(this.f28511a, ", top=", sb2);
            androidx.compose.foundation.H.u(this.f28512b, ", right=", sb2);
            androidx.compose.foundation.H.u(this.f28513c, ", bottom=", sb2);
            return androidx.compose.foundation.H.h(')', this.f28514d, sb2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(float f12, float f13, float f14, float f15, int i12, C42822w c42822w) {
            if ((i12 & 1) != 0) {
                f12 = 0;
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
            }
            float f16 = f12;
            if ((i12 & 2) != 0) {
                f13 = 0;
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            }
            float f17 = f13;
            if ((i12 & 4) != 0) {
                f14 = 0;
                h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            }
            float f18 = f14;
            if ((i12 & 8) != 0) {
                f15 = 0;
                h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
            }
            this(f16, f17, f18, f15, null);
        }
    }
}
