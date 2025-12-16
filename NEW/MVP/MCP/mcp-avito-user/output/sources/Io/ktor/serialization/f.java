package io.ktor.serialization;

import Y41.p;
import Y61.k;
import Y61.l;
import io.ktor.utils.io.W0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ContentConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.serialization.ContentConverterKt$deserialize$result$2", f = "ContentConverter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class f extends SuspendLambda implements p<Object, Continuation<? super Boolean>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f400295q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ W0 f400296r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(W0 w02, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f400296r = w02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        f fVar = new f(this.f400296r, continuation);
        fVar.f400295q = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Continuation<? super Boolean> continuation) {
        return ((f) create(obj, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return Boxing.boxBoolean(this.f400295q != null || this.f400296r.x());
    }
}
