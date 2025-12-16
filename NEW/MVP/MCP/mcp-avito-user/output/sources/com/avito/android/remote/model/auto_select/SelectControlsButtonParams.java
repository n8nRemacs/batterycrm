package com.avito.android.remote.model.auto_select;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectControls.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJT\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b*\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b+\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b,\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b-\u0010\r¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/auto_select/SelectControlsButtonParams;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "onShowDeeplink", "icon", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "secondaryText", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/auto_select/SelectControlsButtonParams;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "getOnShowDeeplink", "getIcon", "getStyle", "getSecondaryText", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SelectControlsButtonParams implements Parcelable {

    @k
    public static final Parcelable.Creator<SelectControlsButtonParams> CREATOR = new Creator();

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink deepLink;

    @c("icon")
    @l
    private final String icon;

    @c("onShowDeeplink")
    @l
    private final DeepLink onShowDeeplink;

    @c("secondaryText")
    @l
    private final String secondaryText;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final String style;

    @c("text")
    @k
    private final String text;

    /* compiled from: AutoSelectControls.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SelectControlsButtonParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SelectControlsButtonParams createFromParcel(@k Parcel parcel) {
            return new SelectControlsButtonParams(parcel.readString(), (DeepLink) parcel.readParcelable(SelectControlsButtonParams.class.getClassLoader()), (DeepLink) parcel.readParcelable(SelectControlsButtonParams.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SelectControlsButtonParams[] newArray(int i12) {
            return new SelectControlsButtonParams[i12];
        }
    }

    public SelectControlsButtonParams(@k String str, @k DeepLink deepLink, @l DeepLink deepLink2, @l String str2, @l String str3, @l String str4) {
        this.text = str;
        this.deepLink = deepLink;
        this.onShowDeeplink = deepLink2;
        this.icon = str2;
        this.style = str3;
        this.secondaryText = str4;
    }

    public static /* synthetic */ SelectControlsButtonParams copy$default(SelectControlsButtonParams selectControlsButtonParams, String str, DeepLink deepLink, DeepLink deepLink2, String str2, String str3, String str4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = selectControlsButtonParams.text;
        }
        if ((i12 & 2) != 0) {
            deepLink = selectControlsButtonParams.deepLink;
        }
        DeepLink deepLink3 = deepLink;
        if ((i12 & 4) != 0) {
            deepLink2 = selectControlsButtonParams.onShowDeeplink;
        }
        DeepLink deepLink4 = deepLink2;
        if ((i12 & 8) != 0) {
            str2 = selectControlsButtonParams.icon;
        }
        String str5 = str2;
        if ((i12 & 16) != 0) {
            str3 = selectControlsButtonParams.style;
        }
        String str6 = str3;
        if ((i12 & 32) != 0) {
            str4 = selectControlsButtonParams.secondaryText;
        }
        return selectControlsButtonParams.copy(str, deepLink3, deepLink4, str5, str6, str4);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final DeepLink getOnShowDeeplink() {
        return this.onShowDeeplink;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getSecondaryText() {
        return this.secondaryText;
    }

    @k
    public final SelectControlsButtonParams copy(@k String text, @k DeepLink deepLink, @l DeepLink onShowDeeplink, @l String icon, @l String style, @l String secondaryText) {
        return new SelectControlsButtonParams(text, deepLink, onShowDeeplink, icon, style, secondaryText);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectControlsButtonParams)) {
            return false;
        }
        SelectControlsButtonParams selectControlsButtonParams = (SelectControlsButtonParams) other;
        return L.f(this.text, selectControlsButtonParams.text) && L.f(this.deepLink, selectControlsButtonParams.deepLink) && L.f(this.onShowDeeplink, selectControlsButtonParams.onShowDeeplink) && L.f(this.icon, selectControlsButtonParams.icon) && L.f(this.style, selectControlsButtonParams.style) && L.f(this.secondaryText, selectControlsButtonParams.secondaryText);
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
    public final DeepLink getOnShowDeeplink() {
        return this.onShowDeeplink;
    }

    @l
    public final String getSecondaryText() {
        return this.secondaryText;
    }

    @l
    public final String getStyle() {
        return this.style;
    }

    @k
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iE2 = a.e(this.deepLink, this.text.hashCode() * 31, 31);
        DeepLink deepLink = this.onShowDeeplink;
        int iHashCode = (iE2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        String str = this.icon;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.style;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.secondaryText;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SelectControlsButtonParams(text=");
        sb2.append(this.text);
        sb2.append(", deepLink=");
        sb2.append(this.deepLink);
        sb2.append(", onShowDeeplink=");
        sb2.append(this.onShowDeeplink);
        sb2.append(", icon=");
        sb2.append(this.icon);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", secondaryText=");
        return C22026a.c(sb2, this.secondaryText, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.text);
        parcel.writeParcelable(this.deepLink, flags);
        parcel.writeParcelable(this.onShowDeeplink, flags);
        parcel.writeString(this.icon);
        parcel.writeString(this.style);
        parcel.writeString(this.secondaryText);
    }

    public /* synthetic */ SelectControlsButtonParams(String str, DeepLink deepLink, DeepLink deepLink2, String str2, String str3, String str4, int i12, C42822w c42822w) {
        this(str, deepLink, (i12 & 4) != 0 ? null : deepLink2, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? null : str4);
    }
}
