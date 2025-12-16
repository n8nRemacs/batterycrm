package Vw0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SoaStatSettingOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LVw0/b;", "", "a", "LVw0/b$a;", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Vw0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC15723b {

    /* compiled from: SoaStatSettingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVw0/b$a;", "LVw0/b;", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vw0.b$a */
    public static final /* data */ class a implements InterfaceC15723b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final ApiError f17504a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Throwable f17505b;

        public a(@l ApiError apiError, @l Throwable th2) {
            this.f17504a = apiError;
            this.f17505b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f17504a, aVar.f17504a) && L.f(this.f17505b, aVar.f17505b);
        }

        public final int hashCode() {
            ApiError apiError = this.f17504a;
            int iHashCode = (apiError == null ? 0 : apiError.hashCode()) * 31;
            Throwable th2 = this.f17505b;
            return iHashCode + (th2 != null ? th2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ToggleError(apiError=");
            sb2.append(this.f17504a);
            sb2.append(", throwable=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f17505b, ')');
        }
    }
}
