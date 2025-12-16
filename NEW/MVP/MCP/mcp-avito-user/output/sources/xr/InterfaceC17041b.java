package Xr;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PreActivationOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LXr/b;", "", "a", "b", "c", "LXr/b$a;", "LXr/b$b;", "LXr/b$c;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xr.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC17041b {

    /* compiled from: PreActivationOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXr/b$a;", "LXr/b;", "<init>", "()V", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xr.b$a */
    public static final /* data */ class a implements InterfaceC17041b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f19086a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -182340797;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: PreActivationOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXr/b$b;", "LXr/b;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xr.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1353b implements InterfaceC17041b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f19087a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f19088b;

        public C1353b(@k DeepLink deepLink, boolean z12) {
            this.f19087a = deepLink;
            this.f19088b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1353b)) {
                return false;
            }
            C1353b c1353b = (C1353b) obj;
            return L.f(this.f19087a, c1353b.f19087a) && this.f19088b == c1353b.f19088b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f19088b) + (this.f19087a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeepLink(deepLink=");
            sb2.append(this.f19087a);
            sb2.append(", addParams=");
            return r.x(sb2, this.f19088b, ')');
        }
    }

    /* compiled from: PreActivationOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXr/b$c;", "LXr/b;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xr.b$c */
    public static final /* data */ class c implements InterfaceC17041b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f19089a;

        public c(@l DeepLink deepLink) {
            this.f19089a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f19089a, ((c) obj).f19089a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f19089a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("SetResult(deepLink="), this.f19089a, ')');
        }
    }
}
