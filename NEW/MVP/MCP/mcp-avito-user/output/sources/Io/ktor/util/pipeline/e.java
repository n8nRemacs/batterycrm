package io.ktor.util.pipeline;

import io.ktor.util.k0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.T;

/* compiled from: PipelineContext.kt */
@k0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/util/pipeline/e;", "", "TSubject", "TContext", "Lkotlinx/coroutines/T;", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class e<TSubject, TContext> implements T {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TContext f400528b;

    public e(@Y61.k TContext tcontext) {
        this.f400528b = tcontext;
    }

    @Y61.l
    public abstract Object b(@Y61.k Object obj, @Y61.k ContinuationImpl continuationImpl);

    public abstract void c();

    @Y61.k
    public abstract TSubject e();

    @Y61.l
    public abstract Object f(@Y61.k Continuation<? super TSubject> continuation);

    @Y61.l
    public abstract Object g(@Y61.k TSubject tsubject, @Y61.k Continuation<? super TSubject> continuation);
}
