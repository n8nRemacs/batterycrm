package lb1;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.notification.NotificationController", f = "NotificationController.kt", i = {0, 0}, l = {37}, m = "showNotification", n = {"this", "payload"}, s = {"L$0", "L$1"})
/* loaded from: classes9.dex */
public final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public g f413925q;

    /* renamed from: r, reason: collision with root package name */
    public com.vk.push.common.messaging.a f413926r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f413927s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f413928t;

    /* renamed from: u, reason: collision with root package name */
    public int f413929u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f413928t = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f413927s = obj;
        this.f413929u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f413928t.a(null, this);
    }
}
