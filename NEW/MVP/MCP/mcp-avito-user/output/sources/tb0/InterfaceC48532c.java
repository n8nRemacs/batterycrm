package tB0;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxInfoAdvanceOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LtB0/c;", "", "a", "b", "LtB0/c$a;", "LtB0/c$b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tB0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC48532c {

    /* compiled from: TariffCpxInfoAdvanceOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LtB0/c$a;", "LtB0/c;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tB0.c$a */
    public static final /* data */ class a implements InterfaceC48532c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Bundle f439192a;

        public a(@k Bundle bundle) {
            this.f439192a = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f439192a, ((a) obj).f439192a);
        }

        public final int hashCode() {
            return this.f439192a.hashCode();
        }

        @k
        public final String toString() {
            return H.m(new StringBuilder("CloseWithResult(result="), this.f439192a, ')');
        }
    }

    /* compiled from: TariffCpxInfoAdvanceOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LtB0/c$b;", "LtB0/c;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tB0.c$b */
    public static final /* data */ class b implements InterfaceC48532c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f439193a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f439194b;

        public b(@k DeepLink deepLink, @k String str) {
            this.f439193a = deepLink;
            this.f439194b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f439193a, bVar.f439193a) && L.f(this.f439194b, bVar.f439194b);
        }

        public final int hashCode() {
            return this.f439194b.hashCode() + (this.f439193a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(deeplink=");
            sb2.append(this.f439193a);
            sb2.append(", amount=");
            return C22026a.c(sb2, this.f439194b, ')');
        }
    }
}
