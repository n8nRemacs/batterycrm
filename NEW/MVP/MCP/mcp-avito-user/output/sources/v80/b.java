package V80;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PositionChart.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LV80/b;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final UniversalColor f16935a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DeepLink f16936b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Integer f16937c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final UniversalColor f16938d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final AttributedText f16939e;

    /* renamed from: f, reason: collision with root package name */
    public final long f16940f;

    public b(@Y61.k UniversalColor universalColor, @Y61.k DeepLink deepLink, @InterfaceC42150f @Y61.l Integer num, @Y61.k UniversalColor universalColor2, @Y61.k AttributedText attributedText, long j12) {
        this.f16935a = universalColor;
        this.f16936b = deepLink;
        this.f16937c = num;
        this.f16938d = universalColor2;
        this.f16939e = attributedText;
        this.f16940f = j12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f16935a, bVar.f16935a) && L.f(this.f16936b, bVar.f16936b) && L.f(this.f16937c, bVar.f16937c) && L.f(this.f16938d, bVar.f16938d) && L.f(this.f16939e, bVar.f16939e) && this.f16940f == bVar.f16940f;
    }

    public final int hashCode() {
        int iE2 = com.avito.android.actions_sheet.a.e(this.f16936b, this.f16935a.hashCode() * 31, 31);
        Integer num = this.f16937c;
        return Long.hashCode(this.f16940f) + com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.i(this.f16938d, (iE2 + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.f16939e);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChartMobileScrollDepthData(bgColor=");
        sb2.append(this.f16935a);
        sb2.append(", hintDeeplink=");
        sb2.append(this.f16936b);
        sb2.append(", iconName=");
        sb2.append(this.f16937c);
        sb2.append(", lineColor=");
        sb2.append(this.f16938d);
        sb2.append(", title=");
        sb2.append(this.f16939e);
        sb2.append(", value=");
        return r.u(sb2, this.f16940f, ')');
    }
}
