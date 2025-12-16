package UD0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffLfPublicationLevelOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LUD0/b;", "", "a", "b", "LUD0/b$a;", "LUD0/b$b;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface b {

    /* compiled from: TariffLfPublicationLevelOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUD0/b$a;", "LUD0/b;", "<init>", "()V", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f16273a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1315312356;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: TariffLfPublicationLevelOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUD0/b$b;", "LUD0/b;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: UD0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1109b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f16274a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Long f16275b;

        public C1109b(@l Long l12, @k DeepLink deepLink) {
            this.f16274a = deepLink;
            this.f16275b = l12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1109b)) {
                return false;
            }
            C1109b c1109b = (C1109b) obj;
            return L.f(this.f16274a, c1109b.f16274a) && L.f(this.f16275b, c1109b.f16275b);
        }

        public final int hashCode() {
            int iHashCode = this.f16274a.hashCode() * 31;
            Long l12 = this.f16275b;
            return iHashCode + (l12 == null ? 0 : l12.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(deeplink=");
            sb2.append(this.f16274a);
            sb2.append(", levelId=");
            return m.m(sb2, this.f16275b, ')');
        }
    }
}
