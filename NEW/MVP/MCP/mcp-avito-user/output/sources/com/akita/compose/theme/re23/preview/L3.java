package com.akita.compose.theme.re23.preview;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.unit.h;
import com.akita.compose.component.toast_bar.ToastBarDuration;
import com.akita.compose.component.toast_bar.ToastBarPosition;
import com.akita.compose.theme.re23.preview.AbstractC27462u0;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.C43259k;

/* compiled from: ToastBarPreview.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "shouldCancelPrevious", "re23_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class L3 {

    /* compiled from: ToastBarPreview.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<ToastBarDuration> f65412a = kotlin.enums.c.a(ToastBarDuration.values());

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<ToastBarPosition> f65413b = kotlin.enums.c.a(ToastBarPosition.values());
    }

    /* compiled from: ToastBarPreview.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.T f65414l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f65415m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.toast_bar.J> f65416n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ ToastBarDuration f65417o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ ToastBarPosition f65418p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f65419q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlinx.coroutines.T t12, com.akita.compose.component.toast_bar.u uVar, kotlin.Q<String, com.akita.compose.component.toast_bar.J> q12, ToastBarDuration toastBarDuration, ToastBarPosition toastBarPosition, InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(0);
            this.f65414l = t12;
            this.f65415m = uVar;
            this.f65416n = q12;
            this.f65417o = toastBarDuration;
            this.f65418p = toastBarPosition;
            this.f65419q = interfaceC22204y1;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C43259k.d(this.f65414l, null, null, new M3(this.f65415m, this.f65416n, this.f65417o, this.f65418p, this.f65419q, null), 3);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ToastBarPreview.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Boolean, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f65420l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(1);
            this.f65420l = interfaceC22204y1;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            this.f65420l.setValue(bool2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ToastBarPreview.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f65421l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.toast_bar.J> f65422m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.akita.compose.component.toast_bar.u uVar, kotlin.Q<String, com.akita.compose.component.toast_bar.J> q12) {
            super(3);
            this.f65421l = uVar;
            this.f65422m = q12;
        }

        @Override // Y41.q
        public final kotlin.G0 invoke(androidx.compose.foundation.layout.J j12, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.component.scaffold.g.a(C20588k2.f(C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f), 180), null, null, this.f65421l, null, null, null, androidx.compose.runtime.internal.r.c(1865311433, new N3(this.f65422m), a13), a13, 12582918, 118);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ToastBarPreview.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.toast_bar.J> f65423l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f65424m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i12, kotlin.Q q12) {
            super(2);
            this.f65423l = q12;
            this.f65424m = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f65424m | 1);
            L3.a(this.f65423l, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k kotlin.Q<String, com.akita.compose.component.toast_bar.J> q12, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B b12;
        androidx.compose.runtime.B bE2 = a12.E(-832198574);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(q12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            com.akita.compose.component.toast_bar.u uVarA = com.akita.compose.component.toast_bar.w.a(bE2);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = C22187u0.h(EmptyCoroutineContext.INSTANCE, bE2);
                bE2.H(objT);
            }
            kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) objT;
            bE2.C(-1902146770);
            Object objT2 = bE2.t();
            if (objT2 == c1651a) {
                objT2 = C22126m3.g(Boolean.FALSE);
                bE2.H(objT2);
            }
            InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT2;
            bE2.X(false);
            AbstractC27462u0.b bVarC = C27452s0.c("duration", a.f65412a, null, bE2, 4);
            AbstractC27462u0.b bVarC2 = C27452s0.c("position", a.f65413b, null, bE2, 4);
            ToastBarDuration toastBarDuration = (ToastBarDuration) C22126m3.b(bVarC.f65855c, bE2).getF42167b();
            ToastBarPosition toastBarPosition = (ToastBarPosition) C22126m3.b(bVarC2.f65855c, bE2).getF42167b();
            String str = q12.f406619b;
            AbstractC27462u0.a aVar = new AbstractC27462u0.a("showToastBar", new b(t12, uVarA, q12, toastBarDuration, toastBarPosition, interfaceC22204y1));
            boolean zBooleanValue = ((Boolean) interfaceC22204y1.getF42167b()).booleanValue();
            bE2.C(-1902108919);
            Object objT3 = bE2.t();
            if (objT3 == c1651a) {
                objT3 = new c(interfaceC22204y1);
                bE2.H(objT3);
            }
            b12 = bE2;
            C27452s0.a(str, null, null, 0.0f, C42756l.l0(new AbstractC27462u0[]{aVar, com.akita.compose.component.accordion.s.h(bE2, false, "shouldCancelPrevious", zBooleanValue, (Y41.l) objT3), bVarC, bVarC2}), androidx.compose.runtime.internal.r.c(-1913250244, new d(uVarA, q12), bE2), b12, 196608, 14);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new e(i12, q12);
        }
    }
}
