package com.avito.android.profile_phones.phones_list.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.H0;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.profile_phones.phones_list.phone_item.PhoneListItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PhonesListMviState.kt */
@H0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/NumbersListState;", "Landroid/os/Parcelable;", "()V", "Default", "EmptyNumbers", "Error", "Loaded", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/NumbersListState$Default;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/NumbersListState$EmptyNumbers;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/NumbersListState$Error;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/NumbersListState$Loaded;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class NumbersListState implements Parcelable {

    /* compiled from: PhonesListMviState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/NumbersListState$Default;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/NumbersListState;", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Default extends NumbersListState {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Default f227976b = new Default();

        @k
        public static final Parcelable.Creator<Default> CREATOR = new a();

        /* compiled from: PhonesListMviState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Default> {
            @Override // android.os.Parcelable.Creator
            public final Default createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Default.f227976b;
            }

            @Override // android.os.Parcelable.Creator
            public final Default[] newArray(int i12) {
                return new Default[i12];
            }
        }

        public Default() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: PhonesListMviState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/NumbersListState$EmptyNumbers;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/NumbersListState;", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class EmptyNumbers extends NumbersListState {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final EmptyNumbers f227977b = new EmptyNumbers();

        @k
        public static final Parcelable.Creator<EmptyNumbers> CREATOR = new a();

        /* compiled from: PhonesListMviState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<EmptyNumbers> {
            @Override // android.os.Parcelable.Creator
            public final EmptyNumbers createFromParcel(Parcel parcel) {
                parcel.readInt();
                return EmptyNumbers.f227977b;
            }

            @Override // android.os.Parcelable.Creator
            public final EmptyNumbers[] newArray(int i12) {
                return new EmptyNumbers[i12];
            }
        }

        public EmptyNumbers() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: PhonesListMviState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/NumbersListState$Error;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/NumbersListState;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Error extends NumbersListState {

        @k
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f227978b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f227979c;

        /* compiled from: PhonesListMviState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Error> {
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                return new Error((PrintableText) parcel.readParcelable(Error.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i12) {
                return new Error[i12];
            }
        }

        public /* synthetic */ Error(PrintableText printableText, boolean z12, int i12, C42822w c42822w) {
            this(printableText, (i12 & 2) != 0 ? false : z12);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return L.f(this.f227978b, error.f227978b) && this.f227979c == error.f227979c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f227979c) + (this.f227978b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(error=");
            sb2.append(this.f227978b);
            sb2.append(", isRefreshing=");
            return r.x(sb2, this.f227979c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f227978b, i12);
            parcel.writeInt(this.f227979c ? 1 : 0);
        }

        public Error(@k PrintableText printableText, boolean z12) {
            super(null);
            this.f227978b = printableText;
            this.f227979c = z12;
        }
    }

    /* compiled from: PhonesListMviState.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/NumbersListState$Loaded;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/NumbersListState;", "Landroid/os/Parcelable;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Loaded extends NumbersListState implements Parcelable {

        @k
        public static final Parcelable.Creator<Loaded> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<PhoneListItem> f227980b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f227981c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f227982d;

        /* compiled from: PhonesListMviState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Loaded> {
            @Override // android.os.Parcelable.Creator
            public final Loaded createFromParcel(Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(PhoneListItem.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new Loaded(arrayList, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Loaded[] newArray(int i12) {
                return new Loaded[i12];
            }
        }

        public /* synthetic */ Loaded(List list, boolean z12, boolean z13, int i12, C42822w c42822w) {
            this(list, z12, (i12 & 4) != 0 ? false : z13);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return L.f(this.f227980b, loaded.f227980b) && this.f227981c == loaded.f227981c && this.f227982d == loaded.f227982d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f227982d) + r.i(this.f227980b.hashCode() * 31, 31, this.f227981c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Loaded(numbers=");
            sb2.append(this.f227980b);
            sb2.append(", needShowExpand=");
            sb2.append(this.f227981c);
            sb2.append(", isExpanded=");
            return r.x(sb2, this.f227982d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            Iterator itJ = C0.j(this.f227980b, parcel);
            while (itJ.hasNext()) {
                ((PhoneListItem) itJ.next()).writeToParcel(parcel, i12);
            }
            parcel.writeInt(this.f227981c ? 1 : 0);
            parcel.writeInt(this.f227982d ? 1 : 0);
        }

        public Loaded(@k List<PhoneListItem> list, boolean z12, boolean z13) {
            super(null);
            this.f227980b = list;
            this.f227981c = z12;
            this.f227982d = z13;
        }
    }

    public /* synthetic */ NumbersListState(C42822w c42822w) {
        this();
    }

    public NumbersListState() {
    }
}
