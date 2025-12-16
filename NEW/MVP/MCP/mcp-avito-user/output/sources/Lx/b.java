package LX;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MallJSInterfaceEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LLX/b;", "", "<init>", "()V", "a", "b", "LLX/b$a;", "LLX/b$b;", "_avito_mall_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class b {

    /* compiled from: MallJSInterfaceEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLX/b$a;", "LLX/b;", "_avito_mall_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f9971a;

        public a(@k String str) {
            super(null);
            this.f9971a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f9971a, ((a) obj).f9971a);
        }

        public final int hashCode() {
            return this.f9971a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Analytics(payload="), this.f9971a, ')');
        }
    }

    /* compiled from: MallJSInterfaceEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLX/b$b;", "LLX/b;", "_avito_mall_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: LX.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0616b extends b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f9972a;

        public C0616b(@k String str) {
            super(null);
            this.f9972a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0616b) && L.f(this.f9972a, ((C0616b) obj).f9972a);
        }

        public final int hashCode() {
            return this.f9972a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Link(deeplink="), this.f9972a, ')');
        }
    }

    public /* synthetic */ b(C42822w c42822w) {
        this();
    }

    public b() {
    }
}
