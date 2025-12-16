package Ce;

import android.net.Uri;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.auto_evidence_request.s;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.photo_cache.q;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoEvidenceRequestInternalAction.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0013\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0082\u0001\u0013\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006("}, d2 = {"LCe/c;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "LCe/c$a;", "LCe/c$b;", "LCe/c$c;", "LCe/c$d;", "LCe/c$e;", "LCe/c$f;", "LCe/c$g;", "LCe/c$h;", "LCe/c$i;", "LCe/c$j;", "LCe/c$k;", "LCe/c$l;", "LCe/c$m;", "LCe/c$n;", "LCe/c$o;", "LCe/c$p;", "LCe/c$q;", "LCe/c$r;", "LCe/c$s;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ce.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC13295c {

    /* compiled from: AutoEvidenceRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCe/c$a;", "LCe/c;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.c$a */
    public static final /* data */ class a implements InterfaceC13295c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final AttributedText f2530a;

        public a(@Y61.l AttributedText attributedText) {
            this.f2530a = attributedText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f2530a, ((a) obj).f2530a);
        }

        public final int hashCode() {
            AttributedText attributedText = this.f2530a;
            if (attributedText == null) {
                return 0;
            }
            return attributedText.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.w(new StringBuilder("CloseScreenWithSuccess(message="), this.f2530a, ')');
        }
    }

    /* compiled from: AutoEvidenceRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCe/c$b;", "LCe/c;", "<init>", "()V", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.c$b */
    public static final class b implements InterfaceC13295c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f2531a = new b();
    }

    /* compiled from: AutoEvidenceRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCe/c$c;", "LCe/c;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0118c implements InterfaceC13295c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f2532a;

        public C0118c(@Y61.l String str) {
            this.f2532a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0118c) && L.f(this.f2532a, ((C0118c) obj).f2532a);
        }

        public final int hashCode() {
            String str = this.f2532a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("FormSubmitError(message="), this.f2532a, ')');
        }
    }

    /* compiled from: AutoEvidenceRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCe/c$d;", "LCe/c;", "<init>", "()V", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.c$d */
    public static final class d implements InterfaceC13295c {
        static {
            new d();
        }
    }

    /* compiled from: AutoEvidenceRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCe/c$e;", "LCe/c;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.c$e */
    public static final /* data */ class e implements InterfaceC13295c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final AttributedText f2533a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f2534b;

        public e(@Y61.l AttributedText attributedText, @Y61.k String str) {
            this.f2533a = attributedText;
            this.f2534b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f2533a, eVar.f2533a) && L.f(this.f2534b, eVar.f2534b);
        }

        public final int hashCode() {
            AttributedText attributedText = this.f2533a;
            return this.f2534b.hashCode() + ((attributedText == null ? 0 : attributedText.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnFileCancelled(message=");
            sb2.append(this.f2533a);
            sb2.append(", formId=");
            return C22026a.c(sb2, this.f2534b, ')');
        }
    }

    /* compiled from: AutoEvidenceRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCe/c$f;", "LCe/c;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.c$f */
    public static final /* data */ class f implements InterfaceC13295c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final AttributedText f2535a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f2536b;

        public f(@Y61.l AttributedText attributedText, @Y61.k String str) {
            this.f2535a = attributedText;
            this.f2536b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f2535a, fVar.f2535a) && L.f(this.f2536b, fVar.f2536b);
        }

        public final int hashCode() {
            AttributedText attributedText = this.f2535a;
            return this.f2536b.hashCode() + ((attributedText == null ? 0 : attributedText.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnFileDeleted(message=");
            sb2.append(this.f2535a);
            sb2.append(", formId=");
            return C22026a.c(sb2, this.f2536b, ')');
        }
    }

    /* compiled from: AutoEvidenceRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCe/c$g;", "LCe/c;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.c$g */
    public static final /* data */ class g implements InterfaceC13295c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f2537a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f2538b;

        public g(@Y61.k String str, @Y61.k String str2) {
            this.f2537a = str;
            this.f2538b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f2537a, gVar.f2537a) && L.f(this.f2538b, gVar.f2538b);
        }

        public final int hashCode() {
            return this.f2538b.hashCode() + (this.f2537a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnPhotoPickerError(formId=");
            sb2.append(this.f2537a);
            sb2.append(", message=");
            return C22026a.c(sb2, this.f2538b, ')');
        }
    }

    /* compiled from: AutoEvidenceRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCe/c$h;", "LCe/c;", "<init>", "()V", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.c$h */
    public static final class h implements InterfaceC13295c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f2539a = new h();
    }

    /* compiled from: AutoEvidenceRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCe/c$i;", "LCe/c;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.c$i */
    public static final /* data */ class i implements InterfaceC13295c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f2540a;

        public i(@Y61.k DeepLink deepLink) {
            this.f2540a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f2540a, ((i) obj).f2540a);
        }

        public final int hashCode() {
            return this.f2540a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(uri="), this.f2540a, ')');
        }
    }

    /* compiled from: AutoEvidenceRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCe/c$j;", "LCe/c;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.c$j */
    public static final /* data */ class j implements InterfaceC13295c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f2541a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2542b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f2543c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f2544d;

        public j(int i12, @Y61.k String str, @Y61.k String str2, boolean z12) {
            this.f2541a = str;
            this.f2542b = i12;
            this.f2543c = z12;
            this.f2544d = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return L.f(this.f2541a, jVar.f2541a) && this.f2542b == jVar.f2542b && this.f2543c == jVar.f2543c && L.f(this.f2544d, jVar.f2544d);
        }

        public final int hashCode() {
            return this.f2544d.hashCode() + androidx.appcompat.app.r.i(androidx.appcompat.app.r.e(this.f2542b, this.f2541a.hashCode() * 31, 31), 31, this.f2543c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenPhotoPicker(formId=");
            sb2.append(this.f2541a);
            sb2.append(", maxCount=");
            sb2.append(this.f2542b);
            sb2.append(", required=");
            sb2.append(this.f2543c);
            sb2.append(", errorMessage=");
            return C22026a.c(sb2, this.f2544d, ')');
        }
    }

    /* compiled from: AutoEvidenceRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCe/c$k;", "LCe/c;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.c$k */
    public static final /* data */ class k implements InterfaceC13295c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Uri f2545a;

        public k(@Y61.k Uri uri) {
            this.f2545a = uri;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f2545a, ((k) obj).f2545a);
        }

        public final int hashCode() {
            return this.f2545a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.t(new StringBuilder("OpenUrl(url="), this.f2545a, ')');
        }
    }

    /* compiled from: AutoEvidenceRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCe/c$l;", "LCe/c;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.c$l */
    public static final /* data */ class l implements InterfaceC13295c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final q.c f2546a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f2547b;

        public l(@Y61.k q.c cVar, @Y61.k String str) {
            this.f2546a = cVar;
            this.f2547b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return L.f(this.f2546a, lVar.f2546a) && L.f(this.f2547b, lVar.f2547b);
        }

        public final int hashCode() {
            return this.f2547b.hashCode() + (this.f2546a.f216338a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PhotoLoaded(state=");
            sb2.append(this.f2546a);
            sb2.append(", formId=");
            return C22026a.c(sb2, this.f2547b, ')');
        }
    }

    /* compiled from: AutoEvidenceRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCe/c$m;", "LCe/c;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.c$m */
    public static final /* data */ class m implements InterfaceC13295c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final q.d f2548a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f2549b;

        public m(@Y61.k q.d dVar, @Y61.k String str) {
            this.f2548a = dVar;
            this.f2549b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return L.f(this.f2548a, mVar.f2548a) && L.f(this.f2549b, mVar.f2549b);
        }

        public final int hashCode() {
            return this.f2549b.hashCode() + (this.f2548a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PhotoLoading(state=");
            sb2.append(this.f2548a);
            sb2.append(", formId=");
            return C22026a.c(sb2, this.f2549b, ')');
        }
    }

    /* compiled from: AutoEvidenceRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCe/c$n;", "LCe/c;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.c$n */
    public static final /* data */ class n implements InterfaceC13295c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final q.a f2550a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f2551b;

        public n(@Y61.k q.a aVar, @Y61.k String str) {
            this.f2550a = aVar;
            this.f2551b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return L.f(this.f2550a, nVar.f2550a) && L.f(this.f2551b, nVar.f2551b);
        }

        public final int hashCode() {
            return this.f2551b.hashCode() + (this.f2550a.f216337a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PhotoLoadingError(state=");
            sb2.append(this.f2550a);
            sb2.append(", formId=");
            return C22026a.c(sb2, this.f2551b, ')');
        }
    }

    /* compiled from: AutoEvidenceRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCe/c$o;", "LCe/c;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.c$o */
    public static final /* data */ class o implements InterfaceC13295c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Uri f2552a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f2553b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f2554c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f2555d;

        public o(@Y61.k Uri uri, @Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
            this.f2552a = uri;
            this.f2553b = str;
            this.f2554c = str2;
            this.f2555d = str3;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return L.f(this.f2552a, oVar.f2552a) && L.f(this.f2553b, oVar.f2553b) && L.f(this.f2554c, oVar.f2554c) && L.f(this.f2555d, oVar.f2555d);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f2552a.hashCode() * 31, 31, this.f2553b);
            String str = this.f2554c;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f2555d;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PhotoLoadingInfo(localUri=");
            sb2.append(this.f2552a);
            sb2.append(", formId=");
            sb2.append(this.f2553b);
            sb2.append(", fileName=");
            sb2.append(this.f2554c);
            sb2.append(", fileSize=");
            return C22026a.c(sb2, this.f2555d, ')');
        }
    }

    /* compiled from: AutoEvidenceRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCe/c$p;", "LCe/c;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.c$p */
    public static final /* data */ class p implements InterfaceC13295c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f2556a;

        public p(@Y61.k ArrayList arrayList) {
            this.f2556a = arrayList;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.f2556a.equals(((p) obj).f2556a);
        }

        public final int hashCode() {
            return this.f2556a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("SetConstraints(listValidations="), this.f2556a, ')');
        }
    }

    /* compiled from: AutoEvidenceRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCe/c$q;", "LCe/c;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.c$q */
    public static final /* data */ class q implements InterfaceC13295c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ApiError f2557a;

        public q(@Y61.k ApiError apiError) {
            this.f2557a = apiError;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && L.f(this.f2557a, ((q) obj).f2557a);
        }

        public final int hashCode() {
            return this.f2557a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.n(new StringBuilder("ShowFormLoadingError(error="), this.f2557a, ')');
        }
    }

    /* compiled from: AutoEvidenceRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCe/c$r;", "LCe/c;", "<init>", "()V", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.c$r */
    public static final class r implements InterfaceC13295c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final r f2558a = new r();
    }

    /* compiled from: AutoEvidenceRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCe/c$s;", "LCe/c;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.c$s */
    public static final /* data */ class s implements InterfaceC13295c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f2559a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f2560b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final AttributedText f2561c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final s.c f2562d;

        public s(@Y61.k ArrayList arrayList, @Y61.l String str, @Y61.l AttributedText attributedText, @Y61.l s.c cVar) {
            this.f2559a = arrayList;
            this.f2560b = str;
            this.f2561c = attributedText;
            this.f2562d = cVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return this.f2559a.equals(sVar.f2559a) && L.f(this.f2560b, sVar.f2560b) && L.f(this.f2561c, sVar.f2561c) && this.f2562d.equals(sVar.f2562d);
        }

        public final int hashCode() {
            int iHashCode = this.f2559a.hashCode() * 31;
            String str = this.f2560b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            AttributedText attributedText = this.f2561c;
            return this.f2562d.hashCode() + ((iHashCode2 + (attributedText != null ? attributedText.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            return "StructureLoaded(mainItems=" + this.f2559a + ", submitButtonText=" + this.f2560b + ", disclaimerText=" + this.f2561c + ", toastSuccess=" + this.f2562d + ')';
        }
    }
}
