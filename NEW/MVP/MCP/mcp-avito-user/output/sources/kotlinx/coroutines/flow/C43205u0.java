package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: Limit.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: kotlinx.coroutines.flow.u0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43205u0<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0.f f411779b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f411780c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43172j<T> f411781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f411782e;

    /* compiled from: Limit.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", i = {}, l = {58, 60}, m = "emit", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.u0$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f411783q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C43205u0<T> f411784r;

        /* renamed from: s, reason: collision with root package name */
        public int f411785s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C43205u0<? super T> c43205u0, Continuation<? super a> continuation) {
            super(continuation);
            this.f411784r = c43205u0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f411783q = obj;
            this.f411785s |= BeduinInputModel.MIN_TEXT_VERSION;
            return this.f411784r.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43205u0(l0.f fVar, int i12, InterfaceC43172j<? super T> interfaceC43172j, Object obj) {
        this.f411779b = fVar;
        this.f411780c = i12;
        this.f411781d = interfaceC43172j;
        this.f411782e = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(T r7, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.C43205u0.a
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.u0$a r0 = (kotlinx.coroutines.flow.C43205u0.a) r0
            int r1 = r0.f411785s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411785s = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.u0$a r0 = new kotlinx.coroutines.flow.u0$a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f411783q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411785s
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r8)
            goto L5f
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            kotlin.C42729a0.b(r8)
            goto L51
        L38:
            kotlin.C42729a0.b(r8)
            kotlin.jvm.internal.l0$f r8 = r6.f411779b
            int r2 = r8.f406840b
            int r2 = r2 + r4
            r8.f406840b = r2
            int r8 = r6.f411780c
            kotlinx.coroutines.flow.j<T> r5 = r6.f411781d
            if (r2 >= r8) goto L54
            r0.f411785s = r4
            java.lang.Object r7 = r5.emit(r7, r0)
            if (r7 != r1) goto L51
            return r1
        L51:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        L54:
            r0.f411785s = r3
            java.lang.Object r8 = r6.f411782e
            java.lang.Object r7 = kotlinx.coroutines.flow.C43217y0.a(r5, r7, r8, r0)
            if (r7 != r1) goto L5f
            return r1
        L5f:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43205u0.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
