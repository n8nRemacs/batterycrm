package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FavoritesToast.kt */
@d
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0013¨\u00060"}, d2 = {"Lcom/avito/android/remote/model/FavoritesToast;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/remote/model/FavoritesToastAction;", "action", "Lcom/avito/android/deep_linking/links/DeepLink;", "onShow", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/FavoritesToastAction;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "()Lcom/avito/android/remote/model/UniversalImage;", "component3", "()Lcom/avito/android/remote/model/FavoritesToastAction;", "component4", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/FavoritesToastAction;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/FavoritesToast;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getText", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "Lcom/avito/android/remote/model/FavoritesToastAction;", "getAction", "Lcom/avito/android/deep_linking/links/DeepLink;", "getOnShow", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FavoritesToast implements Parcelable {

    @k
    public static final Parcelable.Creator<FavoritesToast> CREATOR = new Creator();

    @c("action")
    @l
    private final FavoritesToastAction action;

    @c("image")
    @l
    private final UniversalImage image;

    @c("onShow")
    @l
    private final DeepLink onShow;

    @c("text")
    @l
    private final AttributedText text;

    /* compiled from: FavoritesToast.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FavoritesToast> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FavoritesToast createFromParcel(@k Parcel parcel) {
            return new FavoritesToast((AttributedText) parcel.readParcelable(FavoritesToast.class.getClassLoader()), (UniversalImage) parcel.readParcelable(FavoritesToast.class.getClassLoader()), parcel.readInt() == 0 ? null : FavoritesToastAction.CREATOR.createFromParcel(parcel), (DeepLink) parcel.readParcelable(FavoritesToast.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FavoritesToast[] newArray(int i12) {
            return new FavoritesToast[i12];
        }
    }

    public FavoritesToast(@l AttributedText attributedText, @l UniversalImage universalImage, @l FavoritesToastAction favoritesToastAction, @l DeepLink deepLink) {
        this.text = attributedText;
        this.image = universalImage;
        this.action = favoritesToastAction;
        this.onShow = deepLink;
    }

    public static /* synthetic */ FavoritesToast copy$default(FavoritesToast favoritesToast, AttributedText attributedText, UniversalImage universalImage, FavoritesToastAction favoritesToastAction, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            attributedText = favoritesToast.text;
        }
        if ((i12 & 2) != 0) {
            universalImage = favoritesToast.image;
        }
        if ((i12 & 4) != 0) {
            favoritesToastAction = favoritesToast.action;
        }
        if ((i12 & 8) != 0) {
            deepLink = favoritesToast.onShow;
        }
        return favoritesToast.copy(attributedText, universalImage, favoritesToastAction, deepLink);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final FavoritesToastAction getAction() {
        return this.action;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final DeepLink getOnShow() {
        return this.onShow;
    }

    @k
    public final FavoritesToast copy(@l AttributedText text, @l UniversalImage image, @l FavoritesToastAction action, @l DeepLink onShow) {
        return new FavoritesToast(text, image, action, onShow);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoritesToast)) {
            return false;
        }
        FavoritesToast favoritesToast = (FavoritesToast) other;
        return L.f(this.text, favoritesToast.text) && L.f(this.image, favoritesToast.image) && L.f(this.action, favoritesToast.action) && L.f(this.onShow, favoritesToast.onShow);
    }

    @l
    public final FavoritesToastAction getAction() {
        return this.action;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final DeepLink getOnShow() {
        return this.onShow;
    }

    @l
    public final AttributedText getText() {
        return this.text;
    }

    public int hashCode() {
        AttributedText attributedText = this.text;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        UniversalImage universalImage = this.image;
        int iHashCode2 = (iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        FavoritesToastAction favoritesToastAction = this.action;
        int iHashCode3 = (iHashCode2 + (favoritesToastAction == null ? 0 : favoritesToastAction.hashCode())) * 31;
        DeepLink deepLink = this.onShow;
        return iHashCode3 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FavoritesToast(text=");
        sb2.append(this.text);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", action=");
        sb2.append(this.action);
        sb2.append(", onShow=");
        return a.v(sb2, this.onShow, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.text, flags);
        parcel.writeParcelable(this.image, flags);
        FavoritesToastAction favoritesToastAction = this.action;
        if (favoritesToastAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            favoritesToastAction.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.onShow, flags);
    }
}
