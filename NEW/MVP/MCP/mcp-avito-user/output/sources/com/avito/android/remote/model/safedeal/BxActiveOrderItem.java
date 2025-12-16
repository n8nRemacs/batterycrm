package com.avito.android.remote.model.safedeal;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.L;

/* compiled from: BxActiveOrderItem.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0003$%&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/safedeal/BxActiveOrderItem;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/safedeal/BxActiveOrderItem$ItemType;", "type", "Lcom/avito/android/remote/model/safedeal/BxActiveOrderItem$ItemContent;", "content", "<init>", "(Lcom/avito/android/remote/model/safedeal/BxActiveOrderItem$ItemType;Lcom/avito/android/remote/model/safedeal/BxActiveOrderItem$ItemContent;)V", "component1", "()Lcom/avito/android/remote/model/safedeal/BxActiveOrderItem$ItemType;", "component2", "()Lcom/avito/android/remote/model/safedeal/BxActiveOrderItem$ItemContent;", "copy", "(Lcom/avito/android/remote/model/safedeal/BxActiveOrderItem$ItemType;Lcom/avito/android/remote/model/safedeal/BxActiveOrderItem$ItemContent;)Lcom/avito/android/remote/model/safedeal/BxActiveOrderItem;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/safedeal/BxActiveOrderItem$ItemType;", "getType", "Lcom/avito/android/remote/model/safedeal/BxActiveOrderItem$ItemContent;", "getContent", "BannerPayload", "ItemContent", "ItemType", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class BxActiveOrderItem implements Parcelable {

    @k
    public static final Parcelable.Creator<BxActiveOrderItem> CREATOR = new Creator();

    @c("content")
    @k
    private final ItemContent content;

    @c("type")
    @k
    private final ItemType type;

    /* compiled from: BxActiveOrderItem.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\t¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/safedeal/BxActiveOrderItem$BannerPayload;", "Landroid/os/Parcelable;", "", "position", "page", "bannerId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/safedeal/BxActiveOrderItem$BannerPayload;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPosition", "getPage", "getBannerId", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BannerPayload implements Parcelable {

        @k
        public static final Parcelable.Creator<BannerPayload> CREATOR = new Creator();

        @c("id")
        @l
        private final String bannerId;

        @c("page")
        @l
        private final String page;

        @c("position")
        @l
        private final String position;

        /* compiled from: BxActiveOrderItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BannerPayload> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BannerPayload createFromParcel(@k Parcel parcel) {
                return new BannerPayload(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BannerPayload[] newArray(int i12) {
                return new BannerPayload[i12];
            }
        }

        public BannerPayload(@l String str, @l String str2, @l String str3) {
            this.position = str;
            this.page = str2;
            this.bannerId = str3;
        }

        public static /* synthetic */ BannerPayload copy$default(BannerPayload bannerPayload, String str, String str2, String str3, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = bannerPayload.position;
            }
            if ((i12 & 2) != 0) {
                str2 = bannerPayload.page;
            }
            if ((i12 & 4) != 0) {
                str3 = bannerPayload.bannerId;
            }
            return bannerPayload.copy(str, str2, str3);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getPosition() {
            return this.position;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getPage() {
            return this.page;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getBannerId() {
            return this.bannerId;
        }

        @k
        public final BannerPayload copy(@l String position, @l String page, @l String bannerId) {
            return new BannerPayload(position, page, bannerId);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BannerPayload)) {
                return false;
            }
            BannerPayload bannerPayload = (BannerPayload) other;
            return L.f(this.position, bannerPayload.position) && L.f(this.page, bannerPayload.page) && L.f(this.bannerId, bannerPayload.bannerId);
        }

        @l
        public final String getBannerId() {
            return this.bannerId;
        }

        @l
        public final String getPage() {
            return this.page;
        }

        @l
        public final String getPosition() {
            return this.position;
        }

        public int hashCode() {
            String str = this.position;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.page;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.bannerId;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("BannerPayload(position=");
            sb2.append(this.position);
            sb2.append(", page=");
            sb2.append(this.page);
            sb2.append(", bannerId=");
            return C22026a.c(sb2, this.bannerId, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.position);
            parcel.writeString(this.page);
            parcel.writeString(this.bannerId);
        }
    }

    /* compiled from: BxActiveOrderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BxActiveOrderItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BxActiveOrderItem createFromParcel(@k Parcel parcel) {
            return new BxActiveOrderItem(ItemType.valueOf(parcel.readString()), ItemContent.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BxActiveOrderItem[] newArray(int i12) {
            return new BxActiveOrderItem[i12];
        }
    }

    /* compiled from: BxActiveOrderItem.kt */
    @d
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0015J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0015J\u0088\u0001\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0015J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020'HÖ\u0001¢\u0006\u0004\b.\u0010)J \u00103\u001a\u0002022\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020'HÖ\u0001¢\u0006\u0004\b3\u00104R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b;\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b\n\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b=\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b@\u0010\u001fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bB\u0010\"R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00105\u001a\u0004\bC\u0010\u0015¨\u0006D"}, d2 = {"Lcom/avito/android/remote/model/safedeal/BxActiveOrderItem$ItemContent;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "onTapDeepLink", "onShowDeepLink", "", "isMultipleItems", "badgeFallback", "Lcom/avito/android/remote/model/Image;", "image", "badgeImage", "Lcom/avito/android/remote/model/safedeal/BxActiveOrderItem$BannerPayload;", "bannerPayload", "attentionBadgeText", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/safedeal/BxActiveOrderItem$BannerPayload;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/text/AttributedText;", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component4", "component5", "()Ljava/lang/Boolean;", "component6", "component7", "()Lcom/avito/android/remote/model/Image;", "component8", "component9", "()Lcom/avito/android/remote/model/safedeal/BxActiveOrderItem$BannerPayload;", "component10", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/safedeal/BxActiveOrderItem$BannerPayload;Ljava/lang/String;)Lcom/avito/android/remote/model/safedeal/BxActiveOrderItem$ItemContent;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getOnTapDeepLink", "getOnShowDeepLink", "Ljava/lang/Boolean;", "getBadgeFallback", "Lcom/avito/android/remote/model/Image;", "getImage", "getBadgeImage", "Lcom/avito/android/remote/model/safedeal/BxActiveOrderItem$BannerPayload;", "getBannerPayload", "getAttentionBadgeText", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ItemContent implements Parcelable {

        @k
        public static final Parcelable.Creator<ItemContent> CREATOR = new Creator();

        @c("attentionBadgeText")
        @l
        private final String attentionBadgeText;

        @c("badgeFallback")
        @l
        private final String badgeFallback;

        @c("badgeImage")
        @l
        private final Image badgeImage;

        @c("bannerPayload")
        @l
        private final BannerPayload bannerPayload;

        @c("image")
        @l
        private final Image image;

        @c("isMultipleItems")
        @l
        private final Boolean isMultipleItems;

        @c("onShowDeepLink")
        @l
        private final DeepLink onShowDeepLink;

        @c("onTapDeepLink")
        @l
        private final DeepLink onTapDeepLink;

        @c("subtitle")
        @l
        private final AttributedText subtitle;

        @c("title")
        @l
        private final String title;

        /* compiled from: BxActiveOrderItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ItemContent> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ItemContent createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                AttributedText attributedText = (AttributedText) parcel.readParcelable(ItemContent.class.getClassLoader());
                DeepLink deepLink = (DeepLink) parcel.readParcelable(ItemContent.class.getClassLoader());
                DeepLink deepLink2 = (DeepLink) parcel.readParcelable(ItemContent.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new ItemContent(string, attributedText, deepLink, deepLink2, boolValueOf, parcel.readString(), (Image) parcel.readParcelable(ItemContent.class.getClassLoader()), (Image) parcel.readParcelable(ItemContent.class.getClassLoader()), parcel.readInt() != 0 ? BannerPayload.CREATOR.createFromParcel(parcel) : null, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ItemContent[] newArray(int i12) {
                return new ItemContent[i12];
            }
        }

        public ItemContent(@l String str, @l AttributedText attributedText, @l DeepLink deepLink, @l DeepLink deepLink2, @l Boolean bool, @l String str2, @l Image image, @l Image image2, @l BannerPayload bannerPayload, @l String str3) {
            this.title = str;
            this.subtitle = attributedText;
            this.onTapDeepLink = deepLink;
            this.onShowDeepLink = deepLink2;
            this.isMultipleItems = bool;
            this.badgeFallback = str2;
            this.image = image;
            this.badgeImage = image2;
            this.bannerPayload = bannerPayload;
            this.attentionBadgeText = str3;
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component10, reason: from getter */
        public final String getAttentionBadgeText() {
            return this.attentionBadgeText;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final AttributedText getSubtitle() {
            return this.subtitle;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final DeepLink getOnTapDeepLink() {
            return this.onTapDeepLink;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final DeepLink getOnShowDeepLink() {
            return this.onShowDeepLink;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final Boolean getIsMultipleItems() {
            return this.isMultipleItems;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final String getBadgeFallback() {
            return this.badgeFallback;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final Image getImage() {
            return this.image;
        }

        @l
        /* renamed from: component8, reason: from getter */
        public final Image getBadgeImage() {
            return this.badgeImage;
        }

        @l
        /* renamed from: component9, reason: from getter */
        public final BannerPayload getBannerPayload() {
            return this.bannerPayload;
        }

        @k
        public final ItemContent copy(@l String title, @l AttributedText subtitle, @l DeepLink onTapDeepLink, @l DeepLink onShowDeepLink, @l Boolean isMultipleItems, @l String badgeFallback, @l Image image, @l Image badgeImage, @l BannerPayload bannerPayload, @l String attentionBadgeText) {
            return new ItemContent(title, subtitle, onTapDeepLink, onShowDeepLink, isMultipleItems, badgeFallback, image, badgeImage, bannerPayload, attentionBadgeText);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemContent)) {
                return false;
            }
            ItemContent itemContent = (ItemContent) other;
            return L.f(this.title, itemContent.title) && L.f(this.subtitle, itemContent.subtitle) && L.f(this.onTapDeepLink, itemContent.onTapDeepLink) && L.f(this.onShowDeepLink, itemContent.onShowDeepLink) && L.f(this.isMultipleItems, itemContent.isMultipleItems) && L.f(this.badgeFallback, itemContent.badgeFallback) && L.f(this.image, itemContent.image) && L.f(this.badgeImage, itemContent.badgeImage) && L.f(this.bannerPayload, itemContent.bannerPayload) && L.f(this.attentionBadgeText, itemContent.attentionBadgeText);
        }

        @l
        public final String getAttentionBadgeText() {
            return this.attentionBadgeText;
        }

        @l
        public final String getBadgeFallback() {
            return this.badgeFallback;
        }

        @l
        public final Image getBadgeImage() {
            return this.badgeImage;
        }

        @l
        public final BannerPayload getBannerPayload() {
            return this.bannerPayload;
        }

        @l
        public final Image getImage() {
            return this.image;
        }

        @l
        public final DeepLink getOnShowDeepLink() {
            return this.onShowDeepLink;
        }

        @l
        public final DeepLink getOnTapDeepLink() {
            return this.onTapDeepLink;
        }

        @l
        public final AttributedText getSubtitle() {
            return this.subtitle;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            AttributedText attributedText = this.subtitle;
            int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            DeepLink deepLink = this.onTapDeepLink;
            int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            DeepLink deepLink2 = this.onShowDeepLink;
            int iHashCode4 = (iHashCode3 + (deepLink2 == null ? 0 : deepLink2.hashCode())) * 31;
            Boolean bool = this.isMultipleItems;
            int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.badgeFallback;
            int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Image image = this.image;
            int iHashCode7 = (iHashCode6 + (image == null ? 0 : image.hashCode())) * 31;
            Image image2 = this.badgeImage;
            int iHashCode8 = (iHashCode7 + (image2 == null ? 0 : image2.hashCode())) * 31;
            BannerPayload bannerPayload = this.bannerPayload;
            int iHashCode9 = (iHashCode8 + (bannerPayload == null ? 0 : bannerPayload.hashCode())) * 31;
            String str3 = this.attentionBadgeText;
            return iHashCode9 + (str3 != null ? str3.hashCode() : 0);
        }

        @l
        public final Boolean isMultipleItems() {
            return this.isMultipleItems;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ItemContent(title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            sb2.append(this.subtitle);
            sb2.append(", onTapDeepLink=");
            sb2.append(this.onTapDeepLink);
            sb2.append(", onShowDeepLink=");
            sb2.append(this.onShowDeepLink);
            sb2.append(", isMultipleItems=");
            sb2.append(this.isMultipleItems);
            sb2.append(", badgeFallback=");
            sb2.append(this.badgeFallback);
            sb2.append(", image=");
            sb2.append(this.image);
            sb2.append(", badgeImage=");
            sb2.append(this.badgeImage);
            sb2.append(", bannerPayload=");
            sb2.append(this.bannerPayload);
            sb2.append(", attentionBadgeText=");
            return C22026a.c(sb2, this.attentionBadgeText, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.subtitle, flags);
            parcel.writeParcelable(this.onTapDeepLink, flags);
            parcel.writeParcelable(this.onShowDeepLink, flags);
            Boolean bool = this.isMultipleItems;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            parcel.writeString(this.badgeFallback);
            parcel.writeParcelable(this.image, flags);
            parcel.writeParcelable(this.badgeImage, flags);
            BannerPayload bannerPayload = this.bannerPayload;
            if (bannerPayload == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                bannerPayload.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.attentionBadgeText);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BxActiveOrderItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/safedeal/BxActiveOrderItem$ItemType;", "", "(Ljava/lang/String;I)V", "GOODS_ORDER", "COMFORTABLE_DEAL", "SHOW_ALL", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ItemType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ItemType[] $VALUES;

        @c("goodsOrder")
        public static final ItemType GOODS_ORDER = new ItemType("GOODS_ORDER", 0);

        @c("comfortableDeal")
        public static final ItemType COMFORTABLE_DEAL = new ItemType("COMFORTABLE_DEAL", 1);

        @c("showAll")
        public static final ItemType SHOW_ALL = new ItemType("SHOW_ALL", 2);

        private static final /* synthetic */ ItemType[] $values() {
            return new ItemType[]{GOODS_ORDER, COMFORTABLE_DEAL, SHOW_ALL};
        }

        static {
            ItemType[] itemTypeArr$values = $values();
            $VALUES = itemTypeArr$values;
            $ENTRIES = kotlin.enums.c.a(itemTypeArr$values);
        }

        private ItemType(String str, int i12) {
        }

        @k
        public static a<ItemType> getEntries() {
            return $ENTRIES;
        }

        public static ItemType valueOf(String str) {
            return (ItemType) Enum.valueOf(ItemType.class, str);
        }

        public static ItemType[] values() {
            return (ItemType[]) $VALUES.clone();
        }
    }

    public BxActiveOrderItem(@k ItemType itemType, @k ItemContent itemContent) {
        this.type = itemType;
        this.content = itemContent;
    }

    public static /* synthetic */ BxActiveOrderItem copy$default(BxActiveOrderItem bxActiveOrderItem, ItemType itemType, ItemContent itemContent, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            itemType = bxActiveOrderItem.type;
        }
        if ((i12 & 2) != 0) {
            itemContent = bxActiveOrderItem.content;
        }
        return bxActiveOrderItem.copy(itemType, itemContent);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final ItemType getType() {
        return this.type;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final ItemContent getContent() {
        return this.content;
    }

    @k
    public final BxActiveOrderItem copy(@k ItemType type, @k ItemContent content) {
        return new BxActiveOrderItem(type, content);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BxActiveOrderItem)) {
            return false;
        }
        BxActiveOrderItem bxActiveOrderItem = (BxActiveOrderItem) other;
        return this.type == bxActiveOrderItem.type && L.f(this.content, bxActiveOrderItem.content);
    }

    @k
    public final ItemContent getContent() {
        return this.content;
    }

    @k
    public final ItemType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.content.hashCode() + (this.type.hashCode() * 31);
    }

    @k
    public String toString() {
        return "BxActiveOrderItem(type=" + this.type + ", content=" + this.content + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.type.name());
        this.content.writeToParcel(parcel, flags);
    }
}
