package Ce;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoEvidenceRequestEvent.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"LCe/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "LCe/b$a;", "LCe/b$b;", "LCe/b$c;", "LCe/b$d;", "LCe/b$e;", "LCe/b$f;", "LCe/b$g;", "LCe/b$h;", "LCe/b$i;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ce.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC13294b {

    /* compiled from: AutoEvidenceRequestEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCe/b$a;", "LCe/b;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.b$a */
    public static final /* data */ class a implements InterfaceC13294b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final AttributedText f2518a;

        public a(@l AttributedText attributedText) {
            this.f2518a = attributedText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f2518a, ((a) obj).f2518a);
        }

        public final int hashCode() {
            AttributedText attributedText = this.f2518a;
            if (attributedText == null) {
                return 0;
            }
            return attributedText.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.w(new StringBuilder("CloseScreenWithSuccess(message="), this.f2518a, ')');
        }
    }

    /* compiled from: AutoEvidenceRequestEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCe/b$b;", "LCe/b;", "<init>", "()V", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.b$b, reason: collision with other inner class name */
    public static final class C0117b implements InterfaceC13294b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0117b f2519a = new C0117b();
    }

    /* compiled from: AutoEvidenceRequestEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCe/b$c;", "LCe/b;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.b$c */
    public static final /* data */ class c implements InterfaceC13294b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f2520a;

        public c(@k DeepLink deepLink) {
            this.f2520a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f2520a, ((c) obj).f2520a);
        }

        public final int hashCode() {
            return this.f2520a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(uri="), this.f2520a, ')');
        }
    }

    /* compiled from: AutoEvidenceRequestEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCe/b$d;", "LCe/b;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.b$d */
    public static final /* data */ class d implements InterfaceC13294b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f2521a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2522b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f2523c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f2524d;

        public d(int i12, @k String str, @k String str2, boolean z12) {
            this.f2521a = str;
            this.f2522b = i12;
            this.f2523c = z12;
            this.f2524d = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f2521a, dVar.f2521a) && this.f2522b == dVar.f2522b && this.f2523c == dVar.f2523c && L.f(this.f2524d, dVar.f2524d);
        }

        public final int hashCode() {
            return this.f2524d.hashCode() + r.i(r.e(this.f2522b, this.f2521a.hashCode() * 31, 31), 31, this.f2523c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenPhotoPicker(formId=");
            sb2.append(this.f2521a);
            sb2.append(", maxCount=");
            sb2.append(this.f2522b);
            sb2.append(", required=");
            sb2.append(this.f2523c);
            sb2.append(", errorMessage=");
            return C22026a.c(sb2, this.f2524d, ')');
        }
    }

    /* compiled from: AutoEvidenceRequestEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCe/b$e;", "LCe/b;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.b$e */
    public static final /* data */ class e implements InterfaceC13294b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Uri f2525a;

        public e(@k Uri uri) {
            this.f2525a = uri;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f2525a, ((e) obj).f2525a);
        }

        public final int hashCode() {
            return this.f2525a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.t(new StringBuilder("OpenUrl(url="), this.f2525a, ')');
        }
    }

    /* compiled from: AutoEvidenceRequestEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCe/b$f;", "LCe/b;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.b$f */
    public static final /* data */ class f implements InterfaceC13294b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f2526a;

        public f(@k ArrayList arrayList) {
            this.f2526a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f2526a.equals(((f) obj).f2526a);
        }

        public final int hashCode() {
            return this.f2526a.hashCode();
        }

        @k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("SetConstraints(listValidations="), this.f2526a, ')');
        }
    }

    /* compiled from: AutoEvidenceRequestEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCe/b$g;", "LCe/b;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.b$g */
    public static final /* data */ class g implements InterfaceC13294b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final AttributedText f2527a;

        public g(@l AttributedText attributedText) {
            this.f2527a = attributedText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f2527a, ((g) obj).f2527a);
        }

        public final int hashCode() {
            AttributedText attributedText = this.f2527a;
            if (attributedText == null) {
                return 0;
            }
            return attributedText.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.w(new StringBuilder("ShowCancelledToast(message="), this.f2527a, ')');
        }
    }

    /* compiled from: AutoEvidenceRequestEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCe/b$h;", "LCe/b;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.b$h */
    public static final /* data */ class h implements InterfaceC13294b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final AttributedText f2528a;

        public h(@l AttributedText attributedText) {
            this.f2528a = attributedText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f2528a, ((h) obj).f2528a);
        }

        public final int hashCode() {
            AttributedText attributedText = this.f2528a;
            if (attributedText == null) {
                return 0;
            }
            return attributedText.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.w(new StringBuilder("ShowDeletedToast(message="), this.f2528a, ')');
        }
    }

    /* compiled from: AutoEvidenceRequestEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCe/b$i;", "LCe/b;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.b$i */
    public static final /* data */ class i implements InterfaceC13294b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f2529a;

        public i(@l String str) {
            this.f2529a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f2529a, ((i) obj).f2529a);
        }

        public final int hashCode() {
            String str = this.f2529a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowSubmitErrorToast(message="), this.f2529a, ')');
        }
    }
}
