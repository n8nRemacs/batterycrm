package io.ktor.client.plugins.cache.storage;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FileCacheStorage.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {}, l = {77}, m = "findAll", n = {}, s = {})
/* loaded from: classes8.dex */
final class i extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f399216q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f399217r;

    /* renamed from: s, reason: collision with root package name */
    public int f399218s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f399217r = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f399216q = obj;
        this.f399218s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f399217r.a(null, this);
    }
}
