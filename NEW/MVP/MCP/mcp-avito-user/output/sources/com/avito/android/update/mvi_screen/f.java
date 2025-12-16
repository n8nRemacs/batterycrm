package com.avito.android.update.mvi_screen;

import GG0.b;
import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import android.content.Context;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.akita.compose.component.toast_bar.J;
import com.akita.compose.component.toast_bar.ToastBarDuration;
import com.akita.compose.component.toast_bar.ToastBarPosition;
import com.akita.compose.component.toast_bar.u;
import com.avito.android.R;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UpdateApplicationScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_update_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f {

    /* compiled from: UpdateApplicationScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.update.mvi_screen.UpdateApplicationScreenKt$UpdateApplicationScreen$1", f = "UpdateApplicationScreen.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f306672q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<GG0.b> f306673r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f306674s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Context f306675t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ u f306676u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ J f306677v;

        /* compiled from: UpdateApplicationScreen.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LGG0/b;", "event", "Lkotlin/G0;", "emit", "(LGG0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.update.mvi_screen.f$a$a, reason: collision with other inner class name */
        public static final class C9423a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Y41.a<G0> f306678b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Context f306679c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ u f306680d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ J f306681e;

            public C9423a(Y41.a aVar, Context context, u uVar, J j12) {
                ToastBarPosition toastBarPosition = ToastBarPosition.f63235b;
                this.f306678b = aVar;
                this.f306679c = context;
                this.f306680d = uVar;
                this.f306681e = j12;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                GG0.b bVar = (GG0.b) obj;
                if (L.f(bVar, b.a.f6400a)) {
                    ((com.avito.android.update.mvi_screen.b) this.f306678b).invoke();
                } else if (L.f(bVar, b.C0339b.f6401a)) {
                    Object objA = this.f306680d.a(this.f306681e, this.f306679c.getString(R.string.no_application_installed_to_perform_this_action), G0.f406611a, (60 & 8) != 0 ? null : null, (60 & 32) != 0 ? ToastBarDuration.f63230b : null, (60 & 64) != 0 ? ToastBarPosition.f63235b : ToastBarPosition.f63236c, (60 & 128) != 0 ? false : false, continuation);
                    return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC43160i interfaceC43160i, Y41.a aVar, Context context, u uVar, J j12, Continuation continuation) {
            super(2, continuation);
            ToastBarPosition toastBarPosition = ToastBarPosition.f63235b;
            this.f306673r = interfaceC43160i;
            this.f306674s = aVar;
            this.f306675t = context;
            this.f306676u = uVar;
            this.f306677v = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            ToastBarPosition toastBarPosition = ToastBarPosition.f63235b;
            return new a(this.f306673r, this.f306674s, this.f306675t, this.f306676u, this.f306677v, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f306672q;
            if (i12 == 0) {
                C42729a0.b(obj);
                ToastBarPosition toastBarPosition = ToastBarPosition.f63235b;
                C9423a c9423a = new C9423a(this.f306674s, this.f306675t, this.f306676u, this.f306677v);
                this.f306672q = 1;
                if (this.f306673r.collect(c9423a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: UpdateApplicationScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements q<T1, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f306682l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a<G0> aVar) {
            super(3);
            this.f306682l = aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x013e  */
        @Override // Y41.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.foundation.layout.T1 r22, androidx.compose.runtime.A r23, java.lang.Integer r24) {
            /*
                Method dump skipped, instructions count: 360
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.update.mvi_screen.f.b.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: UpdateApplicationScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<GG0.b> f306683l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f306684m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f306685n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(InterfaceC43160i<? extends GG0.b> interfaceC43160i, Y41.a<G0> aVar, Y41.a<G0> aVar2, int i12) {
            super(2);
            this.f306683l = interfaceC43160i;
            this.f306684m = aVar;
            this.f306685n = aVar2;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(9);
            Y41.a<G0> aVar = this.f306684m;
            Y41.a<G0> aVar2 = this.f306685n;
            f.a(this.f306683l, aVar, aVar2, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@k InterfaceC43160i<? extends GG0.b> interfaceC43160i, @k Y41.a<G0> aVar, @k Y41.a<G0> aVar2, @l A a12, int i12) {
        B bE2 = a12.E(669029599);
        bE2.C(-1554302838);
        Object objT = bE2.t();
        A.f37866a.getClass();
        if (objT == A.a.f37868b) {
            objT = new u();
            bE2.H(objT);
        }
        u uVar = (u) objT;
        bE2.X(false);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        J f66804a = com.akita.compose.theme.re23.b.u(bE2).getF66804a();
        ToastBarPosition toastBarPosition = ToastBarPosition.f63235b;
        Context context = (Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b);
        C22187u0.d(new a(interfaceC43160i, aVar2, context, uVar, f66804a, null), bE2, G0.f406611a);
        com.akita.compose.component.scaffold.g.a(null, null, null, uVar, null, null, null, r.c(-1165742996, new b(aVar), bE2), bE2, 12585984, 119);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(interfaceC43160i, aVar, aVar2, i12);
        }
    }
}
