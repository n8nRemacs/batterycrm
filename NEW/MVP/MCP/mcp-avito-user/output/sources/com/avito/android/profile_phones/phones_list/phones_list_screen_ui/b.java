package com.avito.android.profile_phones.phones_list.phones_list_screen_ui;

import androidx.appcompat.app.r;
import androidx.compose.foundation.a2;
import androidx.compose.foundation.d2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.iac_incoming_call_ability.public_module.iac_enable.ScheduleOption;
import com.avito.android.profile_phones.phones_list.device_list_item.DeviceListItem;
import com.avito.android.profile_phones.phones_list.mvi.O;
import com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviState;
import com.avito.android.profile_phones.phones_list.phone_item.PhoneListItem;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PhonesListScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class b extends N implements Y41.q<T1, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PhonesListMviState f228163l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d2 f228164m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f228165n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f228166o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f228167p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f228168q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.l<PhoneListItem, G0> f228169r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f228170s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f228171t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f228172u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f228173v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeviceListItem, G0> f228174w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(PhonesListMviState phonesListMviState, d2 d2Var, Y41.a<G0> aVar, Y41.a<G0> aVar2, Y41.a<G0> aVar3, Y41.a<G0> aVar4, Y41.l<? super PhoneListItem, G0> lVar, Y41.a<G0> aVar5, Y41.a<G0> aVar6, Y41.a<G0> aVar7, Y41.a<G0> aVar8, Y41.l<? super DeviceListItem, G0> lVar2) {
        super(3);
        this.f228163l = phonesListMviState;
        this.f228164m = d2Var;
        this.f228165n = aVar;
        this.f228166o = aVar2;
        this.f228167p = aVar3;
        this.f228168q = aVar4;
        this.f228169r = lVar;
        this.f228170s = aVar5;
        this.f228171t = aVar6;
        this.f228172u = aVar7;
        this.f228173v = aVar8;
        this.f228174w = lVar2;
    }

    @Override // Y41.q
    public final G0 invoke(T1 t12, A a12, Integer num) {
        boolean z12;
        int i12;
        float f12;
        Object next;
        String str;
        A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            a13.C(-58730267);
            PhonesListMviState phonesListMviState = this.f228163l;
            if (phonesListMviState.f228018b) {
                v.a aVar = v.f42878y1;
                FillElement fillElement = C20588k2.f28682c;
                aVar.d0(fillElement);
                InterfaceC22215f.f39074a.getClass();
                InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                v vVarC = androidx.compose.ui.n.c(a13, fillElement);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar2);
                } else {
                    a13.d();
                }
                R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0D);
                R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                    r.B(f37888q, a13, f37888q, pVar);
                }
                R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                v vVarD = C20644z.f28804a.d(aVar, InterfaceC22215f.a.f39080f);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.component.spinner.b.a(com.akita.compose.theme.re23.b.r(a13).getF66693b(), vVarD, a13, 0, 0);
                a13.z();
                a13.h();
            } else {
                a13.h();
                v.a aVar3 = v.f42878y1;
                v vVarB = a2.b(C20588k2.d(aVar3, 1.0f), this.f228164m, true, true);
                C20585k.f28659a.getClass();
                C20585k.l lVar = C20585k.f28662d;
                InterfaceC22215f.f39074a.getClass();
                I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, a13, 0);
                int f37888q2 = a13.getF37888Q();
                O1 o1Y2 = a13.y();
                v vVarC2 = androidx.compose.ui.n.c(a13, vVarB);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar4);
                } else {
                    a13.d();
                }
                R3.b(InterfaceC22413h.a.f40796g, a13, iA2);
                R3.b(InterfaceC22413h.a.f40795f, a13, o1Y2);
                Y41.p<InterfaceC22413h, Integer, G0> pVar2 = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q2))) {
                    r.B(f37888q2, a13, f37888q2, pVar2);
                }
                R3.b(InterfaceC22413h.a.f40793d, a13, vVarC2);
                K k12 = K.f28344a;
                a13.C(-12661606);
                if (phonesListMviState.f228028l) {
                    float f13 = 10;
                    h.a aVar5 = androidx.compose.ui.unit.h.f42849c;
                    com.akita.compose.foundation.ui.g.a(f13, null, a13, 6);
                    com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.iac_problems_banner.a.a(6, 0, this.f228165n, a13, R1.k(f13, 0.0f, 2, aVar3));
                }
                a13.h();
                a13.C(-12651599);
                boolean z13 = phonesListMviState.f228027k;
                if (z13) {
                    h.a aVar6 = androidx.compose.ui.unit.h.f42849c;
                    com.akita.compose.foundation.ui.g.a(22, null, a13, 6);
                    v vVarK = R1.k(16, 0.0f, 2, aVar3);
                    org.threeten.bp.g gVar = O.f227944c;
                    org.threeten.bp.g gVar2 = phonesListMviState.f228023g;
                    boolean zF2 = L.f(gVar2, gVar);
                    org.threeten.bp.g gVar3 = phonesListMviState.f228024h;
                    z12 = z13;
                    i12 = 2;
                    com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.time_settings_block.b.a(phonesListMviState.f228025i, (zF2 && L.f(gVar3, gVar)) || (gVar2 == null && gVar3 == null), vVarK, this.f228166o, a13, 384, 0);
                } else {
                    z12 = z13;
                    i12 = 2;
                }
                a13.h();
                a13.C(-12637916);
                if (z12) {
                    List<ScheduleOption> list = phonesListMviState.f228026j;
                    if (!list.isEmpty()) {
                        h.a aVar7 = androidx.compose.ui.unit.h.f42849c;
                        com.akita.compose.foundation.ui.g.a(28, null, a13, 6);
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (((ScheduleOption) next).f168412e) {
                                break;
                            }
                        }
                        ScheduleOption scheduleOption = (ScheduleOption) next;
                        if (scheduleOption == null || (str = scheduleOption.f168410c) == null) {
                            str = "";
                        }
                        com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.schedule_settings_block.b.a(48, 0, this.f228167p, a13, R1.k(16, 0.0f, i12, v.f42878y1), str);
                    }
                }
                a13.h();
                float f14 = 32;
                h.a aVar8 = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.foundation.ui.g.a(f14, null, a13, 6);
                v.a aVar9 = v.f42878y1;
                float f15 = 16;
                com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.phone_numbers_block.b.a(phonesListMviState.f228021e, R1.k(f15, 0.0f, i12, aVar9), this.f228168q, this.f228169r, this.f228170s, this.f228171t, a13, 48, 0);
                a13.C(-12608573);
                if (phonesListMviState.f228029m) {
                    com.akita.compose.foundation.ui.g.a(f14, null, a13, 6);
                    f12 = f15;
                    com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.iac_enable_banner.g.a(6, 0, this.f228172u, a13, R1.k(f12, 0.0f, 2, aVar9));
                } else {
                    f12 = f15;
                }
                a13.h();
                a13.C(-12598314);
                if (phonesListMviState.f228030n && phonesListMviState.f228031o != null) {
                    com.akita.compose.foundation.ui.g.a(f14, null, a13, 6);
                    com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.iac_enable_banner.c.a(phonesListMviState.f228031o, R1.k(10, 0.0f, 2, aVar9), this.f228173v, a13, 48, 0);
                }
                a13.h();
                a13.C(-12584553);
                if (phonesListMviState.f228020d) {
                    com.akita.compose.foundation.ui.g.a(f14, null, a13, 6);
                    com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.iac_devices_block.b.a(new com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.iac_devices_block.e(phonesListMviState.f228022f), R1.k(f12, 0.0f, 2, aVar9), this.f228174w, a13, 48, 0);
                }
                a13.h();
                com.akita.compose.foundation.ui.g.a(f14, null, a13, 6);
                a13.z();
            }
        }
        return G0.f406611a;
    }
}
