package Ut0;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.component.accordion.s;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingWorkHoursMviState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LUt0/g;", "", "a", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f16730a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f16731b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a f16732c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a f16733d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f16734e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16735f;

    /* compiled from: ServiceBookingWorkHoursMviState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUt0/g$a;", "", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f16736a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f16737b;

        public a(@Y61.k String str, @InterfaceC42150f @l Integer num) {
            this.f16736a = str;
            this.f16737b = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f16736a, aVar.f16736a) && L.f(this.f16737b, aVar.f16737b);
        }

        public final int hashCode() {
            int iHashCode = this.f16736a.hashCode() * 31;
            Integer num = this.f16737b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ActionButtonItem(title=");
            sb2.append(this.f16736a);
            sb2.append(", actionStyleAttr=");
            return s.j(sb2, this.f16737b, ')');
        }
    }

    public g(@Y61.k String str, @Y61.k String str2, @Y61.k a aVar, @Y61.k a aVar2, @Y61.k String str3, boolean z12) {
        this.f16730a = str;
        this.f16731b = str2;
        this.f16732c = aVar;
        this.f16733d = aVar2;
        this.f16734e = str3;
        this.f16735f = z12;
    }

    public static g a(g gVar, boolean z12) {
        String str = gVar.f16730a;
        String str2 = gVar.f16731b;
        a aVar = gVar.f16732c;
        a aVar2 = gVar.f16733d;
        String str3 = gVar.f16734e;
        gVar.getClass();
        return new g(str, str2, aVar, aVar2, str3, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f16730a, gVar.f16730a) && L.f(this.f16731b, gVar.f16731b) && L.f(this.f16732c, gVar.f16732c) && L.f(this.f16733d, gVar.f16733d) && L.f(this.f16734e, gVar.f16734e) && this.f16735f == gVar.f16735f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16735f) + H.d((this.f16733d.hashCode() + ((this.f16732c.hashCode() + H.d(this.f16730a.hashCode() * 31, 31, this.f16731b)) * 31)) * 31, 31, this.f16734e);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SaveScheduleInfo(title=");
        sb2.append(this.f16730a);
        sb2.append(", description=");
        sb2.append(this.f16731b);
        sb2.append(", acceptButton=");
        sb2.append(this.f16732c);
        sb2.append(", cancelButton=");
        sb2.append(this.f16733d);
        sb2.append(", fromPage=");
        sb2.append(this.f16734e);
        sb2.append(", dialogShow=");
        return r.x(sb2, this.f16735f, ')');
    }

    public /* synthetic */ g(String str, String str2, a aVar, a aVar2, String str3, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, aVar, aVar2, str3, (i12 & 32) != 0 ? false : z12);
    }
}
