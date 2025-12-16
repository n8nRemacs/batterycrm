package wB0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxInfoOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LwB0/b;", "", "a", "b", "c", "LwB0/b$a;", "LwB0/b$b;", "LwB0/b$c;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wB0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC49482b {

    /* compiled from: TariffCpxInfoOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LwB0/b$a;", "LwB0/b;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wB0.b$a */
    public static final class a implements InterfaceC49482b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f441318a = new a();
    }

    /* compiled from: TariffCpxInfoOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LwB0/b$b;", "LwB0/b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wB0.b$b, reason: collision with other inner class name */
    public static final class C12812b implements InterfaceC49482b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f441319a;

        public C12812b(@k DeepLink deepLink) {
            this.f441319a = deepLink;
        }
    }

    /* compiled from: TariffCpxInfoOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LwB0/b$c;", "LwB0/b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wB0.b$c */
    public static final /* data */ class c implements InterfaceC49482b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f441320a;

        public c(@k ApiError apiError) {
            this.f441320a = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f441320a, ((c) obj).f441320a);
        }

        public final int hashCode() {
            return this.f441320a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("ShowError(error="), this.f441320a, ')');
        }
    }
}
