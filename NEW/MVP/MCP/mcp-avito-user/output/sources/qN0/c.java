package Qn0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UniversalDeliveryTypeCourierState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LQn0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "a", "b", "LQn0/c$a;", "LQn0/c$b;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class c extends q {

    /* compiled from: UniversalDeliveryTypeCourierState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQn0/c$a;", "LQn0/c;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f14000b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f14001c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f14002d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f14003e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f14004f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final List<BeduinAction> f14005g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f14006h;

        public /* synthetic */ a(String str, List list, String str2, List list2, boolean z12, List list3, boolean z13, int i12, C42822w c42822w) {
            this(str, list, str2, list2, z12, list3, (i12 & 64) != 0 ? false : z13);
        }

        public static a a(a aVar, List list, List list2, boolean z12, int i12) {
            String str = aVar.f14000b;
            if ((i12 & 2) != 0) {
                list = aVar.f14001c;
            }
            List list3 = list;
            String str2 = aVar.f14002d;
            if ((i12 & 8) != 0) {
                list2 = aVar.f14003e;
            }
            List list4 = list2;
            if ((i12 & 16) != 0) {
                z12 = aVar.f14004f;
            }
            boolean z13 = z12;
            List<BeduinAction> list5 = aVar.f14005g;
            boolean z14 = (i12 & 64) != 0 ? aVar.f14006h : true;
            aVar.getClass();
            return new a(str, list3, str2, list4, z13, list5, z14);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f14000b, aVar.f14000b) && L.f(this.f14001c, aVar.f14001c) && L.f(this.f14002d, aVar.f14002d) && L.f(this.f14003e, aVar.f14003e) && this.f14004f == aVar.f14004f && L.f(this.f14005g, aVar.f14005g) && this.f14006h == aVar.f14006h;
        }

        public final int hashCode() {
            int iE2 = H.e(this.f14000b.hashCode() * 31, 31, this.f14001c);
            String str = this.f14002d;
            int i12 = r.i(H.e((iE2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f14003e), 31, this.f14004f);
            List<BeduinAction> list = this.f14005g;
            return Boolean.hashCode(this.f14006h) + ((i12 + (list != null ? list.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(mainFormId=");
            sb2.append(this.f14000b);
            sb2.append(", mainComponents=");
            sb2.append(this.f14001c);
            sb2.append(", bottomFormId=");
            sb2.append(this.f14002d);
            sb2.append(", bottomComponents=");
            sb2.append(this.f14003e);
            sb2.append(", isExecutingRequest=");
            sb2.append(this.f14004f);
            sb2.append(", onInitActions=");
            sb2.append(this.f14005g);
            sb2.append(", handledOnInitActions=");
            return r.x(sb2, this.f14006h, ')');
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@k String str, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list, @l String str2, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list2, boolean z12, @l List<? extends BeduinAction> list3, boolean z13) {
            super(null);
            this.f14000b = str;
            this.f14001c = list;
            this.f14002d = str2;
            this.f14003e = list2;
            this.f14004f = z12;
            this.f14005g = list3;
            this.f14006h = z13;
        }
    }

    /* compiled from: UniversalDeliveryTypeCourierState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQn0/c$b;", "LQn0/c;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final b f14007b = new b();

        public b() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1159224670;
        }

        @k
        public final String toString() {
            return "Initial";
        }
    }

    public /* synthetic */ c(C42822w c42822w) {
        this();
    }

    public c() {
    }
}
