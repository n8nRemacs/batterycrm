package com.avito.android.mortgage.acceptance_dialog.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ButtonStyle.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/acceptance_dialog/model/ButtonStyle;", "", "Landroid/os/Parcelable;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ButtonStyle implements Parcelable {

    @k
    public static final Parcelable.Creator<ButtonStyle> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public static final ButtonStyle f198195b;

    /* renamed from: c, reason: collision with root package name */
    public static final ButtonStyle f198196c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ButtonStyle[] f198197d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f198198e;

    static {
        ButtonStyle buttonStyle = new ButtonStyle("PRIMARY", 0);
        f198195b = buttonStyle;
        ButtonStyle buttonStyle2 = new ButtonStyle("DANGER", 1);
        f198196c = buttonStyle2;
        ButtonStyle[] buttonStyleArr = {buttonStyle, buttonStyle2};
        f198197d = buttonStyleArr;
        f198198e = c.a(buttonStyleArr);
        CREATOR = new Parcelable.Creator<ButtonStyle>() { // from class: com.avito.android.mortgage.acceptance_dialog.model.ButtonStyle.a
            @Override // android.os.Parcelable.Creator
            public final ButtonStyle createFromParcel(Parcel parcel) {
                return ButtonStyle.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ButtonStyle[] newArray(int i12) {
                return new ButtonStyle[i12];
            }
        };
    }

    public ButtonStyle() {
        throw null;
    }

    public static ButtonStyle valueOf(String str) {
        return (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
    }

    public static ButtonStyle[] values() {
        return (ButtonStyle[]) f198197d.clone();
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
