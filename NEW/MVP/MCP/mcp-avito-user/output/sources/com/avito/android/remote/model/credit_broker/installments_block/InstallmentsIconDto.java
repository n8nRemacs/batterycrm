package com.avito.android.remote.model.credit_broker.installments_block;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ColoredIcon;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.credit_broker.Size;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InstallmentsBlock.kt */
@d
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0013¨\u00060"}, d2 = {"Lcom/avito/android/remote/model/credit_broker/installments_block/InstallmentsIconDto;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/ColoredIcon;", "localIcon", "Lcom/avito/android/remote/model/UniversalImage;", "remoteIcon", "Lcom/avito/android/remote/model/credit_broker/Size;", "size", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Lcom/avito/android/remote/model/ColoredIcon;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/credit_broker/Size;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Lcom/avito/android/remote/model/ColoredIcon;", "component2", "()Lcom/avito/android/remote/model/UniversalImage;", "component3", "()Lcom/avito/android/remote/model/credit_broker/Size;", "component4", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Lcom/avito/android/remote/model/ColoredIcon;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/credit_broker/Size;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/credit_broker/installments_block/InstallmentsIconDto;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/ColoredIcon;", "getLocalIcon", "Lcom/avito/android/remote/model/UniversalImage;", "getRemoteIcon", "Lcom/avito/android/remote/model/credit_broker/Size;", "getSize", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class InstallmentsIconDto implements Parcelable {

    @k
    public static final Parcelable.Creator<InstallmentsIconDto> CREATOR = new Creator();

    @c(ContextActionHandler.Link.DEEPLINK)
    @l
    private final DeepLink deepLink;

    @c("localIcon")
    @l
    private final ColoredIcon localIcon;

    @c("remoteIcon")
    @l
    private final UniversalImage remoteIcon;

    @c("size")
    @l
    private final Size size;

    /* compiled from: InstallmentsBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InstallmentsIconDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InstallmentsIconDto createFromParcel(@k Parcel parcel) {
            return new InstallmentsIconDto((ColoredIcon) parcel.readParcelable(InstallmentsIconDto.class.getClassLoader()), (UniversalImage) parcel.readParcelable(InstallmentsIconDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Size.CREATOR.createFromParcel(parcel), (DeepLink) parcel.readParcelable(InstallmentsIconDto.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InstallmentsIconDto[] newArray(int i12) {
            return new InstallmentsIconDto[i12];
        }
    }

    public InstallmentsIconDto(@l ColoredIcon coloredIcon, @l UniversalImage universalImage, @l Size size, @l DeepLink deepLink) {
        this.localIcon = coloredIcon;
        this.remoteIcon = universalImage;
        this.size = size;
        this.deepLink = deepLink;
    }

    public static /* synthetic */ InstallmentsIconDto copy$default(InstallmentsIconDto installmentsIconDto, ColoredIcon coloredIcon, UniversalImage universalImage, Size size, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            coloredIcon = installmentsIconDto.localIcon;
        }
        if ((i12 & 2) != 0) {
            universalImage = installmentsIconDto.remoteIcon;
        }
        if ((i12 & 4) != 0) {
            size = installmentsIconDto.size;
        }
        if ((i12 & 8) != 0) {
            deepLink = installmentsIconDto.deepLink;
        }
        return installmentsIconDto.copy(coloredIcon, universalImage, size, deepLink);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final ColoredIcon getLocalIcon() {
        return this.localIcon;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final UniversalImage getRemoteIcon() {
        return this.remoteIcon;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @k
    public final InstallmentsIconDto copy(@l ColoredIcon localIcon, @l UniversalImage remoteIcon, @l Size size, @l DeepLink deepLink) {
        return new InstallmentsIconDto(localIcon, remoteIcon, size, deepLink);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstallmentsIconDto)) {
            return false;
        }
        InstallmentsIconDto installmentsIconDto = (InstallmentsIconDto) other;
        return L.f(this.localIcon, installmentsIconDto.localIcon) && L.f(this.remoteIcon, installmentsIconDto.remoteIcon) && L.f(this.size, installmentsIconDto.size) && L.f(this.deepLink, installmentsIconDto.deepLink);
    }

    @l
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    public final ColoredIcon getLocalIcon() {
        return this.localIcon;
    }

    @l
    public final UniversalImage getRemoteIcon() {
        return this.remoteIcon;
    }

    @l
    public final Size getSize() {
        return this.size;
    }

    public int hashCode() {
        ColoredIcon coloredIcon = this.localIcon;
        int iHashCode = (coloredIcon == null ? 0 : coloredIcon.hashCode()) * 31;
        UniversalImage universalImage = this.remoteIcon;
        int iHashCode2 = (iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        Size size = this.size;
        int iHashCode3 = (iHashCode2 + (size == null ? 0 : size.hashCode())) * 31;
        DeepLink deepLink = this.deepLink;
        return iHashCode3 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("InstallmentsIconDto(localIcon=");
        sb2.append(this.localIcon);
        sb2.append(", remoteIcon=");
        sb2.append(this.remoteIcon);
        sb2.append(", size=");
        sb2.append(this.size);
        sb2.append(", deepLink=");
        return a.v(sb2, this.deepLink, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.localIcon, flags);
        parcel.writeParcelable(this.remoteIcon, flags);
        Size size = this.size;
        if (size == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            size.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.deepLink, flags);
    }
}
