package Pe0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WizardAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LPe0/a;", "", "a", "b", "c", "d", "e", "LPe0/a$a;", "LPe0/a$b;", "LPe0/a$c;", "LPe0/a$d;", "LPe0/a$e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Pe0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC14777a {

    /* compiled from: WizardAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPe0/a$a;", "LPe0/a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pe0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0853a implements InterfaceC14777a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0853a f13190a = new C0853a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0853a);
        }

        public final int hashCode() {
            return 592436760;
        }

        @k
        public final String toString() {
            return "BackClick";
        }
    }

    /* compiled from: WizardAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPe0/a$b;", "LPe0/a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pe0.a$b */
    public static final /* data */ class b implements InterfaceC14777a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f13191a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1466598425;
        }

        @k
        public final String toString() {
            return "CloseClick";
        }
    }

    /* compiled from: WizardAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPe0/a$c;", "LPe0/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pe0.a$c */
    public static final /* data */ class c implements InterfaceC14777a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f13192a;

        public c(@k DeepLink deepLink) {
            this.f13192a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f13192a, ((c) obj).f13192a);
        }

        public final int hashCode() {
            return this.f13192a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DeeplinkClick(deeplink="), this.f13192a, ')');
        }
    }

    /* compiled from: WizardAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPe0/a$d;", "LPe0/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pe0.a$d */
    public static final /* data */ class d implements InterfaceC14777a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f13193a;

        public d(@k String str) {
            this.f13193a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f13193a, ((d) obj).f13193a);
        }

        public final int hashCode() {
            return this.f13193a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ItemClick(navigationId="), this.f13193a, ')');
        }
    }

    /* compiled from: WizardAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPe0/a$e;", "LPe0/a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pe0.a$e */
    public static final /* data */ class e implements InterfaceC14777a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f13194a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1904628375;
        }

        @k
        public final String toString() {
            return "RetryClick";
        }
    }
}
