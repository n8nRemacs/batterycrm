package ii0;

import Y61.k;
import Y61.l;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: DistrictOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lii0/c;", "", "a", "Lii0/c$a;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ii0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC41412c {

    /* compiled from: DistrictOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lii0/c$a;", "Lii0/c;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ii0.c$a */
    public static final /* data */ class a implements InterfaceC41412c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f398697a;

        public a(@k ArrayList arrayList) {
            this.f398697a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f398697a.equals(((a) obj).f398697a);
        }

        public final int hashCode() {
            return this.f398697a.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("CloseScreenWithSelectedDistricts(districtIds="), this.f398697a, ')');
        }
    }
}
