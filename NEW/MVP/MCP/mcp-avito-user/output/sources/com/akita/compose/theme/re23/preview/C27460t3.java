package com.akita.compose.theme.re23.preview;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import com.akita.compose.component.toggle.ToggleState;
import com.akita.compose.theme.re23.preview.AbstractC27462u0;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: SwitcherPreview.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "isChecked", "re23_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.akita.compose.theme.re23.preview.t3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27460t3 {

    /* compiled from: SwitcherPreview.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.akita.compose.theme.re23.preview.t3$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<ToggleState> f65845a = kotlin.enums.c.a(ToggleState.values());
    }

    /* compiled from: SwitcherPreview.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.akita.compose.theme.re23.preview.t3$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.toggle.u> f65846l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AbstractC27462u0.b<ToggleState> f65847m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f65848n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlin.Q<String, com.akita.compose.component.toggle.u> q12, AbstractC27462u0.b<ToggleState> bVar, InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(3);
            this.f65846l = q12;
            this.f65847m = bVar;
            this.f65848n = interfaceC22204y1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.q
        public final kotlin.G0 invoke(androidx.compose.foundation.layout.J j12, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                InterfaceC22204y1<Boolean> interfaceC22204y1 = this.f65848n;
                boolean zBooleanValue = interfaceC22204y1.getF42167b().booleanValue();
                a13.C(-719049264);
                Object objT = a13.t();
                androidx.compose.runtime.A.f37866a.getClass();
                if (objT == A.a.f37868b) {
                    objT = new C27465u3(interfaceC22204y1);
                    a13.H(objT);
                }
                a13.h();
                com.akita.compose.component.toggle.r.a(zBooleanValue, (Y41.a) objT, this.f65846l.f406620c, null, (ToggleState) C22126m3.b(this.f65847m.f65855c, a13).getF42167b(), null, a13, 48, 104);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: SwitcherPreview.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.akita.compose.theme.re23.preview.t3$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.toggle.u> f65849l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f65850m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i12, kotlin.Q q12) {
            super(2);
            this.f65849l = q12;
            this.f65850m = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f65850m | 1);
            C27460t3.a(this.f65849l, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k kotlin.Q<String, com.akita.compose.component.toggle.u> q12, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        com.akita.compose.foundation.p pVar;
        androidx.compose.runtime.B bE2 = a12.E(43710780);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(q12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            bE2.C(2026286745);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = C22126m3.g(Boolean.FALSE);
                bE2.H(objT);
            }
            InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
            bE2.X(false);
            AbstractC27462u0.b bVarC = C27452s0.c(VoiceInfo.STATE, a.f65845a, null, bE2, 4);
            String str = q12.f406619b;
            if (C43066x.h0(str, "white", false)) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                pVar = com.akita.compose.theme.re23.b.f63984b.f63973w1;
            } else {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                pVar = com.akita.compose.theme.re23.b.f63984b.f63851H1;
            }
            C27452s0.a(str, null, pVar, 0.0f, Collections.singleton(bVarC), androidx.compose.runtime.internal.r.c(-1037340890, new b(q12, bVarC, interfaceC22204y1), bE2), bE2, 229376, 10);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(i12, q12);
        }
    }
}
