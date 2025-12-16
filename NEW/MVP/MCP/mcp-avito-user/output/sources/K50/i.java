package K50;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.passport.network.model.PassportListAvatar;
import com.avito.android.passport.network.model.ProfileStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfilesListResponse.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u001c\u0010\u0011¨\u0006\u001d"}, d2 = {"LK50/i;", "", "", "profileId", "", "isCurrent", "profileName", "profileTitle", "Lcom/avito/android/passport/network/model/PassportListAvatar;", "avatar", "Lcom/avito/android/passport/network/model/ProfileStatus;", "profileStatus", "description", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/avito/android/passport/network/model/PassportListAvatar;Lcom/avito/android/passport/network/model/ProfileStatus;Ljava/lang/String;)V", "Ljava/lang/String;", "getProfileId", "()Ljava/lang/String;", "Z", "()Z", "getProfileName", "getProfileTitle", "Lcom/avito/android/passport/network/model/PassportListAvatar;", "getAvatar", "()Lcom/avito/android/passport/network/model/PassportListAvatar;", "Lcom/avito/android/passport/network/model/ProfileStatus;", "getProfileStatus", "()Lcom/avito/android/passport/network/model/ProfileStatus;", "getDescription", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class i {

    @com.google.gson.annotations.c("avatar")
    @Y61.l
    private final PassportListAvatar avatar;

    @com.google.gson.annotations.c("description")
    @Y61.l
    private final String description;

    @com.google.gson.annotations.c("isCurrent")
    private final boolean isCurrent;

    @com.google.gson.annotations.c("profileId")
    @Y61.k
    private final String profileId;

    @com.google.gson.annotations.c("name")
    @Y61.k
    private final String profileName;

    @com.google.gson.annotations.c("status")
    @Y61.l
    private final ProfileStatus profileStatus;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String profileTitle;

    public i(@Y61.k String str, boolean z12, @Y61.k String str2, @Y61.k String str3, @Y61.l PassportListAvatar passportListAvatar, @Y61.l ProfileStatus profileStatus, @Y61.l String str4) {
        this.profileId = str;
        this.isCurrent = z12;
        this.profileName = str2;
        this.profileTitle = str3;
        this.avatar = passportListAvatar;
        this.profileStatus = profileStatus;
        this.description = str4;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.profileId, iVar.profileId) && this.isCurrent == iVar.isCurrent && L.f(this.profileName, iVar.profileName) && L.f(this.profileTitle, iVar.profileTitle) && L.f(this.avatar, iVar.avatar) && this.profileStatus == iVar.profileStatus && L.f(this.description, iVar.description);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(r.i(this.profileId.hashCode() * 31, 31, this.isCurrent), 31, this.profileName), 31, this.profileTitle);
        PassportListAvatar passportListAvatar = this.avatar;
        int iHashCode = (iD2 + (passportListAvatar == null ? 0 : passportListAvatar.hashCode())) * 31;
        ProfileStatus profileStatus = this.profileStatus;
        int iHashCode2 = (iHashCode + (profileStatus == null ? 0 : profileStatus.hashCode())) * 31;
        String str = this.description;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PassportProfile(profileId=");
        sb2.append(this.profileId);
        sb2.append(", isCurrent=");
        sb2.append(this.isCurrent);
        sb2.append(", profileName=");
        sb2.append(this.profileName);
        sb2.append(", profileTitle=");
        sb2.append(this.profileTitle);
        sb2.append(", avatar=");
        sb2.append(this.avatar);
        sb2.append(", profileStatus=");
        sb2.append(this.profileStatus);
        sb2.append(", description=");
        return C22026a.c(sb2, this.description, ')');
    }
}
