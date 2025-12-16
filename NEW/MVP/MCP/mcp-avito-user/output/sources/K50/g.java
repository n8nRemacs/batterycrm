package K50;

import androidx.appcompat.app.r;
import com.avito.android.passport.network.model.BusinessVrfDuplication;
import com.avito.android.passport.network.model.MergeAccountsProfile;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MergeAccountsProfilesListResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LK50/g;", "", "a", "b", "LK50/g$a;", "LK50/g$b;", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface g {

    /* compiled from: MergeAccountsProfilesListResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LK50/g$a;", "LK50/g;", "<init>", "()V", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements g {
    }

    /* compiled from: MergeAccountsProfilesListResult.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LK50/g$b;", "LK50/g;", "", "Lcom/avito/android/passport/network/model/MergeAccountsProfile;", "profiles", "", "visibleProfilesCount", "profilesToConvert", "Lcom/avito/android/passport/network/model/BusinessVrfDuplication;", "businessVrfDuplication", "<init>", "(Ljava/util/List;ILjava/util/List;Lcom/avito/android/passport/network/model/BusinessVrfDuplication;)V", "Ljava/util/List;", "b", "()Ljava/util/List;", "I", "d", "()I", "c", "Lcom/avito/android/passport/network/model/BusinessVrfDuplication;", "a", "()Lcom/avito/android/passport/network/model/BusinessVrfDuplication;", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements g {

        @com.google.gson.annotations.c("businessVrfDuplication")
        @Y61.l
        private final BusinessVrfDuplication businessVrfDuplication;

        @com.google.gson.annotations.c("profiles")
        @Y61.k
        private final List<MergeAccountsProfile> profiles;

        @com.google.gson.annotations.c("profilesToConvert")
        @Y61.l
        private final List<MergeAccountsProfile> profilesToConvert;

        @com.google.gson.annotations.c("visibleProfilesCount")
        private final int visibleProfilesCount;

        public b(@Y61.k List<MergeAccountsProfile> list, int i12, @Y61.l List<MergeAccountsProfile> list2, @Y61.l BusinessVrfDuplication businessVrfDuplication) {
            this.profiles = list;
            this.visibleProfilesCount = i12;
            this.profilesToConvert = list2;
            this.businessVrfDuplication = businessVrfDuplication;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final BusinessVrfDuplication getBusinessVrfDuplication() {
            return this.businessVrfDuplication;
        }

        @Y61.k
        public final List<MergeAccountsProfile> b() {
            return this.profiles;
        }

        @Y61.l
        public final List<MergeAccountsProfile> c() {
            return this.profilesToConvert;
        }

        /* renamed from: d, reason: from getter */
        public final int getVisibleProfilesCount() {
            return this.visibleProfilesCount;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.profiles, bVar.profiles) && this.visibleProfilesCount == bVar.visibleProfilesCount && L.f(this.profilesToConvert, bVar.profilesToConvert) && L.f(this.businessVrfDuplication, bVar.businessVrfDuplication);
        }

        public final int hashCode() {
            int iE2 = r.e(this.visibleProfilesCount, this.profiles.hashCode() * 31, 31);
            List<MergeAccountsProfile> list = this.profilesToConvert;
            int iHashCode = (iE2 + (list == null ? 0 : list.hashCode())) * 31;
            BusinessVrfDuplication businessVrfDuplication = this.businessVrfDuplication;
            return iHashCode + (businessVrfDuplication != null ? businessVrfDuplication.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "Ok(profiles=" + this.profiles + ", visibleProfilesCount=" + this.visibleProfilesCount + ", profilesToConvert=" + this.profilesToConvert + ", businessVrfDuplication=" + this.businessVrfDuplication + ')';
        }
    }
}
