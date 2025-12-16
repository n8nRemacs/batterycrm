package com.avito.android.profile_phones.phones_list.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.iac_incoming_call_ability.public_module.iac_enable.ScheduleOption;
import com.avito.android.iac_problems.public_module.models.IacProblem;
import com.avito.android.profile_phones.phones_list.device_list_item.DeviceListItem;
import com.avito.android.profile_phones.phones_list.mvi.entity.IacEnableSwitchState;
import com.avito.android.profile_phones.phones_list.mvi.entity.NumbersListState;
import com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction;
import com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviState;
import com.avito.android.util.InterfaceC35741a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import nJ.C44273h;
import pM.InterfaceC46977a;

/* compiled from: PhonesListMviReducer.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/N;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviState;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class N implements com.avito.android.arch.mvi.u<PhonesListMviInternalAction, PhonesListMviState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_phones.phones_list.L f227936b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC46977a f227937c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f227938d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.permissions.z f227939e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f227940f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33429a f227941g;

    @Inject
    public N(@Y61.k com.avito.android.profile_phones.phones_list.L l12, @Y61.k InterfaceC46977a interfaceC46977a, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.permissions.z zVar, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k InterfaceC33429a interfaceC33429a) {
        this.f227936b = l12;
        this.f227937c = interfaceC46977a;
        this.f227938d = interfaceC28373a;
        this.f227939e = zVar;
        this.f227940f = interfaceC35741a1;
        this.f227941g = interfaceC33429a;
    }

    public static NumbersListState c(List list, NumbersListState numbersListState) {
        if (list.isEmpty()) {
            return NumbersListState.EmptyNumbers.f227977b;
        }
        boolean z12 = false;
        boolean z13 = list.size() > O.f227945d;
        NumbersListState.Loaded loaded = numbersListState instanceof NumbersListState.Loaded ? (NumbersListState.Loaded) numbersListState : null;
        if (loaded != null && loaded.f227982d) {
            z12 = true;
        }
        return new NumbersListState.Loaded(list, z13, z12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.u
    public final PhonesListMviState a(PhonesListMviInternalAction phonesListMviInternalAction, PhonesListMviState phonesListMviState) {
        PhonesListMviInternalAction phonesListMviInternalAction2 = phonesListMviInternalAction;
        PhonesListMviState phonesListMviState2 = phonesListMviState;
        if (phonesListMviInternalAction2 instanceof PhonesListMviInternalAction.FullScreenLoading) {
            return PhonesListMviState.a(phonesListMviState2, false, null, null, null, null, null, null, false, false, false, null, null, 65534);
        }
        boolean z12 = phonesListMviInternalAction2 instanceof PhonesListMviInternalAction.Content;
        NumbersListState numbersListState = phonesListMviState2.f228021e;
        if (z12) {
            PhonesListMviInternalAction.Content content = (PhonesListMviInternalAction.Content) phonesListMviInternalAction2;
            return b(phonesListMviState2, content.f227986c, c(content.f227985b, numbersListState));
        }
        boolean z13 = phonesListMviInternalAction2 instanceof PhonesListMviInternalAction.ContentWithPhonesError;
        InterfaceC35741a1 interfaceC35741a1 = this.f227940f;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i12 = 2;
        boolean z14 = false;
        if (z13) {
            PhonesListMviInternalAction.ContentWithPhonesError contentWithPhonesError = (PhonesListMviInternalAction.ContentWithPhonesError) phonesListMviInternalAction2;
            return b(phonesListMviState2, contentWithPhonesError.f227988c, new NumbersListState.Error(InterfaceC35741a1.a.a(interfaceC35741a1, contentWithPhonesError.f227987b, null, null, 6), z14, i12, objArr2 == true ? 1 : 0));
        }
        if (phonesListMviInternalAction2.equals(PhonesListMviInternalAction.NumbersFailedViewLoading.f227999b)) {
            return PhonesListMviState.a(phonesListMviState2, false, new NumbersListState.Error(((NumbersListState.Error) numbersListState).f227978b, true), null, null, null, null, null, false, false, false, null, null, 65527);
        }
        if (phonesListMviInternalAction2 instanceof PhonesListMviInternalAction.NumbersContent) {
            return PhonesListMviState.a(phonesListMviState2, false, c(((PhonesListMviInternalAction.NumbersContent) phonesListMviInternalAction2).f227997b, numbersListState), null, null, null, null, null, false, false, false, null, null, 65527);
        }
        if (phonesListMviInternalAction2 instanceof PhonesListMviInternalAction.NumbersFailed) {
            return PhonesListMviState.a(phonesListMviState2, false, new NumbersListState.Error(InterfaceC35741a1.a.a(interfaceC35741a1, ((PhonesListMviInternalAction.NumbersFailed) phonesListMviInternalAction2).f227998b, null, null, 6), z14, i12, objArr == true ? 1 : 0), null, null, null, null, null, false, false, false, null, null, 65527);
        }
        if (phonesListMviInternalAction2 instanceof PhonesListMviInternalAction.ChangePhonesExpandState) {
            if ((numbersListState instanceof NumbersListState.Loaded ? (NumbersListState.Loaded) numbersListState : null) == null) {
                return phonesListMviState2;
            }
            NumbersListState.Loaded loaded = (NumbersListState.Loaded) numbersListState;
            return PhonesListMviState.a(phonesListMviState2, false, new NumbersListState.Loaded(loaded.f227980b, loaded.f227981c, !loaded.f227982d), null, null, null, null, null, false, false, false, null, null, 65527);
        }
        if (phonesListMviInternalAction2 instanceof PhonesListMviInternalAction.UpdateTimePicker) {
            PhonesListMviInternalAction.UpdateTimePicker updateTimePicker = (PhonesListMviInternalAction.UpdateTimePicker) phonesListMviInternalAction2;
            org.threeten.bp.g gVar = updateTimePicker.f228014b;
            org.threeten.bp.g gVar2 = updateTimePicker.f228015c;
            return PhonesListMviState.a(phonesListMviState2, false, null, null, gVar, gVar2, d(gVar, gVar2), null, false, false, false, null, null, 65311);
        }
        boolean zEquals = phonesListMviInternalAction2.equals(PhonesListMviInternalAction.RefreshIacProblemBanner.f228009b);
        boolean z15 = phonesListMviState2.f228020d;
        boolean z16 = phonesListMviState2.f228028l;
        if (zEquals) {
            return PhonesListMviState.a(phonesListMviState2, false, null, null, null, null, null, null, e(z15, z16), false, false, null, null, 64511);
        }
        boolean z17 = phonesListMviInternalAction2 instanceof PhonesListMviInternalAction.IacEnableChangeError;
        IacEnableSwitchState iacEnableSwitchState = phonesListMviState2.f228031o;
        if (z17) {
            return PhonesListMviState.a(phonesListMviState2, false, null, null, null, null, null, null, false, false, false, iacEnableSwitchState != null ? new IacEnableSwitchState(iacEnableSwitchState.f227974b, false) : null, null, 57343);
        }
        if (phonesListMviInternalAction2.equals(PhonesListMviInternalAction.IacEnableSwitchLoading.f227995b)) {
            return PhonesListMviState.a(phonesListMviState2, false, null, null, null, null, null, null, false, false, false, iacEnableSwitchState != null ? new IacEnableSwitchState(iacEnableSwitchState.f227974b, true) : null, null, 57343);
        }
        if (phonesListMviInternalAction2 instanceof PhonesListMviInternalAction.IacEnableChangeState) {
            PhonesListMviInternalAction.IacEnableChangeState iacEnableChangeState = (PhonesListMviInternalAction.IacEnableChangeState) phonesListMviInternalAction2;
            boolean z18 = iacEnableChangeState.f227993b;
            return PhonesListMviState.a(phonesListMviState2, iacEnableChangeState.f227993b, null, null, null, null, null, null, e(z18, z16), false, false, new IacEnableSwitchState(z18, false), null, 56315);
        }
        if (phonesListMviInternalAction2 instanceof PhonesListMviInternalAction.IacEnableChangedFromBottomSheet) {
            boolean zE2 = e(z15, z16);
            PhonesListMviInternalAction.IacEnableChangedFromBottomSheet iacEnableChangedFromBottomSheet = (PhonesListMviInternalAction.IacEnableChangedFromBottomSheet) phonesListMviInternalAction2;
            boolean z19 = iacEnableChangedFromBottomSheet.f227994b;
            boolean z22 = iacEnableChangedFromBottomSheet.f227994b;
            return PhonesListMviState.a(phonesListMviState2, z19, null, null, null, null, null, null, zE2, z22, !z19, new IacEnableSwitchState(z22, false), Boolean.valueOf(z22), 33787);
        }
        if (phonesListMviInternalAction2 instanceof PhonesListMviInternalAction.ScheduleOptionClick) {
            ArrayList arrayList = new ArrayList(phonesListMviState2.f228026j);
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ScheduleOption scheduleOption = (ScheduleOption) it.next();
                arrayList2.add(new ScheduleOption(scheduleOption.f168409b, scheduleOption.f168410c, scheduleOption.f168411d, kotlin.jvm.internal.L.f(scheduleOption.f168409b, ((PhonesListMviInternalAction.ScheduleOptionClick) phonesListMviInternalAction2).f228010b.f168409b)));
            }
            return PhonesListMviState.a(phonesListMviState2, false, null, null, null, null, null, arrayList2, false, false, false, null, null, 65279);
        }
        if (!(phonesListMviInternalAction2 instanceof PhonesListMviInternalAction.HideDeletedDevice)) {
            return phonesListMviState2;
        }
        List<DeviceListItem> list = phonesListMviState2.f228022f;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list) {
            if (!kotlin.jvm.internal.L.f(((DeviceListItem) obj).f227645b, ((PhonesListMviInternalAction.HideDeletedDevice) phonesListMviInternalAction2).f227991b.f227645b)) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            DeviceListItem deviceListItem = (DeviceListItem) it2.next();
            arrayList4.add(new DeviceListItem(deviceListItem.f227645b, deviceListItem.f227646c, deviceListItem.f227647d, deviceListItem.f227649f, this.f227941g.b(arrayList3.size(), deviceListItem.f227645b)));
        }
        return PhonesListMviState.a(phonesListMviState2, false, null, arrayList4, null, null, null, null, false, false, false, null, null, 65519);
    }

    public final PhonesListMviState b(PhonesListMviState phonesListMviState, C33432d c33432d, NumbersListState numbersListState) {
        Boolean bool = phonesListMviState.f228032p;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : c33432d.f227960e;
        if (phonesListMviState.f228033q) {
            this.f227938d.c(new C44273h(this.f227939e.b("android.permission.RECORD_AUDIO").b(), c33432d.f227960e, Boolean.valueOf((c33432d.f227958c == null || c33432d.f227959d == null) ? false : true)));
        }
        boolean zE2 = e(c33432d.f227960e, phonesListMviState.f228028l);
        ArrayList arrayListA = this.f227941g.a(c33432d.f227957b);
        boolean z12 = !c33432d.f227956a;
        org.threeten.bp.g gVar = c33432d.f227958c;
        if (gVar == null) {
            gVar = O.f227944c;
        }
        org.threeten.bp.g gVar2 = c33432d.f227959d;
        if (gVar2 == null) {
            gVar2 = O.f227944c;
        }
        String strD = d(gVar, gVar2);
        boolean z13 = c33432d.f227960e;
        return new PhonesListMviState(false, z12, c33432d.f227960e, numbersListState, arrayListA, c33432d.f227958c, c33432d.f227959d, strD, c33432d.f227961f, c33432d.f227962g, zE2, z13, (z13 || zBooleanValue) ? false : true, new IacEnableSwitchState(c33432d.f227960e, false), Boolean.valueOf(zBooleanValue), false);
    }

    public final String d(org.threeten.bp.g gVar, org.threeten.bp.g gVar2) {
        org.threeten.bp.g gVar3 = O.f227944c;
        if (gVar.equals(gVar3) && gVar2.equals(gVar3)) {
            return this.f227936b.getF227348b();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(gVar);
        sb2.append('-');
        sb2.append(gVar2);
        return sb2.toString();
    }

    public final boolean e(boolean z12, boolean z13) {
        List<IacProblem> listB = this.f227937c.b();
        boolean z14 = (listB.size() > 1 || !(listB.isEmpty() || C42745f0.E(listB) == IacProblem.f169089b)) && z12;
        if (z14 && !z13) {
            this.f227938d.c(new nJ.z("settings"));
        }
        return z14;
    }
}
