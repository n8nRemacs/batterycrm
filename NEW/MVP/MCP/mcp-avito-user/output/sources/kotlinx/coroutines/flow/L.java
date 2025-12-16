package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Count.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class L<T> implements InterfaceC43172j {

    /* compiled from: Count.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CountKt$count$4", f = "Count.kt", i = {0}, l = {AvailableCode.ERROR_NO_ACTIVITY}, m = "emit", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public Object f411161q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f411162r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ L<T> f411163s;

        /* renamed from: t, reason: collision with root package name */
        public int f411164t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(L<? super T> l12, Continuation<? super a> continuation) {
            super(continuation);
            this.f411163s = l12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f411162r = obj;
            this.f411164t |= BeduinInputModel.MIN_TEXT_VERSION;
            return this.f411163s.emit(null, this);
        }
    }

    public L() {
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
            boolean r4 = r5 instanceof kotlinx.coroutines.flow.L.a
            if (r4 == 0) goto L13
            r4 = r5
            kotlinx.coroutines.flow.L$a r4 = (kotlinx.coroutines.flow.L.a) r4
            int r0 = r4.f411164t
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f411164t = r0
            goto L18
        L13:
            kotlinx.coroutines.flow.L$a r4 = new kotlinx.coroutines.flow.L$a
            r4.<init>(r3, r5)
        L18:
            java.lang.Object r5 = r4.f411162r
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.f411164t
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L43
            if (r0 != r2) goto L3b
            java.lang.Object r4 = r4.f411161q
            kotlinx.coroutines.flow.L r4 = (kotlinx.coroutines.flow.L) r4
            kotlin.C42729a0.b(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L37
            kotlin.G0 r4 = kotlin.G0.f406611a
            return r4
        L37:
            r4.getClass()
            throw r1
        L3b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L43:
            kotlin.C42729a0.b(r5)
            r4.f411161q = r3
            r4.f411164t = r2
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.L.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
