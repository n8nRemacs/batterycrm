package com.avito.android.remote.model.advert_badge_bar;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: AdvertBadgeBarParams.kt */
@d
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/advert_badge_bar/AdvertBadgeBarParams;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/advert_badge_bar/BadgeBarOrientation;", "display", "", "preloadCount", "", "showMoreTitle", "", "showArrow", "<init>", "(Lcom/avito/android/remote/model/advert_badge_bar/BadgeBarOrientation;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/advert_badge_bar/BadgeBarOrientation;", "getDisplay", "()Lcom/avito/android/remote/model/advert_badge_bar/BadgeBarOrientation;", "Ljava/lang/Integer;", "getPreloadCount", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getShowMoreTitle", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getShowArrow", "()Ljava/lang/Boolean;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AdvertBadgeBarParams implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertBadgeBarParams> CREATOR = new Creator();

    @c("display")
    @l
    private final BadgeBarOrientation display;

    @c("preloadCount")
    @l
    private final Integer preloadCount;

    @c("showArrow")
    @l
    private final Boolean showArrow;

    @c("showMoreTitle")
    @l
    private final String showMoreTitle;

    /* compiled from: AdvertBadgeBarParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertBadgeBarParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertBadgeBarParams createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf = null;
            BadgeBarOrientation badgeBarOrientationValueOf = parcel.readInt() == 0 ? null : BadgeBarOrientation.valueOf(parcel.readString());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AdvertBadgeBarParams(badgeBarOrientationValueOf, numValueOf, string, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertBadgeBarParams[] newArray(int i12) {
            return new AdvertBadgeBarParams[i12];
        }
    }

    public AdvertBadgeBarParams(@l BadgeBarOrientation badgeBarOrientation, @l Integer num, @l String str, @l Boolean bool) {
        this.display = badgeBarOrientation;
        this.preloadCount = num;
        this.showMoreTitle = str;
        this.showArrow = bool;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final BadgeBarOrientation getDisplay() {
        return this.display;
    }

    @l
    public final Integer getPreloadCount() {
        return this.preloadCount;
    }

    @l
    public final Boolean getShowArrow() {
        return this.showArrow;
    }

    @l
    public final String getShowMoreTitle() {
        return this.showMoreTitle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        BadgeBarOrientation badgeBarOrientation = this.display;
        if (badgeBarOrientation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(badgeBarOrientation.name());
        }
        Integer num = this.preloadCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        parcel.writeString(this.showMoreTitle);
        Boolean bool = this.showArrow;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
