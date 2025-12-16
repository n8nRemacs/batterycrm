package io.ktor.client.plugins.logging;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpClientCallLogger.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.logging.HttpClientCallLogger", f = "HttpClientCallLogger.kt", i = {0, 0}, l = {34}, m = "logResponseBody", n = {"this", "message"}, s = {"L$0", "L$1"})
/* renamed from: io.ktor.client.plugins.logging.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41455b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public d f399499q;

    /* renamed from: r, reason: collision with root package name */
    public String f399500r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f399501s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f399502t;

    /* renamed from: u, reason: collision with root package name */
    public int f399503u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41455b(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f399502t = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f399501s = obj;
        this.f399503u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f399502t.c(null, this);
    }
}
