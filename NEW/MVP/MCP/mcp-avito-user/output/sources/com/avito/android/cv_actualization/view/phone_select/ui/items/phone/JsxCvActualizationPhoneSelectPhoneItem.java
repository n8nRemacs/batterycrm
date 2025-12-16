package com.avito.android.cv_actualization.view.phone_select.ui.items.phone;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: JsxCvActualizationPhoneSelectPhoneItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_select/ui/items/phone/JsxCvActualizationPhoneSelectPhoneItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class JsxCvActualizationPhoneSelectPhoneItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<JsxCvActualizationPhoneSelectPhoneItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f131442b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f131443c;

    /* compiled from: JsxCvActualizationPhoneSelectPhoneItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JsxCvActualizationPhoneSelectPhoneItem> {
        @Override // android.os.Parcelable.Creator
        public final JsxCvActualizationPhoneSelectPhoneItem createFromParcel(Parcel parcel) {
            return new JsxCvActualizationPhoneSelectPhoneItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final JsxCvActualizationPhoneSelectPhoneItem[] newArray(int i12) {
            return new JsxCvActualizationPhoneSelectPhoneItem[i12];
        }
    }

    public JsxCvActualizationPhoneSelectPhoneItem(@k String str, @k String str2) {
        this.f131442b = str;
        this.f131443c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsxCvActualizationPhoneSelectPhoneItem)) {
            return false;
        }
        JsxCvActualizationPhoneSelectPhoneItem jsxCvActualizationPhoneSelectPhoneItem = (JsxCvActualizationPhoneSelectPhoneItem) obj;
        return L.f(this.f131442b, jsxCvActualizationPhoneSelectPhoneItem.f131442b) && L.f(this.f131443c, jsxCvActualizationPhoneSelectPhoneItem.f131443c);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF130083d() {
        return this.f131443c;
    }

    public final int hashCode() {
        return this.f131443c.hashCode() + (this.f131442b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JsxCvActualizationPhoneSelectPhoneItem(title=");
        sb2.append(this.f131442b);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f131443c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f131442b);
        parcel.writeString(this.f131443c);
    }

    public /* synthetic */ JsxCvActualizationPhoneSelectPhoneItem(String str, String str2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? "PHONE_ITEM" : str2);
    }
}
