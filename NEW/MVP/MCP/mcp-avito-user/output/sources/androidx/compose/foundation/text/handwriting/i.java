package androidx.compose.foundation.text.handwriting;

import Y41.p;
import Y61.k;
import androidx.compose.foundation.gestures.C20444d1;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.focus.InterfaceC22224i;
import androidx.compose.ui.focus.X;
import androidx.compose.ui.input.pointer.C;
import androidx.compose.ui.input.pointer.C22340s;
import androidx.compose.ui.input.pointer.InterfaceC22325c;
import androidx.compose.ui.input.pointer.K;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.Z;
import androidx.compose.ui.input.pointer.b0;
import androidx.compose.ui.input.pointer.g0;
import androidx.compose.ui.node.AbstractC22425n;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.C22436t;
import androidx.compose.ui.node.P0;
import androidx.compose.ui.node.X0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.s0;

/* compiled from: StylusHandwriting.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/handwriting/i;", "Landroidx/compose/ui/node/n;", "Landroidx/compose/ui/node/P0;", "Landroidx/compose/ui/focus/i;", "Landroidx/compose/ui/focus/X;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class i extends AbstractC22425n implements P0, InterfaceC22224i, X {

    /* renamed from: r, reason: collision with root package name */
    @k
    public Y41.a<G0> f30732r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f30733s;

    /* renamed from: t, reason: collision with root package name */
    @k
    public final b0 f30734t;

    /* compiled from: StylusHandwriting.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/K;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a implements PointerInputEventHandler {

        /* compiled from: StylusHandwriting.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1", f = "StylusHandwriting.kt", i = {0, 1, 1, 1, 2, 2}, l = {105, 133, 171}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "firstDown", "pass", "$this$awaitEachGesture", "firstDown"}, s = {"L$0", "L$0", "L$1", "L$2", "L$0", "L$1"})
        /* renamed from: androidx.compose.foundation.text.handwriting.i$a$a, reason: collision with other inner class name */
        public static final class C1607a extends RestrictedSuspendLambda implements p<InterfaceC22325c, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public C f30736q;

            /* renamed from: r, reason: collision with root package name */
            public PointerEventPass f30737r;

            /* renamed from: s, reason: collision with root package name */
            public int f30738s;

            /* renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f30739t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ i f30740u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1607a(i iVar, Continuation<? super C1607a> continuation) {
                super(2, continuation);
                this.f30740u = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
                C1607a c1607a = new C1607a(this.f30740u, continuation);
                c1607a.f30739t = obj;
                return c1607a;
            }

            @Override // Y41.p
            public final Object invoke(InterfaceC22325c interfaceC22325c, Continuation<? super G0> continuation) {
                return ((C1607a) create(interfaceC22325c, continuation)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Path cross not found for [B:31:0x00b8, B:26:0x0098], limit reached: 96 */
            /* JADX WARN: Path cross not found for [B:34:0x00bd, B:37:0x00c3], limit reached: 96 */
            /* JADX WARN: Path cross not found for [B:62:0x012e, B:57:0x0116], limit reached: 96 */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00d9 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00e8  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x0116  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x014a  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x014d  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x0172 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:77:0x0181  */
            /* JADX WARN: Removed duplicated region for block: B:88:0x01a5  */
            /* JADX WARN: Removed duplicated region for block: B:90:0x01a8  */
            /* JADX WARN: Removed duplicated region for block: B:93:0x01a0 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:98:0x010e A[SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, java.util.List] */
            /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, java.util.List] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00d7 -> B:42:0x00da). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0170 -> B:75:0x0173). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r21) {
                /*
                    Method dump skipped, instructions count: 433
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.handwriting.i.a.C1607a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(K k12, Continuation<? super G0> continuation) {
            Object objC = C20444d1.c(k12, new C1607a(i.this, null), continuation);
            return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : G0.f406611a;
        }
    }

    public i(@k Y41.a<G0> aVar) {
        this.f30732r = aVar;
        g0 g0VarB = Z.b(new a());
        k2(g0VarB);
        this.f30734t = g0VarB;
    }

    @Override // androidx.compose.ui.node.P0
    public final long m1() {
        C22436t c22436t = h.f30731a;
        androidx.compose.ui.unit.d dVar = C22421l.g(this).f40608B;
        c22436t.getClass();
        X0.a aVar = X0.f40712b;
        int iY02 = dVar.y0(c22436t.f40869a);
        int iY03 = dVar.y0(c22436t.f40870b);
        int iY04 = dVar.y0(c22436t.f40871c);
        int iY05 = dVar.y0(c22436t.f40872d);
        aVar.getClass();
        return X0.a.b(iY02, iY03, iY04, iY05, c22436t.f40873e);
    }

    @Override // androidx.compose.ui.node.P0
    public final void p1() {
        this.f30734t.p1();
    }

    @Override // androidx.compose.ui.node.P0
    public final void r0(@k C22340s c22340s, @k PointerEventPass pointerEventPass, long j12) {
        this.f30734t.r0(c22340s, pointerEventPass, j12);
    }

    @Override // androidx.compose.ui.focus.InterfaceC22224i
    public final void u(@k FocusStateImpl focusStateImpl) {
        this.f30733s = focusStateImpl.a();
    }
}
