package l6;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OwnershipDiscrepancyOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Ll6/b;", "", "a", "Ll6/b$a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface b {

    /* compiled from: OwnershipDiscrepancyOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ll6/b$a;", "Ll6/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Uri f413525a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AutotekaTeaserResult f413526b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f413527c;

        public a(@l Uri uri, @l AutotekaTeaserResult autotekaTeaserResult, @l String str) {
            this.f413525a = uri;
            this.f413526b = autotekaTeaserResult;
            this.f413527c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f413525a, aVar.f413525a) && L.f(this.f413526b, aVar.f413526b) && L.f(this.f413527c, aVar.f413527c);
        }

        public final int hashCode() {
            Uri uri = this.f413525a;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            AutotekaTeaserResult autotekaTeaserResult = this.f413526b;
            int iHashCode2 = (iHashCode + (autotekaTeaserResult == null ? 0 : autotekaTeaserResult.hashCode())) * 31;
            String str = this.f413527c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FollowLinkAndClose(url=");
            sb2.append(this.f413525a);
            sb2.append(", teaserAutoteka=");
            sb2.append(this.f413526b);
            sb2.append(", searchContext=");
            return C22026a.c(sb2, this.f413527c, ')');
        }
    }
}
