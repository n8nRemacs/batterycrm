package Xz;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.photo_list_view.G;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EvidenceDetailsOneTimeEvent.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"LXz/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "LXz/b$a;", "LXz/b$b;", "LXz/b$c;", "LXz/b$d;", "LXz/b$e;", "LXz/b$f;", "LXz/b$g;", "LXz/b$h;", "LXz/b$i;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xz.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC17067b {

    /* compiled from: EvidenceDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXz/b$a;", "LXz/b;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xz.b$a */
    public static final /* data */ class a implements InterfaceC17067b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f19188a;

        public a(@l String str) {
            this.f19188a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f19188a, ((a) obj).f19188a);
        }

        public final int hashCode() {
            String str = this.f19188a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ActivityResult(message="), this.f19188a, ')');
        }
    }

    /* compiled from: EvidenceDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXz/b$b;", "LXz/b;", "<init>", "()V", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xz.b$b, reason: collision with other inner class name */
    public static final class C1360b implements InterfaceC17067b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1360b f19189a = new C1360b();
    }

    /* compiled from: EvidenceDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXz/b$c;", "LXz/b;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xz.b$c */
    public static final /* data */ class c implements InterfaceC17067b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String[] f19190a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final PhotoParameter f19191b;

        public c(@k String[] strArr, @l PhotoParameter photoParameter) {
            this.f19190a = strArr;
            this.f19191b = photoParameter;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f19190a, cVar.f19190a) && L.f(this.f19191b, cVar.f19191b);
        }

        public final int hashCode() {
            int iHashCode = Arrays.hashCode(this.f19190a) * 31;
            PhotoParameter photoParameter = this.f19191b;
            return iHashCode + (photoParameter == null ? 0 : photoParameter.hashCode());
        }

        @k
        public final String toString() {
            return "FilesPicker(mimeTypes=" + Arrays.toString(this.f19190a) + ", fileParameter=" + this.f19191b + ')';
        }
    }

    /* compiled from: EvidenceDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXz/b$d;", "LXz/b;", "<init>", "()V", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xz.b$d */
    public static final class d implements InterfaceC17067b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f19192a = new d();
    }

    /* compiled from: EvidenceDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXz/b$e;", "LXz/b;", "<init>", "()V", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xz.b$e */
    public static final class e implements InterfaceC17067b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f19193a = new e();
    }

    /* compiled from: EvidenceDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXz/b$f;", "LXz/b;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xz.b$f */
    public static final /* data */ class f implements InterfaceC17067b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f19194a;

        public f(@k DeepLink deepLink) {
            this.f19194a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f19194a, ((f) obj).f19194a);
        }

        public final int hashCode() {
            return this.f19194a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenScreen(deepLink="), this.f19194a, ')');
        }
    }

    /* compiled from: EvidenceDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXz/b$g;", "LXz/b;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xz.b$g */
    public static final /* data */ class g implements InterfaceC17067b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final G f19195a;

        public g(@k G g12) {
            this.f19195a = g12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f19195a, ((g) obj).f19195a);
        }

        public final int hashCode() {
            return this.f19195a.hashCode();
        }

        @k
        public final String toString() {
            return "RemoveFile(data=" + this.f19195a + ')';
        }
    }

    /* compiled from: EvidenceDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXz/b$h;", "LXz/b;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xz.b$h */
    public static final /* data */ class h implements InterfaceC17067b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f19196a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f19197b;

        public h(@k PrintableText printableText, @k Throwable th2) {
            this.f19196a = printableText;
            this.f19197b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f19196a, hVar.f19196a) && L.f(this.f19197b, hVar.f19197b);
        }

        public final int hashCode() {
            return this.f19197b.hashCode() + (this.f19196a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowErrorToast(message=");
            sb2.append(this.f19196a);
            sb2.append(", error=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f19197b, ')');
        }
    }

    /* compiled from: EvidenceDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXz/b$i;", "LXz/b;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xz.b$i */
    public static final /* data */ class i implements InterfaceC17067b {

        /* renamed from: a, reason: collision with root package name */
        public final int f19198a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f19199b;

        public i(int i12, boolean z12) {
            this.f19198a = i12;
            this.f19199b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.f19198a == iVar.f19198a && this.f19199b == iVar.f19199b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f19199b) + (Integer.hashCode(this.f19198a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ValidationError(notificationIndex=");
            sb2.append(this.f19198a);
            sb2.append(", uploadInProgress=");
            return r.x(sb2, this.f19199b, ')');
        }
    }
}
