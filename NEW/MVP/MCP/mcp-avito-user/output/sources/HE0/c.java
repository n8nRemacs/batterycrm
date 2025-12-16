package HE0;

import Y61.k;
import Y61.l;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.analytics.screens.mvi.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FileDownloadState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LHE0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_travel-file-download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c extends q {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f7018c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final c f7019d = new c(null);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Long f7020b;

    /* compiled from: FileDownloadState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHE0/c$a;", "", "<init>", "()V", "_avito_travel-file-download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@l Long l12) {
        this.f7020b = l12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && L.f(this.f7020b, ((c) obj).f7020b);
    }

    public final int hashCode() {
        Long l12 = this.f7020b;
        if (l12 == null) {
            return 0;
        }
        return l12.hashCode();
    }

    @k
    public final String toString() {
        return m.m(new StringBuilder("FileDownloadState(downloadId="), this.f7020b, ')');
    }
}
