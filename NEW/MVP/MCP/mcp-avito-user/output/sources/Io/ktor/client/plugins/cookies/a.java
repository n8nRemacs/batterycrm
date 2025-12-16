package io.ktor.client.plugins.cookies;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.http.C41530l;
import io.ktor.http.T0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AcceptAllCookiesStorage.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cookies.AcceptAllCookiesStorage", f = "AcceptAllCookiesStorage.kt", i = {0, 0, 0, 0}, l = {66}, m = "addCookie", n = {"this", "requestUrl", "cookie", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes8.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public d f399339q;

    /* renamed from: r, reason: collision with root package name */
    public T0 f399340r;

    /* renamed from: s, reason: collision with root package name */
    public C41530l f399341s;

    /* renamed from: t, reason: collision with root package name */
    public kotlinx.coroutines.sync.d f399342t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f399343u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d f399344v;

    /* renamed from: w, reason: collision with root package name */
    public int f399345w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f399344v = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f399343u = obj;
        this.f399345w |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f399344v.a(null, null, this);
    }
}
