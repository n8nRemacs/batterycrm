package com.avito.android.select.bottom_sheet.result;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.ParcelableEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectBottomSheetResult.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/select/bottom_sheet/result/SelectBottomSheetResult;", "Landroid/os/Parcelable;", "()V", "Cancel", "Reset", "Select", "Lcom/avito/android/select/bottom_sheet/result/SelectBottomSheetResult$Cancel;", "Lcom/avito/android/select/bottom_sheet/result/SelectBottomSheetResult$Reset;", "Lcom/avito/android/select/bottom_sheet/result/SelectBottomSheetResult$Select;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class SelectBottomSheetResult implements Parcelable {

    /* compiled from: SelectBottomSheetResult.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/bottom_sheet/result/SelectBottomSheetResult$Cancel;", "Lcom/avito/android/select/bottom_sheet/result/SelectBottomSheetResult;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Cancel extends SelectBottomSheetResult {

        @k
        public static final Parcelable.Creator<Cancel> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f265324b;

        /* compiled from: SelectBottomSheetResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Cancel> {
            @Override // android.os.Parcelable.Creator
            public final Cancel createFromParcel(Parcel parcel) {
                return new Cancel(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Cancel[] newArray(int i12) {
                return new Cancel[i12];
            }
        }

        public Cancel(@k String str) {
            super(null);
            this.f265324b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Cancel) && L.f(this.f265324b, ((Cancel) obj).f265324b);
        }

        public final int hashCode() {
            return this.f265324b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Cancel(requestId="), this.f265324b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f265324b);
        }
    }

    /* compiled from: SelectBottomSheetResult.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/bottom_sheet/result/SelectBottomSheetResult$Reset;", "Lcom/avito/android/select/bottom_sheet/result/SelectBottomSheetResult;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Reset extends SelectBottomSheetResult {

        @k
        public static final Parcelable.Creator<Reset> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f265325b;

        /* compiled from: SelectBottomSheetResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Reset> {
            @Override // android.os.Parcelable.Creator
            public final Reset createFromParcel(Parcel parcel) {
                return new Reset(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Reset[] newArray(int i12) {
                return new Reset[i12];
            }
        }

        public Reset(@k String str) {
            super(null);
            this.f265325b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Reset) && L.f(this.f265325b, ((Reset) obj).f265325b);
        }

        public final int hashCode() {
            return this.f265325b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Reset(requestId="), this.f265325b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f265325b);
        }
    }

    /* compiled from: SelectBottomSheetResult.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/bottom_sheet/result/SelectBottomSheetResult$Select;", "Lcom/avito/android/select/bottom_sheet/result/SelectBottomSheetResult;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Select extends SelectBottomSheetResult {

        @k
        public static final Parcelable.Creator<Select> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f265326b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<ParcelableEntity<String>> f265327c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f265328d;

        /* compiled from: SelectBottomSheetResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Select> {
            @Override // android.os.Parcelable.Creator
            public final Select createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(Select.class, parcel, arrayList, iL2, 1);
                }
                return new Select(string, arrayList, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Select[] newArray(int i12) {
                return new Select[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Select(@k String str, @k List<? extends ParcelableEntity<String>> list, @l String str2) {
            super(null);
            this.f265326b = str;
            this.f265327c = list;
            this.f265328d = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Select)) {
                return false;
            }
            Select select = (Select) obj;
            return L.f(this.f265326b, select.f265326b) && L.f(this.f265327c, select.f265327c) && L.f(this.f265328d, select.f265328d);
        }

        public final int hashCode() {
            int iE2 = H.e(this.f265326b.hashCode() * 31, 31, this.f265327c);
            String str = this.f265328d;
            return iE2 + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Select(requestId=");
            sb2.append(this.f265326b);
            sb2.append(", selectedVariants=");
            sb2.append(this.f265327c);
            sb2.append(", sectionTitle=");
            return C22026a.c(sb2, this.f265328d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f265326b);
            Iterator itJ = C0.j(this.f265327c, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), i12);
            }
            parcel.writeString(this.f265328d);
        }
    }

    public /* synthetic */ SelectBottomSheetResult(C42822w c42822w) {
        this();
    }

    public SelectBottomSheetResult() {
    }
}
