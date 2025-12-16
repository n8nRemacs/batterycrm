package com.avito.android.vas_planning.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.vas_planning.model.VasPlanningItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VasButton.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning/model/VasButton;", "Landroid/os/Parcelable;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VasButton implements Parcelable {

    @k
    public static final Parcelable.Creator<VasButton> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f322415b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DeepLink f322416c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final VasPlanningItem.VasPlanningRadioItem.VasPlanningRadioType f322417d;

    /* compiled from: VasButton.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VasButton> {
        @Override // android.os.Parcelable.Creator
        public final VasButton createFromParcel(Parcel parcel) {
            return new VasButton(parcel.readString(), (DeepLink) parcel.readParcelable(VasButton.class.getClassLoader()), parcel.readInt() == 0 ? null : VasPlanningItem.VasPlanningRadioItem.VasPlanningRadioType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final VasButton[] newArray(int i12) {
            return new VasButton[i12];
        }
    }

    public VasButton(@k String str, @l DeepLink deepLink, @l VasPlanningItem.VasPlanningRadioItem.VasPlanningRadioType vasPlanningRadioType) {
        this.f322415b = str;
        this.f322416c = deepLink;
        this.f322417d = vasPlanningRadioType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VasButton)) {
            return false;
        }
        VasButton vasButton = (VasButton) obj;
        return L.f(this.f322415b, vasButton.f322415b) && L.f(this.f322416c, vasButton.f322416c) && this.f322417d == vasButton.f322417d;
    }

    public final int hashCode() {
        int iHashCode = this.f322415b.hashCode() * 31;
        DeepLink deepLink = this.f322416c;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        VasPlanningItem.VasPlanningRadioItem.VasPlanningRadioType vasPlanningRadioType = this.f322417d;
        return iHashCode2 + (vasPlanningRadioType != null ? vasPlanningRadioType.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "VasButton(title=" + this.f322415b + ", deepLink=" + this.f322416c + ", selectedVasPlanningType=" + this.f322417d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f322415b);
        parcel.writeParcelable(this.f322416c, i12);
        VasPlanningItem.VasPlanningRadioItem.VasPlanningRadioType vasPlanningRadioType = this.f322417d;
        if (vasPlanningRadioType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(vasPlanningRadioType.name());
        }
    }

    public /* synthetic */ VasButton(String str, DeepLink deepLink, VasPlanningItem.VasPlanningRadioItem.VasPlanningRadioType vasPlanningRadioType, int i12, C42822w c42822w) {
        this(str, deepLink, (i12 & 4) != 0 ? null : vasPlanningRadioType);
    }
}
