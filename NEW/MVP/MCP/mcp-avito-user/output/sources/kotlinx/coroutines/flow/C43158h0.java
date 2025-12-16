package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: Errors.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: kotlinx.coroutines.flow.h0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43158h0<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43172j<T> f411409b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0.h<Throwable> f411410c;

    /* compiled from: Errors.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", i = {0}, l = {154}, m = "emit", n = {"this"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.h0$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public Object f411411q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f411412r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C43158h0<T> f411413s;

        /* renamed from: t, reason: collision with root package name */
        public int f411414t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C43158h0<? super T> c43158h0, Continuation<? super a> continuation) {
            super(continuation);
            this.f411413s = c43158h0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f411412r = obj;
            this.f411414t |= BeduinInputModel.MIN_TEXT_VERSION;
            return this.f411413s.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43158h0(InterfaceC43172j<? super T> interfaceC43172j, l0.h<Throwable> hVar) {
        this.f411409b = interfaceC43172j;
        this.f411410c = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(T r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.C43158h0.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.h0$a r0 = (kotlinx.coroutines.flow.C43158h0.a) r0
            int r1 = r0.f411414t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411414t = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.h0$a r0 = new kotlinx.coroutines.flow.h0$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f411412r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411414t
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f411411q
            kotlinx.coroutines.flow.h0 r5 = (kotlinx.coroutines.flow.C43158h0) r5
            kotlin.C42729a0.b(r6)     // Catch: java.lang.Throwable -> L2d
            goto L47
        L2d:
            r6 = move-exception
            goto L4c
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.C42729a0.b(r6)
            kotlinx.coroutines.flow.j<T> r6 = r4.f411409b     // Catch: java.lang.Throwable -> L4a
            r0.f411411q = r4     // Catch: java.lang.Throwable -> L4a
            r0.f411414t = r3     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L4a
            if (r5 != r1) goto L47
            return r1
        L47:
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        L4a:
            r6 = move-exception
            r5 = r4
        L4c:
            kotlin.jvm.internal.l0$h<java.lang.Throwable> r5 = r5.f411410c
            r5.f406842b = r6
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43158h0.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
