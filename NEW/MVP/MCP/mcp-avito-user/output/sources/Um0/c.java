package UM0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.verification.inn.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InputBillAmountState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LUM0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "a", "b", "c", "LUM0/c$a;", "LUM0/c$b;", "LUM0/c$c;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class c extends q {

    /* compiled from: InputBillAmountState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUM0/c$a;", "LUM0/c;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f16359b;

        public a(@k String str) {
            super(null);
            this.f16359b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f16359b, ((a) obj).f16359b);
        }

        public final int hashCode() {
            return this.f16359b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Error(message="), this.f16359b, ')');
        }
    }

    /* compiled from: InputBillAmountState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUM0/c$b;", "LUM0/c;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UU.a f16360b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final a.C10030a f16361c;

        public b(@k UU.a aVar, @k a.C10030a c10030a) {
            super(null);
            this.f16360b = aVar;
            this.f16361c = c10030a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f16360b, bVar.f16360b) && L.f(this.f16361c, bVar.f16361c);
        }

        public final int hashCode() {
            return this.f16361c.hashCode() + (this.f16360b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "Loaded(buttonState=" + this.f16360b + ", listState=" + this.f16361c + ')';
        }
    }

    /* compiled from: InputBillAmountState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUM0/c$c;", "LUM0/c;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: UM0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C1120c extends c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C1120c f16362b = new C1120c();

        public C1120c() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1120c);
        }

        public final int hashCode() {
            return -2137439932;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ c(C42822w c42822w) {
        this();
    }

    public c() {
    }
}
