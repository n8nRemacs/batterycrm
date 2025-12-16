package io.ktor.client.plugins.cache;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpCache.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cache.HttpCache", f = "HttpCache.kt", i = {0, 0, 0, 1}, l = {328, 328}, m = "findResponse", n = {"this", ContextActionHandler.Link.URL, "lookup", "lookup"}, s = {"L$0", "L$1", "L$2", "L$0"})
/* loaded from: classes8.dex */
final class h extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f399161q;

    /* renamed from: r, reason: collision with root package name */
    public Object f399162r;

    /* renamed from: s, reason: collision with root package name */
    public Object f399163s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f399164t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d f399165u;

    /* renamed from: v, reason: collision with root package name */
    public int f399166v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f399165u = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f399164t = obj;
        this.f399166v |= BeduinInputModel.MIN_TEXT_VERSION;
        return d.b(this.f399165u, null, null, this);
    }
}
