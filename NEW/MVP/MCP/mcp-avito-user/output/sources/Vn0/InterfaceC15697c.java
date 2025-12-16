package Vn0;

import Y61.k;
import Y61.l;
import com.avito.android.map_core.beduin.BeduinDeliveryMethodSelectTabAction;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UniversalDeliveryTypeShippingCompetitionOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LVn0/c;", "", "a", "b", "LVn0/c$a;", "LVn0/c$b;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Vn0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC15697c {

    /* compiled from: UniversalDeliveryTypeShippingCompetitionOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVn0/c$a;", "LVn0/c;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vn0.c$a */
    public static final /* data */ class a implements InterfaceC15697c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BeduinDeliveryMethodSelectTabAction f17376a;

        public a(@k BeduinDeliveryMethodSelectTabAction beduinDeliveryMethodSelectTabAction) {
            this.f17376a = beduinDeliveryMethodSelectTabAction;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f17376a, ((a) obj).f17376a);
        }

        public final int hashCode() {
            return this.f17376a.hashCode();
        }

        @k
        public final String toString() {
            return "OnTabSelectAction(tabSelectAction=" + this.f17376a + ')';
        }
    }

    /* compiled from: UniversalDeliveryTypeShippingCompetitionOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVn0/c$b;", "LVn0/c;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vn0.c$b */
    public static final /* data */ class b implements InterfaceC15697c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f17377a;

        public b(@k ApiError apiError) {
            this.f17377a = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f17377a, ((b) obj).f17377a);
        }

        public final int hashCode() {
            return this.f17377a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("ShowExecutingError(error="), this.f17377a, ')');
        }
    }
}
