package androidx.compose.material3.carousel;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: Strategy.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/carousel/g;", "", "a", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f36139c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<d> f36140a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<d> f36141b;

    /* compiled from: Strategy.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material3/carousel/g$a;", "", "<init>", "()V", "a", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* compiled from: Strategy.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/carousel/g$a$a;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material3.carousel.g$a$a, reason: collision with other inner class name */
        public static final /* data */ class C1642a {
            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1642a)) {
                    return false;
                }
                ((C1642a) obj).getClass();
                return Float.compare(0.0f, 0.0f) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(0.0f) + r.e(0, Integer.hashCode(0) * 31, 31);
            }

            @k
            public final String toString() {
                return "ShiftPointRange(fromStepIndex=0, toStepIndex=0, steppedInterpolation=0.0)";
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g() {
        throw null;
    }

    public g(d dVar, List list, List list2, float f12, float f13, androidx.collection.r rVar, androidx.collection.r rVar2, C42822w c42822w) {
        this.f36140a = list;
        this.f36141b = list2;
    }
}
