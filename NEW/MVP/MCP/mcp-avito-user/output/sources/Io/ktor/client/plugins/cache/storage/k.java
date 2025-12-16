package io.ktor.client.plugins.cache.storage;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FileCacheStorage.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {0, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 14, 14}, l = {159, 160, 160, 161, 162, 165, 166, 169, 170, 171, 172, 175, 176, 180, 182}, m = "readCache", n = {"channel", "channel", ContextActionHandler.Link.URL, "channel", ContextActionHandler.Link.URL, "channel", ContextActionHandler.Link.URL, "status", "channel", ContextActionHandler.Link.URL, "status", "version", "channel", ContextActionHandler.Link.URL, "status", "version", "headers", "headersCount", "j", "channel", ContextActionHandler.Link.URL, "status", "version", "headers", "key", "headersCount", "j", "channel", ContextActionHandler.Link.URL, "status", "version", "headers", "channel", ContextActionHandler.Link.URL, "status", "version", "headers", "requestTime", "channel", ContextActionHandler.Link.URL, "status", "version", "headers", "requestTime", "responseTime", "channel", ContextActionHandler.Link.URL, "status", "version", "headers", "requestTime", "responseTime", "expirationTime", "channel", ContextActionHandler.Link.URL, "status", "version", "headers", "requestTime", "responseTime", "expirationTime", "$this$readCache_u24lambda_u244", "varyKeysCount", "j", "channel", ContextActionHandler.Link.URL, "status", "version", "headers", "requestTime", "responseTime", "expirationTime", "$this$readCache_u24lambda_u244", "key", "varyKeysCount", "j", "channel", ContextActionHandler.Link.URL, "status", "version", "headers", "requestTime", "responseTime", "expirationTime", "varyKeys", ContextActionHandler.Link.URL, "status", "version", "headers", "requestTime", "responseTime", "expirationTime", "varyKeys", "body"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$9", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$9", "L$10", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"})
/* loaded from: classes8.dex */
final class k extends ContinuationImpl {

    /* renamed from: A, reason: collision with root package name */
    public String f399231A;

    /* renamed from: B, reason: collision with root package name */
    public int f399232B;

    /* renamed from: C, reason: collision with root package name */
    public int f399233C;

    /* renamed from: D, reason: collision with root package name */
    public /* synthetic */ Object f399234D;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ h f399235E;

    /* renamed from: F, reason: collision with root package name */
    public int f399236F;

    /* renamed from: q, reason: collision with root package name */
    public Object f399237q;

    /* renamed from: r, reason: collision with root package name */
    public Comparable f399238r;

    /* renamed from: s, reason: collision with root package name */
    public Object f399239s;

    /* renamed from: t, reason: collision with root package name */
    public Object f399240t;

    /* renamed from: u, reason: collision with root package name */
    public Object f399241u;

    /* renamed from: v, reason: collision with root package name */
    public Comparable f399242v;

    /* renamed from: w, reason: collision with root package name */
    public Q31.b f399243w;

    /* renamed from: x, reason: collision with root package name */
    public Object f399244x;

    /* renamed from: y, reason: collision with root package name */
    public Object f399245y;

    /* renamed from: z, reason: collision with root package name */
    public Map f399246z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f399235E = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f399234D = obj;
        this.f399236F |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f399235E.f(null, this);
    }
}
