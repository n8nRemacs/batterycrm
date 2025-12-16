package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertHotel.kt */
@d
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/avito/android/hotel/model/AdvertHotelRating;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "Lcom/avito/android/remote/model/ButtonAction;", "actionButton", "Lcom/avito/android/remote/model/ParametrizedEvent;", "onShowEvent", "", "Lcom/avito/android/hotel/model/HotelBadge;", "badges", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/ButtonAction;Lcom/avito/android/remote/model/ParametrizedEvent;Ljava/util/List;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/ButtonAction;", "c", "()Lcom/avito/android/remote/model/ButtonAction;", "Lcom/avito/android/remote/model/ParametrizedEvent;", "e", "()Lcom/avito/android/remote/model/ParametrizedEvent;", "Ljava/util/List;", "d", "()Ljava/util/List;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AdvertHotelRating implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertHotelRating> CREATOR = new a();

    @c("actionButton")
    @l
    private final ButtonAction actionButton;

    @c("badges")
    @l
    private final List<HotelBadge> badges;

    @c("description")
    @l
    private final AttributedText description;

    @c("onShowEvent")
    @l
    private final ParametrizedEvent onShowEvent;

    @c("title")
    @l
    private final String title;

    /* compiled from: AdvertHotel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertHotelRating> {
        @Override // android.os.Parcelable.Creator
        public final AdvertHotelRating createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(AdvertHotelRating.class.getClassLoader());
            ButtonAction buttonAction = (ButtonAction) parcel.readParcelable(AdvertHotelRating.class.getClassLoader());
            ParametrizedEvent parametrizedEvent = (ParametrizedEvent) parcel.readParcelable(AdvertHotelRating.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(HotelBadge.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new AdvertHotelRating(string, attributedText, buttonAction, parametrizedEvent, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertHotelRating[] newArray(int i12) {
            return new AdvertHotelRating[i12];
        }
    }

    public AdvertHotelRating(@l String str, @l AttributedText attributedText, @l ButtonAction buttonAction, @l ParametrizedEvent parametrizedEvent, @l List<HotelBadge> list) {
        this.title = str;
        this.description = attributedText;
        this.actionButton = buttonAction;
        this.onShowEvent = parametrizedEvent;
        this.badges = list;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final ButtonAction getActionButton() {
        return this.actionButton;
    }

    @l
    public final List<HotelBadge> d() {
        return this.badges;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final ParametrizedEvent getOnShowEvent() {
        return this.onShowEvent;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertHotelRating)) {
            return false;
        }
        AdvertHotelRating advertHotelRating = (AdvertHotelRating) obj;
        return L.f(this.title, advertHotelRating.title) && L.f(this.description, advertHotelRating.description) && L.f(this.actionButton, advertHotelRating.actionButton) && L.f(this.onShowEvent, advertHotelRating.onShowEvent) && L.f(this.badges, advertHotelRating.badges);
    }

    @l
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AttributedText attributedText = this.description;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        ButtonAction buttonAction = this.actionButton;
        int iHashCode3 = (iHashCode2 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
        ParametrizedEvent parametrizedEvent = this.onShowEvent;
        int iHashCode4 = (iHashCode3 + (parametrizedEvent == null ? 0 : parametrizedEvent.hashCode())) * 31;
        List<HotelBadge> list = this.badges;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertHotelRating(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", actionButton=");
        sb2.append(this.actionButton);
        sb2.append(", onShowEvent=");
        sb2.append(this.onShowEvent);
        sb2.append(", badges=");
        return H.p(sb2, this.badges, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.description, i12);
        parcel.writeParcelable(this.actionButton, i12);
        parcel.writeParcelable(this.onShowEvent, i12);
        List<HotelBadge> list = this.badges;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((HotelBadge) itA.next()).writeToParcel(parcel, i12);
        }
    }
}
