package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: Limit.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: kotlinx.coroutines.flow.p0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43191p0<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0.f f411675b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f411676c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43172j<T> f411677d;

    /* compiled from: Limit.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", f = "Limit.kt", i = {}, l = {21}, m = "emit", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.p0$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f411678q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C43191p0<T> f411679r;

        /* renamed from: s, reason: collision with root package name */
        public int f411680s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C43191p0<? super T> c43191p0, Continuation<? super a> continuation) {
            super(continuation);
            this.f411679r = c43191p0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f411678q = obj;
            this.f411680s |= BeduinInputModel.MIN_TEXT_VERSION;
            return this.f411679r.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43191p0(l0.f fVar, int i12, InterfaceC43172j<? super T> interfaceC43172j) {
        this.f411675b = fVar;
        this.f411676c = i12;
        this.f411677d = interfaceC43172j;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(T r6, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.C43191p0.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.p0$a r0 = (kotlinx.coroutines.flow.C43191p0.a) r0
            int r1 = r0.f411680s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411680s = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.p0$a r0 = new kotlinx.coroutines.flow.p0$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f411678q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411680s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r7)
            goto L47
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.C42729a0.b(r7)
            kotlin.jvm.internal.l0$f r7 = r5.f411675b
            int r2 = r7.f406840b
            int r4 = r5.f411676c
            if (r2 < r4) goto L4a
            r0.f411680s = r3
            kotlinx.coroutines.flow.j<T> r7 = r5.f411677d
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        L4a:
            int r2 = r2 + r3
            r7.f406840b = r2
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43191p0.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
