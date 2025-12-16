package yc0;

import androidx.compose.runtime.internal.P;
import com.avito.android.edit_address.entity.ExtendedProfilesSettingsAddress;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSettingsAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lyc0/q;", "Lyc0/D;", "a", "b", "Lyc0/q$a;", "Lyc0/q$b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface q extends D {

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/q$a;", "Lyc0/q;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ExtendedProfilesSettingsAddress f443327a;

        public a(@Y61.k ExtendedProfilesSettingsAddress extendedProfilesSettingsAddress) {
            this.f443327a = extendedProfilesSettingsAddress;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f443327a, ((a) obj).f443327a);
        }

        public final int hashCode() {
            return this.f443327a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "GeoAddressMoreButton(address=" + this.f443327a + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/q$b;", "Lyc0/q;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f443328a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final ExtendedProfilesSettingsAddress f443329b;

        public b(@Y61.k String str, @Y61.l ExtendedProfilesSettingsAddress extendedProfilesSettingsAddress) {
            this.f443328a = str;
            this.f443329b = extendedProfilesSettingsAddress;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f443328a, bVar.f443328a) && L.f(this.f443329b, bVar.f443329b);
        }

        public final int hashCode() {
            int iHashCode = this.f443328a.hashCode() * 31;
            ExtendedProfilesSettingsAddress extendedProfilesSettingsAddress = this.f443329b;
            return iHashCode + (extendedProfilesSettingsAddress == null ? 0 : extendedProfilesSettingsAddress.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "GeoEditAddress(fieldName=" + this.f443328a + ", address=" + this.f443329b + ')';
        }
    }
}
