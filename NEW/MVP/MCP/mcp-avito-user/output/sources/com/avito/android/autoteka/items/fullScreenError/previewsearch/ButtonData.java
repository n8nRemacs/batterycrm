package com.avito.android.autoteka.items.fullScreenError.previewsearch;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchAction;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PreviewSearchFullScreenErrorItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/items/fullScreenError/previewsearch/ButtonData;", "Landroid/os/Parcelable;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ButtonData implements Parcelable {

    @k
    public static final Parcelable.Creator<ButtonData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PrintableText f96788b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AutotekaPreviewSearchAction f96789c;

    /* compiled from: PreviewSearchFullScreenErrorItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ButtonData> {
        @Override // android.os.Parcelable.Creator
        public final ButtonData createFromParcel(Parcel parcel) {
            return new ButtonData((PrintableText) parcel.readParcelable(ButtonData.class.getClassLoader()), (AutotekaPreviewSearchAction) parcel.readParcelable(ButtonData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ButtonData[] newArray(int i12) {
            return new ButtonData[i12];
        }
    }

    public ButtonData(@k PrintableText printableText, @k AutotekaPreviewSearchAction autotekaPreviewSearchAction) {
        this.f96788b = printableText;
        this.f96789c = autotekaPreviewSearchAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonData)) {
            return false;
        }
        ButtonData buttonData = (ButtonData) obj;
        return L.f(this.f96788b, buttonData.f96788b) && L.f(this.f96789c, buttonData.f96789c);
    }

    public final int hashCode() {
        return this.f96789c.hashCode() + (this.f96788b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "ButtonData(buttonTextRes=" + this.f96788b + ", action=" + this.f96789c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f96788b, i12);
        parcel.writeParcelable(this.f96789c, i12);
    }
}
