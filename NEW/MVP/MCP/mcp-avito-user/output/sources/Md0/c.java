package MD0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.util.ApiException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import wZ.C49578b;

/* compiled from: TariffLfPublicationCountState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LMD0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c extends q {

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final a f10471k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final c f10472l = new c(true, null, C42784z0.f406748b, null, false, null, null, false, null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10473b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Throwable f10474c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f10475d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final C49578b f10476e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10477f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f10478g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final LD0.a f10479h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f10480i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Long f10481j;

    /* compiled from: TariffLfPublicationCountState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMD0/c$a;", "", "<init>", "()V", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(boolean z12, @l Throwable th2, @k List<? extends com.avito.conveyor_item.a> list, @l C49578b c49578b, boolean z13, @l String str, @l LD0.a aVar, boolean z14, @l Long l12) {
        this.f10473b = z12;
        this.f10474c = th2;
        this.f10475d = list;
        this.f10476e = c49578b;
        this.f10477f = z13;
        this.f10478g = str;
        this.f10479h = aVar;
        this.f10480i = z14;
        this.f10481j = l12;
    }

    public static c a(c cVar, boolean z12, ApiException apiException, List list, C49578b c49578b, boolean z13, String str, LD0.a aVar, boolean z14, Long l12, int i12) {
        boolean z15 = (i12 & 1) != 0 ? cVar.f10473b : z12;
        Throwable th2 = (i12 & 2) != 0 ? cVar.f10474c : apiException;
        List list2 = (i12 & 4) != 0 ? cVar.f10475d : list;
        C49578b c49578b2 = (i12 & 8) != 0 ? cVar.f10476e : c49578b;
        boolean z16 = (i12 & 16) != 0 ? cVar.f10477f : z13;
        String str2 = (i12 & 32) != 0 ? cVar.f10478g : str;
        LD0.a aVar2 = (i12 & 64) != 0 ? cVar.f10479h : aVar;
        boolean z17 = (i12 & 128) != 0 ? cVar.f10480i : z14;
        Long l13 = (i12 & 256) != 0 ? cVar.f10481j : l12;
        cVar.getClass();
        return new c(z15, th2, list2, c49578b2, z16, str2, aVar2, z17, l13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f10473b == cVar.f10473b && L.f(this.f10474c, cVar.f10474c) && L.f(this.f10475d, cVar.f10475d) && L.f(this.f10476e, cVar.f10476e) && this.f10477f == cVar.f10477f && L.f(this.f10478g, cVar.f10478g) && L.f(this.f10479h, cVar.f10479h) && this.f10480i == cVar.f10480i && L.f(this.f10481j, cVar.f10481j);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f10473b) * 31;
        Throwable th2 = this.f10474c;
        int iE2 = H.e((iHashCode + (th2 == null ? 0 : th2.hashCode())) * 31, 31, this.f10475d);
        C49578b c49578b = this.f10476e;
        int i12 = r.i((iE2 + (c49578b == null ? 0 : c49578b.hashCode())) * 31, 31, this.f10477f);
        String str = this.f10478g;
        int iHashCode2 = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        LD0.a aVar = this.f10479h;
        int i13 = r.i((iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f10480i);
        Long l12 = this.f10481j;
        return i13 + (l12 != null ? l12.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffLfPublicationCountState(isLoading=");
        sb2.append(this.f10473b);
        sb2.append(", error=");
        sb2.append(this.f10474c);
        sb2.append(", items=");
        sb2.append(this.f10475d);
        sb2.append(", nextButton=");
        sb2.append(this.f10476e);
        sb2.append(", isNextButtonLoading=");
        sb2.append(this.f10477f);
        sb2.append(", totalTitle=");
        sb2.append(this.f10478g);
        sb2.append(", priceInfo=");
        sb2.append(this.f10479h);
        sb2.append(", isPriceInfoLoading=");
        sb2.append(this.f10480i);
        sb2.append(", countId=");
        return m.m(sb2, this.f10481j, ')');
    }
}
