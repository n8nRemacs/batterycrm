package J70;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhotoDownloadInternalAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LJ70/b;", "", "a", "b", "LJ70/b$a;", "LJ70/b$b;", "_avito_photo-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface b {

    /* compiled from: PhotoDownloadInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJ70/b$a;", "LJ70/b;", "_avito_photo-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f8788a;

        public a(@k String str) {
            this.f8788a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f8788a, ((a) obj).f8788a);
        }

        public final int hashCode() {
            return this.f8788a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowGalleryPermissionDialog(url="), this.f8788a, ')');
        }
    }

    /* compiled from: PhotoDownloadInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJ70/b$b;", "LJ70/b;", "_avito_photo-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: J70.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0507b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f8789a;

        public C0507b(@k PrintableText printableText) {
            this.f8789a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0507b) && L.f(this.f8789a, ((C0507b) obj).f8789a);
        }

        public final int hashCode() {
            return this.f8789a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowToast(text="), this.f8789a, ')');
        }
    }
}
