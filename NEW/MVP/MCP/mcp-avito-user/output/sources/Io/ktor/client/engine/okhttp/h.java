package io.ktor.client.engine.okhttp;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.client.request.e0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OkHttpEngine.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.engine.okhttp.OkHttpEngine", f = "OkHttpEngine.kt", i = {0, 0}, l = {61, 68, 70}, m = "execute", n = {"this", "data"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class h extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public g f398930q;

    /* renamed from: r, reason: collision with root package name */
    public e0 f398931r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f398932s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f398933t;

    /* renamed from: u, reason: collision with root package name */
    public int f398934u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f398933t = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f398932s = obj;
        this.f398934u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f398933t.b1(null, this);
    }
}
