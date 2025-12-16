package f00;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.document_upload.model.DocumentUploadArguments;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DocumentUploadOneTimeEvent.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lf00/b;", "", "a", "b", "c", "d", "e", "f", "g", "Lf00/b$a;", "Lf00/b$b;", "Lf00/b$c;", "Lf00/b$d;", "Lf00/b$e;", "Lf00/b$f;", "Lf00/b$g;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: f00.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC40195b {

    /* compiled from: DocumentUploadOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf00/b$a;", "Lf00/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f00.b$a */
    public static final /* data */ class a implements InterfaceC40195b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f395533a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1823841830;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: DocumentUploadOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf00/b$b;", "Lf00/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f00.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11120b implements InterfaceC40195b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11120b f395534a = new C11120b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11120b);
        }

        public final int hashCode() {
            return 1559370087;
        }

        @k
        public final String toString() {
            return "CloseAll";
        }
    }

    /* compiled from: DocumentUploadOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf00/b$c;", "Lf00/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f00.b$c */
    public static final /* data */ class c implements InterfaceC40195b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f395535a;

        public c(@k DeepLink deepLink) {
            this.f395535a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f395535a, ((c) obj).f395535a);
        }

        public final int hashCode() {
            return this.f395535a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f395535a, ')');
        }
    }

    /* compiled from: DocumentUploadOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf00/b$e;", "Lf00/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f00.b$e */
    public static final /* data */ class e implements InterfaceC40195b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f395538a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -253639310;
        }

        @k
        public final String toString() {
            return "OpenFilePicker";
        }
    }

    /* compiled from: DocumentUploadOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf00/b$f;", "Lf00/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f00.b$f */
    public static final /* data */ class f implements InterfaceC40195b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f395539a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 411330072;
        }

        @k
        public final String toString() {
            return "OpenPhotoPicker";
        }
    }

    /* compiled from: DocumentUploadOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf00/b$g;", "Lf00/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f00.b$g */
    public static final /* data */ class g implements InterfaceC40195b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f395540a;

        public g(@k PrintableText printableText) {
            this.f395540a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f395540a, ((g) obj).f395540a);
        }

        public final int hashCode() {
            return this.f395540a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowError(message="), this.f395540a, ')');
        }
    }

    /* compiled from: DocumentUploadOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf00/b$d;", "Lf00/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f00.b$d */
    public static final /* data */ class d implements InterfaceC40195b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DocumentUploadArguments f395536a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f395537b;

        public d(@k DocumentUploadArguments documentUploadArguments, boolean z12) {
            this.f395536a = documentUploadArguments;
            this.f395537b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f395536a, dVar.f395536a) && this.f395537b == dVar.f395537b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f395537b) + (this.f395536a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Navigate(arguments=");
            sb2.append(this.f395536a);
            sb2.append(", navigateUp=");
            return r.x(sb2, this.f395537b, ')');
        }

        public /* synthetic */ d(DocumentUploadArguments documentUploadArguments, boolean z12, int i12, C42822w c42822w) {
            this(documentUploadArguments, (i12 & 2) != 0 ? false : z12);
        }
    }
}
