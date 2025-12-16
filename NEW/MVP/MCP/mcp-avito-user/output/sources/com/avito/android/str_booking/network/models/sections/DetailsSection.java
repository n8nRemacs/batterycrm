package com.avito.android.str_booking.network.models.sections;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DetailsSection.kt */
@d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/str_booking/network/models/sections/DetailsSection;", "LUx0/d;", "Landroid/os/Parcelable;", "", "type", "Lcom/avito/android/str_booking/network/models/sections/DetailsContent;", "content", "<init>", "(Ljava/lang/String;Lcom/avito/android/str_booking/network/models/sections/DetailsContent;)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Lcom/avito/android/str_booking/network/models/sections/DetailsContent;", "c", "()Lcom/avito/android/str_booking/network/models/sections/DetailsContent;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DetailsSection implements Ux0.d, Parcelable {

    @k
    public static final Parcelable.Creator<DetailsSection> CREATOR = new a();

    @c("content")
    @l
    private final DetailsContent content;

    @c("type")
    @l
    private final String type;

    /* compiled from: DetailsSection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DetailsSection> {
        @Override // android.os.Parcelable.Creator
        public final DetailsSection createFromParcel(Parcel parcel) {
            return new DetailsSection(parcel.readString(), parcel.readInt() == 0 ? null : DetailsContent.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final DetailsSection[] newArray(int i12) {
            return new DetailsSection[i12];
        }
    }

    public DetailsSection(@l String str, @l DetailsContent detailsContent) {
        this.type = str;
        this.content = detailsContent;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final DetailsContent getContent() {
        return this.content;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DetailsSection)) {
            return false;
        }
        DetailsSection detailsSection = (DetailsSection) obj;
        return L.f(this.type, detailsSection.type) && L.f(this.content, detailsSection.content);
    }

    public final int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        DetailsContent detailsContent = this.content;
        return iHashCode + (detailsContent != null ? detailsContent.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "DetailsSection(type=" + this.type + ", content=" + this.content + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.type);
        DetailsContent detailsContent = this.content;
        if (detailsContent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            detailsContent.writeToParcel(parcel, i12);
        }
    }
}
