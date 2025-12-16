package com.avito.android.publish.screen.step.request.steps.loader;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.publish.PublishSession;
import com.avito.android.publish.PublishState;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: StepsRequestLoader.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/publish/PublishState;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/publish/PublishState;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.screen.step.request.steps.loader.StepsRequestLoaderImpl$deserializedState$4", f = "StepsRequestLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class d extends SuspendLambda implements p<T, Continuation<? super PublishState>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ CategoryParameters f242029q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f242030r;

    /* compiled from: StepsRequestLoader.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f242031a;

        static {
            int[] iArr = new int[PublishSession.StepType.values().length];
            try {
                iArr[PublishSession.StepType.f232007i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PublishSession.StepType.f232008j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f242031a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CategoryParameters categoryParameters, b bVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f242029q = categoryParameters;
        this.f242030r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new d(this.f242029q, this.f242030r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super PublishState> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00af  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.screen.step.request.steps.loader.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
