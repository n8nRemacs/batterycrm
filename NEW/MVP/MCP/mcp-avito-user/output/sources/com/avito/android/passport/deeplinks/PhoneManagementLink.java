package com.avito.android.passport.deeplinks;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: PhoneLinks.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/deeplinks/PhoneManagementLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "ActionType", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final class PhoneManagementLink extends DeepLink {

    @k
    public static final Parcelable.Creator<PhoneManagementLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ActionType f211129b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public String f211130c;

    /* renamed from: d, reason: collision with root package name */
    public int f211131d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public List<String> f211132e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PhoneLinks.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/passport/deeplinks/PhoneManagementLink$ActionType;", "", "(Ljava/lang/String;I)V", "REPLACE", "REPLACE_AND_DELETE", "DELETE", "SET_TO_ALL", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ActionType {

        @c("delete")
        public static final ActionType DELETE;

        @c("replace")
        public static final ActionType REPLACE;

        @c("replaceAndDelete")
        public static final ActionType REPLACE_AND_DELETE;

        @c("setToAll")
        public static final ActionType SET_TO_ALL;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ActionType[] f211133b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f211134c;

        static {
            ActionType actionType = new ActionType("REPLACE", 0);
            REPLACE = actionType;
            ActionType actionType2 = new ActionType("REPLACE_AND_DELETE", 1);
            REPLACE_AND_DELETE = actionType2;
            ActionType actionType3 = new ActionType("DELETE", 2);
            DELETE = actionType3;
            ActionType actionType4 = new ActionType("SET_TO_ALL", 3);
            SET_TO_ALL = actionType4;
            ActionType[] actionTypeArr = {actionType, actionType2, actionType3, actionType4};
            f211133b = actionTypeArr;
            f211134c = kotlin.enums.c.a(actionTypeArr);
        }

        private ActionType(String str, int i12) {
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) f211133b.clone();
        }
    }

    /* compiled from: PhoneLinks.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhoneManagementLink> {
        @Override // android.os.Parcelable.Creator
        public final PhoneManagementLink createFromParcel(Parcel parcel) {
            return new PhoneManagementLink(ActionType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final PhoneManagementLink[] newArray(int i12) {
            return new PhoneManagementLink[i12];
        }
    }

    public PhoneManagementLink(ActionType actionType, String str, int i12, List list, int i13, C42822w c42822w) {
        this(actionType, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? 0 : i12, (i13 & 8) != 0 ? C42784z0.f406748b : list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f211129b.name());
        parcel.writeString(this.f211130c);
        parcel.writeInt(this.f211131d);
        parcel.writeStringList(this.f211132e);
    }

    public PhoneManagementLink(@k ActionType actionType, @k String str, int i12, @k List<String> list) {
        this.f211129b = actionType;
        this.f211130c = str;
        this.f211131d = i12;
        this.f211132e = list;
    }
}
