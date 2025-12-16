package Yw0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.esiasdk.android.data.network.model.ClientSessionInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EsiaOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LYw0/c;", "", "a", "b", "c", "LYw0/c$a;", "LYw0/c$b;", "LYw0/c$c;", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Yw0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC18343c {

    /* compiled from: EsiaOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LYw0/c$a;", "LYw0/c;", "<init>", "()V", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Yw0.c$a */
    public static final /* data */ class a implements InterfaceC18343c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f19746a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1657940594;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: EsiaOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYw0/c$b;", "LYw0/c;", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Yw0.c$b */
    public static final /* data */ class b implements InterfaceC18343c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ClientSessionInfo f19747a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f19748b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f19749c;

        public b(@k ClientSessionInfo clientSessionInfo, @k String str, @k String str2) {
            this.f19747a = clientSessionInfo;
            this.f19748b = str;
            this.f19749c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f19747a, bVar.f19747a) && L.f(this.f19748b, bVar.f19748b) && L.f(this.f19749c, bVar.f19749c);
        }

        public final int hashCode() {
            return this.f19749c.hashCode() + H.d(this.f19747a.hashCode() * 31, 31, this.f19748b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenSdk(clientSessionInfo=");
            sb2.append(this.f19747a);
            sb2.append(", permissions=");
            sb2.append(this.f19748b);
            sb2.append(", apiUrl=");
            return C22026a.c(sb2, this.f19749c, ')');
        }
    }

    /* compiled from: EsiaOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYw0/c$c;", "LYw0/c;", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Yw0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C1409c implements InterfaceC18343c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f19750a;

        public C1409c(@k String str) {
            this.f19750a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1409c) && L.f(this.f19750a, ((C1409c) obj).f19750a);
        }

        public final int hashCode() {
            return this.f19750a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenUrl(url="), this.f19750a, ')');
        }
    }
}
