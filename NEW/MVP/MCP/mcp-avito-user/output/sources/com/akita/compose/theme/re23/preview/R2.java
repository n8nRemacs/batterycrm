package com.akita.compose.theme.re23.preview;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.unit.h;
import com.akita.compose.component.segmented_control.SegmentedControlState;
import com.akita.compose.theme.re23.preview.AbstractC27462u0;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.text.C43066x;

/* compiled from: SegmentedControlPreview.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002¨\u0006\u0004²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"", "secondEnabled", "", "selectedIndex", "re23_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class R2 {

    /* compiled from: SegmentedControlPreview.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<SegmentedControlState> f65485a = kotlin.enums.c.a(SegmentedControlState.values());
    }

    /* compiled from: SegmentedControlPreview.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Boolean, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f65486l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(1);
            this.f65486l = interfaceC22204y1;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            this.f65486l.setValue(bool2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: SegmentedControlPreview.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.segmented_control.z> f65487l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AbstractC27462u0.b<SegmentedControlState> f65488m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22196w1 f65489n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ List<kotlin.Q<String, Boolean>> f65490o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kotlin.Q<String, com.akita.compose.component.segmented_control.z> q12, AbstractC27462u0.b<SegmentedControlState> bVar, InterfaceC22196w1 interfaceC22196w1, List<kotlin.Q<String, Boolean>> list) {
            super(3);
            this.f65487l = q12;
            this.f65488m = bVar;
            this.f65489n = interfaceC22196w1;
            this.f65490o = list;
        }

        @Override // Y41.q
        public final kotlin.G0 invoke(androidx.compose.foundation.layout.J j12, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.component.toast_bar.u uVarA = com.akita.compose.component.toast_bar.w.a(a13);
                Object objT = a13.t();
                androidx.compose.runtime.A.f37866a.getClass();
                if (objT == A.a.f37868b) {
                    objT = C22187u0.h(EmptyCoroutineContext.INSTANCE, a13);
                    a13.H(objT);
                }
                com.akita.compose.theme.re23.b.f63983a.getClass();
                X2 x22 = new X2((kotlinx.coroutines.T) objT, uVarA, com.akita.compose.theme.re23.b.u(a13).getF66804a());
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.component.scaffold.g.a(C20588k2.f(C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f), 120), null, null, uVarA, null, null, null, androidx.compose.runtime.internal.r.c(1843270087, new V2(this.f65487l, this.f65488m, this.f65489n, this.f65490o, x22), a13), a13, 12582918, 118);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: SegmentedControlPreview.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.segmented_control.z> f65491l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f65492m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i12, kotlin.Q q12) {
            super(2);
            this.f65491l = q12;
            this.f65492m = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f65492m | 1);
            R2.a(this.f65491l, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k kotlin.Q<String, com.akita.compose.component.segmented_control.z> q12, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        com.akita.compose.foundation.p pVar;
        androidx.compose.runtime.B bE2 = a12.E(521610064);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(q12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            bE2.C(319636718);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = C22126m3.g(Boolean.TRUE);
                bE2.H(objT);
            }
            InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
            bE2.X(false);
            Boolean bool = Boolean.TRUE;
            kotlin.Q q13 = new kotlin.Q("First", bool);
            Boolean bool2 = (Boolean) interfaceC22204y1.getF42167b();
            bool2.getClass();
            List listU = C42745f0.U(q13, new kotlin.Q("Second", bool2), new kotlin.Q("Third", bool));
            bE2.C(319642446);
            Object objT2 = bE2.t();
            if (objT2 == c1651a) {
                objT2 = androidx.compose.runtime.U2.a(0);
                bE2.H(objT2);
            }
            InterfaceC22196w1 interfaceC22196w1 = (InterfaceC22196w1) objT2;
            bE2.X(false);
            AbstractC27462u0.b bVarC = C27452s0.c(VoiceInfo.STATE, a.f65485a, null, bE2, 4);
            String str = q12.f406619b;
            if (C43066x.h0(str, "overlay", false)) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                pVar = com.akita.compose.theme.re23.b.f63984b.f63973w1;
            } else {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                pVar = com.akita.compose.theme.re23.b.f63984b.f63851H1;
            }
            bE2.C(319662151);
            Object objT3 = bE2.t();
            if (objT3 == c1651a) {
                objT3 = new b(interfaceC22204y1);
                bE2.H(objT3);
            }
            C27452s0.a(str, null, pVar, 0.0f, C42756l.l0(new AbstractC27462u0[]{com.akita.compose.component.accordion.s.h(bE2, false, "is second enabled", true, (Y41.l) objT3), bVarC}), androidx.compose.runtime.internal.r.c(476218682, new c(q12, bVarC, interfaceC22196w1, listU), bE2), bE2, 196608, 10);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new d(i12, q12);
        }
    }
}
