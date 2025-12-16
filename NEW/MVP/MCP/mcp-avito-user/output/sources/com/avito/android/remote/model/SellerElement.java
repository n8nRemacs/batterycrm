package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggest;
import com.avito.android.remote.model.section.SectionElement;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import j.InterfaceC42156l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SellerElement.kt */
@d
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u00011B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'R(\u0010)\u001a\u00020(8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b)\u0010*\u0012\u0004\b/\u00100\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00062"}, d2 = {"Lcom/avito/android/remote/model/SellerElement;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/SerpElement;", "Lcom/avito/android/remote/model/section/SectionElement;", "", "title", "Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;", AdvertDetailsBlockIdKt.BLOCK_ID_BADGE_BAR, "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "Lcom/avito/android/remote/model/Image;", MessageSuggest.PREVIEW, "Lcom/avito/android/remote/model/SellerElement$DeveloperInfo;", "developer", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/SellerElement$DeveloperInfo;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;", "getBadgeBar", "()Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/Image;", "getPreview", "()Lcom/avito/android/remote/model/Image;", "Lcom/avito/android/remote/model/SellerElement$DeveloperInfo;", "getDeveloper", "()Lcom/avito/android/remote/model/SellerElement$DeveloperInfo;", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "getUniqueId$annotations", "()V", "DeveloperInfo", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public class SellerElement implements Parcelable, SerpElement, SectionElement {

    @k
    public static final Parcelable.Creator<SellerElement> CREATOR = new Creator();

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_BADGE_BAR)
    @l
    private final SerpBadgeBar badgeBar;

    @c("developer")
    @l
    private final DeveloperInfo developer;

    @c("previewImage")
    @l
    private final Image preview;

    @c("title")
    @k
    private final String title;
    private long uniqueId;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink uri;

    /* compiled from: SellerElement.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SellerElement> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SellerElement createFromParcel(@k Parcel parcel) {
            return new SellerElement(parcel.readString(), parcel.readInt() == 0 ? null : SerpBadgeBar.CREATOR.createFromParcel(parcel), (DeepLink) parcel.readParcelable(SellerElement.class.getClassLoader()), (Image) parcel.readParcelable(SellerElement.class.getClassLoader()), parcel.readInt() != 0 ? DeveloperInfo.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SellerElement[] newArray(int i12) {
            return new SellerElement[i12];
        }
    }

    /* compiled from: SellerElement.kt */
    @s0
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ(\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\r¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/SellerElement$DeveloperInfo;", "Landroid/os/Parcelable;", "", "title", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "color", "", "getAsDescription", "(I)Ljava/lang/CharSequence;", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/SellerElement$DeveloperInfo;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getName", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class DeveloperInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<DeveloperInfo> CREATOR = new Creator();

        @c("value")
        @l
        private final String name;

        @c("title")
        @l
        private final String title;

        /* compiled from: SellerElement.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DeveloperInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final DeveloperInfo createFromParcel(@k Parcel parcel) {
                return new DeveloperInfo(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final DeveloperInfo[] newArray(int i12) {
                return new DeveloperInfo[i12];
            }
        }

        public DeveloperInfo(@l String str, @l String str2) {
            this.title = str;
            this.name = str2;
        }

        public static /* synthetic */ DeveloperInfo copy$default(DeveloperInfo developerInfo, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = developerInfo.title;
            }
            if ((i12 & 2) != 0) {
                str2 = developerInfo.name;
            }
            return developerInfo.copy(str, str2);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @k
        public final DeveloperInfo copy(@l String title, @l String name) {
            return new DeveloperInfo(title, name);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeveloperInfo)) {
                return false;
            }
            DeveloperInfo developerInfo = (DeveloperInfo) other;
            return L.f(this.title, developerInfo.title) && L.f(this.name, developerInfo.name);
        }

        @k
        public final CharSequence getAsDescription(@InterfaceC42156l int color) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.title != null) {
                spannableStringBuilder.append(AK.c.s(new StringBuilder(), this.title, "  ·  "), new ForegroundColorSpan(color), 17);
            }
            String str = this.name;
            if (str != null) {
                spannableStringBuilder.append((CharSequence) str);
            }
            return new SpannedString(spannableStringBuilder);
        }

        @l
        public final String getName() {
            return this.name;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.name;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("DeveloperInfo(title=");
            sb2.append(this.title);
            sb2.append(", name=");
            return C22026a.c(sb2, this.name, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.name);
        }
    }

    public SellerElement(@k String str, @l SerpBadgeBar serpBadgeBar, @l DeepLink deepLink, @l Image image, @l DeveloperInfo developerInfo) {
        this.title = str;
        this.badgeBar = serpBadgeBar;
        this.uri = deepLink;
        this.preview = image;
        this.developer = developerInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final SerpBadgeBar getBadgeBar() {
        return this.badgeBar;
    }

    @l
    public final DeveloperInfo getDeveloper() {
        return this.developer;
    }

    @l
    public final Image getPreview() {
        return this.preview;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public long getUniqueId() {
        return this.uniqueId;
    }

    @l
    public final DeepLink getUri() {
        return this.uri;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public void setUniqueId(long j12) {
        this.uniqueId = j12;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        SerpBadgeBar serpBadgeBar = this.badgeBar;
        if (serpBadgeBar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serpBadgeBar.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.uri, flags);
        parcel.writeParcelable(this.preview, flags);
        DeveloperInfo developerInfo = this.developer;
        if (developerInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            developerInfo.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ SellerElement(String str, SerpBadgeBar serpBadgeBar, DeepLink deepLink, Image image, DeveloperInfo developerInfo, int i12, C42822w c42822w) {
        this(str, serpBadgeBar, deepLink, (i12 & 8) != 0 ? null : image, (i12 & 16) != 0 ? null : developerInfo);
    }

    public static /* synthetic */ void getUniqueId$annotations() {
    }
}
