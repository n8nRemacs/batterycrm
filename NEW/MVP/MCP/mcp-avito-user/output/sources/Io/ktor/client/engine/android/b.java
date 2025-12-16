package io.ktor.client.engine.android;

import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.net.HttpURLConnection;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AndroidClientEngine.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.engine.android.AndroidClientEngine", f = "AndroidClientEngine.kt", i = {0, 0, 1, 1, 1}, l = {35, 79, 82}, m = "execute", n = {"this", "data", "data", "callContext", "requestTime"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
/* loaded from: classes8.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f398858q;

    /* renamed from: r, reason: collision with root package name */
    public Object f398859r;

    /* renamed from: s, reason: collision with root package name */
    public Q31.b f398860s;

    /* renamed from: t, reason: collision with root package name */
    public HttpURLConnection f398861t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f398862u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e f398863v;

    /* renamed from: w, reason: collision with root package name */
    public int f398864w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f398863v = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f398862u = obj;
        this.f398864w |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f398863v.b1(null, this);
    }
}
