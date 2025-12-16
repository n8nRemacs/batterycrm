package Dw;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: DealRoomDevelopmentState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LDw/e;", "", "a", "b", "LDw/e$a;", "LDw/e$b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface e {

    /* compiled from: DealRoomDevelopmentState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDw/e$a;", "LDw/e;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f3552a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f3553b;

        public a(@k ArrayList arrayList, boolean z12) {
            this.f3552a = arrayList;
            this.f3553b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f3552a.equals(aVar.f3552a) && this.f3553b == aVar.f3553b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f3553b) + (this.f3552a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Loaded(items=");
            sb2.append(this.f3552a);
            sb2.append(", showFixationButton=");
            return r.x(sb2, this.f3553b, ')');
        }
    }

    /* compiled from: DealRoomDevelopmentState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDw/e$b;", "LDw/e;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f3554a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1178734267;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }
}
