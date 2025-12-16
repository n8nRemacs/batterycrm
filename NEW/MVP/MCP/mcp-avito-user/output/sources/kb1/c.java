package kb1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.incoming.ClientServiceDataDispatcher", f = "ClientServiceDataDispatcher.kt", i = {0}, l = {34}, m = "sendNewPushTokenToService", n = {"this"}, s = {"L$0"})
/* loaded from: classes9.dex */
public final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public f f406419q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f406420r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f406421s;

    /* renamed from: t, reason: collision with root package name */
    public int f406422t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f406421s = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f406420r = obj;
        this.f406422t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f406421s.b(null, this);
    }
}
