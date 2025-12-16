package io.ktor.util.pipeline;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.util.k0;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DebugPipelineContext.kt */
@k0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/util/pipeline/a;", "", "TSubject", "TContext", "Lio/ktor/util/pipeline/e;", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class a<TSubject, TContext> extends e<TSubject, TContext> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<Y41.q<e<TSubject, TContext>, TSubject, Continuation<? super G0>, Object>> f400510c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final CoroutineContext f400511d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public TSubject f400512e;

    /* renamed from: f, reason: collision with root package name */
    public int f400513f;

    /* compiled from: DebugPipelineContext.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.util.pipeline.DebugPipelineContext", f = "DebugPipelineContext.kt", i = {0}, l = {80}, m = "proceedLoop", n = {"this"}, s = {"L$0"})
    /* renamed from: io.ktor.util.pipeline.a$a, reason: collision with other inner class name */
    public static final class C11421a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public a f400514q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f400515r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ a<TSubject, TContext> f400516s;

        /* renamed from: t, reason: collision with root package name */
        public int f400517t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11421a(a<TSubject, TContext> aVar, Continuation<? super C11421a> continuation) {
            super(continuation);
            this.f400516s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f400515r = obj;
            this.f400517t |= BeduinInputModel.MIN_TEXT_VERSION;
            return this.f400516s.h(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@Y61.k TContext tcontext, @Y61.k List<? extends Y41.q<? super e<TSubject, TContext>, ? super TSubject, ? super Continuation<? super G0>, ? extends Object>> list, @Y61.k TSubject tsubject, @Y61.k CoroutineContext coroutineContext) {
        super(tcontext);
        this.f400510c = list;
        this.f400511d = coroutineContext;
        this.f400512e = tsubject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.ktor.util.pipeline.e
    @Y61.l
    public final Object b(@Y61.k Object obj, @Y61.k ContinuationImpl continuationImpl) {
        this.f400513f = 0;
        this.f400512e = obj;
        return f(continuationImpl);
    }

    @Override // io.ktor.util.pipeline.e
    public final void c() {
        this.f400513f = -1;
    }

    @Override // io.ktor.util.pipeline.e
    @Y61.k
    public final TSubject e() {
        return this.f400512e;
    }

    @Override // io.ktor.util.pipeline.e
    @Y61.l
    public final Object f(@Y61.k Continuation<? super TSubject> continuation) {
        int i12 = this.f400513f;
        if (i12 < 0) {
            return this.f400512e;
        }
        if (i12 < this.f400510c.size()) {
            return h(continuation);
        }
        this.f400513f = -1;
        return this.f400512e;
    }

    @Override // io.ktor.util.pipeline.e
    @Y61.l
    public final Object g(@Y61.k TSubject tsubject, @Y61.k Continuation<? super TSubject> continuation) {
        this.f400512e = tsubject;
        return f(continuation);
    }

    @Override // kotlinx.coroutines.T
    @Y61.k
    /* renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getF115043e() {
        return this.f400511d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(kotlin.coroutines.Continuation<? super TSubject> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof io.ktor.util.pipeline.a.C11421a
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.util.pipeline.a$a r0 = (io.ktor.util.pipeline.a.C11421a) r0
            int r1 = r0.f400517t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400517t = r1
            goto L18
        L13:
            io.ktor.util.pipeline.a$a r0 = new io.ktor.util.pipeline.a$a
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f400515r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400517t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            io.ktor.util.pipeline.a r2 = r0.f400514q
            kotlin.C42729a0.b(r8)
            goto L37
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            kotlin.C42729a0.b(r8)
            r2 = r7
        L37:
            int r8 = r2.f400513f
            r4 = -1
            if (r8 != r4) goto L3d
            goto L47
        L3d:
            java.util.List<Y41.q<io.ktor.util.pipeline.e<TSubject, TContext>, TSubject, kotlin.coroutines.Continuation<? super kotlin.G0>, java.lang.Object>> r5 = r2.f400510c
            int r6 = r5.size()
            if (r8 < r6) goto L4a
            r2.f400513f = r4
        L47:
            TSubject r8 = r2.f400512e
            return r8
        L4a:
            java.lang.Object r4 = r5.get(r8)
            Y41.q r4 = (Y41.q) r4
            int r8 = r8 + 1
            r2.f400513f = r8
            TSubject r8 = r2.f400512e
            r0.f400514q = r2
            r0.f400517t = r3
            java.lang.Object r8 = r4.invoke(r2, r8, r0)
            if (r8 != r1) goto L37
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.pipeline.a.h(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
