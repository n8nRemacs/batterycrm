package com.avito.android.remote.model.category_parameters.slot.delivery_summary;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DeliverySummarySlotConfig.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b#\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/FbsFeeBlock;", "Landroid/os/Parcelable;", "", "value", "", "amountPenny", "Lcom/avito/android/remote/model/text/AttributedText;", "label", "amountAttributed", "", "withHelpIcon", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DetailsHelpContent;", "helpContent", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Ljava/lang/String;JLcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DetailsHelpContent;Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "J", "getAmountPenny", "()J", "Lcom/avito/android/remote/model/text/AttributedText;", "getLabel", "()Lcom/avito/android/remote/model/text/AttributedText;", "getAmountAttributed", "Ljava/lang/Boolean;", "getWithHelpIcon", "()Ljava/lang/Boolean;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DetailsHelpContent;", "getHelpContent", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DetailsHelpContent;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FbsFeeBlock implements Parcelable {

    @k
    public static final Parcelable.Creator<FbsFeeBlock> CREATOR = new Creator();

    @c("amountAttributed")
    @l
    private final AttributedText amountAttributed;

    @c("amountPenny")
    private final long amountPenny;

    @c("extraInfoUri")
    @l
    private final DeepLink deeplink;

    @c("helpContent")
    @l
    private final DetailsHelpContent helpContent;

    @c("label")
    @k
    private final AttributedText label;

    @c("value")
    @k
    private final String value;

    @c("withHelpIcon")
    @l
    private final Boolean withHelpIcon;

    /* compiled from: DeliverySummarySlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FbsFeeBlock> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FbsFeeBlock createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            long j12 = parcel.readLong();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(FbsFeeBlock.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(FbsFeeBlock.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FbsFeeBlock(string, j12, attributedText, attributedText2, boolValueOf, parcel.readInt() != 0 ? DetailsHelpContent.CREATOR.createFromParcel(parcel) : null, (DeepLink) parcel.readParcelable(FbsFeeBlock.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FbsFeeBlock[] newArray(int i12) {
            return new FbsFeeBlock[i12];
        }
    }

    public FbsFeeBlock(@k String str, long j12, @k AttributedText attributedText, @l AttributedText attributedText2, @l Boolean bool, @l DetailsHelpContent detailsHelpContent, @l DeepLink deepLink) {
        this.value = str;
        this.amountPenny = j12;
        this.label = attributedText;
        this.amountAttributed = attributedText2;
        this.withHelpIcon = bool;
        this.helpContent = detailsHelpContent;
        this.deeplink = deepLink;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final AttributedText getAmountAttributed() {
        return this.amountAttributed;
    }

    public final long getAmountPenny() {
        return this.amountPenny;
    }

    @l
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    public final DetailsHelpContent getHelpContent() {
        return this.helpContent;
    }

    @k
    public final AttributedText getLabel() {
        return this.label;
    }

    @k
    public final String getValue() {
        return this.value;
    }

    @l
    public final Boolean getWithHelpIcon() {
        return this.withHelpIcon;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.value);
        parcel.writeLong(this.amountPenny);
        parcel.writeParcelable(this.label, flags);
        parcel.writeParcelable(this.amountAttributed, flags);
        Boolean bool = this.withHelpIcon;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        DetailsHelpContent detailsHelpContent = this.helpContent;
        if (detailsHelpContent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            detailsHelpContent.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.deeplink, flags);
    }

    public /* synthetic */ FbsFeeBlock(String str, long j12, AttributedText attributedText, AttributedText attributedText2, Boolean bool, DetailsHelpContent detailsHelpContent, DeepLink deepLink, int i12, C42822w c42822w) {
        this(str, j12, attributedText, (i12 & 8) != 0 ? null : attributedText2, (i12 & 16) != 0 ? null : bool, (i12 & 32) != 0 ? null : detailsHelpContent, (i12 & 64) != 0 ? null : deepLink);
    }
}
