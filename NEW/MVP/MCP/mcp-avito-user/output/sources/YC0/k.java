package yc0;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSettingsAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\t\u0004\u0005\u0006\u0007\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lyc0/k;", "", "a", "b", "Lyc0/g;", "Lcom/avito/android/profile_settings_extended/mvi/entity/CommonValueBottomMenuAction;", "Lyc0/i;", "Lyc0/j;", "Lyc0/k$a;", "Lyc0/k$b;", "Lyc0/A;", "Lyc0/B;", "Lyc0/D;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface k {

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/k$a;", "Lyc0/k;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f443261a;

        public a(@Y61.k DeepLink deepLink) {
            this.f443261a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f443261a, ((a) obj).f443261a);
        }

        public final int hashCode() {
            return this.f443261a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DeeplinkAction(deepLink="), this.f443261a, ')');
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/k$b;", "Lyc0/k;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements k {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f443262a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f443263b;

        public b(boolean z12, @Y61.l String str) {
            this.f443262a = z12;
            this.f443263b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f443262a == bVar.f443262a && L.f(this.f443263b, bVar.f443263b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f443262a) * 31;
            String str = this.f443263b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LoadData(isRefreshing=");
            sb2.append(this.f443262a);
            sb2.append(", message=");
            return C22026a.c(sb2, this.f443263b, ')');
        }

        public /* synthetic */ b(boolean z12, String str, int i12, C42822w c42822w) {
            this(z12, (i12 & 2) != 0 ? null : str);
        }
    }
}
