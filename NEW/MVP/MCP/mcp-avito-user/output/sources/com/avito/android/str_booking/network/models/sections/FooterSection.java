package com.avito.android.str_booking.network.models.sections;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FooterSection.kt */
@d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/str_booking/network/models/sections/FooterSection;", "LUx0/d;", "Landroid/os/Parcelable;", "", "type", "Lcom/avito/android/str_booking/network/models/sections/FooterContent;", "content", "<init>", "(Ljava/lang/String;Lcom/avito/android/str_booking/network/models/sections/FooterContent;)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Lcom/avito/android/str_booking/network/models/sections/FooterContent;", "c", "()Lcom/avito/android/str_booking/network/models/sections/FooterContent;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FooterSection implements Ux0.d, Parcelable {

    @k
    public static final Parcelable.Creator<FooterSection> CREATOR = new a();

    @c("content")
    @l
    private final FooterContent content;

    @c("type")
    @l
    private final String type;

    /* compiled from: FooterSection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FooterSection> {
        @Override // android.os.Parcelable.Creator
        public final FooterSection createFromParcel(Parcel parcel) {
            return new FooterSection(parcel.readString(), parcel.readInt() == 0 ? null : FooterContent.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final FooterSection[] newArray(int i12) {
            return new FooterSection[i12];
        }
    }

    public FooterSection(@l String str, @l FooterContent footerContent) {
        this.type = str;
        this.content = footerContent;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final FooterContent getContent() {
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
        if (!(obj instanceof FooterSection)) {
            return false;
        }
        FooterSection footerSection = (FooterSection) obj;
        return L.f(this.type, footerSection.type) && L.f(this.content, footerSection.content);
    }

    public final int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        FooterContent footerContent = this.content;
        return iHashCode + (footerContent != null ? footerContent.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "FooterSection(type=" + this.type + ", content=" + this.content + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.type);
        FooterContent footerContent = this.content;
        if (footerContent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            footerContent.writeToParcel(parcel, i12);
        }
    }
}
