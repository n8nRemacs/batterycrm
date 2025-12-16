package Y60;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.BeduinV2;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BannerResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LY60/b;", "", "a", "b", "c", "LY60/b$a;", "LY60/b$b;", "LY60/b$c;", "_avito_personal-banner_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: BannerResponse.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LY60/b$a;", "LY60/b;", "_avito_personal-banner_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BeduinV2 f19308a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f19309b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final DeepLink f19310c;

        public a(@k String str, @k BeduinV2 beduinV2, @l DeepLink deepLink) {
            this.f19308a = beduinV2;
            this.f19309b = str;
            this.f19310c = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f19308a, aVar.f19308a) && L.f(this.f19309b, aVar.f19309b) && L.f(this.f19310c, aVar.f19310c);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f19308a.hashCode() * 31, 31, this.f19309b);
            DeepLink deepLink = this.f19310c;
            return iD2 + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Banner(banner=");
            sb2.append(this.f19308a);
            sb2.append(", bannerItemId=");
            sb2.append(this.f19309b);
            sb2.append(", onShowDeeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f19310c, ')');
        }
    }

    /* compiled from: BannerResponse.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LY60/b$b;", "LY60/b;", "<init>", "()V", "_avito_personal-banner_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Y60.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1365b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1365b f19311a = new C1365b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1365b);
        }

        public final int hashCode() {
            return -584561771;
        }

        @k
        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: BannerResponse.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LY60/b$c;", "LY60/b;", "_avito_personal-banner_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f19312a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Throwable f19313b;

        public c(@k ApiError apiError, @l Throwable th2) {
            this.f19312a = apiError;
            this.f19313b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f19312a, cVar.f19312a) && L.f(this.f19313b, cVar.f19313b);
        }

        public final int hashCode() {
            int iHashCode = this.f19312a.hashCode() * 31;
            Throwable th2 = this.f19313b;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(apiError=");
            sb2.append(this.f19312a);
            sb2.append(", cause=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f19313b, ')');
        }
    }
}
