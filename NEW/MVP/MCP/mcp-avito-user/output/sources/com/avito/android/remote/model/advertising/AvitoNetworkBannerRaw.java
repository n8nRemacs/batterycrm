package com.avito.android.remote.model.advertising;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: AvitoNetworkBannerRaw.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw;", "Landroid/os/Parcelable;", "HideReason", "Image", "MarkInfo", "Outclick", "ProfilePromo", "ProfilePromoGallery", "Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$Image;", "Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$Outclick;", "Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$ProfilePromo;", "Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$ProfilePromoGallery;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface AvitoNetworkBannerRaw extends Parcelable {

    /* compiled from: AvitoNetworkBannerRaw.kt */
    @d
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000b¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$HideReason;", "Landroid/os/Parcelable;", "", "id", "", "description", "<init>", "(ILjava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$HideReason;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getId", "Ljava/lang/String;", "getDescription", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HideReason implements Parcelable {

        @k
        public static final Parcelable.Creator<HideReason> CREATOR = new Creator();

        @c("description")
        @k
        private final String description;

        @c("id")
        private final int id;

        /* compiled from: AvitoNetworkBannerRaw.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HideReason> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final HideReason createFromParcel(@k Parcel parcel) {
                return new HideReason(parcel.readInt(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final HideReason[] newArray(int i12) {
                return new HideReason[i12];
            }
        }

        public HideReason(int i12, @k String str) {
            this.id = i12;
            this.description = str;
        }

        public static /* synthetic */ HideReason copy$default(HideReason hideReason, int i12, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i12 = hideReason.id;
            }
            if ((i13 & 2) != 0) {
                str = hideReason.description;
            }
            return hideReason.copy(i12, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @k
        public final HideReason copy(int id2, @k String description) {
            return new HideReason(id2, description);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HideReason)) {
                return false;
            }
            HideReason hideReason = (HideReason) other;
            return this.id == hideReason.id && L.f(this.description, hideReason.description);
        }

        @k
        public final String getDescription() {
            return this.description;
        }

        public final int getId() {
            return this.id;
        }

        public int hashCode() {
            return this.description.hashCode() + (Integer.hashCode(this.id) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("HideReason(id=");
            sb2.append(this.id);
            sb2.append(", description=");
            return C22026a.c(sb2, this.description, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.id);
            parcel.writeString(this.description);
        }
    }

    /* compiled from: AvitoNetworkBannerRaw.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$Image;", "Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw;", "", "image", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$Image;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getImage", "getUri", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Image implements AvitoNetworkBannerRaw {

        @k
        public static final Parcelable.Creator<Image> CREATOR = new Creator();

        @c("image")
        @k
        private final String image;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final String uri;

        /* compiled from: AvitoNetworkBannerRaw.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Image> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Image createFromParcel(@k Parcel parcel) {
                return new Image(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Image[] newArray(int i12) {
                return new Image[i12];
            }
        }

        public Image(@k String str, @k String str2) {
            this.image = str;
            this.uri = str2;
        }

        public static /* synthetic */ Image copy$default(Image image, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = image.image;
            }
            if ((i12 & 2) != 0) {
                str2 = image.uri;
            }
            return image.copy(str, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        @k
        public final Image copy(@k String image, @k String uri) {
            return new Image(image, uri);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return L.f(this.image, image.image) && L.f(this.uri, image.uri);
        }

        @k
        public final String getImage() {
            return this.image;
        }

        @k
        public final String getUri() {
            return this.uri;
        }

        public int hashCode() {
            return this.uri.hashCode() + (this.image.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Image(image=");
            sb2.append(this.image);
            sb2.append(", uri=");
            return C22026a.c(sb2, this.uri, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.image);
            parcel.writeString(this.uri);
        }
    }

    /* compiled from: AvitoNetworkBannerRaw.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ2\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\t¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$MarkInfo;", "Landroid/os/Parcelable;", "", "juristicInfo", "legalInfo", "age", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$MarkInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getJuristicInfo", "getLegalInfo", "getAge", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MarkInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<MarkInfo> CREATOR = new Creator();

        @c("age")
        @l
        private final String age;

        @c("juristicInfo")
        @k
        private final String juristicInfo;

        @c("legalInfo")
        @l
        private final String legalInfo;

        /* compiled from: AvitoNetworkBannerRaw.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MarkInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final MarkInfo createFromParcel(@k Parcel parcel) {
                return new MarkInfo(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final MarkInfo[] newArray(int i12) {
                return new MarkInfo[i12];
            }
        }

        public MarkInfo(@k String str, @l String str2, @l String str3) {
            this.juristicInfo = str;
            this.legalInfo = str2;
            this.age = str3;
        }

        public static /* synthetic */ MarkInfo copy$default(MarkInfo markInfo, String str, String str2, String str3, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = markInfo.juristicInfo;
            }
            if ((i12 & 2) != 0) {
                str2 = markInfo.legalInfo;
            }
            if ((i12 & 4) != 0) {
                str3 = markInfo.age;
            }
            return markInfo.copy(str, str2, str3);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getJuristicInfo() {
            return this.juristicInfo;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getLegalInfo() {
            return this.legalInfo;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getAge() {
            return this.age;
        }

        @k
        public final MarkInfo copy(@k String juristicInfo, @l String legalInfo, @l String age) {
            return new MarkInfo(juristicInfo, legalInfo, age);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarkInfo)) {
                return false;
            }
            MarkInfo markInfo = (MarkInfo) other;
            return L.f(this.juristicInfo, markInfo.juristicInfo) && L.f(this.legalInfo, markInfo.legalInfo) && L.f(this.age, markInfo.age);
        }

        @l
        public final String getAge() {
            return this.age;
        }

        @k
        public final String getJuristicInfo() {
            return this.juristicInfo;
        }

        @l
        public final String getLegalInfo() {
            return this.legalInfo;
        }

        public int hashCode() {
            int iHashCode = this.juristicInfo.hashCode() * 31;
            String str = this.legalInfo;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.age;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("MarkInfo(juristicInfo=");
            sb2.append(this.juristicInfo);
            sb2.append(", legalInfo=");
            sb2.append(this.legalInfo);
            sb2.append(", age=");
            return C22026a.c(sb2, this.age, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.juristicInfo);
            parcel.writeString(this.legalInfo);
            parcel.writeString(this.age);
        }
    }

    /* compiled from: AvitoNetworkBannerRaw.kt */
    @d
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ`\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0011J\u0010\u0010\u001e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0016J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b$\u0010\u0016J \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010\u0018R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b5\u0010\u001a¨\u00066"}, d2 = {"Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$ProfilePromo;", "Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw;", "", "title", "description", "image", TooltipAttribute.PARAM_DEEP_LINK, "", "creativeId", "Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$MarkInfo;", "markInfo", "", "Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$HideReason;", "hideReasons", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$MarkInfo;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()I", "component6", "()Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$MarkInfo;", "component7", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$MarkInfo;Ljava/util/List;)Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$ProfilePromo;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getDescription", "getImage", "getUri", "I", "getCreativeId", "Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$MarkInfo;", "getMarkInfo", "Ljava/util/List;", "getHideReasons", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProfilePromo implements AvitoNetworkBannerRaw {

        @k
        public static final Parcelable.Creator<ProfilePromo> CREATOR = new Creator();

        @c("creativeId")
        private final int creativeId;

        @c("description")
        @k
        private final String description;

        @c("hideReasons")
        @l
        private final List<HideReason> hideReasons;

        @c("image")
        @k
        private final String image;

        @c("markInfo")
        @l
        private final MarkInfo markInfo;

        @c("title")
        @k
        private final String title;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final String uri;

        /* compiled from: AvitoNetworkBannerRaw.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ProfilePromo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ProfilePromo createFromParcel(@k Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = null;
                MarkInfo markInfoCreateFromParcel = parcel.readInt() == 0 ? null : MarkInfo.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    int i13 = parcel.readInt();
                    arrayList = new ArrayList(i13);
                    int iC2 = 0;
                    while (iC2 != i13) {
                        iC2 = a.c(HideReason.CREATOR, parcel, arrayList, iC2, 1);
                    }
                }
                return new ProfilePromo(string, string2, string3, string4, i12, markInfoCreateFromParcel, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ProfilePromo[] newArray(int i12) {
                return new ProfilePromo[i12];
            }
        }

        public ProfilePromo(@k String str, @k String str2, @k String str3, @k String str4, int i12, @l MarkInfo markInfo, @l List<HideReason> list) {
            this.title = str;
            this.description = str2;
            this.image = str3;
            this.uri = str4;
            this.creativeId = i12;
            this.markInfo = markInfo;
            this.hideReasons = list;
        }

        public static /* synthetic */ ProfilePromo copy$default(ProfilePromo profilePromo, String str, String str2, String str3, String str4, int i12, MarkInfo markInfo, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = profilePromo.title;
            }
            if ((i13 & 2) != 0) {
                str2 = profilePromo.description;
            }
            String str5 = str2;
            if ((i13 & 4) != 0) {
                str3 = profilePromo.image;
            }
            String str6 = str3;
            if ((i13 & 8) != 0) {
                str4 = profilePromo.uri;
            }
            String str7 = str4;
            if ((i13 & 16) != 0) {
                i12 = profilePromo.creativeId;
            }
            int i14 = i12;
            if ((i13 & 32) != 0) {
                markInfo = profilePromo.markInfo;
            }
            MarkInfo markInfo2 = markInfo;
            if ((i13 & 64) != 0) {
                list = profilePromo.hideReasons;
            }
            return profilePromo.copy(str, str5, str6, str7, i14, markInfo2, list);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        /* renamed from: component5, reason: from getter */
        public final int getCreativeId() {
            return this.creativeId;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final MarkInfo getMarkInfo() {
            return this.markInfo;
        }

        @l
        public final List<HideReason> component7() {
            return this.hideReasons;
        }

        @k
        public final ProfilePromo copy(@k String title, @k String description, @k String image, @k String uri, int creativeId, @l MarkInfo markInfo, @l List<HideReason> hideReasons) {
            return new ProfilePromo(title, description, image, uri, creativeId, markInfo, hideReasons);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProfilePromo)) {
                return false;
            }
            ProfilePromo profilePromo = (ProfilePromo) other;
            return L.f(this.title, profilePromo.title) && L.f(this.description, profilePromo.description) && L.f(this.image, profilePromo.image) && L.f(this.uri, profilePromo.uri) && this.creativeId == profilePromo.creativeId && L.f(this.markInfo, profilePromo.markInfo) && L.f(this.hideReasons, profilePromo.hideReasons);
        }

        public final int getCreativeId() {
            return this.creativeId;
        }

        @k
        public final String getDescription() {
            return this.description;
        }

        @l
        public final List<HideReason> getHideReasons() {
            return this.hideReasons;
        }

        @k
        public final String getImage() {
            return this.image;
        }

        @l
        public final MarkInfo getMarkInfo() {
            return this.markInfo;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @k
        public final String getUri() {
            return this.uri;
        }

        public int hashCode() {
            int iE2 = r.e(this.creativeId, H.d(H.d(H.d(this.title.hashCode() * 31, 31, this.description), 31, this.image), 31, this.uri), 31);
            MarkInfo markInfo = this.markInfo;
            int iHashCode = (iE2 + (markInfo == null ? 0 : markInfo.hashCode())) * 31;
            List<HideReason> list = this.hideReasons;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ProfilePromo(title=");
            sb2.append(this.title);
            sb2.append(", description=");
            sb2.append(this.description);
            sb2.append(", image=");
            sb2.append(this.image);
            sb2.append(", uri=");
            sb2.append(this.uri);
            sb2.append(", creativeId=");
            sb2.append(this.creativeId);
            sb2.append(", markInfo=");
            sb2.append(this.markInfo);
            sb2.append(", hideReasons=");
            return H.p(sb2, this.hideReasons, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.description);
            parcel.writeString(this.image);
            parcel.writeString(this.uri);
            parcel.writeInt(this.creativeId);
            MarkInfo markInfo = this.markInfo;
            if (markInfo == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                markInfo.writeToParcel(parcel, flags);
            }
            List<HideReason> list = this.hideReasons;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((HideReason) itA.next()).writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: AvitoNetworkBannerRaw.kt */
    @d
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\f¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$ProfilePromoGallery;", "Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw;", "", "title", "", "Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$ProfilePromo;", "posters", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$ProfilePromoGallery;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getPosters", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProfilePromoGallery implements AvitoNetworkBannerRaw {

        @k
        public static final Parcelable.Creator<ProfilePromoGallery> CREATOR = new Creator();

        @c("posters")
        @k
        private final List<ProfilePromo> posters;

        @c("title")
        @k
        private final String title;

        /* compiled from: AvitoNetworkBannerRaw.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ProfilePromoGallery> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ProfilePromoGallery createFromParcel(@k Parcel parcel) {
                String string = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(ProfilePromo.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new ProfilePromoGallery(string, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ProfilePromoGallery[] newArray(int i12) {
                return new ProfilePromoGallery[i12];
            }
        }

        public ProfilePromoGallery(@k String str, @k List<ProfilePromo> list) {
            this.title = str;
            this.posters = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ProfilePromoGallery copy$default(ProfilePromoGallery profilePromoGallery, String str, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = profilePromoGallery.title;
            }
            if ((i12 & 2) != 0) {
                list = profilePromoGallery.posters;
            }
            return profilePromoGallery.copy(str, list);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        public final List<ProfilePromo> component2() {
            return this.posters;
        }

        @k
        public final ProfilePromoGallery copy(@k String title, @k List<ProfilePromo> posters) {
            return new ProfilePromoGallery(title, posters);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProfilePromoGallery)) {
                return false;
            }
            ProfilePromoGallery profilePromoGallery = (ProfilePromoGallery) other;
            return L.f(this.title, profilePromoGallery.title) && L.f(this.posters, profilePromoGallery.posters);
        }

        @k
        public final List<ProfilePromo> getPosters() {
            return this.posters;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.posters.hashCode() + (this.title.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ProfilePromoGallery(title=");
            sb2.append(this.title);
            sb2.append(", posters=");
            return H.p(sb2, this.posters, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            Iterator itJ = C0.j(this.posters, parcel);
            while (itJ.hasNext()) {
                ((ProfilePromo) itJ.next()).writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: AvitoNetworkBannerRaw.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u000256BP\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u001b\u0010\u000b\u001a\u0017\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b¢\u0006\u0002\b\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\u0017\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b¢\u0006\u0002\b\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019Je\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001d\b\u0002\u0010\u000b\u001a\u0017\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b¢\u0006\u0002\b\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0011J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u0015R/\u0010\u000b\u001a\u0017\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b¢\u0006\u0002\b\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u0010\u0017R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b4\u0010\u0019¨\u00067"}, d2 = {"Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$Outclick;", "Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw;", "", "templateType", "template", "renderer", "Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$Outclick$Props;", "props", "", "", "LK51/e;", "content", "Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$Outclick$Pixels;", "pixels", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$Outclick$Props;Ljava/util/Map;Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$Outclick$Pixels;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$Outclick$Props;", "component5", "()Ljava/util/Map;", "component6", "()Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$Outclick$Pixels;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$Outclick$Props;Ljava/util/Map;Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$Outclick$Pixels;)Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$Outclick;", "toString", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTemplateType", "getTemplate", "getRenderer", "Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$Outclick$Props;", "getProps", "Ljava/util/Map;", "getContent", "Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$Outclick$Pixels;", "getPixels", "Pixels", "Props", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Outclick implements AvitoNetworkBannerRaw {

        @k
        public static final Parcelable.Creator<Outclick> CREATOR = new Creator();

        @c("content")
        @l
        private final Map<String, Object> content;

        @c("pixels")
        @l
        private final Pixels pixels;

        @c("props")
        @k
        private final Props props;

        @c("render")
        @k
        private final String renderer;

        @c("template")
        @l
        private final String template;

        @c("templateType")
        @k
        private final String templateType;

        /* compiled from: AvitoNetworkBannerRaw.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Outclick> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Outclick createFromParcel(@k Parcel parcel) {
                LinkedHashMap linkedHashMap;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                Props propsCreateFromParcel = Props.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i12 = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = h.c(Outclick.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
                    }
                }
                return new Outclick(string, string2, string3, propsCreateFromParcel, linkedHashMap, parcel.readInt() != 0 ? Pixels.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Outclick[] newArray(int i12) {
                return new Outclick[i12];
            }
        }

        /* compiled from: AvitoNetworkBannerRaw.kt */
        @d
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u008e\u0001\u0010\u0015\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\u000eR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b*\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b+\u0010\u000eR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b,\u0010\u000eR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b-\u0010\u000eR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b.\u0010\u000eR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b/\u0010\u000e¨\u00060"}, d2 = {"Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$Outclick$Pixels;", "Landroid/os/Parcelable;", "", "", "click", "view", "videoStart", "videoFirstQuartile", "videoMidpoint", "videoThirdQuartile", "videoComplete", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$Outclick$Pixels;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getClick", "getView", "getVideoStart", "getVideoFirstQuartile", "getVideoMidpoint", "getVideoThirdQuartile", "getVideoComplete", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Pixels implements Parcelable {

            @k
            public static final Parcelable.Creator<Pixels> CREATOR = new Creator();

            @c("click")
            @l
            private final List<String> click;

            @c("video_100_percent")
            @l
            private final List<String> videoComplete;

            @c("video_25_percent")
            @l
            private final List<String> videoFirstQuartile;

            @c("video_50_percent")
            @l
            private final List<String> videoMidpoint;

            @c("video_start")
            @l
            private final List<String> videoStart;

            @c("video_75_percent")
            @l
            private final List<String> videoThirdQuartile;

            @c("view")
            @l
            private final List<String> view;

            /* compiled from: AvitoNetworkBannerRaw.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Pixels> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Pixels createFromParcel(@k Parcel parcel) {
                    return new Pixels(parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Pixels[] newArray(int i12) {
                    return new Pixels[i12];
                }
            }

            public Pixels(@l List<String> list, @l List<String> list2, @l List<String> list3, @l List<String> list4, @l List<String> list5, @l List<String> list6, @l List<String> list7) {
                this.click = list;
                this.view = list2;
                this.videoStart = list3;
                this.videoFirstQuartile = list4;
                this.videoMidpoint = list5;
                this.videoThirdQuartile = list6;
                this.videoComplete = list7;
            }

            public static /* synthetic */ Pixels copy$default(Pixels pixels, List list, List list2, List list3, List list4, List list5, List list6, List list7, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    list = pixels.click;
                }
                if ((i12 & 2) != 0) {
                    list2 = pixels.view;
                }
                List list8 = list2;
                if ((i12 & 4) != 0) {
                    list3 = pixels.videoStart;
                }
                List list9 = list3;
                if ((i12 & 8) != 0) {
                    list4 = pixels.videoFirstQuartile;
                }
                List list10 = list4;
                if ((i12 & 16) != 0) {
                    list5 = pixels.videoMidpoint;
                }
                List list11 = list5;
                if ((i12 & 32) != 0) {
                    list6 = pixels.videoThirdQuartile;
                }
                List list12 = list6;
                if ((i12 & 64) != 0) {
                    list7 = pixels.videoComplete;
                }
                return pixels.copy(list, list8, list9, list10, list11, list12, list7);
            }

            @l
            public final List<String> component1() {
                return this.click;
            }

            @l
            public final List<String> component2() {
                return this.view;
            }

            @l
            public final List<String> component3() {
                return this.videoStart;
            }

            @l
            public final List<String> component4() {
                return this.videoFirstQuartile;
            }

            @l
            public final List<String> component5() {
                return this.videoMidpoint;
            }

            @l
            public final List<String> component6() {
                return this.videoThirdQuartile;
            }

            @l
            public final List<String> component7() {
                return this.videoComplete;
            }

            @k
            public final Pixels copy(@l List<String> click, @l List<String> view, @l List<String> videoStart, @l List<String> videoFirstQuartile, @l List<String> videoMidpoint, @l List<String> videoThirdQuartile, @l List<String> videoComplete) {
                return new Pixels(click, view, videoStart, videoFirstQuartile, videoMidpoint, videoThirdQuartile, videoComplete);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Pixels)) {
                    return false;
                }
                Pixels pixels = (Pixels) other;
                return L.f(this.click, pixels.click) && L.f(this.view, pixels.view) && L.f(this.videoStart, pixels.videoStart) && L.f(this.videoFirstQuartile, pixels.videoFirstQuartile) && L.f(this.videoMidpoint, pixels.videoMidpoint) && L.f(this.videoThirdQuartile, pixels.videoThirdQuartile) && L.f(this.videoComplete, pixels.videoComplete);
            }

            @l
            public final List<String> getClick() {
                return this.click;
            }

            @l
            public final List<String> getVideoComplete() {
                return this.videoComplete;
            }

            @l
            public final List<String> getVideoFirstQuartile() {
                return this.videoFirstQuartile;
            }

            @l
            public final List<String> getVideoMidpoint() {
                return this.videoMidpoint;
            }

            @l
            public final List<String> getVideoStart() {
                return this.videoStart;
            }

            @l
            public final List<String> getVideoThirdQuartile() {
                return this.videoThirdQuartile;
            }

            @l
            public final List<String> getView() {
                return this.view;
            }

            public int hashCode() {
                List<String> list = this.click;
                int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
                List<String> list2 = this.view;
                int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
                List<String> list3 = this.videoStart;
                int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
                List<String> list4 = this.videoFirstQuartile;
                int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
                List<String> list5 = this.videoMidpoint;
                int iHashCode5 = (iHashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
                List<String> list6 = this.videoThirdQuartile;
                int iHashCode6 = (iHashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
                List<String> list7 = this.videoComplete;
                return iHashCode6 + (list7 != null ? list7.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Pixels(click=");
                sb2.append(this.click);
                sb2.append(", view=");
                sb2.append(this.view);
                sb2.append(", videoStart=");
                sb2.append(this.videoStart);
                sb2.append(", videoFirstQuartile=");
                sb2.append(this.videoFirstQuartile);
                sb2.append(", videoMidpoint=");
                sb2.append(this.videoMidpoint);
                sb2.append(", videoThirdQuartile=");
                sb2.append(this.videoThirdQuartile);
                sb2.append(", videoComplete=");
                return H.p(sb2, this.videoComplete, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeStringList(this.click);
                parcel.writeStringList(this.view);
                parcel.writeStringList(this.videoStart);
                parcel.writeStringList(this.videoFirstQuartile);
                parcel.writeStringList(this.videoMidpoint);
                parcel.writeStringList(this.videoThirdQuartile);
                parcel.writeStringList(this.videoComplete);
            }
        }

        public Outclick(@k String str, @l String str2, @k String str3, @k Props props, @l Map<String, ? extends Object> map, @l Pixels pixels) {
            this.templateType = str;
            this.template = str2;
            this.renderer = str3;
            this.props = props;
            this.content = map;
            this.pixels = pixels;
        }

        public static /* synthetic */ Outclick copy$default(Outclick outclick, String str, String str2, String str3, Props props, Map map, Pixels pixels, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = outclick.templateType;
            }
            if ((i12 & 2) != 0) {
                str2 = outclick.template;
            }
            String str4 = str2;
            if ((i12 & 4) != 0) {
                str3 = outclick.renderer;
            }
            String str5 = str3;
            if ((i12 & 8) != 0) {
                props = outclick.props;
            }
            Props props2 = props;
            if ((i12 & 16) != 0) {
                map = outclick.content;
            }
            Map map2 = map;
            if ((i12 & 32) != 0) {
                pixels = outclick.pixels;
            }
            return outclick.copy(str, str4, str5, props2, map2, pixels);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTemplateType() {
            return this.templateType;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getTemplate() {
            return this.template;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getRenderer() {
            return this.renderer;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final Props getProps() {
            return this.props;
        }

        @l
        public final Map<String, Object> component5() {
            return this.content;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final Pixels getPixels() {
            return this.pixels;
        }

        @k
        public final Outclick copy(@k String templateType, @l String template, @k String renderer, @k Props props, @l Map<String, ? extends Object> content, @l Pixels pixels) {
            return new Outclick(templateType, template, renderer, props, content, pixels);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Outclick)) {
                return false;
            }
            Outclick outclick = (Outclick) other;
            return L.f(this.templateType, outclick.templateType) && L.f(this.template, outclick.template) && L.f(this.renderer, outclick.renderer) && L.f(this.props, outclick.props) && L.f(this.content, outclick.content) && L.f(this.pixels, outclick.pixels);
        }

        @l
        public final Map<String, Object> getContent() {
            return this.content;
        }

        @l
        public final Pixels getPixels() {
            return this.pixels;
        }

        @k
        public final Props getProps() {
            return this.props;
        }

        @k
        public final String getRenderer() {
            return this.renderer;
        }

        @l
        public final String getTemplate() {
            return this.template;
        }

        @k
        public final String getTemplateType() {
            return this.templateType;
        }

        public int hashCode() {
            int iHashCode = this.templateType.hashCode() * 31;
            String str = this.template;
            int iHashCode2 = (this.props.hashCode() + H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.renderer)) * 31;
            Map<String, Object> map = this.content;
            int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
            Pixels pixels = this.pixels;
            return iHashCode3 + (pixels != null ? pixels.hashCode() : 0);
        }

        @k
        public String toString() {
            return "Outclick(templateType=" + this.templateType + ", template=" + this.template + ", renderer=" + this.renderer + ", props=" + this.props + ", content=" + this.content + ", pixels=" + this.pixels + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.templateType);
            parcel.writeString(this.template);
            parcel.writeString(this.renderer);
            this.props.writeToParcel(parcel, flags);
            Map<String, Object> map = this.content;
            if (map == null) {
                parcel.writeInt(0);
            } else {
                Iterator itH = C0.h(parcel, 1, map);
                while (itH.hasNext()) {
                    Map.Entry entry = (Map.Entry) itH.next();
                    h.h(parcel, (String) entry.getKey(), entry);
                }
            }
            Pixels pixels = this.pixels;
            if (pixels == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                pixels.writeToParcel(parcel, flags);
            }
        }

        /* compiled from: AvitoNetworkBannerRaw.kt */
        @d
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J^\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u000fJ\u001a\u0010\u001f\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u000fJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b/\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b0\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b\u000b\u0010\u0018¨\u00062"}, d2 = {"Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$Outclick$Props;", "Landroid/os/Parcelable;", "", "creativeId", "campaignId", "templateId", "", "impressionId", "clickId", "fullviewId", "", "isClickIn", "<init>", "(IILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()I", "component2", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/lang/String;", "component5", "component6", "component7", "()Z", "copy", "(IILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$Outclick$Props;", "toString", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getCreativeId", "getCampaignId", "Ljava/lang/Integer;", "getTemplateId", "Ljava/lang/String;", "getImpressionId", "getClickId", "getFullviewId", "Z", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Props implements Parcelable {

            @k
            public static final Parcelable.Creator<Props> CREATOR = new Creator();
            private final int campaignId;

            @l
            private final String clickId;
            private final int creativeId;

            @l
            private final String fullviewId;

            @l
            private final String impressionId;
            private final boolean isClickIn;

            @l
            private final Integer templateId;

            /* compiled from: AvitoNetworkBannerRaw.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Props> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Props createFromParcel(@k Parcel parcel) {
                    return new Props(parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Props[] newArray(int i12) {
                    return new Props[i12];
                }
            }

            public Props(int i12, int i13, @l Integer num, @l String str, @l String str2, @l String str3, boolean z12) {
                this.creativeId = i12;
                this.campaignId = i13;
                this.templateId = num;
                this.impressionId = str;
                this.clickId = str2;
                this.fullviewId = str3;
                this.isClickIn = z12;
            }

            public static /* synthetic */ Props copy$default(Props props, int i12, int i13, Integer num, String str, String str2, String str3, boolean z12, int i14, Object obj) {
                if ((i14 & 1) != 0) {
                    i12 = props.creativeId;
                }
                if ((i14 & 2) != 0) {
                    i13 = props.campaignId;
                }
                int i15 = i13;
                if ((i14 & 4) != 0) {
                    num = props.templateId;
                }
                Integer num2 = num;
                if ((i14 & 8) != 0) {
                    str = props.impressionId;
                }
                String str4 = str;
                if ((i14 & 16) != 0) {
                    str2 = props.clickId;
                }
                String str5 = str2;
                if ((i14 & 32) != 0) {
                    str3 = props.fullviewId;
                }
                String str6 = str3;
                if ((i14 & 64) != 0) {
                    z12 = props.isClickIn;
                }
                return props.copy(i12, i15, num2, str4, str5, str6, z12);
            }

            /* renamed from: component1, reason: from getter */
            public final int getCreativeId() {
                return this.creativeId;
            }

            /* renamed from: component2, reason: from getter */
            public final int getCampaignId() {
                return this.campaignId;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final Integer getTemplateId() {
                return this.templateId;
            }

            @l
            /* renamed from: component4, reason: from getter */
            public final String getImpressionId() {
                return this.impressionId;
            }

            @l
            /* renamed from: component5, reason: from getter */
            public final String getClickId() {
                return this.clickId;
            }

            @l
            /* renamed from: component6, reason: from getter */
            public final String getFullviewId() {
                return this.fullviewId;
            }

            /* renamed from: component7, reason: from getter */
            public final boolean getIsClickIn() {
                return this.isClickIn;
            }

            @k
            public final Props copy(int creativeId, int campaignId, @l Integer templateId, @l String impressionId, @l String clickId, @l String fullviewId, boolean isClickIn) {
                return new Props(creativeId, campaignId, templateId, impressionId, clickId, fullviewId, isClickIn);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Props)) {
                    return false;
                }
                Props props = (Props) other;
                return this.creativeId == props.creativeId && this.campaignId == props.campaignId && L.f(this.templateId, props.templateId) && L.f(this.impressionId, props.impressionId) && L.f(this.clickId, props.clickId) && L.f(this.fullviewId, props.fullviewId) && this.isClickIn == props.isClickIn;
            }

            public final int getCampaignId() {
                return this.campaignId;
            }

            @l
            public final String getClickId() {
                return this.clickId;
            }

            public final int getCreativeId() {
                return this.creativeId;
            }

            @l
            public final String getFullviewId() {
                return this.fullviewId;
            }

            @l
            public final String getImpressionId() {
                return this.impressionId;
            }

            @l
            public final Integer getTemplateId() {
                return this.templateId;
            }

            public int hashCode() {
                int iE2 = r.e(this.campaignId, Integer.hashCode(this.creativeId) * 31, 31);
                Integer num = this.templateId;
                int iHashCode = (iE2 + (num == null ? 0 : num.hashCode())) * 31;
                String str = this.impressionId;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.clickId;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.fullviewId;
                return Boolean.hashCode(this.isClickIn) + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
            }

            public final boolean isClickIn() {
                return this.isClickIn;
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Props(creativeId=");
                sb2.append(this.creativeId);
                sb2.append(", campaignId=");
                sb2.append(this.campaignId);
                sb2.append(", templateId=");
                sb2.append(this.templateId);
                sb2.append(", impressionId=");
                sb2.append(this.impressionId);
                sb2.append(", clickId=");
                sb2.append(this.clickId);
                sb2.append(", fullviewId=");
                sb2.append(this.fullviewId);
                sb2.append(", isClickIn=");
                return r.x(sb2, this.isClickIn, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeInt(this.creativeId);
                parcel.writeInt(this.campaignId);
                Integer num = this.templateId;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    a.C(parcel, 1, num);
                }
                parcel.writeString(this.impressionId);
                parcel.writeString(this.clickId);
                parcel.writeString(this.fullviewId);
                parcel.writeInt(this.isClickIn ? 1 : 0);
            }

            public /* synthetic */ Props(int i12, int i13, Integer num, String str, String str2, String str3, boolean z12, int i14, C42822w c42822w) {
                this(i12, i13, num, str, str2, str3, (i14 & 64) != 0 ? false : z12);
            }
        }
    }
}
