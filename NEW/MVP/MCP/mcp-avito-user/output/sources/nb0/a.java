package NB0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxLimitAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LNB0/a;", "", "a", "b", "c", "d", "LNB0/a$a;", "LNB0/a$b;", "LNB0/a$c;", "LNB0/a$d;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: TariffCpxLimitAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNB0/a$a;", "LNB0/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: NB0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0722a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final int f11292a;

        /* renamed from: b, reason: collision with root package name */
        public final int f11293b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final AttributedText f11294c;

        public C0722a(int i12, int i13, @l AttributedText attributedText) {
            this.f11292a = i12;
            this.f11293b = i13;
            this.f11294c = attributedText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0722a)) {
                return false;
            }
            C0722a c0722a = (C0722a) obj;
            return this.f11292a == c0722a.f11292a && this.f11293b == c0722a.f11293b && L.f(this.f11294c, c0722a.f11294c);
        }

        public final int hashCode() {
            int iE2 = r.e(this.f11293b, Integer.hashCode(this.f11292a) * 31, 31);
            AttributedText attributedText = this.f11294c;
            return iE2 + (attributedText == null ? 0 : attributedText.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InputChange(limit=");
            sb2.append(this.f11292a);
            sb2.append(", remains=");
            sb2.append(this.f11293b);
            sb2.append(", hint=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f11294c, ')');
        }
    }

    /* compiled from: TariffCpxLimitAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNB0/a$b;", "LNB0/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f11295a;

        public b(@k DeepLink deepLink) {
            this.f11295a = deepLink;
        }
    }

    /* compiled from: TariffCpxLimitAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNB0/a$c;", "LNB0/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f11296a;

        public c(boolean z12) {
            this.f11296a = z12;
        }
    }

    /* compiled from: TariffCpxLimitAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNB0/a$d;", "LNB0/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f11297a;

        /* renamed from: b, reason: collision with root package name */
        public final int f11298b;

        public d(@k DeepLink deepLink, int i12) {
            this.f11297a = deepLink;
            this.f11298b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f11297a, dVar.f11297a) && this.f11298b == dVar.f11298b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f11298b) + (this.f11297a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Save(deepLink=");
            sb2.append(this.f11297a);
            sb2.append(", limit=");
            return r.t(sb2, this.f11298b, ')');
        }
    }
}
