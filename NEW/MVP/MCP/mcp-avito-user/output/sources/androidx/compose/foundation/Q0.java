package androidx.compose.foundation;

import androidx.compose.foundation.interaction.d;
import androidx.compose.foundation.interaction.g;
import androidx.compose.foundation.interaction.o;
import androidx.compose.ui.node.C22440v;
import androidx.compose.ui.node.InterfaceC22419k;
import androidx.compose.ui.node.InterfaceC22438u;
import androidx.compose.ui.v;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Indication.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/Q0;", "Landroidx/compose/foundation/v1;", "<init>", "()V", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class Q0 implements InterfaceC21084v1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Q0 f26822a = new Q0();

    /* compiled from: Indication.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/Q0$a;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/node/u;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends v.d implements InterfaceC22438u {

        /* renamed from: p, reason: collision with root package name */
        @Y61.k
        public final androidx.compose.foundation.interaction.k f26823p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f26824q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f26825r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f26826s;

        /* compiled from: Indication.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1", f = "Indication.kt", i = {}, l = {228}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.Q0$a$a, reason: collision with other inner class name */
        public static final class C1554a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f26827q;

            /* compiled from: Indication.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/interaction/j;", "interaction", "Lkotlin/G0;", "emit", "(Landroidx/compose/foundation/interaction/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: androidx.compose.foundation.Q0$a$a$a, reason: collision with other inner class name */
            public static final class C1555a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ l0.f f26829b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ l0.f f26830c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ l0.f f26831d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ a f26832e;

                public C1555a(l0.f fVar, l0.f fVar2, l0.f fVar3, a aVar) {
                    this.f26829b = fVar;
                    this.f26830c = fVar2;
                    this.f26831d = fVar3;
                    this.f26832e = aVar;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    androidx.compose.foundation.interaction.j jVar = (androidx.compose.foundation.interaction.j) obj;
                    boolean z12 = jVar instanceof o.b;
                    l0.f fVar = this.f26831d;
                    l0.f fVar2 = this.f26830c;
                    l0.f fVar3 = this.f26829b;
                    boolean z13 = true;
                    if (z12) {
                        fVar3.f406840b++;
                    } else if ((jVar instanceof o.c) || (jVar instanceof o.a)) {
                        fVar3.f406840b--;
                    } else if (jVar instanceof g.a) {
                        fVar2.f406840b++;
                    } else if (jVar instanceof g.b) {
                        fVar2.f406840b--;
                    } else if (jVar instanceof d.a) {
                        fVar.f406840b++;
                    } else if (jVar instanceof d.b) {
                        fVar.f406840b--;
                    }
                    boolean z14 = false;
                    boolean z15 = fVar3.f406840b > 0;
                    boolean z16 = fVar2.f406840b > 0;
                    boolean z17 = fVar.f406840b > 0;
                    a aVar = this.f26832e;
                    if (aVar.f26824q != z15) {
                        aVar.f26824q = z15;
                        z14 = true;
                    }
                    if (aVar.f26825r != z16) {
                        aVar.f26825r = z16;
                        z14 = true;
                    }
                    if (aVar.f26826s != z17) {
                        aVar.f26826s = z17;
                    } else {
                        z13 = z14;
                    }
                    if (z13) {
                        C22440v.a(aVar);
                    }
                    return kotlin.G0.f406611a;
                }
            }

            public C1554a(Continuation<? super C1554a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                return a.this.new C1554a(continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                return ((C1554a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f26827q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    l0.f fVar = new l0.f();
                    l0.f fVar2 = new l0.f();
                    l0.f fVar3 = new l0.f();
                    a aVar = a.this;
                    InterfaceC43160i<androidx.compose.foundation.interaction.j> interfaceC43160iC = aVar.f26823p.c();
                    C1555a c1555a = new C1555a(fVar, fVar2, fVar3, aVar);
                    this.f26827q = 1;
                    if (interfaceC43160iC.collect(c1555a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return kotlin.G0.f406611a;
            }
        }

        public a(@Y61.k androidx.compose.foundation.interaction.k kVar) {
            this.f26823p = kVar;
        }

        @Override // androidx.compose.ui.v.d
        public final void c2() {
            C43259k.d(Y1(), null, null, new C1554a(null), 3);
        }

        @Override // androidx.compose.ui.node.InterfaceC22438u
        public final void t(@Y61.k androidx.compose.ui.node.P p12) {
            p12.y1();
            boolean z12 = this.f26824q;
            androidx.compose.ui.graphics.drawscope.a aVar = p12.f40671b;
            if (z12) {
                androidx.compose.ui.graphics.T.f39320b.getClass();
                androidx.compose.ui.graphics.drawscope.g.c0(p12, androidx.compose.ui.graphics.T.c(androidx.compose.ui.graphics.T.f39321c, 0.3f), 0L, aVar.i(), 0.0f, null, 122);
            } else if (this.f26825r || this.f26826s) {
                androidx.compose.ui.graphics.T.f39320b.getClass();
                androidx.compose.ui.graphics.drawscope.g.c0(p12, androidx.compose.ui.graphics.T.c(androidx.compose.ui.graphics.T.f39321c, 0.1f), 0L, aVar.i(), 0.0f, null, 122);
            }
        }
    }

    @Override // androidx.compose.foundation.InterfaceC21084v1
    @Y61.k
    public final InterfaceC22419k a(@Y61.k androidx.compose.foundation.interaction.k kVar) {
        return new a(kVar);
    }

    public final boolean equals(@Y61.l Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.foundation.InterfaceC21084v1
    public final int hashCode() {
        return -1;
    }
}
