package Gv;

import Fv.C13838a;
import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryLocationSuggestOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LGv/b;", "", "a", "LGv/b$a;", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Gv.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC13921b {

    /* compiled from: DeliveryLocationSuggestOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGv/b$a;", "LGv/b;", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gv.b$a */
    public static final /* data */ class a implements InterfaceC13921b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final C13838a f6772a;

        public a(@k C13838a c13838a) {
            this.f6772a = c13838a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f6772a, ((a) obj).f6772a);
        }

        public final int hashCode() {
            return this.f6772a.hashCode();
        }

        @k
        public final String toString() {
            return "SuggestSelected(selectedSuggest=" + this.f6772a + ')';
        }
    }
}
