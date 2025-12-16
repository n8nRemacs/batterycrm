package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;

/* compiled from: Limit.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: kotlinx.coroutines.flow.r0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43196r0<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0.a f411707b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43172j<T> f411708c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f411709d;

    /* compiled from: Limit.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", i = {1, 1}, l = {33, 34, 36}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.flow.r0$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public Object f411710q;

        /* renamed from: r, reason: collision with root package name */
        public Object f411711r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f411712s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C43196r0<T> f411713t;

        /* renamed from: u, reason: collision with root package name */
        public int f411714u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C43196r0<? super T> c43196r0, Continuation<? super a> continuation) {
            super(continuation);
            this.f411713t = c43196r0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f411712s = obj;
            this.f411714u |= BeduinInputModel.MIN_TEXT_VERSION;
            return this.f411713t.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43196r0(l0.a aVar, InterfaceC43172j<? super T> interfaceC43172j, Y41.p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar) {
        this.f411707b = aVar;
        this.f411708c = interfaceC43172j;
        this.f411709d = (SuspendLambda) pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v4, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(T r7, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.C43196r0.a
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.r0$a r0 = (kotlinx.coroutines.flow.C43196r0.a) r0
            int r1 = r0.f411714u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411714u = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.r0$a r0 = new kotlinx.coroutines.flow.r0$a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f411712s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411714u
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L41
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.C42729a0.b(r8)
            goto L88
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            java.lang.Object r7 = r0.f411711r
            java.lang.Object r2 = r0.f411710q
            kotlinx.coroutines.flow.r0 r2 = (kotlinx.coroutines.flow.C43196r0) r2
            kotlin.C42729a0.b(r8)
            goto L6c
        L41:
            kotlin.C42729a0.b(r8)
            goto L59
        L45:
            kotlin.C42729a0.b(r8)
            kotlin.jvm.internal.l0$a r8 = r6.f411707b
            boolean r8 = r8.f406838b
            if (r8 == 0) goto L5c
            r0.f411714u = r5
            kotlinx.coroutines.flow.j<T> r8 = r6.f411708c
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L59
            return r1
        L59:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        L5c:
            r0.f411710q = r6
            r0.f411711r = r7
            r0.f411714u = r4
            kotlin.coroutines.jvm.internal.SuspendLambda r8 = r6.f411709d
            java.lang.Object r8 = r8.invoke(r7, r0)
            if (r8 != r1) goto L6b
            return r1
        L6b:
            r2 = r6
        L6c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L8b
            kotlin.jvm.internal.l0$a r8 = r2.f411707b
            r8.f406838b = r5
            r8 = 0
            r0.f411710q = r8
            r0.f411711r = r8
            r0.f411714u = r3
            kotlinx.coroutines.flow.j<T> r8 = r2.f411708c
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L88
            return r1
        L88:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        L8b:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43196r0.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
