package fo;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: CategoryWithParamsOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lfo/b;", "", "a", "Lfo/b$a;", "_avito_category-with-params_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fo.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC40454b {

    /* compiled from: CategoryWithParamsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfo/b$a;", "Lfo/b;", "_avito_category-with-params_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fo.b$a */
    public static final /* data */ class a implements InterfaceC40454b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f396078a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f396079b;

        public a(@k ArrayList arrayList, boolean z12) {
            this.f396078a = arrayList;
            this.f396079b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f396078a.equals(aVar.f396078a) && this.f396079b == aVar.f396079b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f396079b) + (this.f396078a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FinishScreenWithResult(ids=");
            sb2.append(this.f396078a);
            sb2.append(", applyFilter=");
            return r.x(sb2, this.f396079b, ')');
        }
    }
}
