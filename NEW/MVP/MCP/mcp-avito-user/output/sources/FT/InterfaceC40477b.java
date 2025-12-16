package ft;

import Y61.k;
import Y61.l;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: FiltersEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lft/b;", "", "a", "Lft/b$a;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ft.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC40477b {

    /* compiled from: FiltersEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lft/b$a;", "Lft/b;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ft.b$a */
    public static final /* data */ class a implements InterfaceC40477b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f396178a;

        public a(@k ArrayList arrayList) {
            this.f396178a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f396178a.equals(((a) obj).f396178a);
        }

        public final int hashCode() {
            return this.f396178a.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("FinishFlow(filters="), this.f396178a, ')');
        }
    }
}
