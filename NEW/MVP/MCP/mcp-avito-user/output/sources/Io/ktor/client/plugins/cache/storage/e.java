package io.ktor.client.plugins.cache.storage;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import io.ktor.http.T0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FileCacheStorage.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", f = "FileCacheStorage.kt", i = {0, 0}, l = {37, 38}, m = "store", n = {"this", ContextActionHandler.Link.URL}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public c f399202q;

    /* renamed from: r, reason: collision with root package name */
    public T0 f399203r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f399204s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f399205t;

    /* renamed from: u, reason: collision with root package name */
    public int f399206u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f399205t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f399204s = obj;
        this.f399206u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f399205t.c(null, null, this);
    }
}
