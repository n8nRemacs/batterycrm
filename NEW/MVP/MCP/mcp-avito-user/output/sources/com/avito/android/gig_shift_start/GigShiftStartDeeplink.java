package com.avito.android.gig_shift_start;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: GigShiftStartDeeplink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gig_shift_start/GigShiftStartDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_gig_start-shift-bottom-sheet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final class GigShiftStartDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<GigShiftStartDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Long f160736b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Long f160737c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Boolean f160738d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Boolean f160739e;

    /* compiled from: GigShiftStartDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigShiftStartDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final GigShiftStartDeeplink createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2 = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GigShiftStartDeeplink(lValueOf, lValueOf2, boolValueOf, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final GigShiftStartDeeplink[] newArray(int i12) {
            return new GigShiftStartDeeplink[i12];
        }
    }

    /* compiled from: GigShiftStartDeeplink.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/gig_shift_start/GigShiftStartDeeplink$b;", "LJu/c$b;", "<init>", "()V", "a", "Lcom/avito/android/gig_shift_start/GigShiftStartDeeplink$b$a;", "_avito_gig_start-shift-bottom-sheet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b implements InterfaceC14249c.b {

        /* compiled from: GigShiftStartDeeplink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/gig_shift_start/GigShiftStartDeeplink$b$a;", "Lcom/avito/android/gig_shift_start/GigShiftStartDeeplink$b;", "LJu/c$b;", "<init>", "()V", "_avito_gig_start-shift-bottom-sheet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f160740b = new a();

            public a() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 562944259;
            }

            @k
            public final String toString() {
                return "Success";
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public /* synthetic */ GigShiftStartDeeplink(Long l12, Long l13, Boolean bool, Boolean bool2, int i12, C42822w c42822w) {
        this(l12, l13, bool, (i12 & 8) != 0 ? null : bool2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Long l12 = this.f160736b;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        Long l13 = this.f160737c;
        if (l13 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l13);
        }
        Boolean bool = this.f160738d;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.f160739e;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
    }

    public GigShiftStartDeeplink(@l Long l12, @l Long l13, @l Boolean bool, @l Boolean bool2) {
        this.f160736b = l12;
        this.f160737c = l13;
        this.f160738d = bool;
        this.f160739e = bool2;
    }
}
