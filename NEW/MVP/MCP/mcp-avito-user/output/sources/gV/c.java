package Gv;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.error.ApiError;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryLocationSuggestState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LGv/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f6773b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final a f6774c;

    /* compiled from: DeliveryLocationSuggestState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LGv/c$a;", "", "<init>", "()V", "a", "b", "LGv/c$a$a;", "LGv/c$a$b;", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: DeliveryLocationSuggestState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGv/c$a$a;", "LGv/c$a;", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Gv.c$a$a, reason: collision with other inner class name */
        public static final /* data */ class C0380a extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final List<com.avito.conveyor_item.a> f6775a;

            public C0380a() {
                this(null, 1, null);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0380a) && L.f(this.f6775a, ((C0380a) obj).f6775a);
            }

            public final int hashCode() {
                return this.f6775a.hashCode();
            }

            @k
            public final String toString() {
                return H.p(new StringBuilder("Content(items="), this.f6775a, ')');
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0380a(@k List<? extends com.avito.conveyor_item.a> list) {
                super(null);
                this.f6775a = list;
            }

            public C0380a(List list, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? C42784z0.f406748b : list);
            }
        }

        /* compiled from: DeliveryLocationSuggestState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGv/c$a$b;", "LGv/c$a;", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ApiError f6776a;

            public b(@k ApiError apiError) {
                super(null);
                this.f6776a = apiError;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f6776a, ((b) obj).f6776a);
            }

            public final int hashCode() {
                return this.f6776a.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.n(new StringBuilder("Error(error="), this.f6776a, ')');
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ c(String str, a aVar, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? new a.C0380a(null, 1, null) : aVar);
    }

    public static c a(c cVar, String str, a aVar, int i12) {
        if ((i12 & 1) != 0) {
            str = cVar.f6773b;
        }
        if ((i12 & 2) != 0) {
            aVar = cVar.f6774c;
        }
        cVar.getClass();
        return new c(str, aVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f6773b, cVar.f6773b) && L.f(this.f6774c, cVar.f6774c);
    }

    public final int hashCode() {
        return this.f6774c.hashCode() + (this.f6773b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "DeliveryLocationSuggestState(query=" + this.f6773b + ", contentState=" + this.f6774c + ')';
    }

    public c(@k String str, @k a aVar) {
        this.f6773b = str;
        this.f6774c = aVar;
    }
}
