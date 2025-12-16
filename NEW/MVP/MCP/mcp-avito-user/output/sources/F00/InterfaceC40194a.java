package f00;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import e00.C39840a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DocumentUploadAction.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lf00/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "Lf00/a$a;", "Lf00/a$b;", "Lf00/a$c;", "Lf00/a$d;", "Lf00/a$e;", "Lf00/a$f;", "Lf00/a$g;", "Lf00/a$h;", "Lf00/a$i;", "Lf00/a$j;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: f00.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC40194a {

    /* compiled from: DocumentUploadAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf00/a$a;", "Lf00/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f00.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11119a implements InterfaceC40194a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<Uri> f395523a;

        /* JADX WARN: Multi-variable type inference failed */
        public C11119a(@k List<? extends Uri> list) {
            this.f395523a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11119a) && L.f(this.f395523a, ((C11119a) obj).f395523a);
        }

        public final int hashCode() {
            return this.f395523a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("AddFiles(uris="), this.f395523a, ')');
        }
    }

    /* compiled from: DocumentUploadAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf00/a$b;", "Lf00/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f00.a$b */
    public static final /* data */ class b implements InterfaceC40194a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f395524a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 2096092515;
        }

        @k
        public final String toString() {
            return "AddFilesClick";
        }
    }

    /* compiled from: DocumentUploadAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf00/a$c;", "Lf00/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f00.a$c */
    public static final /* data */ class c implements InterfaceC40194a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f395525a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1109954936;
        }

        @k
        public final String toString() {
            return "AddPhotoClick";
        }
    }

    /* compiled from: DocumentUploadAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf00/a$d;", "Lf00/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f00.a$d */
    public static final /* data */ class d implements InterfaceC40194a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f395526a;

        public d(boolean z12) {
            this.f395526a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f395526a == ((d) obj).f395526a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f395526a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("BackClick(hasBackStackEntries="), this.f395526a, ')');
        }
    }

    /* compiled from: DocumentUploadAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf00/a$e;", "Lf00/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f00.a$e */
    public static final /* data */ class e implements InterfaceC40194a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f395527a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 94772095;
        }

        @k
        public final String toString() {
            return "CloseClick";
        }
    }

    /* compiled from: DocumentUploadAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf00/a$f;", "Lf00/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f00.a$f */
    public static final /* data */ class f implements InterfaceC40194a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final C39840a f395528a;

        public f(@k C39840a c39840a) {
            this.f395528a = c39840a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f395528a, ((f) obj).f395528a);
        }

        public final int hashCode() {
            return this.f395528a.hashCode();
        }

        @k
        public final String toString() {
            return "DeleteFile(document=" + this.f395528a + ')';
        }
    }

    /* compiled from: DocumentUploadAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf00/a$g;", "Lf00/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f00.a$g */
    public static final /* data */ class g implements InterfaceC40194a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f395529a = new g();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 770043238;
        }

        @k
        public final String toString() {
            return "FilesNotSelected";
        }
    }

    /* compiled from: DocumentUploadAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf00/a$h;", "Lf00/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f00.a$h */
    public static final /* data */ class h implements InterfaceC40194a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f395530a;

        public h(@k DeepLink deepLink) {
            this.f395530a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f395530a, ((h) obj).f395530a);
        }

        public final int hashCode() {
            return this.f395530a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("RequirementsClick(deeplink="), this.f395530a, ')');
        }
    }

    /* compiled from: DocumentUploadAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf00/a$i;", "Lf00/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f00.a$i */
    public static final /* data */ class i implements InterfaceC40194a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final C39840a f395531a;

        public i(@k C39840a c39840a) {
            this.f395531a = c39840a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f395531a, ((i) obj).f395531a);
        }

        public final int hashCode() {
            return this.f395531a.hashCode();
        }

        @k
        public final String toString() {
            return "RetryFile(document=" + this.f395531a + ')';
        }
    }

    /* compiled from: DocumentUploadAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf00/a$j;", "Lf00/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f00.a$j */
    public static final /* data */ class j implements InterfaceC40194a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final j f395532a = new j();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 105192971;
        }

        @k
        public final String toString() {
            return "SubmitForm";
        }
    }
}
