package com.vk.id;

import K51.d;
import X41.j;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.H0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.vk.id.common.InternalVKIDApi;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AccessToken.kt */
@d
@H0
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001BE\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b$\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/vk/id/AccessToken;", "Landroid/os/Parcelable;", "", "token", "idToken", "", "userID", "expireTime", "Lcom/vk/id/VKIDUser;", "userData", "", "scopes", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJLcom/vk/id/VKIDUser;Ljava/util/Set;)V", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "dest", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "getIdToken", "J", "getUserID", "()J", "getExpireTime", "Lcom/vk/id/VKIDUser;", "getUserData", "()Lcom/vk/id/VKIDUser;", "Ljava/util/Set;", "getScopes", "()Ljava/util/Set;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AccessToken implements Parcelable {

    @k
    public static final Parcelable.Creator<AccessToken> CREATOR = new Creator();
    private final long expireTime;

    @l
    private final String idToken;

    @l
    private final Set<String> scopes;

    @k
    private final String token;

    @k
    private final VKIDUser userData;
    private final long userID;

    /* compiled from: AccessToken.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AccessToken> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccessToken createFromParcel(Parcel parcel) {
            LinkedHashSet linkedHashSet;
            String string = parcel.readString();
            String string2 = parcel.readString();
            long j12 = parcel.readLong();
            long j13 = parcel.readLong();
            VKIDUser vKIDUserCreateFromParcel = VKIDUser.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashSet = null;
            } else {
                int i12 = parcel.readInt();
                linkedHashSet = new LinkedHashSet(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    linkedHashSet.add(parcel.readString());
                }
            }
            return new AccessToken(string, string2, j12, j13, vKIDUserCreateFromParcel, linkedHashSet);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccessToken[] newArray(int i12) {
            return new AccessToken[i12];
        }
    }

    @j
    @InternalVKIDApi
    public AccessToken(@k String str, @l String str2, long j12, long j13, @k VKIDUser vKIDUser, @l Set<String> set) {
        this.token = str;
        this.idToken = str2;
        this.userID = j12;
        this.expireTime = j13;
        this.userData = vKIDUser;
        this.scopes = set;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!AccessToken.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) other;
        return L.f(this.token, accessToken.token) && this.userID == accessToken.userID && this.expireTime == accessToken.expireTime && L.f(this.userData, accessToken.userData);
    }

    public final long getExpireTime() {
        return this.expireTime;
    }

    @l
    public final String getIdToken() {
        return this.idToken;
    }

    @l
    public final Set<String> getScopes() {
        return this.scopes;
    }

    @k
    public final String getToken() {
        return this.token;
    }

    @k
    public final VKIDUser getUserData() {
        return this.userData;
    }

    public final long getUserID() {
        return this.userID;
    }

    public int hashCode() {
        return this.userData.hashCode() + r.g(r.g(this.token.hashCode() * 31, 31, this.userID), 31, this.expireTime);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel dest, int flags) {
        dest.writeString(this.token);
        dest.writeString(this.idToken);
        dest.writeLong(this.userID);
        dest.writeLong(this.expireTime);
        this.userData.writeToParcel(dest, flags);
        Set<String> set = this.scopes;
        if (set == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(set.size());
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            dest.writeString(it.next());
        }
    }

    public /* synthetic */ AccessToken(String str, String str2, long j12, long j13, VKIDUser vKIDUser, Set set, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, j12, j13, vKIDUser, set);
    }
}
