package J70;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhotoDownloadAction.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LJ70/a;", "", "a", "LJ70/a$a;", "_avito_photo-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a {

    /* compiled from: PhotoDownloadAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJ70/a$a;", "LJ70/a;", "_avito_photo-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: J70.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0506a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f8787a;

        public C0506a(@k String str) {
            this.f8787a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0506a) && L.f(this.f8787a, ((C0506a) obj).f8787a);
        }

        public final int hashCode() {
            return this.f8787a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("PhotoDownloadToGallery(url="), this.f8787a, ')');
        }
    }
}
