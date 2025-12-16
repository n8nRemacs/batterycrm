package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertAutoSelect.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0002)*B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0010¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/AdvertAutoSelect;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/avito/android/remote/model/AdvertAutoSelect$AutoSelectBenefit;", "benefits", "Lcom/avito/android/remote/model/AdvertAutoSelect$AutoSelectButton;", "button", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/AdvertAutoSelect$AutoSelectButton;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/avito/android/remote/model/AdvertAutoSelect$AutoSelectButton;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/AdvertAutoSelect$AutoSelectButton;)Lcom/avito/android/remote/model/AdvertAutoSelect;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getBenefits", "Lcom/avito/android/remote/model/AdvertAutoSelect$AutoSelectButton;", "getButton", "AutoSelectBenefit", "AutoSelectButton", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdvertAutoSelect implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertAutoSelect> CREATOR = new Creator();

    @c("benefits")
    @l
    private final List<AutoSelectBenefit> benefits;

    @c("button")
    @l
    private final AutoSelectButton button;

    @c("title")
    @l
    private final String title;

    /* compiled from: AdvertAutoSelect.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\r¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/AdvertAutoSelect$AutoSelectButton;", "Landroid/os/Parcelable;", "", "title", ContextActionHandler.Link.URL, "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/AdvertAutoSelect$AutoSelectButton;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getUrl", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AutoSelectButton implements Parcelable {

        @k
        public static final Parcelable.Creator<AutoSelectButton> CREATOR = new Creator();

        @c("title")
        @l
        private final String title;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink uri;

        @c(ContextActionHandler.Link.URL)
        @l
        private final String url;

        /* compiled from: AdvertAutoSelect.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AutoSelectButton> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AutoSelectButton createFromParcel(@k Parcel parcel) {
                return new AutoSelectButton(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(AutoSelectButton.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AutoSelectButton[] newArray(int i12) {
                return new AutoSelectButton[i12];
            }
        }

        public AutoSelectButton() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ AutoSelectButton copy$default(AutoSelectButton autoSelectButton, String str, String str2, DeepLink deepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = autoSelectButton.title;
            }
            if ((i12 & 2) != 0) {
                str2 = autoSelectButton.url;
            }
            if ((i12 & 4) != 0) {
                deepLink = autoSelectButton.uri;
            }
            return autoSelectButton.copy(str, str2, deepLink);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final DeepLink getUri() {
            return this.uri;
        }

        @k
        public final AutoSelectButton copy(@l String title, @l String url, @l DeepLink uri) {
            return new AutoSelectButton(title, url, uri);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AutoSelectButton)) {
                return false;
            }
            AutoSelectButton autoSelectButton = (AutoSelectButton) other;
            return L.f(this.title, autoSelectButton.title) && L.f(this.url, autoSelectButton.url) && L.f(this.uri, autoSelectButton.uri);
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @l
        public final DeepLink getUri() {
            return this.uri;
        }

        @l
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.url;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            DeepLink deepLink = this.uri;
            return iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("AutoSelectButton(title=");
            sb2.append(this.title);
            sb2.append(", url=");
            sb2.append(this.url);
            sb2.append(", uri=");
            return a.v(sb2, this.uri, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.url);
            parcel.writeParcelable(this.uri, flags);
        }

        public AutoSelectButton(@l String str, @l String str2, @l DeepLink deepLink) {
            this.title = str;
            this.url = str2;
            this.uri = deepLink;
        }

        public /* synthetic */ AutoSelectButton(String str, String str2, DeepLink deepLink, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : deepLink);
        }
    }

    /* compiled from: AdvertAutoSelect.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertAutoSelect> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertAutoSelect createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(AutoSelectBenefit.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new AdvertAutoSelect(string, arrayList, parcel.readInt() != 0 ? AutoSelectButton.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertAutoSelect[] newArray(int i12) {
            return new AdvertAutoSelect[i12];
        }
    }

    public AdvertAutoSelect() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdvertAutoSelect copy$default(AdvertAutoSelect advertAutoSelect, String str, List list, AutoSelectButton autoSelectButton, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = advertAutoSelect.title;
        }
        if ((i12 & 2) != 0) {
            list = advertAutoSelect.benefits;
        }
        if ((i12 & 4) != 0) {
            autoSelectButton = advertAutoSelect.button;
        }
        return advertAutoSelect.copy(str, list, autoSelectButton);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    public final List<AutoSelectBenefit> component2() {
        return this.benefits;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final AutoSelectButton getButton() {
        return this.button;
    }

    @k
    public final AdvertAutoSelect copy(@l String title, @l List<AutoSelectBenefit> benefits, @l AutoSelectButton button) {
        return new AdvertAutoSelect(title, benefits, button);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvertAutoSelect)) {
            return false;
        }
        AdvertAutoSelect advertAutoSelect = (AdvertAutoSelect) other;
        return L.f(this.title, advertAutoSelect.title) && L.f(this.benefits, advertAutoSelect.benefits) && L.f(this.button, advertAutoSelect.button);
    }

    @l
    public final List<AutoSelectBenefit> getBenefits() {
        return this.benefits;
    }

    @l
    public final AutoSelectButton getButton() {
        return this.button;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<AutoSelectBenefit> list = this.benefits;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        AutoSelectButton autoSelectButton = this.button;
        return iHashCode2 + (autoSelectButton != null ? autoSelectButton.hashCode() : 0);
    }

    @k
    public String toString() {
        return "AdvertAutoSelect(title=" + this.title + ", benefits=" + this.benefits + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        List<AutoSelectBenefit> list = this.benefits;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((AutoSelectBenefit) itA.next()).writeToParcel(parcel, flags);
            }
        }
        AutoSelectButton autoSelectButton = this.button;
        if (autoSelectButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            autoSelectButton.writeToParcel(parcel, flags);
        }
    }

    public AdvertAutoSelect(@l String str, @l List<AutoSelectBenefit> list, @l AutoSelectButton autoSelectButton) {
        this.title = str;
        this.benefits = list;
        this.button = autoSelectButton;
    }

    /* compiled from: AdvertAutoSelect.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/AdvertAutoSelect$AutoSelectBenefit;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/remote/model/AdvertAutoSelect$AutoSelectBenefit$LocalIcon;", "localIcon", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/AdvertAutoSelect$AutoSelectBenefit$LocalIcon;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/AdvertAutoSelect$AutoSelectBenefit$LocalIcon;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/AdvertAutoSelect$AutoSelectBenefit$LocalIcon;)Lcom/avito/android/remote/model/AdvertAutoSelect$AutoSelectBenefit;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Lcom/avito/android/remote/model/AdvertAutoSelect$AutoSelectBenefit$LocalIcon;", "getLocalIcon", "LocalIcon", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class AutoSelectBenefit implements Parcelable {

        @k
        public static final Parcelable.Creator<AutoSelectBenefit> CREATOR = new Creator();

        @c("localIcon")
        @l
        private final LocalIcon localIcon;

        @c("text")
        @k
        private final String text;

        /* compiled from: AdvertAutoSelect.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AutoSelectBenefit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AutoSelectBenefit createFromParcel(@k Parcel parcel) {
                return new AutoSelectBenefit(parcel.readString(), parcel.readInt() == 0 ? null : LocalIcon.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AutoSelectBenefit[] newArray(int i12) {
                return new AutoSelectBenefit[i12];
            }
        }

        /* compiled from: AdvertAutoSelect.kt */
        @d
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/AdvertAutoSelect$AutoSelectBenefit$LocalIcon;", "Landroid/os/Parcelable;", "", "name", "color", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/AdvertAutoSelect$AutoSelectBenefit$LocalIcon;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "getColor", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LocalIcon implements Parcelable {

            @k
            public static final Parcelable.Creator<LocalIcon> CREATOR = new Creator();

            @c("color")
            @l
            private final String color;

            @c("name")
            @k
            private final String name;

            /* compiled from: AdvertAutoSelect.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<LocalIcon> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final LocalIcon createFromParcel(@k Parcel parcel) {
                    return new LocalIcon(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final LocalIcon[] newArray(int i12) {
                    return new LocalIcon[i12];
                }
            }

            public LocalIcon(@k String str, @l String str2) {
                this.name = str;
                this.color = str2;
            }

            public static /* synthetic */ LocalIcon copy$default(LocalIcon localIcon, String str, String str2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = localIcon.name;
                }
                if ((i12 & 2) != 0) {
                    str2 = localIcon.color;
                }
                return localIcon.copy(str, str2);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getName() {
                return this.name;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final String getColor() {
                return this.color;
            }

            @k
            public final LocalIcon copy(@k String name, @l String color) {
                return new LocalIcon(name, color);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LocalIcon)) {
                    return false;
                }
                LocalIcon localIcon = (LocalIcon) other;
                return L.f(this.name, localIcon.name) && L.f(this.color, localIcon.color);
            }

            @l
            public final String getColor() {
                return this.color;
            }

            @k
            public final String getName() {
                return this.name;
            }

            public int hashCode() {
                int iHashCode = this.name.hashCode() * 31;
                String str = this.color;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("LocalIcon(name=");
                sb2.append(this.name);
                sb2.append(", color=");
                return C22026a.c(sb2, this.color, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.name);
                parcel.writeString(this.color);
            }
        }

        public AutoSelectBenefit(@k String str, @l LocalIcon localIcon) {
            this.text = str;
            this.localIcon = localIcon;
        }

        public static /* synthetic */ AutoSelectBenefit copy$default(AutoSelectBenefit autoSelectBenefit, String str, LocalIcon localIcon, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = autoSelectBenefit.text;
            }
            if ((i12 & 2) != 0) {
                localIcon = autoSelectBenefit.localIcon;
            }
            return autoSelectBenefit.copy(str, localIcon);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final LocalIcon getLocalIcon() {
            return this.localIcon;
        }

        @k
        public final AutoSelectBenefit copy(@k String text, @l LocalIcon localIcon) {
            return new AutoSelectBenefit(text, localIcon);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AutoSelectBenefit)) {
                return false;
            }
            AutoSelectBenefit autoSelectBenefit = (AutoSelectBenefit) other;
            return L.f(this.text, autoSelectBenefit.text) && L.f(this.localIcon, autoSelectBenefit.localIcon);
        }

        @l
        public final LocalIcon getLocalIcon() {
            return this.localIcon;
        }

        @k
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int iHashCode = this.text.hashCode() * 31;
            LocalIcon localIcon = this.localIcon;
            return iHashCode + (localIcon == null ? 0 : localIcon.hashCode());
        }

        @k
        public String toString() {
            return "AutoSelectBenefit(text=" + this.text + ", localIcon=" + this.localIcon + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.text);
            LocalIcon localIcon = this.localIcon;
            if (localIcon == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                localIcon.writeToParcel(parcel, flags);
            }
        }

        public /* synthetic */ AutoSelectBenefit(String str, LocalIcon localIcon, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : localIcon);
        }
    }

    public /* synthetic */ AdvertAutoSelect(String str, List list, AutoSelectButton autoSelectButton, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : list, (i12 & 4) != 0 ? null : autoSelectButton);
    }
}
