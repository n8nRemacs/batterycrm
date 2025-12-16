package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: StrSoftBookingDeepLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/StrSoftBookingDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class StrSoftBookingDeepLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<StrSoftBookingDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133695b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f133696c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f133697d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f133698e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Integer f133699f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Integer f133700g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f133701h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f133702i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Boolean f133703j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f133704k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final Boolean f133705l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final String f133706m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final String f133707n;

    /* compiled from: StrSoftBookingDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StrSoftBookingDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final StrSoftBookingDeepLink createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z12 = parcel.readInt() != 0;
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StrSoftBookingDeepLink(string, string2, string3, string4, numValueOf, numValueOf2, z12, string5, boolValueOf, string6, boolValueOf2, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StrSoftBookingDeepLink[] newArray(int i12) {
            return new StrSoftBookingDeepLink[i12];
        }
    }

    /* compiled from: StrSoftBookingDeepLink.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/StrSoftBookingDeepLink$b;", "", "a", "Lcom/avito/android/deep_linking/links/StrSoftBookingDeepLink$b$a;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: StrSoftBookingDeepLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/StrSoftBookingDeepLink$b$a;", "Lcom/avito/android/deep_linking/links/StrSoftBookingDeepLink$b;", "LJu/c$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f133708b = new a();
        }
    }

    public /* synthetic */ StrSoftBookingDeepLink(String str, String str2, String str3, String str4, Integer num, Integer num2, boolean z12, String str5, Boolean bool, String str6, Boolean bool2, String str7, String str8, int i12, C42822w c42822w) {
        this(str, str2, str3, str4, num, num2, (i12 & 64) != 0 ? false : z12, (i12 & 128) != 0 ? null : str5, (i12 & 256) != 0 ? Boolean.TRUE : bool, (i12 & 512) != 0 ? null : str6, (i12 & 1024) != 0 ? null : bool2, (i12 & 2048) != 0 ? null : str7, (i12 & 4096) != 0 ? null : str8);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133695b);
        parcel.writeString(this.f133696c);
        parcel.writeString(this.f133697d);
        parcel.writeString(this.f133698e);
        Integer num = this.f133699f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.f133700g;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        parcel.writeInt(this.f133701h ? 1 : 0);
        parcel.writeString(this.f133702i);
        Boolean bool = this.f133703j;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.f133704k);
        Boolean bool2 = this.f133705l;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        parcel.writeString(this.f133706m);
        parcel.writeString(this.f133707n);
    }

    public StrSoftBookingDeepLink(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l Integer num, @Y61.l Integer num2, boolean z12, @Y61.l String str5, @Y61.l Boolean bool, @Y61.l String str6, @Y61.l Boolean bool2, @Y61.l String str7, @Y61.l String str8) {
        this.f133695b = str;
        this.f133696c = str2;
        this.f133697d = str3;
        this.f133698e = str4;
        this.f133699f = num;
        this.f133700g = num2;
        this.f133701h = z12;
        this.f133702i = str5;
        this.f133703j = bool;
        this.f133704k = str6;
        this.f133705l = bool2;
        this.f133706m = str7;
        this.f133707n = str8;
    }
}
