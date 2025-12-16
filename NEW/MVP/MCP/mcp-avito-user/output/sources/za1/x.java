package Za1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Z;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.data.ipc.TestPushIPCClient", f = "TestPushIPCClient.kt", i = {}, l = {63}, m = "sendTestPush-0E7RQCE", n = {}, s = {})
/* loaded from: classes9.dex */
public final class x extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f20258q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C f20259r;

    /* renamed from: s, reason: collision with root package name */
    public int f20260s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C c12, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f20259r = c12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f20258q = obj;
        this.f20260s |= BeduinInputModel.MIN_TEXT_VERSION;
        Object objO = this.f20259r.o(null, null, this);
        return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : Z.a(objO);
    }
}
