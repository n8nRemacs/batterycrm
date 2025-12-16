package io.ktor.client.plugins.cache;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpCacheLegacy.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cache.HttpCacheLegacyKt", f = "HttpCacheLegacy.kt", i = {0}, l = {62, 63, 73}, m = "interceptReceiveLegacy", n = {"$this$interceptReceiveLegacy"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class y extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public io.ktor.util.pipeline.e f399301q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f399302r;

    /* renamed from: s, reason: collision with root package name */
    public int f399303s;

    public y() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f399302r = obj;
        this.f399303s |= BeduinInputModel.MIN_TEXT_VERSION;
        return z.b(null, null, null, null, this);
    }
}
