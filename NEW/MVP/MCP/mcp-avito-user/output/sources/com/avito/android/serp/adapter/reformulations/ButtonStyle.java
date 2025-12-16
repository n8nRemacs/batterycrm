package com.avito.android.serp.adapter.reformulations;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReformulationsItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/serp/adapter/reformulations/ButtonStyle;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "a", "BLACK", "GREEN", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ButtonStyle implements Parcelable {

    @com.google.gson.annotations.c(AvitoMapMarkerKt.AMENITY_TYPE_BLACK)
    public static final ButtonStyle BLACK;

    @Y61.k
    public static final Parcelable.Creator<ButtonStyle> CREATOR;

    @com.google.gson.annotations.c("green")
    public static final ButtonStyle GREEN;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f270617b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ButtonStyle[] f270618c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f270619d;

    /* compiled from: ReformulationsItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/reformulations/ButtonStyle$a;", "", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        ButtonStyle buttonStyle = new ButtonStyle("BLACK", 0);
        BLACK = buttonStyle;
        ButtonStyle buttonStyle2 = new ButtonStyle("GREEN", 1);
        GREEN = buttonStyle2;
        ButtonStyle[] buttonStyleArr = {buttonStyle, buttonStyle2};
        f270618c = buttonStyleArr;
        f270619d = kotlin.enums.c.a(buttonStyleArr);
        f270617b = new a(null);
        CREATOR = new Parcelable.Creator<ButtonStyle>() { // from class: com.avito.android.serp.adapter.reformulations.ButtonStyle.b
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

    private ButtonStyle(String str, int i12) {
    }

    public static ButtonStyle valueOf(String str) {
        return (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
    }

    public static ButtonStyle[] values() {
        return (ButtonStyle[]) f270618c.clone();
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
