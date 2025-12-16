package coil.intercept;

import Y61.l;
import coil.request.p;
import coil.request.t;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: EngineInterceptor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {169}, m = "fetch", n = {"this", "components", "request", "mappedData", "options", "eventListener", "fetcher", "searchIndex"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0"})
/* loaded from: classes10.dex */
final class e extends ContinuationImpl {

    /* renamed from: A, reason: collision with root package name */
    public int f58457A;

    /* renamed from: q, reason: collision with root package name */
    public a f58458q;

    /* renamed from: r, reason: collision with root package name */
    public coil.e f58459r;

    /* renamed from: s, reason: collision with root package name */
    public p f58460s;

    /* renamed from: t, reason: collision with root package name */
    public Object f58461t;

    /* renamed from: u, reason: collision with root package name */
    public t f58462u;

    /* renamed from: v, reason: collision with root package name */
    public coil.f f58463v;

    /* renamed from: w, reason: collision with root package name */
    public coil.fetch.h f58464w;

    /* renamed from: x, reason: collision with root package name */
    public int f58465x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f58466y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ a f58467z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f58467z = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f58466y = obj;
        this.f58457A |= BeduinInputModel.MIN_TEXT_VERSION;
        int i12 = a.f58416f;
        return this.f58467z.d(null, null, null, null, null, this);
    }
}
