package y70;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.media3.common.C23088b;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.phone_reverification_info.PhoneReverificationInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PhoneReverificationInfoState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ly70/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_phone-reverification-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c extends q {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f442948e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final c f442949f = new c(null, C42784z0.f406748b, false);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final PhoneReverificationInfo f442950b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Object f442951c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f442952d;

    /* compiled from: PhoneReverificationInfoState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly70/c$a;", "", "<init>", "()V", "_avito_phone-reverification-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@l PhoneReverificationInfo phoneReverificationInfo, @k List<? extends com.avito.conveyor_item.a> list, boolean z12) {
        this.f442950b = phoneReverificationInfo;
        this.f442951c = list;
        this.f442952d = z12;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public static c a(c cVar, boolean z12) {
        PhoneReverificationInfo phoneReverificationInfo = cVar.f442950b;
        ?? r12 = cVar.f442951c;
        cVar.getClass();
        return new c(phoneReverificationInfo, r12, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f442950b, cVar.f442950b) && L.f(this.f442951c, cVar.f442951c) && this.f442952d == cVar.f442952d;
    }

    public final int hashCode() {
        PhoneReverificationInfo phoneReverificationInfo = this.f442950b;
        return Boolean.hashCode(this.f442952d) + C23088b.a((phoneReverificationInfo == null ? 0 : phoneReverificationInfo.hashCode()) * 31, 31, this.f442951c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhoneReverificationInfoState(info=");
        sb2.append(this.f442950b);
        sb2.append(", items=");
        sb2.append(this.f442951c);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f442952d, ')');
    }
}
