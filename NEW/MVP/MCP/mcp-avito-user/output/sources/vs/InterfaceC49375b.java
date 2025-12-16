package vs;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RegionSheetOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lvs/b;", "", "a", "b", "Lvs/b$a;", "Lvs/b$b;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vs.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC49375b {

    /* compiled from: RegionSheetOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvs/b$a;", "Lvs/b;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vs.b$a */
    public static final /* data */ class a implements InterfaceC49375b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<Long> f441016a;

        public a(@k List<Long> list) {
            this.f441016a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f441016a, ((a) obj).f441016a);
        }

        public final int hashCode() {
            return this.f441016a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("SaveSelection(selectedIds="), this.f441016a, ')');
        }
    }

    /* compiled from: RegionSheetOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvs/b$b;", "Lvs/b;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vs.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12795b implements InterfaceC49375b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f441017a;

        public C12795b(@k String str) {
            this.f441017a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12795b) && L.f(this.f441017a, ((C12795b) obj).f441017a);
        }

        public final int hashCode() {
            return this.f441017a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowErrorToast(title="), this.f441017a, ')');
        }
    }
}
