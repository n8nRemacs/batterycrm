package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: KeywordsParameter.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J<\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b\u0003\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u0013¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/KeywordDisplaying;", "Landroid/os/Parcelable;", "", "isVisible", "", ChannelContext.Item.PLACEHOLDER, "Lcom/avito/android/remote/model/category_parameters/Badge;", "badge", "Lcom/avito/android/deep_linking/links/DeepLink;", "titleTipAction", "<init>", "(ZLjava/lang/String;Lcom/avito/android/remote/model/category_parameters/Badge;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "()Lcom/avito/android/remote/model/category_parameters/Badge;", "component4", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(ZLjava/lang/String;Lcom/avito/android/remote/model/category_parameters/Badge;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/category_parameters/KeywordDisplaying;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "Ljava/lang/String;", "getPlaceholder", "Lcom/avito/android/remote/model/category_parameters/Badge;", "getBadge", "Lcom/avito/android/deep_linking/links/DeepLink;", "getTitleTipAction", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class KeywordDisplaying implements Parcelable {

    @k
    public static final Parcelable.Creator<KeywordDisplaying> CREATOR = new Creator();

    @c("badge")
    @l
    private final Badge badge;

    @c("visible")
    private final boolean isVisible;

    @c(ChannelContext.Item.PLACEHOLDER)
    @k
    private final String placeholder;

    @c("titleTipAction")
    @l
    private final DeepLink titleTipAction;

    /* compiled from: KeywordsParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<KeywordDisplaying> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final KeywordDisplaying createFromParcel(@k Parcel parcel) {
            return new KeywordDisplaying(parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Badge.CREATOR.createFromParcel(parcel), (DeepLink) parcel.readParcelable(KeywordDisplaying.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final KeywordDisplaying[] newArray(int i12) {
            return new KeywordDisplaying[i12];
        }
    }

    public KeywordDisplaying(boolean z12, @k String str, @l Badge badge, @l DeepLink deepLink) {
        this.isVisible = z12;
        this.placeholder = str;
        this.badge = badge;
        this.titleTipAction = deepLink;
    }

    public static /* synthetic */ KeywordDisplaying copy$default(KeywordDisplaying keywordDisplaying, boolean z12, String str, Badge badge, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z12 = keywordDisplaying.isVisible;
        }
        if ((i12 & 2) != 0) {
            str = keywordDisplaying.placeholder;
        }
        if ((i12 & 4) != 0) {
            badge = keywordDisplaying.badge;
        }
        if ((i12 & 8) != 0) {
            deepLink = keywordDisplaying.titleTipAction;
        }
        return keywordDisplaying.copy(z12, str, badge, deepLink);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Badge getBadge() {
        return this.badge;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final DeepLink getTitleTipAction() {
        return this.titleTipAction;
    }

    @k
    public final KeywordDisplaying copy(boolean isVisible, @k String placeholder, @l Badge badge, @l DeepLink titleTipAction) {
        return new KeywordDisplaying(isVisible, placeholder, badge, titleTipAction);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeywordDisplaying)) {
            return false;
        }
        KeywordDisplaying keywordDisplaying = (KeywordDisplaying) other;
        return this.isVisible == keywordDisplaying.isVisible && L.f(this.placeholder, keywordDisplaying.placeholder) && L.f(this.badge, keywordDisplaying.badge) && L.f(this.titleTipAction, keywordDisplaying.titleTipAction);
    }

    @l
    public final Badge getBadge() {
        return this.badge;
    }

    @k
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @l
    public final DeepLink getTitleTipAction() {
        return this.titleTipAction;
    }

    public int hashCode() {
        int iD2 = H.d(Boolean.hashCode(this.isVisible) * 31, 31, this.placeholder);
        Badge badge = this.badge;
        int iHashCode = (iD2 + (badge == null ? 0 : badge.hashCode())) * 31;
        DeepLink deepLink = this.titleTipAction;
        return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("KeywordDisplaying(isVisible=");
        sb2.append(this.isVisible);
        sb2.append(", placeholder=");
        sb2.append(this.placeholder);
        sb2.append(", badge=");
        sb2.append(this.badge);
        sb2.append(", titleTipAction=");
        return a.v(sb2, this.titleTipAction, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.isVisible ? 1 : 0);
        parcel.writeString(this.placeholder);
        Badge badge = this.badge;
        if (badge == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            badge.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.titleTipAction, flags);
    }

    public /* synthetic */ KeywordDisplaying(boolean z12, String str, Badge badge, DeepLink deepLink, int i12, C42822w c42822w) {
        this(z12, str, (i12 & 4) != 0 ? null : badge, (i12 & 8) != 0 ? null : deepLink);
    }
}
