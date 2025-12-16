package io.ktor.client.plugins;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.client.plugins.J;
import io.ktor.http.O0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: HttpRedirect.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.HttpRedirect$Plugin", f = "HttpRedirect.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {113}, m = "handleCall", n = {"this", "$this$handleCall", "context", "client", "call", "requestBuilder", "originProtocol", "originAuthority", "allowHttpsDowngrade"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "Z$0"})
/* loaded from: classes8.dex */
final class K extends ContinuationImpl {

    /* renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f399027A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ J.b f399028B;

    /* renamed from: C, reason: collision with root package name */
    public int f399029C;

    /* renamed from: q, reason: collision with root package name */
    public J.b f399030q;

    /* renamed from: r, reason: collision with root package name */
    public m0 f399031r;

    /* renamed from: s, reason: collision with root package name */
    public io.ktor.client.request.d0 f399032s;

    /* renamed from: t, reason: collision with root package name */
    public io.ktor.client.a f399033t;

    /* renamed from: u, reason: collision with root package name */
    public l0.h f399034u;

    /* renamed from: v, reason: collision with root package name */
    public l0.h f399035v;

    /* renamed from: w, reason: collision with root package name */
    public O0 f399036w;

    /* renamed from: x, reason: collision with root package name */
    public String f399037x;

    /* renamed from: y, reason: collision with root package name */
    public l0.h f399038y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f399039z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(J.b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f399028B = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f399027A = obj;
        this.f399029C |= BeduinInputModel.MIN_TEXT_VERSION;
        return J.b.c(this.f399028B, null, null, null, false, null, this);
    }
}
