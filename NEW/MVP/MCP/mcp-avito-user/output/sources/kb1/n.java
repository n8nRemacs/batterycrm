package kb1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.vk.push.common.messaging.RemoteMessage;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.incoming.MessagesIPCInteractorImpl", f = "MessagesIPCInteractorImpl.kt", i = {0, 0}, l = {117, 120}, m = "handleRemoteMessage", n = {"this", "message"}, s = {"L$0", "L$1"})
/* loaded from: classes9.dex */
public final class n extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public m f406474q;

    /* renamed from: r, reason: collision with root package name */
    public RemoteMessage f406475r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f406476s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ m f406477t;

    /* renamed from: u, reason: collision with root package name */
    public int f406478u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f406477t = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f406476s = obj;
        this.f406478u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f406477t.f(null, this);
    }
}
