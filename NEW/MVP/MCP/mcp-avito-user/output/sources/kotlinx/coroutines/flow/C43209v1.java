package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;

/* compiled from: Transform.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: kotlinx.coroutines.flow.v1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43209v1<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0.h<Object> f411803b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f411804c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43172j<T> f411805d;

    /* compiled from: Transform.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1", f = "Transform.kt", i = {0}, l = {127, 129}, m = "emit", n = {"this"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.v1$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public Object f411806q;

        /* renamed from: r, reason: collision with root package name */
        public l0.h f411807r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f411808s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C43209v1<T> f411809t;

        /* renamed from: u, reason: collision with root package name */
        public int f411810u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C43209v1<? super T> c43209v1, Continuation<? super a> continuation) {
            super(continuation);
            this.f411809t = c43209v1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f411808s = obj;
            this.f411810u |= BeduinInputModel.MIN_TEXT_VERSION;
            return this.f411809t.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43209v1(l0.h<Object> hVar, Y41.q<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> qVar, InterfaceC43172j<? super T> interfaceC43172j) {
        this.f411803b = hVar;
        this.f411804c = (SuspendLambda) qVar;
        this.f411805d = interfaceC43172j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(T r8, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.C43209v1.a
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.v1$a r0 = (kotlinx.coroutines.flow.C43209v1.a) r0
            int r1 = r0.f411810u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411810u = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.v1$a r0 = new kotlinx.coroutines.flow.v1$a
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f411808s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411810u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r9)
            goto L77
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            kotlin.jvm.internal.l0$h r8 = r0.f411807r
            java.lang.Object r2 = r0.f411806q
            kotlinx.coroutines.flow.v1 r2 = (kotlinx.coroutines.flow.C43209v1) r2
            kotlin.C42729a0.b(r9)
            goto L5e
        L3e:
            kotlin.C42729a0.b(r9)
            kotlin.jvm.internal.l0$h<java.lang.Object> r9 = r7.f411803b
            T r2 = r9.f406842b
            kotlinx.coroutines.internal.a0 r5 = kotlinx.coroutines.flow.internal.z.f411583a
            if (r2 != r5) goto L4b
            r2 = r7
            goto L61
        L4b:
            r0.f411806q = r7
            r0.f411807r = r9
            r0.f411810u = r4
            kotlin.coroutines.jvm.internal.SuspendLambda r4 = r7.f411804c
            java.lang.Object r8 = r4.invoke(r2, r8, r0)
            if (r8 != r1) goto L5a
            return r1
        L5a:
            r2 = r7
            r6 = r9
            r9 = r8
            r8 = r6
        L5e:
            r6 = r9
            r9 = r8
            r8 = r6
        L61:
            r9.f406842b = r8
            kotlinx.coroutines.flow.j<T> r8 = r2.f411805d
            kotlin.jvm.internal.l0$h<java.lang.Object> r9 = r2.f411803b
            T r9 = r9.f406842b
            r2 = 0
            r0.f411806q = r2
            r0.f411807r = r2
            r0.f411810u = r3
            java.lang.Object r8 = r8.emit(r9, r0)
            if (r8 != r1) goto L77
            return r1
        L77:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43209v1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
