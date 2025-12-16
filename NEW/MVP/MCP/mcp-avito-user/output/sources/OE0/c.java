package Oe0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.CategoryModel;
import com.avito.android.remote.model.Navigation;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuggestCategoryOneTimeEvent.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LOe0/c;", "", "a", "b", "c", "d", "e", "f", "LOe0/c$a;", "LOe0/c$b;", "LOe0/c$c;", "LOe0/c$d;", "LOe0/c$e;", "LOe0/c$f;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface c {

    /* compiled from: SuggestCategoryOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOe0/c$a;", "LOe0/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final CategoryModel f12465a;

        public a(@k CategoryModel categoryModel) {
            this.f12465a = categoryModel;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f12465a, ((a) obj).f12465a);
        }

        public final int hashCode() {
            return this.f12465a.hashCode();
        }

        @k
        public final String toString() {
            return "ChangeVertical(model=" + this.f12465a + ')';
        }
    }

    /* compiled from: SuggestCategoryOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOe0/c$b;", "LOe0/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f12466a;

        public b(boolean z12) {
            this.f12466a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f12466a == ((b) obj).f12466a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f12466a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("CloseWizard(stayOnSuggests="), this.f12466a, ')');
        }
    }

    /* compiled from: SuggestCategoryOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOe0/c$c;", "LOe0/c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oe0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0799c implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0799c f12467a = new C0799c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0799c);
        }

        public final int hashCode() {
            return 1819914476;
        }

        @k
        public final String toString() {
            return "GoToPreviousStep";
        }
    }

    /* compiled from: SuggestCategoryOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOe0/c$d;", "LOe0/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Navigation f12468a;

        public d(@k Navigation navigation2) {
            this.f12468a = navigation2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f12468a, ((d) obj).f12468a);
        }

        public final int hashCode() {
            return this.f12468a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenWizard(navigation=" + this.f12468a + ')';
        }
    }

    /* compiled from: SuggestCategoryOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOe0/c$e;", "LOe0/c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f12469a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 2023330354;
        }

        @k
        public final String toString() {
            return "SaveAndExit";
        }
    }

    /* compiled from: SuggestCategoryOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOe0/c$f;", "LOe0/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ru.avito.component.toolbar.d f12470a;

        public f(@k ru.avito.component.toolbar.d dVar) {
            this.f12470a = dVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f12470a, ((f) obj).f12470a);
        }

        public final int hashCode() {
            return this.f12470a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowOnboarding(onboardingData=" + this.f12470a + ')';
        }
    }
}
