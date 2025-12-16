package io.ktor.client;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpClient.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.HttpClient", f = "HttpClient.kt", i = {}, l = {191}, m = "execute$ktor_client_core", n = {}, s = {})
/* loaded from: classes8.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f398795q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f398796r;

    /* renamed from: s, reason: collision with root package name */
    public int f398797s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f398796r = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f398795q = obj;
        this.f398797s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f398796r.b(null, this);
    }
}
