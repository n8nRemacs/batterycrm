package io.ktor.client.plugins.cookies;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.client.request.d0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpCookies.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cookies.HttpCookies", f = "HttpCookies.kt", i = {0}, l = {59}, m = "sendCookiesWith$ktor_client_core", n = {"builder"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class p extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public d0 f399394q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f399395r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f399396s;

    /* renamed from: t, reason: collision with root package name */
    public int f399397t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f399396s = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f399395r = obj;
        this.f399397t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f399396s.d(null, this);
    }
}
