package com.avito.android.comfortable_deal.api.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AgentRoomDealResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/comfortable_deal/api/model/ImageIcon;", "", "Landroid/os/Parcelable;", "", "value", "serializedName", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "LightOn", "Lock", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ImageIcon implements Parcelable {

    @k
    public static final Parcelable.Creator<ImageIcon> CREATOR;

    @c("Light_On")
    public static final ImageIcon LightOn;

    @c("Lock")
    public static final ImageIcon Lock;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ImageIcon[] f119767d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f119768e;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f119769b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f119770c;

    static {
        ImageIcon imageIcon = new ImageIcon("LightOn", 0, "lightOn16", "Light_On");
        LightOn = imageIcon;
        ImageIcon imageIcon2 = new ImageIcon("Lock", 1, "lock16", "Lock");
        Lock = imageIcon2;
        ImageIcon[] imageIconArr = {imageIcon, imageIcon2};
        f119767d = imageIconArr;
        f119768e = kotlin.enums.c.a(imageIconArr);
        CREATOR = new Parcelable.Creator<ImageIcon>() { // from class: com.avito.android.comfortable_deal.api.model.ImageIcon.a
            @Override // android.os.Parcelable.Creator
            public final ImageIcon createFromParcel(Parcel parcel) {
                return ImageIcon.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ImageIcon[] newArray(int i12) {
                return new ImageIcon[i12];
            }
        };
    }

    private ImageIcon(String str, int i12, String str2, String str3) {
        this.f119769b = str2;
        this.f119770c = str3;
    }

    public static ImageIcon valueOf(String str) {
        return (ImageIcon) Enum.valueOf(ImageIcon.class, str);
    }

    public static ImageIcon[] values() {
        return (ImageIcon[]) f119767d.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
