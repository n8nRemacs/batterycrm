package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.C42822w;

/* compiled from: Result.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\b\u0087@\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0002\u0004\u0005\u0088\u0001\u0006\u0092\u0001\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lkotlin/Z;", "T", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "a", "b", "value", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
@X41.g
/* loaded from: classes8.dex */
public final class Z<T> implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f406624c = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Object f406625b;

    /* compiled from: Result.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/Z$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Result.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/Z$b;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final Throwable f406626b;

        public b(@Y61.k Throwable th2) {
            this.f406626b = th2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (obj instanceof b) {
                if (kotlin.jvm.internal.L.f(this.f406626b, ((b) obj).f406626b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f406626b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Failure("), this.f406626b, ')');
        }
    }

    static {
        new a(null);
    }

    @X
    private /* synthetic */ Z(Object obj) {
        this.f406625b = obj;
    }

    public static final /* synthetic */ Z a(Object obj) {
        return new Z(obj);
    }

    @Y61.l
    public static final Throwable b(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f406626b;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Z) {
            return kotlin.jvm.internal.L.f(this.f406625b, ((Z) obj).f406625b);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f406625b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Y61.k
    public final String toString() {
        Object obj = this.f406625b;
        if (obj instanceof b) {
            return obj.toString();
        }
        return "Success(" + obj + ')';
    }
}
