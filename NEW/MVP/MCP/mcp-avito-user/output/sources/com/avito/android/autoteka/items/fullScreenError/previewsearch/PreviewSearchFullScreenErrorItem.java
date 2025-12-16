package com.avito.android.autoteka.items.fullScreenError.previewsearch;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.autoteka.domain.AutotekaItems;
import com.avito.android.autoteka.helpers.AutotekaItem;
import com.avito.android.printable_text.PrintableText;
import com.avito.conveyor_item.a;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PreviewSearchFullScreenErrorItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/items/fullScreenError/previewsearch/PreviewSearchFullScreenErrorItem;", "Lcom/avito/android/autoteka/helpers/AutotekaItem;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PreviewSearchFullScreenErrorItem implements AutotekaItem {

    @k
    public static final Parcelable.Creator<PreviewSearchFullScreenErrorItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f96790b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final PrintableText f96791c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PrintableText f96792d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f96793e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final ButtonData f96794f;

    /* compiled from: PreviewSearchFullScreenErrorItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PreviewSearchFullScreenErrorItem> {
        @Override // android.os.Parcelable.Creator
        public final PreviewSearchFullScreenErrorItem createFromParcel(Parcel parcel) {
            return new PreviewSearchFullScreenErrorItem(parcel.readString(), (PrintableText) parcel.readParcelable(PreviewSearchFullScreenErrorItem.class.getClassLoader()), (PrintableText) parcel.readParcelable(PreviewSearchFullScreenErrorItem.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? ButtonData.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final PreviewSearchFullScreenErrorItem[] newArray(int i12) {
            return new PreviewSearchFullScreenErrorItem[i12];
        }
    }

    public PreviewSearchFullScreenErrorItem(@k String str, @l PrintableText printableText, @k PrintableText printableText2, @InterfaceC42165v @l Integer num, @l ButtonData buttonData) {
        this.f96790b = str;
        this.f96791c = printableText;
        this.f96792d = printableText2;
        this.f96793e = num;
        this.f96794f = buttonData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewSearchFullScreenErrorItem)) {
            return false;
        }
        PreviewSearchFullScreenErrorItem previewSearchFullScreenErrorItem = (PreviewSearchFullScreenErrorItem) obj;
        return L.f(this.f96790b, previewSearchFullScreenErrorItem.f96790b) && L.f(this.f96791c, previewSearchFullScreenErrorItem.f96791c) && L.f(this.f96792d, previewSearchFullScreenErrorItem.f96792d) && L.f(this.f96793e, previewSearchFullScreenErrorItem.f96793e) && L.f(this.f96794f, previewSearchFullScreenErrorItem.f96794f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80596b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF80597c() {
        return this.f96790b;
    }

    public final int hashCode() {
        int iHashCode = this.f96790b.hashCode() * 31;
        PrintableText printableText = this.f96791c;
        int iF2 = com.avito.android.actions_sheet.a.f(this.f96792d, (iHashCode + (printableText == null ? 0 : printableText.hashCode())) * 31, 31);
        Integer num = this.f96793e;
        int iHashCode2 = (iF2 + (num == null ? 0 : num.hashCode())) * 31;
        ButtonData buttonData = this.f96794f;
        return iHashCode2 + (buttonData != null ? buttonData.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "PreviewSearchFullScreenErrorItem(stringId=" + this.f96790b + ", title=" + this.f96791c + ", text=" + this.f96792d + ", imageRes=" + this.f96793e + ", buttonData=" + this.f96794f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f96790b);
        parcel.writeParcelable(this.f96791c, i12);
        parcel.writeParcelable(this.f96792d, i12);
        Integer num = this.f96793e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        ButtonData buttonData = this.f96794f;
        if (buttonData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonData.writeToParcel(parcel, i12);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PreviewSearchFullScreenErrorItem(String str, PrintableText printableText, PrintableText printableText2, Integer num, ButtonData buttonData, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            AutotekaItems[] autotekaItemsArr = AutotekaItems.f96627b;
            str = "ITEM_PREVIEW_SEARCH_FULL_SCREEN_ERROR";
        }
        this(str, printableText, printableText2, (i12 & 8) != 0 ? null : num, (i12 & 16) != 0 ? null : buttonData);
    }
}
