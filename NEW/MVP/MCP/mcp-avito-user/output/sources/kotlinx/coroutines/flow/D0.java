package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Merge.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "value", "Lkotlin/G0;", "emit", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class D0<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43172j<T> f411122b;

    /* compiled from: Merge.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1", f = "Merge.kt", i = {}, l = {79}, m = "emit", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f411123q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ D0<T> f411124r;

        /* renamed from: s, reason: collision with root package name */
        public int f411125s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(D0<? super T> d02, Continuation<? super a> continuation) {
            super(continuation);
            this.f411124r = d02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f411123q = obj;
            this.f411125s |= BeduinInputModel.MIN_TEXT_VERSION;
            return this.f411124r.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public D0(InterfaceC43172j<? super T> interfaceC43172j) {
        this.f411122b = interfaceC43172j;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    @Y61.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(@Y61.k kotlinx.coroutines.flow.InterfaceC43160i<? extends T> r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.D0.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.D0$a r0 = (kotlinx.coroutines.flow.D0.a) r0
            int r1 = r0.f411125s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411125s = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.D0$a r0 = new kotlinx.coroutines.flow.D0$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f411123q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411125s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r6)
            r0.f411125s = r3
            kotlinx.coroutines.flow.j<T> r6 = r4.f411122b
            java.lang.Object r5 = kotlinx.coroutines.flow.C43175k.u(r0, r5, r6)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.D0.emit(kotlinx.coroutines.flow.i, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
