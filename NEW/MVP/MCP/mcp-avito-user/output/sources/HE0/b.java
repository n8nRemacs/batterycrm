package HE0;

import Y61.k;
import Y61.l;
import com.avito.android.travel_file_download_deeplink.FileDownloadResult;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FileDownloadOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LHE0/b;", "", "a", "LHE0/b$a;", "_avito_travel-file-download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface b {

    /* compiled from: FileDownloadOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHE0/b$a;", "LHE0/b;", "_avito_travel-file-download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final FileDownloadResult f7017a;

        public a(@k FileDownloadResult fileDownloadResult) {
            this.f7017a = fileDownloadResult;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f7017a, ((a) obj).f7017a);
        }

        public final int hashCode() {
            return this.f7017a.hashCode();
        }

        @k
        public final String toString() {
            return "CloseWithResult(result=" + this.f7017a + ')';
        }
    }
}
