package androidx.compose.material.ripple;

import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20274e;
import androidx.compose.animation.core.C20318t;
import androidx.compose.animation.core.G1;
import androidx.compose.animation.core.Q;
import androidx.compose.foundation.H;
import androidx.compose.foundation.interaction.a;
import androidx.compose.foundation.interaction.d;
import androidx.compose.foundation.interaction.g;
import androidx.compose.ui.graphics.S;
import androidx.compose.ui.graphics.drawscope.a;
import java.util.ArrayList;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: Ripple.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/ripple/B;", "", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class B {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f34040a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.a<l> f34041b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C20268c<Float, C20318t> f34042c = C20274e.a(0.0f);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ArrayList f34043d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public androidx.compose.foundation.interaction.j f34044e;

    /* compiled from: Ripple.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$1", f = "Ripple.kt", i = {}, l = {480}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f34045q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ float f34047s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ G1 f34048t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f12, G1 g12, Continuation continuation) {
            super(2, continuation);
            this.f34047s = f12;
            this.f34048t = g12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return B.this.new a(this.f34047s, this.f34048t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f34045q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C20268c<Float, C20318t> c20268c = B.this.f34042c;
                Float fBoxFloat = Boxing.boxFloat(this.f34047s);
                this.f34045q = 1;
                if (C20268c.c(c20268c, fBoxFloat, this.f34048t, null, null, this, 12) == coroutine_suspended) {
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

    /* compiled from: Ripple.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$2", f = "Ripple.kt", i = {}, l = {484}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f34049q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ G1 f34051s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(G1 g12, Continuation continuation) {
            super(2, continuation);
            this.f34051s = g12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return B.this.new b(this.f34051s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f34049q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C20268c<Float, C20318t> c20268c = B.this.f34042c;
                Float fBoxFloat = Boxing.boxFloat(0.0f);
                this.f34049q = 1;
                if (C20268c.c(c20268c, fBoxFloat, this.f34051s, null, null, this, 12) == coroutine_suspended) {
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

    public B(@Y61.k Y41.a aVar, boolean z12) {
        this.f34040a = z12;
        this.f34041b = aVar;
    }

    public final void a(@Y61.k androidx.compose.ui.graphics.drawscope.d dVar, float f12, long j12) {
        float fFloatValue = this.f34042c.f().floatValue();
        if (fFloatValue > 0.0f) {
            long jC2 = androidx.compose.ui.graphics.T.c(j12, fFloatValue);
            if (!this.f34040a) {
                androidx.compose.ui.graphics.drawscope.g.U(dVar, jC2, f12, 0L, 0.0f, null, 0, 124);
                return;
            }
            float fE2 = l0.n.e(dVar.i());
            float fC2 = l0.n.c(dVar.i());
            S.f39317b.getClass();
            int i12 = S.f39318c;
            a.b f39478c = dVar.getF39478c();
            long jE2 = f39478c.e();
            f39478c.a().k();
            try {
                f39478c.f39485a.b(0.0f, 0.0f, fE2, fC2, i12);
                androidx.compose.ui.graphics.drawscope.g.U(dVar, jC2, f12, 0L, 0.0f, null, 0, 124);
            } finally {
                H.C(f39478c, jE2);
            }
        }
    }

    public final void b(@Y61.k androidx.compose.foundation.interaction.j jVar, @Y61.k T t12) {
        boolean z12 = jVar instanceof g.a;
        ArrayList arrayList = this.f34043d;
        if (z12) {
            arrayList.add(jVar);
        } else if (jVar instanceof g.b) {
            arrayList.remove(((g.b) jVar).f28141a);
        } else if (jVar instanceof d.a) {
            arrayList.add(jVar);
        } else if (jVar instanceof d.b) {
            arrayList.remove(((d.b) jVar).f28135a);
        } else if (jVar instanceof a.b) {
            arrayList.add(jVar);
        } else if (jVar instanceof a.c) {
            arrayList.remove(((a.c) jVar).f28134a);
        } else if (!(jVar instanceof a.C1584a)) {
            return;
        } else {
            arrayList.remove(((a.C1584a) jVar).f28133a);
        }
        androidx.compose.foundation.interaction.j jVar2 = (androidx.compose.foundation.interaction.j) C42745f0.S(arrayList);
        if (L.f(this.f34044e, jVar2)) {
            return;
        }
        if (jVar2 != null) {
            l lVarInvoke = this.f34041b.invoke();
            float f12 = z12 ? lVarInvoke.f34099c : jVar instanceof d.a ? lVarInvoke.f34098b : jVar instanceof a.b ? lVarInvoke.f34097a : 0.0f;
            G1<Float> g12 = w.f34146a;
            boolean z13 = jVar2 instanceof g.a;
            G1<Float> g13 = w.f34146a;
            if (!z13 && ((jVar2 instanceof d.a) || (jVar2 instanceof a.b))) {
                g13 = new G1<>(45, 0, Q.f26124d, 2, null);
            }
            C43259k.d(t12, null, null, new a(f12, g13, null), 3);
        } else {
            androidx.compose.foundation.interaction.j jVar3 = this.f34044e;
            G1<Float> g14 = w.f34146a;
            boolean z14 = jVar3 instanceof g.a;
            G1<Float> g15 = w.f34146a;
            if (!z14 && !(jVar3 instanceof d.a) && (jVar3 instanceof a.b)) {
                g15 = new G1<>(150, 0, Q.f26124d, 2, null);
            }
            C43259k.d(t12, null, null, new b(g15, null), 3);
        }
        this.f34044e = jVar2;
    }
}
