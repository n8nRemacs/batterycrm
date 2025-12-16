package com.avito.android.cv_actualization.view.phone_select.ui.items.error;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: JsxCvActualizationPhoneSelectErrorItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_select/ui/items/error/JsxCvActualizationPhoneSelectErrorItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class JsxCvActualizationPhoneSelectErrorItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<JsxCvActualizationPhoneSelectErrorItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f131416b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f131417c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f131418d;

    /* compiled from: JsxCvActualizationPhoneSelectErrorItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JsxCvActualizationPhoneSelectErrorItem> {
        @Override // android.os.Parcelable.Creator
        public final JsxCvActualizationPhoneSelectErrorItem createFromParcel(Parcel parcel) {
            return new JsxCvActualizationPhoneSelectErrorItem(parcel.readInt(), (PrintableText) parcel.readParcelable(JsxCvActualizationPhoneSelectErrorItem.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final JsxCvActualizationPhoneSelectErrorItem[] newArray(int i12) {
            return new JsxCvActualizationPhoneSelectErrorItem[i12];
        }
    }

    public JsxCvActualizationPhoneSelectErrorItem() {
        this(0, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsxCvActualizationPhoneSelectErrorItem)) {
            return false;
        }
        JsxCvActualizationPhoneSelectErrorItem jsxCvActualizationPhoneSelectErrorItem = (JsxCvActualizationPhoneSelectErrorItem) obj;
        return this.f131416b == jsxCvActualizationPhoneSelectErrorItem.f131416b && L.f(this.f131417c, jsxCvActualizationPhoneSelectErrorItem.f131417c) && L.f(this.f131418d, jsxCvActualizationPhoneSelectErrorItem.f131418d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85686c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF115821b() {
        return this.f131418d;
    }

    public final int hashCode() {
        return this.f131418d.hashCode() + com.avito.android.actions_sheet.a.f(this.f131417c, Integer.hashCode(this.f131416b) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JsxCvActualizationPhoneSelectErrorItem(iconResAttr=");
        sb2.append(this.f131416b);
        sb2.append(", title=");
        sb2.append(this.f131417c);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f131418d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f131416b);
        parcel.writeParcelable(this.f131417c, i12);
        parcel.writeString(this.f131418d);
    }

    public JsxCvActualizationPhoneSelectErrorItem(int i12, @k PrintableText printableText, @k String str) {
        this.f131416b = i12;
        this.f131417c = printableText;
        this.f131418d = str;
    }

    public /* synthetic */ JsxCvActualizationPhoneSelectErrorItem(int i12, PrintableText printableText, String str, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? R.attr.img_unknownError : i12, (i13 & 2) != 0 ? com.avito.android.printable_text.b.c(R.string.jsx_cv_actualization_phone_select_error_title, new Serializable[0]) : printableText, (i13 & 4) != 0 ? "PHONE_ERROR_ITEM" : str);
    }
}
