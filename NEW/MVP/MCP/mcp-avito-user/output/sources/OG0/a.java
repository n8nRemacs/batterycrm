package OG0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.upload_doc.view.checkbox.GigUploadDocCheckboxItem;
import com.avito.android.upload_doc.view.document.GigUploadDocDocumentItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigUploadDocAction.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"LOG0/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "LOG0/a$a;", "LOG0/a$b;", "LOG0/a$c;", "LOG0/a$d;", "LOG0/a$e;", "LOG0/a$f;", "LOG0/a$g;", "LOG0/a$h;", "LOG0/a$i;", "LOG0/a$j;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: GigUploadDocAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOG0/a$a;", "LOG0/a;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: OG0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0783a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final GigUploadDocCheckboxItem f12120a;

        public C0783a(@k GigUploadDocCheckboxItem gigUploadDocCheckboxItem) {
            this.f12120a = gigUploadDocCheckboxItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0783a) && L.f(this.f12120a, ((C0783a) obj).f12120a);
        }

        public final int hashCode() {
            return this.f12120a.hashCode();
        }

        @k
        public final String toString() {
            return "AgreeToTerms(checkbox=" + this.f12120a + ')';
        }
    }

    /* compiled from: GigUploadDocAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOG0/a$b;", "LOG0/a;", "<init>", "()V", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f12121a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1228271880;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: GigUploadDocAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOG0/a$c;", "LOG0/a;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final GigUploadDocCheckboxItem f12122a;

        public c(@k GigUploadDocCheckboxItem gigUploadDocCheckboxItem) {
            this.f12122a = gigUploadDocCheckboxItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f12122a, ((c) obj).f12122a);
        }

        public final int hashCode() {
            return this.f12122a.hashCode();
        }

        @k
        public final String toString() {
            return "DisagreeToTerms(checkbox=" + this.f12122a + ')';
        }
    }

    /* compiled from: GigUploadDocAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOG0/a$d;", "LOG0/a;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final GigUploadDocDocumentItem f12123a;

        public d(@k GigUploadDocDocumentItem gigUploadDocDocumentItem) {
            this.f12123a = gigUploadDocDocumentItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f12123a, ((d) obj).f12123a);
        }

        public final int hashCode() {
            return this.f12123a.hashCode();
        }

        @k
        public final String toString() {
            return "DocumentPicked(document=" + this.f12123a + ')';
        }
    }

    /* compiled from: GigUploadDocAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOG0/a$e;", "LOG0/a;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final GigUploadDocDocumentItem f12124a;

        public e(@k GigUploadDocDocumentItem gigUploadDocDocumentItem) {
            this.f12124a = gigUploadDocDocumentItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f12124a, ((e) obj).f12124a);
        }

        public final int hashCode() {
            return this.f12124a.hashCode();
        }

        @k
        public final String toString() {
            return "PickDocument(document=" + this.f12124a + ')';
        }
    }

    /* compiled from: GigUploadDocAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOG0/a$f;", "LOG0/a;", "<init>", "()V", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f12125a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1283114312;
        }

        @k
        public final String toString() {
            return "ReloadPage";
        }
    }

    /* compiled from: GigUploadDocAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOG0/a$g;", "LOG0/a;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final GigUploadDocDocumentItem f12126a;

        public g(@k GigUploadDocDocumentItem gigUploadDocDocumentItem) {
            this.f12126a = gigUploadDocDocumentItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f12126a, ((g) obj).f12126a);
        }

        public final int hashCode() {
            return this.f12126a.hashCode();
        }

        @k
        public final String toString() {
            return "RemoveDocument(document=" + this.f12126a + ')';
        }
    }

    /* compiled from: GigUploadDocAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOG0/a$h;", "LOG0/a;", "<init>", "()V", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final h f12127a = new h();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1353359136;
        }

        @k
        public final String toString() {
            return "SendDocuments";
        }
    }

    /* compiled from: GigUploadDocAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOG0/a$i;", "LOG0/a;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f12128a;

        public i(@k DeepLink deepLink) {
            this.f12128a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f12128a, ((i) obj).f12128a);
        }

        public final int hashCode() {
            return this.f12128a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("SupportButtonClick(deeplink="), this.f12128a, ')');
        }
    }

    /* compiled from: GigUploadDocAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOG0/a$j;", "LOG0/a;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final GigUploadDocDocumentItem f12129a;

        public j(@k GigUploadDocDocumentItem gigUploadDocDocumentItem) {
            this.f12129a = gigUploadDocDocumentItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f12129a, ((j) obj).f12129a);
        }

        public final int hashCode() {
            return this.f12129a.hashCode();
        }

        @k
        public final String toString() {
            return "UploadDocument(document=" + this.f12129a + ')';
        }
    }
}
