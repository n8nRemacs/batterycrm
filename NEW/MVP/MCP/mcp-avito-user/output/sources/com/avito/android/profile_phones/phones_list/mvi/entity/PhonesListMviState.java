package com.avito.android.profile_phones.phones_list.mvi.entity;

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
import com.avito.android.iac_incoming_call_ability.public_module.iac_enable.ScheduleOption;
import com.avito.android.profile_phones.phones_list.device_list_item.DeviceListItem;
import com.avito.android.profile_phones.phones_list.mvi.entity.NumbersListState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;
import org.threeten.bp.g;

/* compiled from: PhonesListMviState.kt */
@d
@H0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class PhonesListMviState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f228018b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f228019c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f228020d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final NumbersListState f228021e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<DeviceListItem> f228022f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final g f228023g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final g f228024h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f228025i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final List<ScheduleOption> f228026j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f228027k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f228028l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f228029m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f228030n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final IacEnableSwitchState f228031o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public final Boolean f228032p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f228033q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public static final a f228016r = new a(null);

    @k
    public static final Parcelable.Creator<PhonesListMviState> CREATOR = new b();

    /* renamed from: s, reason: collision with root package name */
    @k
    public static final PhonesListMviState f228017s = new PhonesListMviState(true, false, false, NumbersListState.Default.f227976b, C42784z0.f406748b, null, null, "", null, false, false, false, false, null, null, false, 65286, null);

    /* compiled from: PhonesListMviState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviState$a;", "", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PhonesListMviState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<PhonesListMviState> {
        @Override // android.os.Parcelable.Creator
        public final PhonesListMviState createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            NumbersListState numbersListState = (NumbersListState) parcel.readParcelable(PhonesListMviState.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(DeviceListItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            g gVar = (g) parcel.readSerializable();
            g gVar2 = (g) parcel.readSerializable();
            String string = parcel.readString();
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            int iL2 = 0;
            while (iL2 != i13) {
                iL2 = com.avito.android.actions_sheet.a.l(PhonesListMviState.class, parcel, arrayList2, iL2, 1);
            }
            boolean z15 = parcel.readInt() != 0;
            boolean z16 = parcel.readInt() != 0;
            boolean z17 = parcel.readInt() != 0;
            boolean z18 = parcel.readInt() != 0;
            IacEnableSwitchState iacEnableSwitchStateCreateFromParcel = parcel.readInt() == 0 ? null : IacEnableSwitchState.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PhonesListMviState(z12, z13, z14, numbersListState, arrayList, gVar, gVar2, string, arrayList2, z15, z16, z17, z18, iacEnableSwitchStateCreateFromParcel, boolValueOf, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PhonesListMviState[] newArray(int i12) {
            return new PhonesListMviState[i12];
        }
    }

    public PhonesListMviState(boolean z12, boolean z13, boolean z14, @k NumbersListState numbersListState, @k List<DeviceListItem> list, @l g gVar, @l g gVar2, @k String str, @k List<ScheduleOption> list2, boolean z15, boolean z16, boolean z17, boolean z18, @l IacEnableSwitchState iacEnableSwitchState, @l Boolean bool, boolean z19) {
        this.f228018b = z12;
        this.f228019c = z13;
        this.f228020d = z14;
        this.f228021e = numbersListState;
        this.f228022f = list;
        this.f228023g = gVar;
        this.f228024h = gVar2;
        this.f228025i = str;
        this.f228026j = list2;
        this.f228027k = z15;
        this.f228028l = z16;
        this.f228029m = z17;
        this.f228030n = z18;
        this.f228031o = iacEnableSwitchState;
        this.f228032p = bool;
        this.f228033q = z19;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PhonesListMviState a(PhonesListMviState phonesListMviState, boolean z12, NumbersListState numbersListState, ArrayList arrayList, g gVar, g gVar2, String str, ArrayList arrayList2, boolean z13, boolean z14, boolean z15, IacEnableSwitchState iacEnableSwitchState, Boolean bool, int i12) {
        boolean z16 = (i12 & 1) != 0 ? phonesListMviState.f228018b : true;
        boolean z17 = phonesListMviState.f228019c;
        boolean z18 = (i12 & 4) != 0 ? phonesListMviState.f228020d : z12;
        NumbersListState numbersListState2 = (i12 & 8) != 0 ? phonesListMviState.f228021e : numbersListState;
        List list = (i12 & 16) != 0 ? phonesListMviState.f228022f : arrayList;
        g gVar3 = (i12 & 32) != 0 ? phonesListMviState.f228023g : gVar;
        g gVar4 = (i12 & 64) != 0 ? phonesListMviState.f228024h : gVar2;
        String str2 = (i12 & 128) != 0 ? phonesListMviState.f228025i : str;
        List list2 = (i12 & 256) != 0 ? phonesListMviState.f228026j : arrayList2;
        boolean z19 = phonesListMviState.f228027k;
        boolean z22 = (i12 & 1024) != 0 ? phonesListMviState.f228028l : z13;
        boolean z23 = (i12 & 2048) != 0 ? phonesListMviState.f228029m : z14;
        boolean z24 = (i12 & 4096) != 0 ? phonesListMviState.f228030n : z15;
        IacEnableSwitchState iacEnableSwitchState2 = (i12 & 8192) != 0 ? phonesListMviState.f228031o : iacEnableSwitchState;
        Boolean bool2 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? phonesListMviState.f228032p : bool;
        boolean z25 = phonesListMviState.f228033q;
        phonesListMviState.getClass();
        return new PhonesListMviState(z16, z17, z18, numbersListState2, list, gVar3, gVar4, str2, list2, z19, z22, z23, z24, iacEnableSwitchState2, bool2, z25);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhonesListMviState)) {
            return false;
        }
        PhonesListMviState phonesListMviState = (PhonesListMviState) obj;
        return this.f228018b == phonesListMviState.f228018b && this.f228019c == phonesListMviState.f228019c && this.f228020d == phonesListMviState.f228020d && L.f(this.f228021e, phonesListMviState.f228021e) && L.f(this.f228022f, phonesListMviState.f228022f) && L.f(this.f228023g, phonesListMviState.f228023g) && L.f(this.f228024h, phonesListMviState.f228024h) && L.f(this.f228025i, phonesListMviState.f228025i) && L.f(this.f228026j, phonesListMviState.f228026j) && this.f228027k == phonesListMviState.f228027k && this.f228028l == phonesListMviState.f228028l && this.f228029m == phonesListMviState.f228029m && this.f228030n == phonesListMviState.f228030n && L.f(this.f228031o, phonesListMviState.f228031o) && L.f(this.f228032p, phonesListMviState.f228032p) && this.f228033q == phonesListMviState.f228033q;
    }

    public final int hashCode() {
        int iE2 = H.e((this.f228021e.hashCode() + r.i(r.i(Boolean.hashCode(this.f228018b) * 31, 31, this.f228019c), 31, this.f228020d)) * 31, 31, this.f228022f);
        g gVar = this.f228023g;
        int iHashCode = (iE2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        g gVar2 = this.f228024h;
        int i12 = r.i(r.i(r.i(r.i(H.e(H.d((iHashCode + (gVar2 == null ? 0 : gVar2.hashCode())) * 31, 31, this.f228025i), 31, this.f228026j), 31, this.f228027k), 31, this.f228028l), 31, this.f228029m), 31, this.f228030n);
        IacEnableSwitchState iacEnableSwitchState = this.f228031o;
        int iHashCode2 = (i12 + (iacEnableSwitchState == null ? 0 : iacEnableSwitchState.hashCode())) * 31;
        Boolean bool = this.f228032p;
        return Boolean.hashCode(this.f228033q) + ((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhonesListMviState(isFullScreenLoading=");
        sb2.append(this.f228018b);
        sb2.append(", canChangeStateIacEnable=");
        sb2.append(this.f228019c);
        sb2.append(", iacEnabled=");
        sb2.append(this.f228020d);
        sb2.append(", numbersState=");
        sb2.append(this.f228021e);
        sb2.append(", devicesList=");
        sb2.append(this.f228022f);
        sb2.append(", timePickerStart=");
        sb2.append(this.f228023g);
        sb2.append(", timePickerEnd=");
        sb2.append(this.f228024h);
        sb2.append(", timeString=");
        sb2.append(this.f228025i);
        sb2.append(", scheduleOptions=");
        sb2.append(this.f228026j);
        sb2.append(", callTimeSettingsVisible=");
        sb2.append(this.f228027k);
        sb2.append(", needShowIacProblemBlock=");
        sb2.append(this.f228028l);
        sb2.append(", needShowIacEnableTrueBlock=");
        sb2.append(this.f228029m);
        sb2.append(", needShowIacEnableSwitchBlock=");
        sb2.append(this.f228030n);
        sb2.append(", iacEnableSwitchState=");
        sb2.append(this.f228031o);
        sb2.append(", initialIacEnabledValue=");
        sb2.append(this.f228032p);
        sb2.append(", needTrackOpenEvent=");
        return r.x(sb2, this.f228033q, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f228018b ? 1 : 0);
        parcel.writeInt(this.f228019c ? 1 : 0);
        parcel.writeInt(this.f228020d ? 1 : 0);
        parcel.writeParcelable(this.f228021e, i12);
        Iterator itJ = C0.j(this.f228022f, parcel);
        while (itJ.hasNext()) {
            ((DeviceListItem) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeSerializable(this.f228023g);
        parcel.writeSerializable(this.f228024h);
        parcel.writeString(this.f228025i);
        Iterator itJ2 = C0.j(this.f228026j, parcel);
        while (itJ2.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ2.next(), i12);
        }
        parcel.writeInt(this.f228027k ? 1 : 0);
        parcel.writeInt(this.f228028l ? 1 : 0);
        parcel.writeInt(this.f228029m ? 1 : 0);
        parcel.writeInt(this.f228030n ? 1 : 0);
        IacEnableSwitchState iacEnableSwitchState = this.f228031o;
        if (iacEnableSwitchState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iacEnableSwitchState.writeToParcel(parcel, i12);
        }
        Boolean bool = this.f228032p;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeInt(this.f228033q ? 1 : 0);
    }

    public PhonesListMviState(boolean z12, boolean z13, boolean z14, NumbersListState numbersListState, List list, g gVar, g gVar2, String str, List list2, boolean z15, boolean z16, boolean z17, boolean z18, IacEnableSwitchState iacEnableSwitchState, Boolean bool, boolean z19, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13, (i12 & 4) != 0 ? false : z14, numbersListState, list, gVar, gVar2, str, (i12 & 256) != 0 ? C42784z0.f406748b : list2, (i12 & 512) != 0 ? true : z15, (i12 & 1024) != 0 ? false : z16, (i12 & 2048) != 0 ? false : z17, (i12 & 4096) != 0 ? false : z18, (i12 & 8192) != 0 ? null : iacEnableSwitchState, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : bool, (i12 & 32768) != 0 ? true : z19);
    }
}
