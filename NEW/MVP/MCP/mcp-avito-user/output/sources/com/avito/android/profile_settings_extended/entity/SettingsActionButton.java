package com.avito.android.profile_settings_extended.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SettingsActionButton.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/entity/SettingsActionButton;", "Landroid/os/Parcelable;", "Type", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class SettingsActionButton implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<SettingsActionButton> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f230297b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Type f230298c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final DeepLink f230299d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SettingsActionButton.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/entity/SettingsActionButton$Type;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f230300b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f230301c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Type[] f230302d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f230303e;

        static {
            Type type = new Type("EDIT", 0);
            f230300b = type;
            Type type2 = new Type("DELETE", 1);
            f230301c = type2;
            Type[] typeArr = {type, type2};
            f230302d = typeArr;
            f230303e = kotlin.enums.c.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f230302d.clone();
        }
    }

    /* compiled from: SettingsActionButton.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SettingsActionButton> {
        @Override // android.os.Parcelable.Creator
        public final SettingsActionButton createFromParcel(Parcel parcel) {
            return new SettingsActionButton(parcel.readString(), Type.valueOf(parcel.readString()), (DeepLink) parcel.readParcelable(SettingsActionButton.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SettingsActionButton[] newArray(int i12) {
            return new SettingsActionButton[i12];
        }
    }

    public SettingsActionButton(@Y61.k String str, @Y61.k Type type, @Y61.l DeepLink deepLink) {
        this.f230297b = str;
        this.f230298c = type;
        this.f230299d = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingsActionButton)) {
            return false;
        }
        SettingsActionButton settingsActionButton = (SettingsActionButton) obj;
        return L.f(this.f230297b, settingsActionButton.f230297b) && this.f230298c == settingsActionButton.f230298c && L.f(this.f230299d, settingsActionButton.f230299d);
    }

    public final int hashCode() {
        int iHashCode = (this.f230298c.hashCode() + (this.f230297b.hashCode() * 31)) * 31;
        DeepLink deepLink = this.f230299d;
        return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SettingsActionButton(title=");
        sb2.append(this.f230297b);
        sb2.append(", iconType=");
        sb2.append(this.f230298c);
        sb2.append(", action=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f230299d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f230297b);
        parcel.writeString(this.f230298c.name());
        parcel.writeParcelable(this.f230299d, i12);
    }
}
