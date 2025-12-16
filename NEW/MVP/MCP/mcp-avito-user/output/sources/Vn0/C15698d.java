package Vn0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UniversalDeliveryTypeShippingCompetitionState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LVn0/d;", "", "a", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Vn0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C15698d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final a f17378a;

    /* compiled from: UniversalDeliveryTypeShippingCompetitionState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LVn0/d$a;", "", "<init>", "()V", "a", "b", "LVn0/d$a$a;", "LVn0/d$a$b;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vn0.d$a */
    public static abstract class a {

        /* compiled from: UniversalDeliveryTypeShippingCompetitionState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVn0/d$a$a;", "LVn0/d$a;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Vn0.d$a$a, reason: collision with other inner class name */
        public static final /* data */ class C1198a extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f17379a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f17380b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f17381c;

            /* JADX WARN: Multi-variable type inference failed */
            public C1198a(@k String str, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list, boolean z12) {
                super(null);
                this.f17379a = str;
                this.f17380b = list;
                this.f17381c = z12;
            }

            public static C1198a a(C1198a c1198a, List list, boolean z12, int i12) {
                String str = c1198a.f17379a;
                if ((i12 & 2) != 0) {
                    list = c1198a.f17380b;
                }
                if ((i12 & 4) != 0) {
                    z12 = c1198a.f17381c;
                }
                c1198a.getClass();
                return new C1198a(str, list, z12);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1198a)) {
                    return false;
                }
                C1198a c1198a = (C1198a) obj;
                return L.f(this.f17379a, c1198a.f17379a) && L.f(this.f17380b, c1198a.f17380b) && this.f17381c == c1198a.f17381c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f17381c) + H.e(this.f17379a.hashCode() * 31, 31, this.f17380b);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Content(mainFormId=");
                sb2.append(this.f17379a);
                sb2.append(", mainComponents=");
                sb2.append(this.f17380b);
                sb2.append(", isExecutingRequest=");
                return r.x(sb2, this.f17381c, ')');
            }
        }

        /* compiled from: UniversalDeliveryTypeShippingCompetitionState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVn0/d$a$b;", "LVn0/d$a;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Vn0.d$a$b */
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f17382a = new b();

            public b() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 137537631;
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
    public C15698d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15698d) && L.f(this.f17378a, ((C15698d) obj).f17378a);
    }

    public final int hashCode() {
        return this.f17378a.hashCode();
    }

    @k
    public final String toString() {
        return "UniversalDeliveryTypeShippingCompetitionState(contentState=" + this.f17378a + ')';
    }

    public C15698d(@k a aVar) {
        this.f17378a = aVar;
    }

    public /* synthetic */ C15698d(a aVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? a.b.f17382a : aVar);
    }
}
