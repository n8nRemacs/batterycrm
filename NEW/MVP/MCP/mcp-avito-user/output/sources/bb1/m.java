package bb1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.data.source.ClientSdkModeDataStore", f = "ClientSdkModeDataStore.kt", i = {0, 0, 1}, l = {15, 20}, m = "isDefaultHostChanged", n = {"this", "testModeEnabled", "isChanged"}, s = {"L$0", "Z$0", "I$0"})
/* loaded from: classes9.dex */
public final class m extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public n f57242q;

    /* renamed from: r, reason: collision with root package name */
    public int f57243r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f57244s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n f57245t;

    /* renamed from: u, reason: collision with root package name */
    public int f57246u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f57245t = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f57244s = obj;
        this.f57246u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f57245t.a(this);
    }
}
