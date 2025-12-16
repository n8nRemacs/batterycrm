package fB0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.ButtonAction;
import eB0.C39985a;
import eB0.C39986b;
import eB0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CprConfigureAdvanceManualState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LfB0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c extends q {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f395775i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final c f395776j = new c(null, null, null, null, "", null, false);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final C39985a f395777b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final d f395778c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ButtonAction f395779d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final C39986b f395780e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f395781f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final ApiError f395782g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f395783h;

    /* compiled from: CprConfigureAdvanceManualState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LfB0/c$a;", "", "<init>", "()V", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@l C39985a c39985a, @l d dVar, @l ButtonAction buttonAction, @l C39986b c39986b, @k String str, @l ApiError apiError, boolean z12) {
        this.f395777b = c39985a;
        this.f395778c = dVar;
        this.f395779d = buttonAction;
        this.f395780e = c39986b;
        this.f395781f = str;
        this.f395782g = apiError;
        this.f395783h = z12;
    }

    public static c a(c cVar, C39986b c39986b, String str, ApiError apiError, boolean z12, int i12) {
        C39985a c39985a = cVar.f395777b;
        d dVar = cVar.f395778c;
        ButtonAction buttonAction = cVar.f395779d;
        if ((i12 & 8) != 0) {
            c39986b = cVar.f395780e;
        }
        C39986b c39986b2 = c39986b;
        if ((i12 & 16) != 0) {
            str = cVar.f395781f;
        }
        String str2 = str;
        if ((i12 & 32) != 0) {
            apiError = cVar.f395782g;
        }
        ApiError apiError2 = apiError;
        if ((i12 & 64) != 0) {
            z12 = cVar.f395783h;
        }
        cVar.getClass();
        return new c(c39985a, dVar, buttonAction, c39986b2, str2, apiError2, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f395777b, cVar.f395777b) && L.f(this.f395778c, cVar.f395778c) && L.f(this.f395779d, cVar.f395779d) && L.f(this.f395780e, cVar.f395780e) && L.f(this.f395781f, cVar.f395781f) && L.f(this.f395782g, cVar.f395782g) && this.f395783h == cVar.f395783h;
    }

    public final int hashCode() {
        C39985a c39985a = this.f395777b;
        int iHashCode = (c39985a == null ? 0 : c39985a.hashCode()) * 31;
        d dVar = this.f395778c;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        ButtonAction buttonAction = this.f395779d;
        int iHashCode3 = (iHashCode2 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
        C39986b c39986b = this.f395780e;
        int iD2 = H.d((iHashCode3 + (c39986b == null ? 0 : c39986b.hashCode())) * 31, 31, this.f395781f);
        ApiError apiError = this.f395782g;
        return Boolean.hashCode(this.f395783h) + ((iD2 + (apiError != null ? apiError.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CprConfigureAdvanceManualState(advance=");
        sb2.append(this.f395777b);
        sb2.append(", reviews=");
        sb2.append(this.f395778c);
        sb2.append(", button=");
        sb2.append(this.f395779d);
        sb2.append(", label=");
        sb2.append(this.f395780e);
        sb2.append(", inputText=");
        sb2.append(this.f395781f);
        sb2.append(", error=");
        sb2.append(this.f395782g);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f395783h, ')');
    }
}
