package com.avito.android.remote.model.category_parameters.slot.delivery_summary;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: DeliverySummarySlotConfig.kt */
@d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DetailsItem;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "value", "", "withHelpIcon", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DetailsHelpContent;", "helpContent", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;ZLcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DetailsHelpContent;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "getValue", "()Lcom/avito/android/remote/model/text/AttributedText;", "Z", "getWithHelpIcon", "()Z", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DetailsHelpContent;", "getHelpContent", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DetailsHelpContent;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DetailsItem implements Parcelable {

    @k
    public static final Parcelable.Creator<DetailsItem> CREATOR = new Creator();

    @c("helpContent")
    @l
    private final DetailsHelpContent helpContent;

    @c("title")
    @k
    private final String title;

    @c("value")
    @k
    private final AttributedText value;

    @c("withHelpIcon")
    private final boolean withHelpIcon;

    /* compiled from: DeliverySummarySlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DetailsItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DetailsItem createFromParcel(@k Parcel parcel) {
            return new DetailsItem(parcel.readString(), (AttributedText) parcel.readParcelable(DetailsItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : DetailsHelpContent.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DetailsItem[] newArray(int i12) {
            return new DetailsItem[i12];
        }
    }

    public DetailsItem(@k String str, @k AttributedText attributedText, boolean z12, @l DetailsHelpContent detailsHelpContent) {
        this.title = str;
        this.value = attributedText;
        this.withHelpIcon = z12;
        this.helpContent = detailsHelpContent;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final DetailsHelpContent getHelpContent() {
        return this.helpContent;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @k
    public final AttributedText getValue() {
        return this.value;
    }

    public final boolean getWithHelpIcon() {
        return this.withHelpIcon;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.value, flags);
        parcel.writeInt(this.withHelpIcon ? 1 : 0);
        DetailsHelpContent detailsHelpContent = this.helpContent;
        if (detailsHelpContent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            detailsHelpContent.writeToParcel(parcel, flags);
        }
    }
}
