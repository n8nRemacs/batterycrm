package com.avito.android.edit_address.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.edit_address.dialog.time_interval.TimeIntervalPicker;
import com.avito.android.edit_address.entity.AddressDaysArray;
import com.avito.android.edit_address.entity.AddressWorkSchedule;
import com.avito.android.edit_address.entity.ExtendedProfilesSettingsAddress;
import com.avito.android.edit_address.entity.TimeInterval;
import com.avito.android.util.O2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import jy.C42446d;
import jy.InterfaceC42443a;
import jy.InterfaceC42444b;
import jy.InterfaceC42447e;
import jy.InterfaceC42448f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: EditAddressActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/edit_address/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Ljy/a;", "Ljy/b;", "Ljy/d;", "a", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC42443a, InterfaceC42444b, C42446d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.edit_address.e f145939a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final EnumC4241a f145940b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EditAddressActor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_address/mvi/a$a;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.edit_address.mvi.a$a, reason: collision with other inner class name */
    public static final class EnumC4241a {

        /* renamed from: b, reason: collision with root package name */
        public static final EnumC4241a f145941b;

        /* renamed from: c, reason: collision with root package name */
        public static final EnumC4241a f145942c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ EnumC4241a[] f145943d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f145944e;

        static {
            EnumC4241a enumC4241a = new EnumC4241a("ADD", 0);
            f145941b = enumC4241a;
            EnumC4241a enumC4241a2 = new EnumC4241a("UPDATE", 1);
            f145942c = enumC4241a2;
            EnumC4241a[] enumC4241aArr = {enumC4241a, enumC4241a2};
            f145943d = enumC4241aArr;
            f145944e = kotlin.enums.c.a(enumC4241aArr);
        }

        public EnumC4241a() {
            throw null;
        }

        public static EnumC4241a valueOf(String str) {
            return (EnumC4241a) Enum.valueOf(EnumC4241a.class, str);
        }

        public static EnumC4241a[] values() {
            return (EnumC4241a[]) f145943d.clone();
        }
    }

    /* compiled from: EditAddressActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[EnumC4241a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EnumC4241a enumC4241a = EnumC4241a.f145941b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public a(@Y61.k com.avito.android.edit_address.e eVar, @Y61.l ExtendedProfilesSettingsAddress extendedProfilesSettingsAddress) {
        this.f145939a = eVar;
        this.f145940b = extendedProfilesSettingsAddress == null ? EnumC4241a.f145941b : EnumC4241a.f145942c;
    }

    public static AddressWorkSchedule c(C42446d.a aVar, String str) {
        Object next;
        Iterator<T> it = aVar.f405942f.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((AddressWorkSchedule) next).f145895b, str)) {
                break;
            }
        }
        return (AddressWorkSchedule) next;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC42444b> b(InterfaceC42443a interfaceC42443a, C42446d c42446d) {
        InterfaceC43160i<InterfaceC42444b> interfaceC43160iB;
        Object gVar;
        Object lVar;
        AddressDaysArray addressDaysArray;
        Object iVar;
        InterfaceC42443a interfaceC42443a2 = interfaceC42443a;
        boolean z12 = interfaceC42443a2 instanceof InterfaceC42447e;
        C42446d.a aVar = c42446d.f405936b;
        List listC = null;
        listC = null;
        if (z12) {
            InterfaceC42447e interfaceC42447e = (InterfaceC42447e) interfaceC42443a2;
            if (interfaceC42447e instanceof InterfaceC42447e.a) {
                iVar = InterfaceC42444b.a.f405899a;
            } else if (interfaceC42447e instanceof InterfaceC42447e.d) {
                iVar = InterfaceC42444b.f.f405906a;
            } else if (interfaceC42447e instanceof InterfaceC42447e.c) {
                iVar = InterfaceC42444b.e.f405905a;
            } else if (interfaceC42447e instanceof InterfaceC42447e.C11594e) {
                iVar = new InterfaceC42444b.i(((InterfaceC42447e.C11594e) interfaceC42447e).f405951a);
            } else {
                if (interfaceC42447e instanceof InterfaceC42447e.g) {
                    TimeIntervalPicker.Mode mode = TimeIntervalPicker.Mode.f145857b;
                    com.avito.android.edit_address.adapter.schedule.a aVar2 = ((InterfaceC42447e.g) interfaceC42447e).f405953a;
                    AddressWorkSchedule addressWorkScheduleC = c(aVar, aVar2.f145796c);
                    lVar = new InterfaceC42444b.k(mode, addressWorkScheduleC != null ? addressWorkScheduleC.f145898e : null, aVar2.f145796c);
                } else if (interfaceC42447e instanceof InterfaceC42447e.b) {
                    TimeIntervalPicker.Mode mode2 = TimeIntervalPicker.Mode.f145858c;
                    com.avito.android.edit_address.adapter.schedule.a aVar3 = ((InterfaceC42447e.b) interfaceC42447e).f405948a;
                    AddressWorkSchedule addressWorkScheduleC2 = c(aVar, aVar3.f145796c);
                    lVar = new InterfaceC42444b.k(mode2, addressWorkScheduleC2 != null ? addressWorkScheduleC2.f145899f : null, aVar3.f145796c);
                } else {
                    if (!(interfaceC42447e instanceof InterfaceC42447e.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    com.avito.android.edit_address.adapter.schedule.a aVar4 = ((InterfaceC42447e.f) interfaceC42447e).f405952a;
                    AddressWorkSchedule addressWorkScheduleC3 = c(aVar, aVar4.f145796c);
                    if (addressWorkScheduleC3 != null && (addressDaysArray = addressWorkScheduleC3.f145897d) != null) {
                        listC = addressDaysArray.c();
                    }
                    if (listC == null) {
                        listC = C42784z0.f406748b;
                    }
                    lVar = new InterfaceC42444b.l(listC, C42745f0.d0(aVar.b(), C42745f0.P0(listC)), aVar4.f145796c);
                }
                iVar = lVar;
            }
            return new C43210w(iVar);
        }
        if (!(interfaceC42443a2 instanceof InterfaceC42448f)) {
            if (!(interfaceC42443a2 instanceof InterfaceC42443a.b)) {
                if (interfaceC42443a2 instanceof InterfaceC42443a.C11591a) {
                    return new C43210w(new InterfaceC42444b.d(false));
                }
                throw new NoWhenBranchMatchedException();
            }
            if (aVar.f405938b != null && aVar.f405939c != null) {
                List<AddressWorkSchedule> list = aVar.f405942f;
                for (AddressWorkSchedule addressWorkSchedule : list) {
                    AddressDaysArray addressDaysArray2 = addressWorkSchedule.f145897d;
                    ArrayList arrayListC = addressDaysArray2 != null ? addressDaysArray2.c() : null;
                    TimeInterval timeInterval = addressWorkSchedule.f145898e;
                    if ((arrayListC != null && !arrayListC.isEmpty()) || timeInterval == null) {
                        AddressDaysArray addressDaysArray3 = addressWorkSchedule.f145897d;
                        if (!O2.a(addressDaysArray3 != null ? addressDaysArray3.c() : null) || timeInterval != null) {
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    AddressWorkSchedule addressWorkSchedule2 = (AddressWorkSchedule) obj;
                    if (addressWorkSchedule2.f145897d != null && addressWorkSchedule2.f145898e != null) {
                        arrayList.add(obj);
                    }
                }
                C42446d.a aVarA = C42446d.a.a(aVar, null, null, arrayList, false, false, 223);
                if (aVarA.f405939c == null) {
                    interfaceC43160iB = C43175k.w();
                } else {
                    int iOrdinal = this.f145940b.ordinal();
                    if (iOrdinal == 0) {
                        interfaceC43160iB = this.f145939a.b(aVarA.f405937a, aVarA.f405939c, aVarA.f405940d, aVarA.f405941e, aVarA.f405942f);
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        interfaceC43160iB = this.f145939a.a(aVarA.f405937a, aVarA.f405939c, aVarA.f405940d, aVarA.f405941e, aVarA.f405942f);
                    }
                }
            }
            return new C43210w(InterfaceC42444b.o.f405920a);
        }
        InterfaceC42448f interfaceC42448f = (InterfaceC42448f) interfaceC42443a2;
        if (interfaceC42448f instanceof InterfaceC42448f.d) {
            InterfaceC42448f.d dVar = (InterfaceC42448f.d) interfaceC42448f;
            gVar = new InterfaceC42444b.p(dVar.f405959a, dVar.f405960b);
        } else if (interfaceC42448f instanceof InterfaceC42448f.a) {
            InterfaceC42448f.a aVar5 = (InterfaceC42448f.a) interfaceC42448f;
            gVar = new InterfaceC42444b.C11592b(aVar5.f405954a, aVar5.f405955b);
        } else if (interfaceC42448f instanceof InterfaceC42448f.c) {
            InterfaceC42448f.c cVar = (InterfaceC42448f.c) interfaceC42448f;
            gVar = new InterfaceC42444b.h(cVar.f405957a, cVar.f405958b);
        } else {
            if (!(interfaceC42448f instanceof InterfaceC42448f.b)) {
                throw new NoWhenBranchMatchedException();
            }
            gVar = new InterfaceC42444b.g(((InterfaceC42448f.b) interfaceC42448f).f405956a);
        }
        interfaceC43160iB = new C43210w(gVar);
        return interfaceC43160iB;
    }
}
