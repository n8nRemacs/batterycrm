package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Settings;

/* compiled from: Profile.kt */
@d
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b4\b\u0007\u0018\u00002\u00020\u0001:\u0001\\B½\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001cJ\u001a\u0010 \u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b%\u0010$J \u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b*\u0010+R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010,\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010,\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010,\u001a\u0004\b?\u0010.\"\u0004\b@\u00100R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\bA\u0010.R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010G\u001a\u0004\b\u000f\u0010\u001c\"\u0004\bH\u0010IR\u001a\u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010G\u001a\u0004\b\u0010\u0010\u001cR$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010,\u001a\u0004\bJ\u0010.\"\u0004\bK\u00100R$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010,\u001a\u0004\bL\u0010.\"\u0004\bM\u00100R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010\u0015\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010N\u001a\u0004\bS\u0010P\"\u0004\bT\u0010RR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010,\u001a\u0004\bU\u0010.R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0011\u0010[\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b[\u0010\u001c¨\u0006]"}, d2 = {"Lcom/avito/android/remote/model/Profile;", "Landroid/os/Parcelable;", "", ChannelContext.Item.USER_ID, "email", "name", "Lcom/avito/android/remote/model/Image;", "avatar", "Lcom/avito/android/remote/model/Social;", "social", "socialId", "phone", "Lcom/avito/android/remote/model/UserType;", "type", "", "isPro", "isLegalPerson", "manager", SearchParamsConverterKt.LOCATION_ID, "", SearchParamsConverterKt.METRO_ID, SearchParamsConverterKt.DISTRICT_ID, "userHashId", "Lcom/avito/android/remote/model/Profile$Shop;", "shop", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Social;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UserType;ZZLjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Lcom/avito/android/remote/model/Profile$Shop;)V", "hasMetro", "()Z", "isIncomplete", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "getEmail", "setEmail", "getName", "setName", "Lcom/avito/android/remote/model/Image;", "getAvatar", "()Lcom/avito/android/remote/model/Image;", "setAvatar", "(Lcom/avito/android/remote/model/Image;)V", "Lcom/avito/android/remote/model/Social;", "getSocial", "()Lcom/avito/android/remote/model/Social;", "setSocial", "(Lcom/avito/android/remote/model/Social;)V", "getSocialId", "setSocialId", "getPhone", "Lcom/avito/android/remote/model/UserType;", "getType", "()Lcom/avito/android/remote/model/UserType;", "setType", "(Lcom/avito/android/remote/model/UserType;)V", "Z", "setPro", "(Z)V", "getManager", "setManager", "getLocationId", "setLocationId", "J", "getMetroId", "()J", "setMetroId", "(J)V", "getDistrictId", "setDistrictId", "getUserHashId", "Lcom/avito/android/remote/model/Profile$Shop;", "getShop", "()Lcom/avito/android/remote/model/Profile$Shop;", "setShop", "(Lcom/avito/android/remote/model/Profile$Shop;)V", "isShop", "Shop", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Profile implements Parcelable {

    @k
    public static final Parcelable.Creator<Profile> CREATOR = new Creator();

    @c("avatar")
    @l
    private Image avatar;

    @c(SearchParamsConverterKt.DISTRICT_ID)
    private long districtId;

    @c("email")
    @l
    private String email;

    @c("isLegalPerson")
    private final boolean isLegalPerson;

    @c("isPro")
    private boolean isPro;

    @c(SearchParamsConverterKt.LOCATION_ID)
    @l
    private String locationId;

    @c("manager")
    @l
    private String manager;

    @c(SearchParamsConverterKt.METRO_ID)
    private long metroId;

    @c("name")
    @l
    private String name;

    @c("phone")
    @l
    private final String phone;

    @c("shop")
    @l
    private Shop shop;

    @c("social")
    @l
    private Social social;

    @c("socialUserId")
    @l
    private String socialId;

    @c("type")
    @k
    private UserType type;

    @c("userHashId")
    @l
    private final String userHashId;

    @c("id")
    @l
    private String userId;

    /* compiled from: Profile.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Profile> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Profile createFromParcel(@k Parcel parcel) {
            return new Profile(parcel.readString(), parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(Profile.class.getClassLoader()), (Social) parcel.readParcelable(Profile.class.getClassLoader()), parcel.readString(), parcel.readString(), (UserType) parcel.readParcelable(Profile.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : Shop.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Profile[] newArray(int i12) {
            return new Profile[i12];
        }
    }

    /* compiled from: Profile.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J2\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\u0014¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/Profile$Shop;", "Landroid/os/Parcelable;", "", "id", "", "name", "site", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "copy", "(JLjava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/Profile$Shop;", "toString", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getId", "Ljava/lang/String;", "getName", "getSite", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Shop implements Parcelable {

        @k
        public static final Parcelable.Creator<Shop> CREATOR = new Creator();

        @c(SearchParamsConverterKt.SHOP_ID)
        private final long id;

        @c("name")
        @l
        private final String name;

        @c(ContextActionHandler.Link.URL)
        @l
        private final String site;

        /* compiled from: Profile.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Shop> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Shop createFromParcel(@k Parcel parcel) {
                return new Shop(parcel.readLong(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Shop[] newArray(int i12) {
                return new Shop[i12];
            }
        }

        public Shop() {
            this(0L, null, null, 7, null);
        }

        public static /* synthetic */ Shop copy$default(Shop shop, long j12, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                j12 = shop.id;
            }
            if ((i12 & 2) != 0) {
                str = shop.name;
            }
            if ((i12 & 4) != 0) {
                str2 = shop.site;
            }
            return shop.copy(j12, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final long getId() {
            return this.id;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getSite() {
            return this.site;
        }

        @k
        public final Shop copy(long id2, @l String name, @l String site) {
            return new Shop(id2, name, site);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return other != null && (other instanceof Shop) && this.id == ((Shop) other).id;
        }

        public final long getId() {
            return this.id;
        }

        @l
        public final String getName() {
            return this.name;
        }

        @l
        public final String getSite() {
            return this.site;
        }

        public int hashCode() {
            long j12 = this.id;
            return (int) (j12 ^ (j12 >>> 32));
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Shop(id=");
            sb2.append(this.id);
            sb2.append(", name=");
            sb2.append(this.name);
            sb2.append(", site=");
            return C22026a.c(sb2, this.site, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeLong(this.id);
            parcel.writeString(this.name);
            parcel.writeString(this.site);
        }

        public Shop(long j12, @l String str, @l String str2) {
            this.id = j12;
            this.name = str;
            this.site = str2;
        }

        public /* synthetic */ Shop(long j12, String str, String str2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? -1L : j12, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2);
        }
    }

    public Profile() {
        this(null, null, null, null, null, null, null, null, false, false, null, null, 0L, 0L, null, null, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Profile) && L.f(this.userId, ((Profile) other).userId);
    }

    @l
    public final Image getAvatar() {
        return this.avatar;
    }

    public final long getDistrictId() {
        return this.districtId;
    }

    @l
    public final String getEmail() {
        return this.email;
    }

    @l
    public final String getLocationId() {
        return this.locationId;
    }

    @l
    public final String getManager() {
        return this.manager;
    }

    public final long getMetroId() {
        return this.metroId;
    }

    @l
    public final String getName() {
        return this.name;
    }

    @l
    public final String getPhone() {
        return this.phone;
    }

    @l
    public final Shop getShop() {
        return this.shop;
    }

    @l
    public final Social getSocial() {
        return this.social;
    }

    @l
    public final String getSocialId() {
        return this.socialId;
    }

    @k
    public final UserType getType() {
        return this.type;
    }

    @l
    public final String getUserHashId() {
        return this.userHashId;
    }

    @l
    public final String getUserId() {
        return this.userId;
    }

    public final boolean hasMetro() {
        return this.metroId != -1;
    }

    public int hashCode() {
        String str = this.userId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final boolean isIncomplete() {
        Social social = this.social;
        return social != null && social.getIsIncomplete();
    }

    /* renamed from: isLegalPerson, reason: from getter */
    public final boolean getIsLegalPerson() {
        return this.isLegalPerson;
    }

    /* renamed from: isPro, reason: from getter */
    public final boolean getIsPro() {
        return this.isPro;
    }

    public final boolean isShop() {
        return this.shop != null;
    }

    public final void setAvatar(@l Image image) {
        this.avatar = image;
    }

    public final void setDistrictId(long j12) {
        this.districtId = j12;
    }

    public final void setEmail(@l String str) {
        this.email = str;
    }

    public final void setLocationId(@l String str) {
        this.locationId = str;
    }

    public final void setManager(@l String str) {
        this.manager = str;
    }

    public final void setMetroId(long j12) {
        this.metroId = j12;
    }

    public final void setName(@l String str) {
        this.name = str;
    }

    public final void setPro(boolean z12) {
        this.isPro = z12;
    }

    public final void setShop(@l Shop shop) {
        this.shop = shop;
    }

    public final void setSocial(@l Social social) {
        this.social = social;
    }

    public final void setSocialId(@l String str) {
        this.socialId = str;
    }

    public final void setType(@k UserType userType) {
        this.type = userType;
    }

    public final void setUserId(@l String str) {
        this.userId = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.userId);
        parcel.writeString(this.email);
        parcel.writeString(this.name);
        parcel.writeParcelable(this.avatar, flags);
        parcel.writeParcelable(this.social, flags);
        parcel.writeString(this.socialId);
        parcel.writeString(this.phone);
        parcel.writeParcelable(this.type, flags);
        parcel.writeInt(this.isPro ? 1 : 0);
        parcel.writeInt(this.isLegalPerson ? 1 : 0);
        parcel.writeString(this.manager);
        parcel.writeString(this.locationId);
        parcel.writeLong(this.metroId);
        parcel.writeLong(this.districtId);
        parcel.writeString(this.userHashId);
        Shop shop = this.shop;
        if (shop == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shop.writeToParcel(parcel, flags);
        }
    }

    public Profile(@l String str, @l String str2, @l String str3, @l Image image, @l Social social, @l String str4, @l String str5, @k UserType userType, boolean z12, boolean z13, @l String str6, @l String str7, long j12, long j13, @l String str8, @l Shop shop) {
        this.userId = str;
        this.email = str2;
        this.name = str3;
        this.avatar = image;
        this.social = social;
        this.socialId = str4;
        this.phone = str5;
        this.type = userType;
        this.isPro = z12;
        this.isLegalPerson = z13;
        this.manager = str6;
        this.locationId = str7;
        this.metroId = j12;
        this.districtId = j13;
        this.userHashId = str8;
        this.shop = shop;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Profile(String str, String str2, String str3, Image image, Social social, String str4, String str5, UserType userType, boolean z12, boolean z13, String str6, String str7, long j12, long j13, String str8, Shop shop, int i12, C42822w c42822w) {
        UserType userType2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        String str9 = (i12 & 1) != 0 ? null : str;
        String str10 = (i12 & 2) != 0 ? null : str2;
        String str11 = (i12 & 4) != 0 ? null : str3;
        Image image2 = (i12 & 8) != 0 ? null : image;
        Social social2 = (i12 & 16) != 0 ? null : social;
        String str12 = (i12 & 32) != 0 ? null : str4;
        String str13 = (i12 & 64) != 0 ? null : str5;
        if ((i12 & 128) != 0) {
            userType2 = new UserType(UserTypeCode.PRIVATE, objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0);
        } else {
            userType2 = userType;
        }
        this(str9, str10, str11, image2, social2, str12, str13, userType2, (i12 & 256) != 0 ? false : z12, (i12 & 512) == 0 ? z13 : false, (i12 & 1024) != 0 ? null : str6, (i12 & 2048) != 0 ? null : str7, (i12 & 4096) != 0 ? -1L : j12, (i12 & 8192) == 0 ? j13 : -1L, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str8, (i12 & 32768) == 0 ? shop : null);
    }
}
