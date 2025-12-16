package com.avito.android.str_booking.network.models.sections;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.str_booking.network.models.common.Button;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PromoBannerSection.kt */
@d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/avito/android/str_booking/network/models/sections/PromoBannerContent;", "Landroid/os/Parcelable;", "", "preset", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "Lcom/avito/android/remote/model/UniversalImage;", "image", "", "Lcom/avito/android/str_booking/network/models/common/Button;", "buttons", "Lcom/avito/android/str_booking/network/models/sections/VisibleActions;", "visibleActions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;Ljava/util/List;Lcom/avito/android/str_booking/network/models/sections/VisibleActions;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lcom/avito/android/str_booking/network/models/sections/VisibleActions;", "e", "()Lcom/avito/android/str_booking/network/models/sections/VisibleActions;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PromoBannerContent implements Parcelable {

    @k
    public static final Parcelable.Creator<PromoBannerContent> CREATOR = new a();

    @c("buttons")
    @l
    private final List<Button> buttons;

    @c("description")
    @l
    private final AttributedText description;

    @c("image")
    @l
    private final UniversalImage image;

    @c("preset")
    @l
    private final String preset;

    @c("header")
    @l
    private final String title;

    @c("visibleActions")
    @l
    private final VisibleActions visibleActions;

    /* compiled from: PromoBannerSection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PromoBannerContent> {
        @Override // android.os.Parcelable.Creator
        public final PromoBannerContent createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(PromoBannerContent.class.getClassLoader());
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(PromoBannerContent.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(Button.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new PromoBannerContent(string, string2, attributedText, universalImage, arrayList, parcel.readInt() != 0 ? VisibleActions.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final PromoBannerContent[] newArray(int i12) {
            return new PromoBannerContent[i12];
        }
    }

    public PromoBannerContent(@l String str, @l String str2, @l AttributedText attributedText, @l UniversalImage universalImage, @l List<Button> list, @l VisibleActions visibleActions) {
        this.preset = str;
        this.title = str2;
        this.description = attributedText;
        this.image = universalImage;
        this.buttons = list;
        this.visibleActions = visibleActions;
    }

    @l
    public final List<Button> c() {
        return this.buttons;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getPreset() {
        return this.preset;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final VisibleActions getVisibleActions() {
        return this.visibleActions;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoBannerContent)) {
            return false;
        }
        PromoBannerContent promoBannerContent = (PromoBannerContent) obj;
        return L.f(this.preset, promoBannerContent.preset) && L.f(this.title, promoBannerContent.title) && L.f(this.description, promoBannerContent.description) && L.f(this.image, promoBannerContent.image) && L.f(this.buttons, promoBannerContent.buttons) && L.f(this.visibleActions, promoBannerContent.visibleActions);
    }

    @l
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.preset;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AttributedText attributedText = this.description;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        UniversalImage universalImage = this.image;
        int iHashCode4 = (iHashCode3 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        List<Button> list = this.buttons;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        VisibleActions visibleActions = this.visibleActions;
        return iHashCode5 + (visibleActions != null ? visibleActions.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "PromoBannerContent(preset=" + this.preset + ", title=" + this.title + ", description=" + this.description + ", image=" + this.image + ", buttons=" + this.buttons + ", visibleActions=" + this.visibleActions + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.preset);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.description, i12);
        parcel.writeParcelable(this.image, i12);
        List<Button> list = this.buttons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Button) itA.next()).writeToParcel(parcel, i12);
            }
        }
        VisibleActions visibleActions = this.visibleActions;
        if (visibleActions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            visibleActions.writeToParcel(parcel, i12);
        }
    }
}
