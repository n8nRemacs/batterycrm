package kb1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.incoming.ClientServiceInteractorImpl", f = "ClientServiceInteractorImpl.kt", i = {}, l = {116}, m = "callOnDeleteMessages", n = {}, s = {})
/* loaded from: classes9.dex */
public final class h extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f406435q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f406436r;

    /* renamed from: s, reason: collision with root package name */
    public int f406437s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f406436r = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f406435q = obj;
        this.f406437s |= BeduinInputModel.MIN_TEXT_VERSION;
        return i.f(this.f406436r, this);
    }
}
