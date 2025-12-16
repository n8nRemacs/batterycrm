package QI;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.hotel_booking.Group;
import com.avito.android.remote.model.ParametrizedEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EnterDataState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LQI/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c extends q {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f13663g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final c f13664h = new c(null, null, null, false, new d(null, false, true));

    /* renamed from: b, reason: collision with root package name */
    @l
    public final List<Group> f13665b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ParametrizedEvent f13666c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final List<Group> f13667d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f13668e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final d f13669f;

    /* compiled from: EnterDataState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQI/c$a;", "", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@l List<Group> list, @l ParametrizedEvent parametrizedEvent, @l List<Group> list2, boolean z12, @k d dVar) {
        this.f13665b = list;
        this.f13666c = parametrizedEvent;
        this.f13667d = list2;
        this.f13668e = z12;
        this.f13669f = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c a(c cVar, List list, ParametrizedEvent parametrizedEvent, ArrayList arrayList, boolean z12, d dVar, int i12) {
        if ((i12 & 1) != 0) {
            list = cVar.f13665b;
        }
        List list2 = list;
        if ((i12 & 2) != 0) {
            parametrizedEvent = cVar.f13666c;
        }
        ParametrizedEvent parametrizedEvent2 = parametrizedEvent;
        List list3 = arrayList;
        if ((i12 & 4) != 0) {
            list3 = cVar.f13667d;
        }
        List list4 = list3;
        if ((i12 & 8) != 0) {
            z12 = cVar.f13668e;
        }
        boolean z13 = z12;
        if ((i12 & 16) != 0) {
            dVar = cVar.f13669f;
        }
        cVar.getClass();
        return new c(list2, parametrizedEvent2, list4, z13, dVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f13665b, cVar.f13665b) && L.f(this.f13666c, cVar.f13666c) && L.f(this.f13667d, cVar.f13667d) && this.f13668e == cVar.f13668e && L.f(this.f13669f, cVar.f13669f);
    }

    public final int hashCode() {
        List<Group> list = this.f13665b;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        ParametrizedEvent parametrizedEvent = this.f13666c;
        int iHashCode2 = (iHashCode + (parametrizedEvent == null ? 0 : parametrizedEvent.hashCode())) * 31;
        List<Group> list2 = this.f13667d;
        return this.f13669f.hashCode() + r.i((iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31, 31, this.f13668e);
    }

    @k
    public final String toString() {
        return "EnterDataState(groups=" + this.f13665b + ", onTextChangeEvent=" + this.f13666c + ", initialGroups=" + this.f13667d + ", isKeyboardVisible=" + this.f13668e + ", viewState=" + this.f13669f + ')';
    }
}
