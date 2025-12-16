package zw;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.model.ReturnToWorkArguments;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DealCabinetOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lzw/c;", "", "a", "b", "c", "d", "e", "Lzw/c$a;", "Lzw/c$b;", "Lzw/c$c;", "Lzw/c$d;", "Lzw/c$e;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface c {

    /* compiled from: DealCabinetOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzw/c$a;", "Lzw/c;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f444374a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -67952869;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: DealCabinetOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzw/c$b;", "Lzw/c;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f444375a;

        public b(@k DeepLink deepLink) {
            this.f444375a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f444375a, ((b) obj).f444375a);
        }

        public final int hashCode() {
            return this.f444375a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f444375a, ')');
        }
    }

    /* compiled from: DealCabinetOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzw/c$c;", "Lzw/c;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zw.c$c, reason: collision with other inner class name */
    public static final /* data */ class C12981c implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<com.avito.android.developments_agency_search.adapter.checkable_item.a> f444376a;

        public C12981c(@k List<com.avito.android.developments_agency_search.adapter.checkable_item.a> list) {
            this.f444376a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12981c) && L.f(this.f444376a, ((C12981c) obj).f444376a);
        }

        public final int hashCode() {
            return this.f444376a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("ShowClientsFilterSelectorScreen(options="), this.f444376a, ')');
        }
    }

    /* compiled from: DealCabinetOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzw/c$d;", "Lzw/c;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<com.avito.android.developments_agency_search.adapter.checkable_item.a> f444377a;

        public d(@k List<com.avito.android.developments_agency_search.adapter.checkable_item.a> list) {
            this.f444377a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f444377a, ((d) obj).f444377a);
        }

        public final int hashCode() {
            return this.f444377a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("ShowMortgageFilterSelectorScreen(options="), this.f444377a, ')');
        }
    }

    /* compiled from: DealCabinetOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzw/c$e;", "Lzw/c;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ReturnToWorkArguments f444378a;

        public e(@k ReturnToWorkArguments returnToWorkArguments) {
            this.f444378a = returnToWorkArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f444378a, ((e) obj).f444378a);
        }

        public final int hashCode() {
            return this.f444378a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowReturnToWorkDialog(arguments=" + this.f444378a + ')';
        }
    }
}
