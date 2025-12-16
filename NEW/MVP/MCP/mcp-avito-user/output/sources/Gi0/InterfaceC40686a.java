package gi0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeveloperSuggestFilterAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lgi0/a;", "", "a", "b", "Lgi0/a$a;", "Lgi0/a$b;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gi0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC40686a {

    /* compiled from: DeveloperSuggestFilterAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgi0/a$a;", "Lgi0/a;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gi0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11224a implements InterfaceC40686a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f396736a;

        public C11224a(@k String str) {
            this.f396736a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11224a) && L.f(this.f396736a, ((C11224a) obj).f396736a);
        }

        public final int hashCode() {
            return this.f396736a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("QueryStringUpdated(query="), this.f396736a, ')');
        }
    }

    /* compiled from: DeveloperSuggestFilterAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgi0/a$b;", "Lgi0/a;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gi0.a$b */
    public static final /* data */ class b implements InterfaceC40686a {

        /* renamed from: a, reason: collision with root package name */
        public final int f396737a;

        public b(int i12) {
            this.f396737a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f396737a == ((b) obj).f396737a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f396737a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("SuggestItemSelected(position="), this.f396737a, ')');
        }
    }
}
