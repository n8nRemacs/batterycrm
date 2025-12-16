package Z40;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_shared.model.progress_overlay.b;
import com.avito.android.remote.error.ApiError;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinOrdersState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"LZ40/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "a", "b", "c", "d", "LZ40/c$a;", "LZ40/c$b;", "LZ40/c$c;", "LZ40/c$d;", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class c extends q {

    /* compiled from: BeduinOrdersState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZ40/c$a;", "LZ40/c;", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends c {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f19861b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f19862c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f19863d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f19864e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f19865f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f19866g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f19867h;

        /* renamed from: i, reason: collision with root package name */
        @k
        public final List<BeduinAction> f19868i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f19869j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public final b.a f19870k;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@l String str, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list, @k String str2, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list2, @l String str3, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list3, boolean z12, @k List<? extends BeduinAction> list4, boolean z13, @l b.a aVar) {
            super(null);
            this.f19861b = str;
            this.f19862c = list;
            this.f19863d = str2;
            this.f19864e = list2;
            this.f19865f = str3;
            this.f19866g = list3;
            this.f19867h = z12;
            this.f19868i = list4;
            this.f19869j = z13;
            this.f19870k = aVar;
        }

        public static a a(a aVar, String str, List list, String str2, List list2, String str3, List list3, boolean z12, List list4, boolean z13, b.a aVar2, int i12) {
            String str4 = (i12 & 1) != 0 ? aVar.f19861b : str;
            List list5 = (i12 & 2) != 0 ? aVar.f19862c : list;
            String str5 = (i12 & 4) != 0 ? aVar.f19863d : str2;
            List list6 = (i12 & 8) != 0 ? aVar.f19864e : list2;
            String str6 = (i12 & 16) != 0 ? aVar.f19865f : str3;
            List list7 = (i12 & 32) != 0 ? aVar.f19866g : list3;
            boolean z14 = (i12 & 64) != 0 ? aVar.f19867h : z12;
            List list8 = (i12 & 128) != 0 ? aVar.f19868i : list4;
            boolean z15 = (i12 & 256) != 0 ? aVar.f19869j : z13;
            b.a aVar3 = (i12 & 512) != 0 ? aVar.f19870k : aVar2;
            aVar.getClass();
            return new a(str4, list5, str5, list6, str6, list7, z14, list8, z15, aVar3);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f19861b, aVar.f19861b) && L.f(this.f19862c, aVar.f19862c) && L.f(this.f19863d, aVar.f19863d) && L.f(this.f19864e, aVar.f19864e) && L.f(this.f19865f, aVar.f19865f) && L.f(this.f19866g, aVar.f19866g) && this.f19867h == aVar.f19867h && L.f(this.f19868i, aVar.f19868i) && this.f19869j == aVar.f19869j && L.f(this.f19870k, aVar.f19870k);
        }

        public final int hashCode() {
            String str = this.f19861b;
            int iE2 = H.e(H.d(H.e((str == null ? 0 : str.hashCode()) * 31, 31, this.f19862c), 31, this.f19863d), 31, this.f19864e);
            String str2 = this.f19865f;
            int i12 = r.i(H.e(r.i(H.e((iE2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f19866g), 31, this.f19867h), 31, this.f19868i), 31, this.f19869j);
            b.a aVar = this.f19870k;
            return i12 + (aVar != null ? aVar.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "Content(topFormId=" + this.f19861b + ", topComponents=" + this.f19862c + ", mainFormId=" + this.f19863d + ", mainComponents=" + this.f19864e + ", bottomFormId=" + this.f19865f + ", bottomComponents=" + this.f19866g + ", isExecutingRequest=" + this.f19867h + ", onRefreshActions=" + this.f19868i + ", isRefreshing=" + this.f19869j + ", contentPlaceholderData=" + this.f19870k + ')';
        }
    }

    /* compiled from: BeduinOrdersState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZ40/c$b;", "LZ40/c;", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f19871b;

        public b(@k ApiError apiError) {
            super(null);
            this.f19871b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f19871b, ((b) obj).f19871b);
        }

        public final int hashCode() {
            return this.f19871b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("Failed(error="), this.f19871b, ')');
        }
    }

    /* compiled from: BeduinOrdersState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZ40/c$c;", "LZ40/c;", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Z40.c$c, reason: collision with other inner class name */
    public static final /* data */ class C1417c extends c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final G0 f19872b;

        public C1417c() {
            this(null, 1, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1417c) && L.f(this.f19872b, ((C1417c) obj).f19872b);
        }

        public final int hashCode() {
            return this.f19872b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.v(new StringBuilder("Initial(stub="), this.f19872b, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1417c(G0 g02, int i12, C42822w c42822w) {
            super(null);
            g02 = (i12 & 1) != 0 ? G0.f406611a : g02;
            this.f19872b = g02;
        }
    }

    /* compiled from: BeduinOrdersState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZ40/c$d;", "LZ40/c;", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final G0 f19873b;

        public d() {
            this(null, 1, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f19873b, ((d) obj).f19873b);
        }

        public final int hashCode() {
            return this.f19873b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.v(new StringBuilder("Loading(stub="), this.f19873b, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(G0 g02, int i12, C42822w c42822w) {
            super(null);
            g02 = (i12 & 1) != 0 ? G0.f406611a : g02;
            this.f19873b = g02;
        }
    }

    public /* synthetic */ c(C42822w c42822w) {
        this();
    }

    public c() {
    }
}
