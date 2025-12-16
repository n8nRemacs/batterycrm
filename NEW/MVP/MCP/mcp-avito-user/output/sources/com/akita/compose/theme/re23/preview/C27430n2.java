package com.akita.compose.theme.re23.preview;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import com.akita.compose.component.modal.ModalButtonsOrientation;
import com.akita.compose.theme.re23.preview.AbstractC27462u0;
import java.util.Collections;
import kotlin.Metadata;

/* compiled from: ModalPreview.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "isDialogShown", "re23_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.akita.compose.theme.re23.preview.n2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27430n2 {

    /* compiled from: ModalPreview.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.akita.compose.theme.re23.preview.n2$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f65769l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(0);
            this.f65769l = interfaceC22204y1;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            this.f65769l.setValue(Boolean.TRUE);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ModalPreview.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.akita.compose.theme.re23.preview.n2$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.modal.C> f65770l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f65771m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlin.Q<String, com.akita.compose.component.modal.C> q12, InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(3);
            this.f65770l = q12;
            this.f65771m = interfaceC22204y1;
        }

        @Override // Y41.q
        public final kotlin.G0 invoke(androidx.compose.foundation.layout.J j12, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                InterfaceC22204y1<Boolean> interfaceC22204y1 = this.f65771m;
                if (interfaceC22204y1.getF42167b().booleanValue()) {
                    a13.C(-401011037);
                    Object objT = a13.t();
                    androidx.compose.runtime.A.f37866a.getClass();
                    if (objT == A.a.f37868b) {
                        objT = new C27435o2(interfaceC22204y1);
                        a13.H(objT);
                    }
                    a13.h();
                    com.akita.compose.component.modal.C c12 = this.f65770l.f406620c;
                    Y0.f65572a.getClass();
                    com.akita.compose.component.modal.B.b((Y41.a) objT, null, c12, Y0.f65573b, ModalButtonsOrientation.f62006c, null, Y0.f65574c, "Title", "Subtitle", null, null, null, false, false, null, a13, (com.akita.compose.component.modal.C.f61982u << 6) | 114846726, 32290);
                }
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ModalPreview.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.akita.compose.theme.re23.preview.n2$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.modal.C> f65772l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f65773m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i12, kotlin.Q q12) {
            super(2);
            this.f65772l = q12;
            this.f65773m = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f65773m | 1);
            C27430n2.a(this.f65772l, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k kotlin.Q<String, com.akita.compose.component.modal.C> q12, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(1931991552);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(q12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            bE2.C(-1000993363);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = C22126m3.g(Boolean.FALSE);
                bE2.H(objT);
            }
            InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
            bE2.X(false);
            String str = q12.f406619b;
            bE2.C(-1000987325);
            Object objT2 = bE2.t();
            if (objT2 == c1651a) {
                objT2 = new a(interfaceC22204y1);
                bE2.H(objT2);
            }
            bE2.X(false);
            C27452s0.a(str, null, null, 0.0f, Collections.singleton(new AbstractC27462u0.a("Show Dialog", (Y41.a) objT2)), androidx.compose.runtime.internal.r.c(1847166826, new b(q12, interfaceC22204y1), bE2), bE2, 196608, 14);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(i12, q12);
        }
    }
}
