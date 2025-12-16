package androidx.compose.material3;

import androidx.compose.foundation.gestures.C20495q0;
import androidx.compose.ui.node.C22421l;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;

/* compiled from: TimePicker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/K;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1", f = "TimePicker.kt", i = {}, l = {1292}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.material3.q3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21808q3 extends SuspendLambda implements Y41.p<androidx.compose.ui.input.pointer.K, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f37139q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f37140r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C21898u3 f37141s;

    /* compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.q3$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C21898u3 f37142l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C21898u3 c21898u3) {
            super(0);
            this.f37142l = c21898u3;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C21898u3 c21898u3 = this.f37142l;
            C43259k.d(c21898u3.Y1(), null, null, new C21785p3(c21898u3, null), 3);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/C;", "<anonymous parameter 0>", "Ll0/g;", "dragAmount", "Lkotlin/G0;", "invoke-Uv8p0NA", "(Landroidx/compose/ui/input/pointer/C;J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.q3$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.ui.input.pointer.C, l0.g, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C21898u3 f37143l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C21898u3 c21898u3) {
            super(2);
            this.f37143l = c21898u3;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.ui.input.pointer.C c12, l0.g gVar) {
            long j12 = gVar.f413387a;
            C21898u3 c21898u3 = this.f37143l;
            C43259k.d(c21898u3.Y1(), null, null, new C21830r3(c21898u3, j12, null), 3);
            C22421l.g(c21898u3).f40608B.M0(Ok.f35272c);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21808q3(C21898u3 c21898u3, Continuation<? super C21808q3> continuation) {
        super(2, continuation);
        this.f37141s = c21898u3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C21808q3 c21808q3 = new C21808q3(this.f37141s, continuation);
        c21808q3.f37140r = obj;
        return c21808q3;
    }

    @Override // Y41.p
    public final Object invoke(androidx.compose.ui.input.pointer.K k12, Continuation<? super kotlin.G0> continuation) {
        return ((C21808q3) create(k12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f37139q;
        if (i12 == 0) {
            C42729a0.b(obj);
            androidx.compose.ui.input.pointer.K k12 = (androidx.compose.ui.input.pointer.K) this.f37140r;
            C21898u3 c21898u3 = this.f37141s;
            a aVar = new a(c21898u3);
            b bVar = new b(c21898u3);
            this.f37139q = 1;
            if (C20495q0.h(k12, aVar, bVar, this, 5) == coroutine_suspended) {
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
