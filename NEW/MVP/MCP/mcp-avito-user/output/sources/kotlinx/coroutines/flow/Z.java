package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: Emitters.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class Z<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0.a f411309b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43172j<T> f411310c;

    /* compiled from: Emitters.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1", f = "Emitters.kt", i = {}, l = {181}, m = "emit", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f411311q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Z<T> f411312r;

        /* renamed from: s, reason: collision with root package name */
        public int f411313s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Z<? super T> z12, Continuation<? super a> continuation) {
            super(continuation);
            this.f411312r = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f411311q = obj;
            this.f411313s |= BeduinInputModel.MIN_TEXT_VERSION;
            return this.f411312r.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Z(l0.a aVar, InterfaceC43172j<? super T> interfaceC43172j) {
        this.f411309b = aVar;
        this.f411310c = interfaceC43172j;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(T r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.Z.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.Z$a r0 = (kotlinx.coroutines.flow.Z.a) r0
            int r1 = r0.f411313s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411313s = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.Z$a r0 = new kotlinx.coroutines.flow.Z$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f411311q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411313s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r6)
            kotlin.jvm.internal.l0$a r6 = r4.f411309b
            r2 = 0
            r6.f406838b = r2
            r0.f411313s = r3
            kotlinx.coroutines.flow.j<T> r6 = r4.f411310c
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.Z.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
