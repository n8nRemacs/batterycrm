package zB0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxInfoSfMenuOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LzB0/b;", "", "a", "b", "LzB0/b$a;", "LzB0/b$b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zB0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC50433b {

    /* compiled from: TariffCpxInfoSfMenuOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LzB0/b$a;", "LzB0/b;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zB0.b$a */
    public static final /* data */ class a implements InterfaceC50433b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f443944a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -232218227;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: TariffCpxInfoSfMenuOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LzB0/b$b;", "LzB0/b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zB0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12947b implements InterfaceC50433b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f443945a;

        public C12947b(@k DeepLink deepLink) {
            this.f443945a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12947b) && L.f(this.f443945a, ((C12947b) obj).f443945a);
        }

        public final int hashCode() {
            return this.f443945a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplinkAndCloseDialog(deeplink="), this.f443945a, ')');
        }
    }
}
