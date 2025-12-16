package com.avito.android.phone_confirmation;

import com.avito.android.analytics.C28529w;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.sx_address.new_address.domain.WorkingHours;
import com.avito.android.sx_address.new_address.view.s;
import com.avito.android.util.V2;
import com.avito.android.vas_planning.VasPlanningFragment;
import com.avito.android.vas_planning.model.VasPlanningItem;
import kotlin.G0;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.phone_confirmation.i, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class C33153i implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f215931b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f215932c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f215933d;

    public /* synthetic */ C33153i(int i12, Object obj, Object obj2) {
        this.f215931b = i12;
        this.f215932c = obj;
        this.f215933d = obj2;
    }

    /* JADX WARN: Type inference failed for: r7v12, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.android.sx_address.new_address.view.s bVar;
        switch (this.f215931b) {
            case 0:
                ((com.avito.android.util.C) this.f215932c).getF125491k().getClass();
                V2.f318762a.a("PhoneConfirmationBinder", "An undefined state in PhoneConfirmationBinder", (Throwable) obj);
                ((com.avito.android.phone_confirmation.view.h) this.f215933d).f215991o.accept(G0.f406611a);
                return;
            case 1:
                com.avito.android.sx_address.new_address.view.s sVar = (com.avito.android.sx_address.new_address.view.s) this.f215932c;
                WorkingHours.Day.Time f293997b = sVar.getF293997b();
                org.threeten.bp.g gVar = ((org.threeten.bp.f) obj).f421949c;
                long j12 = gVar.f422072b;
                long j13 = gVar.f422073c;
                f293997b.getClass();
                WorkingHours.Day.Time time = new WorkingHours.Day.Time(j12, j13);
                if (sVar instanceof s.a) {
                    bVar = new s.a(((s.a) sVar).f293998c, time);
                } else {
                    if (!(sVar instanceof s.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = new s.b(((s.b) sVar).f294000c, time);
                }
                ((com.avito.android.sx_address.new_address.view.t) this.f215933d).f294003b.invoke(bVar);
                return;
            default:
                org.threeten.bp.g gVar2 = (org.threeten.bp.g) obj;
                VasPlanningFragment vasPlanningFragment = (VasPlanningFragment) this.f215932c;
                if (!vasPlanningFragment.f322181o0) {
                    vasPlanningFragment.f322181o0 = true;
                    InterfaceC28373a interfaceC28373a = vasPlanningFragment.f322189w0;
                    if (interfaceC28373a == null) {
                        interfaceC28373a = null;
                    }
                    interfaceC28373a.c(new C28529w(vasPlanningFragment.r5().f322195b, vasPlanningFragment.r5().f322197d));
                }
                com.avito.android.vas_planning.q qVar = vasPlanningFragment.f322183q0;
                (qVar != null ? qVar : null).getF322530S().accept(new kotlin.Q((VasPlanningItem.VasPlanningDateTime) this.f215933d, gVar2));
                return;
        }
    }
}
