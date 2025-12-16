package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RecallMeRequest.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\rR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010%\u001a\u0004\b\u0007\u0010\u000f\"\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/RecallMeParams;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "isButtonWasShown", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "()Z", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Z)Lcom/avito/android/remote/model/RecallMeParams;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "Z", "setButtonWasShown", "(Z)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RecallMeParams implements Parcelable {

    @k
    public static final Parcelable.Creator<RecallMeParams> CREATOR = new Creator();

    @c(Constants.DEEPLINK)
    @l
    private final DeepLink deeplink;
    private transient boolean isButtonWasShown;

    @c("title")
    @l
    private final String title;

    /* compiled from: RecallMeRequest.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RecallMeParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RecallMeParams createFromParcel(@k Parcel parcel) {
            return new RecallMeParams(parcel.readString(), (DeepLink) parcel.readParcelable(RecallMeParams.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RecallMeParams[] newArray(int i12) {
            return new RecallMeParams[i12];
        }
    }

    public RecallMeParams(@l String str, @l DeepLink deepLink, boolean z12) {
        this.title = str;
        this.deeplink = deepLink;
        this.isButtonWasShown = z12;
    }

    public static /* synthetic */ RecallMeParams copy$default(RecallMeParams recallMeParams, String str, DeepLink deepLink, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = recallMeParams.title;
        }
        if ((i12 & 2) != 0) {
            deepLink = recallMeParams.deeplink;
        }
        if ((i12 & 4) != 0) {
            z12 = recallMeParams.isButtonWasShown;
        }
        return recallMeParams.copy(str, deepLink, z12);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsButtonWasShown() {
        return this.isButtonWasShown;
    }

    @k
    public final RecallMeParams copy(@l String title, @l DeepLink deeplink, boolean isButtonWasShown) {
        return new RecallMeParams(title, deeplink, isButtonWasShown);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecallMeParams)) {
            return false;
        }
        RecallMeParams recallMeParams = (RecallMeParams) other;
        return L.f(this.title, recallMeParams.title) && L.f(this.deeplink, recallMeParams.deeplink) && this.isButtonWasShown == recallMeParams.isButtonWasShown;
    }

    @l
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        DeepLink deepLink = this.deeplink;
        return Boolean.hashCode(this.isButtonWasShown) + ((iHashCode + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
    }

    public final boolean isButtonWasShown() {
        return this.isButtonWasShown;
    }

    public final void setButtonWasShown(boolean z12) {
        this.isButtonWasShown = z12;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RecallMeParams(title=");
        sb2.append(this.title);
        sb2.append(", deeplink=");
        sb2.append(this.deeplink);
        sb2.append(", isButtonWasShown=");
        return r.x(sb2, this.isButtonWasShown, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.deeplink, flags);
        parcel.writeInt(this.isButtonWasShown ? 1 : 0);
    }

    public /* synthetic */ RecallMeParams(String str, DeepLink deepLink, boolean z12, int i12, C42822w c42822w) {
        this(str, deepLink, (i12 & 4) != 0 ? false : z12);
    }
}
