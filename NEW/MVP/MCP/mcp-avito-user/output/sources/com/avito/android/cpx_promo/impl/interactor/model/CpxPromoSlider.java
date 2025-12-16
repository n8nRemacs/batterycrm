package com.avito.android.cpx_promo.impl.interactor.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: CpxPromoSlider.kt */
@d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo/impl/interactor/model/CpxPromoSlider;", "Landroid/os/Parcelable;", "Value", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CpxPromoSlider implements Parcelable {

    @k
    public static final Parcelable.Creator<CpxPromoSlider> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedTextWithIcon f127044b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Long f127045c;

    /* renamed from: d, reason: collision with root package name */
    public final long f127046d;

    /* renamed from: e, reason: collision with root package name */
    public final long f127047e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ArrayList f127048f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final CpxPromoInputSheet f127049g;

    /* compiled from: CpxPromoSlider.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/impl/interactor/model/CpxPromoSlider$Value;", "Landroid/os/Parcelable;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Value implements Parcelable {

        @k
        public static final Parcelable.Creator<Value> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final long f127050b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f127051c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f127052d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f127053e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f127054f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final AttributedText f127055g;

        /* compiled from: CpxPromoSlider.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Value> {
            @Override // android.os.Parcelable.Creator
            public final Value createFromParcel(Parcel parcel) {
                return new Value(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(Value.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Value[] newArray(int i12) {
                return new Value[i12];
            }
        }

        public Value(long j12, @k String str, @l String str2, @k String str3, @l String str4, @l AttributedText attributedText) {
            this.f127050b = j12;
            this.f127051c = str;
            this.f127052d = str2;
            this.f127053e = str3;
            this.f127054f = str4;
            this.f127055g = attributedText;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeLong(this.f127050b);
            parcel.writeString(this.f127051c);
            parcel.writeString(this.f127052d);
            parcel.writeString(this.f127053e);
            parcel.writeString(this.f127054f);
            parcel.writeParcelable(this.f127055g, i12);
        }
    }

    /* compiled from: CpxPromoSlider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CpxPromoSlider> {
        @Override // android.os.Parcelable.Creator
        public final CpxPromoSlider createFromParcel(Parcel parcel) {
            AttributedTextWithIcon attributedTextWithIconCreateFromParcel = parcel.readInt() == 0 ? null : AttributedTextWithIcon.CREATOR.createFromParcel(parcel);
            Long lValueOf = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            long j12 = parcel.readLong();
            long j13 = parcel.readLong();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Value.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new CpxPromoSlider(attributedTextWithIconCreateFromParcel, lValueOf, j12, j13, arrayList, CpxPromoInputSheet.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CpxPromoSlider[] newArray(int i12) {
            return new CpxPromoSlider[i12];
        }
    }

    public CpxPromoSlider(@l AttributedTextWithIcon attributedTextWithIcon, @l Long l12, long j12, long j13, @k ArrayList arrayList, @k CpxPromoInputSheet cpxPromoInputSheet) {
        this.f127044b = attributedTextWithIcon;
        this.f127045c = l12;
        this.f127046d = j12;
        this.f127047e = j13;
        this.f127048f = arrayList;
        this.f127049g = cpxPromoInputSheet;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        AttributedTextWithIcon attributedTextWithIcon = this.f127044b;
        if (attributedTextWithIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            attributedTextWithIcon.writeToParcel(parcel, i12);
        }
        Long l12 = this.f127045c;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeLong(this.f127046d);
        parcel.writeLong(this.f127047e);
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f127048f, parcel);
        while (itZ.hasNext()) {
            ((Value) itZ.next()).writeToParcel(parcel, i12);
        }
        this.f127049g.writeToParcel(parcel, i12);
    }
}
