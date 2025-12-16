package lb1;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.notification.NotificationController", f = "NotificationController.kt", i = {0}, l = {65}, m = "downloadImage", n = {"this"}, s = {"L$0"})
/* renamed from: lb1.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C43723d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public g f413918q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f413919r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f413920s;

    /* renamed from: t, reason: collision with root package name */
    public int f413921t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43723d(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f413920s = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f413919r = obj;
        this.f413921t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f413920s.b(null, this);
    }
}
