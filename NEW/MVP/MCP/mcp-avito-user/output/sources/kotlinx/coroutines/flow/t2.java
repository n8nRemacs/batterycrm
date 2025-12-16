package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Share.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/t2;", "T", "Lkotlinx/coroutines/flow/d2;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class t2<T> implements d2<T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final d2<T> f411769b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SuspendLambda f411770c;

    /* compiled from: Share.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", i = {}, l = {405}, m = "collect", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f411771q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ t2<T> f411772r;

        /* renamed from: s, reason: collision with root package name */
        public int f411773s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t2<T> t2Var, Continuation<? super a> continuation) {
            super(continuation);
            this.f411772r = t2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f411771q = obj;
            this.f411773s |= BeduinInputModel.MIN_TEXT_VERSION;
            return this.f411772r.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t2(@Y61.k d2<? extends T> d2Var, @Y61.k Y41.p<? super InterfaceC43172j<? super T>, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar) {
        this.f411769b = d2Var;
        this.f411770c = (SuspendLambda) pVar;
    }

    @Override // kotlinx.coroutines.flow.d2
    @Y61.k
    public final List<T> E3() {
        return this.f411769b.E3();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(@Y61.k kotlinx.coroutines.flow.InterfaceC43172j<? super T> r5, @Y61.k kotlin.coroutines.Continuation<?> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.t2.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.t2$a r0 = (kotlinx.coroutines.flow.t2.a) r0
            int r1 = r0.f411773s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411773s = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.t2$a r0 = new kotlinx.coroutines.flow.t2$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f411771q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411773s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            kotlin.C42729a0.b(r6)
            goto L46
        L31:
            kotlin.C42729a0.b(r6)
            kotlinx.coroutines.flow.s2 r6 = new kotlinx.coroutines.flow.s2
            kotlin.coroutines.jvm.internal.SuspendLambda r2 = r4.f411770c
            r6.<init>(r2, r5)
            r0.f411773s = r3
            kotlinx.coroutines.flow.d2<T> r5 = r4.f411769b
            java.lang.Object r5 = r5.collect(r6, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t2.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
