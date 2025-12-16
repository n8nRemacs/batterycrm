package com.avito.android.cv_actualization.view.phone_select.ui.items.loading;

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

/* compiled from: JsxCvActualizationPhoneSelectLoadingItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_select/ui/items/loading/JsxCvActualizationPhoneSelectLoadingItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class JsxCvActualizationPhoneSelectLoadingItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<JsxCvActualizationPhoneSelectLoadingItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f131436b;

    /* compiled from: JsxCvActualizationPhoneSelectLoadingItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JsxCvActualizationPhoneSelectLoadingItem> {
        @Override // android.os.Parcelable.Creator
        public final JsxCvActualizationPhoneSelectLoadingItem createFromParcel(Parcel parcel) {
            return new JsxCvActualizationPhoneSelectLoadingItem(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final JsxCvActualizationPhoneSelectLoadingItem[] newArray(int i12) {
            return new JsxCvActualizationPhoneSelectLoadingItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JsxCvActualizationPhoneSelectLoadingItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof JsxCvActualizationPhoneSelectLoadingItem) && L.f(this.f131436b, ((JsxCvActualizationPhoneSelectLoadingItem) obj).f131436b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83624b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF130375g() {
        return this.f131436b;
    }

    public final int hashCode() {
        return this.f131436b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("JsxCvActualizationPhoneSelectLoadingItem(stringId="), this.f131436b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f131436b);
    }

    public JsxCvActualizationPhoneSelectLoadingItem(@k String str) {
        this.f131436b = str;
    }

    public /* synthetic */ JsxCvActualizationPhoneSelectLoadingItem(String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "PHONE_LOADING_ITEM" : str);
    }
}
