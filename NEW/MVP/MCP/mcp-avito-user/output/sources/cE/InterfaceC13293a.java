package Ce;

import Y61.l;
import android.net.Uri;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.auto_evidence_request.s;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoEvidenceRequestAction.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"LCe/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "LCe/a$a;", "LCe/a$b;", "LCe/a$c;", "LCe/a$d;", "LCe/a$e;", "LCe/a$f;", "LCe/a$g;", "LCe/a$h;", "LCe/a$i;", "LCe/a$j;", "LCe/a$k;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ce.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC13293a {

    /* compiled from: AutoEvidenceRequestAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCe/a$a;", "LCe/a;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0116a implements InterfaceC13293a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final s.a f2494a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Long f2495b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f2496c;

        public C0116a(@l s.a aVar, @l Long l12, @Y61.k String str) {
            this.f2494a = aVar;
            this.f2495b = l12;
            this.f2496c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0116a)) {
                return false;
            }
            C0116a c0116a = (C0116a) obj;
            return L.f(this.f2494a, c0116a.f2494a) && L.f(this.f2495b, c0116a.f2495b) && L.f(this.f2496c, c0116a.f2496c);
        }

        public final int hashCode() {
            s.a aVar = this.f2494a;
            int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            Long l12 = this.f2495b;
            return this.f2496c.hashCode() + ((iHashCode + (l12 != null ? l12.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnCancelUploadButtonClicked(toast=");
            sb2.append(this.f2494a);
            sb2.append(", imageId=");
            sb2.append(this.f2495b);
            sb2.append(", formId=");
            return C22026a.c(sb2, this.f2496c, ')');
        }
    }

    /* compiled from: AutoEvidenceRequestAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCe/a$b;", "LCe/a;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.a$b */
    public static final /* data */ class b implements InterfaceC13293a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f2497a;

        public b(@Y61.k DeepLink deepLink) {
            this.f2497a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f2497a, ((b) obj).f2497a);
        }

        public final int hashCode() {
            return this.f2497a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnDeepLinkClicked(uri="), this.f2497a, ')');
        }
    }

    /* compiled from: AutoEvidenceRequestAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCe/a$c;", "LCe/a;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.a$c */
    public static final /* data */ class c implements InterfaceC13293a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final s.b f2498a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f2499b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Long f2500c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f2501d;

        public c(@l s.b bVar, @Y61.k String str, @l Long l12, @Y61.k String str2) {
            this.f2498a = bVar;
            this.f2499b = str;
            this.f2500c = l12;
            this.f2501d = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f2498a, cVar.f2498a) && L.f(this.f2499b, cVar.f2499b) && L.f(this.f2500c, cVar.f2500c) && L.f(this.f2501d, cVar.f2501d);
        }

        public final int hashCode() {
            s.b bVar = this.f2498a;
            int iD2 = H.d((bVar == null ? 0 : bVar.hashCode()) * 31, 31, this.f2499b);
            Long l12 = this.f2500c;
            return this.f2501d.hashCode() + ((iD2 + (l12 != null ? l12.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnDeleteFileButtonClicked(toast=");
            sb2.append(this.f2498a);
            sb2.append(", uploadId=");
            sb2.append(this.f2499b);
            sb2.append(", imageId=");
            sb2.append(this.f2500c);
            sb2.append(", formId=");
            return C22026a.c(sb2, this.f2501d, ')');
        }
    }

    /* compiled from: AutoEvidenceRequestAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCe/a$d;", "LCe/a;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.a$d */
    public static final /* data */ class d implements InterfaceC13293a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f2502a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f2503b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f2504c;

        public d(@Y61.k String str, @l String str2, @l String str3) {
            this.f2502a = str;
            this.f2503b = str2;
            this.f2504c = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f2502a, dVar.f2502a) && L.f(this.f2503b, dVar.f2503b) && L.f(this.f2504c, dVar.f2504c);
        }

        public final int hashCode() {
            int iHashCode = this.f2502a.hashCode() * 31;
            String str = this.f2503b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f2504c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnPhotoPickerClose(formId=");
            sb2.append(this.f2502a);
            sb2.append(", fileName=");
            sb2.append(this.f2503b);
            sb2.append(", fileSize=");
            return C22026a.c(sb2, this.f2504c, ')');
        }
    }

    /* compiled from: AutoEvidenceRequestAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCe/a$e;", "LCe/a;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.a$e */
    public static final /* data */ class e implements InterfaceC13293a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f2505a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f2506b;

        public e(@Y61.k String str, @Y61.k String str2) {
            this.f2505a = str;
            this.f2506b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f2505a, eVar.f2505a) && L.f(this.f2506b, eVar.f2506b);
        }

        public final int hashCode() {
            return this.f2506b.hashCode() + (this.f2505a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnPhotoPickerError(formId=");
            sb2.append(this.f2505a);
            sb2.append(", message=");
            return C22026a.c(sb2, this.f2506b, ')');
        }
    }

    /* compiled from: AutoEvidenceRequestAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCe/a$f;", "LCe/a;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.a$f */
    public static final /* data */ class f implements InterfaceC13293a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f2507a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Uri f2508b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f2509c;

        public f(@Y61.k String str, @l Uri uri, @l String str2) {
            this.f2507a = str;
            this.f2508b = uri;
            this.f2509c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f2507a, fVar.f2507a) && L.f(this.f2508b, fVar.f2508b) && L.f(this.f2509c, fVar.f2509c);
        }

        public final int hashCode() {
            int iHashCode = this.f2507a.hashCode() * 31;
            Uri uri = this.f2508b;
            int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
            String str = this.f2509c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnPhotoSelected(formId=");
            sb2.append(this.f2507a);
            sb2.append(", imageUri=");
            sb2.append(this.f2508b);
            sb2.append(", errorMessage=");
            return C22026a.c(sb2, this.f2509c, ')');
        }
    }

    /* compiled from: AutoEvidenceRequestAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCe/a$g;", "LCe/a;", "<init>", "()V", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.a$g */
    public static final class g implements InterfaceC13293a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f2510a = new g();
    }

    /* compiled from: AutoEvidenceRequestAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCe/a$h;", "LCe/a;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.a$h */
    public static final /* data */ class h implements InterfaceC13293a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final AttributedText f2511a;

        public h(@l AttributedText attributedText) {
            this.f2511a = attributedText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f2511a, ((h) obj).f2511a);
        }

        public final int hashCode() {
            AttributedText attributedText = this.f2511a;
            if (attributedText == null) {
                return 0;
            }
            return attributedText.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.w(new StringBuilder("OnSubmitButtonClicked(successMessage="), this.f2511a, ')');
        }
    }

    /* compiled from: AutoEvidenceRequestAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCe/a$i;", "LCe/a;", "<init>", "()V", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.a$i */
    public static final class i implements InterfaceC13293a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final i f2512a = new i();
    }

    /* compiled from: AutoEvidenceRequestAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCe/a$j;", "LCe/a;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.a$j */
    public static final /* data */ class j implements InterfaceC13293a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f2513a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2514b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f2515c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f2516d;

        public j(int i12, @Y61.k String str, @Y61.k String str2, boolean z12) {
            this.f2513a = str;
            this.f2514b = i12;
            this.f2515c = z12;
            this.f2516d = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return L.f(this.f2513a, jVar.f2513a) && this.f2514b == jVar.f2514b && this.f2515c == jVar.f2515c && L.f(this.f2516d, jVar.f2516d);
        }

        public final int hashCode() {
            return this.f2516d.hashCode() + r.i(r.e(this.f2514b, this.f2513a.hashCode() * 31, 31), 31, this.f2515c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnUploadButtonClicked(formId=");
            sb2.append(this.f2513a);
            sb2.append(", maxCount=");
            sb2.append(this.f2514b);
            sb2.append(", required=");
            sb2.append(this.f2515c);
            sb2.append(", errorMessage=");
            return C22026a.c(sb2, this.f2516d, ')');
        }
    }

    /* compiled from: AutoEvidenceRequestAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCe/a$k;", "LCe/a;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.a$k */
    public static final /* data */ class k implements InterfaceC13293a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f2517a;

        public k(@Y61.k String str) {
            this.f2517a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f2517a, ((k) obj).f2517a);
        }

        public final int hashCode() {
            return this.f2517a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnUrlClicked(url="), this.f2517a, ')');
        }
    }
}
