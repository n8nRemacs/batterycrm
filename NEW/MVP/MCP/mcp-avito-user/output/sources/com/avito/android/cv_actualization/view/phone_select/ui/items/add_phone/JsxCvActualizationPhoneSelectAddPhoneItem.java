package com.avito.android.cv_actualization.view.phone_select.ui.items.add_phone;

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

/* compiled from: JsxCvActualizationPhoneSelectAddPhoneItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_select/ui/items/add_phone/JsxCvActualizationPhoneSelectAddPhoneItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class JsxCvActualizationPhoneSelectAddPhoneItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<JsxCvActualizationPhoneSelectAddPhoneItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PrintableText f131405b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f131406c;

    /* compiled from: JsxCvActualizationPhoneSelectAddPhoneItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JsxCvActualizationPhoneSelectAddPhoneItem> {
        @Override // android.os.Parcelable.Creator
        public final JsxCvActualizationPhoneSelectAddPhoneItem createFromParcel(Parcel parcel) {
            return new JsxCvActualizationPhoneSelectAddPhoneItem(parcel.readString(), (PrintableText) parcel.readParcelable(JsxCvActualizationPhoneSelectAddPhoneItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final JsxCvActualizationPhoneSelectAddPhoneItem[] newArray(int i12) {
            return new JsxCvActualizationPhoneSelectAddPhoneItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JsxCvActualizationPhoneSelectAddPhoneItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsxCvActualizationPhoneSelectAddPhoneItem)) {
            return false;
        }
        JsxCvActualizationPhoneSelectAddPhoneItem jsxCvActualizationPhoneSelectAddPhoneItem = (JsxCvActualizationPhoneSelectAddPhoneItem) obj;
        return L.f(this.f131405b, jsxCvActualizationPhoneSelectAddPhoneItem.f131405b) && L.f(this.f131406c, jsxCvActualizationPhoneSelectAddPhoneItem.f131406c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123912b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF130049b() {
        return this.f131406c;
    }

    public final int hashCode() {
        return this.f131406c.hashCode() + (this.f131405b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JsxCvActualizationPhoneSelectAddPhoneItem(title=");
        sb2.append(this.f131405b);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f131406c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f131405b, i12);
        parcel.writeString(this.f131406c);
    }

    public JsxCvActualizationPhoneSelectAddPhoneItem(@k String str, @k PrintableText printableText) {
        this.f131405b = printableText;
        this.f131406c = str;
    }

    public /* synthetic */ JsxCvActualizationPhoneSelectAddPhoneItem(PrintableText printableText, String str, int i12, C42822w c42822w) {
        this((i12 & 2) != 0 ? "ADD_PHONE_ITEM" : str, (i12 & 1) != 0 ? com.avito.android.printable_text.b.c(R.string.jsx_cv_actualization_phone_select_add_phone_title, new Serializable[0]) : printableText);
    }
}
