package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FavoriteItemsWidgets.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJd\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\"\u0010\u001dJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b'\u0010(R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b.\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b0\u0010\u000eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b1\u0010\u000e¨\u00062"}, d2 = {"Lcom/avito/android/remote/model/ActionsWidget;", "Landroid/os/Parcelable;", "", "delete", "share", "Lcom/avito/android/deep_linking/links/DeepLink;", "edit", "adding", "like", "canPublish", "canUnpublish", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/ActionsWidget;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "getDelete", "getShare", "Lcom/avito/android/deep_linking/links/DeepLink;", "getEdit", "getAdding", "getLike", "getCanPublish", "getCanUnpublish", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ActionsWidget implements Parcelable {

    @k
    public static final Parcelable.Creator<ActionsWidget> CREATOR = new Creator();

    @c("adding")
    @l
    private final DeepLink adding;

    @c("publish")
    @l
    private final Boolean canPublish;

    @c("unpublish")
    @l
    private final Boolean canUnpublish;

    @c("delete")
    @l
    private final Boolean delete;

    @c("edit")
    @l
    private final DeepLink edit;

    @c("addToFavorite")
    @l
    private final Boolean like;

    @c("share")
    @l
    private final Boolean share;

    /* compiled from: FavoriteItemsWidgets.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ActionsWidget> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ActionsWidget createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            DeepLink deepLink = (DeepLink) parcel.readParcelable(ActionsWidget.class.getClassLoader());
            DeepLink deepLink2 = (DeepLink) parcel.readParcelable(ActionsWidget.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ActionsWidget(boolValueOf, boolValueOf2, deepLink, deepLink2, boolValueOf3, boolValueOf4, boolValueOf5);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ActionsWidget[] newArray(int i12) {
            return new ActionsWidget[i12];
        }
    }

    public ActionsWidget(@l Boolean bool, @l Boolean bool2, @l DeepLink deepLink, @l DeepLink deepLink2, @l Boolean bool3, @l Boolean bool4, @l Boolean bool5) {
        this.delete = bool;
        this.share = bool2;
        this.edit = deepLink;
        this.adding = deepLink2;
        this.like = bool3;
        this.canPublish = bool4;
        this.canUnpublish = bool5;
    }

    public static /* synthetic */ ActionsWidget copy$default(ActionsWidget actionsWidget, Boolean bool, Boolean bool2, DeepLink deepLink, DeepLink deepLink2, Boolean bool3, Boolean bool4, Boolean bool5, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            bool = actionsWidget.delete;
        }
        if ((i12 & 2) != 0) {
            bool2 = actionsWidget.share;
        }
        Boolean bool6 = bool2;
        if ((i12 & 4) != 0) {
            deepLink = actionsWidget.edit;
        }
        DeepLink deepLink3 = deepLink;
        if ((i12 & 8) != 0) {
            deepLink2 = actionsWidget.adding;
        }
        DeepLink deepLink4 = deepLink2;
        if ((i12 & 16) != 0) {
            bool3 = actionsWidget.like;
        }
        Boolean bool7 = bool3;
        if ((i12 & 32) != 0) {
            bool4 = actionsWidget.canPublish;
        }
        Boolean bool8 = bool4;
        if ((i12 & 64) != 0) {
            bool5 = actionsWidget.canUnpublish;
        }
        return actionsWidget.copy(bool, bool6, deepLink3, deepLink4, bool7, bool8, bool5);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Boolean getDelete() {
        return this.delete;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Boolean getShare() {
        return this.share;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final DeepLink getEdit() {
        return this.edit;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final DeepLink getAdding() {
        return this.adding;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Boolean getLike() {
        return this.like;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Boolean getCanPublish() {
        return this.canPublish;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Boolean getCanUnpublish() {
        return this.canUnpublish;
    }

    @k
    public final ActionsWidget copy(@l Boolean delete, @l Boolean share, @l DeepLink edit, @l DeepLink adding, @l Boolean like, @l Boolean canPublish, @l Boolean canUnpublish) {
        return new ActionsWidget(delete, share, edit, adding, like, canPublish, canUnpublish);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionsWidget)) {
            return false;
        }
        ActionsWidget actionsWidget = (ActionsWidget) other;
        return L.f(this.delete, actionsWidget.delete) && L.f(this.share, actionsWidget.share) && L.f(this.edit, actionsWidget.edit) && L.f(this.adding, actionsWidget.adding) && L.f(this.like, actionsWidget.like) && L.f(this.canPublish, actionsWidget.canPublish) && L.f(this.canUnpublish, actionsWidget.canUnpublish);
    }

    @l
    public final DeepLink getAdding() {
        return this.adding;
    }

    @l
    public final Boolean getCanPublish() {
        return this.canPublish;
    }

    @l
    public final Boolean getCanUnpublish() {
        return this.canUnpublish;
    }

    @l
    public final Boolean getDelete() {
        return this.delete;
    }

    @l
    public final DeepLink getEdit() {
        return this.edit;
    }

    @l
    public final Boolean getLike() {
        return this.like;
    }

    @l
    public final Boolean getShare() {
        return this.share;
    }

    public int hashCode() {
        Boolean bool = this.delete;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.share;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        DeepLink deepLink = this.edit;
        int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        DeepLink deepLink2 = this.adding;
        int iHashCode4 = (iHashCode3 + (deepLink2 == null ? 0 : deepLink2.hashCode())) * 31;
        Boolean bool3 = this.like;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.canPublish;
        int iHashCode6 = (iHashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.canUnpublish;
        return iHashCode6 + (bool5 != null ? bool5.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ActionsWidget(delete=");
        sb2.append(this.delete);
        sb2.append(", share=");
        sb2.append(this.share);
        sb2.append(", edit=");
        sb2.append(this.edit);
        sb2.append(", adding=");
        sb2.append(this.adding);
        sb2.append(", like=");
        sb2.append(this.like);
        sb2.append(", canPublish=");
        sb2.append(this.canPublish);
        sb2.append(", canUnpublish=");
        return C0.g(sb2, this.canUnpublish, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Boolean bool = this.delete;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.share;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        parcel.writeParcelable(this.edit, flags);
        parcel.writeParcelable(this.adding, flags);
        Boolean bool3 = this.like;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
        Boolean bool4 = this.canPublish;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool4);
        }
        Boolean bool5 = this.canUnpublish;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool5);
        }
    }
}
