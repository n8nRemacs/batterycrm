package Dc0;

import Cc0.InterfaceC13241a;
import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileSummaryFeatureInterAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LDc0/e;", "", "a", "b", "c", "d", "LDc0/e$a;", "LDc0/e$b;", "LDc0/e$c;", "LDc0/e$d;", "_avito_profile-tab_summary_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface e {

    /* compiled from: ProfileSummaryFeatureInterAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDc0/e$a;", "LDc0/e;", "_avito_profile-tab_summary_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InterfaceC13241a f3272a;

        public a(@k InterfaceC13241a interfaceC13241a) {
            this.f3272a = interfaceC13241a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f3272a, ((a) obj).f3272a);
        }

        public final int hashCode() {
            return this.f3272a.hashCode();
        }

        @k
        public final String toString() {
            return "LoadingResult(response=" + this.f3272a + ')';
        }
    }

    /* compiled from: ProfileSummaryFeatureInterAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDc0/e$b;", "LDc0/e;", "<init>", "()V", "_avito_profile-tab_summary_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f3273a = 0;

        static {
            new b();
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1690473504;
        }

        @k
        public final String toString() {
            return "LoadingStart";
        }
    }

    /* compiled from: ProfileSummaryFeatureInterAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDc0/e$c;", "LDc0/e;", "<init>", "()V", "_avito_profile-tab_summary_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f3274a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 2087129451;
        }

        @k
        public final String toString() {
            return "NoChange";
        }
    }

    /* compiled from: ProfileSummaryFeatureInterAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDc0/e$d;", "LDc0/e;", "_avito_profile-tab_summary_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.profile_tab.summary.e f3275a;

        public d(@k com.avito.android.profile_tab.summary.e eVar) {
            this.f3275a = eVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f3275a, ((d) obj).f3275a);
        }

        public final int hashCode() {
            return this.f3275a.hashCode();
        }

        @k
        public final String toString() {
            return "Params(params=" + this.f3275a + ')';
        }
    }
}
