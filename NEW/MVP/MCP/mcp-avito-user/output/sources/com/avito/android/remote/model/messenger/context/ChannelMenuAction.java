package com.avito.android.remote.model.messenger.context;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.ActionConfirmation;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ChannelMenuAction.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJH\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b*\u0010\rR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b-\u0010\r¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/messenger/context/ChannelMenuAction;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "icon", "Lcom/avito/android/remote/model/messenger/ActionConfirmation;", "confirmation", "rawDeepLink", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/remote/model/messenger/ActionConfirmation;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "component4", "()Lcom/avito/android/remote/model/messenger/ActionConfirmation;", "component5", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/remote/model/messenger/ActionConfirmation;Ljava/lang/String;)Lcom/avito/android/remote/model/messenger/context/ChannelMenuAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "getIcon", "Lcom/avito/android/remote/model/messenger/ActionConfirmation;", "getConfirmation", "getRawDeepLink", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ChannelMenuAction implements Parcelable {

    @k
    public static final Parcelable.Creator<ChannelMenuAction> CREATOR = new Creator();

    @l
    private final ActionConfirmation confirmation;

    @k
    private final DeepLink deepLink;

    @l
    private final String icon;

    @l
    private final String rawDeepLink;

    @k
    private final String title;

    /* compiled from: ChannelMenuAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ChannelMenuAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ChannelMenuAction createFromParcel(@k Parcel parcel) {
            return new ChannelMenuAction(parcel.readString(), (DeepLink) parcel.readParcelable(ChannelMenuAction.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : ActionConfirmation.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ChannelMenuAction[] newArray(int i12) {
            return new ChannelMenuAction[i12];
        }
    }

    public ChannelMenuAction(@k String str, @k DeepLink deepLink, @l String str2, @l ActionConfirmation actionConfirmation, @l String str3) {
        this.title = str;
        this.deepLink = deepLink;
        this.icon = str2;
        this.confirmation = actionConfirmation;
        this.rawDeepLink = str3;
    }

    public static /* synthetic */ ChannelMenuAction copy$default(ChannelMenuAction channelMenuAction, String str, DeepLink deepLink, String str2, ActionConfirmation actionConfirmation, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = channelMenuAction.title;
        }
        if ((i12 & 2) != 0) {
            deepLink = channelMenuAction.deepLink;
        }
        DeepLink deepLink2 = deepLink;
        if ((i12 & 4) != 0) {
            str2 = channelMenuAction.icon;
        }
        String str4 = str2;
        if ((i12 & 8) != 0) {
            actionConfirmation = channelMenuAction.confirmation;
        }
        ActionConfirmation actionConfirmation2 = actionConfirmation;
        if ((i12 & 16) != 0) {
            str3 = channelMenuAction.rawDeepLink;
        }
        return channelMenuAction.copy(str, deepLink2, str4, actionConfirmation2, str3);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final ActionConfirmation getConfirmation() {
        return this.confirmation;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getRawDeepLink() {
        return this.rawDeepLink;
    }

    @k
    public final ChannelMenuAction copy(@k String title, @k DeepLink deepLink, @l String icon, @l ActionConfirmation confirmation, @l String rawDeepLink) {
        return new ChannelMenuAction(title, deepLink, icon, confirmation, rawDeepLink);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelMenuAction)) {
            return false;
        }
        ChannelMenuAction channelMenuAction = (ChannelMenuAction) other;
        return L.f(this.title, channelMenuAction.title) && L.f(this.deepLink, channelMenuAction.deepLink) && L.f(this.icon, channelMenuAction.icon) && L.f(this.confirmation, channelMenuAction.confirmation) && L.f(this.rawDeepLink, channelMenuAction.rawDeepLink);
    }

    @l
    public final ActionConfirmation getConfirmation() {
        return this.confirmation;
    }

    @k
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    public final String getIcon() {
        return this.icon;
    }

    @l
    public final String getRawDeepLink() {
        return this.rawDeepLink;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iE2 = a.e(this.deepLink, this.title.hashCode() * 31, 31);
        String str = this.icon;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        ActionConfirmation actionConfirmation = this.confirmation;
        int iHashCode2 = (iHashCode + (actionConfirmation == null ? 0 : actionConfirmation.hashCode())) * 31;
        String str2 = this.rawDeepLink;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChannelMenuAction(title=");
        sb2.append(this.title);
        sb2.append(", deepLink=");
        sb2.append(this.deepLink);
        sb2.append(", icon=");
        sb2.append(this.icon);
        sb2.append(", confirmation=");
        sb2.append(this.confirmation);
        sb2.append(", rawDeepLink=");
        return C22026a.c(sb2, this.rawDeepLink, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.deepLink, flags);
        parcel.writeString(this.icon);
        ActionConfirmation actionConfirmation = this.confirmation;
        if (actionConfirmation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actionConfirmation.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.rawDeepLink);
    }

    public /* synthetic */ ChannelMenuAction(String str, DeepLink deepLink, String str2, ActionConfirmation actionConfirmation, String str3, int i12, C42822w c42822w) {
        this(str, deepLink, str2, actionConfirmation, (i12 & 16) != 0 ? null : str3);
    }
}
