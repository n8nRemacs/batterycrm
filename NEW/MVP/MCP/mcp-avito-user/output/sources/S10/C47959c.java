package s10;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.F3;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.mortgage.api.model.ActionButton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VerificationFlowState.kt */
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ls10/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: s10.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C47959c extends q {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f437291g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final C47959c f437292h = new C47959c(null, "", null, null, null);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f437293b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f437294c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f437295d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ActionButton f437296e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final ActionButton f437297f;

    /* compiled from: VerificationFlowState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls10/c$a;", "", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: s10.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C47959c(@l String str, @k String str2, @l String str3, @l ActionButton actionButton, @l ActionButton actionButton2) {
        this.f437293b = str;
        this.f437294c = str2;
        this.f437295d = str3;
        this.f437296e = actionButton;
        this.f437297f = actionButton2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47959c)) {
            return false;
        }
        C47959c c47959c = (C47959c) obj;
        return L.f(this.f437293b, c47959c.f437293b) && L.f(this.f437294c, c47959c.f437294c) && L.f(this.f437295d, c47959c.f437295d) && L.f(this.f437296e, c47959c.f437296e) && L.f(this.f437297f, c47959c.f437297f);
    }

    public final int hashCode() {
        String str = this.f437293b;
        int iD2 = H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f437294c);
        String str2 = this.f437295d;
        int iHashCode = (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ActionButton actionButton = this.f437296e;
        int iHashCode2 = (iHashCode + (actionButton == null ? 0 : actionButton.hashCode())) * 31;
        ActionButton actionButton2 = this.f437297f;
        return iHashCode2 + (actionButton2 != null ? actionButton2.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "VerificationFlowState(imageUrl=" + this.f437293b + ", title=" + this.f437294c + ", description=" + this.f437295d + ", primaryAction=" + this.f437296e + ", secondaryAction=" + this.f437297f + ')';
    }
}
