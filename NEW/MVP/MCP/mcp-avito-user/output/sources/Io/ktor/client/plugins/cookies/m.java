package io.ktor.client.plugins.cookies;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.http.T0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpCookies.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cookies.HttpCookies", f = "HttpCookies.kt", i = {0, 0}, l = {39, 40}, m = "get", n = {"this", "requestUrl"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class m extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public k f399379q;

    /* renamed from: r, reason: collision with root package name */
    public T0 f399380r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f399381s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f399382t;

    /* renamed from: u, reason: collision with root package name */
    public int f399383u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f399382t = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f399381s = obj;
        this.f399383u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f399382t.b(null, this);
    }
}
