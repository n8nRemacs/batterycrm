package Cc0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.BeduinV2;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileSummaryResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LCc0/a;", "", "a", "b", "LCc0/a$a;", "LCc0/a$b;", "_avito_profile-tab_summary_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cc0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC13241a {

    /* compiled from: ProfileSummaryResponse.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCc0/a$a;", "LCc0/a;", "_avito_profile-tab_summary_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cc0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0115a implements InterfaceC13241a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BeduinV2 f2350a;

        public C0115a(@k BeduinV2 beduinV2) {
            this.f2350a = beduinV2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0115a) && L.f(this.f2350a, ((C0115a) obj).f2350a);
        }

        public final int hashCode() {
            return this.f2350a.hashCode();
        }

        @k
        public final String toString() {
            return "Content(content=" + this.f2350a + ')';
        }
    }

    /* compiled from: ProfileSummaryResponse.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCc0/a$b;", "LCc0/a;", "_avito_profile-tab_summary_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cc0.a$b */
    public static final /* data */ class b implements InterfaceC13241a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f2351a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Throwable f2352b;

        public b(@k ApiError apiError, @l Throwable th2) {
            this.f2351a = apiError;
            this.f2352b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f2351a, bVar.f2351a) && L.f(this.f2352b, bVar.f2352b);
        }

        public final int hashCode() {
            int iHashCode = this.f2351a.hashCode() * 31;
            Throwable th2 = this.f2352b;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(apiError=");
            sb2.append(this.f2351a);
            sb2.append(", cause=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f2352b, ')');
        }
    }
}
