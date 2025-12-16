package com.avito.android.btob_business_trip.screens.selectItemScreen;

import Bk.InterfaceC13157a;
import Bk.c;
import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.foundation.lazy.C20650b;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import coil.request.p;
import com.akita.compose.component.toast_bar.J;
import com.avito.android.R;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35829k2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: B2bBusinessSelectItemsScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\u0018\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function1;", "LBk/a;", "Lkotlin/G0;", "onPositiveButtonClicked", "_avito_btob-business-trip_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.btob_business_trip.screens.selectItemScreen.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28901a {

    /* compiled from: B2bBusinessSelectItemsScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.btob_business_trip.screens.selectItemScreen.a$a, reason: collision with other inner class name */
    public static final class C3234a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC13157a, G0> f108131l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3234a(Y41.l<? super InterfaceC13157a, G0> lVar) {
            super(0);
            this.f108131l = lVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f108131l.invoke(InterfaceC13157a.e.f1643a);
            return G0.f406611a;
        }
    }

    /* compiled from: B2bBusinessSelectItemsScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.btob_business_trip.screens.selectItemScreen.a$b */
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC13157a, G0> f108132l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l<? super InterfaceC13157a, G0> lVar) {
            super(0);
            this.f108132l = lVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f108132l.invoke(InterfaceC13157a.d.f1642a);
            return G0.f406611a;
        }
    }

    /* compiled from: B2bBusinessSelectItemsScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.btob_business_trip.screens.selectItemScreen.a$c */
    public static final class c extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Bk.c f108133l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<Bk.b> f108134m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC13157a, G0> f108135n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Bk.c cVar, InterfaceC43160i<? extends Bk.b> interfaceC43160i, Y41.l<? super InterfaceC13157a, G0> lVar, int i12) {
            super(2);
            this.f108133l = cVar;
            this.f108134m = interfaceC43160i;
            this.f108135n = lVar;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(73);
            Y41.l<InterfaceC13157a, G0> lVar = this.f108135n;
            C28901a.a(this.f108133l, this.f108134m, lVar, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: B2bBusinessSelectItemsScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.btob_business_trip.screens.selectItemScreen.B2bBusinessSelectItemsScreenKt$SelectContentState$1", f = "B2bBusinessSelectItemsScreen.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.btob_business_trip.screens.selectItemScreen.a$d */
    public static final class d extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f108136q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<Bk.b> f108137r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f108138s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ J f108139t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f108140u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f108141v;

        /* compiled from: B2bBusinessSelectItemsScreen.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LBk/b;", "event", "Lkotlin/G0;", "emit", "(LBk/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.btob_business_trip.screens.selectItemScreen.a$d$a, reason: collision with other inner class name */
        public static final class C3235a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.akita.compose.component.toast_bar.u f108142b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ J f108143c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f108144d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22204y1 f108145e;

            /* compiled from: B2bBusinessSelectItemsScreen.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.btob_business_trip.screens.selectItemScreen.B2bBusinessSelectItemsScreenKt$SelectContentState$1$1", f = "B2bBusinessSelectItemsScreen.kt", i = {0}, l = {110}, m = "emit", n = {"this"}, s = {"L$0"})
            /* renamed from: com.avito.android.btob_business_trip.screens.selectItemScreen.a$d$a$a, reason: collision with other inner class name */
            public static final class C3236a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public Object f108146q;

                /* renamed from: r, reason: collision with root package name */
                public /* synthetic */ Object f108147r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ C3235a<T> f108148s;

                /* renamed from: t, reason: collision with root package name */
                public int f108149t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C3236a(C3235a<? super T> c3235a, Continuation<? super C3236a> continuation) {
                    super(continuation);
                    this.f108148s = c3235a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f108147r = obj;
                    this.f108149t |= BeduinInputModel.MIN_TEXT_VERSION;
                    return this.f108148s.emit(null, this);
                }
            }

            public C3235a(com.akita.compose.component.toast_bar.u uVar, J j12, String str, InterfaceC22204y1 interfaceC22204y1) {
                this.f108142b = uVar;
                this.f108143c = j12;
                this.f108144d = str;
                this.f108145e = interfaceC22204y1;
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(@Y61.k Bk.b r11, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r12) {
                /*
                    r10 = this;
                    boolean r0 = r12 instanceof com.avito.android.btob_business_trip.screens.selectItemScreen.C28901a.d.C3235a.C3236a
                    if (r0 == 0) goto L14
                    r0 = r12
                    com.avito.android.btob_business_trip.screens.selectItemScreen.a$d$a$a r0 = (com.avito.android.btob_business_trip.screens.selectItemScreen.C28901a.d.C3235a.C3236a) r0
                    int r1 = r0.f108149t
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L14
                    int r1 = r1 - r2
                    r0.f108149t = r1
                L12:
                    r8 = r0
                    goto L1a
                L14:
                    com.avito.android.btob_business_trip.screens.selectItemScreen.a$d$a$a r0 = new com.avito.android.btob_business_trip.screens.selectItemScreen.a$d$a$a
                    r0.<init>(r10, r12)
                    goto L12
                L1a:
                    java.lang.Object r12 = r8.f108147r
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r8.f108149t
                    r2 = 1
                    if (r1 == 0) goto L37
                    if (r1 != r2) goto L2f
                    java.lang.Object r11 = r8.f108146q
                    com.avito.android.btob_business_trip.screens.selectItemScreen.a$d$a r11 = (com.avito.android.btob_business_trip.screens.selectItemScreen.C28901a.d.C3235a) r11
                    kotlin.C42729a0.b(r12)
                    goto L5b
                L2f:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r12)
                    throw r11
                L37:
                    kotlin.C42729a0.b(r12)
                    boolean r12 = r11 instanceof Bk.b.e
                    if (r12 == 0) goto L72
                    Bk.b$e r11 = (Bk.b.e) r11
                    java.lang.String r3 = r11.f1649a
                    com.akita.compose.component.toast_bar.ToastBarPosition r6 = com.akita.compose.component.toast_bar.ToastBarPosition.f63236c
                    com.akita.compose.component.toast_bar.ToastBarDuration r5 = com.akita.compose.component.toast_bar.ToastBarDuration.f63231c
                    r8.f108146q = r10
                    r8.f108149t = r2
                    r7 = 0
                    r9 = 148(0x94, float:2.07E-43)
                    com.akita.compose.component.toast_bar.u r1 = r10.f108142b
                    com.akita.compose.component.toast_bar.J r2 = r10.f108143c
                    java.lang.String r4 = r10.f108144d
                    java.lang.Object r12 = com.akita.compose.component.toast_bar.u.b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                    if (r12 != r0) goto L5a
                    return r0
                L5a:
                    r11 = r10
                L5b:
                    com.akita.compose.component.toast_bar.I r12 = (com.akita.compose.component.toast_bar.I) r12
                    com.akita.compose.component.toast_bar.I$d r0 = com.akita.compose.component.toast_bar.I.d.f63214a
                    boolean r12 = kotlin.jvm.internal.L.f(r12, r0)
                    if (r12 == 0) goto L72
                    androidx.compose.runtime.y1 r11 = r11.f108145e
                    java.lang.Object r11 = r11.getF42167b()
                    Y41.l r11 = (Y41.l) r11
                    Bk.a$c r12 = Bk.InterfaceC13157a.c.f1641a
                    r11.invoke(r12)
                L72:
                    kotlin.G0 r11 = kotlin.G0.f406611a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.btob_business_trip.screens.selectItemScreen.C28901a.d.C3235a.emit(Bk.b, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC43160i interfaceC43160i, com.akita.compose.component.toast_bar.u uVar, J j12, String str, InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
            super(2, continuation);
            this.f108137r = interfaceC43160i;
            this.f108138s = uVar;
            this.f108139t = j12;
            this.f108140u = str;
            this.f108141v = interfaceC22204y1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            InterfaceC22204y1 interfaceC22204y1 = this.f108141v;
            return new d(this.f108137r, this.f108138s, this.f108139t, this.f108140u, interfaceC22204y1, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f108136q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C3235a c3235a = new C3235a(this.f108138s, this.f108139t, this.f108140u, this.f108141v);
                this.f108136q = 1;
                if (this.f108137r.collect(c3235a, this) == coroutine_suspended) {
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

    /* compiled from: B2bBusinessSelectItemsScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.btob_business_trip.screens.selectItemScreen.a$e */
    public static final class e extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC13157a, G0> f108150l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Y41.l<? super InterfaceC13157a, G0> lVar) {
            super(2);
            this.f108150l = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
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
                goto L66
            L19:
                androidx.compose.runtime.J3 r9 = com.akita.compose.component.navbar.v.f62301a
                java.lang.Object r9 = r5.o(r9)
                com.akita.compose.component.navbar.u r9 = (com.akita.compose.component.navbar.u) r9
                com.akita.compose.theme.re23.b r10 = com.akita.compose.theme.re23.b.f63983a
                r10.getClass()
                com.akita.compose.theme.re23.e r10 = com.akita.compose.theme.re23.b.f63985c
                r10.getClass()
                int r10 = com.akita.compose.theme.re23.e.f64233O
                r0 = 0
                r1 = 1791(0x6ff, float:2.51E-42)
                com.akita.compose.component.navbar.u r1 = com.akita.compose.component.navbar.u.a(r9, r0, r10, r1)
                r9 = 1755066691(0x689c3143, float:5.900783E24)
                r5.C(r9)
                Y41.l<Bk.a, kotlin.G0> r9 = r8.f108150l
                boolean r10 = r5.B(r9)
                java.lang.Object r0 = r5.t()
                if (r10 != 0) goto L4f
                androidx.compose.runtime.A$a r10 = androidx.compose.runtime.A.f37866a
                r10.getClass()
                androidx.compose.runtime.A$a$a r10 = androidx.compose.runtime.A.a.f37868b
                if (r0 != r10) goto L57
            L4f:
                com.avito.android.btob_business_trip.screens.selectItemScreen.q r0 = new com.avito.android.btob_business_trip.screens.selectItemScreen.q
                r0.<init>(r9)
                r5.H(r0)
            L57:
                r3 = r0
                Y41.a r3 = (Y41.a) r3
                r5.h()
                r6 = 0
                r7 = 21
                r0 = 0
                r2 = 0
                r4 = 0
                com.akita.compose.component.navbar.t.b(r0, r1, r2, r3, r4, r5, r6, r7)
            L66:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.btob_business_trip.screens.selectItemScreen.C28901a.e.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: B2bBusinessSelectItemsScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.btob_business_trip.screens.selectItemScreen.a$f */
    public static final class f extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f108151l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ c.b.C0071b f108152m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ AttributedText f108153n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC13157a, G0> f108154o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(int i12, c.b.C0071b c0071b, AttributedText attributedText, Y41.l<? super InterfaceC13157a, G0> lVar) {
            super(2);
            this.f108151l = i12;
            this.f108152m = c0071b;
            this.f108153n = attributedText;
            this.f108154o = lVar;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                v.a aVar = androidx.compose.ui.v.f42878y1;
                com.akita.compose.theme.re23.b.f63983a.getClass();
                long jC2 = com.akita.compose.theme.re23.b.f63984b.f63851H1.c(a13);
                float f12 = 20;
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                androidx.compose.ui.v vVarB = androidx.compose.foundation.A.b(aVar, jC2, androidx.compose.foundation.shape.o.c(f12, f12, 0.0f, 0.0f, 12));
                float f13 = 8;
                float f14 = 16;
                androidx.compose.ui.v vVarL = R1.l(vVarB, f14, f13, f14, f13);
                C20585k.f28659a.getClass();
                C20585k.l lVar = C20585k.f28662d;
                InterfaceC22215f.f39074a.getClass();
                I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, a13, 0);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarL);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar3);
                } else {
                    a13.d();
                }
                R3.b(InterfaceC22413h.a.f40796g, a13, iA2);
                R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                    androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
                }
                R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                K k12 = K.f28344a;
                boolean z12 = this.f108151l > 0;
                c.b.C0071b c0071b = this.f108152m;
                boolean z13 = c0071b.f1666g;
                com.akita.compose.component.button.t tVarF2 = com.akita.compose.theme.re23.b.c(a13).f2();
                androidx.compose.ui.v vVarD = C20588k2.d(aVar, 1.0f);
                Y41.l<InterfaceC13157a, G0> lVar2 = this.f108154o;
                com.akita.compose.component.button.m.c(c0071b.f1662c, new r(c0071b, lVar2), tVarF2, vVarD, null, null, null, z13, z12, null, a13, 3584, 624);
                androidx.compose.ui.v vVarK = R1.k(0.0f, 12, 1, aVar);
                s sVar = s.f108241l;
                AttributedText attributedText = this.f108153n;
                com.avito.android.lib.compose.design.component.attributedtext.a.b(attributedText, vVarK, R.attr.textS20, sVar, new u(lVar2, attributedText), 0, a13, 3128, 32);
                a13.z();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: B2bBusinessSelectItemsScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "innerPadding", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.btob_business_trip.screens.selectItemScreen.a$g */
    public static final class g extends N implements Y41.q<T1, androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ c.b.C0071b f108155l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC13157a, G0> f108156m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(c.b.C0071b c0071b, Y41.l<? super InterfaceC13157a, G0> lVar) {
            super(3);
            this.f108155l = c0071b;
            this.f108156m = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
        @Override // Y41.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.foundation.layout.T1 r5, androidx.compose.runtime.A r6, java.lang.Integer r7) {
            /*
                r4 = this;
                androidx.compose.foundation.layout.T1 r5 = (androidx.compose.foundation.layout.T1) r5
                androidx.compose.runtime.A r6 = (androidx.compose.runtime.A) r6
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r7.intValue()
                r0 = r7 & 14
                if (r0 != 0) goto L18
                boolean r0 = r6.B(r5)
                if (r0 == 0) goto L16
                r0 = 4
                goto L17
            L16:
                r0 = 2
            L17:
                r7 = r7 | r0
            L18:
                r7 = r7 & 91
                r0 = 18
                if (r7 != r0) goto L2a
                boolean r7 = r6.c()
                if (r7 != 0) goto L25
                goto L2a
            L25:
                r6.f()
                goto Lc1
            L2a:
                androidx.compose.ui.v$a r7 = androidx.compose.ui.v.f42878y1
                androidx.compose.ui.v r5 = androidx.compose.foundation.layout.R1.h(r7, r5)
                androidx.compose.ui.f$a r7 = androidx.compose.ui.InterfaceC22215f.f39074a
                r7.getClass()
                androidx.compose.ui.i r7 = androidx.compose.ui.InterfaceC22215f.a.f39076b
                r0 = 0
                androidx.compose.ui.layout.i0 r7 = androidx.compose.foundation.layout.C20632w.d(r7, r0)
                int r0 = r6.getF37888Q()
                androidx.compose.runtime.O1 r1 = r6.y()
                androidx.compose.ui.v r5 = androidx.compose.ui.n.c(r6, r5)
                androidx.compose.ui.node.h$a r2 = androidx.compose.ui.node.InterfaceC22413h.f40789C1
                r2.getClass()
                Y41.a<androidx.compose.ui.node.h> r2 = androidx.compose.ui.node.InterfaceC22413h.a.f40791b
                androidx.compose.runtime.i r3 = r6.F()
                if (r3 == 0) goto Lc4
                r6.A()
                boolean r3 = r6.getF37887P()
                if (r3 == 0) goto L62
                r6.b(r2)
                goto L65
            L62:
                r6.d()
            L65:
                Y41.p<androidx.compose.ui.node.h, androidx.compose.ui.layout.i0, kotlin.G0> r2 = androidx.compose.ui.node.InterfaceC22413h.a.f40796g
                androidx.compose.runtime.R3.b(r2, r6, r7)
                Y41.p<androidx.compose.ui.node.h, androidx.compose.runtime.U, kotlin.G0> r7 = androidx.compose.ui.node.InterfaceC22413h.a.f40795f
                androidx.compose.runtime.R3.b(r7, r6, r1)
                Y41.p<androidx.compose.ui.node.h, java.lang.Integer, kotlin.G0> r7 = androidx.compose.ui.node.InterfaceC22413h.a.f40799j
                boolean r1 = r6.getF37887P()
                if (r1 != 0) goto L85
                java.lang.Object r1 = r6.t()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
                boolean r1 = kotlin.jvm.internal.L.f(r1, r2)
                if (r1 != 0) goto L88
            L85:
                androidx.appcompat.app.r.B(r0, r6, r0, r7)
            L88:
                Y41.p<androidx.compose.ui.node.h, androidx.compose.ui.v, kotlin.G0> r7 = androidx.compose.ui.node.InterfaceC22413h.a.f40793d
                androidx.compose.runtime.R3.b(r7, r6, r5)
                androidx.compose.foundation.layout.z r5 = androidx.compose.foundation.layout.C20644z.f28804a
                r5 = -305005003(0xffffffffedd1fe35, float:-8.1237106E27)
                r6.C(r5)
                Y41.l<Bk.a, kotlin.G0> r5 = r4.f108156m
                boolean r7 = r6.B(r5)
                java.lang.Object r0 = r6.t()
                if (r7 != 0) goto Laa
                androidx.compose.runtime.A$a r7 = androidx.compose.runtime.A.f37866a
                r7.getClass()
                androidx.compose.runtime.A$a$a r7 = androidx.compose.runtime.A.a.f37868b
                if (r0 != r7) goto Lb2
            Laa:
                com.avito.android.btob_business_trip.screens.selectItemScreen.v r0 = new com.avito.android.btob_business_trip.screens.selectItemScreen.v
                r0.<init>(r5)
                r6.H(r0)
            Lb2:
                Y41.p r0 = (Y41.p) r0
                r6.h()
                r5 = 8
                Bk.c$b$b r7 = r4.f108155l
                com.avito.android.btob_business_trip.screens.selectItemScreen.C28901a.d(r7, r0, r6, r5)
                r6.z()
            Lc1:
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            Lc4:
                androidx.compose.runtime.C22190v.b()
                r5 = 0
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.btob_business_trip.screens.selectItemScreen.C28901a.g.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: B2bBusinessSelectItemsScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.btob_business_trip.screens.selectItemScreen.a$h */
    public static final class h extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ c.b.C0071b f108157l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<Bk.b> f108158m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC13157a, G0> f108159n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f108160o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f108161p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(c.b.C0071b c0071b, InterfaceC43160i<? extends Bk.b> interfaceC43160i, Y41.l<? super InterfaceC13157a, G0> lVar, int i12, int i13) {
            super(2);
            this.f108157l = c0071b;
            this.f108158m = interfaceC43160i;
            this.f108159n = lVar;
            this.f108160o = i12;
            this.f108161p = i13;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            C28901a.c(this.f108157l, this.f108158m, this.f108159n, this.f108160o, a12, C22066f2.a(this.f108161p | 1));
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k Bk.c r7, @Y61.k kotlinx.coroutines.flow.InterfaceC43160i<? extends Bk.b> r8, @Y61.k Y41.l<? super Bk.InterfaceC13157a, kotlin.G0> r9, @Y61.l androidx.compose.runtime.A r10, int r11) {
        /*
            r0 = 1480210636(0x583a38cc, float:8.190124E14)
            androidx.compose.runtime.B r10 = r10.E(r0)
            Bk.c$b r0 = r7.f1653b
            boolean r1 = r0 instanceof Bk.c.b.C0071b
            if (r1 == 0) goto L89
            com.avito.android.btob_business_trip.models.SuccessScreenInfo r1 = r7.f1658g
            if (r1 == 0) goto L14
            com.avito.android.remote.model.UniversalImage r1 = r1.f107874d
            goto L15
        L14:
            r1 = 0
        L15:
            r2 = -1670317012(0xffffffff9c70fc2c, float:-7.9735263E-22)
            r10.C(r2)
            r2 = 0
            androidx.compose.runtime.A$a r3 = androidx.compose.runtime.A.f37866a
            r4 = 1
            if (r1 != 0) goto L22
            goto L4d
        L22:
            r5 = -1853390094(0xffffffff918782f2, float:-2.1379946E-28)
            r10.C(r5)
            boolean r5 = r10.B(r9)
            java.lang.Object r6 = r10.t()
            if (r5 != 0) goto L39
            r3.getClass()
            androidx.compose.runtime.A$a$a r5 = androidx.compose.runtime.A.a.f37868b
            if (r6 != r5) goto L41
        L39:
            com.avito.android.btob_business_trip.screens.selectItemScreen.a$a r6 = new com.avito.android.btob_business_trip.screens.selectItemScreen.a$a
            r6.<init>(r9)
            r10.H(r6)
        L41:
            Y41.a r6 = (Y41.a) r6
            r10.X(r2)
            r5 = 440(0x1b8, float:6.17E-43)
            b(r1, r6, r10, r5)
            kotlin.G0 r1 = kotlin.G0.f406611a
        L4d:
            r10.X(r2)
            r1 = -1670307318(0xffffffff9c71220a, float:-7.9784206E-22)
            r10.C(r1)
            boolean r1 = r10.B(r9)
            java.lang.Object r5 = r10.t()
            if (r1 != 0) goto L67
            r3.getClass()
            androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
            if (r5 != r1) goto L6f
        L67:
            com.avito.android.btob_business_trip.screens.selectItemScreen.a$b r5 = new com.avito.android.btob_business_trip.screens.selectItemScreen.a$b
            r5.<init>(r9)
            r10.H(r5)
        L6f:
            Y41.a r5 = (Y41.a) r5
            r10.X(r2)
            androidx.view.compose.h.a(r2, r5, r10, r2, r4)
            r1 = r0
            Bk.c$b$b r1 = (Bk.c.b.C0071b) r1
            java.util.List<java.lang.Long> r0 = r7.f1655d
            int r4 = r0.size()
            r6 = 72
            r2 = r8
            r3 = r9
            r5 = r10
            c(r1, r2, r3, r4, r5, r6)
            goto L8e
        L89:
            Bk.c$b$a r1 = Bk.c.b.a.f1659a
            kotlin.jvm.internal.L.f(r0, r1)
        L8e:
            androidx.compose.runtime.c2 r10 = r10.Z()
            if (r10 == 0) goto L9b
            com.avito.android.btob_business_trip.screens.selectItemScreen.a$c r0 = new com.avito.android.btob_business_trip.screens.selectItemScreen.a$c
            r0.<init>(r7, r8, r9, r11)
            r10.f38184d = r0
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.btob_business_trip.screens.selectItemScreen.C28901a.a(Bk.c, kotlinx.coroutines.flow.i, Y41.l, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    public static final void b(@Y61.k UniversalImage universalImage, @Y61.k Y41.a aVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(1044707597);
        Context context = (Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b);
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) bE2.o(Q0.f41199h);
        Image imageDependsOnTheme = UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(context));
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        Uri uriC = C35829k2.b(imageDependsOnTheme, kotlin.math.b.b(dVar.M0(343)), kotlin.math.b.b(dVar.M0(210)), 0.0f, 1, 44).c(com.avito.android.btob_business_trip.screens.selectItemScreen.f.f108185b);
        p.a aVar3 = new p.a(context);
        aVar3.f58691c = uriC;
        aVar3.f58693e = new com.avito.android.btob_business_trip.screens.selectItemScreen.d(aVar, aVar, aVar);
        coil.d.a(context).b(aVar3.a());
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new com.avito.android.btob_business_trip.screens.selectItemScreen.e(universalImage, aVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(c.b.C0071b c0071b, InterfaceC43160i<? extends Bk.b> interfaceC43160i, Y41.l<? super InterfaceC13157a, G0> lVar, int i12, androidx.compose.runtime.A a12, int i13) {
        androidx.compose.runtime.B bE2 = a12.E(419849070);
        com.akita.compose.component.toast_bar.u uVarA = com.akita.compose.component.toast_bar.w.a(bE2);
        J jP2 = com.avito.android.actions_sheet.a.p(com.akita.compose.theme.re23.b.f63983a, bE2);
        String strC = u0.i.c(bE2, R.string.btob_business_trip_toast_button_title);
        InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(lVar, bE2);
        AttributedText attributedText = c0071b.f1664e;
        C22187u0.d(new d(interfaceC43160i, uVarA, jP2, strC, interfaceC22204y1M, null), bE2, interfaceC43160i);
        com.akita.compose.component.scaffold.g.a(null, androidx.compose.runtime.internal.r.c(1150417450, new e(lVar), bE2), androidx.compose.runtime.internal.r.c(1912298761, new f(i12, c0071b, attributedText, lVar), bE2), uVarA, null, null, null, androidx.compose.runtime.internal.r.c(1234474817, new g(c0071b, lVar), bE2), bE2, 12583344, 113);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new h(c0071b, interfaceC43160i, lVar, i12, i13);
        }
    }

    public static final void d(c.b.C0071b c0071b, Y41.p pVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-101700744);
        v.a aVar = androidx.compose.ui.v.f42878y1;
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        C20650b.a(R1.k(16, 0.0f, 2, aVar), null, null, false, null, null, null, false, null, new o(c0071b, pVar), bE2, 6, 510);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new p(c0071b, pVar, i12);
        }
    }
}
