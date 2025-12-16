package lK0;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UserViewedAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LlK0/a;", "", "a", "b", "c", "d", "e", "f", "LlK0/a$a;", "LlK0/a$b;", "LlK0/a$c;", "LlK0/a$d;", "LlK0/a$e;", "LlK0/a$f;", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lK0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC43650a {

    /* compiled from: UserViewedAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LlK0/a$a;", "LlK0/a;", "<init>", "()V", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lK0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11783a implements InterfaceC43650a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11783a f413710a = new C11783a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11783a);
        }

        public final int hashCode() {
            return -1821070510;
        }

        @k
        public final String toString() {
            return "ListResetting";
        }
    }

    /* compiled from: UserViewedAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LlK0/a$b;", "LlK0/a;", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lK0.a$b */
    public static final /* data */ class b implements InterfaceC43650a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f413711a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f413712b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f413713c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f413714d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f413715e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f413716f;

        public b(@k DeepLink deepLink, @l String str, @l String str2, @l String str3, @l String str4, boolean z12) {
            this.f413711a = deepLink;
            this.f413712b = str;
            this.f413713c = str2;
            this.f413714d = str3;
            this.f413715e = str4;
            this.f413716f = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f413711a, bVar.f413711a) && L.f(this.f413712b, bVar.f413712b) && L.f(this.f413713c, bVar.f413713c) && L.f(this.f413714d, bVar.f413714d) && L.f(this.f413715e, bVar.f413715e) && this.f413716f == bVar.f413716f;
        }

        public final int hashCode() {
            int iHashCode = this.f413711a.hashCode() * 31;
            String str = this.f413712b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f413713c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f413714d;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f413715e;
            return Boolean.hashCode(this.f413716f) + ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenAdvert(deeplink=");
            sb2.append(this.f413711a);
            sb2.append(", categoryId=");
            sb2.append(this.f413712b);
            sb2.append(", title=");
            sb2.append(this.f413713c);
            sb2.append(", price=");
            sb2.append(this.f413714d);
            sb2.append(", previousPrice=");
            sb2.append(this.f413715e);
            sb2.append(", active=");
            return r.x(sb2, this.f413716f, ')');
        }
    }

    /* compiled from: UserViewedAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LlK0/a$c;", "LlK0/a;", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lK0.a$c */
    public static final /* data */ class c implements InterfaceC43650a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f413717a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Bundle f413718b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f413719c;

        public c(DeepLink deepLink, Bundle bundle, String str, int i12, C42822w c42822w) {
            bundle = (i12 & 2) != 0 ? null : bundle;
            str = (i12 & 4) != 0 ? null : str;
            this.f413717a = deepLink;
            this.f413718b = bundle;
            this.f413719c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f413717a, cVar.f413717a) && L.f(this.f413718b, cVar.f413718b) && L.f(this.f413719c, cVar.f413719c);
        }

        public final int hashCode() {
            int iHashCode = this.f413717a.hashCode() * 31;
            Bundle bundle = this.f413718b;
            int iHashCode2 = (iHashCode + (bundle == null ? 0 : bundle.hashCode())) * 31;
            String str = this.f413719c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeeplink(deeplink=");
            sb2.append(this.f413717a);
            sb2.append(", bundle=");
            sb2.append(this.f413718b);
            sb2.append(", tag=");
            return C22026a.c(sb2, this.f413719c, ')');
        }
    }

    /* compiled from: UserViewedAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LlK0/a$d;", "LlK0/a;", "<init>", "()V", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lK0.a$d */
    public static final /* data */ class d implements InterfaceC43650a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f413720a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -962447698;
        }

        @k
        public final String toString() {
            return "Refresh";
        }
    }

    /* compiled from: UserViewedAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LlK0/a$e;", "LlK0/a;", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lK0.a$e */
    public static final /* data */ class e implements InterfaceC43650a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f413721a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f413722b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f413723c;

        public e(@k String str, boolean z12, @l String str2) {
            this.f413721a = str;
            this.f413722b = z12;
            this.f413723c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f413721a, eVar.f413721a) && this.f413722b == eVar.f413722b && L.f(this.f413723c, eVar.f413723c);
        }

        public final int hashCode() {
            int i12 = r.i(this.f413721a.hashCode() * 31, 31, this.f413722b);
            String str = this.f413723c;
            return i12 + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ToggleFavoriteStatus(id=");
            sb2.append(this.f413721a);
            sb2.append(", isFavorite=");
            sb2.append(this.f413722b);
            sb2.append(", analyticsContext=");
            return C22026a.c(sb2, this.f413723c, ')');
        }
    }

    /* compiled from: UserViewedAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LlK0/a$f;", "LlK0/a;", "<init>", "()V", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lK0.a$f */
    public static final /* data */ class f implements InterfaceC43650a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f413724a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 680039849;
        }

        @k
        public final String toString() {
            return "TrackBottom";
        }
    }
}
