package com.avito.android.developments_advice.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.remote.model.ConsultationFormData;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: ConsultationFormLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_advice/remote/model/ConsultationFormLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-network_developments-advice"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class ConsultationFormLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ConsultationFormLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final ConsultationFormData f136194b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f136195c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f136196d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f136197e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f136198f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f136199g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Boolean f136200h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f136201i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f136202j;

    /* compiled from: ConsultationFormLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ConsultationFormLink> {
        @Override // android.os.Parcelable.Creator
        public final ConsultationFormLink createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            ConsultationFormData consultationFormData = (ConsultationFormData) parcel.readParcelable(ConsultationFormLink.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ConsultationFormLink(consultationFormData, boolValueOf, string, string2, string3, string4, string5, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ConsultationFormLink[] newArray(int i12) {
            return new ConsultationFormLink[i12];
        }
    }

    public ConsultationFormLink() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f136194b, i12);
        parcel.writeString(this.f136195c);
        parcel.writeString(this.f136196d);
        parcel.writeString(this.f136197e);
        parcel.writeString(this.f136198f);
        parcel.writeString(this.f136199g);
        Boolean bool = this.f136200h;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.f136201i);
        parcel.writeString(this.f136202j);
    }

    public /* synthetic */ ConsultationFormLink(ConsultationFormData consultationFormData, String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : consultationFormData, (i12 & 64) != 0 ? null : bool, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? null : str5, (i12 & 128) != 0 ? null : str6, (i12 & 256) == 0 ? str7 : null);
    }

    public ConsultationFormLink(@l ConsultationFormData consultationFormData, @l Boolean bool, @l String str, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6, @l String str7) {
        this.f136194b = consultationFormData;
        this.f136195c = str;
        this.f136196d = str2;
        this.f136197e = str3;
        this.f136198f = str4;
        this.f136199g = str5;
        this.f136200h = bool;
        this.f136201i = str6;
        this.f136202j = str7;
    }
}
