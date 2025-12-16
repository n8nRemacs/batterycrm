package retrofit2;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: KotlinExtensions.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"retrofit"}, k = 2, mv = {1, 4, 0})
@X41.i
/* loaded from: classes9.dex */
public final class q {

    /* compiled from: KotlinExtensions.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "retrofit2/KotlinExtensions$suspendAndThrow$2$1", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Continuation f430013b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Exception f430014c;

        public a(Exception exc, Continuation continuation) {
            this.f430013b = continuation;
            this.f430014c = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Continuation continuationIntercepted = IntrinsicsKt.intercepted(this.f430013b);
            int i12 = Z.f406624c;
            continuationIntercepted.resumeWith(new Z.b(this.f430014c));
        }
    }

    /* compiled from: KotlinExtensions.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00060\u0002j\u0002`\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0080@"}, d2 = {"suspendAndThrow", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {1, 1, 15})
    @DebugMetadata(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", i = {0}, l = {113}, m = "suspendAndThrow", n = {"$this$suspendAndThrow"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f430015q;

        /* renamed from: r, reason: collision with root package name */
        public int f430016r;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f430015q = obj;
            this.f430016r |= BeduinInputModel.MIN_TEXT_VERSION;
            return q.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@Y61.k java.lang.Exception r4, @Y61.k kotlin.coroutines.Continuation<?> r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.q.b
            if (r0 == 0) goto L13
            r0 = r5
            retrofit2.q$b r0 = (retrofit2.q.b) r0
            int r1 = r0.f430016r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f430016r = r1
            goto L18
        L13:
            retrofit2.q$b r0 = new retrofit2.q$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f430015q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f430016r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r5)
            goto L54
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.C42729a0.b(r5)
            r0.f430016r = r3
            kotlinx.coroutines.scheduling.c r5 = kotlinx.coroutines.C43262l0.f411945a
            kotlin.coroutines.CoroutineContext r2 = r0.getF411447c()
            retrofit2.q$a r3 = new retrofit2.q$a
            r3.<init>(r4, r0)
            r5.h(r2, r3)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r5) goto L51
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        L51:
            if (r4 != r1) goto L54
            return r1
        L54:
            kotlin.G0 r4 = kotlin.G0.f406611a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.q.a(java.lang.Exception, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
