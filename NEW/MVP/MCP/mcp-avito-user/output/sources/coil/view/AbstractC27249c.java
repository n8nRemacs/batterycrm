package coil.view;

import X41.f;
import Y61.k;
import Y61.l;
import j.U;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: Dimension.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcoil/size/c;", "", "<init>", "()V", "a", "b", "Lcoil/size/c$a;", "Lcoil/size/c$b;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: coil.size.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC27249c {

    /* compiled from: Dimension.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/size/c$a;", "Lcoil/size/c;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: coil.size.c$a */
    public static final class a extends AbstractC27249c {

        /* renamed from: a, reason: collision with root package name */
        @f
        public final int f58759a;

        public a(@U int i12) {
            super(null);
            this.f58759a = i12;
            if (i12 <= 0) {
                throw new IllegalArgumentException("px must be > 0.");
            }
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                if (this.f58759a == ((a) obj).f58759a) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: hashCode, reason: from getter */
        public final int getF58759a() {
            return this.f58759a;
        }

        @k
        public final String toString() {
            return String.valueOf(this.f58759a);
        }
    }

    /* compiled from: Dimension.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcoil/size/c$b;", "Lcoil/size/c;", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: coil.size.c$b */
    public static final class b extends AbstractC27249c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f58760a = new b();

        public b() {
            super(null);
        }

        @k
        public final String toString() {
            return "Dimension.Undefined";
        }
    }

    public /* synthetic */ AbstractC27249c(C42822w c42822w) {
        this();
    }

    public AbstractC27249c() {
    }
}
