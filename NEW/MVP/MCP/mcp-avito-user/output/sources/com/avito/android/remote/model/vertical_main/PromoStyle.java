package com.avito.android.remote.model.vertical_main;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PromoWidget.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bW\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\ba¨\u0006b"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/PromoStyle;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "WHITE", "BLUE", "GREEN", "RED", "ORANGE", "BEIGE", "VIOLET", "WARMGRAY", "MonoHorizontalYellow", "MonoVerticalYellow", "MonoHorizontalRed", "MonoVerticalRed", "MonoHorizontalGreen", "MonoVerticalGreen", "MonoHorizontalBlue", "MonoVerticalBlue", "MonoHorizontalViolet", "MonoVerticalViolet", "MonoHorizontalOrange", "MonoVerticalOrange", "MonoHorizontalBeige", "MonoVerticalBeige", "MonoHorizontalWarmgray", "MonoVerticalWarmgray", "MixedHorizontalYellowRed", "MixedVerticalYellowRed", "MixedHorizontalYellowGreen", "MixedVerticalYellowGreen", "MixedHorizontalYellowBlue", "MixedVerticalYellowBlue", "MixedHorizontalYellowViolet", "MixedVerticalYellowViolet", "MixedHorizontalYellowOrange", "MixedVerticalYellowOrange", "MixedHorizontalRedYellow", "MixedVerticalRedYellow", "MixedHorizontalRedGreen", "MixedVerticalRedGreen", "MixedHorizontalRedBlue", "MixedVerticalRedBlue", "MixedHorizontalRedViolet", "MixedVerticalRedViolet", "MixedHorizontalRedOrange", "MixedVerticalRedOrange", "MixedHorizontalGreenYellow", "MixedVerticalGreenYellow", "MixedHorizontalGreenRed", "MixedVerticalGreenRed", "MixedHorizontalGreenBlue", "MixedVerticalGreenBlue", "MixedHorizontalGreenViolet", "MixedVerticalGreenViolet", "MixedHorizontalGreenOrange", "MixedVerticalGreenOrange", "MixedHorizontalBlueYellow", "MixedVerticalBlueYellow", "MixedHorizontalBlueRed", "MixedVerticalBlueRed", "MixedHorizontalBlueGreen", "MixedVerticalBlueGreen", "MixedHorizontalBlueViolet", "MixedVerticalBlueViolet", "MixedHorizontalBlueOrange", "MixedVerticalBlueOrange", "MixedHorizontalVioletYellow", "MixedVerticalVioletYellow", "MixedHorizontalVioletRed", "MixedVerticalVioletRed", "MixedHorizontalVioletGreen", "MixedVerticalVioletGreen", "MixedHorizontalVioletBlue", "MixedVerticalVioletBlue", "MixedHorizontalVioletOrange", "MixedVerticalVioletOrange", "MixedHorizontalOrangeYellow", "MixedVerticalOrangeYellow", "MixedHorizontalOrangeRed", "MixedVerticalOrangeRed", "MixedHorizontalOrangeGreen", "MixedVerticalOrangeGreen", "MixedHorizontalOrangeBlue", "MixedVerticalOrangeBlue", "MixedHorizontalOrangeViolet", "MixedVerticalOrangeViolet", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PromoStyle implements Parcelable {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PromoStyle[] $VALUES;

    @k
    public static final Parcelable.Creator<PromoStyle> CREATOR;

    @c("white")
    public static final PromoStyle WHITE = new PromoStyle("WHITE", 0);

    @c("blue")
    public static final PromoStyle BLUE = new PromoStyle("BLUE", 1);

    @c("green")
    public static final PromoStyle GREEN = new PromoStyle("GREEN", 2);

    @c("red")
    public static final PromoStyle RED = new PromoStyle("RED", 3);

    @c("orange")
    public static final PromoStyle ORANGE = new PromoStyle("ORANGE", 4);

    @c("beige")
    public static final PromoStyle BEIGE = new PromoStyle("BEIGE", 5);

    @c("violet")
    public static final PromoStyle VIOLET = new PromoStyle("VIOLET", 6);

    @c("warmgray")
    public static final PromoStyle WARMGRAY = new PromoStyle("WARMGRAY", 7);

    @c("monoHorizontalYellow")
    public static final PromoStyle MonoHorizontalYellow = new PromoStyle("MonoHorizontalYellow", 8);

    @c("monoVerticalYellow")
    public static final PromoStyle MonoVerticalYellow = new PromoStyle("MonoVerticalYellow", 9);

    @c("monoHorizontalRed")
    public static final PromoStyle MonoHorizontalRed = new PromoStyle("MonoHorizontalRed", 10);

    @c("monoVerticalRed")
    public static final PromoStyle MonoVerticalRed = new PromoStyle("MonoVerticalRed", 11);

    @c("monoHorizontalGreen")
    public static final PromoStyle MonoHorizontalGreen = new PromoStyle("MonoHorizontalGreen", 12);

    @c("monoVerticalGreen")
    public static final PromoStyle MonoVerticalGreen = new PromoStyle("MonoVerticalGreen", 13);

    @c("monoHorizontalBlue")
    public static final PromoStyle MonoHorizontalBlue = new PromoStyle("MonoHorizontalBlue", 14);

    @c("monoVerticalBlue")
    public static final PromoStyle MonoVerticalBlue = new PromoStyle("MonoVerticalBlue", 15);

    @c("monoHorizontalViolet")
    public static final PromoStyle MonoHorizontalViolet = new PromoStyle("MonoHorizontalViolet", 16);

    @c("monoVerticalViolet")
    public static final PromoStyle MonoVerticalViolet = new PromoStyle("MonoVerticalViolet", 17);

    @c("monoHorizontalOrange")
    public static final PromoStyle MonoHorizontalOrange = new PromoStyle("MonoHorizontalOrange", 18);

    @c("monoVerticalOrange")
    public static final PromoStyle MonoVerticalOrange = new PromoStyle("MonoVerticalOrange", 19);

    @c("monoHorizontalBeige")
    public static final PromoStyle MonoHorizontalBeige = new PromoStyle("MonoHorizontalBeige", 20);

    @c("monoVerticalBeige")
    public static final PromoStyle MonoVerticalBeige = new PromoStyle("MonoVerticalBeige", 21);

    @c("monoHorizontalWarmgray")
    public static final PromoStyle MonoHorizontalWarmgray = new PromoStyle("MonoHorizontalWarmgray", 22);

    @c("monoVerticalWarmgray")
    public static final PromoStyle MonoVerticalWarmgray = new PromoStyle("MonoVerticalWarmgray", 23);

    @c("mixedHorizontalYellowRed")
    public static final PromoStyle MixedHorizontalYellowRed = new PromoStyle("MixedHorizontalYellowRed", 24);

    @c("mixedVerticalYellowRed")
    public static final PromoStyle MixedVerticalYellowRed = new PromoStyle("MixedVerticalYellowRed", 25);

    @c("mixedHorizontalYellowGreen")
    public static final PromoStyle MixedHorizontalYellowGreen = new PromoStyle("MixedHorizontalYellowGreen", 26);

    @c("mixedVerticalYellowGreen")
    public static final PromoStyle MixedVerticalYellowGreen = new PromoStyle("MixedVerticalYellowGreen", 27);

    @c("mixedHorizontalYellowBlue")
    public static final PromoStyle MixedHorizontalYellowBlue = new PromoStyle("MixedHorizontalYellowBlue", 28);

    @c("mixedVerticalYellowBlue")
    public static final PromoStyle MixedVerticalYellowBlue = new PromoStyle("MixedVerticalYellowBlue", 29);

    @c("mixedHorizontalYellowViolet")
    public static final PromoStyle MixedHorizontalYellowViolet = new PromoStyle("MixedHorizontalYellowViolet", 30);

    @c("mixedVerticalYellowViolet")
    public static final PromoStyle MixedVerticalYellowViolet = new PromoStyle("MixedVerticalYellowViolet", 31);

    @c("mixedHorizontalYellowOrange")
    public static final PromoStyle MixedHorizontalYellowOrange = new PromoStyle("MixedHorizontalYellowOrange", 32);

    @c("mixedVerticalYellowOrange")
    public static final PromoStyle MixedVerticalYellowOrange = new PromoStyle("MixedVerticalYellowOrange", 33);

    @c("mixedHorizontalRedYellow")
    public static final PromoStyle MixedHorizontalRedYellow = new PromoStyle("MixedHorizontalRedYellow", 34);

    @c("mixedVerticalRedYellow")
    public static final PromoStyle MixedVerticalRedYellow = new PromoStyle("MixedVerticalRedYellow", 35);

    @c("mixedHorizontalRedGreen")
    public static final PromoStyle MixedHorizontalRedGreen = new PromoStyle("MixedHorizontalRedGreen", 36);

    @c("mixedVerticalRedGreen")
    public static final PromoStyle MixedVerticalRedGreen = new PromoStyle("MixedVerticalRedGreen", 37);

    @c("mixedHorizontalRedBlue")
    public static final PromoStyle MixedHorizontalRedBlue = new PromoStyle("MixedHorizontalRedBlue", 38);

    @c("mixedVerticalRedBlue")
    public static final PromoStyle MixedVerticalRedBlue = new PromoStyle("MixedVerticalRedBlue", 39);

    @c("mixedHorizontalRedViolet")
    public static final PromoStyle MixedHorizontalRedViolet = new PromoStyle("MixedHorizontalRedViolet", 40);

    @c("mixedVerticalRedViolet")
    public static final PromoStyle MixedVerticalRedViolet = new PromoStyle("MixedVerticalRedViolet", 41);

    @c("mixedHorizontalRedOrange")
    public static final PromoStyle MixedHorizontalRedOrange = new PromoStyle("MixedHorizontalRedOrange", 42);

    @c("mixedVerticalRedOrange")
    public static final PromoStyle MixedVerticalRedOrange = new PromoStyle("MixedVerticalRedOrange", 43);

    @c("mixedHorizontalGreenYellow")
    public static final PromoStyle MixedHorizontalGreenYellow = new PromoStyle("MixedHorizontalGreenYellow", 44);

    @c("mixedVerticalGreenYellow")
    public static final PromoStyle MixedVerticalGreenYellow = new PromoStyle("MixedVerticalGreenYellow", 45);

    @c("mixedHorizontalGreenRed")
    public static final PromoStyle MixedHorizontalGreenRed = new PromoStyle("MixedHorizontalGreenRed", 46);

    @c("mixedVerticalGreenRed")
    public static final PromoStyle MixedVerticalGreenRed = new PromoStyle("MixedVerticalGreenRed", 47);

    @c("mixedHorizontalGreenBlue")
    public static final PromoStyle MixedHorizontalGreenBlue = new PromoStyle("MixedHorizontalGreenBlue", 48);

    @c("mixedVerticalGreenBlue")
    public static final PromoStyle MixedVerticalGreenBlue = new PromoStyle("MixedVerticalGreenBlue", 49);

    @c("mixedHorizontalGreenViolet")
    public static final PromoStyle MixedHorizontalGreenViolet = new PromoStyle("MixedHorizontalGreenViolet", 50);

    @c("mixedVerticalGreenViolet")
    public static final PromoStyle MixedVerticalGreenViolet = new PromoStyle("MixedVerticalGreenViolet", 51);

    @c("mixedHorizontalGreenOrange")
    public static final PromoStyle MixedHorizontalGreenOrange = new PromoStyle("MixedHorizontalGreenOrange", 52);

    @c("mixedVerticalGreenOrange")
    public static final PromoStyle MixedVerticalGreenOrange = new PromoStyle("MixedVerticalGreenOrange", 53);

    @c("mixedHorizontalBlueYellow")
    public static final PromoStyle MixedHorizontalBlueYellow = new PromoStyle("MixedHorizontalBlueYellow", 54);

    @c("mixedVerticalBlueYellow")
    public static final PromoStyle MixedVerticalBlueYellow = new PromoStyle("MixedVerticalBlueYellow", 55);

    @c("mixedHorizontalBlueRed")
    public static final PromoStyle MixedHorizontalBlueRed = new PromoStyle("MixedHorizontalBlueRed", 56);

    @c("mixedVerticalBlueRed")
    public static final PromoStyle MixedVerticalBlueRed = new PromoStyle("MixedVerticalBlueRed", 57);

    @c("mixedHorizontalBlueGreen")
    public static final PromoStyle MixedHorizontalBlueGreen = new PromoStyle("MixedHorizontalBlueGreen", 58);

    @c("mixedVerticalBlueGreen")
    public static final PromoStyle MixedVerticalBlueGreen = new PromoStyle("MixedVerticalBlueGreen", 59);

    @c("mixedHorizontalBlueViolet")
    public static final PromoStyle MixedHorizontalBlueViolet = new PromoStyle("MixedHorizontalBlueViolet", 60);

    @c("mixedVerticalBlueViolet")
    public static final PromoStyle MixedVerticalBlueViolet = new PromoStyle("MixedVerticalBlueViolet", 61);

    @c("mixedHorizontalBlueOrange")
    public static final PromoStyle MixedHorizontalBlueOrange = new PromoStyle("MixedHorizontalBlueOrange", 62);

    @c("mixedVerticalBlueOrange")
    public static final PromoStyle MixedVerticalBlueOrange = new PromoStyle("MixedVerticalBlueOrange", 63);

    @c("mixedHorizontalVioletYellow")
    public static final PromoStyle MixedHorizontalVioletYellow = new PromoStyle("MixedHorizontalVioletYellow", 64);

    @c("mixedVerticalVioletYellow")
    public static final PromoStyle MixedVerticalVioletYellow = new PromoStyle("MixedVerticalVioletYellow", 65);

    @c("mixedHorizontalVioletRed")
    public static final PromoStyle MixedHorizontalVioletRed = new PromoStyle("MixedHorizontalVioletRed", 66);

    @c("mixedVerticalVioletRed")
    public static final PromoStyle MixedVerticalVioletRed = new PromoStyle("MixedVerticalVioletRed", 67);

    @c("mixedHorizontalVioletGreen")
    public static final PromoStyle MixedHorizontalVioletGreen = new PromoStyle("MixedHorizontalVioletGreen", 68);

    @c("mixedVerticalVioletGreen")
    public static final PromoStyle MixedVerticalVioletGreen = new PromoStyle("MixedVerticalVioletGreen", 69);

    @c("mixedHorizontalVioletBlue")
    public static final PromoStyle MixedHorizontalVioletBlue = new PromoStyle("MixedHorizontalVioletBlue", 70);

    @c("mixedVerticalVioletBlue")
    public static final PromoStyle MixedVerticalVioletBlue = new PromoStyle("MixedVerticalVioletBlue", 71);

    @c("mixedHorizontalVioletOrange")
    public static final PromoStyle MixedHorizontalVioletOrange = new PromoStyle("MixedHorizontalVioletOrange", 72);

    @c("mixedVerticalVioletOrange")
    public static final PromoStyle MixedVerticalVioletOrange = new PromoStyle("MixedVerticalVioletOrange", 73);

    @c("mixedHorizontalOrangeYellow")
    public static final PromoStyle MixedHorizontalOrangeYellow = new PromoStyle("MixedHorizontalOrangeYellow", 74);

    @c("mixedVerticalOrangeYellow")
    public static final PromoStyle MixedVerticalOrangeYellow = new PromoStyle("MixedVerticalOrangeYellow", 75);

    @c("mixedHorizontalOrangeRed")
    public static final PromoStyle MixedHorizontalOrangeRed = new PromoStyle("MixedHorizontalOrangeRed", 76);

    @c("mixedVerticalOrangeRed")
    public static final PromoStyle MixedVerticalOrangeRed = new PromoStyle("MixedVerticalOrangeRed", 77);

    @c("mixedHorizontalOrangeGreen")
    public static final PromoStyle MixedHorizontalOrangeGreen = new PromoStyle("MixedHorizontalOrangeGreen", 78);

    @c("mixedVerticalOrangeGreen")
    public static final PromoStyle MixedVerticalOrangeGreen = new PromoStyle("MixedVerticalOrangeGreen", 79);

    @c("mixedHorizontalOrangeBlue")
    public static final PromoStyle MixedHorizontalOrangeBlue = new PromoStyle("MixedHorizontalOrangeBlue", 80);

    @c("mixedVerticalOrangeBlue")
    public static final PromoStyle MixedVerticalOrangeBlue = new PromoStyle("MixedVerticalOrangeBlue", 81);

    @c("mixedHorizontalOrangeViolet")
    public static final PromoStyle MixedHorizontalOrangeViolet = new PromoStyle("MixedHorizontalOrangeViolet", 82);

    @c("mixedVerticalOrangeViolet")
    public static final PromoStyle MixedVerticalOrangeViolet = new PromoStyle("MixedVerticalOrangeViolet", 83);

    private static final /* synthetic */ PromoStyle[] $values() {
        return new PromoStyle[]{WHITE, BLUE, GREEN, RED, ORANGE, BEIGE, VIOLET, WARMGRAY, MonoHorizontalYellow, MonoVerticalYellow, MonoHorizontalRed, MonoVerticalRed, MonoHorizontalGreen, MonoVerticalGreen, MonoHorizontalBlue, MonoVerticalBlue, MonoHorizontalViolet, MonoVerticalViolet, MonoHorizontalOrange, MonoVerticalOrange, MonoHorizontalBeige, MonoVerticalBeige, MonoHorizontalWarmgray, MonoVerticalWarmgray, MixedHorizontalYellowRed, MixedVerticalYellowRed, MixedHorizontalYellowGreen, MixedVerticalYellowGreen, MixedHorizontalYellowBlue, MixedVerticalYellowBlue, MixedHorizontalYellowViolet, MixedVerticalYellowViolet, MixedHorizontalYellowOrange, MixedVerticalYellowOrange, MixedHorizontalRedYellow, MixedVerticalRedYellow, MixedHorizontalRedGreen, MixedVerticalRedGreen, MixedHorizontalRedBlue, MixedVerticalRedBlue, MixedHorizontalRedViolet, MixedVerticalRedViolet, MixedHorizontalRedOrange, MixedVerticalRedOrange, MixedHorizontalGreenYellow, MixedVerticalGreenYellow, MixedHorizontalGreenRed, MixedVerticalGreenRed, MixedHorizontalGreenBlue, MixedVerticalGreenBlue, MixedHorizontalGreenViolet, MixedVerticalGreenViolet, MixedHorizontalGreenOrange, MixedVerticalGreenOrange, MixedHorizontalBlueYellow, MixedVerticalBlueYellow, MixedHorizontalBlueRed, MixedVerticalBlueRed, MixedHorizontalBlueGreen, MixedVerticalBlueGreen, MixedHorizontalBlueViolet, MixedVerticalBlueViolet, MixedHorizontalBlueOrange, MixedVerticalBlueOrange, MixedHorizontalVioletYellow, MixedVerticalVioletYellow, MixedHorizontalVioletRed, MixedVerticalVioletRed, MixedHorizontalVioletGreen, MixedVerticalVioletGreen, MixedHorizontalVioletBlue, MixedVerticalVioletBlue, MixedHorizontalVioletOrange, MixedVerticalVioletOrange, MixedHorizontalOrangeYellow, MixedVerticalOrangeYellow, MixedHorizontalOrangeRed, MixedVerticalOrangeRed, MixedHorizontalOrangeGreen, MixedVerticalOrangeGreen, MixedHorizontalOrangeBlue, MixedVerticalOrangeBlue, MixedHorizontalOrangeViolet, MixedVerticalOrangeViolet};
    }

    static {
        PromoStyle[] promoStyleArr$values = $values();
        $VALUES = promoStyleArr$values;
        $ENTRIES = kotlin.enums.c.a(promoStyleArr$values);
        CREATOR = new Parcelable.Creator<PromoStyle>() { // from class: com.avito.android.remote.model.vertical_main.PromoStyle.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final PromoStyle createFromParcel(@k Parcel parcel) {
                return PromoStyle.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final PromoStyle[] newArray(int i12) {
                return new PromoStyle[i12];
            }
        };
    }

    private PromoStyle(String str, int i12) {
    }

    @k
    public static a<PromoStyle> getEntries() {
        return $ENTRIES;
    }

    public static PromoStyle valueOf(String str) {
        return (PromoStyle) Enum.valueOf(PromoStyle.class, str);
    }

    public static PromoStyle[] values() {
        return (PromoStyle[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(name());
    }
}
