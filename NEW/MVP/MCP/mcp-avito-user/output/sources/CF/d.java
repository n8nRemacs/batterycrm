package cf;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.auto_select.confirmation_dialog.ui.models.AutoSelectConfirmationDialogContent;
import com.avito.android.remote.model.category_parameters.DateTimeParameterKt;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectBookingState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcf/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class d extends q {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f58079e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final d f58080f = new d(DateTimeParameterKt.DATE_TIME_PARAMETER_PRESENT_TIME, new AutoSelectConfirmationDialogContent(null, null, C42784z0.f406748b, false, 8, null), true);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f58081b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AutoSelectConfirmationDialogContent f58082c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f58083d;

    /* compiled from: AutoSelectBookingState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcf/d$a;", "", "<init>", "()V", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k String str, @k AutoSelectConfirmationDialogContent autoSelectConfirmationDialogContent, boolean z12) {
        this.f58081b = str;
        this.f58082c = autoSelectConfirmationDialogContent;
        this.f58083d = z12;
    }

    public static d a(d dVar, boolean z12) {
        String str = dVar.f58081b;
        AutoSelectConfirmationDialogContent autoSelectConfirmationDialogContent = dVar.f58082c;
        dVar.getClass();
        return new d(str, autoSelectConfirmationDialogContent, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f58081b, dVar.f58081b) && L.f(this.f58082c, dVar.f58082c) && this.f58083d == dVar.f58083d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f58083d) + ((this.f58082c.hashCode() + (this.f58081b.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoSelectBookingState(itemId=");
        sb2.append(this.f58081b);
        sb2.append(", content=");
        sb2.append(this.f58082c);
        sb2.append(", isLoadingInProgress=");
        return r.x(sb2, this.f58083d, ')');
    }
}
