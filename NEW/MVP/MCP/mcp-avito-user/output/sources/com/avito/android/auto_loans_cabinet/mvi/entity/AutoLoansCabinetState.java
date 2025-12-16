package com.avito.android.auto_loans_cabinet.mvi.entity;

import K51.d;
import Ke.c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.analytics.screens.mvi.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoLoansCabinetState.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "BlanksState", "a", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AutoLoansCabinetState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final BlanksState f95450b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f95448c = new a(null);

    @k
    public static final Parcelable.Creator<AutoLoansCabinetState> CREATOR = new b();

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final AutoLoansCabinetState f95449d = new AutoLoansCabinetState(BlanksState.Loading.f95452b);

    /* compiled from: AutoLoansCabinetState.kt */
    @P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetState$BlanksState;", "Landroid/os/Parcelable;", "()V", "Error", "Loading", "Success", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetState$BlanksState$Error;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetState$BlanksState$Loading;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetState$BlanksState$Success;", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static abstract class BlanksState implements Parcelable {

        /* compiled from: AutoLoansCabinetState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetState$BlanksState$Error;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetState$BlanksState;", "<init>", "()V", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Error extends BlanksState {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final Error f95451b = new Error();

            @k
            public static final Parcelable.Creator<Error> CREATOR = new a();

            /* compiled from: AutoLoansCabinetState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Error> {
                @Override // android.os.Parcelable.Creator
                public final Error createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Error.f95451b;
                }

                @Override // android.os.Parcelable.Creator
                public final Error[] newArray(int i12) {
                    return new Error[i12];
                }
            }

            public Error() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof Error);
            }

            public final int hashCode() {
                return 709817573;
            }

            @k
            public final String toString() {
                return "Error";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: AutoLoansCabinetState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetState$BlanksState$Loading;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetState$BlanksState;", "<init>", "()V", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Loading extends BlanksState {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final Loading f95452b = new Loading();

            @k
            public static final Parcelable.Creator<Loading> CREATOR = new a();

            /* compiled from: AutoLoansCabinetState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Loading> {
                @Override // android.os.Parcelable.Creator
                public final Loading createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Loading.f95452b;
                }

                @Override // android.os.Parcelable.Creator
                public final Loading[] newArray(int i12) {
                    return new Loading[i12];
                }
            }

            public Loading() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return 1050525913;
            }

            @k
            public final String toString() {
                return "Loading";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: AutoLoansCabinetState.kt */
        @P
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetState$BlanksState$Success;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetState$BlanksState;", "Draft", "LoanApproved", "LoanReject", "NoLoans", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetState$BlanksState$Success$Draft;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetState$BlanksState$Success$LoanApproved;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetState$BlanksState$Success$LoanReject;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetState$BlanksState$Success$NoLoans;", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static abstract class Success extends BlanksState {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final AppBarData f95453b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final ListData f95454c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f95455d;

            /* compiled from: AutoLoansCabinetState.kt */
            @P
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetState$BlanksState$Success$Draft;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetState$BlanksState$Success;", "LKe/c;", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Draft extends Success implements c {

                @k
                public static final Parcelable.Creator<Draft> CREATOR = new a();

                /* renamed from: e, reason: collision with root package name */
                public final long f95456e;

                /* renamed from: f, reason: collision with root package name */
                public final long f95457f;

                /* renamed from: g, reason: collision with root package name */
                @k
                public final AppBarData f95458g;

                /* renamed from: h, reason: collision with root package name */
                @k
                public final ListData f95459h;

                /* renamed from: i, reason: collision with root package name */
                public final boolean f95460i;

                /* compiled from: AutoLoansCabinetState.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Draft> {
                    @Override // android.os.Parcelable.Creator
                    public final Draft createFromParcel(Parcel parcel) {
                        return new Draft(parcel.readLong(), parcel.readLong(), AppBarData.CREATOR.createFromParcel(parcel), ListData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Draft[] newArray(int i12) {
                        return new Draft[i12];
                    }
                }

                public /* synthetic */ Draft(long j12, long j13, AppBarData appBarData, ListData listData, boolean z12, int i12, C42822w c42822w) {
                    this(j12, j13, appBarData, listData, (i12 & 16) != 0 ? false : z12);
                }

                @Override // com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetState.BlanksState.Success
                @k
                /* renamed from: c, reason: from getter */
                public final AppBarData getF95453b() {
                    return this.f95458g;
                }

                @Override // com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetState.BlanksState.Success
                @k
                /* renamed from: d, reason: from getter */
                public final ListData getF95454c() {
                    return this.f95459h;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetState.BlanksState.Success
                /* renamed from: e, reason: from getter */
                public final boolean getF95455d() {
                    return this.f95460i;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Draft)) {
                        return false;
                    }
                    Draft draft = (Draft) obj;
                    return this.f95456e == draft.f95456e && this.f95457f == draft.f95457f && L.f(this.f95458g, draft.f95458g) && L.f(this.f95459h, draft.f95459h) && this.f95460i == draft.f95460i;
                }

                @Override // Ke.c
                /* renamed from: getItemId, reason: from getter */
                public final long getF95466e() {
                    return this.f95456e;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.f95460i) + e.g(this.f95459h.f95487b, (this.f95458g.hashCode() + r.g(Long.hashCode(this.f95456e) * 31, 31, this.f95457f)) * 31, 31);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Draft(itemId=");
                    sb2.append(this.f95456e);
                    sb2.append(", ofpApplicationId=");
                    sb2.append(this.f95457f);
                    sb2.append(", appBarData=");
                    sb2.append(this.f95458g);
                    sb2.append(", listData=");
                    sb2.append(this.f95459h);
                    sb2.append(", isLoanDetailsBottomSheetVisible=");
                    return r.x(sb2, this.f95460i, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeLong(this.f95456e);
                    parcel.writeLong(this.f95457f);
                    this.f95458g.writeToParcel(parcel, i12);
                    this.f95459h.writeToParcel(parcel, i12);
                    parcel.writeInt(this.f95460i ? 1 : 0);
                }

                public Draft(long j12, long j13, @k AppBarData appBarData, @k ListData listData, boolean z12) {
                    super(appBarData, listData, z12, null);
                    this.f95456e = j12;
                    this.f95457f = j13;
                    this.f95458g = appBarData;
                    this.f95459h = listData;
                    this.f95460i = z12;
                }
            }

            /* compiled from: AutoLoansCabinetState.kt */
            @P
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetState$BlanksState$Success$LoanApproved;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetState$BlanksState$Success;", "LKe/c;", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class LoanApproved extends Success implements c {

                @k
                public static final Parcelable.Creator<LoanApproved> CREATOR = new a();

                /* renamed from: e, reason: collision with root package name */
                public final long f95461e;

                /* renamed from: f, reason: collision with root package name */
                public final long f95462f;

                /* renamed from: g, reason: collision with root package name */
                @k
                public final AppBarData f95463g;

                /* renamed from: h, reason: collision with root package name */
                @k
                public final ListData f95464h;

                /* renamed from: i, reason: collision with root package name */
                public final boolean f95465i;

                /* compiled from: AutoLoansCabinetState.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<LoanApproved> {
                    @Override // android.os.Parcelable.Creator
                    public final LoanApproved createFromParcel(Parcel parcel) {
                        return new LoanApproved(parcel.readLong(), parcel.readLong(), AppBarData.CREATOR.createFromParcel(parcel), ListData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final LoanApproved[] newArray(int i12) {
                        return new LoanApproved[i12];
                    }
                }

                public /* synthetic */ LoanApproved(long j12, long j13, AppBarData appBarData, ListData listData, boolean z12, int i12, C42822w c42822w) {
                    this(j12, j13, appBarData, listData, (i12 & 16) != 0 ? false : z12);
                }

                @Override // com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetState.BlanksState.Success
                @k
                /* renamed from: c, reason: from getter */
                public final AppBarData getF95453b() {
                    return this.f95463g;
                }

                @Override // com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetState.BlanksState.Success
                @k
                /* renamed from: d, reason: from getter */
                public final ListData getF95454c() {
                    return this.f95464h;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetState.BlanksState.Success
                /* renamed from: e, reason: from getter */
                public final boolean getF95455d() {
                    return this.f95465i;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof LoanApproved)) {
                        return false;
                    }
                    LoanApproved loanApproved = (LoanApproved) obj;
                    return this.f95461e == loanApproved.f95461e && this.f95462f == loanApproved.f95462f && L.f(this.f95463g, loanApproved.f95463g) && L.f(this.f95464h, loanApproved.f95464h) && this.f95465i == loanApproved.f95465i;
                }

                @Override // Ke.c
                /* renamed from: getItemId, reason: from getter */
                public final long getF95466e() {
                    return this.f95461e;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.f95465i) + e.g(this.f95464h.f95487b, (this.f95463g.hashCode() + r.g(Long.hashCode(this.f95461e) * 31, 31, this.f95462f)) * 31, 31);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("LoanApproved(itemId=");
                    sb2.append(this.f95461e);
                    sb2.append(", ofpApplicationId=");
                    sb2.append(this.f95462f);
                    sb2.append(", appBarData=");
                    sb2.append(this.f95463g);
                    sb2.append(", listData=");
                    sb2.append(this.f95464h);
                    sb2.append(", isLoanDetailsBottomSheetVisible=");
                    return r.x(sb2, this.f95465i, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeLong(this.f95461e);
                    parcel.writeLong(this.f95462f);
                    this.f95463g.writeToParcel(parcel, i12);
                    this.f95464h.writeToParcel(parcel, i12);
                    parcel.writeInt(this.f95465i ? 1 : 0);
                }

                public LoanApproved(long j12, long j13, @k AppBarData appBarData, @k ListData listData, boolean z12) {
                    super(appBarData, listData, z12, null);
                    this.f95461e = j12;
                    this.f95462f = j13;
                    this.f95463g = appBarData;
                    this.f95464h = listData;
                    this.f95465i = z12;
                }
            }

            /* compiled from: AutoLoansCabinetState.kt */
            @P
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetState$BlanksState$Success$LoanReject;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetState$BlanksState$Success;", "LKe/c;", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class LoanReject extends Success implements c {

                @k
                public static final Parcelable.Creator<LoanReject> CREATOR = new a();

                /* renamed from: e, reason: collision with root package name */
                public final long f95466e;

                /* renamed from: f, reason: collision with root package name */
                public final long f95467f;

                /* renamed from: g, reason: collision with root package name */
                @k
                public final AppBarData f95468g;

                /* renamed from: h, reason: collision with root package name */
                @k
                public final ListData f95469h;

                /* renamed from: i, reason: collision with root package name */
                public final boolean f95470i;

                /* compiled from: AutoLoansCabinetState.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<LoanReject> {
                    @Override // android.os.Parcelable.Creator
                    public final LoanReject createFromParcel(Parcel parcel) {
                        return new LoanReject(parcel.readLong(), parcel.readLong(), AppBarData.CREATOR.createFromParcel(parcel), ListData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final LoanReject[] newArray(int i12) {
                        return new LoanReject[i12];
                    }
                }

                public /* synthetic */ LoanReject(long j12, long j13, AppBarData appBarData, ListData listData, boolean z12, int i12, C42822w c42822w) {
                    this(j12, j13, appBarData, listData, (i12 & 16) != 0 ? false : z12);
                }

                @Override // com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetState.BlanksState.Success
                @k
                /* renamed from: c, reason: from getter */
                public final AppBarData getF95453b() {
                    return this.f95468g;
                }

                @Override // com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetState.BlanksState.Success
                @k
                /* renamed from: d, reason: from getter */
                public final ListData getF95454c() {
                    return this.f95469h;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetState.BlanksState.Success
                /* renamed from: e, reason: from getter */
                public final boolean getF95455d() {
                    return this.f95470i;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof LoanReject)) {
                        return false;
                    }
                    LoanReject loanReject = (LoanReject) obj;
                    return this.f95466e == loanReject.f95466e && this.f95467f == loanReject.f95467f && L.f(this.f95468g, loanReject.f95468g) && L.f(this.f95469h, loanReject.f95469h) && this.f95470i == loanReject.f95470i;
                }

                @Override // Ke.c
                /* renamed from: getItemId, reason: from getter */
                public final long getF95466e() {
                    return this.f95466e;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.f95470i) + e.g(this.f95469h.f95487b, (this.f95468g.hashCode() + r.g(Long.hashCode(this.f95466e) * 31, 31, this.f95467f)) * 31, 31);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("LoanReject(itemId=");
                    sb2.append(this.f95466e);
                    sb2.append(", ofpApplicationId=");
                    sb2.append(this.f95467f);
                    sb2.append(", appBarData=");
                    sb2.append(this.f95468g);
                    sb2.append(", listData=");
                    sb2.append(this.f95469h);
                    sb2.append(", isLoanDetailsBottomSheetVisible=");
                    return r.x(sb2, this.f95470i, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeLong(this.f95466e);
                    parcel.writeLong(this.f95467f);
                    this.f95468g.writeToParcel(parcel, i12);
                    this.f95469h.writeToParcel(parcel, i12);
                    parcel.writeInt(this.f95470i ? 1 : 0);
                }

                public LoanReject(long j12, long j13, @k AppBarData appBarData, @k ListData listData, boolean z12) {
                    super(appBarData, listData, z12, null);
                    this.f95466e = j12;
                    this.f95467f = j13;
                    this.f95468g = appBarData;
                    this.f95469h = listData;
                    this.f95470i = z12;
                }
            }

            /* compiled from: AutoLoansCabinetState.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetState$BlanksState$Success$NoLoans;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetState$BlanksState$Success;", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class NoLoans extends Success {

                @k
                public static final Parcelable.Creator<NoLoans> CREATOR = new a();

                /* renamed from: e, reason: collision with root package name */
                @k
                public final AppBarData f95471e;

                /* renamed from: f, reason: collision with root package name */
                @k
                public final ListData f95472f;

                /* renamed from: g, reason: collision with root package name */
                public final boolean f95473g;

                /* compiled from: AutoLoansCabinetState.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<NoLoans> {
                    @Override // android.os.Parcelable.Creator
                    public final NoLoans createFromParcel(Parcel parcel) {
                        return new NoLoans(AppBarData.CREATOR.createFromParcel(parcel), ListData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final NoLoans[] newArray(int i12) {
                        return new NoLoans[i12];
                    }
                }

                public /* synthetic */ NoLoans(AppBarData appBarData, ListData listData, boolean z12, int i12, C42822w c42822w) {
                    this(appBarData, listData, (i12 & 4) != 0 ? false : z12);
                }

                @Override // com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetState.BlanksState.Success
                @k
                /* renamed from: c, reason: from getter */
                public final AppBarData getF95453b() {
                    return this.f95471e;
                }

                @Override // com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetState.BlanksState.Success
                @k
                /* renamed from: d, reason: from getter */
                public final ListData getF95454c() {
                    return this.f95472f;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetState.BlanksState.Success
                /* renamed from: e, reason: from getter */
                public final boolean getF95455d() {
                    return this.f95473g;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof NoLoans)) {
                        return false;
                    }
                    NoLoans noLoans = (NoLoans) obj;
                    return L.f(this.f95471e, noLoans.f95471e) && L.f(this.f95472f, noLoans.f95472f) && this.f95473g == noLoans.f95473g;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.f95473g) + e.g(this.f95472f.f95487b, this.f95471e.hashCode() * 31, 31);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("NoLoans(appBarData=");
                    sb2.append(this.f95471e);
                    sb2.append(", listData=");
                    sb2.append(this.f95472f);
                    sb2.append(", isLoanDetailsBottomSheetVisible=");
                    return r.x(sb2, this.f95473g, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    this.f95471e.writeToParcel(parcel, i12);
                    this.f95472f.writeToParcel(parcel, i12);
                    parcel.writeInt(this.f95473g ? 1 : 0);
                }

                public NoLoans(@k AppBarData appBarData, @k ListData listData, boolean z12) {
                    super(appBarData, listData, z12, null);
                    this.f95471e = appBarData;
                    this.f95472f = listData;
                    this.f95473g = z12;
                }
            }

            public /* synthetic */ Success(AppBarData appBarData, ListData listData, boolean z12, int i12, C42822w c42822w) {
                this(appBarData, listData, (i12 & 4) != 0 ? false : z12, null);
            }

            @k
            /* renamed from: c, reason: from getter */
            public AppBarData getF95453b() {
                return this.f95453b;
            }

            @k
            /* renamed from: d, reason: from getter */
            public ListData getF95454c() {
                return this.f95454c;
            }

            /* renamed from: e, reason: from getter */
            public boolean getF95455d() {
                return this.f95455d;
            }

            public Success(AppBarData appBarData, ListData listData, boolean z12, C42822w c42822w) {
                super(null);
                this.f95453b = appBarData;
                this.f95454c = listData;
                this.f95455d = z12;
            }
        }

        public /* synthetic */ BlanksState(C42822w c42822w) {
            this();
        }

        public BlanksState() {
        }
    }

    /* compiled from: AutoLoansCabinetState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetState$a;", "", "<init>", "()V", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AutoLoansCabinetState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<AutoLoansCabinetState> {
        @Override // android.os.Parcelable.Creator
        public final AutoLoansCabinetState createFromParcel(Parcel parcel) {
            return new AutoLoansCabinetState((BlanksState) parcel.readParcelable(AutoLoansCabinetState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AutoLoansCabinetState[] newArray(int i12) {
            return new AutoLoansCabinetState[i12];
        }
    }

    public AutoLoansCabinetState(@k BlanksState blanksState) {
        this.f95450b = blanksState;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AutoLoansCabinetState) && L.f(this.f95450b, ((AutoLoansCabinetState) obj).f95450b);
    }

    public final int hashCode() {
        return this.f95450b.hashCode();
    }

    @k
    public final String toString() {
        return "AutoLoansCabinetState(blanksState=" + this.f95450b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f95450b, i12);
    }
}
