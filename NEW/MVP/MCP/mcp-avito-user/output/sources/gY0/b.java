package Gy0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.analytics.screens.mvi.r;
import com.avito.android.printable_text.PrintableText;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StrCalendarParametersState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LGy0/b;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class b extends q {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f6839f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final b f6840g = new b(null, false, false, C42784z0.f406748b);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final PrintableText f6841b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6842c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6843d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f6844e;

    /* compiled from: StrCalendarParametersState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGy0/b$a;", "", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@l PrintableText printableText, boolean z12, boolean z13, @k List<? extends com.avito.conveyor_item.a> list) {
        this.f6841b = printableText;
        this.f6842c = z12;
        this.f6843d = z13;
        this.f6844e = list;
        setPerfTrackerParams(new r("parameters_core", J.b.f90385a));
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f6841b, bVar.f6841b) && this.f6842c == bVar.f6842c && this.f6843d == bVar.f6843d && L.f(this.f6844e, bVar.f6844e);
    }

    public final int hashCode() {
        PrintableText printableText = this.f6841b;
        return this.f6844e.hashCode() + androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((printableText == null ? 0 : printableText.hashCode()) * 31, 31, this.f6842c), 31, this.f6843d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrCalendarParametersCoreViewState(title=");
        sb2.append(this.f6841b);
        sb2.append(", isApplyButtonEnabled=");
        sb2.append(this.f6842c);
        sb2.append(", isApplyButtonVisible=");
        sb2.append(this.f6843d);
        sb2.append(", pickerItems=");
        return H.p(sb2, this.f6844e, ')');
    }
}
