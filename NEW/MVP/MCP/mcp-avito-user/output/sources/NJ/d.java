package Nj;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.BodyCondition;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BodyConditionSheetState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LNj/d;", "", "a", "b", "LNj/d$a;", "LNj/d$b;", "_avito_body-condition-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface d {

    /* compiled from: BodyConditionSheetState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNj/d$a;", "LNj/d;", "<init>", "()V", "_avito_body-condition-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f11730a = new a();
    }

    /* compiled from: BodyConditionSheetState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNj/d$b;", "LNj/d;", "_avito_body-condition-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BodyCondition f11731a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f11732b;

        public b(@k BodyCondition bodyCondition, @l String str) {
            this.f11731a = bodyCondition;
            this.f11732b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f11731a, bVar.f11731a) && L.f(this.f11732b, bVar.f11732b);
        }

        public final int hashCode() {
            int iHashCode = this.f11731a.hashCode() * 31;
            String str = this.f11732b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Success(bodyCondition=");
            sb2.append(this.f11731a);
            sb2.append(", fromPage=");
            return C22026a.c(sb2, this.f11732b, ')');
        }
    }
}
