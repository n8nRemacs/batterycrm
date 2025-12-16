package com.avito.android.profile_settings_basic.adapter.section_header;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_basic.adapter.BasicSettingsListItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SectionHeaderItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_basic/adapter/section_header/SectionHeaderItem;", "Lcom/avito/android/profile_settings_basic/adapter/BasicSettingsListItem;", "Type", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class SectionHeaderItem implements BasicSettingsListItem {

    @k
    public static final Parcelable.Creator<SectionHeaderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f228671b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f228672c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f228673d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Type f228674e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SectionHeaderItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_basic/adapter/section_header/SectionHeaderItem$Type;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f228675b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f228676c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Type[] f228677d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f228678e;

        static {
            Type type = new Type("COMMON", 0);
            f228675b = type;
            Type type2 = new Type("VERIFICATION", 1);
            f228676c = type2;
            Type[] typeArr = {type, type2};
            f228677d = typeArr;
            f228678e = kotlin.enums.c.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f228677d.clone();
        }
    }

    /* compiled from: SectionHeaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SectionHeaderItem> {
        @Override // android.os.Parcelable.Creator
        public final SectionHeaderItem createFromParcel(Parcel parcel) {
            return new SectionHeaderItem(parcel.readString(), parcel.readString(), parcel.readString(), Type.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final SectionHeaderItem[] newArray(int i12) {
            return new SectionHeaderItem[i12];
        }
    }

    public SectionHeaderItem(@k String str, @k String str2, @l String str3, @k Type type) {
        this.f228671b = str;
        this.f228672c = str2;
        this.f228673d = str3;
        this.f228674e = type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionHeaderItem)) {
            return false;
        }
        SectionHeaderItem sectionHeaderItem = (SectionHeaderItem) obj;
        return L.f(this.f228671b, sectionHeaderItem.f228671b) && L.f(this.f228672c, sectionHeaderItem.f228672c) && L.f(this.f228673d, sectionHeaderItem.f228673d) && this.f228674e == sectionHeaderItem.f228674e;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF222267b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF223543b() {
        return this.f228671b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f228671b.hashCode() * 31, 31, this.f228672c);
        String str = this.f228673d;
        return this.f228674e.hashCode() + ((iD2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        return "SectionHeaderItem(stringId=" + this.f228671b + ", title=" + this.f228672c + ", subtitle=" + this.f228673d + ", type=" + this.f228674e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f228671b);
        parcel.writeString(this.f228672c);
        parcel.writeString(this.f228673d);
        parcel.writeString(this.f228674e.name());
    }

    public /* synthetic */ SectionHeaderItem(String str, String str2, String str3, Type type, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "section_header_item" : str, str2, str3, (i12 & 8) != 0 ? Type.f228675b : type);
    }
}
