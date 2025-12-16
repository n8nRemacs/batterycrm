package bb1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.data.source.IPCClientsDataSource", f = "IPCClientsDataSource.kt", i = {0}, l = {52}, m = "createIPCClients", n = {"this"}, s = {"L$0"})
/* loaded from: classes9.dex */
public final class q extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public p f57260q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f57261r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p f57262s;

    /* renamed from: t, reason: collision with root package name */
    public int f57263t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p pVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f57262s = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f57261r = obj;
        this.f57263t |= BeduinInputModel.MIN_TEXT_VERSION;
        return p.a(this.f57262s, this);
    }
}
