package Ui0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReferralContactsAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LUi0/d;", "", "a", "b", "c", "d", "e", "LUi0/d$a;", "LUi0/d$b;", "LUi0/d$c;", "LUi0/d$d;", "LUi0/d$e;", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface d {

    /* compiled from: ReferralContactsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUi0/d$a;", "LUi0/d;", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f16563a;

        public a(@k DeepLink deepLink) {
            this.f16563a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f16563a, ((a) obj).f16563a);
        }

        public final int hashCode() {
            return this.f16563a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("ButtonClick(action="), this.f16563a, ')');
        }
    }

    /* compiled from: ReferralContactsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUi0/d$b;", "LUi0/d;", "<init>", "()V", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f16564a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -378997278;
        }

        @k
        public final String toString() {
            return "CheckContactsPermission";
        }
    }

    /* compiled from: ReferralContactsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUi0/d$c;", "LUi0/d;", "<init>", "()V", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f16565a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -707097552;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: ReferralContactsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUi0/d$d;", "LUi0/d;", "<init>", "()V", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ui0.d$d, reason: collision with other inner class name */
    public static final /* data */ class C1138d implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1138d f16566a = new C1138d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1138d);
        }

        public final int hashCode() {
            return -697003245;
        }

        @k
        public final String toString() {
            return "Refresh";
        }
    }

    /* compiled from: ReferralContactsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUi0/d$e;", "LUi0/d;", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f16567a;

        public e(@k String str) {
            this.f16567a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f16567a, ((e) obj).f16567a);
        }

        public final int hashCode() {
            return this.f16567a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("TextChanged(text="), this.f16567a, ')');
        }
    }
}
