package coil.intercept;

import Y61.l;
import coil.intercept.i;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: EngineInterceptor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", i = {0, 0}, l = {75}, m = "intercept", n = {"this", "chain"}, s = {"L$0", "L$1"})
/* loaded from: classes10.dex */
final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f58468q;

    /* renamed from: r, reason: collision with root package name */
    public i.a f58469r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f58470s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f58471t;

    /* renamed from: u, reason: collision with root package name */
    public int f58472u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f58471t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f58470s = obj;
        this.f58472u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f58471t.a(null, this);
    }
}
