package androidx.compose.material3.carousel;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Keyline.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material3/carousel/f;", "Landroidx/compose/material3/carousel/e;", "<init>", "()V", "a", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f36138a = new ArrayList();

    /* compiled from: Keyline.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/carousel/f$a;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class a {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return Float.compare(0.0f, 0.0f) == 0;
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + (Float.hashCode(0.0f) * 31);
        }

        @k
        public final String toString() {
            return "TmpKeyline(size=0.0, isAnchor=false)";
        }
    }

    /* compiled from: Keyline.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[CarouselAlignment.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // androidx.compose.material3.carousel.e
    public final void a() {
        this.f36138a.add(new a());
    }
}
