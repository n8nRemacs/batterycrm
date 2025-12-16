package androidx.compose.ui.graphics;

import androidx.compose.runtime.F3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import l0.g;
import l0.n;

/* compiled from: Brush.kt */
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/graphics/J;", "", "<init>", "()V", "a", "Landroidx/compose/ui/graphics/d1;", "Landroidx/compose/ui/graphics/k1;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f39287a = new a(null);

    /* compiled from: Brush.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/J$a;", "", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static C22322z0 a(a aVar, List list, float f12, float f13, int i12) {
            float f14 = (i12 & 2) != 0 ? 0.0f : f12;
            float f15 = (i12 & 4) != 0 ? Float.POSITIVE_INFINITY : f13;
            p1.f39721b.getClass();
            aVar.getClass();
            long jFloatToRawIntBits = (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
            g.a aVar2 = l0.g.f413384b;
            return new C22322z0(list, null, jFloatToRawIntBits, (Float.floatToRawIntBits(f15) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), 0, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @F3
        @Y61.k
        public static C22322z0 b(@Y61.k kotlin.Q[] qArr, long j12, long j13) {
            ArrayList arrayList = new ArrayList(qArr.length);
            for (kotlin.Q q12 : qArr) {
                arrayList.add(T.a(((T) q12.f406620c).f39331a));
            }
            ArrayList arrayList2 = new ArrayList(qArr.length);
            for (kotlin.Q q13 : qArr) {
                arrayList2.add(Float.valueOf(((Number) q13.f406619b).floatValue()));
            }
            return new C22322z0(arrayList, arrayList2, j12, j13, 0, null);
        }

        public static W0 c(a aVar, List list, long j12, float f12) {
            p1.f39721b.getClass();
            aVar.getClass();
            return new W0(list, null, j12, f12, 0, null);
        }

        public static C22322z0 d(a aVar, List list, float f12, float f13, int i12) {
            float f14 = (i12 & 2) != 0 ? 0.0f : f12;
            float f15 = (i12 & 4) != 0 ? Float.POSITIVE_INFINITY : f13;
            p1.f39721b.getClass();
            aVar.getClass();
            long jFloatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L);
            g.a aVar2 = l0.g.f413384b;
            return new C22322z0(list, null, jFloatToRawIntBits, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L), 0, null);
        }

        public a() {
        }
    }

    public /* synthetic */ J(C42822w c42822w) {
        this();
    }

    public abstract void a(float f12, long j12, @Y61.k F0 f02);

    public J() {
        l0.n.f413402b.getClass();
        n.a aVar = l0.n.f413402b;
    }
}
