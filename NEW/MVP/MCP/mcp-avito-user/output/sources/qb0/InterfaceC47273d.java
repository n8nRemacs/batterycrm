package qB0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpxConfigureLandingOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LqB0/d;", "", "a", "b", "LqB0/d$a;", "LqB0/d$b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qB0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC47273d {

    /* compiled from: CpxConfigureLandingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LqB0/d$a;", "LqB0/d;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qB0.d$a */
    public static final class a implements InterfaceC47273d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f429092a = new a();
    }

    /* compiled from: CpxConfigureLandingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqB0/d$b;", "LqB0/d;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qB0.d$b */
    public static final /* data */ class b implements InterfaceC47273d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f429093a;

        public b(@k DeepLink deepLink) {
            this.f429093a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f429093a, ((b) obj).f429093a);
        }

        public final int hashCode() {
            return this.f429093a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deepLink="), this.f429093a, ')');
        }
    }
}
