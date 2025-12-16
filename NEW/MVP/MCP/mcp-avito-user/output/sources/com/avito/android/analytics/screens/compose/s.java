package com.avito.android.analytics.screens.compose;

import androidx.compose.foundation.gestures.U1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22128n0;
import androidx.compose.runtime.InterfaceC22118l0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import java.util.UUID;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ScrollableTracker.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_analytics-screens-compose_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class s {

    /* compiled from: ScrollableTracker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/U1;", "T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.analytics.screens.compose.ScrollableTrackerKt$ScrollableTrackerEffect$1", f = "ScrollableTracker.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f90598q;

        /* renamed from: r, reason: collision with root package name */
        /* JADX INFO: Incorrect field signature: TT; */
        public final /* synthetic */ U1 f90599r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ r f90600s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ UUID f90601t;

        /* compiled from: ScrollableTracker.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/U1;", "T", "", "invoke", "()Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.analytics.screens.compose.s$a$a, reason: collision with other inner class name */
        public static final class C2678a extends N implements Y41.a<Boolean> {

            /* renamed from: l, reason: collision with root package name */
            /* JADX INFO: Incorrect field signature: TT; */
            public final /* synthetic */ U1 f90602l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: (TT;)V */
            public C2678a(U1 u12) {
                super(0);
                this.f90602l = u12;
            }

            @Override // Y41.a
            public final Boolean invoke() {
                return Boolean.valueOf(this.f90602l.a());
            }
        }

        /* compiled from: ScrollableTracker.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/foundation/gestures/U1;", "T", "", "scrolling", "Lkotlin/G0;", "emit", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f90603b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ UUID f90604c;

            public b(r rVar, UUID uuid) {
                this.f90603b = rVar;
                this.f90604c = uuid;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                this.f90603b.b(((Boolean) obj).booleanValue(), this.f90604c);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (TT;Lcom/avito/android/analytics/screens/compose/r;Ljava/util/UUID;Lkotlin/coroutines/Continuation<-Lcom/avito/android/analytics/screens/compose/s$a;>;)V */
        public a(U1 u12, r rVar, UUID uuid, Continuation continuation) {
            super(2, continuation);
            this.f90599r = u12;
            this.f90600s = rVar;
            this.f90601t = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f90599r, this.f90600s, this.f90601t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f90598q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43160i interfaceC43160iN = C22126m3.n(new C2678a(this.f90599r));
                b bVar = new b(this.f90600s, this.f90601t);
                this.f90598q = 1;
                if (interfaceC43160iN.collect(bVar, this) == coroutine_suspended) {
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

    /* compiled from: ScrollableTracker.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/U1;", "T", "Landroidx/compose/runtime/n0;", "Landroidx/compose/runtime/l0;", "invoke", "(Landroidx/compose/runtime/n0;)Landroidx/compose/runtime/l0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<C22128n0, InterfaceC22118l0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ r f90605l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ UUID f90606m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r rVar, UUID uuid) {
            super(1);
            this.f90605l = rVar;
            this.f90606m = uuid;
        }

        @Override // Y41.l
        public final InterfaceC22118l0 invoke(C22128n0 c22128n0) {
            return new t(this.f90605l, this.f90606m);
        }
    }

    /* compiled from: ScrollableTracker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        /* JADX INFO: Incorrect field signature: TT; */
        public final /* synthetic */ U1 f90607l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (TT;I)V */
        public c(U1 u12, int i12) {
            super(2);
            this.f90607l = u12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            s.a(this.f90607l, a12, iA2);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    @androidx.compose.runtime.InterfaceC22132o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends androidx.compose.foundation.gestures.U1> void a(T r4, androidx.compose.runtime.A r5, int r6) {
        /*
            r0 = 381389661(0x16bb8b5d, float:3.029943E-25)
            androidx.compose.runtime.B r5 = r5.E(r0)
            boolean r0 = r5.B(r4)
            r1 = 2
            if (r0 == 0) goto L10
            r0 = 4
            goto L11
        L10:
            r0 = r1
        L11:
            r0 = r0 | r6
            r0 = r0 & 11
            if (r0 != r1) goto L21
            boolean r0 = r5.c()
            if (r0 != 0) goto L1d
            goto L21
        L1d:
            r5.f()
            goto L87
        L21:
            androidx.compose.runtime.J3 r0 = com.avito.android.analytics.screens.compose.c.f90576a
            java.lang.Object r0 = r5.o(r0)
            com.avito.android.analytics.screens.compose.a r0 = (com.avito.android.analytics.screens.compose.a) r0
            r1 = 1753320452(0x68818c04, float:4.894145E24)
            r5.C(r1)
            r1 = 1013667094(0x3c6b5516, float:0.014363548)
            r5.C(r1)
            boolean r1 = r5.B(r0)
            java.lang.Object r2 = r5.t()
            androidx.compose.runtime.A$a r3 = androidx.compose.runtime.A.f37866a
            if (r1 != 0) goto L48
            r3.getClass()
            androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
            if (r2 != r1) goto L50
        L48:
            com.avito.android.analytics.screens.compose.r r2 = new com.avito.android.analytics.screens.compose.r
            r2.<init>(r0)
            r5.H(r2)
        L50:
            com.avito.android.analytics.screens.compose.r r2 = (com.avito.android.analytics.screens.compose.r) r2
            r0 = 0
            r5.X(r0)
            r5.X(r0)
            r1 = 1384405866(0x52845b6a, float:2.8423468E11)
            r5.C(r1)
            java.lang.Object r1 = r5.t()
            r3.getClass()
            androidx.compose.runtime.A$a$a r3 = androidx.compose.runtime.A.a.f37868b
            if (r1 != r3) goto L71
            java.util.UUID r1 = java.util.UUID.randomUUID()
            r5.H(r1)
        L71:
            java.util.UUID r1 = (java.util.UUID) r1
            r5.X(r0)
            com.avito.android.analytics.screens.compose.s$a r0 = new com.avito.android.analytics.screens.compose.s$a
            r3 = 0
            r0.<init>(r4, r2, r1, r3)
            androidx.compose.runtime.C22187u0.e(r2, r4, r0, r5)
            com.avito.android.analytics.screens.compose.s$b r0 = new com.avito.android.analytics.screens.compose.s$b
            r0.<init>(r2, r1)
            androidx.compose.runtime.C22187u0.b(r2, r4, r0, r5)
        L87:
            androidx.compose.runtime.c2 r5 = r5.Z()
            if (r5 == 0) goto L94
            com.avito.android.analytics.screens.compose.s$c r0 = new com.avito.android.analytics.screens.compose.s$c
            r0.<init>(r4, r6)
            r5.f38184d = r0
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.analytics.screens.compose.s.a(androidx.compose.foundation.gestures.U1, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    @Y61.k
    @InterfaceC22137p
    public static final U1 b(@Y61.k Y41.p pVar, @Y61.l A a12) {
        a12.C(1870855745);
        U1 u12 = (U1) pVar.invoke(a12, 0);
        a(u12, a12, 0);
        a12.h();
        return u12;
    }
}
