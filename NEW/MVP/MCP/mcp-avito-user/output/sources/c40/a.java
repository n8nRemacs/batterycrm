package C40;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.onboarding.dialog.view.carousel.AdditionalActionItem;
import com.avito.android.onboarding.dialog.view.carousel.OnboardingCarouselItem;
import com.avito.android.onboarding.dialog.view.quiz.OnboardingQuizItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OnboardingDialogAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LC40/a;", "", "a", "b", "c", "d", "e", "f", "g", "LC40/a$a;", "LC40/a$b;", "LC40/a$c;", "LC40/a$d;", "LC40/a$e;", "LC40/a$f;", "LC40/a$g;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: OnboardingDialogAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LC40/a$a;", "LC40/a;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: C40.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0088a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final OnboardingCarouselItem f1906a;

        public C0088a(@k OnboardingCarouselItem onboardingCarouselItem) {
            this.f1906a = onboardingCarouselItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0088a) && L.f(this.f1906a, ((C0088a) obj).f1906a);
        }

        public final int hashCode() {
            return this.f1906a.hashCode();
        }

        @k
        public final String toString() {
            return "CarouselActionButtonClick(item=" + this.f1906a + ')';
        }
    }

    /* compiled from: OnboardingDialogAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LC40/a$b;", "LC40/a;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final long f1907a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AdditionalActionItem f1908b;

        public b(long j12, @k AdditionalActionItem additionalActionItem) {
            this.f1907a = j12;
            this.f1908b = additionalActionItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f1907a == bVar.f1907a && L.f(this.f1908b, bVar.f1908b);
        }

        public final int hashCode() {
            return this.f1908b.hashCode() + (Long.hashCode(this.f1907a) * 31);
        }

        @k
        public final String toString() {
            return "CarouselAdditionalButtonClick(itemId=" + this.f1907a + ", additionalButton=" + this.f1908b + ')';
        }
    }

    /* compiled from: OnboardingDialogAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LC40/a$c;", "LC40/a;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final long f1909a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1910b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f1911c;

        public c(int i12, long j12, boolean z12) {
            this.f1909a = j12;
            this.f1910b = i12;
            this.f1911c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f1909a == cVar.f1909a && this.f1910b == cVar.f1910b && this.f1911c == cVar.f1911c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f1911c) + r.e(this.f1910b, Long.hashCode(this.f1909a) * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeQuizAnswer(itemId=");
            sb2.append(this.f1909a);
            sb2.append(", answerId=");
            sb2.append(this.f1910b);
            sb2.append(", isSelected=");
            return r.x(sb2, this.f1911c, ')');
        }
    }

    /* compiled from: OnboardingDialogAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LC40/a$d;", "LC40/a;", "<init>", "()V", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f1912a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1788304444;
        }

        @k
        public final String toString() {
            return "DismissDialog";
        }
    }

    /* compiled from: OnboardingDialogAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LC40/a$e;", "LC40/a;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Uri f1913a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f1914b;

        public e(@k Uri uri, @l String str) {
            this.f1913a = uri;
            this.f1914b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f1913a, eVar.f1913a) && L.f(this.f1914b, eVar.f1914b);
        }

        public final int hashCode() {
            int iHashCode = this.f1913a.hashCode() * 31;
            String str = this.f1914b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PreviewButtonClick(uri=");
            sb2.append(this.f1913a);
            sb2.append(", buttonName=");
            return C22026a.c(sb2, this.f1914b, ')');
        }
    }

    /* compiled from: OnboardingDialogAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LC40/a$f;", "LC40/a;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final OnboardingQuizItem f1915a;

        public f(@k OnboardingQuizItem onboardingQuizItem) {
            this.f1915a = onboardingQuizItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f1915a, ((f) obj).f1915a);
        }

        public final int hashCode() {
            return this.f1915a.hashCode();
        }

        @k
        public final String toString() {
            return "QuizActionButtonClick(item=" + this.f1915a + ')';
        }
    }

    /* compiled from: OnboardingDialogAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LC40/a$g;", "LC40/a;", "<init>", "()V", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f1916a = new g();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -871777106;
        }

        @k
        public final String toString() {
            return "ShowPreviousQuizPage";
        }
    }
}
