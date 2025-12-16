package com.avito.android.service_booking;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingBlock.kt */
@d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bBK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/avito/android/service_booking/SbContactBlock;", "Lcom/avito/android/service_booking/ServiceBookingBlock;", "", "text", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "Lcom/avito/android/service_booking/SbContactBlock$Icon;", "icon", "header", "toastMessage", "showPhoneText", "phone", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/service_booking/SbContactBlock$Icon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/service_booking/SbContactBlock$Icon;", "d", "()Lcom/avito/android/service_booking/SbContactBlock$Icon;", "c", "g", "f", "e", "Icon", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SbContactBlock implements ServiceBookingBlock {

    @k
    public static final Parcelable.Creator<SbContactBlock> CREATOR = new a();

    @c("header")
    @l
    private final String header;

    @c("icon")
    @l
    private final Icon icon;

    @c("phone")
    @l
    private final String phone;

    @c("showPhoneText")
    @l
    private final String showPhoneText;

    @c("title")
    @k
    private final String text;

    @c("toastMessage")
    @l
    private final String toastMessage;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink uri;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ServiceBookingBlock.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking/SbContactBlock$Icon;", "", "(Ljava/lang/String;I)V", "MESSENGER", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Icon {

        @c(NotificationsSettings.Section.SECTION_MESSENGER)
        public static final Icon MESSENGER;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Icon[] f274135b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f274136c;

        static {
            Icon icon = new Icon("MESSENGER", 0);
            MESSENGER = icon;
            Icon[] iconArr = {icon};
            f274135b = iconArr;
            f274136c = kotlin.enums.c.a(iconArr);
        }

        private Icon(String str, int i12) {
        }

        public static Icon valueOf(String str) {
            return (Icon) Enum.valueOf(Icon.class, str);
        }

        public static Icon[] values() {
            return (Icon[]) f274135b.clone();
        }
    }

    /* compiled from: ServiceBookingBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SbContactBlock> {
        @Override // android.os.Parcelable.Creator
        public final SbContactBlock createFromParcel(Parcel parcel) {
            return new SbContactBlock(parcel.readString(), (DeepLink) parcel.readParcelable(SbContactBlock.class.getClassLoader()), parcel.readInt() == 0 ? null : Icon.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SbContactBlock[] newArray(int i12) {
            return new SbContactBlock[i12];
        }
    }

    public SbContactBlock(@k String str, @l DeepLink deepLink, @l Icon icon, @l String str2, @l String str3, @l String str4, @l String str5) {
        this.text = str;
        this.uri = deepLink;
        this.icon = icon;
        this.header = str2;
        this.toastMessage = str3;
        this.showPhoneText = str4;
        this.phone = str5;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SbContactBlock)) {
            return false;
        }
        SbContactBlock sbContactBlock = (SbContactBlock) obj;
        return L.f(this.text, sbContactBlock.text) && L.f(this.uri, sbContactBlock.uri) && this.icon == sbContactBlock.icon && L.f(this.header, sbContactBlock.header) && L.f(this.toastMessage, sbContactBlock.toastMessage) && L.f(this.showPhoneText, sbContactBlock.showPhoneText) && L.f(this.phone, sbContactBlock.phone);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getShowPhoneText() {
        return this.showPhoneText;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getToastMessage() {
        return this.toastMessage;
    }

    @k
    public final String getText() {
        return this.text;
    }

    @l
    public final DeepLink getUri() {
        return this.uri;
    }

    public final int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        DeepLink deepLink = this.uri;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        Icon icon = this.icon;
        int iHashCode3 = (iHashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
        String str = this.header;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.toastMessage;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.showPhoneText;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.phone;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SbContactBlock(text=");
        sb2.append(this.text);
        sb2.append(", uri=");
        sb2.append(this.uri);
        sb2.append(", icon=");
        sb2.append(this.icon);
        sb2.append(", header=");
        sb2.append(this.header);
        sb2.append(", toastMessage=");
        sb2.append(this.toastMessage);
        sb2.append(", showPhoneText=");
        sb2.append(this.showPhoneText);
        sb2.append(", phone=");
        return C22026a.c(sb2, this.phone, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.text);
        parcel.writeParcelable(this.uri, i12);
        Icon icon = this.icon;
        if (icon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(icon.name());
        }
        parcel.writeString(this.header);
        parcel.writeString(this.toastMessage);
        parcel.writeString(this.showPhoneText);
        parcel.writeString(this.phone);
    }
}
