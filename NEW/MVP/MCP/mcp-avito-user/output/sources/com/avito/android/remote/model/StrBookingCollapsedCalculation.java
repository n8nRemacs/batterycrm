package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: StrBookingCalculation.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/StrBookingCollapsedCalculation;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "description", "", "hint", "Lcom/avito/android/remote/model/StrBookingCalculationIcon;", "icon", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/StrBookingCalculationIcon;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "Ljava/lang/String;", "getHint", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/StrBookingCalculationIcon;", "getIcon", "()Lcom/avito/android/remote/model/StrBookingCalculationIcon;", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class StrBookingCollapsedCalculation implements Parcelable {

    @k
    public static final Parcelable.Creator<StrBookingCollapsedCalculation> CREATOR = new Creator();

    @c("description")
    @l
    private final AttributedText description;

    @c("hint")
    @l
    private final String hint;

    @c("icon")
    @l
    private final StrBookingCalculationIcon icon;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: StrBookingCalculation.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StrBookingCollapsedCalculation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrBookingCollapsedCalculation createFromParcel(@k Parcel parcel) {
            return new StrBookingCollapsedCalculation((AttributedText) parcel.readParcelable(StrBookingCollapsedCalculation.class.getClassLoader()), (AttributedText) parcel.readParcelable(StrBookingCollapsedCalculation.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : StrBookingCalculationIcon.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrBookingCollapsedCalculation[] newArray(int i12) {
            return new StrBookingCollapsedCalculation[i12];
        }
    }

    public StrBookingCollapsedCalculation(@l AttributedText attributedText, @l AttributedText attributedText2, @l String str, @l StrBookingCalculationIcon strBookingCalculationIcon) {
        this.title = attributedText;
        this.description = attributedText2;
        this.hint = str;
        this.icon = strBookingCalculationIcon;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    public final String getHint() {
        return this.hint;
    }

    @l
    public final StrBookingCalculationIcon getIcon() {
        return this.icon;
    }

    @l
    public final AttributedText getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.description, flags);
        parcel.writeString(this.hint);
        StrBookingCalculationIcon strBookingCalculationIcon = this.icon;
        if (strBookingCalculationIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            strBookingCalculationIcon.writeToParcel(parcel, flags);
        }
    }
}
