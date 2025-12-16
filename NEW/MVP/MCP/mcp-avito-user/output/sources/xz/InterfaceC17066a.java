package Xz;

import Y61.k;
import Y61.l;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.photo_list_view.G;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EvidenceDetailsAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LXz/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "LXz/a$a;", "LXz/a$b;", "LXz/a$c;", "LXz/a$d;", "LXz/a$e;", "LXz/a$f;", "LXz/a$g;", "LXz/a$h;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xz.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC17066a {

    /* compiled from: EvidenceDetailsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXz/a$a;", "LXz/a;", "<init>", "()V", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xz.a$a, reason: collision with other inner class name */
    public static final class C1359a implements InterfaceC17066a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1359a f19180a = new C1359a();
    }

    /* compiled from: EvidenceDetailsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXz/a$b;", "LXz/a;", "<init>", "()V", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xz.a$b */
    public static final class b implements InterfaceC17066a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f19181a = new b();
    }

    /* compiled from: EvidenceDetailsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXz/a$c;", "LXz/a;", "<init>", "()V", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xz.a$c */
    public static final class c implements InterfaceC17066a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f19182a = new c();
    }

    /* compiled from: EvidenceDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXz/a$d;", "LXz/a;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xz.a$d */
    public static final /* data */ class d implements InterfaceC17066a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f19183a;

        public d(@k DeepLink deepLink) {
            this.f19183a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f19183a, ((d) obj).f19183a);
        }

        public final int hashCode() {
            return this.f19183a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DeepLinkClick(deeplink="), this.f19183a, ')');
        }
    }

    /* compiled from: EvidenceDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXz/a$e;", "LXz/a;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xz.a$e */
    public static final /* data */ class e implements InterfaceC17066a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Uri f19184a;

        public e(@k Uri uri) {
            this.f19184a = uri;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f19184a, ((e) obj).f19184a);
        }

        public final int hashCode() {
            return this.f19184a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.t(new StringBuilder("EvidenceFileRollbackClick(uri="), this.f19184a, ')');
        }
    }

    /* compiled from: EvidenceDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXz/a$f;", "LXz/a;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xz.a$f */
    public static final /* data */ class f implements InterfaceC17066a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f19185a;

        public f(@k ArrayList arrayList) {
            this.f19185a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f19185a.equals(((f) obj).f19185a);
        }

        public final int hashCode() {
            return this.f19185a.hashCode();
        }

        @k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("EvidenceFilesPicked(uris="), this.f19185a, ')');
        }
    }

    /* compiled from: EvidenceDetailsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXz/a$g;", "LXz/a;", "<init>", "()V", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xz.a$g */
    public static final class g implements InterfaceC17066a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f19186a = new g();
    }

    /* compiled from: EvidenceDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXz/a$h;", "LXz/a;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xz.a$h */
    public static final /* data */ class h implements InterfaceC17066a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final G f19187a;

        public h(@k G g12) {
            this.f19187a = g12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f19187a, ((h) obj).f19187a);
        }

        public final int hashCode() {
            return this.f19187a.hashCode();
        }

        @k
        public final String toString() {
            return "RemoveFileClick(data=" + this.f19187a + ')';
        }
    }
}
