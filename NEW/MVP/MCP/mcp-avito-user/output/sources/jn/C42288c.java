package jN;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.imv_services.ImvServices;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ImvServicesDialogState.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LjN/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_imv-services-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jN.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C42288c extends q {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f405594f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final C42288c f405595g = new C42288c("", null, true, false);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f405596b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ImvServices f405597c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f405598d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f405599e;

    /* compiled from: ImvServicesDialogState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LjN/c$a;", "", "<init>", "()V", "_avito_imv-services-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jN.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C42288c(@k String str, @l ImvServices imvServices, boolean z12, boolean z13) {
        this.f405596b = str;
        this.f405597c = imvServices;
        this.f405598d = z12;
        this.f405599e = z13;
    }

    public static C42288c a(C42288c c42288c, String str, ImvServices imvServices, int i12) {
        if ((i12 & 1) != 0) {
            str = c42288c.f405596b;
        }
        if ((i12 & 2) != 0) {
            imvServices = c42288c.f405597c;
        }
        boolean z12 = (i12 & 4) != 0 ? c42288c.f405598d : false;
        boolean z13 = (i12 & 8) != 0 ? c42288c.f405599e : true;
        c42288c.getClass();
        return new C42288c(str, imvServices, z12, z13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42288c)) {
            return false;
        }
        C42288c c42288c = (C42288c) obj;
        return L.f(this.f405596b, c42288c.f405596b) && L.f(this.f405597c, c42288c.f405597c) && this.f405598d == c42288c.f405598d && this.f405599e == c42288c.f405599e;
    }

    public final int hashCode() {
        int iHashCode = this.f405596b.hashCode() * 31;
        ImvServices imvServices = this.f405597c;
        return Boolean.hashCode(this.f405599e) + r.i((iHashCode + (imvServices == null ? 0 : imvServices.hashCode())) * 31, 31, this.f405598d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImvServicesDialogState(title=");
        sb2.append(this.f405596b);
        sb2.append(", imvServices=");
        sb2.append(this.f405597c);
        sb2.append(", isFeedbackButtonsVisible=");
        sb2.append(this.f405598d);
        sb2.append(", isFeedbackAnsweredTitleVisible=");
        return r.x(sb2, this.f405599e, ')');
    }
}
