package com.avito.android.str_insurance;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: StrInsuranceLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_insurance/StrInsuranceLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_str-insurance_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class StrInsuranceLink extends DeepLink {

    @k
    public static final Parcelable.Creator<StrInsuranceLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InsuranceData f288542b;

    /* compiled from: StrInsuranceLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StrInsuranceLink> {
        @Override // android.os.Parcelable.Creator
        public final StrInsuranceLink createFromParcel(Parcel parcel) {
            return new StrInsuranceLink(InsuranceData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final StrInsuranceLink[] newArray(int i12) {
            return new StrInsuranceLink[i12];
        }
    }

    /* compiled from: StrInsuranceLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_insurance/StrInsuranceLink$b;", "LJu/c$b;", "a", "b", "Lcom/avito/android/str_insurance/StrInsuranceLink$b$a;", "Lcom/avito/android/str_insurance/StrInsuranceLink$b$b;", "_avito_str-insurance_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends InterfaceC14249c.b {

        /* compiled from: StrInsuranceLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_insurance/StrInsuranceLink$b$a;", "Lcom/avito/android/str_insurance/StrInsuranceLink$b;", "<init>", "()V", "_avito_str-insurance_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f288543b = new a();
        }

        /* compiled from: StrInsuranceLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_insurance/StrInsuranceLink$b$b;", "Lcom/avito/android/str_insurance/StrInsuranceLink$b;", "<init>", "()V", "_avito_str-insurance_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.str_insurance.StrInsuranceLink$b$b, reason: collision with other inner class name */
        public static final class C8675b implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C8675b f288544b = new C8675b();
        }
    }

    public StrInsuranceLink(@k InsuranceData insuranceData) {
        this.f288542b = insuranceData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f288542b.writeToParcel(parcel, i12);
    }
}
