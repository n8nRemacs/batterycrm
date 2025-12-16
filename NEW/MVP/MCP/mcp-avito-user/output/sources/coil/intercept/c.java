package coil.intercept;

import Y61.l;
import coil.request.p;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: EngineInterceptor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {WebSocketProtocol.PAYLOAD_SHORT, 130, 148}, m = "execute", n = {"this", "request", "mappedData", "eventListener", "options", "components", "fetchResult", "this", "request", "eventListener", "options", "fetchResult"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4"})
/* loaded from: classes10.dex */
final class c extends ContinuationImpl {

    /* renamed from: A, reason: collision with root package name */
    public int f58438A;

    /* renamed from: q, reason: collision with root package name */
    public a f58439q;

    /* renamed from: r, reason: collision with root package name */
    public p f58440r;

    /* renamed from: s, reason: collision with root package name */
    public Object f58441s;

    /* renamed from: t, reason: collision with root package name */
    public Object f58442t;

    /* renamed from: u, reason: collision with root package name */
    public l0.h f58443u;

    /* renamed from: v, reason: collision with root package name */
    public l0.h f58444v;

    /* renamed from: w, reason: collision with root package name */
    public l0.h f58445w;

    /* renamed from: x, reason: collision with root package name */
    public l0.h f58446x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f58447y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ a f58448z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f58448z = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f58447y = obj;
        this.f58438A |= BeduinInputModel.MIN_TEXT_VERSION;
        return a.c(this.f58448z, null, null, null, null, this);
    }
}
