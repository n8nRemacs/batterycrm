package com.avito.android.beduin.common.component.favorite_button;

import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeduinFavoriteButtonModel.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/component/favorite_button/Style;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "LARGE", "BOLD_LARGE", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Style implements Parcelable {

    @com.google.gson.annotations.c("boldLarge")
    public static final Style BOLD_LARGE;

    @Y61.k
    public static final Parcelable.Creator<Style> CREATOR;

    @com.google.gson.annotations.c(Constants.LARGE)
    public static final Style LARGE;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Style[] f101178b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f101179c;

    static {
        Style style = new Style("LARGE", 0);
        LARGE = style;
        Style style2 = new Style("BOLD_LARGE", 1);
        BOLD_LARGE = style2;
        Style[] styleArr = {style, style2};
        f101178b = styleArr;
        f101179c = kotlin.enums.c.a(styleArr);
        CREATOR = new Parcelable.Creator<Style>() { // from class: com.avito.android.beduin.common.component.favorite_button.Style.a
            @Override // android.os.Parcelable.Creator
            public final Style createFromParcel(Parcel parcel) {
                return Style.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Style[] newArray(int i12) {
                return new Style[i12];
            }
        };
    }

    private Style(String str, int i12) {
    }

    public static Style valueOf(String str) {
        return (Style) Enum.valueOf(Style.class, str);
    }

    public static Style[] values() {
        return (Style[]) f101178b.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
