package EB0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxLevelFeatureState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LEB0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c extends q {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f3868g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final c f3869h = new c(null, null, null, null, false);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f3870b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final UniversalImage f3871c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ButtonAction f3872d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ApiError f3873e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3874f;

    /* compiled from: TariffCpxLevelFeatureState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEB0/c$a;", "", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@l AttributedText attributedText, @l UniversalImage universalImage, @l ButtonAction buttonAction, @l ApiError apiError, boolean z12) {
        this.f3870b = attributedText;
        this.f3871c = universalImage;
        this.f3872d = buttonAction;
        this.f3873e = apiError;
        this.f3874f = z12;
    }

    public static c a(c cVar, ApiError apiError, boolean z12) {
        AttributedText attributedText = cVar.f3870b;
        UniversalImage universalImage = cVar.f3871c;
        ButtonAction buttonAction = cVar.f3872d;
        cVar.getClass();
        return new c(attributedText, universalImage, buttonAction, apiError, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f3870b, cVar.f3870b) && L.f(this.f3871c, cVar.f3871c) && L.f(this.f3872d, cVar.f3872d) && L.f(this.f3873e, cVar.f3873e) && this.f3874f == cVar.f3874f;
    }

    public final int hashCode() {
        AttributedText attributedText = this.f3870b;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        UniversalImage universalImage = this.f3871c;
        int iHashCode2 = (iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        ButtonAction buttonAction = this.f3872d;
        int iHashCode3 = (iHashCode2 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
        ApiError apiError = this.f3873e;
        return Boolean.hashCode(this.f3874f) + ((iHashCode3 + (apiError != null ? apiError.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffCpxLevelFeatureState(text=");
        sb2.append(this.f3870b);
        sb2.append(", image=");
        sb2.append(this.f3871c);
        sb2.append(", nextAction=");
        sb2.append(this.f3872d);
        sb2.append(", error=");
        sb2.append(this.f3873e);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f3874f, ')');
    }
}
