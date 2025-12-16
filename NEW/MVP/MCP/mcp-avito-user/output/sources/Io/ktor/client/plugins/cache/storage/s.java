package io.ktor.client.plugins.cache.storage;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import io.ktor.http.T0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpCacheStorage.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cache.storage.HttpCacheStorageKt", f = "HttpCacheStorage.kt", i = {0, 0}, l = {57}, m = "store", n = {"$this$store", ContextActionHandler.Link.URL}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class s extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public q f399284q;

    /* renamed from: r, reason: collision with root package name */
    public T0 f399285r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f399286s;

    /* renamed from: t, reason: collision with root package name */
    public int f399287t;

    public s() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f399286s = obj;
        this.f399287t |= BeduinInputModel.MIN_TEXT_VERSION;
        return r.c(null, null, null, false, this);
    }
}
