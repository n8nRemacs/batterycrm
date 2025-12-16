package com.akita.compose.theme.re23.preview;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.state.ToggleableState;
import com.akita.compose.component.toggle.ToggleState;
import com.akita.compose.theme.re23.preview.AbstractC27462u0;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: TogglePreview.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/state/ToggleableState;", "value", "", "isChecked", "re23_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Q3 {

    /* compiled from: TogglePreview.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<ToggleState> f65473a = kotlin.enums.c.a(ToggleState.values());

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<ToggleableState> f65474b = kotlin.enums.c.a(ToggleableState.values());
    }

    /* compiled from: TogglePreview.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f65475l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AbstractC27462u0.b<ToggleableState> f65476m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.toggle.u> f65477n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ AbstractC27462u0.b<ToggleState> f65478o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z12, AbstractC27462u0.b<ToggleableState> bVar, kotlin.Q<String, com.akita.compose.component.toggle.u> q12, AbstractC27462u0.b<ToggleState> bVar2) {
            super(3);
            this.f65475l = z12;
            this.f65476m = bVar;
            this.f65477n = q12;
            this.f65478o = bVar2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.q
        public final kotlin.G0 invoke(androidx.compose.foundation.layout.J j12, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                boolean z12 = this.f65475l;
                AbstractC27462u0.b<ToggleState> bVar = this.f65478o;
                kotlin.Q<String, com.akita.compose.component.toggle.u> q12 = this.f65477n;
                if (z12) {
                    a13.C(-91414611);
                    AbstractC27462u0.b<ToggleableState> bVar2 = this.f65476m;
                    InterfaceC22204y1 interfaceC22204y1B = C22126m3.b(bVar2.f65855c, a13);
                    com.akita.compose.component.toggle.j.a((ToggleableState) interfaceC22204y1B.getF42167b(), new R3(bVar2, interfaceC22204y1B), q12.f406620c, null, (ToggleState) C22126m3.b(bVar.f65855c, a13).getF42167b(), null, a13, 0, 104);
                    a13.h();
                } else {
                    a13.C(-90920006);
                    a13.C(-557121531);
                    Object objT = a13.t();
                    androidx.compose.runtime.A.f37866a.getClass();
                    A.a.C1651a c1651a = A.a.f37868b;
                    if (objT == c1651a) {
                        objT = C22126m3.g(Boolean.FALSE);
                        a13.H(objT);
                    }
                    InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
                    a13.h();
                    boolean zBooleanValue = ((Boolean) interfaceC22204y1.getF42167b()).booleanValue();
                    a13.C(-557117603);
                    Object objT2 = a13.t();
                    if (objT2 == c1651a) {
                        objT2 = new S3(interfaceC22204y1);
                        a13.H(objT2);
                    }
                    a13.h();
                    com.akita.compose.component.toggle.p.a(zBooleanValue, (Y41.a) objT2, q12.f406620c, null, (ToggleState) C22126m3.b(bVar.f65855c, a13).getF42167b(), null, a13, 48, 104);
                    a13.h();
                }
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TogglePreview.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.toggle.u> f65479l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f65480m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i12, kotlin.Q q12) {
            super(2);
            this.f65479l = q12;
            this.f65480m = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f65480m | 1);
            Q3.a(this.f65479l, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k kotlin.Q<String, com.akita.compose.component.toggle.u> q12, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        com.akita.compose.foundation.p pVar;
        androidx.compose.runtime.B bE2 = a12.E(240880994);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(q12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            String str = q12.f406619b;
            String str2 = str;
            boolean zH02 = C43066x.h0(str2, "check", false);
            AbstractC27462u0.b bVarC = C27452s0.c(VoiceInfo.STATE, a.f65473a, null, bE2, 4);
            bE2.C(-1429045568);
            AbstractC27462u0.b bVarC2 = zH02 ? C27452s0.c("toggleableState", a.f65474b, ToggleableState.f41897c, bE2, 0) : null;
            bE2.X(false);
            LinkedHashSet linkedHashSetL = kotlin.collections.b1.l(bVarC, bVarC2);
            if (C43066x.q(str, "White", false)) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                pVar = com.akita.compose.theme.re23.b.f63984b.f63973w1;
            } else {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                pVar = com.akita.compose.theme.re23.b.f63984b.f63851H1;
            }
            C27452s0.a(str2, null, pVar, 0.0f, linkedHashSetL, androidx.compose.runtime.internal.r.c(328697932, new b(zH02, bVarC2, q12, bVarC), bE2), bE2, 229376, 10);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(i12, q12);
        }
    }
}
