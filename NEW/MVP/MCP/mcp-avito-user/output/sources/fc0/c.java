package FC0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.lib.design.chips.h;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.ApiException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TariffCptLevelsState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LFC0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c extends q {

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final a f4626k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final c f4627l;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f4628b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f4629c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<h> f4630d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final EC0.a f4631e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f4632f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Map<Integer, List<com.avito.conveyor_item.a>> f4633g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Throwable f4634h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f4635i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f4636j;

    /* compiled from: TariffCptLevelsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFC0/c$a;", "", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        C42784z0 c42784z0 = C42784z0.f406748b;
        f4627l = new c(null, null, c42784z0, null, c42784z0, P0.c(), null, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@l String str, @l AttributedText attributedText, @k List<? extends h> list, @l EC0.a aVar, @k List<? extends com.avito.conveyor_item.a> list2, @k Map<Integer, ? extends List<? extends com.avito.conveyor_item.a>> map, @l Throwable th2, boolean z12, boolean z13) {
        this.f4628b = str;
        this.f4629c = attributedText;
        this.f4630d = list;
        this.f4631e = aVar;
        this.f4632f = list2;
        this.f4633g = map;
        this.f4634h = th2;
        this.f4635i = z12;
        this.f4636j = z13;
    }

    public static c a(c cVar, String str, AttributedText attributedText, List list, EC0.a aVar, List list2, LinkedHashMap linkedHashMap, ApiException apiException, boolean z12, boolean z13, int i12) {
        String str2 = (i12 & 1) != 0 ? cVar.f4628b : str;
        AttributedText attributedText2 = (i12 & 2) != 0 ? cVar.f4629c : attributedText;
        List list3 = (i12 & 4) != 0 ? cVar.f4630d : list;
        EC0.a aVar2 = (i12 & 8) != 0 ? cVar.f4631e : aVar;
        List list4 = (i12 & 16) != 0 ? cVar.f4632f : list2;
        Map<Integer, List<com.avito.conveyor_item.a>> map = (i12 & 32) != 0 ? cVar.f4633g : linkedHashMap;
        Throwable th2 = (i12 & 64) != 0 ? cVar.f4634h : apiException;
        boolean z14 = (i12 & 128) != 0 ? cVar.f4635i : z12;
        boolean z15 = (i12 & 256) != 0 ? cVar.f4636j : z13;
        cVar.getClass();
        return new c(str2, attributedText2, list3, aVar2, list4, map, th2, z14, z15);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f4628b, cVar.f4628b) && L.f(this.f4629c, cVar.f4629c) && L.f(this.f4630d, cVar.f4630d) && L.f(this.f4631e, cVar.f4631e) && L.f(this.f4632f, cVar.f4632f) && L.f(this.f4633g, cVar.f4633g) && L.f(this.f4634h, cVar.f4634h) && this.f4635i == cVar.f4635i && this.f4636j == cVar.f4636j;
    }

    public final int hashCode() {
        String str = this.f4628b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AttributedText attributedText = this.f4629c;
        int iE2 = H.e((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f4630d);
        EC0.a aVar = this.f4631e;
        int iC2 = AK.c.c(H.e((iE2 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f4632f), 31, this.f4633g);
        Throwable th2 = this.f4634h;
        return Boolean.hashCode(this.f4636j) + r.i((iC2 + (th2 != null ? th2.hashCode() : 0)) * 31, 31, this.f4635i);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffCptLevelsState(title=");
        sb2.append(this.f4628b);
        sb2.append(", description=");
        sb2.append(this.f4629c);
        sb2.append(", levels=");
        sb2.append(this.f4630d);
        sb2.append(", activeLevel=");
        sb2.append(this.f4631e);
        sb2.append(", items=");
        sb2.append(this.f4632f);
        sb2.append(", setItems=");
        sb2.append(this.f4633g);
        sb2.append(", error=");
        sb2.append(this.f4634h);
        sb2.append(", isLoading=");
        sb2.append(this.f4635i);
        sb2.append(", isPostLoading=");
        return r.x(sb2, this.f4636j, ')');
    }
}
