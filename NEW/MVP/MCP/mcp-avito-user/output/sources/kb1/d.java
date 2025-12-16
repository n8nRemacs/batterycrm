package kb1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.incoming.ClientServiceDataDispatcher", f = "ClientServiceDataDispatcher.kt", i = {0}, l = {50}, m = "sendOnDeleteMessageToService", n = {"this"}, s = {"L$0"})
/* loaded from: classes9.dex */
public final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public f f406423q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f406424r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f406425s;

    /* renamed from: t, reason: collision with root package name */
    public int f406426t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f406425s = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f406424r = obj;
        this.f406426t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f406425s.e(this);
    }
}
