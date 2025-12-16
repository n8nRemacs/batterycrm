package com.avito.android.gig_shift_action.mvi;

import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.gig.shift_action_impl.generated.api.qr_scan_v_2.Reason;
import com.avito.android.work_profile.deeplink.JobSeekerCvsLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GigShiftActionInternalAction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b`\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/gig_shift_action/mvi/q;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "_avito_gig_shift-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface q {

    /* compiled from: GigShiftActionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_shift_action/mvi/q$a;", "Lcom/avito/android/gig_shift_action/mvi/q;", "_avito_gig_shift-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final DeepLink f160502a;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f160502a, ((a) obj).f160502a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f160502a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("ActionOk(deeplink="), this.f160502a, ')');
        }

        public a(@Y61.l DeepLink deepLink) {
            this.f160502a = deepLink;
        }

        public /* synthetic */ a(DeepLink deepLink, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : deepLink);
        }
    }

    /* compiled from: GigShiftActionInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_shift_action/mvi/q$b;", "Lcom/avito/android/gig_shift_action/mvi/q;", "<init>", "()V", "_avito_gig_shift-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f160503a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1295542087;
        }

        @Y61.k
        public final String toString() {
            return "CommonError";
        }
    }

    /* compiled from: GigShiftActionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_shift_action/mvi/q$c;", "Lcom/avito/android/gig_shift_action/mvi/q;", "_avito_gig_shift-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f160504a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f160505b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final z f160506c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f160507d;

        public c(@Y61.k String str, @Y61.l String str2, @Y61.k z zVar, @Y61.k String str3) {
            this.f160504a = str;
            this.f160505b = str2;
            this.f160506c = zVar;
            this.f160507d = str3;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f160504a, cVar.f160504a) && L.f(this.f160505b, cVar.f160505b) && L.f(this.f160506c, cVar.f160506c) && L.f(this.f160507d, cVar.f160507d);
        }

        public final int hashCode() {
            int iHashCode = this.f160504a.hashCode() * 31;
            String str = this.f160505b;
            return this.f160507d.hashCode() + ((this.f160506c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentLoaded(title=");
            sb2.append(this.f160504a);
            sb2.append(", description=");
            sb2.append(this.f160505b);
            sb2.append(", itemState=");
            sb2.append(this.f160506c);
            sb2.append(", buttonText=");
            return C22026a.c(sb2, this.f160507d, ')');
        }
    }

    /* compiled from: GigShiftActionInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_shift_action/mvi/q$d;", "Lcom/avito/android/gig_shift_action/mvi/q;", "<init>", "()V", "_avito_gig_shift-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f160508a = new d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1635162522;
        }

        @Y61.k
        public final String toString() {
            return "Dismiss";
        }
    }

    /* compiled from: GigShiftActionInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_shift_action/mvi/q$e;", "Lcom/avito/android/gig_shift_action/mvi/q;", "<init>", "()V", "_avito_gig_shift-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f160509a = new e();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -71594592;
        }

        @Y61.k
        public final String toString() {
            return "DismissForScan";
        }
    }

    /* compiled from: GigShiftActionInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_shift_action/mvi/q$f;", "Lcom/avito/android/gig_shift_action/mvi/q;", "<init>", "()V", "_avito_gig_shift-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f160510a = new f();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1614217497;
        }

        @Y61.k
        public final String toString() {
            return "LoadNotFound";
        }
    }

    /* compiled from: GigShiftActionInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_shift_action/mvi/q$g;", "Lcom/avito/android/gig_shift_action/mvi/q;", "<init>", "()V", "_avito_gig_shift-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f160511a = new g();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1324782872;
        }

        @Y61.k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: GigShiftActionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_shift_action/mvi/q$h;", "Lcom/avito/android/gig_shift_action/mvi/q;", "_avito_gig_shift-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final JobSeekerCvsLink f160512a;

        public h(@Y61.k JobSeekerCvsLink jobSeekerCvsLink) {
            this.f160512a = jobSeekerCvsLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f160512a.equals(((h) obj).f160512a);
        }

        public final int hashCode() {
            return this.f160512a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenDeeplink(deepLink=" + this.f160512a + ')';
        }
    }

    /* compiled from: GigShiftActionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_shift_action/mvi/q$i;", "Lcom/avito/android/gig_shift_action/mvi/q;", "_avito_gig_shift-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Reason f160513a;

        public i(@Y61.k Reason reason) {
            this.f160513a = reason;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f160513a, ((i) obj).f160513a);
        }

        public final int hashCode() {
            return this.f160513a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ReasonChecked(reason=" + this.f160513a + ')';
        }
    }

    /* compiled from: GigShiftActionInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_shift_action/mvi/q$j;", "Lcom/avito/android/gig_shift_action/mvi/q;", "<init>", "()V", "_avito_gig_shift-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final j f160514a = new j();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 2122314446;
        }

        @Y61.k
        public final String toString() {
            return "ShowReasons";
        }
    }
}
