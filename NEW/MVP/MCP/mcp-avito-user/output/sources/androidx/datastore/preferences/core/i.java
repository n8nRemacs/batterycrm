package androidx.datastore.preferences.core;

import Y41.p;
import Y61.l;
import java.util.LinkedHashMap;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Preferences.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/datastore/preferences/core/f;", "it", "<anonymous>", "(Landroidx/datastore/preferences/core/f;)Landroidx/datastore/preferences/core/f;"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", i = {}, l = {329}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class i extends SuspendLambda implements p<f, Continuation<? super f>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f45566q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f45567r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f45568s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(p<? super a, ? super Continuation<? super G0>, ? extends Object> pVar, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f45568s = (SuspendLambda) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        i iVar = new i(this.f45568s, continuation);
        iVar.f45567r = obj;
        return iVar;
    }

    @Override // Y41.p
    public final Object invoke(f fVar, Continuation<? super f> continuation) {
        return ((i) create(fVar, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f45566q;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a aVar = (a) this.f45567r;
            C42729a0.b(obj);
            return aVar;
        }
        C42729a0.b(obj);
        a aVar2 = new a(new LinkedHashMap(((f) this.f45567r).a()), false);
        this.f45567r = aVar2;
        this.f45566q = 1;
        return this.f45568s.invoke(aVar2, this) == coroutine_suspended ? coroutine_suspended : aVar2;
    }
}
