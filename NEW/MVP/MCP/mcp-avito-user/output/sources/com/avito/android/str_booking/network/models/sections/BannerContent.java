package com.avito.android.str_booking.network.models.sections;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.str_booking.network.models.common.Button;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BannerSection.kt */
@d
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/avito/android/str_booking/network/models/sections/BannerContent;", "Landroid/os/Parcelable;", "", "header", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "", "Lcom/avito/android/str_booking/network/models/common/Button;", "buttons", "Lcom/avito/android/remote/model/UniversalColor;", "color", "footer", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lcom/avito/android/remote/model/UniversalColor;", "d", "()Lcom/avito/android/remote/model/UniversalColor;", "e", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BannerContent implements Parcelable {

    @k
    public static final Parcelable.Creator<BannerContent> CREATOR = new a();

    @c("buttons")
    @l
    private final List<Button> buttons;

    @c("color")
    @l
    private final UniversalColor color;

    @c("description")
    @l
    private final AttributedText description;

    @c("footer")
    @l
    private final AttributedText footer;

    @c("header")
    @l
    private final String header;

    /* compiled from: BannerSection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BannerContent> {
        @Override // android.os.Parcelable.Creator
        public final BannerContent createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(BannerContent.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new BannerContent(string, attributedText, arrayList, (UniversalColor) parcel.readParcelable(BannerContent.class.getClassLoader()), (AttributedText) parcel.readParcelable(BannerContent.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BannerContent[] newArray(int i12) {
            return new BannerContent[i12];
        }
    }

    public BannerContent(@l String str, @l AttributedText attributedText, @l List<Button> list, @l UniversalColor universalColor, @l AttributedText attributedText2) {
        this.header = str;
        this.description = attributedText;
        this.buttons = list;
        this.color = universalColor;
        this.footer = attributedText2;
    }

    @l
    public final List<Button> c() {
        return this.buttons;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final UniversalColor getColor() {
        return this.color;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final AttributedText getFooter() {
        return this.footer;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerContent)) {
            return false;
        }
        BannerContent bannerContent = (BannerContent) obj;
        return L.f(this.header, bannerContent.header) && L.f(this.description, bannerContent.description) && L.f(this.buttons, bannerContent.buttons) && L.f(this.color, bannerContent.color) && L.f(this.footer, bannerContent.footer);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    @l
    public final AttributedText getDescription() {
        return this.description;
    }

    public final int hashCode() {
        String str = this.header;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AttributedText attributedText = this.description;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        List<Button> list = this.buttons;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        UniversalColor universalColor = this.color;
        int iHashCode4 = (iHashCode3 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        AttributedText attributedText2 = this.footer;
        return iHashCode4 + (attributedText2 != null ? attributedText2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BannerContent(header=");
        sb2.append(this.header);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", buttons=");
        sb2.append(this.buttons);
        sb2.append(", color=");
        sb2.append(this.color);
        sb2.append(", footer=");
        return com.avito.android.actions_sheet.a.w(sb2, this.footer, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.header);
        parcel.writeParcelable(this.description, i12);
        List<Button> list = this.buttons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                Button button = (Button) itA.next();
                if (button == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    button.writeToParcel(parcel, i12);
                }
            }
        }
        parcel.writeParcelable(this.color, i12);
        parcel.writeParcelable(this.footer, i12);
    }
}
