package kotlinx.datetime.format;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: LocalDateFormat.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/datetime/format/k0;", "", "a", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.datetime.format.k0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43343k0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f412429b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C43343k0 f412430c;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<String> f412431a;

    /* compiled from: LocalDateFormat.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/datetime/format/k0$a;", "", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.datetime.format.k0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: LocalDateFormat.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.datetime.format.k0$b */
    public /* synthetic */ class b extends kotlin.jvm.internal.H implements Y41.l<String, String> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f412432b = new b();

        public b() {
            super(1, String.class, "toString", "toString()Ljava/lang/String;", 0);
        }

        @Override // Y41.l
        public final String invoke(String str) {
            return str.toString();
        }
    }

    static {
        new C43343k0(C42745f0.U("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"));
        f412430c = new C43343k0(C42745f0.U("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"));
    }

    public C43343k0(@Y61.k List<String> list) {
        this.f412431a = list;
        if (list.size() != 12) {
            throw new IllegalArgumentException("Month names must contain exactly 12 elements");
        }
        kotlin.ranges.k it = C42745f0.I(list).iterator();
        while (it.f406910d) {
            int iA2 = it.a();
            if (this.f412431a.get(iA2).length() <= 0) {
                throw new IllegalArgumentException("A month name can not be empty");
            }
            for (int i12 = 0; i12 < iA2; i12++) {
                if (kotlin.jvm.internal.L.f(this.f412431a.get(iA2), this.f412431a.get(i12))) {
                    throw new IllegalArgumentException(AK.c.s(new StringBuilder("Month names must be unique, but '"), this.f412431a.get(iA2), "' was repeated").toString());
                }
            }
        }
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof C43343k0) {
            if (kotlin.jvm.internal.L.f(this.f412431a, ((C43343k0) obj).f412431a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f412431a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C42745f0.O(this.f412431a, ", ", "MonthNames(", ")", b.f412432b, 24);
    }
}
