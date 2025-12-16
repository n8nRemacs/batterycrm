package ru.cyberity.ml.core.pipeline.core;

import Y61.k;
import kotlin.Metadata;

/* compiled from: Pipeline.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u001b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\u0004\b\u0002\u0010\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005J\u0015\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\tR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\u000e"}, d2 = {"Lru/cyberity/ml/core/pipeline/core/a;", "Input", "Output", "", "NewOutput", "Lru/cyberity/ml/core/pipeline/core/b;", "newStep", "a", "input", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lru/cyberity/ml/core/pipeline/core/b;", "currentStep", "<init>", "(Lru/cyberity/ml/core/pipeline/core/b;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a<Input, Output> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final b<Input, Output> currentStep;

    /* JADX INFO: Add missing generic type declarations: [NewOutput] */
    /* compiled from: Pipeline.kt */
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0017\u0010\u0003\u001a\u00028\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ru/cyberity/ml/core/pipeline/core/a$a", "Lru/cyberity/ml/core/pipeline/core/b;", "input", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.ml.core.pipeline.core.a$a, reason: collision with other inner class name */
    public static final class C12573a<NewOutput> implements b<Input, NewOutput> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b<Output, NewOutput> f436210a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a<Input, Output> f436211b;

        public C12573a(b<Output, NewOutput> bVar, a<Input, Output> aVar) {
            this.f436210a = bVar;
            this.f436211b = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ru.cyberity.ml.core.pipeline.core.b
        public NewOutput a(Input input) {
            return (NewOutput) this.f436210a.a(((a) this.f436211b).currentStep.a(input));
        }
    }

    public a(@k b<Input, Output> bVar) {
        this.currentStep = bVar;
    }

    @k
    public final <NewOutput> a<Input, NewOutput> a(@k b<Output, NewOutput> newStep) {
        return new a<>(new C12573a(newStep, this));
    }

    public final Output a(Input input) {
        return this.currentStep.a(input);
    }
}
