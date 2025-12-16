package com.avito.android.iac_dialer_ui.pub.finished_call_screens.feedback_screen.rating;

import Y41.l;
import Y41.p;
import Y61.k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: IacUIRatingPanel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f167651a = new b();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C22096n f167652b = new C22096n(-1828119153, a.f167653l, false);

    /* compiled from: IacUIRatingPanel.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f167653l = new a();

        public a() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                a13.C(-1400055785);
                Object objT = a13.t();
                A.f37866a.getClass();
                A.a.C1651a c1651a = A.a.f37868b;
                if (objT == c1651a) {
                    objT = C22126m3.g(g.f167674a);
                    a13.H(objT);
                }
                InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
                a13.h();
                i iVar = (i) interfaceC22204y1.getF42167b();
                a13.C(-1400051280);
                Object objT2 = a13.t();
                if (objT2 == c1651a) {
                    objT2 = new com.avito.android.iac_dialer_ui.pub.finished_call_screens.feedback_screen.rating.a(interfaceC22204y1);
                    a13.H(objT2);
                }
                a13.h();
                g.b(iVar, (l) objT2, C20588k2.d(v.f42878y1, 1.0f), null, a13, 432, 8);
            }
            return G0.f406611a;
        }
    }
}
