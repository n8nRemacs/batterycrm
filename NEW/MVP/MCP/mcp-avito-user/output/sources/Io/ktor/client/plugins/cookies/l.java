package io.ktor.client.plugins.cookies;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import io.ktor.http.T0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpCookies.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cookies.HttpCookies", f = "HttpCookies.kt", i = {0, 0}, l = {54}, m = "captureHeaderCookies$ktor_client_core", n = {"this", ContextActionHandler.Link.URL}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class l extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public k f399373q;

    /* renamed from: r, reason: collision with root package name */
    public T0 f399374r;

    /* renamed from: s, reason: collision with root package name */
    public Iterator f399375s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f399376t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k f399377u;

    /* renamed from: v, reason: collision with root package name */
    public int f399378v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f399377u = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f399376t = obj;
        this.f399378v |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f399377u.a(null, this);
    }
}
