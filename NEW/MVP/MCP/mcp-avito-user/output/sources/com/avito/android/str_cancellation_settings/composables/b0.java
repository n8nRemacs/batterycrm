package com.avito.android.str_cancellation_settings.composables;

import Sy0.InterfaceC15270a;
import Sy0.c;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.v;
import com.akita.compose.component.toast_bar.ToastBarDuration;
import com.akita.compose.component.toast_bar.ToastBarPosition;
import com.avito.android.str_cancellation_settings.mvi.entity.a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrCancellationSettingsContent.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_str-cancellation-settings_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b0 {

    /* compiled from: StrCancellationSettingsContent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_cancellation_settings.composables.StrCancellationSettingsContentKt$StrCancellationSettingsContent$1", f = "StrCancellationSettingsContent.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f288199q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<c.a> f288200r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f288201s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.J f288202t;

        /* compiled from: StrCancellationSettingsContent.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LSy0/c$a;", "event", "Lkotlin/G0;", "emit", "(LSy0/c$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.str_cancellation_settings.composables.b0$a$a, reason: collision with other inner class name */
        public static final class C8662a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.akita.compose.component.toast_bar.u f288203b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ com.akita.compose.component.toast_bar.J f288204c;

            public C8662a(com.akita.compose.component.toast_bar.u uVar, com.akita.compose.component.toast_bar.J j12) {
                this.f288203b = uVar;
                this.f288204c = j12;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                c.a aVar = (c.a) obj;
                if (!(aVar instanceof c.a.C1040a)) {
                    return G0.f406611a;
                }
                Object objA = this.f288203b.a(this.f288204c, ((c.a.C1040a) aVar).f15232a, G0.f406611a, (60 & 8) != 0 ? null : null, (60 & 32) != 0 ? ToastBarDuration.f63230b : ToastBarDuration.f63231c, (60 & 64) != 0 ? ToastBarPosition.f63235b : ToastBarPosition.f63236c, (60 & 128) != 0 ? false : true, continuation);
                return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC43160i<? extends c.a> interfaceC43160i, com.akita.compose.component.toast_bar.u uVar, com.akita.compose.component.toast_bar.J j12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f288200r = interfaceC43160i;
            this.f288201s = uVar;
            this.f288202t = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f288200r, this.f288201s, this.f288202t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f288199q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C8662a c8662a = new C8662a(this.f288201s, this.f288202t);
                this.f288199q = 1;
                if (this.f288200r.collect(c8662a, this) == coroutine_suspended) {
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

    /* compiled from: StrCancellationSettingsContent.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ a.b f288205l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC15270a, G0> f288206m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(a.b bVar, Y41.l<? super InterfaceC15270a, G0> lVar) {
            super(2);
            this.f288205l = bVar;
            this.f288206m = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.runtime.A r5, java.lang.Integer r6) {
            /*
                r4 = this;
                androidx.compose.runtime.A r5 = (androidx.compose.runtime.A) r5
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                r6 = r6 & 11
                r0 = 2
                if (r6 != r0) goto L18
                boolean r6 = r5.c()
                if (r6 != 0) goto L14
                goto L18
            L14:
                r5.f()
                goto L60
            L18:
                com.avito.android.str_cancellation_settings.mvi.entity.a$b r6 = r4.f288205l
                com.avito.android.printable_text.PrintableText r0 = r6.f288485b
                androidx.compose.runtime.J3 r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f41069b
                java.lang.Object r2 = r5.o(r1)
                android.content.Context r2 = (android.content.Context) r2
                java.lang.String r0 = r0.k0(r2)
                java.lang.Object r1 = r5.o(r1)
                android.content.Context r1 = (android.content.Context) r1
                com.avito.android.printable_text.PrintableText r6 = r6.f288486c
                java.lang.String r6 = r6.k0(r1)
                r1 = 627843606(0x256c2216, float:2.0481286E-16)
                r5.C(r1)
                Y41.l<Sy0.a, kotlin.G0> r1 = r4.f288206m
                boolean r2 = r5.B(r1)
                java.lang.Object r3 = r5.t()
                if (r2 != 0) goto L4f
                androidx.compose.runtime.A$a r2 = androidx.compose.runtime.A.f37866a
                r2.getClass()
                androidx.compose.runtime.A$a$a r2 = androidx.compose.runtime.A.a.f37868b
                if (r3 != r2) goto L57
            L4f:
                com.avito.android.str_cancellation_settings.composables.c0 r3 = new com.avito.android.str_cancellation_settings.composables.c0
                r3.<init>(r1)
                r5.H(r3)
            L57:
                Y41.a r3 = (Y41.a) r3
                r5.h()
                r1 = 0
                com.avito.android.str_cancellation_settings.composables.y0.a(r0, r6, r3, r5, r1)
            L60:
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_cancellation_settings.composables.b0.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: StrCancellationSettingsContent.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ a.b f288207l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC15270a, G0> f288208m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(a.b bVar, Y41.l<? super InterfaceC15270a, G0> lVar) {
            super(2);
            this.f288207l = bVar;
            this.f288208m = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.runtime.A r4, java.lang.Integer r5) {
            /*
                r3 = this;
                androidx.compose.runtime.A r4 = (androidx.compose.runtime.A) r4
                java.lang.Number r5 = (java.lang.Number) r5
                int r5 = r5.intValue()
                r5 = r5 & 11
                r0 = 2
                if (r5 != r0) goto L18
                boolean r5 = r4.c()
                if (r5 != 0) goto L14
                goto L18
            L14:
                r4.f()
                goto L4e
            L18:
                com.avito.android.str_cancellation_settings.mvi.entity.a$b r5 = r3.f288207l
                boolean r0 = r5.f288490g
                if (r0 == 0) goto L4e
                r0 = 627855096(0x256c4ef8, float:2.0496493E-16)
                r4.C(r0)
                Y41.l<Sy0.a, kotlin.G0> r0 = r3.f288208m
                boolean r1 = r4.B(r0)
                java.lang.Object r2 = r4.t()
                if (r1 != 0) goto L39
                androidx.compose.runtime.A$a r1 = androidx.compose.runtime.A.f37866a
                r1.getClass()
                androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
                if (r2 != r1) goto L41
            L39:
                com.avito.android.str_cancellation_settings.composables.d0 r2 = new com.avito.android.str_cancellation_settings.composables.d0
                r2.<init>(r0)
                r4.H(r2)
            L41:
                Y41.a r2 = (Y41.a) r2
                r4.h()
                boolean r0 = r5.f288487d
                boolean r5 = r5.f288488e
                r1 = 0
                com.avito.android.str_cancellation_settings.composables.W.a(r0, r5, r2, r4, r1)
            L4e:
                kotlin.G0 r4 = kotlin.G0.f406611a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_cancellation_settings.composables.b0.c.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: StrCancellationSettingsContent.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "paddingValues", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.q<T1, androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ a.b f288209l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC15270a, G0> f288210m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(a.b bVar, Y41.l<? super InterfaceC15270a, G0> lVar) {
            super(3);
            this.f288209l = bVar;
            this.f288210m = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
        @Override // Y41.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.foundation.layout.T1 r16, androidx.compose.runtime.A r17, java.lang.Integer r18) {
            /*
                r15 = this;
                r0 = r15
                r3 = r16
                androidx.compose.foundation.layout.T1 r3 = (androidx.compose.foundation.layout.T1) r3
                r11 = r17
                androidx.compose.runtime.A r11 = (androidx.compose.runtime.A) r11
                r1 = r18
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                r2 = r1 & 14
                if (r2 != 0) goto L1f
                boolean r2 = r11.B(r3)
                if (r2 == 0) goto L1d
                r2 = 4
                goto L1e
            L1d:
                r2 = 2
            L1e:
                r1 = r1 | r2
            L1f:
                r2 = r1 & 91
                r4 = 18
                if (r2 != r4) goto L30
                boolean r2 = r11.c()
                if (r2 != 0) goto L2c
                goto L30
            L2c:
                r11.f()
                goto L87
            L30:
                androidx.compose.ui.v$a r2 = androidx.compose.ui.v.f42878y1
                androidx.compose.foundation.layout.FillElement r4 = androidx.compose.foundation.layout.C20588k2.f28682c
                r2.getClass()
                androidx.compose.ui.platform.I1 r2 = androidx.compose.ui.platform.J1.e(r11)
                r5 = 0
                androidx.compose.ui.v r2 = androidx.compose.ui.input.nestedscroll.e.a(r4, r2, r5)
                r4 = 627868569(0x256c8399, float:2.0514324E-16)
                r11.C(r4)
                com.avito.android.str_cancellation_settings.mvi.entity.a$b r4 = r0.f288209l
                boolean r5 = r11.B(r4)
                Y41.l<Sy0.a, kotlin.G0> r6 = r0.f288210m
                boolean r7 = r11.B(r6)
                r5 = r5 | r7
                java.lang.Object r7 = r11.t()
                if (r5 != 0) goto L62
                androidx.compose.runtime.A$a r5 = androidx.compose.runtime.A.f37866a
                r5.getClass()
                androidx.compose.runtime.A$a$a r5 = androidx.compose.runtime.A.a.f37868b
                if (r7 != r5) goto L6a
            L62:
                com.avito.android.str_cancellation_settings.composables.n0 r7 = new com.avito.android.str_cancellation_settings.composables.n0
                r7.<init>(r4, r6)
                r11.H(r7)
            L6a:
                r10 = r7
                Y41.l r10 = (Y41.l) r10
                r11.h()
                int r1 = r1 << 6
                r12 = r1 & 896(0x380, float:1.256E-42)
                r7 = 0
                r13 = 506(0x1fa, float:7.09E-43)
                r4 = 0
                r5 = 0
                r6 = 0
                r8 = 0
                r9 = 0
                r14 = 0
                r1 = r2
                r2 = r4
                r4 = r5
                r5 = r6
                r6 = r8
                r8 = r9
                r9 = r14
                androidx.compose.foundation.lazy.C20650b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            L87:
                kotlin.G0 r1 = kotlin.G0.f406611a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_cancellation_settings.composables.b0.d.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: StrCancellationSettingsContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ a.b f288211l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC15270a, G0> f288212m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<c.a> f288213n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f288214o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(a.b bVar, Y41.l<? super InterfaceC15270a, G0> lVar, InterfaceC43160i<? extends c.a> interfaceC43160i, int i12) {
            super(2);
            this.f288211l = bVar;
            this.f288212m = lVar;
            this.f288213n = interfaceC43160i;
            this.f288214o = i12;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f288214o | 1);
            InterfaceC43160i<c.a> interfaceC43160i = this.f288213n;
            b0.a(this.f288211l, this.f288212m, interfaceC43160i, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k a.b bVar, @Y61.k Y41.l<? super InterfaceC15270a, G0> lVar, @Y61.k InterfaceC43160i<? extends c.a> interfaceC43160i, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-1634682524);
        com.akita.compose.component.toast_bar.u uVarA = com.akita.compose.component.toast_bar.w.a(bE2);
        com.akita.compose.component.toast_bar.J jP2 = com.avito.android.actions_sheet.a.p(com.akita.compose.theme.re23.b.f63983a, bE2);
        C22187u0.d(new a(interfaceC43160i, uVarA, jP2, null), bE2, G0.f406611a);
        v.a aVar = androidx.compose.ui.v.f42878y1;
        FillElement fillElement = C20588k2.f28682c;
        aVar.getClass();
        com.akita.compose.component.scaffold.g.a(fillElement, androidx.compose.runtime.internal.r.c(-1734935000, new b(bVar, lVar), bE2), androidx.compose.runtime.internal.r.c(-935360471, new c(bVar, lVar), bE2), uVarA, null, com.akita.compose.theme.re23.b.f63984b.f63851H1, null, androidx.compose.runtime.internal.r.c(1961549041, new d(bVar, lVar), bE2), bE2, 12583350, 80);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new e(bVar, lVar, interfaceC43160i, i12);
        }
    }
}
