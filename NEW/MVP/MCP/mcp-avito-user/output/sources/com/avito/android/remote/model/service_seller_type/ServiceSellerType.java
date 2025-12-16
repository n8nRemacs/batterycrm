package com.avito.android.remote.model.service_seller_type;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceSellerType.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J@\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0011¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/service_seller_type/ServiceSellerType;", "Landroid/os/Parcelable;", "", "text", "iconName", "Lcom/avito/android/remote/model/UniversalColor;", "iconColor", "Lcom/avito/android/remote/model/service_seller_type/Onboarding;", "onboarding", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/service_seller_type/Onboarding;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/UniversalColor;", "component4", "()Lcom/avito/android/remote/model/service_seller_type/Onboarding;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/service_seller_type/Onboarding;)Lcom/avito/android/remote/model/service_seller_type/ServiceSellerType;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "getIconName", "Lcom/avito/android/remote/model/UniversalColor;", "getIconColor", "Lcom/avito/android/remote/model/service_seller_type/Onboarding;", "getOnboarding", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ServiceSellerType implements Parcelable {

    @k
    public static final Parcelable.Creator<ServiceSellerType> CREATOR = new Creator();

    @c("iconColor")
    @l
    private final UniversalColor iconColor;

    @c("iconName")
    @l
    private final String iconName;

    @c("onboarding")
    @l
    private final Onboarding onboarding;

    @c("title")
    @l
    private final String text;

    /* compiled from: ServiceSellerType.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ServiceSellerType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ServiceSellerType createFromParcel(@k Parcel parcel) {
            return new ServiceSellerType(parcel.readString(), parcel.readString(), (UniversalColor) parcel.readParcelable(ServiceSellerType.class.getClassLoader()), parcel.readInt() == 0 ? null : Onboarding.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ServiceSellerType[] newArray(int i12) {
            return new ServiceSellerType[i12];
        }
    }

    public ServiceSellerType(@l String str, @l String str2, @l UniversalColor universalColor, @l Onboarding onboarding) {
        this.text = str;
        this.iconName = str2;
        this.iconColor = universalColor;
        this.onboarding = onboarding;
    }

    public static /* synthetic */ ServiceSellerType copy$default(ServiceSellerType serviceSellerType, String str, String str2, UniversalColor universalColor, Onboarding onboarding, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = serviceSellerType.text;
        }
        if ((i12 & 2) != 0) {
            str2 = serviceSellerType.iconName;
        }
        if ((i12 & 4) != 0) {
            universalColor = serviceSellerType.iconColor;
        }
        if ((i12 & 8) != 0) {
            onboarding = serviceSellerType.onboarding;
        }
        return serviceSellerType.copy(str, str2, universalColor, onboarding);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getIconName() {
        return this.iconName;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final UniversalColor getIconColor() {
        return this.iconColor;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Onboarding getOnboarding() {
        return this.onboarding;
    }

    @k
    public final ServiceSellerType copy(@l String text, @l String iconName, @l UniversalColor iconColor, @l Onboarding onboarding) {
        return new ServiceSellerType(text, iconName, iconColor, onboarding);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceSellerType)) {
            return false;
        }
        ServiceSellerType serviceSellerType = (ServiceSellerType) other;
        return L.f(this.text, serviceSellerType.text) && L.f(this.iconName, serviceSellerType.iconName) && L.f(this.iconColor, serviceSellerType.iconColor) && L.f(this.onboarding, serviceSellerType.onboarding);
    }

    @l
    public final UniversalColor getIconColor() {
        return this.iconColor;
    }

    @l
    public final String getIconName() {
        return this.iconName;
    }

    @l
    public final Onboarding getOnboarding() {
        return this.onboarding;
    }

    @l
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.iconName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        UniversalColor universalColor = this.iconColor;
        int iHashCode3 = (iHashCode2 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        Onboarding onboarding = this.onboarding;
        return iHashCode3 + (onboarding != null ? onboarding.hashCode() : 0);
    }

    @k
    public String toString() {
        return "ServiceSellerType(text=" + this.text + ", iconName=" + this.iconName + ", iconColor=" + this.iconColor + ", onboarding=" + this.onboarding + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.text);
        parcel.writeString(this.iconName);
        parcel.writeParcelable(this.iconColor, flags);
        Onboarding onboarding = this.onboarding;
        if (onboarding == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            onboarding.writeToParcel(parcel, flags);
        }
    }
}
