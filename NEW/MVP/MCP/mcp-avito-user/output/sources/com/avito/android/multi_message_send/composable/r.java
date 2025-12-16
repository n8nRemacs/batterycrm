package com.avito.android.multi_message_send.composable;

import G20.c;
import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MultiMessageSendScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_multi-message-send_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class r {

    /* compiled from: MultiMessageSendScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.multi_message_send.composable.MultiMessageSendScreenKt$MultiMessageSendScreen$1", f = "MultiMessageSendScreen.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f206547q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<G20.c> f206548r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.T f206549s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.app.m f206550t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f206551u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.J f206552v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f206553w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.J f206554x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f206555y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f206556z;

        /* compiled from: MultiMessageSendScreen.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LG20/c;", "event", "Lkotlin/G0;", "emit", "(LG20/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.multi_message_send.composable.r$a$a, reason: collision with other inner class name */
        public static final class C6149a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.T f206557b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ androidx.appcompat.app.m f206558c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ com.akita.compose.component.toast_bar.u f206559d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ com.akita.compose.component.toast_bar.J f206560e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f206561f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ com.akita.compose.component.toast_bar.J f206562g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ String f206563h;

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ String f206564i;

            public C6149a(kotlinx.coroutines.T t12, androidx.appcompat.app.m mVar, com.akita.compose.component.toast_bar.u uVar, com.akita.compose.component.toast_bar.J j12, String str, com.akita.compose.component.toast_bar.J j13, String str2, String str3) {
                this.f206557b = t12;
                this.f206558c = mVar;
                this.f206559d = uVar;
                this.f206560e = j12;
                this.f206561f = str;
                this.f206562g = j13;
                this.f206563h = str2;
                this.f206564i = str3;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                G20.c cVar = (G20.c) obj;
                boolean zF2 = kotlin.jvm.internal.L.f(cVar, c.d.f6243a);
                kotlinx.coroutines.T t12 = this.f206557b;
                com.akita.compose.component.toast_bar.J j12 = this.f206560e;
                com.akita.compose.component.toast_bar.u uVar = this.f206559d;
                if (zF2) {
                    C43259k.d(t12, null, null, new C32868o(uVar, j12, this.f206561f, null), 3);
                } else {
                    boolean zF3 = kotlin.jvm.internal.L.f(cVar, c.a.f6240a);
                    androidx.appcompat.app.m mVar = this.f206558c;
                    if (zF3) {
                        if (mVar != null) {
                            mVar.setResult(0);
                            mVar.finish();
                        }
                    } else if (kotlin.jvm.internal.L.f(cVar, c.f.f6245a)) {
                        C43259k.d(t12, null, null, new C32869p(uVar, this.f206562g, this.f206563h, null), 3);
                    } else if (kotlin.jvm.internal.L.f(cVar, c.e.f6244a)) {
                        C43259k.d(t12, null, null, new C32870q(uVar, j12, this.f206564i, null), 3);
                    } else if ((cVar instanceof c.b) && mVar != null) {
                        mVar.setResult(-1, new Intent().putExtra("multi_message_send_result_code", ((c.b) cVar).f6241a));
                        mVar.finish();
                    }
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC43160i<? extends G20.c> interfaceC43160i, kotlinx.coroutines.T t12, androidx.appcompat.app.m mVar, com.akita.compose.component.toast_bar.u uVar, com.akita.compose.component.toast_bar.J j12, String str, com.akita.compose.component.toast_bar.J j13, String str2, String str3, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f206548r = interfaceC43160i;
            this.f206549s = t12;
            this.f206550t = mVar;
            this.f206551u = uVar;
            this.f206552v = j12;
            this.f206553w = str;
            this.f206554x = j13;
            this.f206555y = str2;
            this.f206556z = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f206548r, this.f206549s, this.f206550t, this.f206551u, this.f206552v, this.f206553w, this.f206554x, this.f206555y, this.f206556z, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f206547q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C6149a c6149a = new C6149a(this.f206549s, this.f206550t, this.f206551u, this.f206552v, this.f206553w, this.f206554x, this.f206555y, this.f206556z);
                this.f206547q = 1;
                if (this.f206548r.collect(c6149a, this) == coroutine_suspended) {
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

    /* compiled from: MultiMessageSendScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f206565l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<G20.b, G0> f206566m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ G20.f f206567n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<G20.c> f206568o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.T f206569p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(com.akita.compose.component.toast_bar.u uVar, Y41.l<? super G20.b, G0> lVar, G20.f fVar, InterfaceC43160i<? extends G20.c> interfaceC43160i, kotlinx.coroutines.T t12) {
            super(2);
            this.f206565l = uVar;
            this.f206566m = lVar;
            this.f206567n = fVar;
            this.f206568o = interfaceC43160i;
            this.f206569p = t12;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                v.a aVar = androidx.compose.ui.v.f42878y1;
                FillElement fillElement = C20588k2.f28682c;
                aVar.getClass();
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.foundation.p pVar = com.akita.compose.theme.re23.b.f63984b.f63851H1;
                G20.f fVar = this.f206567n;
                Y41.l<G20.b, G0> lVar = this.f206566m;
                com.akita.compose.component.scaffold.g.a(fillElement, androidx.compose.runtime.internal.r.c(14760297, new C32874v(fVar, lVar), a13), androidx.compose.runtime.internal.r.c(-2133640534, new C32875w(fVar, lVar), a13), this.f206565l, null, pVar, null, androidx.compose.runtime.internal.r.c(-1356809870, new C32876x(fVar, lVar, this.f206568o, this.f206569p), a13), a13, 12583350, 80);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MultiMessageSendScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ G20.f f206570l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<G20.b, G0> f206571m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<G20.c> f206572n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(G20.f fVar, Y41.l<? super G20.b, G0> lVar, InterfaceC43160i<? extends G20.c> interfaceC43160i, int i12) {
            super(2);
            this.f206570l = fVar;
            this.f206571m = lVar;
            this.f206572n = interfaceC43160i;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(521);
            r.a(this.f206570l, this.f206571m, this.f206572n, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k G20.f fVar, @Y61.k Y41.l<? super G20.b, G0> lVar, @Y61.k InterfaceC43160i<? extends G20.c> interfaceC43160i, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-1324647798);
        com.akita.compose.component.toast_bar.u uVarA = com.akita.compose.component.toast_bar.w.a(bE2);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.component.toast_bar.J f66804a = com.akita.compose.theme.re23.b.u(bE2).getF66804a();
        String strA = u0.i.a(R.plurals.multi_message_send_max_items_selected_toast_text, 3, new Object[]{3}, bE2);
        String strC = u0.i.c(bE2, R.string.multi_message_send_error_send_text);
        String strC2 = u0.i.c(bE2, R.string.multi_message_send_no_items_for_send_error);
        com.akita.compose.component.toast_bar.J f66806c = com.akita.compose.theme.re23.b.u(bE2).getF66806c();
        androidx.appcompat.app.m mVarC = C35835l0.c((Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b));
        Object objT = bE2.t();
        androidx.compose.runtime.A.f37866a.getClass();
        if (objT == A.a.f37868b) {
            objT = C22187u0.h(EmptyCoroutineContext.INSTANCE, bE2);
            bE2.H(objT);
        }
        kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) objT;
        C22187u0.d(new a(interfaceC43160i, t12, mVarC, uVarA, f66804a, strA, f66806c, strC, strC2, null), bE2, interfaceC43160i);
        com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(-1796167771, new b(uVarA, lVar, fVar, interfaceC43160i, t12), bE2), bE2, 48, 1);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(fVar, lVar, interfaceC43160i, i12);
        }
    }
}
