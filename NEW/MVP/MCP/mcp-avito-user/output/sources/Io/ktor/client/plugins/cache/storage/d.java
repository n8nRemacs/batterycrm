package io.ktor.client.plugins.cache.storage;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FileCacheStorage.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", f = "FileCacheStorage.kt", i = {0, 0}, l = {53}, m = "findAll", n = {"this", ContextActionHandler.Link.URL}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f399199q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f399200r;

    /* renamed from: s, reason: collision with root package name */
    public int f399201s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f399200r = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f399199q = obj;
        this.f399201s |= BeduinInputModel.MIN_TEXT_VERSION;
        this.f399200r.a(null, this);
        throw null;
    }
}
