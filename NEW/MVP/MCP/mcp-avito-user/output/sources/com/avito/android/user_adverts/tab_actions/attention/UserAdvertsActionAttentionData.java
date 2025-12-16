package com.avito.android.user_adverts.tab_actions.attention;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.user_adverts.model.UserAdvertActionAttentionInfo;
import com.avito.android.user_adverts.model.UserAdvertActionType;
import com.avito.android.user_adverts.model.UserAdvertsGroupInfo;
import com.avito.android.user_adverts.model.UserAdvertsShortcutGroup;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertsActionAttentionData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/attention/UserAdvertsActionAttentionData;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserAdvertsActionAttentionData implements Parcelable {

    @k
    public static final Parcelable.Creator<UserAdvertsActionAttentionData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Map<UserAdvertsShortcutGroup, UserAdvertsGroupInfo> f314194b;

    /* renamed from: c, reason: collision with root package name */
    public final int f314195c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f314196d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final UserAdvertActionAttentionInfo f314197e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final UserAdvertActionType.Multiple f314198f;

    /* compiled from: UserAdvertsActionAttentionData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserAdvertsActionAttentionData> {
        @Override // android.os.Parcelable.Creator
        public final UserAdvertsActionAttentionData createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                linkedHashMap.put(parcel.readParcelable(UserAdvertsActionAttentionData.class.getClassLoader()), UserAdvertsGroupInfo.CREATOR.createFromParcel(parcel));
            }
            return new UserAdvertsActionAttentionData(parcel.readInt(), UserAdvertActionAttentionInfo.CREATOR.createFromParcel(parcel), UserAdvertActionType.Multiple.CREATOR.createFromParcel(parcel), parcel.readString(), linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final UserAdvertsActionAttentionData[] newArray(int i12) {
            return new UserAdvertsActionAttentionData[i12];
        }
    }

    public UserAdvertsActionAttentionData(int i12, @k UserAdvertActionAttentionInfo userAdvertActionAttentionInfo, @k UserAdvertActionType.Multiple multiple, @k String str, @k Map map) {
        this.f314194b = map;
        this.f314195c = i12;
        this.f314196d = str;
        this.f314197e = userAdvertActionAttentionInfo;
        this.f314198f = multiple;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAdvertsActionAttentionData)) {
            return false;
        }
        UserAdvertsActionAttentionData userAdvertsActionAttentionData = (UserAdvertsActionAttentionData) obj;
        return L.f(this.f314194b, userAdvertsActionAttentionData.f314194b) && this.f314195c == userAdvertsActionAttentionData.f314195c && L.f(this.f314196d, userAdvertsActionAttentionData.f314196d) && L.f(this.f314197e, userAdvertsActionAttentionData.f314197e) && this.f314198f == userAdvertsActionAttentionData.f314198f;
    }

    public final int hashCode() {
        return this.f314198f.hashCode() + ((this.f314197e.hashCode() + H.d(r.e(this.f314195c, this.f314194b.hashCode() * 31, 31), 31, this.f314196d)) * 31);
    }

    @k
    public final String toString() {
        return "UserAdvertsActionAttentionData(selectedGroupInfo=" + this.f314194b + ", selectedSize=" + this.f314195c + ", currentShortcut=" + this.f314196d + ", attentionInfo=" + this.f314197e + ", type=" + this.f314198f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itI = C0.i(parcel, this.f314194b);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeParcelable((Parcelable) entry.getKey(), i12);
            ((UserAdvertsGroupInfo) entry.getValue()).writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f314195c);
        parcel.writeString(this.f314196d);
        this.f314197e.writeToParcel(parcel, i12);
        this.f314198f.writeToParcel(parcel, i12);
    }
}
