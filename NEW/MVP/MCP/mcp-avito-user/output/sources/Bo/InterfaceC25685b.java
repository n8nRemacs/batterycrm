package bo;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TreeOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lbo/b;", "", "a", "Lbo/b$a;", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bo.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC25685b {

    /* compiled from: TreeOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbo/b$a;", "Lbo/b;", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bo.b$a */
    public static final /* data */ class a implements InterfaceC25685b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f57444a;

        public a(@k ApiError apiError) {
            this.f57444a = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f57444a, ((a) obj).f57444a);
        }

        public final int hashCode() {
            return this.f57444a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("Error(apiError="), this.f57444a, ')');
        }
    }
}
