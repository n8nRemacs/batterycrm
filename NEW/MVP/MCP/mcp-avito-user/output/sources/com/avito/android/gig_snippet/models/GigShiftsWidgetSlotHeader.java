package com.avito.android.gig_snippet.models;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GigShiftsWidgetItem.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotHeader;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotHeader$TitleColor;", "titleColor", "<init>", "(Ljava/lang/String;Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotHeader$TitleColor;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotHeader$TitleColor;", "c", "()Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotHeader$TitleColor;", "TitleColor", "_avito_gig_snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GigShiftsWidgetSlotHeader implements Parcelable {

    @k
    public static final Parcelable.Creator<GigShiftsWidgetSlotHeader> CREATOR = new a();

    @c("title")
    @k
    private final String title;

    @c("titleColor")
    @k
    private final TitleColor titleColor;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GigShiftsWidgetItem.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotHeader$TitleColor;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Green", "Black", "Red", "_avito_gig_snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TitleColor {

        @c(AvitoMapMarkerKt.AMENITY_TYPE_BLACK)
        public static final TitleColor Black;

        @c("green")
        public static final TitleColor Green;

        @c("red")
        public static final TitleColor Red;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ TitleColor[] f161075b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f161076c;

        static {
            TitleColor titleColor = new TitleColor("Green", 0, "green");
            Green = titleColor;
            TitleColor titleColor2 = new TitleColor("Black", 1, AvitoMapMarkerKt.AMENITY_TYPE_BLACK);
            Black = titleColor2;
            TitleColor titleColor3 = new TitleColor("Red", 2, "red");
            Red = titleColor3;
            TitleColor[] titleColorArr = {titleColor, titleColor2, titleColor3};
            f161075b = titleColorArr;
            f161076c = kotlin.enums.c.a(titleColorArr);
        }

        private TitleColor(String str, int i12, String str2) {
        }

        public static TitleColor valueOf(String str) {
            return (TitleColor) Enum.valueOf(TitleColor.class, str);
        }

        public static TitleColor[] values() {
            return (TitleColor[]) f161075b.clone();
        }
    }

    /* compiled from: GigShiftsWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigShiftsWidgetSlotHeader> {
        @Override // android.os.Parcelable.Creator
        public final GigShiftsWidgetSlotHeader createFromParcel(Parcel parcel) {
            return new GigShiftsWidgetSlotHeader(parcel.readString(), TitleColor.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final GigShiftsWidgetSlotHeader[] newArray(int i12) {
            return new GigShiftsWidgetSlotHeader[i12];
        }
    }

    public GigShiftsWidgetSlotHeader(@k String str, @k TitleColor titleColor) {
        this.title = str;
        this.titleColor = titleColor;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final TitleColor getTitleColor() {
        return this.titleColor;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.titleColor.name());
    }

    public /* synthetic */ GigShiftsWidgetSlotHeader(String str, TitleColor titleColor, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? TitleColor.Black : titleColor);
    }
}
