package VI;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.hotel_booking.Value;
import com.avito.android.remote.model.ParametrizedEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectSingleValueState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LVI/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c extends q {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f17054h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final c f17055i = new c(null, null, null, null, false, new d(null, null, false));

    /* renamed from: b, reason: collision with root package name */
    @l
    public final List<Value> f17056b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ParametrizedEvent f17057c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Value f17058d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Value f17059e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f17060f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final d f17061g;

    /* compiled from: SelectSingleValueState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVI/c$a;", "", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@l List<Value> list, @l ParametrizedEvent parametrizedEvent, @l Value value, @l Value value2, boolean z12, @k d dVar) {
        this.f17056b = list;
        this.f17057c = parametrizedEvent;
        this.f17058d = value;
        this.f17059e = value2;
        this.f17060f = z12;
        this.f17061g = dVar;
    }

    public static c a(c cVar, List list, ParametrizedEvent parametrizedEvent, Value value, Value value2, boolean z12, d dVar, int i12) {
        if ((i12 & 1) != 0) {
            list = cVar.f17056b;
        }
        List list2 = list;
        if ((i12 & 2) != 0) {
            parametrizedEvent = cVar.f17057c;
        }
        ParametrizedEvent parametrizedEvent2 = parametrizedEvent;
        if ((i12 & 4) != 0) {
            value = cVar.f17058d;
        }
        Value value3 = value;
        if ((i12 & 8) != 0) {
            value2 = cVar.f17059e;
        }
        Value value4 = value2;
        if ((i12 & 16) != 0) {
            z12 = cVar.f17060f;
        }
        boolean z13 = z12;
        if ((i12 & 32) != 0) {
            dVar = cVar.f17061g;
        }
        cVar.getClass();
        return new c(list2, parametrizedEvent2, value3, value4, z13, dVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f17056b, cVar.f17056b) && L.f(this.f17057c, cVar.f17057c) && L.f(this.f17058d, cVar.f17058d) && L.f(this.f17059e, cVar.f17059e) && this.f17060f == cVar.f17060f && L.f(this.f17061g, cVar.f17061g);
    }

    public final int hashCode() {
        List<Value> list = this.f17056b;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        ParametrizedEvent parametrizedEvent = this.f17057c;
        int iHashCode2 = (iHashCode + (parametrizedEvent == null ? 0 : parametrizedEvent.hashCode())) * 31;
        Value value = this.f17058d;
        int iHashCode3 = (iHashCode2 + (value == null ? 0 : value.hashCode())) * 31;
        Value value2 = this.f17059e;
        return this.f17061g.hashCode() + r.i((iHashCode3 + (value2 != null ? value2.hashCode() : 0)) * 31, 31, this.f17060f);
    }

    @k
    public final String toString() {
        return "SelectSingleValueState(values=" + this.f17056b + ", onClickEvent=" + this.f17057c + ", initialSelectedValue=" + this.f17058d + ", selectedValue=" + this.f17059e + ", isValueChanged=" + this.f17060f + ", viewState=" + this.f17061g + ')';
    }
}
