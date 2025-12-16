package bb1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.data.source.ArbiterStoreDataSource", f = "ArbiterStoreDataSource.kt", i = {0, 0, 1}, l = {32, 37}, m = "isDefaultHostChanged", n = {"this", "defaultHost", "isChanged"}, s = {"L$0", "L$1", "I$0"})
/* loaded from: classes9.dex */
public final class h extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public i f57226q;

    /* renamed from: r, reason: collision with root package name */
    public T11.a f57227r;

    /* renamed from: s, reason: collision with root package name */
    public int f57228s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f57229t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i f57230u;

    /* renamed from: v, reason: collision with root package name */
    public int f57231v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f57230u = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f57229t = obj;
        this.f57231v |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f57230u.a(null, this);
    }
}
