package Un0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UniversalDeliveryTypeState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LUn0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Un0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C15542c extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f16593b;

    /* compiled from: UniversalDeliveryTypeState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LUn0/c$a;", "", "<init>", "()V", "a", "b", "c", "LUn0/c$a$a;", "LUn0/c$a$b;", "LUn0/c$a$c;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Un0.c$a */
    public static abstract class a {

        /* compiled from: UniversalDeliveryTypeState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUn0/c$a$a;", "LUn0/c$a;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Un0.c$a$a, reason: collision with other inner class name */
        public static final /* data */ class C1145a extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final UniversalDeliveryTypeContent f16594a;

            /* renamed from: b, reason: collision with root package name */
            public final int f16595b;

            public C1145a(@k UniversalDeliveryTypeContent universalDeliveryTypeContent, int i12) {
                super(null);
                this.f16594a = universalDeliveryTypeContent;
                this.f16595b = i12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1145a)) {
                    return false;
                }
                C1145a c1145a = (C1145a) obj;
                return L.f(this.f16594a, c1145a.f16594a) && this.f16595b == c1145a.f16595b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f16595b) + (this.f16594a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Content(content=");
                sb2.append(this.f16594a);
                sb2.append(", selectedTabIndex=");
                return r.t(sb2, this.f16595b, ')');
            }
        }

        /* compiled from: UniversalDeliveryTypeState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUn0/c$a$b;", "LUn0/c$a;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Un0.c$a$b */
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ApiError f16596a;

            public b(@k ApiError apiError) {
                super(null);
                this.f16596a = apiError;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f16596a, ((b) obj).f16596a);
            }

            public final int hashCode() {
                return this.f16596a.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.n(new StringBuilder("Failed(error="), this.f16596a, ')');
            }
        }

        /* compiled from: UniversalDeliveryTypeState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUn0/c$a$c;", "LUn0/c$a;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Un0.c$a$c, reason: collision with other inner class name */
        public static final /* data */ class C1146c extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C1146c f16597a = new C1146c();

            public C1146c() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C1146c);
            }

            public final int hashCode() {
                return 1646916998;
            }

            @k
            public final String toString() {
                return "Loading";
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C15542c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15542c) && L.f(this.f16593b, ((C15542c) obj).f16593b);
    }

    public final int hashCode() {
        return this.f16593b.hashCode();
    }

    @k
    public final String toString() {
        return "UniversalDeliveryTypeState(contentState=" + this.f16593b + ')';
    }

    public /* synthetic */ C15542c(a aVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? a.C1146c.f16597a : aVar);
    }

    public C15542c(@k a aVar) {
        this.f16593b = aVar;
    }
}
