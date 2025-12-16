package androidx.compose.foundation.interaction;

import androidx.compose.foundation.interaction.o;
import androidx.compose.runtime.InterfaceC22204y1;
import java.util.ArrayList;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PressInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.interaction.PressInteractionKt$collectIsPressedAsState$1$1", f = "PressInteraction.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class p extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f28151q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m f28152r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Boolean> f28153s;

    /* compiled from: PressInteraction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/interaction/j;", "interaction", "Lkotlin/G0;", "emit", "(Landroidx/compose/foundation/interaction/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f28154b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f28155c;

        public a(InterfaceC22204y1 interfaceC22204y1, ArrayList arrayList) {
            this.f28154b = arrayList;
            this.f28155c = interfaceC22204y1;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            j jVar = (j) obj;
            boolean z12 = jVar instanceof o.b;
            ArrayList arrayList = this.f28154b;
            if (z12) {
                arrayList.add(jVar);
            } else if (jVar instanceof o.c) {
                arrayList.remove(((o.c) jVar).f28150a);
            } else if (jVar instanceof o.a) {
                arrayList.remove(((o.a) jVar).f28148a);
            }
            this.f28155c.setValue(Boxing.boxBoolean(!arrayList.isEmpty()));
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(m mVar, InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
        super(2, continuation);
        this.f28152r = mVar;
        this.f28153s = interfaceC22204y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new p(this.f28152r, this.f28153s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((p) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f28151q;
        if (i12 == 0) {
            C42729a0.b(obj);
            ArrayList arrayList = new ArrayList();
            InterfaceC43160i<j> interfaceC43160iC = this.f28152r.c();
            a aVar = new a(this.f28153s, arrayList);
            this.f28151q = 1;
            if (interfaceC43160iC.collect(aVar, this) == coroutine_suspended) {
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
