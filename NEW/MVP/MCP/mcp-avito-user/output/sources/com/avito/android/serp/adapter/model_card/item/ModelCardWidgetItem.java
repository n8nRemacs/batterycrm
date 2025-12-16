package com.avito.android.serp.adapter.model_card.item;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ModelCardWidgetItem.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/model_card/item/ModelCardWidgetItem;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ModelCardWidgetItem implements Parcelable {

    @k
    public static final Parcelable.Creator<ModelCardWidgetItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f270418b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DeepLink f270419c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f270420d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final UniversalImage f270421e;

    /* compiled from: ModelCardWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ModelCardWidgetItem> {
        @Override // android.os.Parcelable.Creator
        public final ModelCardWidgetItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            return new ModelCardWidgetItem((DeepLink) parcel.readParcelable(ModelCardWidgetItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(ModelCardWidgetItem.class.getClassLoader()), string, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ModelCardWidgetItem[] newArray(int i12) {
            return new ModelCardWidgetItem[i12];
        }
    }

    public ModelCardWidgetItem(@l DeepLink deepLink, @l UniversalImage universalImage, @k String str, @k String str2) {
        this.f270418b = str;
        this.f270419c = deepLink;
        this.f270420d = str2;
        this.f270421e = universalImage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModelCardWidgetItem)) {
            return false;
        }
        ModelCardWidgetItem modelCardWidgetItem = (ModelCardWidgetItem) obj;
        return L.f(this.f270418b, modelCardWidgetItem.f270418b) && L.f(this.f270419c, modelCardWidgetItem.f270419c) && L.f(this.f270420d, modelCardWidgetItem.f270420d) && L.f(this.f270421e, modelCardWidgetItem.f270421e);
    }

    public final int hashCode() {
        int iHashCode = this.f270418b.hashCode() * 31;
        DeepLink deepLink = this.f270419c;
        int iD2 = H.d((iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.f270420d);
        UniversalImage universalImage = this.f270421e;
        return iD2 + (universalImage != null ? universalImage.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ModelCardWidgetItem(title=");
        sb2.append(this.f270418b);
        sb2.append(", actionDeeplink=");
        sb2.append(this.f270419c);
        sb2.append(", subtitle=");
        sb2.append(this.f270420d);
        sb2.append(", image=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f270421e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f270418b);
        parcel.writeParcelable(this.f270419c, i12);
        parcel.writeString(this.f270420d);
        parcel.writeParcelable(this.f270421e, i12);
    }
}
