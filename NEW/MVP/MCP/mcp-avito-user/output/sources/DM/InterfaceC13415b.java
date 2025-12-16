package Dm;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CarNavigatorOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LDm/b;", "", "a", "b", "c", "LDm/b$a;", "LDm/b$b;", "LDm/b$c;", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Dm.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC13415b {

    /* compiled from: CarNavigatorOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDm/b$a;", "LDm/b;", "<init>", "()V", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dm.b$a */
    public static final /* data */ class a implements InterfaceC13415b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f3426a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1612607258;
        }

        @k
        public final String toString() {
            return "CancelScreen";
        }
    }

    /* compiled from: CarNavigatorOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDm/b$b;", "LDm/b;", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dm.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0190b implements InterfaceC13415b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f3427a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f3428b;

        public C0190b(@k DeepLink deepLink, @l String str) {
            this.f3427a = deepLink;
            this.f3428b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0190b)) {
                return false;
            }
            C0190b c0190b = (C0190b) obj;
            return L.f(this.f3427a, c0190b.f3427a) && L.f(this.f3428b, c0190b.f3428b);
        }

        public final int hashCode() {
            int iHashCode = this.f3427a.hashCode() * 31;
            String str = this.f3428b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeeplink(deepLink=");
            sb2.append(this.f3427a);
            sb2.append(", requestKey=");
            return C22026a.c(sb2, this.f3428b, ')');
        }

        public /* synthetic */ C0190b(DeepLink deepLink, String str, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? null : str);
        }
    }

    /* compiled from: CarNavigatorOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDm/b$c;", "LDm/b;", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dm.b$c */
    public static final /* data */ class c implements InterfaceC13415b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Uri f3429a;

        public c(@k Uri uri) {
            this.f3429a = uri;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f3429a, ((c) obj).f3429a);
        }

        public final int hashCode() {
            return this.f3429a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.t(new StringBuilder("OpenExternalUri(externalUri="), this.f3429a, ')');
        }
    }
}
