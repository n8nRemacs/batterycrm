package Yn;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CategoryItemsOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LYn/b;", "", "a", "LYn/b$a;", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Yn.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC18302b {

    /* compiled from: CategoryItemsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYn/b$a;", "LYn/b;", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Yn.b$a */
    public static final /* data */ class a implements InterfaceC18302b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f19652a;

        public a(@k ApiError apiError) {
            this.f19652a = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f19652a, ((a) obj).f19652a);
        }

        public final int hashCode() {
            return this.f19652a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("Error(apiError="), this.f19652a, ')');
        }
    }
}
