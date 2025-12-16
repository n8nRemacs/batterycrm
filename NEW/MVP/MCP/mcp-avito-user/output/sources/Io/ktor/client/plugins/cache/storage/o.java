package io.ktor.client.plugins.cache.storage;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.utils.io.X;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FileCacheStorage.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 11, 12, 12, 13, 13}, l = {136, 137, 138, 139, 141, 143, 144, 146, 147, 148, 149, 151, 152, 154, 155}, m = "writeCache", n = {"channel", "cache", "channel", "cache", "channel", "cache", "channel", "cache", "channel", "cache", "headers", "channel", "cache", "value", "channel", "cache", "channel", "cache", "channel", "cache", "channel", "cache", "channel", "cache", "channel", "cache", "value", "channel", "cache", "channel", "cache"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$3", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes8.dex */
final class o extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public X f399268q;

    /* renamed from: r, reason: collision with root package name */
    public b f399269r;

    /* renamed from: s, reason: collision with root package name */
    public Object f399270s;

    /* renamed from: t, reason: collision with root package name */
    public String f399271t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f399272u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ h f399273v;

    /* renamed from: w, reason: collision with root package name */
    public int f399274w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f399273v = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f399272u = obj;
        this.f399274w |= BeduinInputModel.MIN_TEXT_VERSION;
        return h.d(this.f399273v, null, null, this);
    }
}
