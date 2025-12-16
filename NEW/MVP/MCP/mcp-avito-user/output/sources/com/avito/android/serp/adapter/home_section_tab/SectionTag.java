package com.avito.android.serp.adapter.home_section_tab;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SectionTagsItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/home_section_tab/SectionTag;", "Landroid/os/Parcelable;", "Lcom/avito/conveyor_item/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SectionTag implements Parcelable, com.avito.conveyor_item.a {

    @k
    public static final Parcelable.Creator<SectionTag> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f270144b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f270145c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f270146d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f270147e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f270148f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f270149g;

    /* compiled from: SectionTagsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SectionTag> {
        @Override // android.os.Parcelable.Creator
        public final SectionTag createFromParcel(Parcel parcel) {
            return new SectionTag(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SectionTag[] newArray(int i12) {
            return new SectionTag[i12];
        }
    }

    public SectionTag(@k String str, @k String str2, @k String str3, boolean z12, @k String str4, @l String str5) {
        this.f270144b = str;
        this.f270145c = str2;
        this.f270146d = str3;
        this.f270147e = str4;
        this.f270148f = str5;
        this.f270149g = z12;
    }

    public static SectionTag a(SectionTag sectionTag, String str, boolean z12, int i12) {
        String str2 = sectionTag.f270144b;
        if ((i12 & 2) != 0) {
            str = sectionTag.f270145c;
        }
        String str3 = str;
        String str4 = sectionTag.f270146d;
        String str5 = (i12 & 8) != 0 ? sectionTag.f270147e : "";
        String str6 = sectionTag.f270148f;
        if ((i12 & 32) != 0) {
            z12 = sectionTag.f270149g;
        }
        sectionTag.getClass();
        return new SectionTag(str2, str3, str4, z12, str5, str6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionTag)) {
            return false;
        }
        SectionTag sectionTag = (SectionTag) obj;
        return L.f(this.f270144b, sectionTag.f270144b) && L.f(this.f270145c, sectionTag.f270145c) && L.f(this.f270146d, sectionTag.f270146d) && L.f(this.f270147e, sectionTag.f270147e) && L.f(this.f270148f, sectionTag.f270148f) && this.f270149g == sectionTag.f270149g;
    }

    @Override // TV0.a
    public final long getId() {
        return getF270144b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF270144b() {
        return this.f270144b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(H.d(this.f270144b.hashCode() * 31, 31, this.f270145c), 31, this.f270146d), 31, this.f270147e);
        String str = this.f270148f;
        return Boolean.hashCode(this.f270149g) + ((iD2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SectionTag(stringId=");
        sb2.append(this.f270144b);
        sb2.append(", feedId=");
        sb2.append(this.f270145c);
        sb2.append(", title=");
        sb2.append(this.f270146d);
        sb2.append(", filter=");
        sb2.append(this.f270147e);
        sb2.append(", unsetId=");
        sb2.append(this.f270148f);
        sb2.append(", selected=");
        return r.x(sb2, this.f270149g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f270144b);
        parcel.writeString(this.f270145c);
        parcel.writeString(this.f270146d);
        parcel.writeString(this.f270147e);
        parcel.writeString(this.f270148f);
        parcel.writeInt(this.f270149g ? 1 : 0);
    }
}
