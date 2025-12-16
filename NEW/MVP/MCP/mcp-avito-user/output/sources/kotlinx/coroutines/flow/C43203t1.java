package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;

/* compiled from: Transform.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: kotlinx.coroutines.flow.t1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43203t1<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0.h<Object> f411761b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f411762c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43172j<Object> f411763d;

    /* compiled from: Transform.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1", f = "Transform.kt", i = {0}, l = {105, 106}, m = "emit", n = {"this"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.t1$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public Object f411764q;

        /* renamed from: r, reason: collision with root package name */
        public l0.h f411765r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f411766s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C43203t1<T> f411767t;

        /* renamed from: u, reason: collision with root package name */
        public int f411768u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C43203t1<? super T> c43203t1, Continuation<? super a> continuation) {
            super(continuation);
            this.f411767t = c43203t1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f411766s = obj;
            this.f411768u |= BeduinInputModel.MIN_TEXT_VERSION;
            return this.f411767t.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43203t1(l0.h<Object> hVar, Y41.q<Object, ? super T, ? super Continuation<Object>, ? extends Object> qVar, InterfaceC43172j<Object> interfaceC43172j) {
        this.f411761b = hVar;
        this.f411762c = (SuspendLambda) qVar;
        this.f411763d = interfaceC43172j;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(T r7, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.C43203t1.a
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.t1$a r0 = (kotlinx.coroutines.flow.C43203t1.a) r0
            int r1 = r0.f411768u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411768u = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.t1$a r0 = new kotlinx.coroutines.flow.t1$a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f411766s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411768u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r8)
            goto L6e
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            kotlin.jvm.internal.l0$h r7 = r0.f411765r
            java.lang.Object r2 = r0.f411764q
            kotlinx.coroutines.flow.t1 r2 = (kotlinx.coroutines.flow.C43203t1) r2
            kotlin.C42729a0.b(r8)
            goto L58
        L3e:
            kotlin.C42729a0.b(r8)
            kotlin.jvm.internal.l0$h<java.lang.Object> r8 = r6.f411761b
            T r2 = r8.f406842b
            r0.f411764q = r6
            r0.f411765r = r8
            r0.f411768u = r4
            kotlin.coroutines.jvm.internal.SuspendLambda r4 = r6.f411762c
            java.lang.Object r7 = r4.invoke(r2, r7, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r2 = r6
            r5 = r8
            r8 = r7
            r7 = r5
        L58:
            r7.f406842b = r8
            kotlinx.coroutines.flow.j<java.lang.Object> r7 = r2.f411763d
            kotlin.jvm.internal.l0$h<java.lang.Object> r8 = r2.f411761b
            T r8 = r8.f406842b
            r2 = 0
            r0.f411764q = r2
            r0.f411765r = r2
            r0.f411768u = r3
            java.lang.Object r7 = r7.emit(r8, r0)
            if (r7 != r1) goto L6e
            return r1
        L6e:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43203t1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
