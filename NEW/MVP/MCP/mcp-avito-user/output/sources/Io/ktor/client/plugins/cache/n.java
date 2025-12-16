package io.ktor.client.plugins.cache;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpCacheEntry.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cache.HttpCacheEntryKt", f = "HttpCacheEntry.kt", i = {0, 0}, l = {18}, m = "HttpCacheEntry", n = {"response", "isShared"}, s = {"L$0", "Z$0"})
/* loaded from: classes8.dex */
final class n extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public boolean f399172q;

    /* renamed from: r, reason: collision with root package name */
    public io.ktor.client.statement.d f399173r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f399174s;

    /* renamed from: t, reason: collision with root package name */
    public int f399175t;

    public n() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f399174s = obj;
        this.f399175t |= BeduinInputModel.MIN_TEXT_VERSION;
        return p.a(false, null, this);
    }
}
