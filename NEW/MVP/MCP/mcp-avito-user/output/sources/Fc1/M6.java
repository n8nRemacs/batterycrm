package Fc1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "feedback.shared.sdk.api.caches.ImagesCache", f = "ImagesCache.kt", i = {0, 0}, l = {20}, m = "obtainImage", n = {"this", ContextActionHandler.Link.URL}, s = {"L$0", "L$1"})
/* loaded from: classes9.dex */
public final class M6 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public N6 f5098q;

    /* renamed from: r, reason: collision with root package name */
    public String f5099r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f5100s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ N6 f5101t;

    /* renamed from: u, reason: collision with root package name */
    public int f5102u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M6(N6 n62, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f5101t = n62;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f5100s = obj;
        this.f5102u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f5101t.a(null, this);
    }
}
