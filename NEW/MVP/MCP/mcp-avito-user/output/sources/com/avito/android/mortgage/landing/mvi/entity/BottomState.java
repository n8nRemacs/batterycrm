package com.avito.android.mortgage.landing.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LandingState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/BottomState;", "Landroid/os/Parcelable;", "Content", "NothingFound", "Placeholders", "Lcom/avito/android/mortgage/landing/mvi/entity/BottomState$Content;", "Lcom/avito/android/mortgage/landing/mvi/entity/BottomState$NothingFound;", "Lcom/avito/android/mortgage/landing/mvi/entity/BottomState$Placeholders;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface BottomState extends Parcelable {

    /* compiled from: LandingState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/BottomState$Content;", "Lcom/avito/android/mortgage/landing/mvi/entity/BottomState;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Content implements BottomState {

        @k
        public static final Parcelable.Creator<Content> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f200152b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f200153c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ArrayList f200154d;

        /* compiled from: LandingState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Content> {
            @Override // android.os.Parcelable.Creator
            public final Content createFromParcel(Parcel parcel) {
                return new Content(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Content[] newArray(int i12) {
                return new Content[i12];
            }
        }

        public Content(@k String str, @k String str2, @k ArrayList arrayList) {
            this.f200152b = str;
            this.f200153c = str2;
            this.f200154d = arrayList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return L.f(this.f200152b, content.f200152b) && L.f(this.f200153c, content.f200153c) && L.f(this.f200154d, content.f200154d);
        }

        public final int hashCode() {
            return this.f200154d.hashCode() + H.d(this.f200152b.hashCode() * 31, 31, this.f200153c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(rate=");
            sb2.append(this.f200152b);
            sb2.append(", payment=");
            sb2.append(this.f200153c);
            sb2.append(", icons=");
            return e.p(sb2, this.f200154d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f200152b);
            parcel.writeString(this.f200153c);
            parcel.writeStringList(this.f200154d);
        }
    }

    /* compiled from: LandingState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/BottomState$NothingFound;", "Lcom/avito/android/mortgage/landing/mvi/entity/BottomState;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class NothingFound implements BottomState {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NothingFound f200155b = new NothingFound();

        @k
        public static final Parcelable.Creator<NothingFound> CREATOR = new a();

        /* compiled from: LandingState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<NothingFound> {
            @Override // android.os.Parcelable.Creator
            public final NothingFound createFromParcel(Parcel parcel) {
                parcel.readInt();
                return NothingFound.f200155b;
            }

            @Override // android.os.Parcelable.Creator
            public final NothingFound[] newArray(int i12) {
                return new NothingFound[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NothingFound);
        }

        public final int hashCode() {
            return -2042602084;
        }

        @k
        public final String toString() {
            return "NothingFound";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: LandingState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/BottomState$Placeholders;", "Lcom/avito/android/mortgage/landing/mvi/entity/BottomState;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Placeholders implements BottomState {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Placeholders f200156b = new Placeholders();

        @k
        public static final Parcelable.Creator<Placeholders> CREATOR = new a();

        /* compiled from: LandingState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Placeholders> {
            @Override // android.os.Parcelable.Creator
            public final Placeholders createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Placeholders.f200156b;
            }

            @Override // android.os.Parcelable.Creator
            public final Placeholders[] newArray(int i12) {
                return new Placeholders[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Placeholders);
        }

        public final int hashCode() {
            return 49999687;
        }

        @k
        public final String toString() {
            return "Placeholders";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }
}
