package ru.cyberity.ml.core.pipeline.core;

import kotlin.Metadata;
import ru.cyberity.cbr.core.common.c0;

/* compiled from: WrappedPipelineStep.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\n"}, d2 = {"Lru/cyberity/ml/core/pipeline/core/c;", "Input", "Output", "Lru/cyberity/ml/core/pipeline/core/b;", "input", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "b", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public abstract class c<Input, Output> implements b<Input, Output> {
    @Override // ru.cyberity.ml.core.pipeline.core.b
    public Output a(Input input) throws InterruptedException {
        try {
            return b(input);
        } catch (OutOfMemoryError unused) {
            c0.a.f432656a.a();
            return b(input);
        }
    }

    public abstract Output b(Input input);
}
