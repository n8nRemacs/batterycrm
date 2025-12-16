package coil.intercept;

import Y61.l;
import coil.fetch.m;
import coil.request.p;
import coil.request.t;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: EngineInterceptor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {203}, m = "decode", n = {"this", "fetchResult", "components", "request", "mappedData", "options", "eventListener", "decoder", "searchIndex"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0"})
/* loaded from: classes10.dex */
final class b extends ContinuationImpl {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ a f58426A;

    /* renamed from: B, reason: collision with root package name */
    public int f58427B;

    /* renamed from: q, reason: collision with root package name */
    public a f58428q;

    /* renamed from: r, reason: collision with root package name */
    public m f58429r;

    /* renamed from: s, reason: collision with root package name */
    public coil.e f58430s;

    /* renamed from: t, reason: collision with root package name */
    public p f58431t;

    /* renamed from: u, reason: collision with root package name */
    public Object f58432u;

    /* renamed from: v, reason: collision with root package name */
    public t f58433v;

    /* renamed from: w, reason: collision with root package name */
    public coil.f f58434w;

    /* renamed from: x, reason: collision with root package name */
    public coil.decode.h f58435x;

    /* renamed from: y, reason: collision with root package name */
    public int f58436y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f58437z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f58426A = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f58437z = obj;
        this.f58427B |= BeduinInputModel.MIN_TEXT_VERSION;
        return a.b(this.f58426A, null, null, null, null, null, null, this);
    }
}
