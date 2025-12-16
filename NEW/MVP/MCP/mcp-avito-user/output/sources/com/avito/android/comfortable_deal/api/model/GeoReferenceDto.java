package com.avito.android.comfortable_deal.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AgentRoomDealResponse.kt */
@d
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0014\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/avito/android/comfortable_deal/api/model/GeoReferenceDto;", "Landroid/os/Parcelable;", "", "after", "Lcom/avito/android/comfortable_deal/api/model/AfterWithIcon;", "afterWithIcon", "", "colors", "content", "<init>", "(Ljava/lang/String;Lcom/avito/android/comfortable_deal/api/model/AfterWithIcon;Ljava/util/List;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/comfortable_deal/api/model/AfterWithIcon;", "d", "()Lcom/avito/android/comfortable_deal/api/model/AfterWithIcon;", "Ljava/util/List;", "e", "()Ljava/util/List;", "f", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class GeoReferenceDto implements Parcelable {

    @k
    public static final Parcelable.Creator<GeoReferenceDto> CREATOR = new a();

    @c("after")
    @l
    private final String after;

    @c("afterWithIcon")
    @l
    private final AfterWithIcon afterWithIcon;

    @c("colors")
    @l
    private final List<String> colors;

    @c("content")
    @l
    private final String content;

    /* compiled from: AgentRoomDealResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GeoReferenceDto> {
        @Override // android.os.Parcelable.Creator
        public final GeoReferenceDto createFromParcel(Parcel parcel) {
            return new GeoReferenceDto(parcel.readString(), parcel.readInt() == 0 ? null : AfterWithIcon.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GeoReferenceDto[] newArray(int i12) {
            return new GeoReferenceDto[i12];
        }
    }

    public GeoReferenceDto(@l String str, @l AfterWithIcon afterWithIcon, @l List<String> list, @l String str2) {
        this.after = str;
        this.afterWithIcon = afterWithIcon;
        this.colors = list;
        this.content = str2;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getAfter() {
        return this.after;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final AfterWithIcon getAfterWithIcon() {
        return this.afterWithIcon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    public final List<String> e() {
        return this.colors;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeoReferenceDto)) {
            return false;
        }
        GeoReferenceDto geoReferenceDto = (GeoReferenceDto) obj;
        return L.f(this.after, geoReferenceDto.after) && L.f(this.afterWithIcon, geoReferenceDto.afterWithIcon) && L.f(this.colors, geoReferenceDto.colors) && L.f(this.content, geoReferenceDto.content);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    public final int hashCode() {
        String str = this.after;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AfterWithIcon afterWithIcon = this.afterWithIcon;
        int iHashCode2 = (iHashCode + (afterWithIcon == null ? 0 : afterWithIcon.hashCode())) * 31;
        List<String> list = this.colors;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.content;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GeoReferenceDto(after=");
        sb2.append(this.after);
        sb2.append(", afterWithIcon=");
        sb2.append(this.afterWithIcon);
        sb2.append(", colors=");
        sb2.append(this.colors);
        sb2.append(", content=");
        return C22026a.c(sb2, this.content, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.after);
        AfterWithIcon afterWithIcon = this.afterWithIcon;
        if (afterWithIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            afterWithIcon.writeToParcel(parcel, i12);
        }
        parcel.writeStringList(this.colors);
        parcel.writeString(this.content);
    }
}
