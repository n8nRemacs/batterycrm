package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Portfolio.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/PortfolioAction;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "Lcom/avito/android/remote/model/ActionType;", "actionType", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/ActionType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "()Lcom/avito/android/remote/model/ActionType;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/ActionType;)Lcom/avito/android/remote/model/PortfolioAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "Lcom/avito/android/remote/model/ActionType;", "getActionType", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PortfolioAction implements Parcelable {

    @k
    public static final Parcelable.Creator<PortfolioAction> CREATOR = new Creator();

    @c("actionType")
    @l
    private final ActionType actionType;

    @c("title")
    @l
    private final String title;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink uri;

    /* compiled from: Portfolio.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PortfolioAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PortfolioAction createFromParcel(@k Parcel parcel) {
            return new PortfolioAction(parcel.readString(), (DeepLink) parcel.readParcelable(PortfolioAction.class.getClassLoader()), parcel.readInt() == 0 ? null : ActionType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PortfolioAction[] newArray(int i12) {
            return new PortfolioAction[i12];
        }
    }

    public PortfolioAction(@l String str, @l DeepLink deepLink, @l ActionType actionType) {
        this.title = str;
        this.uri = deepLink;
        this.actionType = actionType;
    }

    public static /* synthetic */ PortfolioAction copy$default(PortfolioAction portfolioAction, String str, DeepLink deepLink, ActionType actionType, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = portfolioAction.title;
        }
        if ((i12 & 2) != 0) {
            deepLink = portfolioAction.uri;
        }
        if ((i12 & 4) != 0) {
            actionType = portfolioAction.actionType;
        }
        return portfolioAction.copy(str, deepLink, actionType);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final ActionType getActionType() {
        return this.actionType;
    }

    @k
    public final PortfolioAction copy(@l String title, @l DeepLink uri, @l ActionType actionType) {
        return new PortfolioAction(title, uri, actionType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PortfolioAction)) {
            return false;
        }
        PortfolioAction portfolioAction = (PortfolioAction) other;
        return L.f(this.title, portfolioAction.title) && L.f(this.uri, portfolioAction.uri) && this.actionType == portfolioAction.actionType;
    }

    @l
    public final ActionType getActionType() {
        return this.actionType;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final DeepLink getUri() {
        return this.uri;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        DeepLink deepLink = this.uri;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        ActionType actionType = this.actionType;
        return iHashCode2 + (actionType != null ? actionType.hashCode() : 0);
    }

    @k
    public String toString() {
        return "PortfolioAction(title=" + this.title + ", uri=" + this.uri + ", actionType=" + this.actionType + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.uri, flags);
        ActionType actionType = this.actionType;
        if (actionType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(actionType.name());
        }
    }
}
