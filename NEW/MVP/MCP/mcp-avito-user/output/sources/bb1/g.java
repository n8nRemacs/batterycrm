package bb1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.data.source.ArbiterStoreDataSource", f = "ArbiterStoreDataSource.kt", i = {0, 1}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.ERROR_NO_ACTIVITY}, m = "getMaster", n = {"this", "packageName"}, s = {"L$0", "L$0"})
/* loaded from: classes9.dex */
public final class g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f57222q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f57223r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f57224s;

    /* renamed from: t, reason: collision with root package name */
    public int f57225t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f57224s = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f57223r = obj;
        this.f57225t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f57224s.b(this);
    }
}
