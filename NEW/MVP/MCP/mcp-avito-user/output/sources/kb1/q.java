package kb1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.incoming.MessagesIPCInteractorImpl", f = "MessagesIPCInteractorImpl.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {150, 77, 84}, m = "receiveSendPushesResult", n = {"this", "messages", "$this$withLock_u24default$iv", "this", "messages", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "messagesWithValidToken"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$3"})
/* loaded from: classes9.dex */
public final class q extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public m f406485q;

    /* renamed from: r, reason: collision with root package name */
    public Object f406486r;

    /* renamed from: s, reason: collision with root package name */
    public Object f406487s;

    /* renamed from: t, reason: collision with root package name */
    public List f406488t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f406489u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ m f406490v;

    /* renamed from: w, reason: collision with root package name */
    public int f406491w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f406490v = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f406489u = obj;
        this.f406491w |= BeduinInputModel.MIN_TEXT_VERSION;
        return m.g(this.f406490v, null, this);
    }
}
