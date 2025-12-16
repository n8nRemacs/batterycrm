package Rs;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.crm_candidates.features.full_filters.entity.FilterItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FiltersEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LRs/b;", "", "a", "b", "LRs/b$a;", "LRs/b$b;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Rs.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC15077b {

    /* compiled from: FiltersEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRs/b$a;", "LRs/b;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rs.b$a */
    public static final /* data */ class a implements InterfaceC15077b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f14707a;

        public a(@k ArrayList arrayList) {
            this.f14707a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f14707a.equals(((a) obj).f14707a);
        }

        public final int hashCode() {
            return this.f14707a.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("FinishFlow(filters="), this.f14707a, ')');
        }
    }

    /* compiled from: FiltersEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRs/b$b;", "LRs/b;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rs.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0988b implements InterfaceC15077b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<FilterItem> f14708a;

        public C0988b(@k List<FilterItem> list) {
            this.f14708a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0988b) && L.f(this.f14708a, ((C0988b) obj).f14708a);
        }

        public final int hashCode() {
            return this.f14708a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("Update(filters="), this.f14708a, ')');
        }
    }
}
