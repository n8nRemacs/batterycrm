package Za1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Z;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.data.ipc.TestPushIPCClient", f = "TestPushIPCClient.kt", i = {}, l = {82}, m = "getIntermediateToken-IoAF18A", n = {}, s = {})
/* loaded from: classes9.dex */
public final class n extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f20245q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C f20246r;

    /* renamed from: s, reason: collision with root package name */
    public int f20247s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(C c12, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f20246r = c12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws Throwable {
        this.f20245q = obj;
        this.f20247s |= BeduinInputModel.MIN_TEXT_VERSION;
        Object objA = this.f20246r.a(this);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Z.a(objA);
    }
}
