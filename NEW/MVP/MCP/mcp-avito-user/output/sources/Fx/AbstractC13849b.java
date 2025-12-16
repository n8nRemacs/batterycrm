package Fx;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.document_verification_status_screen.models.ButtonAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VerificationStatusInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"LFx/b;", "", "<init>", "()V", "a", "b", "c", "d", "LFx/b$a;", "LFx/b$b;", "LFx/b$c;", "LFx/b$d;", "_avito_gig_document-verification-status-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Fx.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC13849b {

    /* compiled from: VerificationStatusInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFx/b$a;", "LFx/b;", "<init>", "()V", "_avito_gig_document-verification-status-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fx.b$a */
    public static final /* data */ class a extends AbstractC13849b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f6045a = new a();

        public a() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -215677746;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: VerificationStatusInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFx/b$c;", "LFx/b;", "<init>", "()V", "_avito_gig_document-verification-status-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fx.b$c */
    public static final /* data */ class c extends AbstractC13849b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f6052a = new c();

        public c() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -213649186;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: VerificationStatusInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFx/b$d;", "LFx/b;", "<init>", "()V", "_avito_gig_document-verification-status-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fx.b$d */
    public static final /* data */ class d extends AbstractC13849b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f6053a = new d();

        public d() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 76742372;
        }

        @k
        public final String toString() {
            return "StartLoading";
        }
    }

    public /* synthetic */ AbstractC13849b(C42822w c42822w) {
        this();
    }

    public AbstractC13849b() {
    }

    /* compiled from: VerificationStatusInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFx/b$b;", "LFx/b;", "_avito_gig_document-verification-status-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fx.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0311b extends AbstractC13849b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f6046a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f6047b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f6048c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final List<ButtonAction> f6049d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final DeepLink f6050e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f6051f;

        public C0311b(String str, String str2, String str3, List list, DeepLink deepLink, String str4, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? "" : str2, deepLink, (i12 & 4) != 0 ? "" : str3, str4, (i12 & 8) != 0 ? C42784z0.f406748b : list);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0311b)) {
                return false;
            }
            C0311b c0311b = (C0311b) obj;
            return L.f(this.f6046a, c0311b.f6046a) && L.f(this.f6047b, c0311b.f6047b) && L.f(this.f6048c, c0311b.f6048c) && L.f(this.f6049d, c0311b.f6049d) && L.f(this.f6050e, c0311b.f6050e) && L.f(this.f6051f, c0311b.f6051f);
        }

        public final int hashCode() {
            int iE2 = H.e(H.d(H.d(this.f6046a.hashCode() * 31, 31, this.f6047b), 31, this.f6048c), 31, this.f6049d);
            DeepLink deepLink = this.f6050e;
            int iHashCode = (iE2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            String str = this.f6051f;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentLoaded(title=");
            sb2.append(this.f6046a);
            sb2.append(", description=");
            sb2.append(this.f6047b);
            sb2.append(", logoUrl=");
            sb2.append(this.f6048c);
            sb2.append(", actions=");
            sb2.append(this.f6049d);
            sb2.append(", supportButtonDeepLink=");
            sb2.append(this.f6050e);
            sb2.append(", status=");
            return C22026a.c(sb2, this.f6051f, ')');
        }

        public C0311b(@k String str, @k String str2, @l DeepLink deepLink, @k String str3, @l String str4, @k List list) {
            super(null);
            this.f6046a = str;
            this.f6047b = str2;
            this.f6048c = str3;
            this.f6049d = list;
            this.f6050e = deepLink;
            this.f6051f = str4;
        }
    }
}
