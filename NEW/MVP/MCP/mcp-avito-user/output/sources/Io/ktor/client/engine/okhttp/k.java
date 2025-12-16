package io.ktor.client.engine.okhttp;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.client.engine.okhttp.g;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OkHttpEngine.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.engine.okhttp.OkHttpEngine", f = "OkHttpEngine.kt", i = {0, 0, 0, 0}, l = {92}, m = "executeWebSocketRequest", n = {"this", "callContext", "requestTime", "session"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes8.dex */
final class k extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public g f398943q;

    /* renamed from: r, reason: collision with root package name */
    public CoroutineContext f398944r;

    /* renamed from: s, reason: collision with root package name */
    public Q31.b f398945s;

    /* renamed from: t, reason: collision with root package name */
    public s f398946t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f398947u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f398948v;

    /* renamed from: w, reason: collision with root package name */
    public int f398949w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f398948v = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f398947u = obj;
        this.f398949w |= BeduinInputModel.MIN_TEXT_VERSION;
        g.c cVar = g.f398919k;
        return this.f398948v.f(null, null, null, this);
    }
}
