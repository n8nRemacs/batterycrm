package OM0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.verification.inn.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FetchInvoiceState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LOM0/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "a", "b", "c", "LOM0/d$a;", "LOM0/d$b;", "LOM0/d$c;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class d extends q {

    /* compiled from: FetchInvoiceState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOM0/d$a;", "LOM0/d;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends d {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f12216b;

        public a(@k String str) {
            super(null);
            this.f12216b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f12216b, ((a) obj).f12216b);
        }

        public final int hashCode() {
            return this.f12216b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Error(message="), this.f12216b, ')');
        }
    }

    /* compiled from: FetchInvoiceState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOM0/d$b;", "LOM0/d;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends d {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f12217b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final a.C10030a f12218c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final OM0.a f12219d;

        public b(boolean z12, @k a.C10030a c10030a, @k OM0.a aVar) {
            super(null);
            this.f12217b = z12;
            this.f12218c = c10030a;
            this.f12219d = aVar;
        }

        public static b a(b bVar, a.C10030a c10030a) {
            boolean z12 = bVar.f12217b;
            OM0.a aVar = bVar.f12219d;
            bVar.getClass();
            return new b(z12, c10030a, aVar);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f12217b == bVar.f12217b && L.f(this.f12218c, bVar.f12218c) && L.f(this.f12219d, bVar.f12219d);
        }

        public final int hashCode() {
            return this.f12219d.hashCode() + ((this.f12218c.hashCode() + (Boolean.hashCode(this.f12217b) * 31)) * 31);
        }

        @k
        public final String toString() {
            return "Loaded(isClosable=" + this.f12217b + ", listState=" + this.f12218c + ", actionButtonState=" + this.f12219d + ')';
        }
    }

    /* compiled from: FetchInvoiceState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOM0/d$c;", "LOM0/d;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends d {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final c f12220b = new c();

        public c() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 517324945;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ d(C42822w c42822w) {
        this();
    }

    public d() {
    }
}
