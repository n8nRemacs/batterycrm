package com.avito.android.iac_calls_history.impl_module.screen.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.H0;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.iac_calls_history.impl_module.models.CallsHistoryTab;
import com.avito.android.iac_calls_history.impl_module.models.CallsHistoryTabType;
import com.yandex.div2.D8;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CallsHistoryScreenState.kt */
@d
@H0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "Item", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CallsHistoryScreenState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<CallsHistoryTab> f164824b;

    /* renamed from: c, reason: collision with root package name */
    public final int f164825c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Long f164826d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<Item> f164827e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final LocalDate f164828f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f164823g = new a(null);

    @k
    public static final Parcelable.Creator<CallsHistoryScreenState> CREATOR = new b();

    /* compiled from: CallsHistoryScreenState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenState$Item;", "Landroid/os/Parcelable;", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Item extends Parcelable {
    }

    /* compiled from: CallsHistoryScreenState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenState$a;", "", "<init>", "()V", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CallsHistoryScreenState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<CallsHistoryScreenState> {
        @Override // android.os.Parcelable.Creator
        public final CallsHistoryScreenState createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(CallsHistoryTab.CREATOR, parcel, arrayList, iC2, 1);
            }
            int i13 = parcel.readInt();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            int i14 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i14);
            while (iL2 != i14) {
                iL2 = com.avito.android.actions_sheet.a.l(CallsHistoryScreenState.class, parcel, arrayList2, iL2, 1);
            }
            return new CallsHistoryScreenState(arrayList, i13, lValueOf, arrayList2, (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final CallsHistoryScreenState[] newArray(int i12) {
            return new CallsHistoryScreenState[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CallsHistoryScreenState(@k List<CallsHistoryTab> list, int i12, @l Long l12, @k List<? extends Item> list2, @k LocalDate localDate) {
        this.f164824b = list;
        this.f164825c = i12;
        this.f164826d = l12;
        this.f164827e = list2;
        this.f164828f = localDate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CallsHistoryScreenState a(CallsHistoryScreenState callsHistoryScreenState, ArrayList arrayList, int i12, Long l12, List list, int i13) {
        List list2 = arrayList;
        if ((i13 & 1) != 0) {
            list2 = callsHistoryScreenState.f164824b;
        }
        List list3 = list2;
        if ((i13 & 2) != 0) {
            i12 = callsHistoryScreenState.f164825c;
        }
        int i14 = i12;
        if ((i13 & 4) != 0) {
            l12 = callsHistoryScreenState.f164826d;
        }
        Long l13 = l12;
        if ((i13 & 8) != 0) {
            list = callsHistoryScreenState.f164827e;
        }
        LocalDate localDate = callsHistoryScreenState.f164828f;
        callsHistoryScreenState.getClass();
        return new CallsHistoryScreenState(list3, i14, l13, list, localDate);
    }

    @k
    public final CallsHistoryTabType c() {
        return this.f164824b.get(this.f164825c).f164753b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallsHistoryScreenState)) {
            return false;
        }
        CallsHistoryScreenState callsHistoryScreenState = (CallsHistoryScreenState) obj;
        return L.f(this.f164824b, callsHistoryScreenState.f164824b) && this.f164825c == callsHistoryScreenState.f164825c && L.f(this.f164826d, callsHistoryScreenState.f164826d) && L.f(this.f164827e, callsHistoryScreenState.f164827e) && L.f(this.f164828f, callsHistoryScreenState.f164828f);
    }

    public final int hashCode() {
        int iE2 = r.e(this.f164825c, this.f164824b.hashCode() * 31, 31);
        Long l12 = this.f164826d;
        return this.f164828f.hashCode() + H.e((iE2 + (l12 == null ? 0 : l12.hashCode())) * 31, 31, this.f164827e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CallsHistoryScreenState(selectedTabPosition=");
        sb2.append(this.f164825c);
        sb2.append(", itemsLoadingId=");
        sb2.append(this.f164826d);
        sb2.append(", itemsCount=");
        D8.r(this.f164827e, sb2, ", tabs=");
        return H.p(sb2, this.f164824b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f164824b, parcel);
        while (itJ.hasNext()) {
            ((CallsHistoryTab) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f164825c);
        Long l12 = this.f164826d;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        Iterator itJ2 = C0.j(this.f164827e, parcel);
        while (itJ2.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ2.next(), i12);
        }
        parcel.writeSerializable(this.f164828f);
    }
}
