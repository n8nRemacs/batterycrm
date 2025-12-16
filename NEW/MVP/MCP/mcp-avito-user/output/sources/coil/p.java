package coil;

import android.graphics.Bitmap;
import coil.request.v;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RealImageLoader.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "coil.RealImageLoader", f = "RealImageLoader.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2}, l = {162, 174, 178}, m = "executeMain", n = {"this", "requestDelegate", "request", "eventListener", "this", "requestDelegate", "request", "eventListener", "placeholderBitmap", "this", "requestDelegate", "request", "eventListener"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes10.dex */
final class p extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public n f58588q;

    /* renamed from: r, reason: collision with root package name */
    public v f58589r;

    /* renamed from: s, reason: collision with root package name */
    public coil.request.p f58590s;

    /* renamed from: t, reason: collision with root package name */
    public f f58591t;

    /* renamed from: u, reason: collision with root package name */
    public Bitmap f58592u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f58593v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f58594w;

    /* renamed from: x, reason: collision with root package name */
    public int f58595x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(n nVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f58594w = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f58593v = obj;
        this.f58595x |= BeduinInputModel.MIN_TEXT_VERSION;
        return n.d(this.f58594w, null, 0, this);
    }
}
