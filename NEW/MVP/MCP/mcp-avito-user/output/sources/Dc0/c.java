package DC0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TariffCptLevelFeaturesState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LDC0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c extends q {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f3099g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final c f3100h = new c(null, null, null, null, false);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f3101b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final UniversalImage f3102c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ButtonAction f3103d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Throwable f3104e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3105f;

    /* compiled from: TariffCptLevelFeaturesState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDC0/c$a;", "", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@l AttributedText attributedText, @l UniversalImage universalImage, @l ButtonAction buttonAction, @l Throwable th2, boolean z12) {
        this.f3101b = attributedText;
        this.f3102c = universalImage;
        this.f3103d = buttonAction;
        this.f3104e = th2;
        this.f3105f = z12;
    }

    public static c a(c cVar, Throwable th2, boolean z12) {
        AttributedText attributedText = cVar.f3101b;
        UniversalImage universalImage = cVar.f3102c;
        ButtonAction buttonAction = cVar.f3103d;
        cVar.getClass();
        return new c(attributedText, universalImage, buttonAction, th2, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f3101b, cVar.f3101b) && L.f(this.f3102c, cVar.f3102c) && L.f(this.f3103d, cVar.f3103d) && L.f(this.f3104e, cVar.f3104e) && this.f3105f == cVar.f3105f;
    }

    public final int hashCode() {
        AttributedText attributedText = this.f3101b;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        UniversalImage universalImage = this.f3102c;
        int iHashCode2 = (iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        ButtonAction buttonAction = this.f3103d;
        int iHashCode3 = (iHashCode2 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
        Throwable th2 = this.f3104e;
        return Boolean.hashCode(this.f3105f) + ((iHashCode3 + (th2 != null ? th2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffCptLevelFeatureState(text=");
        sb2.append(this.f3101b);
        sb2.append(", image=");
        sb2.append(this.f3102c);
        sb2.append(", nextAction=");
        sb2.append(this.f3103d);
        sb2.append(", throwable=");
        sb2.append(this.f3104e);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f3105f, ')');
    }
}
