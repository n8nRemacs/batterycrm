package Za1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Z;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.data.ipc.TestPushIPCClient", f = "TestPushIPCClient.kt", i = {}, l = {41}, m = "registerForPushes-gIAlu-s", n = {}, s = {})
/* loaded from: classes9.dex */
public final class s extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f20251q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C f20252r;

    /* renamed from: s, reason: collision with root package name */
    public int f20253s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(C c12, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f20252r = c12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws Throwable {
        this.f20251q = obj;
        this.f20253s |= BeduinInputModel.MIN_TEXT_VERSION;
        Object objC = this.f20252r.c(null, this);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : Z.a(objC);
    }
}
