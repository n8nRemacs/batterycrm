package com.avito.android.remote.model.category_parameters.slot.delivery_summary_edit;

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

/* compiled from: CptEstimateEditResult.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b&\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary_edit/FeeBlock;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "label", "", "amountPenny", "", "value", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "amountAttributed", "", "withHelpIcon", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary_edit/HelpContent;", "helpContent", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;JLjava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary_edit/HelpContent;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getLabel", "()Lcom/avito/android/remote/model/text/AttributedText;", "J", "getAmountPenny", "()J", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getAmountAttributed", "Ljava/lang/Boolean;", "getWithHelpIcon", "()Ljava/lang/Boolean;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary_edit/HelpContent;", "getHelpContent", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary_edit/HelpContent;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FeeBlock implements Parcelable {

    @k
    public static final Parcelable.Creator<FeeBlock> CREATOR = new Creator();

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
    private final HelpContent helpContent;

    @c("label")
    @k
    private final AttributedText label;

    @c("value")
    @k
    private final String value;

    @c("withHelpIcon")
    @l
    private final Boolean withHelpIcon;

    /* compiled from: CptEstimateEditResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FeeBlock> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FeeBlock createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(FeeBlock.class.getClassLoader());
            long j12 = parcel.readLong();
            String string = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(FeeBlock.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(FeeBlock.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FeeBlock(attributedText, j12, string, deepLink, attributedText2, boolValueOf, parcel.readInt() != 0 ? HelpContent.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FeeBlock[] newArray(int i12) {
            return new FeeBlock[i12];
        }
    }

    public FeeBlock(@k AttributedText attributedText, long j12, @k String str, @l DeepLink deepLink, @l AttributedText attributedText2, @l Boolean bool, @l HelpContent helpContent) {
        this.label = attributedText;
        this.amountPenny = j12;
        this.value = str;
        this.deeplink = deepLink;
        this.amountAttributed = attributedText2;
        this.withHelpIcon = bool;
        this.helpContent = helpContent;
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
    public final HelpContent getHelpContent() {
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
        parcel.writeParcelable(this.label, flags);
        parcel.writeLong(this.amountPenny);
        parcel.writeString(this.value);
        parcel.writeParcelable(this.deeplink, flags);
        parcel.writeParcelable(this.amountAttributed, flags);
        Boolean bool = this.withHelpIcon;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        HelpContent helpContent = this.helpContent;
        if (helpContent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            helpContent.writeToParcel(parcel, flags);
        }
    }
}
