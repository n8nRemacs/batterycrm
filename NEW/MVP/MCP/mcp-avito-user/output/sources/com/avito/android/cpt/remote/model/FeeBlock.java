package com.avito.android.cpt.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ActivationEstimateResponseV2.kt */
@d
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/cpt/remote/model/FeeBlock;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "label", "", "amountPenny", "", "value", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;JLjava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "J", "c", "()J", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FeeBlock implements Parcelable {

    @k
    public static final Parcelable.Creator<FeeBlock> CREATOR = new a();

    @c("amountPenny")
    private final long amountPenny;

    @c("extraInfoUri")
    @l
    private final DeepLink deeplink;

    @c("label")
    @k
    private final AttributedText label;

    @c("value")
    @k
    private final String value;

    /* compiled from: ActivationEstimateResponseV2.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FeeBlock> {
        @Override // android.os.Parcelable.Creator
        public final FeeBlock createFromParcel(Parcel parcel) {
            return new FeeBlock((AttributedText) parcel.readParcelable(FeeBlock.class.getClassLoader()), parcel.readLong(), parcel.readString(), (DeepLink) parcel.readParcelable(FeeBlock.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final FeeBlock[] newArray(int i12) {
            return new FeeBlock[i12];
        }
    }

    public FeeBlock(@k AttributedText attributedText, long j12, @k String str, @l DeepLink deepLink) {
        this.label = attributedText;
        this.amountPenny = j12;
        this.value = str;
        this.deeplink = deepLink;
    }

    /* renamed from: c, reason: from getter */
    public final long getAmountPenny() {
        return this.amountPenny;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final AttributedText getLabel() {
        return this.label;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @k
    public final String getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.label, i12);
        parcel.writeLong(this.amountPenny);
        parcel.writeString(this.value);
        parcel.writeParcelable(this.deeplink, i12);
    }
}
