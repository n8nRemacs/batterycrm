package Fx;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.document_verification_status_screen.models.ButtonAction;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VerificationStatusAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"LFx/a;", "", "<init>", "()V", "a", "b", "c", "d", "LFx/a$a;", "LFx/a$b;", "LFx/a$c;", "LFx/a$d;", "_avito_gig_document-verification-status-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Fx.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC13848a {

    /* compiled from: VerificationStatusAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFx/a$a;", "LFx/a;", "<init>", "()V", "_avito_gig_document-verification-status-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fx.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0310a extends AbstractC13848a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0310a f6041a = new C0310a();

        public C0310a() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0310a);
        }

        public final int hashCode() {
            return 544603761;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: VerificationStatusAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFx/a$b;", "LFx/a;", "_avito_gig_document-verification-status-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fx.a$b */
    public static final /* data */ class b extends AbstractC13848a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ButtonAction f6042a;

        public b(@k ButtonAction buttonAction) {
            super(null);
            this.f6042a = buttonAction;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f6042a, ((b) obj).f6042a);
        }

        public final int hashCode() {
            return this.f6042a.hashCode();
        }

        @k
        public final String toString() {
            return "OnButtonClick(buttonAction=" + this.f6042a + ')';
        }
    }

    /* compiled from: VerificationStatusAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFx/a$c;", "LFx/a;", "<init>", "()V", "_avito_gig_document-verification-status-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fx.a$c */
    public static final /* data */ class c extends AbstractC13848a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f6043a = new c();

        public c() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -402884332;
        }

        @k
        public final String toString() {
            return "Refresh";
        }
    }

    /* compiled from: VerificationStatusAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFx/a$d;", "LFx/a;", "_avito_gig_document-verification-status-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fx.a$d */
    public static final /* data */ class d extends AbstractC13848a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f6044a;

        public d(@k DeepLink deepLink) {
            super(null);
            this.f6044a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f6044a, ((d) obj).f6044a);
        }

        public final int hashCode() {
            return this.f6044a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("SupportButtonClick(deeplink="), this.f6044a, ')');
        }
    }

    public /* synthetic */ AbstractC13848a(C42822w c42822w) {
        this();
    }

    public AbstractC13848a() {
    }
}
