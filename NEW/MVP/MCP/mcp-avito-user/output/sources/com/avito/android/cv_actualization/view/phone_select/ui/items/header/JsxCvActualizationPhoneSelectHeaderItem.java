package com.avito.android.cv_actualization.view.phone_select.ui.items.header;

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

/* compiled from: JsxCvActualizationPhoneSelectHeaderItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_select/ui/items/header/JsxCvActualizationPhoneSelectHeaderItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class JsxCvActualizationPhoneSelectHeaderItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<JsxCvActualizationPhoneSelectHeaderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PrintableText f131426b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f131427c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f131428d;

    /* compiled from: JsxCvActualizationPhoneSelectHeaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JsxCvActualizationPhoneSelectHeaderItem> {
        @Override // android.os.Parcelable.Creator
        public final JsxCvActualizationPhoneSelectHeaderItem createFromParcel(Parcel parcel) {
            return new JsxCvActualizationPhoneSelectHeaderItem((PrintableText) parcel.readParcelable(JsxCvActualizationPhoneSelectHeaderItem.class.getClassLoader()), (PrintableText) parcel.readParcelable(JsxCvActualizationPhoneSelectHeaderItem.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final JsxCvActualizationPhoneSelectHeaderItem[] newArray(int i12) {
            return new JsxCvActualizationPhoneSelectHeaderItem[i12];
        }
    }

    public JsxCvActualizationPhoneSelectHeaderItem() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsxCvActualizationPhoneSelectHeaderItem)) {
            return false;
        }
        JsxCvActualizationPhoneSelectHeaderItem jsxCvActualizationPhoneSelectHeaderItem = (JsxCvActualizationPhoneSelectHeaderItem) obj;
        return L.f(this.f131426b, jsxCvActualizationPhoneSelectHeaderItem.f131426b) && L.f(this.f131427c, jsxCvActualizationPhoneSelectHeaderItem.f131427c) && L.f(this.f131428d, jsxCvActualizationPhoneSelectHeaderItem.f131428d);
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
        return this.f131428d;
    }

    public final int hashCode() {
        return this.f131428d.hashCode() + com.avito.android.actions_sheet.a.f(this.f131427c, this.f131426b.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JsxCvActualizationPhoneSelectHeaderItem(title=");
        sb2.append(this.f131426b);
        sb2.append(", description=");
        sb2.append(this.f131427c);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f131428d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f131426b, i12);
        parcel.writeParcelable(this.f131427c, i12);
        parcel.writeString(this.f131428d);
    }

    public JsxCvActualizationPhoneSelectHeaderItem(@k PrintableText printableText, @k PrintableText printableText2, @k String str) {
        this.f131426b = printableText;
        this.f131427c = printableText2;
        this.f131428d = str;
    }

    public /* synthetic */ JsxCvActualizationPhoneSelectHeaderItem(PrintableText printableText, PrintableText printableText2, String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? com.avito.android.printable_text.b.c(R.string.jsx_cv_actualization_phone_select_header_title, new Serializable[0]) : printableText, (i12 & 2) != 0 ? com.avito.android.printable_text.b.c(R.string.jsx_cv_actualization_phone_select_header_description, new Serializable[0]) : printableText2, (i12 & 4) != 0 ? "PHONE_HEADER_ITEM" : str);
    }
}
