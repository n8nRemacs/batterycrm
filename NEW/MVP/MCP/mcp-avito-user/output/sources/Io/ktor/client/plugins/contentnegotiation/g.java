package io.ktor.client.plugins.contentnegotiation;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.http.T0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ContentNegotiation.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.contentnegotiation.ContentNegotiation", f = "ContentNegotiation.kt", i = {0}, l = {230}, m = "convertResponse$ktor_client_content_negotiation", n = {"requestUrl"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public T0 f399331q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f399332r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f399333s;

    /* renamed from: t, reason: collision with root package name */
    public int f399334t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f399333s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f399332r = obj;
        this.f399334t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f399333s.b(null, null, null, null, null, this);
    }
}
