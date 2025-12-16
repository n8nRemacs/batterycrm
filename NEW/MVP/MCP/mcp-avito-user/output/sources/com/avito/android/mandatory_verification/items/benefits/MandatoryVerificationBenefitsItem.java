package com.avito.android.mandatory_verification.items.benefits;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.component.accordion.s;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.UniversalImage;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MandatoryVerificationBenefitsItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mandatory_verification/items/benefits/MandatoryVerificationBenefitsItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "Benefit", "_avito_mandatory-verification-items_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class MandatoryVerificationBenefitsItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<MandatoryVerificationBenefitsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f184635b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f184636c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<Benefit> f184637d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f184638e;

    /* compiled from: MandatoryVerificationBenefitsItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/items/benefits/MandatoryVerificationBenefitsItem$Benefit;", "Landroid/os/Parcelable;", "_avito_mandatory-verification-items_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Benefit implements Parcelable {

        @k
        public static final Parcelable.Creator<Benefit> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f184639b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f184640c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final UniversalImage f184641d;

        /* compiled from: MandatoryVerificationBenefitsItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Benefit> {
            @Override // android.os.Parcelable.Creator
            public final Benefit createFromParcel(Parcel parcel) {
                return new Benefit(parcel.readString(), parcel.readString(), (UniversalImage) parcel.readParcelable(Benefit.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Benefit[] newArray(int i12) {
                return new Benefit[i12];
            }
        }

        public Benefit(@k String str, @k String str2, @k UniversalImage universalImage) {
            this.f184639b = str;
            this.f184640c = str2;
            this.f184641d = universalImage;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Benefit)) {
                return false;
            }
            Benefit benefit = (Benefit) obj;
            return L.f(this.f184639b, benefit.f184639b) && L.f(this.f184640c, benefit.f184640c) && L.f(this.f184641d, benefit.f184641d);
        }

        public final int hashCode() {
            return this.f184641d.hashCode() + H.d(this.f184639b.hashCode() * 31, 31, this.f184640c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Benefit(title=");
            sb2.append(this.f184639b);
            sb2.append(", description=");
            sb2.append(this.f184640c);
            sb2.append(", icon=");
            return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f184641d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f184639b);
            parcel.writeString(this.f184640c);
            parcel.writeParcelable(this.f184641d, i12);
        }
    }

    /* compiled from: MandatoryVerificationBenefitsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MandatoryVerificationBenefitsItem> {
        @Override // android.os.Parcelable.Creator
        public final MandatoryVerificationBenefitsItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Benefit.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new MandatoryVerificationBenefitsItem(string, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), arrayList, string2);
        }

        @Override // android.os.Parcelable.Creator
        public final MandatoryVerificationBenefitsItem[] newArray(int i12) {
            return new MandatoryVerificationBenefitsItem[i12];
        }
    }

    public MandatoryVerificationBenefitsItem(@k String str, @l Integer num, @k List list, @k String str2) {
        this.f184635b = str;
        this.f184636c = str2;
        this.f184637d = list;
        this.f184638e = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MandatoryVerificationBenefitsItem)) {
            return false;
        }
        MandatoryVerificationBenefitsItem mandatoryVerificationBenefitsItem = (MandatoryVerificationBenefitsItem) obj;
        return L.f(this.f184635b, mandatoryVerificationBenefitsItem.f184635b) && L.f(this.f184636c, mandatoryVerificationBenefitsItem.f184636c) && L.f(this.f184637d, mandatoryVerificationBenefitsItem.f184637d) && L.f(this.f184638e, mandatoryVerificationBenefitsItem.f184638e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269899b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF181662b() {
        return this.f184635b;
    }

    public final int hashCode() {
        int iE2 = H.e(H.d(this.f184635b.hashCode() * 31, 31, this.f184636c), 31, this.f184637d);
        Integer num = this.f184638e;
        return iE2 + (num == null ? 0 : num.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MandatoryVerificationBenefitsItem(stringId=");
        sb2.append(this.f184635b);
        sb2.append(", title=");
        sb2.append(this.f184636c);
        sb2.append(", benefits=");
        sb2.append(this.f184637d);
        sb2.append(", topMargin=");
        return s.j(sb2, this.f184638e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f184635b);
        parcel.writeString(this.f184636c);
        Iterator itJ = C0.j(this.f184637d, parcel);
        while (itJ.hasNext()) {
            ((Benefit) itJ.next()).writeToParcel(parcel, i12);
        }
        Integer num = this.f184638e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }

    public /* synthetic */ MandatoryVerificationBenefitsItem(String str, String str2, List list, Integer num, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? MandatoryVerificationBenefitsItem.class.getName() : str, (i12 & 8) != 0 ? null : num, list, str2);
    }
}
