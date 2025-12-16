package BB0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxInfoSfTermsState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LBB0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c extends q {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f1235f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final c f1236g = new c(null, null, null, null);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f1237b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final wZ.l f1238c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f1239d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f1240e;

    /* compiled from: TariffCpxInfoSfTermsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBB0/c$a;", "", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@l AttributedText attributedText, @l wZ.l lVar, @l String str, @l String str2) {
        this.f1237b = attributedText;
        this.f1238c = lVar;
        this.f1239d = str;
        this.f1240e = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f1237b, cVar.f1237b) && L.f(this.f1238c, cVar.f1238c) && L.f(this.f1239d, cVar.f1239d) && L.f(this.f1240e, cVar.f1240e) && L.f(null, null);
    }

    public final int hashCode() {
        AttributedText attributedText = this.f1237b;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        wZ.l lVar = this.f1238c;
        int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        String str = this.f1239d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f1240e;
        return (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffCpxInfoSfTermsState(description=");
        sb2.append(this.f1237b);
        sb2.append(", image=");
        sb2.append(this.f1238c);
        sb2.append(", saveButtonTitle=");
        sb2.append(this.f1239d);
        sb2.append(", skipButtonTitle=");
        return AK.c.s(sb2, this.f1240e, ", error=null)");
    }
}
