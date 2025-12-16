package OG0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.upload_doc.view.document.GigUploadDocDocumentItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigUploadDocOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LOG0/c;", "", "a", "b", "c", "d", "e", "LOG0/c$a;", "LOG0/c$b;", "LOG0/c$c;", "LOG0/c$d;", "LOG0/c$e;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface c {

    /* compiled from: GigUploadDocOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOG0/c$a;", "LOG0/c;", "<init>", "()V", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f12130a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1894518759;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: GigUploadDocOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOG0/c$b;", "LOG0/c;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f12131a;

        public b(@k DeepLink deepLink) {
            this.f12131a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f12131a, ((b) obj).f12131a);
        }

        public final int hashCode() {
            return this.f12131a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("FinishFlow(finishDeeplink="), this.f12131a, ')');
        }
    }

    /* compiled from: GigUploadDocOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOG0/c$c;", "LOG0/c;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: OG0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0784c implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f12132a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f12133b;

        public C0784c(@k String str, @k String str2) {
            this.f12132a = str;
            this.f12133b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0784c)) {
                return false;
            }
            C0784c c0784c = (C0784c) obj;
            return L.f(this.f12132a, c0784c.f12132a) && L.f(this.f12133b, c0784c.f12133b);
        }

        public final int hashCode() {
            return this.f12133b.hashCode() + (this.f12132a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenPhotoPicker(documentId=");
            sb2.append(this.f12132a);
            sb2.append(", hint=");
            return C22026a.c(sb2, this.f12133b, ')');
        }
    }

    /* compiled from: GigUploadDocOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOG0/c$d;", "LOG0/c;", "<init>", "()V", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f12134a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1358661972;
        }

        @k
        public final String toString() {
            return "ShowError";
        }
    }

    /* compiled from: GigUploadDocOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOG0/c$e;", "LOG0/c;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final GigUploadDocDocumentItem f12135a;

        public e(@k GigUploadDocDocumentItem gigUploadDocDocumentItem) {
            this.f12135a = gigUploadDocDocumentItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f12135a, ((e) obj).f12135a);
        }

        public final int hashCode() {
            return this.f12135a.hashCode();
        }

        @k
        public final String toString() {
            return "StartUpload(document=" + this.f12135a + ')';
        }
    }
}
