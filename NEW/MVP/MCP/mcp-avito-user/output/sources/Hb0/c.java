package HB0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.lib.design.chips.h;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CpxLevelsState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LHB0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c extends q {

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final a f6992k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final c f6993l;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f6994b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f6995c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<h> f6996d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final FB0.a f6997e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f6998f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Map<Integer, List<com.avito.conveyor_item.a>> f6999g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f7000h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f7001i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f7002j;

    /* compiled from: CpxLevelsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHB0/c$a;", "", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        C42784z0 c42784z0 = C42784z0.f406748b;
        f6993l = new c(null, null, c42784z0, null, c42784z0, P0.c(), null, true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@l String str, @l AttributedText attributedText, @k List<? extends h> list, @l FB0.a aVar, @k List<? extends com.avito.conveyor_item.a> list2, @k Map<Integer, ? extends List<? extends com.avito.conveyor_item.a>> map, @l String str2, boolean z12, boolean z13) {
        this.f6994b = str;
        this.f6995c = attributedText;
        this.f6996d = list;
        this.f6997e = aVar;
        this.f6998f = list2;
        this.f6999g = map;
        this.f7000h = str2;
        this.f7001i = z12;
        this.f7002j = z13;
    }

    public static c a(c cVar, String str, AttributedText attributedText, List list, FB0.a aVar, List list2, Map map, String str2, boolean z12, boolean z13, int i12) {
        String str3 = (i12 & 1) != 0 ? cVar.f6994b : str;
        AttributedText attributedText2 = (i12 & 2) != 0 ? cVar.f6995c : attributedText;
        List list3 = (i12 & 4) != 0 ? cVar.f6996d : list;
        FB0.a aVar2 = (i12 & 8) != 0 ? cVar.f6997e : aVar;
        List list4 = (i12 & 16) != 0 ? cVar.f6998f : list2;
        Map map2 = (i12 & 32) != 0 ? cVar.f6999g : map;
        String str4 = (i12 & 64) != 0 ? cVar.f7000h : str2;
        boolean z14 = (i12 & 128) != 0 ? cVar.f7001i : z12;
        boolean z15 = (i12 & 256) != 0 ? cVar.f7002j : z13;
        cVar.getClass();
        return new c(str3, attributedText2, list3, aVar2, list4, map2, str4, z14, z15);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f6994b, cVar.f6994b) && L.f(this.f6995c, cVar.f6995c) && L.f(this.f6996d, cVar.f6996d) && L.f(this.f6997e, cVar.f6997e) && L.f(this.f6998f, cVar.f6998f) && L.f(this.f6999g, cVar.f6999g) && L.f(this.f7000h, cVar.f7000h) && this.f7001i == cVar.f7001i && this.f7002j == cVar.f7002j;
    }

    public final int hashCode() {
        String str = this.f6994b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AttributedText attributedText = this.f6995c;
        int iE2 = H.e((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f6996d);
        FB0.a aVar = this.f6997e;
        int iC2 = AK.c.c(H.e((iE2 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f6998f), 31, this.f6999g);
        String str2 = this.f7000h;
        return Boolean.hashCode(this.f7002j) + r.i((iC2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f7001i);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CpxLevelsState(title=");
        sb2.append(this.f6994b);
        sb2.append(", description=");
        sb2.append(this.f6995c);
        sb2.append(", levels=");
        sb2.append(this.f6996d);
        sb2.append(", activeLevel=");
        sb2.append(this.f6997e);
        sb2.append(", items=");
        sb2.append(this.f6998f);
        sb2.append(", setItems=");
        sb2.append(this.f6999g);
        sb2.append(", error=");
        sb2.append(this.f7000h);
        sb2.append(", isLoading=");
        sb2.append(this.f7001i);
        sb2.append(", isPostLoading=");
        return r.x(sb2, this.f7002j, ')');
    }
}
