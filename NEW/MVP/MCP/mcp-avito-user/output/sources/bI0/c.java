package BI0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SearchOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LBI0/c;", "", "a", "LBI0/c$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface c {

    /* compiled from: SearchOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBI0/c$a;", "LBI0/c;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Map<String, Object> f1316a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f1317b;

        public a(@k Map<String, ? extends Object> map, @k String str) {
            this.f1316a = map;
            this.f1317b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f1316a, aVar.f1316a) && L.f(this.f1317b, aVar.f1317b);
        }

        public final int hashCode() {
            return this.f1317b.hashCode() + (this.f1316a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FiltersClicked(filtersParams=");
            sb2.append(this.f1316a);
            sb2.append(", profileTab=");
            return C22026a.c(sb2, this.f1317b, ')');
        }
    }
}
