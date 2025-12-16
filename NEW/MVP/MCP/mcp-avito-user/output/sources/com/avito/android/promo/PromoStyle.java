package com.avito.android.promo;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PromoWidget.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\bW\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bX¨\u0006Y"}, d2 = {"Lcom/avito/android/promo/PromoStyle;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "WHITE", "BLUE", "GREEN", "RED", "ORANGE", "BEIGE", "VIOLET", "WARMGRAY", "MonoHorizontalYellow", "MonoVerticalYellow", "MonoHorizontalRed", "MonoVerticalRed", "MonoHorizontalGreen", "MonoVerticalGreen", "MonoHorizontalBlue", "MonoVerticalBlue", "MonoHorizontalViolet", "MonoVerticalViolet", "MonoHorizontalOrange", "MonoVerticalOrange", "MonoHorizontalBeige", "MonoVerticalBeige", "MonoHorizontalWarmgray", "MonoVerticalWarmgray", "MixedHorizontalYellowRed", "MixedVerticalYellowRed", "MixedHorizontalYellowGreen", "MixedVerticalYellowGreen", "MixedHorizontalYellowBlue", "MixedVerticalYellowBlue", "MixedHorizontalYellowViolet", "MixedVerticalYellowViolet", "MixedHorizontalYellowOrange", "MixedVerticalYellowOrange", "MixedHorizontalRedYellow", "MixedVerticalRedYellow", "MixedHorizontalRedGreen", "MixedVerticalRedGreen", "MixedHorizontalRedBlue", "MixedVerticalRedBlue", "MixedHorizontalRedViolet", "MixedVerticalRedViolet", "MixedHorizontalRedOrange", "MixedVerticalRedOrange", "MixedHorizontalGreenYellow", "MixedVerticalGreenYellow", "MixedHorizontalGreenRed", "MixedVerticalGreenRed", "MixedHorizontalGreenBlue", "MixedVerticalGreenBlue", "MixedHorizontalGreenViolet", "MixedVerticalGreenViolet", "MixedHorizontalGreenOrange", "MixedVerticalGreenOrange", "MixedHorizontalBlueYellow", "MixedVerticalBlueYellow", "MixedHorizontalBlueRed", "MixedVerticalBlueRed", "MixedHorizontalBlueGreen", "MixedVerticalBlueGreen", "MixedHorizontalBlueViolet", "MixedVerticalBlueViolet", "MixedHorizontalBlueOrange", "MixedVerticalBlueOrange", "MixedHorizontalVioletYellow", "MixedVerticalVioletYellow", "MixedHorizontalVioletRed", "MixedVerticalVioletRed", "MixedHorizontalVioletGreen", "MixedVerticalVioletGreen", "MixedHorizontalVioletBlue", "MixedVerticalVioletBlue", "MixedHorizontalVioletOrange", "MixedVerticalVioletOrange", "MixedHorizontalOrangeYellow", "MixedVerticalOrangeYellow", "MixedHorizontalOrangeRed", "MixedVerticalOrangeRed", "MixedHorizontalOrangeGreen", "MixedVerticalOrangeGreen", "MixedHorizontalOrangeBlue", "MixedVerticalOrangeBlue", "MixedHorizontalOrangeViolet", "MixedVerticalOrangeViolet", "_avito_bx-content_widget_promo_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PromoStyle implements Parcelable {

    @c("beige")
    public static final PromoStyle BEIGE;

    @c("blue")
    public static final PromoStyle BLUE;

    @k
    public static final Parcelable.Creator<PromoStyle> CREATOR;

    @c("green")
    public static final PromoStyle GREEN;

    @c("mixedHorizontalBlueGreen")
    public static final PromoStyle MixedHorizontalBlueGreen;

    @c("mixedHorizontalBlueOrange")
    public static final PromoStyle MixedHorizontalBlueOrange;

    @c("mixedHorizontalBlueRed")
    public static final PromoStyle MixedHorizontalBlueRed;

    @c("mixedHorizontalBlueViolet")
    public static final PromoStyle MixedHorizontalBlueViolet;

    @c("mixedHorizontalBlueYellow")
    public static final PromoStyle MixedHorizontalBlueYellow;

    @c("mixedHorizontalGreenBlue")
    public static final PromoStyle MixedHorizontalGreenBlue;

    @c("mixedHorizontalGreenOrange")
    public static final PromoStyle MixedHorizontalGreenOrange;

    @c("mixedHorizontalGreenRed")
    public static final PromoStyle MixedHorizontalGreenRed;

    @c("mixedHorizontalGreenViolet")
    public static final PromoStyle MixedHorizontalGreenViolet;

    @c("mixedHorizontalGreenYellow")
    public static final PromoStyle MixedHorizontalGreenYellow;

    @c("mixedHorizontalOrangeBlue")
    public static final PromoStyle MixedHorizontalOrangeBlue;

    @c("mixedHorizontalOrangeGreen")
    public static final PromoStyle MixedHorizontalOrangeGreen;

    @c("mixedHorizontalOrangeRed")
    public static final PromoStyle MixedHorizontalOrangeRed;

    @c("mixedHorizontalOrangeViolet")
    public static final PromoStyle MixedHorizontalOrangeViolet;

    @c("mixedHorizontalOrangeYellow")
    public static final PromoStyle MixedHorizontalOrangeYellow;

    @c("mixedHorizontalRedBlue")
    public static final PromoStyle MixedHorizontalRedBlue;

    @c("mixedHorizontalRedGreen")
    public static final PromoStyle MixedHorizontalRedGreen;

    @c("mixedHorizontalRedOrange")
    public static final PromoStyle MixedHorizontalRedOrange;

    @c("mixedHorizontalRedViolet")
    public static final PromoStyle MixedHorizontalRedViolet;

    @c("mixedHorizontalRedYellow")
    public static final PromoStyle MixedHorizontalRedYellow;

    @c("mixedHorizontalVioletBlue")
    public static final PromoStyle MixedHorizontalVioletBlue;

    @c("mixedHorizontalVioletGreen")
    public static final PromoStyle MixedHorizontalVioletGreen;

    @c("mixedHorizontalVioletOrange")
    public static final PromoStyle MixedHorizontalVioletOrange;

    @c("mixedHorizontalVioletRed")
    public static final PromoStyle MixedHorizontalVioletRed;

    @c("mixedHorizontalVioletYellow")
    public static final PromoStyle MixedHorizontalVioletYellow;

    @c("mixedHorizontalYellowBlue")
    public static final PromoStyle MixedHorizontalYellowBlue;

    @c("mixedHorizontalYellowGreen")
    public static final PromoStyle MixedHorizontalYellowGreen;

    @c("mixedHorizontalYellowOrange")
    public static final PromoStyle MixedHorizontalYellowOrange;

    @c("mixedHorizontalYellowRed")
    public static final PromoStyle MixedHorizontalYellowRed;

    @c("mixedHorizontalYellowViolet")
    public static final PromoStyle MixedHorizontalYellowViolet;

    @c("mixedVerticalBlueGreen")
    public static final PromoStyle MixedVerticalBlueGreen;

    @c("mixedVerticalBlueOrange")
    public static final PromoStyle MixedVerticalBlueOrange;

    @c("mixedVerticalBlueRed")
    public static final PromoStyle MixedVerticalBlueRed;

    @c("mixedVerticalBlueViolet")
    public static final PromoStyle MixedVerticalBlueViolet;

    @c("mixedVerticalBlueYellow")
    public static final PromoStyle MixedVerticalBlueYellow;

    @c("mixedVerticalGreenBlue")
    public static final PromoStyle MixedVerticalGreenBlue;

    @c("mixedVerticalGreenOrange")
    public static final PromoStyle MixedVerticalGreenOrange;

    @c("mixedVerticalGreenRed")
    public static final PromoStyle MixedVerticalGreenRed;

    @c("mixedVerticalGreenViolet")
    public static final PromoStyle MixedVerticalGreenViolet;

    @c("mixedVerticalGreenYellow")
    public static final PromoStyle MixedVerticalGreenYellow;

    @c("mixedVerticalOrangeBlue")
    public static final PromoStyle MixedVerticalOrangeBlue;

    @c("mixedVerticalOrangeGreen")
    public static final PromoStyle MixedVerticalOrangeGreen;

    @c("mixedVerticalOrangeRed")
    public static final PromoStyle MixedVerticalOrangeRed;

    @c("mixedVerticalOrangeViolet")
    public static final PromoStyle MixedVerticalOrangeViolet;

    @c("mixedVerticalOrangeYellow")
    public static final PromoStyle MixedVerticalOrangeYellow;

    @c("mixedVerticalRedBlue")
    public static final PromoStyle MixedVerticalRedBlue;

    @c("mixedVerticalRedGreen")
    public static final PromoStyle MixedVerticalRedGreen;

    @c("mixedVerticalRedOrange")
    public static final PromoStyle MixedVerticalRedOrange;

    @c("mixedVerticalRedViolet")
    public static final PromoStyle MixedVerticalRedViolet;

    @c("mixedVerticalRedYellow")
    public static final PromoStyle MixedVerticalRedYellow;

    @c("mixedVerticalVioletBlue")
    public static final PromoStyle MixedVerticalVioletBlue;

    @c("mixedVerticalVioletGreen")
    public static final PromoStyle MixedVerticalVioletGreen;

    @c("mixedVerticalVioletOrange")
    public static final PromoStyle MixedVerticalVioletOrange;

    @c("mixedVerticalVioletRed")
    public static final PromoStyle MixedVerticalVioletRed;

    @c("mixedVerticalVioletYellow")
    public static final PromoStyle MixedVerticalVioletYellow;

    @c("mixedVerticalYellowBlue")
    public static final PromoStyle MixedVerticalYellowBlue;

    @c("mixedVerticalYellowGreen")
    public static final PromoStyle MixedVerticalYellowGreen;

    @c("mixedVerticalYellowOrange")
    public static final PromoStyle MixedVerticalYellowOrange;

    @c("mixedVerticalYellowRed")
    public static final PromoStyle MixedVerticalYellowRed;

    @c("mixedVerticalYellowViolet")
    public static final PromoStyle MixedVerticalYellowViolet;

    @c("monoHorizontalBeige")
    public static final PromoStyle MonoHorizontalBeige;

    @c("monoHorizontalBlue")
    public static final PromoStyle MonoHorizontalBlue;

    @c("monoHorizontalGreen")
    public static final PromoStyle MonoHorizontalGreen;

    @c("monoHorizontalOrange")
    public static final PromoStyle MonoHorizontalOrange;

    @c("monoHorizontalRed")
    public static final PromoStyle MonoHorizontalRed;

    @c("monoHorizontalViolet")
    public static final PromoStyle MonoHorizontalViolet;

    @c("monoHorizontalWarmgray")
    public static final PromoStyle MonoHorizontalWarmgray;

    @c("monoHorizontalYellow")
    public static final PromoStyle MonoHorizontalYellow;

    @c("monoVerticalBeige")
    public static final PromoStyle MonoVerticalBeige;

    @c("monoVerticalBlue")
    public static final PromoStyle MonoVerticalBlue;

    @c("monoVerticalGreen")
    public static final PromoStyle MonoVerticalGreen;

    @c("monoVerticalOrange")
    public static final PromoStyle MonoVerticalOrange;

    @c("monoVerticalRed")
    public static final PromoStyle MonoVerticalRed;

    @c("monoVerticalViolet")
    public static final PromoStyle MonoVerticalViolet;

    @c("monoVerticalWarmgray")
    public static final PromoStyle MonoVerticalWarmgray;

    @c("monoVerticalYellow")
    public static final PromoStyle MonoVerticalYellow;

    @c("orange")
    public static final PromoStyle ORANGE;

    @c("red")
    public static final PromoStyle RED;

    @c("violet")
    public static final PromoStyle VIOLET;

    @c("warmgray")
    public static final PromoStyle WARMGRAY;

    @c("white")
    public static final PromoStyle WHITE;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PromoStyle[] f231609b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f231610c;

    static {
        PromoStyle promoStyle = new PromoStyle("WHITE", 0);
        WHITE = promoStyle;
        PromoStyle promoStyle2 = new PromoStyle("BLUE", 1);
        BLUE = promoStyle2;
        PromoStyle promoStyle3 = new PromoStyle("GREEN", 2);
        GREEN = promoStyle3;
        PromoStyle promoStyle4 = new PromoStyle("RED", 3);
        RED = promoStyle4;
        PromoStyle promoStyle5 = new PromoStyle("ORANGE", 4);
        ORANGE = promoStyle5;
        PromoStyle promoStyle6 = new PromoStyle("BEIGE", 5);
        BEIGE = promoStyle6;
        PromoStyle promoStyle7 = new PromoStyle("VIOLET", 6);
        VIOLET = promoStyle7;
        PromoStyle promoStyle8 = new PromoStyle("WARMGRAY", 7);
        WARMGRAY = promoStyle8;
        PromoStyle promoStyle9 = new PromoStyle("MonoHorizontalYellow", 8);
        MonoHorizontalYellow = promoStyle9;
        PromoStyle promoStyle10 = new PromoStyle("MonoVerticalYellow", 9);
        MonoVerticalYellow = promoStyle10;
        PromoStyle promoStyle11 = new PromoStyle("MonoHorizontalRed", 10);
        MonoHorizontalRed = promoStyle11;
        PromoStyle promoStyle12 = new PromoStyle("MonoVerticalRed", 11);
        MonoVerticalRed = promoStyle12;
        PromoStyle promoStyle13 = new PromoStyle("MonoHorizontalGreen", 12);
        MonoHorizontalGreen = promoStyle13;
        PromoStyle promoStyle14 = new PromoStyle("MonoVerticalGreen", 13);
        MonoVerticalGreen = promoStyle14;
        PromoStyle promoStyle15 = new PromoStyle("MonoHorizontalBlue", 14);
        MonoHorizontalBlue = promoStyle15;
        PromoStyle promoStyle16 = new PromoStyle("MonoVerticalBlue", 15);
        MonoVerticalBlue = promoStyle16;
        PromoStyle promoStyle17 = new PromoStyle("MonoHorizontalViolet", 16);
        MonoHorizontalViolet = promoStyle17;
        PromoStyle promoStyle18 = new PromoStyle("MonoVerticalViolet", 17);
        MonoVerticalViolet = promoStyle18;
        PromoStyle promoStyle19 = new PromoStyle("MonoHorizontalOrange", 18);
        MonoHorizontalOrange = promoStyle19;
        PromoStyle promoStyle20 = new PromoStyle("MonoVerticalOrange", 19);
        MonoVerticalOrange = promoStyle20;
        PromoStyle promoStyle21 = new PromoStyle("MonoHorizontalBeige", 20);
        MonoHorizontalBeige = promoStyle21;
        PromoStyle promoStyle22 = new PromoStyle("MonoVerticalBeige", 21);
        MonoVerticalBeige = promoStyle22;
        PromoStyle promoStyle23 = new PromoStyle("MonoHorizontalWarmgray", 22);
        MonoHorizontalWarmgray = promoStyle23;
        PromoStyle promoStyle24 = new PromoStyle("MonoVerticalWarmgray", 23);
        MonoVerticalWarmgray = promoStyle24;
        PromoStyle promoStyle25 = new PromoStyle("MixedHorizontalYellowRed", 24);
        MixedHorizontalYellowRed = promoStyle25;
        PromoStyle promoStyle26 = new PromoStyle("MixedVerticalYellowRed", 25);
        MixedVerticalYellowRed = promoStyle26;
        PromoStyle promoStyle27 = new PromoStyle("MixedHorizontalYellowGreen", 26);
        MixedHorizontalYellowGreen = promoStyle27;
        PromoStyle promoStyle28 = new PromoStyle("MixedVerticalYellowGreen", 27);
        MixedVerticalYellowGreen = promoStyle28;
        PromoStyle promoStyle29 = new PromoStyle("MixedHorizontalYellowBlue", 28);
        MixedHorizontalYellowBlue = promoStyle29;
        PromoStyle promoStyle30 = new PromoStyle("MixedVerticalYellowBlue", 29);
        MixedVerticalYellowBlue = promoStyle30;
        PromoStyle promoStyle31 = new PromoStyle("MixedHorizontalYellowViolet", 30);
        MixedHorizontalYellowViolet = promoStyle31;
        PromoStyle promoStyle32 = new PromoStyle("MixedVerticalYellowViolet", 31);
        MixedVerticalYellowViolet = promoStyle32;
        PromoStyle promoStyle33 = new PromoStyle("MixedHorizontalYellowOrange", 32);
        MixedHorizontalYellowOrange = promoStyle33;
        PromoStyle promoStyle34 = new PromoStyle("MixedVerticalYellowOrange", 33);
        MixedVerticalYellowOrange = promoStyle34;
        PromoStyle promoStyle35 = new PromoStyle("MixedHorizontalRedYellow", 34);
        MixedHorizontalRedYellow = promoStyle35;
        PromoStyle promoStyle36 = new PromoStyle("MixedVerticalRedYellow", 35);
        MixedVerticalRedYellow = promoStyle36;
        PromoStyle promoStyle37 = new PromoStyle("MixedHorizontalRedGreen", 36);
        MixedHorizontalRedGreen = promoStyle37;
        PromoStyle promoStyle38 = new PromoStyle("MixedVerticalRedGreen", 37);
        MixedVerticalRedGreen = promoStyle38;
        PromoStyle promoStyle39 = new PromoStyle("MixedHorizontalRedBlue", 38);
        MixedHorizontalRedBlue = promoStyle39;
        PromoStyle promoStyle40 = new PromoStyle("MixedVerticalRedBlue", 39);
        MixedVerticalRedBlue = promoStyle40;
        PromoStyle promoStyle41 = new PromoStyle("MixedHorizontalRedViolet", 40);
        MixedHorizontalRedViolet = promoStyle41;
        PromoStyle promoStyle42 = new PromoStyle("MixedVerticalRedViolet", 41);
        MixedVerticalRedViolet = promoStyle42;
        PromoStyle promoStyle43 = new PromoStyle("MixedHorizontalRedOrange", 42);
        MixedHorizontalRedOrange = promoStyle43;
        PromoStyle promoStyle44 = new PromoStyle("MixedVerticalRedOrange", 43);
        MixedVerticalRedOrange = promoStyle44;
        PromoStyle promoStyle45 = new PromoStyle("MixedHorizontalGreenYellow", 44);
        MixedHorizontalGreenYellow = promoStyle45;
        PromoStyle promoStyle46 = new PromoStyle("MixedVerticalGreenYellow", 45);
        MixedVerticalGreenYellow = promoStyle46;
        PromoStyle promoStyle47 = new PromoStyle("MixedHorizontalGreenRed", 46);
        MixedHorizontalGreenRed = promoStyle47;
        PromoStyle promoStyle48 = new PromoStyle("MixedVerticalGreenRed", 47);
        MixedVerticalGreenRed = promoStyle48;
        PromoStyle promoStyle49 = new PromoStyle("MixedHorizontalGreenBlue", 48);
        MixedHorizontalGreenBlue = promoStyle49;
        PromoStyle promoStyle50 = new PromoStyle("MixedVerticalGreenBlue", 49);
        MixedVerticalGreenBlue = promoStyle50;
        PromoStyle promoStyle51 = new PromoStyle("MixedHorizontalGreenViolet", 50);
        MixedHorizontalGreenViolet = promoStyle51;
        PromoStyle promoStyle52 = new PromoStyle("MixedVerticalGreenViolet", 51);
        MixedVerticalGreenViolet = promoStyle52;
        PromoStyle promoStyle53 = new PromoStyle("MixedHorizontalGreenOrange", 52);
        MixedHorizontalGreenOrange = promoStyle53;
        PromoStyle promoStyle54 = new PromoStyle("MixedVerticalGreenOrange", 53);
        MixedVerticalGreenOrange = promoStyle54;
        PromoStyle promoStyle55 = new PromoStyle("MixedHorizontalBlueYellow", 54);
        MixedHorizontalBlueYellow = promoStyle55;
        PromoStyle promoStyle56 = new PromoStyle("MixedVerticalBlueYellow", 55);
        MixedVerticalBlueYellow = promoStyle56;
        PromoStyle promoStyle57 = new PromoStyle("MixedHorizontalBlueRed", 56);
        MixedHorizontalBlueRed = promoStyle57;
        PromoStyle promoStyle58 = new PromoStyle("MixedVerticalBlueRed", 57);
        MixedVerticalBlueRed = promoStyle58;
        PromoStyle promoStyle59 = new PromoStyle("MixedHorizontalBlueGreen", 58);
        MixedHorizontalBlueGreen = promoStyle59;
        PromoStyle promoStyle60 = new PromoStyle("MixedVerticalBlueGreen", 59);
        MixedVerticalBlueGreen = promoStyle60;
        PromoStyle promoStyle61 = new PromoStyle("MixedHorizontalBlueViolet", 60);
        MixedHorizontalBlueViolet = promoStyle61;
        PromoStyle promoStyle62 = new PromoStyle("MixedVerticalBlueViolet", 61);
        MixedVerticalBlueViolet = promoStyle62;
        PromoStyle promoStyle63 = new PromoStyle("MixedHorizontalBlueOrange", 62);
        MixedHorizontalBlueOrange = promoStyle63;
        PromoStyle promoStyle64 = new PromoStyle("MixedVerticalBlueOrange", 63);
        MixedVerticalBlueOrange = promoStyle64;
        PromoStyle promoStyle65 = new PromoStyle("MixedHorizontalVioletYellow", 64);
        MixedHorizontalVioletYellow = promoStyle65;
        PromoStyle promoStyle66 = new PromoStyle("MixedVerticalVioletYellow", 65);
        MixedVerticalVioletYellow = promoStyle66;
        PromoStyle promoStyle67 = new PromoStyle("MixedHorizontalVioletRed", 66);
        MixedHorizontalVioletRed = promoStyle67;
        PromoStyle promoStyle68 = new PromoStyle("MixedVerticalVioletRed", 67);
        MixedVerticalVioletRed = promoStyle68;
        PromoStyle promoStyle69 = new PromoStyle("MixedHorizontalVioletGreen", 68);
        MixedHorizontalVioletGreen = promoStyle69;
        PromoStyle promoStyle70 = new PromoStyle("MixedVerticalVioletGreen", 69);
        MixedVerticalVioletGreen = promoStyle70;
        PromoStyle promoStyle71 = new PromoStyle("MixedHorizontalVioletBlue", 70);
        MixedHorizontalVioletBlue = promoStyle71;
        PromoStyle promoStyle72 = new PromoStyle("MixedVerticalVioletBlue", 71);
        MixedVerticalVioletBlue = promoStyle72;
        PromoStyle promoStyle73 = new PromoStyle("MixedHorizontalVioletOrange", 72);
        MixedHorizontalVioletOrange = promoStyle73;
        PromoStyle promoStyle74 = new PromoStyle("MixedVerticalVioletOrange", 73);
        MixedVerticalVioletOrange = promoStyle74;
        PromoStyle promoStyle75 = new PromoStyle("MixedHorizontalOrangeYellow", 74);
        MixedHorizontalOrangeYellow = promoStyle75;
        PromoStyle promoStyle76 = new PromoStyle("MixedVerticalOrangeYellow", 75);
        MixedVerticalOrangeYellow = promoStyle76;
        PromoStyle promoStyle77 = new PromoStyle("MixedHorizontalOrangeRed", 76);
        MixedHorizontalOrangeRed = promoStyle77;
        PromoStyle promoStyle78 = new PromoStyle("MixedVerticalOrangeRed", 77);
        MixedVerticalOrangeRed = promoStyle78;
        PromoStyle promoStyle79 = new PromoStyle("MixedHorizontalOrangeGreen", 78);
        MixedHorizontalOrangeGreen = promoStyle79;
        PromoStyle promoStyle80 = new PromoStyle("MixedVerticalOrangeGreen", 79);
        MixedVerticalOrangeGreen = promoStyle80;
        PromoStyle promoStyle81 = new PromoStyle("MixedHorizontalOrangeBlue", 80);
        MixedHorizontalOrangeBlue = promoStyle81;
        PromoStyle promoStyle82 = new PromoStyle("MixedVerticalOrangeBlue", 81);
        MixedVerticalOrangeBlue = promoStyle82;
        PromoStyle promoStyle83 = new PromoStyle("MixedHorizontalOrangeViolet", 82);
        MixedHorizontalOrangeViolet = promoStyle83;
        PromoStyle promoStyle84 = new PromoStyle("MixedVerticalOrangeViolet", 83);
        MixedVerticalOrangeViolet = promoStyle84;
        PromoStyle[] promoStyleArr = {promoStyle, promoStyle2, promoStyle3, promoStyle4, promoStyle5, promoStyle6, promoStyle7, promoStyle8, promoStyle9, promoStyle10, promoStyle11, promoStyle12, promoStyle13, promoStyle14, promoStyle15, promoStyle16, promoStyle17, promoStyle18, promoStyle19, promoStyle20, promoStyle21, promoStyle22, promoStyle23, promoStyle24, promoStyle25, promoStyle26, promoStyle27, promoStyle28, promoStyle29, promoStyle30, promoStyle31, promoStyle32, promoStyle33, promoStyle34, promoStyle35, promoStyle36, promoStyle37, promoStyle38, promoStyle39, promoStyle40, promoStyle41, promoStyle42, promoStyle43, promoStyle44, promoStyle45, promoStyle46, promoStyle47, promoStyle48, promoStyle49, promoStyle50, promoStyle51, promoStyle52, promoStyle53, promoStyle54, promoStyle55, promoStyle56, promoStyle57, promoStyle58, promoStyle59, promoStyle60, promoStyle61, promoStyle62, promoStyle63, promoStyle64, promoStyle65, promoStyle66, promoStyle67, promoStyle68, promoStyle69, promoStyle70, promoStyle71, promoStyle72, promoStyle73, promoStyle74, promoStyle75, promoStyle76, promoStyle77, promoStyle78, promoStyle79, promoStyle80, promoStyle81, promoStyle82, promoStyle83, promoStyle84};
        f231609b = promoStyleArr;
        f231610c = kotlin.enums.c.a(promoStyleArr);
        CREATOR = new Parcelable.Creator<PromoStyle>() { // from class: com.avito.android.promo.PromoStyle.a
            @Override // android.os.Parcelable.Creator
            public final PromoStyle createFromParcel(Parcel parcel) {
                return PromoStyle.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PromoStyle[] newArray(int i12) {
                return new PromoStyle[i12];
            }
        };
    }

    private PromoStyle(String str, int i12) {
    }

    public static PromoStyle valueOf(String str) {
        return (PromoStyle) Enum.valueOf(PromoStyle.class, str);
    }

    public static PromoStyle[] values() {
        return (PromoStyle[]) f231609b.clone();
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
