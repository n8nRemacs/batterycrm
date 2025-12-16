package tv;

import Y61.k;
import Y61.l;
import com.avito.android.cv_validation_bottom_sheet.deeplink.CvValidationLink;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JobApplyCreateAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Ltv/a;", "", "a", "b", "c", "Ltv/a$a;", "Ltv/a$b;", "Ltv/a$c;", "_avito_job_apply-only-with-cv_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tv.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC48726a {

    /* compiled from: JobApplyCreateAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltv/a$a;", "Ltv/a;", "_avito_job_apply-only-with-cv_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tv.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12693a implements InterfaceC48726a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f439660a;

        public C12693a(@l DeepLink deepLink) {
            this.f439660a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12693a) && L.f(this.f439660a, ((C12693a) obj).f439660a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f439660a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f439660a, ')');
        }
    }

    /* compiled from: JobApplyCreateAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltv/a$b;", "Ltv/a;", "<init>", "()V", "_avito_job_apply-only-with-cv_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tv.a$b */
    public static final /* data */ class b implements InterfaceC48726a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f439661a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -890545797;
        }

        @k
        public final String toString() {
            return "OpenMessenger";
        }
    }

    /* compiled from: JobApplyCreateAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltv/a$c;", "Ltv/a;", "_avito_job_apply-only-with-cv_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tv.a$c */
    public static final /* data */ class c implements InterfaceC48726a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final CvValidationLink f439662a;

        public c(@k CvValidationLink cvValidationLink) {
            this.f439662a = cvValidationLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f439662a, ((c) obj).f439662a);
        }

        public final int hashCode() {
            return this.f439662a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenValidation(cvValidationLink=" + this.f439662a + ')';
        }
    }
}
