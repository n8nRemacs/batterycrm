package zB0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.H0;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxInfoSfMenuState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LzB0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zB0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C50434c extends q {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final b f443946c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C50434c f443947d = new C50434c(C42784z0.f406748b);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Object f443948b;

    /* compiled from: TariffCpxInfoSfMenuState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LzB0/c$a;", "", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zB0.c$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AttributedText f443949a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f443950b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final DeepLink f443951c;

        public a(@k AttributedText attributedText, @k String str, @l DeepLink deepLink) {
            this.f443949a = attributedText;
            this.f443950b = str;
            this.f443951c = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f443949a, aVar.f443949a) && L.f(this.f443950b, aVar.f443950b) && L.f(this.f443951c, aVar.f443951c);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f443949a.hashCode() * 31, 31, this.f443950b);
            DeepLink deepLink = this.f443951c;
            return iD2 + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ActionItem(title=");
            sb2.append(this.f443949a);
            sb2.append(", iconName=");
            sb2.append(this.f443950b);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f443951c, ')');
        }
    }

    /* compiled from: TariffCpxInfoSfMenuState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LzB0/c$b;", "", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zB0.c$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public C50434c(@k List<a> list) {
        this.f443948b = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C50434c) && L.f(this.f443948b, ((C50434c) obj).f443948b);
    }

    public final int hashCode() {
        return this.f443948b.hashCode();
    }

    @k
    public final String toString() {
        return H.n(new StringBuilder("TariffCpxInfoSfMenuState(actions="), this.f443948b, ')');
    }
}
