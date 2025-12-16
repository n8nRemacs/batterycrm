package com.avito.android.wallet.pin.impl.ui.components.pin_input;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.M1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.InterfaceC22276o0;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.v;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: WalletPinInput.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/graphics/T;", "backgroundColorState", "_avito_wallet-pin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h {

    /* compiled from: WalletPinInput.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.wallet.pin.impl.ui.components.pin_input.WalletPinInputKt$Pin$1$1", f = "WalletPinInput.kt", i = {}, l = {78, 80}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f329007q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.wallet.pin.impl.ui.components.pin_input.a f329008r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.wallet.pin.impl.ui.components.pin_input.b f329009s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.wallet.pin.impl.ui.components.pin_input.a aVar, com.avito.android.wallet.pin.impl.ui.components.pin_input.b bVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f329008r = aVar;
            this.f329009s = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new a(this.f329008r, this.f329009s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f329007q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.wallet.pin.impl.ui.components.pin_input.a aVar = com.avito.android.wallet.pin.impl.ui.components.pin_input.a.f328978c;
                com.avito.android.wallet.pin.impl.ui.components.pin_input.a aVar2 = this.f329008r;
                com.avito.android.wallet.pin.impl.ui.components.pin_input.b bVar = this.f329009s;
                if (aVar2 == aVar) {
                    this.f329007q = 1;
                    int i13 = com.avito.android.wallet.pin.impl.ui.components.pin_input.b.f328983b;
                    if (bVar.a(1500.0f, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (aVar2 == com.avito.android.wallet.pin.impl.ui.components.pin_input.a.f328980e) {
                    this.f329007q = 2;
                    if (bVar.a(200.0f, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: WalletPinInput.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/o0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/o0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<InterfaceC22276o0, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.wallet.pin.impl.ui.components.pin_input.b f329010l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.wallet.pin.impl.ui.components.pin_input.b bVar) {
            super(1);
            this.f329010l = bVar;
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC22276o0 interfaceC22276o0) {
            InterfaceC22276o0 interfaceC22276o02 = interfaceC22276o0;
            com.avito.android.wallet.pin.impl.ui.components.pin_input.b bVar = this.f329010l;
            interfaceC22276o02.j(bVar.f328984a.f().floatValue());
            interfaceC22276o02.k(bVar.f328984a.f().floatValue());
            return G0.f406611a;
        }
    }

    /* compiled from: WalletPinInput.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ I3<androidx.compose.ui.graphics.T> f329011l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(I3<androidx.compose.ui.graphics.T> i32) {
            super(1);
            this.f329011l = i32;
        }

        @Override // Y41.l
        public final G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
            androidx.compose.ui.graphics.drawscope.g.U(gVar, this.f329011l.getF42167b().f39331a, 0.0f, 0L, 0.0f, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
            return G0.f406611a;
        }
    }

    /* compiled from: WalletPinInput.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.wallet.pin.impl.ui.components.pin_input.a f329012l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.wallet.pin.impl.ui.components.pin_input.b f329013m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.avito.android.wallet.pin.impl.ui.components.pin_input.a aVar, com.avito.android.wallet.pin.impl.ui.components.pin_input.b bVar, int i12) {
            super(2);
            this.f329012l = aVar;
            this.f329013m = bVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(49);
            h.a(this.f329012l, this.f329013m, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: WalletPinInput.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/unit/d;", "Landroidx/compose/ui/unit/q;", "invoke-Bjo55l4", "(Landroidx/compose/ui/unit/d;)J", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<androidx.compose.ui.unit.d, q> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.wallet.pin.impl.ui.components.pin_input.f f329014l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.avito.android.wallet.pin.impl.ui.components.pin_input.f fVar) {
            super(1);
            this.f329014l = fVar;
        }

        @Override // Y41.l
        public final q invoke(androidx.compose.ui.unit.d dVar) {
            float fFloatValue = this.f329014l.f328999b.f().floatValue();
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            return q.a((dVar.y0(fFloatValue) << 32) | (0 & 4294967295L));
        }
    }

    /* compiled from: WalletPinInput.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.wallet.pin.impl.ui.components.pin_input.WalletPinInputKt$WalletPinInput$2$1", f = "WalletPinInput.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f329015q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.wallet.pin.impl.ui.components.pin_input.f f329016r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ T f329017s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.wallet.pin.impl.ui.components.pin_input.b f329018t;

        /* compiled from: WalletPinInput.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.wallet.pin.impl.ui.components.pin_input.WalletPinInputKt$WalletPinInput$2$1$1", f = "WalletPinInput.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f329019q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.wallet.pin.impl.ui.components.pin_input.b f329020r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.avito.android.wallet.pin.impl.ui.components.pin_input.b bVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f329020r = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new a(this.f329020r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f329019q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    this.f329019q = 1;
                    if (this.f329020r.a(400.0f, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i12, com.avito.android.wallet.pin.impl.ui.components.pin_input.f fVar, T t12, com.avito.android.wallet.pin.impl.ui.components.pin_input.b bVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f329015q = i12;
            this.f329016r = fVar;
            this.f329017s = t12;
            this.f329018t = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new f(this.f329015q, this.f329016r, this.f329017s, this.f329018t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            if (this.f329015q == ((Number) this.f329016r.f329003f.getF42167b()).intValue()) {
                C43259k.d(this.f329017s, null, null, new a(this.f329018t, null), 3);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: WalletPinInput.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f329021l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f329022m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.wallet.pin.impl.ui.components.pin_input.f f329023n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i12, int i13, com.avito.android.wallet.pin.impl.ui.components.pin_input.f fVar, int i14) {
            super(2);
            this.f329021l = i12;
            this.f329022m = i13;
            this.f329023n = fVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            com.avito.android.wallet.pin.impl.ui.components.pin_input.f fVar = this.f329023n;
            h.b(this.f329021l, this.f329022m, fVar, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: WalletPinInput.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.wallet.pin.impl.ui.components.pin_input.h$h, reason: collision with other inner class name */
    public /* synthetic */ class C10213h {
        static {
            int[] iArr = new int[com.avito.android.wallet.pin.impl.ui.components.pin_input.a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                com.avito.android.wallet.pin.impl.ui.components.pin_input.a aVar = com.avito.android.wallet.pin.impl.ui.components.pin_input.a.f328977b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                com.avito.android.wallet.pin.impl.ui.components.pin_input.a aVar2 = com.avito.android.wallet.pin.impl.ui.components.pin_input.a.f328977b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                com.avito.android.wallet.pin.impl.ui.components.pin_input.a aVar3 = com.avito.android.wallet.pin.impl.ui.components.pin_input.a.f328977b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010f  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.avito.android.wallet.pin.impl.ui.components.pin_input.a r9, com.avito.android.wallet.pin.impl.ui.components.pin_input.b r10, androidx.compose.runtime.A r11, int r12) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.wallet.pin.impl.ui.components.pin_input.h.a(com.avito.android.wallet.pin.impl.ui.components.pin_input.a, com.avito.android.wallet.pin.impl.ui.components.pin_input.b, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(int i12, int i13, @k com.avito.android.wallet.pin.impl.ui.components.pin_input.f fVar, @l A a12, int i14) {
        B bE2 = a12.E(1335017044);
        int i15 = (bE2.m(i12) ? 4 : 2) | i14 | (bE2.m(i13) ? 32 : 16) | (bE2.B(fVar) ? 256 : 128);
        if ((i15 & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            Object objT = bE2.t();
            A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = C22187u0.h(EmptyCoroutineContext.INSTANCE, bE2);
                bE2.H(objT);
            }
            T t12 = (T) objT;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            v vVarF = C20588k2.f(v.f42878y1, 16);
            bE2.C(-1575567255);
            boolean z12 = false;
            boolean z13 = (i15 & 896) == 256;
            Object objT2 = bE2.t();
            if (z13 || objT2 == c1651a) {
                objT2 = new e(fVar);
                bE2.H(objT2);
            }
            bE2.X(false);
            v vVarA = M1.a(vVarF, (Y41.l) objT2);
            C20585k.f28659a.getClass();
            C20585k.j jVarG = C20585k.g(20);
            InterfaceC22215f.f39074a.getClass();
            C20568f2 c20568f2A = C20563e2.a(jVarG, InterfaceC22215f.a.f39086l, bE2, 54);
            int i16 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, vVarA);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i16))) {
                AK.c.y(i16, bE2, i16, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            bE2.C(2077118262);
            int i17 = 0;
            while (i17 < i12) {
                bE2.C(2077119626);
                Object objT3 = bE2.t();
                if (objT3 == A.a.f37868b) {
                    objT3 = new com.avito.android.wallet.pin.impl.ui.components.pin_input.b();
                    bE2.H(objT3);
                }
                com.avito.android.wallet.pin.impl.ui.components.pin_input.b bVar = (com.avito.android.wallet.pin.impl.ui.components.pin_input.b) objT3;
                bE2.X(z12);
                C22187u0.d(new f(i17, fVar, t12, bVar, null), bE2, Integer.valueOf(((Number) fVar.f329003f.getF42167b()).intValue()));
                a(((Boolean) ((C22082i3) fVar.f329000c).getF42167b()).booleanValue() ? com.avito.android.wallet.pin.impl.ui.components.pin_input.a.f328979d : ((Boolean) ((C22082i3) fVar.f329001d).getF42167b()).booleanValue() ? com.avito.android.wallet.pin.impl.ui.components.pin_input.a.f328980e : i17 < i13 ? com.avito.android.wallet.pin.impl.ui.components.pin_input.a.f328978c : com.avito.android.wallet.pin.impl.ui.components.pin_input.a.f328977b, bVar, bE2, 48);
                i17++;
                z12 = false;
            }
            bE2.X(z12);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new g(i12, i13, fVar, i14);
        }
    }
}
