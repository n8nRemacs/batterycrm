package coil.decode;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BitmapFactoryDecoder.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "coil.decode.BitmapFactoryDecoder", f = "BitmapFactoryDecoder.kt", i = {0, 0, 1}, l = {232, 46}, m = "decode", n = {"this", "$this$withPermit$iv", "$this$withPermit$iv"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes10.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f58284q;

    /* renamed from: r, reason: collision with root package name */
    public kotlinx.coroutines.sync.k f58285r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f58286s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f58287t;

    /* renamed from: u, reason: collision with root package name */
    public int f58288u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f58287t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f58286s = obj;
        this.f58288u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f58287t.a(this);
    }
}
