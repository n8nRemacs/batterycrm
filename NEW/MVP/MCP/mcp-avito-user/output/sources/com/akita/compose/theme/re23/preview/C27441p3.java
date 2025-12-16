package com.akita.compose.theme.re23.preview;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.InterfaceC22204y1;
import com.akita.compose.component.stepper.StepperState;
import com.akita.compose.theme.re23.preview.AbstractC27462u0;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: StepperPreview.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0004²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"", "value", "", "isLoading", "re23_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.akita.compose.theme.re23.preview.p3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27441p3 {

    /* compiled from: StepperPreview.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.akita.compose.theme.re23.preview.p3$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<StepperState> f65791a = kotlin.enums.c.a(StepperState.values());
    }

    /* compiled from: StepperPreview.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.akita.compose.theme.re23.preview.p3$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Boolean, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f65792l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(1);
            this.f65792l = interfaceC22204y1;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            this.f65792l.setValue(bool2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: StepperPreview.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.akita.compose.theme.re23.preview.p3$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.stepper.w> f65793l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AbstractC27462u0.b<StepperState> f65794m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22196w1 f65795n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f65796o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kotlin.Q<String, com.akita.compose.component.stepper.w> q12, AbstractC27462u0.b<StepperState> bVar, InterfaceC22196w1 interfaceC22196w1, InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(3);
            this.f65793l = q12;
            this.f65794m = bVar;
            this.f65795n = interfaceC22196w1;
            this.f65796o = interfaceC22204y1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.q
        public final kotlin.G0 invoke(androidx.compose.foundation.layout.J j12, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                InterfaceC22196w1 interfaceC22196w1 = this.f65795n;
                int iE2 = interfaceC22196w1.e();
                com.akita.compose.component.stepper.w wVar = this.f65793l.f406620c;
                boolean zBooleanValue = this.f65796o.getF42167b().booleanValue();
                StepperState stepperState = (StepperState) C22126m3.b(this.f65794m.f65855c, a13).getF42167b();
                a13.C(959753620);
                Object objT = a13.t();
                androidx.compose.runtime.A.f37866a.getClass();
                if (objT == A.a.f37868b) {
                    objT = new C27446q3(interfaceC22196w1);
                    a13.H(objT);
                }
                a13.h();
                com.akita.compose.component.stepper.l.a(iE2, (Y41.l) objT, wVar, null, stepperState, zBooleanValue, 0, 0, 0, a13, 48, 456);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: StepperPreview.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.akita.compose.theme.re23.preview.p3$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.stepper.w> f65797l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f65798m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i12, kotlin.Q q12) {
            super(2);
            this.f65797l = q12;
            this.f65798m = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f65798m | 1);
            C27441p3.a(this.f65797l, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k kotlin.Q<String, com.akita.compose.component.stepper.w> q12, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(-404992256);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(q12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            bE2.C(551695272);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = androidx.compose.runtime.U2.a(3);
                bE2.H(objT);
            }
            InterfaceC22196w1 interfaceC22196w1 = (InterfaceC22196w1) objT;
            Object objI = com.akita.compose.component.accordion.s.i(551697033, bE2, false);
            if (objI == c1651a) {
                objI = C22126m3.g(Boolean.FALSE);
                bE2.H(objI);
            }
            InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objI;
            bE2.X(false);
            AbstractC27462u0.b bVarC = C27452s0.c(VoiceInfo.STATE, a.f65791a, null, bE2, 4);
            String str = q12.f406619b;
            boolean zBooleanValue = ((Boolean) interfaceC22204y1.getF42167b()).booleanValue();
            bE2.C(551709945);
            Object objT2 = bE2.t();
            if (objT2 == c1651a) {
                objT2 = new b(interfaceC22204y1);
                bE2.H(objT2);
            }
            C27452s0.a(str, null, null, 0.0f, C42756l.l0(new AbstractC27462u0[]{com.akita.compose.component.accordion.s.h(bE2, false, "isLoading", zBooleanValue, (Y41.l) objT2), bVarC}), androidx.compose.runtime.internal.r.c(-1912260758, new c(q12, bVarC, interfaceC22196w1, interfaceC22204y1), bE2), bE2, 196608, 14);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new d(i12, q12);
        }
    }
}
