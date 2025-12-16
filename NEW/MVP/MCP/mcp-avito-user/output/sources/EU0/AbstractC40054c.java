package eU0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: InteractionGroupStrategy.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LeU0/c;", "", "<init>", "()V", "a", "b", "c", "LeU0/c$a;", "LeU0/c$b;", "LeU0/c$c;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eU0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC40054c {

    /* compiled from: InteractionGroupStrategy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LeU0/c$a;", "LeU0/c;", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eU0.c$a */
    public static final /* data */ class a extends AbstractC40054c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f395225a = new a();

        public a() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 303417046;
        }

        @k
        public final String toString() {
            return "Concat";
        }
    }

    /* compiled from: InteractionGroupStrategy.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeU0/c$b;", "LeU0/c;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eU0.c$b */
    public static final /* data */ class b extends AbstractC40054c {

        /* renamed from: a, reason: collision with root package name */
        public final int f395226a;

        public b(int i12) {
            super(null);
            this.f395226a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f395226a == ((b) obj).f395226a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f395226a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("Debounce(delayMs="), this.f395226a, ')');
        }
    }

    /* compiled from: InteractionGroupStrategy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LeU0/c$c;", "LeU0/c;", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eU0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C11086c extends AbstractC40054c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11086c f395227a = new C11086c();

        public C11086c() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11086c);
        }

        public final int hashCode() {
            return -951102410;
        }

        @k
        public final String toString() {
            return "Merge";
        }
    }

    public /* synthetic */ AbstractC40054c(C42822w c42822w) {
        this();
    }

    public AbstractC40054c() {
    }
}
