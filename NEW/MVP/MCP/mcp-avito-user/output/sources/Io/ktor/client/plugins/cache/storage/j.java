package io.ktor.client.plugins.cache.storage;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.utils.io.W0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FileCacheStorage.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3}, l = {202, 119, 122, 124}, m = "readCache", n = {"this", "urlHex", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "$this$use$iv", "channel", "closed$iv", "this", "$this$withLock_u24default$iv", "$this$use$iv", "channel", "caches", "closed$iv", "requestsCount", "i", "$this$withLock_u24default$iv", "$this$use$iv", "caches", "closed$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "I$0"})
/* loaded from: classes8.dex */
final class j extends ContinuationImpl {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ h f399219A;

    /* renamed from: B, reason: collision with root package name */
    public int f399220B;

    /* renamed from: q, reason: collision with root package name */
    public Object f399221q;

    /* renamed from: r, reason: collision with root package name */
    public Object f399222r;

    /* renamed from: s, reason: collision with root package name */
    public Object f399223s;

    /* renamed from: t, reason: collision with root package name */
    public W0 f399224t;

    /* renamed from: u, reason: collision with root package name */
    public Set f399225u;

    /* renamed from: v, reason: collision with root package name */
    public Set f399226v;

    /* renamed from: w, reason: collision with root package name */
    public int f399227w;

    /* renamed from: x, reason: collision with root package name */
    public int f399228x;

    /* renamed from: y, reason: collision with root package name */
    public int f399229y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f399230z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f399219A = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f399230z = obj;
        this.f399220B |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f399219A.g(null, this);
    }
}
