package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Reduce.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"S", "T", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: kotlinx.coroutines.flow.b1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43141b1<T> implements InterfaceC43172j {

    /* compiled from: Reduce.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2", f = "Reduce.kt", i = {}, l = {21}, m = "emit", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.b1$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f411339q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C43141b1<T> f411340r;

        /* renamed from: s, reason: collision with root package name */
        public int f411341s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C43141b1<? super T> c43141b1, Continuation<? super a> continuation) {
            super(continuation);
            this.f411340r = c43141b1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f411339q = obj;
            this.f411341s |= BeduinInputModel.MIN_TEXT_VERSION;
            return this.f411340r.emit(null, this);
        }
    }

    public C43141b1() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(T r4, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof kotlinx.coroutines.flow.C43141b1.a
            if (r4 == 0) goto L13
            r4 = r5
            kotlinx.coroutines.flow.b1$a r4 = (kotlinx.coroutines.flow.C43141b1.a) r4
            int r0 = r4.f411341s
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f411341s = r0
            goto L18
        L13:
            kotlinx.coroutines.flow.b1$a r4 = new kotlinx.coroutines.flow.b1$a
            r4.<init>(r3, r5)
        L18:
            java.lang.Object r5 = r4.f411339q
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r4.f411341s
            if (r4 == 0) goto L31
            r0 = 1
            if (r4 != r0) goto L29
            kotlin.C42729a0.b(r5)
            r4 = 0
            throw r4
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.C42729a0.b(r5)
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43141b1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
