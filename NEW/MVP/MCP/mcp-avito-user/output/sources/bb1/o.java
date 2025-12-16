package bb1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.data.source.IPCClientsDataSource", f = "IPCClientsDataSource.kt", i = {0, 0, 1, 1}, l = {71, 46}, m = "clear", n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes9.dex */
public final class o extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public p f57249q;

    /* renamed from: r, reason: collision with root package name */
    public kotlinx.coroutines.sync.a f57250r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f57251s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p f57252t;

    /* renamed from: u, reason: collision with root package name */
    public int f57253u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f57252t = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f57251s = obj;
        this.f57253u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f57252t.b(this);
    }
}
