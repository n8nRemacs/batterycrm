package com.avito.android.sx_address.new_address.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.sx_address.new_address.domain.AddressType;
import com.avito.android.sx_address.new_address.domain.HideAddress;
import com.avito.android.sx_address.new_address.domain.WeekDay;
import com.avito.android.sx_address.new_address.domain.WorkingHours;
import com.avito.android.sx_address.new_address.mvi.B;
import com.avito.android.sx_address.new_address.mvi.SxNewAddressMviState;
import com.avito.android.sx_address.new_address.mvi.SxNewAddressMviViewState;
import com.avito.android.sx_address.new_address.view.s;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SxNewAddressMviReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/D;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/sx_address/new_address/mvi/B;", "Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviState;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class D implements com.avito.android.arch.mvi.u<B, SxNewAddressMviState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final F f293709b;

    /* compiled from: SxNewAddressMviReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[SxNewAddressMviState.LoadingType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SxNewAddressMviState.LoadingType loadingType = SxNewAddressMviState.LoadingType.f293726b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                SxNewAddressMviState.LoadingType loadingType2 = SxNewAddressMviState.LoadingType.f293726b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public D(@Y61.k F f12) {
        this.f293709b = f12;
    }

    public static WorkingHours b(WorkingHours workingHours, WeekDay weekDay, boolean z12, WorkingHours.Day.Time time, WorkingHours.Day.Time time2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(workingHours.f293632b);
        WorkingHours.Day day = ((WorkingHours.Day) linkedHashMap.get(weekDay)) != null ? new WorkingHours.Day(time, z12, time2) : null;
        if (day != null) {
            linkedHashMap.put(weekDay, day);
        }
        return new WorkingHours(workingHours.f293634d, linkedHashMap, workingHours.f293633c);
    }

    @Override // com.avito.android.arch.mvi.u
    public final SxNewAddressMviState a(B b12, SxNewAddressMviState sxNewAddressMviState) {
        SxNewAddressMviViewState content;
        SxNewAddressMviViewState sxNewAddressMviViewState;
        WorkingHours workingHoursB;
        B b13 = b12;
        SxNewAddressMviState sxNewAddressMviStateA = sxNewAddressMviState;
        boolean z12 = b13 instanceof B.a;
        F f12 = this.f293709b;
        if (z12) {
            return f12.a(SxNewAddressMviState.a(sxNewAddressMviStateA, null, null, null, new SxNewAddressMviState.TitleContent(((B.a) b13).f293677a, sxNewAddressMviStateA.f293717e.f293733c), null, null, null, 247), null);
        }
        if (b13 instanceof B.s) {
            SxNewAddressMviState.TypesContent typesContent = sxNewAddressMviStateA.f293718f;
            Iterable<AddressType> iterable = (Iterable) typesContent.f293734b;
            ArrayList arrayList = new ArrayList(C42745f0.q(iterable, 10));
            for (AddressType addressTypeA : iterable) {
                if (L.f(((B.s) b13).f293698a.f293603c, addressTypeA.f293603c)) {
                    addressTypeA = AddressType.a(addressTypeA, !addressTypeA.f293604d);
                }
                arrayList.add(addressTypeA);
            }
            return f12.a(SxNewAddressMviState.a(sxNewAddressMviStateA, null, null, null, null, new SxNewAddressMviState.TypesContent(arrayList, typesContent.f293735c), null, null, 239), null);
        }
        if (b13 instanceof B.e) {
            sxNewAddressMviStateA.f293719g.getClass();
            return f12.a(SxNewAddressMviState.a(sxNewAddressMviStateA, null, null, null, null, null, new SxNewAddressMviState.DetailsContent(((B.e) b13).f293682a), null, 223), null);
        }
        boolean z13 = b13 instanceof B.o;
        SxNewAddressMviState.WorkingSchedulerContent workingSchedulerContent = sxNewAddressMviStateA.f293720h;
        if (z13) {
            return f12.a(SxNewAddressMviState.a(sxNewAddressMviStateA, null, null, null, null, null, null, SxNewAddressMviState.WorkingSchedulerContent.a(workingSchedulerContent, null, ((B.o) b13).f293692a, 1), 191), null);
        }
        if (b13 instanceof B.d) {
            B.d dVar = (B.d) b13;
            WorkingHours.Day day = workingSchedulerContent.f293736b.f293632b.get(dVar.f293681b);
            if (day != null) {
                sxNewAddressMviStateA = SxNewAddressMviState.a(sxNewAddressMviStateA, null, null, null, null, null, null, SxNewAddressMviState.WorkingSchedulerContent.a(workingSchedulerContent, b(workingSchedulerContent.f293736b, dVar.f293681b, dVar.f293680a, day.f293635b, day.f293637d), null, 2), 191);
            }
            return f12.a(sxNewAddressMviStateA, null);
        }
        if (b13 instanceof B.h) {
            Map<WeekDay, WorkingHours.Day> map = workingSchedulerContent.f293736b.f293632b;
            com.avito.android.sx_address.new_address.view.s sVar = ((B.h) b13).f293685a;
            WorkingHours.Day day2 = map.get(sVar.getF293996a());
            if (day2 == null) {
                return sxNewAddressMviStateA;
            }
            boolean z14 = sVar instanceof s.a;
            WorkingHours workingHours = workingSchedulerContent.f293736b;
            boolean z15 = day2.f293636c;
            if (z14) {
                workingHoursB = b(workingHours, sVar.getF293996a(), z15, sVar.getF293997b(), day2.f293637d);
            } else {
                if (!(sVar instanceof s.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                workingHoursB = b(workingHours, sVar.getF293996a(), z15, day2.f293635b, sVar.getF293997b());
            }
            SxNewAddressMviState sxNewAddressMviStateA2 = SxNewAddressMviState.a(sxNewAddressMviStateA, null, null, null, null, null, null, SxNewAddressMviState.WorkingSchedulerContent.a(workingSchedulerContent, workingHoursB, null, 2), 191);
            f12.a(sxNewAddressMviStateA2, null);
            return sxNewAddressMviStateA2;
        }
        if (b13 instanceof B.i) {
            B.i iVar = (B.i) b13;
            SxNewAddressMviState sxNewAddressMviState2 = iVar.f293686a;
            int iOrdinal = sxNewAddressMviState2.f293714b.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    sxNewAddressMviViewState = SxNewAddressMviViewState.Loading.f293744b;
                } else {
                    if (iOrdinal != 2) {
                        throw new IllegalStateException("Error is not FirstRender action");
                    }
                    sxNewAddressMviViewState = SxNewAddressMviViewState.SaveLoading.f293746b;
                }
                content = sxNewAddressMviViewState;
            } else {
                content = new SxNewAddressMviViewState.Content(sxNewAddressMviState2.f293716d, sxNewAddressMviState2.f293717e, sxNewAddressMviState2.f293718f, sxNewAddressMviState2.f293719g, sxNewAddressMviState2.f293720h, sxNewAddressMviState2.f293721i);
            }
            return f12.a(SxNewAddressMviState.a(iVar.f293686a, null, content, null, null, null, null, null, 253), null);
        }
        if (b13 instanceof B.n) {
            return f12.a(SxNewAddressMviState.a(sxNewAddressMviStateA, ((B.n) b13).f293691a ? SxNewAddressMviState.LoadingType.f293728d : SxNewAddressMviState.LoadingType.f293726b, null, null, null, null, null, null, 254), null);
        }
        if (b13 instanceof B.f) {
            return f12.a(SxNewAddressMviState.a(sxNewAddressMviStateA, SxNewAddressMviState.LoadingType.f293726b, null, null, null, null, null, null, 254), null);
        }
        if (b13 instanceof B.g) {
            return f12.a(SxNewAddressMviState.a(sxNewAddressMviStateA, SxNewAddressMviState.LoadingType.f293727c, null, null, null, null, null, null, 254), null);
        }
        if (b13 instanceof B.l) {
            return f12.a(SxNewAddressMviState.a(sxNewAddressMviStateA, SxNewAddressMviState.LoadingType.f293729e, null, null, null, null, null, null, 254), ((B.l) b13).f293689a);
        }
        boolean z16 = b13 instanceof B.b;
        SxNewAddressMviState.AddressContent addressContent = sxNewAddressMviStateA.f293716d;
        if (z16) {
            return f12.a(SxNewAddressMviState.a(sxNewAddressMviStateA, null, null, SxNewAddressMviState.AddressContent.a(addressContent, null, 6), null, null, null, null, 251), null);
        }
        if (!(b13 instanceof B.j)) {
            return sxNewAddressMviStateA;
        }
        HideAddress hideAddress = addressContent.f293724d;
        return f12.a(SxNewAddressMviState.a(sxNewAddressMviStateA, null, null, SxNewAddressMviState.AddressContent.a(addressContent, hideAddress != null ? new HideAddress(hideAddress.f293614b, hideAddress.f293615c, ((B.j) b13).f293687a) : null, 3), null, null, null, null, 251), null);
    }
}
