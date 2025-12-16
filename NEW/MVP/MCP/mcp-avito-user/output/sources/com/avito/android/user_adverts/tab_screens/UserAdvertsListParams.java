package com.avito.android.user_adverts.tab_screens;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.user_adverts.space.UserAdvertsSpace;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import org.webrtc.h;

/* compiled from: UserAdvertsListParams.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/UserAdvertsListParams;", "Landroid/os/Parcelable;", "SearchInfo", "ShortcutInfo", "UserInfo", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserAdvertsListParams implements Parcelable {

    @k
    public static final Parcelable.Creator<UserAdvertsListParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ShortcutInfo f314696b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final UserInfo f314697c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SearchInfo f314698d;

    /* compiled from: UserAdvertsListParams.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/UserAdvertsListParams$SearchInfo;", "Landroid/os/Parcelable;", "a", "StartType", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class SearchInfo implements Parcelable {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f314700b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f314701c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Map<String, Object> f314702d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final Map<String, Object> f314703e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final StartType f314704f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public static final a f314699g = new a(null);

        @k
        public static final Parcelable.Creator<SearchInfo> CREATOR = new b();

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: UserAdvertsListParams.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/UserAdvertsListParams$SearchInfo$StartType;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class StartType {

            /* renamed from: b, reason: collision with root package name */
            public static final StartType f314705b;

            /* renamed from: c, reason: collision with root package name */
            public static final StartType f314706c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ StartType[] f314707d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f314708e;

            static {
                StartType startType = new StartType("SearchBar", 0);
                f314705b = startType;
                StartType startType2 = new StartType("Filters", 1);
                f314706c = startType2;
                StartType[] startTypeArr = {startType, startType2};
                f314707d = startTypeArr;
                f314708e = c.a(startTypeArr);
            }

            public StartType() {
                throw null;
            }

            public static StartType valueOf(String str) {
                return (StartType) Enum.valueOf(StartType.class, str);
            }

            public static StartType[] values() {
                return (StartType[]) f314707d.clone();
            }
        }

        /* compiled from: UserAdvertsListParams.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/UserAdvertsListParams$SearchInfo$a;", "", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        /* compiled from: UserAdvertsListParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<SearchInfo> {
            @Override // android.os.Parcelable.Creator
            public final SearchInfo createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                boolean z12 = parcel.readInt() != 0;
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = h.c(SearchInfo.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
                }
                int i13 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i13);
                int iC3 = 0;
                while (iC3 != i13) {
                    iC3 = h.c(SearchInfo.class, parcel, linkedHashMap2, parcel.readString(), iC3, 1);
                }
                return new SearchInfo(string, z12, linkedHashMap, linkedHashMap2, StartType.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final SearchInfo[] newArray(int i12) {
                return new SearchInfo[i12];
            }
        }

        public SearchInfo(@k String str, boolean z12, @k Map<String, ? extends Object> map, @k Map<String, ? extends Object> map2, @k StartType startType) {
            this.f314700b = str;
            this.f314701c = z12;
            this.f314702d = map;
            this.f314703e = map2;
            this.f314704f = startType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchInfo)) {
                return false;
            }
            SearchInfo searchInfo = (SearchInfo) obj;
            return L.f(this.f314700b, searchInfo.f314700b) && this.f314701c == searchInfo.f314701c && L.f(this.f314702d, searchInfo.f314702d) && L.f(this.f314703e, searchInfo.f314703e) && this.f314704f == searchInfo.f314704f;
        }

        public final int hashCode() {
            return this.f314704f.hashCode() + AK.c.c(AK.c.c(r.i(this.f314700b.hashCode() * 31, 31, this.f314701c), 31, this.f314702d), 31, this.f314703e);
        }

        @k
        public final String toString() {
            return "SearchInfo(query=" + this.f314700b + ", queryByTitle=" + this.f314701c + ", filterParams=" + this.f314702d + ", defaultFilterParams=" + this.f314703e + ", startType=" + this.f314704f + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f314700b);
            parcel.writeInt(this.f314701c ? 1 : 0);
            Iterator itI = C0.i(parcel, this.f314702d);
            while (itI.hasNext()) {
                Map.Entry entry = (Map.Entry) itI.next();
                h.h(parcel, (String) entry.getKey(), entry);
            }
            Iterator itI2 = C0.i(parcel, this.f314703e);
            while (itI2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itI2.next();
                h.h(parcel, (String) entry2.getKey(), entry2);
            }
            parcel.writeString(this.f314704f.name());
        }
    }

    /* compiled from: UserAdvertsListParams.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/UserAdvertsListParams$UserInfo;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UserInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<UserInfo> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UserAdvertsSpace f314714b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f314715c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f314716d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f314717e;

        /* compiled from: UserAdvertsListParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UserInfo> {
            @Override // android.os.Parcelable.Creator
            public final UserInfo createFromParcel(Parcel parcel) {
                return new UserInfo(UserAdvertsSpace.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final UserInfo[] newArray(int i12) {
                return new UserInfo[i12];
            }
        }

        public UserInfo(@k UserAdvertsSpace userAdvertsSpace, boolean z12, @k String str, @k String str2) {
            this.f314714b = userAdvertsSpace;
            this.f314715c = z12;
            this.f314716d = str;
            this.f314717e = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserInfo)) {
                return false;
            }
            UserInfo userInfo = (UserInfo) obj;
            return this.f314714b == userInfo.f314714b && this.f314715c == userInfo.f314715c && L.f(this.f314716d, userInfo.f314716d) && L.f(this.f314717e, userInfo.f314717e);
        }

        public final int hashCode() {
            return this.f314717e.hashCode() + H.d(r.i(this.f314714b.hashCode() * 31, 31, this.f314715c), 31, this.f314716d);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UserInfo(space=");
            sb2.append(this.f314714b);
            sb2.append(", pro=");
            sb2.append(this.f314715c);
            sb2.append(", profileSettingsKey=");
            sb2.append(this.f314716d);
            sb2.append(", reAgentProfileStateKey=");
            return C22026a.c(sb2, this.f314717e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f314714b.name());
            parcel.writeInt(this.f314715c ? 1 : 0);
            parcel.writeString(this.f314716d);
            parcel.writeString(this.f314717e);
        }
    }

    /* compiled from: UserAdvertsListParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserAdvertsListParams> {
        @Override // android.os.Parcelable.Creator
        public final UserAdvertsListParams createFromParcel(Parcel parcel) {
            return new UserAdvertsListParams(ShortcutInfo.CREATOR.createFromParcel(parcel), UserInfo.CREATOR.createFromParcel(parcel), SearchInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final UserAdvertsListParams[] newArray(int i12) {
            return new UserAdvertsListParams[i12];
        }
    }

    public UserAdvertsListParams(@k ShortcutInfo shortcutInfo, @k UserInfo userInfo, @k SearchInfo searchInfo) {
        this.f314696b = shortcutInfo;
        this.f314697c = userInfo;
        this.f314698d = searchInfo;
    }

    public static UserAdvertsListParams a(UserAdvertsListParams userAdvertsListParams, SearchInfo searchInfo) {
        ShortcutInfo shortcutInfo = userAdvertsListParams.f314696b;
        UserInfo userInfo = userAdvertsListParams.f314697c;
        userAdvertsListParams.getClass();
        return new UserAdvertsListParams(shortcutInfo, userInfo, searchInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAdvertsListParams)) {
            return false;
        }
        UserAdvertsListParams userAdvertsListParams = (UserAdvertsListParams) obj;
        return L.f(this.f314696b, userAdvertsListParams.f314696b) && L.f(this.f314697c, userAdvertsListParams.f314697c) && L.f(this.f314698d, userAdvertsListParams.f314698d);
    }

    public final int hashCode() {
        return this.f314698d.hashCode() + ((this.f314697c.hashCode() + (this.f314696b.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        return "UserAdvertsListParams(shortcutInfo=" + this.f314696b + ", userInfo=" + this.f314697c + ", searchInfo=" + this.f314698d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f314696b.writeToParcel(parcel, i12);
        this.f314697c.writeToParcel(parcel, i12);
        this.f314698d.writeToParcel(parcel, i12);
    }

    /* compiled from: UserAdvertsListParams.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/UserAdvertsListParams$ShortcutInfo;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShortcutInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<ShortcutInfo> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f314709b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f314710c;

        /* renamed from: d, reason: collision with root package name */
        public final int f314711d;

        /* renamed from: e, reason: collision with root package name */
        public final int f314712e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f314713f;

        /* compiled from: UserAdvertsListParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ShortcutInfo> {
            @Override // android.os.Parcelable.Creator
            public final ShortcutInfo createFromParcel(Parcel parcel) {
                return new ShortcutInfo(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final ShortcutInfo[] newArray(int i12) {
                return new ShortcutInfo[i12];
            }
        }

        public ShortcutInfo(int i12, int i13, @k String str, @k String str2, boolean z12) {
            this.f314709b = str;
            this.f314710c = str2;
            this.f314711d = i12;
            this.f314712e = i13;
            this.f314713f = z12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShortcutInfo)) {
                return false;
            }
            ShortcutInfo shortcutInfo = (ShortcutInfo) obj;
            return L.f(this.f314709b, shortcutInfo.f314709b) && L.f(this.f314710c, shortcutInfo.f314710c) && this.f314711d == shortcutInfo.f314711d && this.f314712e == shortcutInfo.f314712e && this.f314713f == shortcutInfo.f314713f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f314713f) + r.e(this.f314712e, r.e(this.f314711d, H.d(this.f314709b.hashCode() * 31, 31, this.f314710c), 31), 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShortcutInfo(idempotencyKey=");
            sb2.append(this.f314709b);
            sb2.append(", refreshKey=");
            sb2.append(this.f314710c);
            sb2.append(", index=");
            sb2.append(this.f314711d);
            sb2.append(", count=");
            sb2.append(this.f314712e);
            sb2.append(", isActive=");
            return r.x(sb2, this.f314713f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f314709b);
            parcel.writeString(this.f314710c);
            parcel.writeInt(this.f314711d);
            parcel.writeInt(this.f314712e);
            parcel.writeInt(this.f314713f ? 1 : 0);
        }

        public /* synthetic */ ShortcutInfo(String str, String str2, int i12, int i13, boolean z12, int i14, C42822w c42822w) {
            this(i12, i13, str, str2, (i14 & 16) != 0 ? false : z12);
        }
    }
}
