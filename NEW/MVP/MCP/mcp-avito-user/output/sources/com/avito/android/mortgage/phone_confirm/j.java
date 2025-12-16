package com.avito.android.mortgage.phone_confirm;

import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.view.O0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PhoneConfirmDialog.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class j extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PhoneConfirmDialog f201569l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f201570m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ TZ.b f201571n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(PhoneConfirmDialog phoneConfirmDialog, InterfaceC22204y1 interfaceC22204y1, TZ.b bVar) {
        super(2);
        this.f201569l = phoneConfirmDialog;
        this.f201570m = interfaceC22204y1;
        this.f201571n = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            J00.c cVar = (J00.c) this.f201570m.getF42167b();
            PhoneConfirmDialog phoneConfirmDialog = this.f201569l;
            O0 o02 = phoneConfirmDialog.f201526i0;
            InterfaceC43160i<J00.b> events = ((v) o02.getValue()).getEvents();
            a13.C(-131589220);
            Object objT = a13.t();
            A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            TZ.b bVar = this.f201571n;
            if (objT == c1651a) {
                objT = new f(phoneConfirmDialog, bVar);
                a13.H(objT);
            }
            Y41.a aVar = (Y41.a) objT;
            a13.h();
            a13.C(-131571752);
            Object objT2 = a13.t();
            if (objT2 == c1651a) {
                objT2 = new g(bVar);
                a13.H(objT2);
            }
            Y41.l lVar = (Y41.l) objT2;
            a13.h();
            v vVar = (v) o02.getValue();
            a13.C(-131554680);
            boolean zB2 = a13.B(vVar);
            Object objT3 = a13.t();
            if (zB2 || objT3 == c1651a) {
                objT3 = new h(phoneConfirmDialog);
                a13.H(objT3);
            }
            Y41.l lVar2 = (Y41.l) objT3;
            a13.h();
            v vVar2 = (v) o02.getValue();
            a13.C(-131548127);
            boolean zB3 = a13.B(vVar2);
            Object objT4 = a13.t();
            if (zB3 || objT4 == c1651a) {
                objT4 = new i(phoneConfirmDialog);
                a13.H(objT4);
            }
            a13.h();
            t.a(cVar, events, aVar, lVar, lVar2, (Y41.a) objT4, a13, 3520);
        }
        return G0.f406611a;
    }
}
