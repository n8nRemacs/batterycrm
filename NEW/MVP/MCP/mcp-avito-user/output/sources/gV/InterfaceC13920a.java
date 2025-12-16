package Gv;

import Fv.C13838a;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryLocationSuggestAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LGv/a;", "", "a", "b", "LGv/a$a;", "LGv/a$b;", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Gv.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC13920a {

    /* compiled from: DeliveryLocationSuggestAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGv/a$a;", "LGv/a;", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gv.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0379a implements InterfaceC13920a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f6770a;

        public C0379a(@k String str) {
            this.f6770a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0379a) && L.f(this.f6770a, ((C0379a) obj).f6770a);
        }

        public final int hashCode() {
            return this.f6770a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SearchSuggestions(query="), this.f6770a, ')');
        }
    }

    /* compiled from: DeliveryLocationSuggestAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGv/a$b;", "LGv/a;", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gv.a$b */
    public static final /* data */ class b implements InterfaceC13920a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final C13838a f6771a;

        public b(@k C13838a c13838a) {
            this.f6771a = c13838a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f6771a, ((b) obj).f6771a);
        }

        public final int hashCode() {
            return this.f6771a.hashCode();
        }

        @k
        public final String toString() {
            return "SelectSuggest(selectedSuggest=" + this.f6771a + ')';
        }
    }
}
