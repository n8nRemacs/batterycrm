package TI;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.hotel_booking.RadioItem;
import com.avito.android.remote.model.ParametrizedEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectRadioState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LTI/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c extends q {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f15519h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final c f15520i = new c(null, null, null, null, false, new d(null, null, false));

    /* renamed from: b, reason: collision with root package name */
    @l
    public final List<RadioItem> f15521b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ParametrizedEvent f15522c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final RadioItem f15523d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final RadioItem f15524e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f15525f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final d f15526g;

    /* compiled from: SelectRadioState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTI/c$a;", "", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@l List<RadioItem> list, @l ParametrizedEvent parametrizedEvent, @l RadioItem radioItem, @l RadioItem radioItem2, boolean z12, @k d dVar) {
        this.f15521b = list;
        this.f15522c = parametrizedEvent;
        this.f15523d = radioItem;
        this.f15524e = radioItem2;
        this.f15525f = z12;
        this.f15526g = dVar;
    }

    public static c a(c cVar, List list, ParametrizedEvent parametrizedEvent, RadioItem radioItem, RadioItem radioItem2, boolean z12, d dVar, int i12) {
        if ((i12 & 1) != 0) {
            list = cVar.f15521b;
        }
        List list2 = list;
        if ((i12 & 2) != 0) {
            parametrizedEvent = cVar.f15522c;
        }
        ParametrizedEvent parametrizedEvent2 = parametrizedEvent;
        if ((i12 & 4) != 0) {
            radioItem = cVar.f15523d;
        }
        RadioItem radioItem3 = radioItem;
        if ((i12 & 8) != 0) {
            radioItem2 = cVar.f15524e;
        }
        RadioItem radioItem4 = radioItem2;
        if ((i12 & 16) != 0) {
            z12 = cVar.f15525f;
        }
        boolean z13 = z12;
        if ((i12 & 32) != 0) {
            dVar = cVar.f15526g;
        }
        cVar.getClass();
        return new c(list2, parametrizedEvent2, radioItem3, radioItem4, z13, dVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f15521b, cVar.f15521b) && L.f(this.f15522c, cVar.f15522c) && L.f(this.f15523d, cVar.f15523d) && L.f(this.f15524e, cVar.f15524e) && this.f15525f == cVar.f15525f && L.f(this.f15526g, cVar.f15526g);
    }

    public final int hashCode() {
        List<RadioItem> list = this.f15521b;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        ParametrizedEvent parametrizedEvent = this.f15522c;
        int iHashCode2 = (iHashCode + (parametrizedEvent == null ? 0 : parametrizedEvent.hashCode())) * 31;
        RadioItem radioItem = this.f15523d;
        int iHashCode3 = (iHashCode2 + (radioItem == null ? 0 : radioItem.hashCode())) * 31;
        RadioItem radioItem2 = this.f15524e;
        return this.f15526g.hashCode() + r.i((iHashCode3 + (radioItem2 != null ? radioItem2.hashCode() : 0)) * 31, 31, this.f15525f);
    }

    @k
    public final String toString() {
        return "SelectRadioState(items=" + this.f15521b + ", onClickEvent=" + this.f15522c + ", initialSelectedItem=" + this.f15523d + ", selectedItem=" + this.f15524e + ", isValueChanged=" + this.f15525f + ", viewState=" + this.f15526g + ')';
    }
}
