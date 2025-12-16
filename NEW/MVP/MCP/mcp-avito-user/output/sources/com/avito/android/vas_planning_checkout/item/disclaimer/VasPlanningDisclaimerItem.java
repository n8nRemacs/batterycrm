package com.avito.android.vas_planning_checkout.item.disclaimer;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VasPlanningDisclaimerItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_checkout/item/disclaimer/VasPlanningDisclaimerItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VasPlanningDisclaimerItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<VasPlanningDisclaimerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f322950b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f322951c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextStyle f322952d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final UniversalImage f322953e;

    /* compiled from: VasPlanningDisclaimerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VasPlanningDisclaimerItem> {
        @Override // android.os.Parcelable.Creator
        public final VasPlanningDisclaimerItem createFromParcel(Parcel parcel) {
            return new VasPlanningDisclaimerItem(parcel.readString(), (AttributedText) parcel.readParcelable(VasPlanningDisclaimerItem.class.getClassLoader()), TextStyle.valueOf(parcel.readString()), (UniversalImage) parcel.readParcelable(VasPlanningDisclaimerItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final VasPlanningDisclaimerItem[] newArray(int i12) {
            return new VasPlanningDisclaimerItem[i12];
        }
    }

    public VasPlanningDisclaimerItem(@k String str, @k AttributedText attributedText, @k TextStyle textStyle, @l UniversalImage universalImage) {
        this.f322950b = str;
        this.f322951c = attributedText;
        this.f322952d = textStyle;
        this.f322953e = universalImage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF273715b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF320397b() {
        return this.f322950b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f322950b);
        parcel.writeParcelable(this.f322951c, i12);
        parcel.writeString(this.f322952d.name());
        parcel.writeParcelable(this.f322953e, i12);
    }

    public /* synthetic */ VasPlanningDisclaimerItem(String str, AttributedText attributedText, TextStyle textStyle, UniversalImage universalImage, int i12, C42822w c42822w) {
        this(str, attributedText, (i12 & 4) != 0 ? TextStyle.f322947b : textStyle, (i12 & 8) != 0 ? null : universalImage);
    }
}
