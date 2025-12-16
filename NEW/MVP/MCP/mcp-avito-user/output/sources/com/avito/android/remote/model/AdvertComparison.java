package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertComparison.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010!\u001a\u0004\b\u0003\u0010\n\"\u0004\b\"\u0010#R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b$\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\r¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/AdvertComparison;", "Landroid/os/Parcelable;", "", "isAdded", "canBeAdded", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/AdvertComparison;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "setAdded", "(Ljava/lang/Boolean;)V", "getCanBeAdded", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdvertComparison implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertComparison> CREATOR = new Creator();

    @c("canBeAdded")
    @l
    private final Boolean canBeAdded;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink deepLink;

    @c("isAdded")
    @l
    private Boolean isAdded;

    /* compiled from: AdvertComparison.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertComparison> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertComparison createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AdvertComparison(boolValueOf, boolValueOf2, (DeepLink) parcel.readParcelable(AdvertComparison.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertComparison[] newArray(int i12) {
            return new AdvertComparison[i12];
        }
    }

    public AdvertComparison() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ AdvertComparison copy$default(AdvertComparison advertComparison, Boolean bool, Boolean bool2, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            bool = advertComparison.isAdded;
        }
        if ((i12 & 2) != 0) {
            bool2 = advertComparison.canBeAdded;
        }
        if ((i12 & 4) != 0) {
            deepLink = advertComparison.deepLink;
        }
        return advertComparison.copy(bool, bool2, deepLink);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Boolean getIsAdded() {
        return this.isAdded;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Boolean getCanBeAdded() {
        return this.canBeAdded;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @k
    public final AdvertComparison copy(@l Boolean isAdded, @l Boolean canBeAdded, @l DeepLink deepLink) {
        return new AdvertComparison(isAdded, canBeAdded, deepLink);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvertComparison)) {
            return false;
        }
        AdvertComparison advertComparison = (AdvertComparison) other;
        return L.f(this.isAdded, advertComparison.isAdded) && L.f(this.canBeAdded, advertComparison.canBeAdded) && L.f(this.deepLink, advertComparison.deepLink);
    }

    @l
    public final Boolean getCanBeAdded() {
        return this.canBeAdded;
    }

    @l
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    public int hashCode() {
        Boolean bool = this.isAdded;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.canBeAdded;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        DeepLink deepLink = this.deepLink;
        return iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @l
    public final Boolean isAdded() {
        return this.isAdded;
    }

    public final void setAdded(@l Boolean bool) {
        this.isAdded = bool;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertComparison(isAdded=");
        sb2.append(this.isAdded);
        sb2.append(", canBeAdded=");
        sb2.append(this.canBeAdded);
        sb2.append(", deepLink=");
        return a.v(sb2, this.deepLink, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Boolean bool = this.isAdded;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.canBeAdded;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        parcel.writeParcelable(this.deepLink, flags);
    }

    public AdvertComparison(@l Boolean bool, @l Boolean bool2, @l DeepLink deepLink) {
        this.isAdded = bool;
        this.canBeAdded = bool2;
        this.deepLink = deepLink;
    }

    public /* synthetic */ AdvertComparison(Boolean bool, Boolean bool2, DeepLink deepLink, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : bool, (i12 & 2) != 0 ? null : bool2, (i12 & 4) != 0 ? null : deepLink);
    }
}
