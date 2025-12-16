package androidx.datastore.preferences.core;

import Y41.p;
import Y61.l;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PreferenceDataStoreFactory.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/datastore/preferences/core/f;", "it", "<anonymous>", "(Landroidx/datastore/preferences/core/f;)Landroidx/datastore/preferences/core/f;"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class b extends SuspendLambda implements p<f, Continuation<? super f>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f45559q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f45560r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f45561s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(p<? super f, ? super Continuation<? super f>, ? extends Object> pVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f45561s = (SuspendLambda) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f45561s, continuation);
        bVar.f45560r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(f fVar, Continuation<? super f> continuation) {
        return ((b) create(fVar, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f45559q;
        if (i12 == 0) {
            C42729a0.b(obj);
            f fVar = (f) this.f45560r;
            this.f45559q = 1;
            obj = this.f45561s.invoke(fVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        f fVar2 = (f) obj;
        ((a) fVar2).f45557b.set(true);
        return fVar2;
    }
}
