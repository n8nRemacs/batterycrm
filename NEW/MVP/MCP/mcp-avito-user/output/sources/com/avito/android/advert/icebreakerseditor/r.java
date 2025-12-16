package com.avito.android.advert.icebreakerseditor;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.v;
import b4.C25408d;
import b4.InterfaceC25405a;
import b4.InterfaceC25407c;
import com.akita.compose.component.toast_bar.J;
import com.akita.compose.component.toast_bar.ToastBarDuration;
import com.akita.compose.component.toast_bar.ToastBarPosition;
import com.avito.android.R;
import com.avito.android.remote.model.messenger.context_actions.PlatformActions;
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

/* compiled from: IcebreakersEditorScreen.kt */
@s0
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003¨\u0006\u000b²\u0006\u0018\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function1;", "Lb4/a;", "Lkotlin/G0;", "onActionState", "Lkotlin/Function0;", "onCloseState", "", PlatformActions.MESSAGE_ID, "", "isSaveEnabled", "isInputEnabled", "_avito_advert-details_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class r {

    /* compiled from: IcebreakersEditorScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.icebreakerseditor.IcebreakersEditorScreenKt$HandleEvents$1", f = "IcebreakersEditorScreen.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f71272q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<InterfaceC25407c> f71273r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f71274s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ J f71275t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f71276u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f71277v;

        /* compiled from: IcebreakersEditorScreen.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb4/c;", "event", "Lkotlin/G0;", "emit", "(Lb4/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.advert.icebreakerseditor.r$a$a, reason: collision with other inner class name */
        public static final class C2172a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.akita.compose.component.toast_bar.u f71278b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ J f71279c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f71280d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22204y1 f71281e;

            public C2172a(com.akita.compose.component.toast_bar.u uVar, J j12, String str, InterfaceC22204y1 interfaceC22204y1) {
                this.f71278b = uVar;
                this.f71279c = j12;
                this.f71280d = str;
                this.f71281e = interfaceC22204y1;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                InterfaceC25407c interfaceC25407c = (InterfaceC25407c) obj;
                if (L.f(interfaceC25407c, InterfaceC25407c.a.f56888a)) {
                    ((Y41.a) this.f71281e.getF42167b()).invoke();
                } else if (L.f(interfaceC25407c, InterfaceC25407c.b.f56889a)) {
                    Object objA = this.f71278b.a(this.f71279c, this.f71280d, G0.f406611a, (60 & 8) != 0 ? null : null, (60 & 32) != 0 ? ToastBarDuration.f63230b : ToastBarDuration.f63231c, (60 & 64) != 0 ? ToastBarPosition.f63235b : ToastBarPosition.f63236c, (60 & 128) != 0 ? false : false, continuation);
                    return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC43160i interfaceC43160i, com.akita.compose.component.toast_bar.u uVar, J j12, String str, InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
            super(2, continuation);
            this.f71273r = interfaceC43160i;
            this.f71274s = uVar;
            this.f71275t = j12;
            this.f71276u = str;
            this.f71277v = interfaceC22204y1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            InterfaceC22204y1 interfaceC22204y1 = this.f71277v;
            return new a(this.f71273r, this.f71274s, this.f71275t, this.f71276u, interfaceC22204y1, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f71272q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C2172a c2172a = new C2172a(this.f71274s, this.f71275t, this.f71276u, this.f71277v);
                this.f71272q = 1;
                if (this.f71273r.collect(c2172a, this) == coroutine_suspended) {
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

    /* compiled from: IcebreakersEditorScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f71282l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC25405a, G0> f71283m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ C25408d f71284n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<InterfaceC25407c> f71285o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f71286p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f71287q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.a<G0> aVar, Y41.l<? super InterfaceC25405a, G0> lVar, C25408d c25408d, InterfaceC43160i<? extends InterfaceC25407c> interfaceC43160i, com.akita.compose.component.toast_bar.u uVar, int i12) {
            super(2);
            this.f71282l = aVar;
            this.f71283m = lVar;
            this.f71284n = c25408d;
            this.f71285o = interfaceC43160i;
            this.f71286p = uVar;
            this.f71287q = i12;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            r.b(this.f71282l, this.f71283m, this.f71284n, this.f71285o, this.f71286p, a12, C22066f2.a(this.f71287q | 1));
            return G0.f406611a;
        }
    }

    /* compiled from: IcebreakersEditorScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC25405a, G0> f71288l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.l<? super InterfaceC25405a, G0> lVar) {
            super(2);
            this.f71288l = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.runtime.A r9, java.lang.Integer r10) {
            /*
                r8 = this;
                r5 = r9
                androidx.compose.runtime.A r5 = (androidx.compose.runtime.A) r5
                java.lang.Number r10 = (java.lang.Number) r10
                int r9 = r10.intValue()
                r9 = r9 & 11
                r10 = 2
                if (r9 != r10) goto L19
                boolean r9 = r5.c()
                if (r9 != 0) goto L15
                goto L19
            L15:
                r5.f()
                goto L4c
            L19:
                r9 = -2011202084(0xffffffff881f7ddc, float:-4.799527E-34)
                r5.C(r9)
                Y41.l<b4.a, kotlin.G0> r9 = r8.f71288l
                boolean r10 = r5.B(r9)
                java.lang.Object r0 = r5.t()
                if (r10 != 0) goto L34
                androidx.compose.runtime.A$a r10 = androidx.compose.runtime.A.f37866a
                r10.getClass()
                androidx.compose.runtime.A$a$a r10 = androidx.compose.runtime.A.a.f37868b
                if (r0 != r10) goto L3c
            L34:
                com.avito.android.advert.icebreakerseditor.v r0 = new com.avito.android.advert.icebreakerseditor.v
                r0.<init>(r9)
                r5.H(r0)
            L3c:
                r3 = r0
                Y41.a r3 = (Y41.a) r3
                r5.h()
                r6 = 0
                r7 = 23
                r0 = 0
                r1 = 0
                r2 = 0
                r4 = 0
                com.akita.compose.component.navbar.t.b(r0, r1, r2, r3, r4, r5, r6, r7)
            L4c:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.icebreakerseditor.r.c.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: IcebreakersEditorScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC25405a, G0> f71289l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Y41.l<? super InterfaceC25405a, G0> lVar) {
            super(2);
            this.f71289l = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.runtime.A r14, java.lang.Integer r15) {
            /*
                r13 = this;
                r10 = r14
                androidx.compose.runtime.A r10 = (androidx.compose.runtime.A) r10
                java.lang.Number r15 = (java.lang.Number) r15
                int r14 = r15.intValue()
                r14 = r14 & 11
                r15 = 2
                if (r14 != r15) goto L19
                boolean r14 = r10.c()
                if (r14 != 0) goto L15
                goto L19
            L15:
                r10.f()
                goto L6c
            L19:
                com.akita.compose.theme.re23.b r14 = com.akita.compose.theme.re23.b.f63983a
                com.akita.compose.component.button.t r2 = com.avito.android.actions_sheet.a.o(r14, r10)
                androidx.compose.ui.v$a r14 = androidx.compose.ui.v.f42878y1
                r15 = 1065353216(0x3f800000, float:1.0)
                androidx.compose.ui.v r14 = androidx.compose.foundation.layout.C20588k2.d(r14, r15)
                r15 = 16
                float r15 = (float) r15
                androidx.compose.ui.unit.h$a r0 = androidx.compose.ui.unit.h.f42849c
                androidx.compose.ui.v r3 = androidx.compose.foundation.layout.R1.i(r14, r15)
                r14 = 2131954398(0x7f130ade, float:1.9545294E38)
                java.lang.String r0 = u0.i.c(r10, r14)
                r14 = -2011198130(0xffffffff881f8d4e, float:-4.8013425E-34)
                r10.C(r14)
                Y41.l<b4.a, kotlin.G0> r14 = r13.f71289l
                boolean r15 = r10.B(r14)
                java.lang.Object r1 = r10.t()
                if (r15 != 0) goto L52
                androidx.compose.runtime.A$a r15 = androidx.compose.runtime.A.f37866a
                r15.getClass()
                androidx.compose.runtime.A$a$a r15 = androidx.compose.runtime.A.a.f37868b
                if (r1 != r15) goto L5a
            L52:
                com.avito.android.advert.icebreakerseditor.w r1 = new com.avito.android.advert.icebreakerseditor.w
                r1.<init>(r14)
                r10.H(r1)
            L5a:
                Y41.a r1 = (Y41.a) r1
                r10.h()
                r11 = 3584(0xe00, float:5.022E-42)
                r12 = 1008(0x3f0, float:1.413E-42)
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                com.akita.compose.component.button.m.c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            L6c:
                kotlin.G0 r14 = kotlin.G0.f406611a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.icebreakerseditor.r.d.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: IcebreakersEditorScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "paddingValues", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.q<T1, androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C25408d f71290l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC25405a, G0> f71291m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.l lVar, C25408d c25408d) {
            super(3);
            this.f71290l = c25408d;
            this.f71291m = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x013f  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x019f  */
        @Override // Y41.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.foundation.layout.T1 r21, androidx.compose.runtime.A r22, java.lang.Integer r23) {
            /*
                Method dump skipped, instructions count: 457
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.icebreakerseditor.r.e.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: IcebreakersEditorScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C25408d f71292l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC25405a, G0> f71293m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f71294n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<InterfaceC25407c> f71295o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(C25408d c25408d, Y41.l<? super InterfaceC25405a, G0> lVar, Y41.a<G0> aVar, InterfaceC43160i<? extends InterfaceC25407c> interfaceC43160i, int i12) {
            super(2);
            this.f71292l = c25408d;
            this.f71293m = lVar;
            this.f71294n = aVar;
            this.f71295o = interfaceC43160i;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(4097);
            Y41.a<G0> aVar = this.f71294n;
            r.c(this.f71292l, this.f71293m, aVar, this.f71295o, a12, iA2);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k b4.C25408d r22, @Y61.k Y41.l r23, @Y61.l androidx.compose.ui.v.a r24, @Y61.l androidx.compose.runtime.A r25, int r26) {
        /*
            r0 = r22
            r1 = r23
            r2 = r26
            r3 = -1428649000(0xffffffffaad88bd8, float:-3.8466344E-13)
            r4 = r25
            androidx.compose.runtime.B r3 = r4.E(r3)
            boolean r4 = r3.B(r0)
            if (r4 == 0) goto L17
            r4 = 4
            goto L18
        L17:
            r4 = 2
        L18:
            r4 = r4 | r2
            boolean r5 = r3.u(r1)
            r6 = 32
            if (r5 == 0) goto L23
            r5 = r6
            goto L25
        L23:
            r5 = 16
        L25:
            r4 = r4 | r5
            r4 = r4 | 384(0x180, float:5.38E-43)
            r5 = r4 & 731(0x2db, float:1.024E-42)
            r7 = 146(0x92, float:2.05E-43)
            if (r5 != r7) goto L3b
            boolean r5 = r3.c()
            if (r5 != 0) goto L35
            goto L3b
        L35:
            r3.f()
            r4 = r24
            goto L93
        L3b:
            androidx.compose.ui.v$a r21 = androidx.compose.ui.v.f42878y1
            r5 = 0
            r7 = 1
            r8 = 6
            com.akita.compose.component.bottom_sheet.I r17 = com.akita.compose.component.bottom_sheet.N.a(r7, r5, r3, r8, r8)
            r5 = 1357709936(0x50ed0270, float:3.181088E10)
            r3.C(r5)
            r4 = r4 & 112(0x70, float:1.57E-43)
            r5 = 0
            if (r4 != r6) goto L50
            goto L51
        L50:
            r7 = r5
        L51:
            java.lang.Object r4 = r3.t()
            if (r7 != 0) goto L60
            androidx.compose.runtime.A$a r6 = androidx.compose.runtime.A.f37866a
            r6.getClass()
            androidx.compose.runtime.A$a$a r6 = androidx.compose.runtime.A.a.f37868b
            if (r4 != r6) goto L68
        L60:
            com.avito.android.advert.icebreakerseditor.i r4 = new com.avito.android.advert.icebreakerseditor.i
            r4.<init>(r1)
            r3.H(r4)
        L68:
            Y41.a r4 = (Y41.a) r4
            r3.X(r5)
            com.avito.android.advert.icebreakerseditor.p r5 = new com.avito.android.advert.icebreakerseditor.p
            r5.<init>(r1, r0)
            r6 = -595028744(0xffffffffdc8894f8, float:-3.0755512E17)
            androidx.compose.runtime.internal.n r16 = androidx.compose.runtime.internal.r.c(r6, r5, r3)
            r14 = 0
            r15 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r18 = 48
            r19 = 384(0x180, float:5.38E-43)
            r20 = 4088(0xff8, float:5.729E-42)
            r5 = r21
            r6 = r17
            r17 = r3
            com.akita.compose.component.bottom_sheet.H.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r4 = r21
        L93:
            androidx.compose.runtime.c2 r3 = r3.Z()
            if (r3 == 0) goto La0
            com.avito.android.advert.icebreakerseditor.q r5 = new com.avito.android.advert.icebreakerseditor.q
            r5.<init>(r0, r1, r4, r2)
            r3.f38184d = r5
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.icebreakerseditor.r.a(b4.d, Y41.l, androidx.compose.ui.v$a, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    public static final void b(Y41.a<G0> aVar, Y41.l<? super InterfaceC25405a, G0> lVar, C25408d c25408d, InterfaceC43160i<? extends InterfaceC25407c> interfaceC43160i, com.akita.compose.component.toast_bar.u uVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-1346698342);
        InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(aVar, bE2);
        C22126m3.m(lVar, bE2);
        C22187u0.d(new a(interfaceC43160i, uVar, com.avito.android.actions_sheet.a.p(com.akita.compose.theme.re23.b.f63983a, bE2), u0.i.c(bE2, R.string.icebreaeker_toast_error_message), interfaceC22204y1M, null), bE2, interfaceC43160i);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(aVar, lVar, c25408d, interfaceC43160i, uVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(@Y61.k C25408d c25408d, @Y61.k Y41.l<? super InterfaceC25405a, G0> lVar, @Y61.k Y41.a<G0> aVar, @Y61.k InterfaceC43160i<? extends InterfaceC25407c> interfaceC43160i, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(2053372613);
        InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(lVar, bE2);
        b(aVar, lVar, c25408d, interfaceC43160i, com.akita.compose.component.toast_bar.w.a(bE2), bE2, 4096);
        v.a aVar2 = androidx.compose.ui.v.f42878y1;
        FillElement fillElement = C20588k2.f28682c;
        aVar2.getClass();
        com.akita.compose.component.scaffold.g.a(fillElement, androidx.compose.runtime.internal.r.c(2013044873, new c(lVar), bE2), androidx.compose.runtime.internal.r.c(2022815434, new d(lVar), bE2), null, null, null, null, androidx.compose.runtime.internal.r.c(-535061102, new e(lVar, c25408d), bE2), bE2, 12583350, 120);
        if (c25408d.f56892b.f56900d) {
            a(c25408d, (Y41.l) interfaceC22204y1M.getF42167b(), null, bE2, 0);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new f(c25408d, lVar, aVar, interfaceC43160i, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(b4.C25408d.c r29, Y41.l r30, androidx.compose.runtime.A r31, int r32) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.icebreakerseditor.r.d(b4.d$c, Y41.l, androidx.compose.runtime.A, int):void");
    }
}
