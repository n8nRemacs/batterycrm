package io.ktor.client.plugins.cache.storage;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import io.ktor.http.T0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpCacheStorage.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cache.storage.HttpCacheStorageKt", f = "HttpCacheStorage.kt", i = {0, 0, 0, 0, 0, 1}, l = {125, 138}, m = "store", n = {"$this$store", "response", "varyKeys", ContextActionHandler.Link.URL, "isShared", "data"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$0"})
/* loaded from: classes8.dex */
final class t extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f399288q;

    /* renamed from: r, reason: collision with root package name */
    public io.ktor.client.statement.d f399289r;

    /* renamed from: s, reason: collision with root package name */
    public Map f399290s;

    /* renamed from: t, reason: collision with root package name */
    public T0 f399291t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f399292u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f399293v;

    /* renamed from: w, reason: collision with root package name */
    public int f399294w;

    public t() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f399293v = obj;
        this.f399294w |= BeduinInputModel.MIN_TEXT_VERSION;
        return r.b(null, null, null, false, this);
    }
}
