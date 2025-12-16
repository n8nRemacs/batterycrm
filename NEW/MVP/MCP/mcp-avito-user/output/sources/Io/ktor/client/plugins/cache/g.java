package io.ktor.client.plugins.cache;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.client.plugins.cache.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpCache.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cache.HttpCache", f = "HttpCache.kt", i = {1}, l = {311, 316}, m = "findResponse", n = {"requestHeaders"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f399157q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f399158r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f399159s;

    /* renamed from: t, reason: collision with root package name */
    public int f399160t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f399159s = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f399158r = obj;
        this.f399160t |= BeduinInputModel.MIN_TEXT_VERSION;
        d.a aVar = d.f399136g;
        return this.f399159s.c(null, null, null, null, this);
    }
}
