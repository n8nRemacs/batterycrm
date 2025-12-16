package io.ktor.client.plugins.cache;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpCache.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cache.HttpCache", f = "HttpCache.kt", i = {0, 0, 0, 0, 0, 1, 1, 1}, l = {298, 300}, m = "findAndRefresh", n = {"this", "request", "response", "storage", "varyKeysFrom304", "request", "response", "cache"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2"})
/* loaded from: classes8.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f399149q;

    /* renamed from: r, reason: collision with root package name */
    public Object f399150r;

    /* renamed from: s, reason: collision with root package name */
    public Object f399151s;

    /* renamed from: t, reason: collision with root package name */
    public io.ktor.client.plugins.cache.storage.a f399152t;

    /* renamed from: u, reason: collision with root package name */
    public Object f399153u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f399154v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f399155w;

    /* renamed from: x, reason: collision with root package name */
    public int f399156x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f399155w = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f399154v = obj;
        this.f399156x |= BeduinInputModel.MIN_TEXT_VERSION;
        return d.a(this.f399155w, null, null, this);
    }
}
